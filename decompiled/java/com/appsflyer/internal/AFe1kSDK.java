package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class AFe1kSDK {
    public final String valueOf;
    public final String values;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFe1kSDK)) {
            return false;
        }
        AFe1kSDK aFe1kSDK = (AFe1kSDK) obj;
        return Intrinsics.LJFF(this.valueOf, aFe1kSDK.valueOf) && Intrinsics.LJFF(this.values, aFe1kSDK.values);
    }

    public final int hashCode() {
        return (this.valueOf.hashCode() * 31) + this.values.hashCode();
    }

    public final String toString() {
        return "HostConfig(prefix=" + this.valueOf + ", host=" + this.values + ')';
    }

    public AFe1kSDK(String str, String str2) {
        this.valueOf = str;
        this.values = str2;
    }
}
