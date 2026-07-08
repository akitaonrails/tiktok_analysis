package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class AFe1hSDK {
    public final String AFInAppEventType;
    public final String AFKeystoreWrapper;
    public final AFe1eSDK values;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFe1hSDK)) {
            return false;
        }
        AFe1hSDK aFe1hSDK = (AFe1hSDK) obj;
        return Intrinsics.LJFF(this.AFKeystoreWrapper, aFe1hSDK.AFKeystoreWrapper) && Intrinsics.LJFF(this.AFInAppEventType, aFe1hSDK.AFInAppEventType) && this.values == aFe1hSDK.values;
    }

    public final int hashCode() {
        int iHashCode = this.AFKeystoreWrapper.hashCode() * 31;
        String str = this.AFInAppEventType;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.values.hashCode();
    }

    public final String toString() {
        return "AFe1hSDK(values=" + this.AFKeystoreWrapper + ", AFInAppEventParameterName=" + this.AFInAppEventType + ", AFInAppEventType=" + this.values + ')';
    }

    public AFe1hSDK(String str, String str2, AFe1eSDK aFe1eSDK) {
        this.AFKeystoreWrapper = str;
        this.AFInAppEventType = str2;
        this.values = aFe1eSDK;
    }
}
