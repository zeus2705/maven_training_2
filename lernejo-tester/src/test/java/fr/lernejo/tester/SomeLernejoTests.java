package fr.lernejo.tester;

import api.TestMethod;

public class SomeLernejoTests {

    @TestMethod
    public void ok()
    {

    }
    @TestMethod
    public void ko()
    {
        throw new java.lang.IllegalStateException();
    }

    public void none()
    {

    }

}

