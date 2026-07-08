package com.appsflyer.internal;

import com.appsflyer.PurchaseHandler;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
public final class AFf1mSDK extends AFf1sSDK {
    public AFf1mSDK(Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback, AFd1kSDK aFd1kSDK) {
        super(AFf1zSDK.PURCHASE_VALIDATE, new AFf1zSDK[]{AFf1zSDK.RC_CDN, AFf1zSDK.FETCH_ADVERTISING_ID}, aFd1kSDK, map, purchaseValidationCallback);
        this.AFInAppEventParameterName.add(AFf1zSDK.CONVERSION);
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    public final AFe1sSDK<String> AFKeystoreWrapper(Map<String, Object> map, String str, String str2) {
        return ((AFf1nSDK) this).AFLogger.AFInAppEventType(map, str, str2);
    }
}
