package com.appsflyer;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class AFPurchaseDetails {
    public final String AFInAppEventParameterName;
    public final AFPurchaseType AFInAppEventType;
    public final String AFKeystoreWrapper;
    public final String valueOf;
    public final String values;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFPurchaseDetails)) {
            return false;
        }
        AFPurchaseDetails aFPurchaseDetails = (AFPurchaseDetails) obj;
        return this.AFInAppEventType == aFPurchaseDetails.AFInAppEventType && Intrinsics.LJFF(this.AFKeystoreWrapper, aFPurchaseDetails.AFKeystoreWrapper) && Intrinsics.LJFF(this.valueOf, aFPurchaseDetails.valueOf) && Intrinsics.LJFF(this.values, aFPurchaseDetails.values) && Intrinsics.LJFF(this.AFInAppEventParameterName, aFPurchaseDetails.AFInAppEventParameterName);
    }

    public final int hashCode() {
        return (((((((this.AFInAppEventType.hashCode() * 31) + this.AFKeystoreWrapper.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.values.hashCode()) * 31) + this.AFInAppEventParameterName.hashCode();
    }

    public final String toString() {
        return "AFPurchaseDetails(purchaseType=" + this.AFInAppEventType + ", purchaseToken=" + this.AFKeystoreWrapper + ", productId=" + this.valueOf + ", price=" + this.values + ", currency=" + this.AFInAppEventParameterName + ')';
    }

    public final String getCurrency() {
        return this.AFInAppEventParameterName;
    }

    public final String getPrice() {
        return this.values;
    }

    public final String getProductId() {
        return this.valueOf;
    }

    public final String getPurchaseToken() {
        return this.AFKeystoreWrapper;
    }

    public final AFPurchaseType getPurchaseType() {
        return this.AFInAppEventType;
    }

    public AFPurchaseDetails(AFPurchaseType aFPurchaseType, String str, String str2, String str3, String str4) {
        this.AFInAppEventType = aFPurchaseType;
        this.AFKeystoreWrapper = str;
        this.valueOf = str2;
        this.values = str3;
        this.AFInAppEventParameterName = str4;
    }
}
