package com.appsflyer.internal;

import com.appsflyer.PurchaseHandler;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
public final class AFf1ySDK extends AFf1sSDK {
    @Override // com.appsflyer.internal.AFf1sSDK, com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFe1dSDK
    public final boolean valueOf() {
        ResponseNetwork responseNetwork = ((AFf1nSDK) this).registerClient;
        if (responseNetwork == null || responseNetwork.getStatusCode() != 424) {
            return super.valueOf();
        }
        return true;
    }

    public AFf1ySDK(Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback, AFd1kSDK aFd1kSDK) {
        super(AFf1zSDK.ARS_VALIDATE, new AFf1zSDK[]{AFf1zSDK.RC_CDN, AFf1zSDK.FETCH_ADVERTISING_ID}, aFd1kSDK, map, purchaseValidationCallback);
        this.AFInAppEventParameterName.add(AFf1zSDK.CONVERSION);
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    public final AFe1sSDK<String> AFKeystoreWrapper(Map<String, Object> map, String str, String str2) {
        return ((AFf1nSDK) this).AFLogger.values(map, str, str2);
    }
}
