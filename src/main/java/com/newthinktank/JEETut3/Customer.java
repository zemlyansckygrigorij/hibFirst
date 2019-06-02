package com.newthinktank.JEETut3;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * 2. The Java Persistance API (JPA) makes it easy to use object data with
 * a database. With it you can Persist object data in a database.
 *
 * Hibernate is a Object Relational Mapping system that implements JPA.
 */

// Entity defines which objects should be persisted in the database
@Entity
// Defines the name of the table created for the entity
@Table(name = "customer")
public class Customer implements Serializable {
    private static final long serialVersionUID = 1L;

    // All entities must define a primary key which you define with
    // the @Id annotation
    @Id

    // You can override the default column name
    // Map id to the CustID field in the DB
    // You can have it auto generate
    // @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "custID", unique = true)
    private int id;

    @Column(name = "firstName", nullable = false)
    private String fName;

    @Column(name = "lastName", nullable = false)
    private String lName;

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getFName() {
        return fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public String getLName() {
        return lName;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }

}