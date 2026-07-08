package com.appsflyer.internal;

import com.appsflyer.PurchaseHandler;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
public abstract class AFf1sSDK extends AFf1tSDK {
    public final PurchaseHandler.PurchaseValidationCallback unregisterClient;

    @Override // com.appsflyer.internal.AFf1tSDK
    public final boolean registerClient() {
        return true;
    }

    @Override // com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFe1dSDK
    public boolean valueOf() {
        ResponseNetwork responseNetwork = ((AFf1nSDK) this).registerClient;
        if (responseNetwork == null || responseNetwork.getStatusCode() != 503) {
            return super.valueOf();
        }
        return true;
    }

    @Override // com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFe1dSDK
    public final void AFInAppEventType() {
        PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback;
        PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback2;
        super.AFInAppEventType();
        Throwable thUnregisterClient = unregisterClient();
        if (thUnregisterClient != null && (purchaseValidationCallback2 = this.unregisterClient) != null) {
            purchaseValidationCallback2.onFailure(thUnregisterClient);
        }
        ResponseNetwork<String> responseNetwork = ((AFf1nSDK) this).registerClient;
        if (responseNetwork == null || (purchaseValidationCallback = this.unregisterClient) == null) {
            return;
        }
        purchaseValidationCallback.onResponse(responseNetwork);
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    public final String AFInAppEventType(Map<String, Object> map) {
        if (map.containsKey("connector_version")) {
            Object objRemove = map.remove("connector_version");
            if (objRemove instanceof String) {
                return (String) objRemove;
            }
        }
        return null;
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    public final String values(Map<String, Object> map) {
        if (map.containsKey("billing_library_version")) {
            Object objRemove = map.remove("billing_library_version");
            if (objRemove instanceof String) {
                return (String) objRemove;
            }
        }
        return null;
    }

    public AFf1sSDK(AFf1zSDK aFf1zSDK, AFf1zSDK[] aFf1zSDKArr, AFd1kSDK aFd1kSDK, Map<String, ? extends Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        super(aFf1zSDK, aFf1zSDKArr, aFd1kSDK, null, map);
        this.unregisterClient = purchaseValidationCallback;
    }
}
