package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class AFg1qSDK {
    public final String AFInAppEventParameterName;
    public final int AFInAppEventType;
    public final int AFKeystoreWrapper;
    public final int valueOf;
    public final int values;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFg1qSDK)) {
            return false;
        }
        AFg1qSDK aFg1qSDK = (AFg1qSDK) obj;
        return this.AFKeystoreWrapper == aFg1qSDK.AFKeystoreWrapper && this.AFInAppEventType == aFg1qSDK.AFInAppEventType && this.values == aFg1qSDK.values && this.valueOf == aFg1qSDK.valueOf && Intrinsics.LJFF(this.AFInAppEventParameterName, aFg1qSDK.AFInAppEventParameterName);
    }

    public final int hashCode() {
        return (((((((this.AFKeystoreWrapper * 31) + this.AFInAppEventType) * 31) + this.values) * 31) + this.valueOf) * 31) + this.AFInAppEventParameterName.hashCode();
    }

    public final String toString() {
        return "CmpTcfData(policyVersion=" + this.AFKeystoreWrapper + ", gdprApplies=" + this.AFInAppEventType + ", cmpSdkId=" + this.values + ", cmpSdkVersion=" + this.valueOf + ", tcString=" + this.AFInAppEventParameterName + ')';
    }

    public AFg1qSDK(int i, int i2, int i3, int i4, String str) {
        this.AFKeystoreWrapper = i;
        this.AFInAppEventType = i2;
        this.values = i3;
        this.valueOf = i4;
        this.AFInAppEventParameterName = str;
    }
}
