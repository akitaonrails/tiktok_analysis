package com.appsflyer.internal;

/* JADX INFO: loaded from: classes31.dex */
public class AFe1mSDK {
    public final long AFKeystoreWrapper;

    public int hashCode() {
        long j = this.AFKeystoreWrapper;
        return (int) (j ^ (j >>> 32));
    }

    public AFe1mSDK(long j) {
        this.AFKeystoreWrapper = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && this.AFKeystoreWrapper == ((AFe1mSDK) obj).AFKeystoreWrapper) {
            return true;
        }
        return false;
    }
}
