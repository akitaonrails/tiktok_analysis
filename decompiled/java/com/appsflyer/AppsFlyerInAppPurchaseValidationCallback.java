package com.appsflyer;

import java.util.Map;

/* JADX INFO: loaded from: classes25.dex */
public interface AppsFlyerInAppPurchaseValidationCallback {
    void onInAppPurchaseValidationError(Map<String, ? extends Object> map);

    void onInAppPurchaseValidationFinished(Map<String, ? extends Object> map);
}
