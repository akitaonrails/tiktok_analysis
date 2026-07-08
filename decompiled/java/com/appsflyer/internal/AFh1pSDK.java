package com.appsflyer.internal;

/* JADX INFO: loaded from: classes31.dex */
public abstract class AFh1pSDK extends AFa1qSDK {
    public final boolean afInfoLog;
    public final boolean i;

    public AFh1pSDK() {
        this(null, null, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AFh1pSDK(String str, Boolean bool, Boolean bool2) {
        boolean zBooleanValue;
        boolean zBooleanValue2;
        if (bool2 != null) {
            zBooleanValue = bool2.booleanValue();
        } else {
            zBooleanValue = false;
        }
        super(str, null, Boolean.valueOf(zBooleanValue));
        if (bool != null) {
            zBooleanValue2 = bool.booleanValue();
        } else {
            zBooleanValue2 = true;
        }
        this.afInfoLog = zBooleanValue2;
        this.i = true;
    }
}
