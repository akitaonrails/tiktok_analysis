package com.appsflyer.internal;

import X.C098200Yq;
import X.C1697810uHb;
import X.C189200o6;
import X.C2097608Jq;
import com.appsflyer.AFPurchaseDetails;
import com.appsflyer.AppsFlyerInAppPurchaseValidationCallback;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public final class AFf1pSDK extends AFf1tSDK {
    public final AFj1zSDK afInfoLog;
    public final AppsFlyerInAppPurchaseValidationCallback force;
    public final AFPurchaseDetails i;
    public final AppsFlyerProperties unregisterClient;
    public final Map<String, String> w;

    public static final class AFa1tSDK extends RuntimeException {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AFf1pSDK(AFd1kSDK aFd1kSDK, AppsFlyerProperties appsFlyerProperties, AFPurchaseDetails aFPurchaseDetails, Map<String, String> map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback) {
        this(aFd1kSDK, appsFlyerProperties, aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback, null, 32, 0 == true ? 1 : 0);
    }

    @Override // com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFe1dSDK
    public final void AFInAppEventType() {
        Object c098200Yq;
        super.AFInAppEventType();
        Throwable thUnregisterClient = unregisterClient();
        if (thUnregisterClient != null && !(thUnregisterClient instanceof AFf1wSDK)) {
            if (thUnregisterClient instanceof AFe1aSDK) {
                valueOf("No dev key", -1);
            } else if (thUnregisterClient instanceof AFa1tSDK) {
                valueOf("One or more of provided arguments is empty", -1);
            } else {
                valueOf("Error while sending request to server", -1);
            }
        }
        ResponseNetwork responseNetwork = ((AFf1nSDK) this).registerClient;
        if (responseNetwork != null) {
            if (responseNetwork.getStatusCode() != 200) {
                AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback = this.force;
                if (appsFlyerInAppPurchaseValidationCallback != null) {
                    appsFlyerInAppPurchaseValidationCallback.onInAppPurchaseValidationError(C2097608Jq.LJIIIIZZ(new Pair("error_code", Integer.valueOf(responseNetwork.getStatusCode())), new Pair("error_message", responseNetwork.getBody())));
                    return;
                }
                return;
            }
            try {
                AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback2 = this.force;
                if (appsFlyerInAppPurchaseValidationCallback2 != null) {
                    appsFlyerInAppPurchaseValidationCallback2.onInAppPurchaseValidationFinished(AFj1sSDK.values(new JSONObject((String) responseNetwork.getBody())));
                    c098200Yq = Unit.LIZ;
                } else {
                    c098200Yq = null;
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                valueOf("Error while trying to parse JSON response", responseNetwork.getStatusCode());
            }
            C189200o6.m1boximpl(c098200Yq);
        }
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    public final String values(Map<String, Object> map) {
        return this.afInfoLog.AFInAppEventType();
    }

    private final void valueOf(String str, int i) {
        AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback = this.force;
        if (appsFlyerInAppPurchaseValidationCallback != null) {
            appsFlyerInAppPurchaseValidationCallback.onInAppPurchaseValidationError(C2097608Jq.LJIIIIZZ(new Pair("error_code", Integer.valueOf(i)), new Pair("error_message", str)));
        }
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    public final void AFInAppEventType(Map<String, Object> map, String str) {
        Map<String, Object> mapLJ;
        super.AFInAppEventType(map, str);
        List listLJIIJJI = C1697810uHb.LJIIJJI(this.i.getPurchaseToken(), this.i.getProductId(), this.i.getPrice(), this.i.getCurrency());
        if (!(listLJIIJJI instanceof Collection) || !listLJIIJJI.isEmpty()) {
            Iterator it2 = listLJIIJJI.iterator();
            while (it2.hasNext()) {
                if (((String) it2.next()).length() == 0) {
                    throw new AFa1tSDK();
                }
            }
        }
        map.put("purchase_token", this.i.getPurchaseToken());
        map.put("product_id", this.i.getProductId());
        map.put("revenue", this.i.getPrice());
        map.put("currency", this.i.getCurrency());
        map.put("purchase_type", this.i.getPurchaseType().getValue());
        Map<String, String> map2 = this.w;
        if (map2 != null && !map2.isEmpty()) {
            map.put("extra_event_values", this.w);
        }
        String string = this.unregisterClient.getString("additionalCustomData");
        if (string != null && string.length() != 0) {
            mapLJ = AFj1sSDK.values(new JSONObject(string));
        } else {
            mapLJ = C2097608Jq.LJ();
        }
        map.put("custom_data", mapLJ);
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    public final AFe1sSDK<String> AFKeystoreWrapper(Map<String, Object> map, String str, String str2) {
        return ((AFf1nSDK) this).AFLogger.valueOf(map, str);
    }

    public AFf1pSDK(AFd1kSDK aFd1kSDK, AppsFlyerProperties appsFlyerProperties, AFPurchaseDetails aFPurchaseDetails, Map<String, String> map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback, AFj1zSDK aFj1zSDK) {
        super(AFf1zSDK.MANUAL_PURCHASE_VALIDATION, new AFf1zSDK[]{AFf1zSDK.RC_CDN, AFf1zSDK.FETCH_ADVERTISING_ID}, aFd1kSDK, null, C2097608Jq.LJ());
        this.unregisterClient = appsFlyerProperties;
        this.i = aFPurchaseDetails;
        this.w = map;
        this.force = appsFlyerInAppPurchaseValidationCallback;
        this.afInfoLog = aFj1zSDK;
        this.AFInAppEventParameterName.add(AFf1zSDK.CONVERSION);
    }

    public /* synthetic */ AFf1pSDK(AFd1kSDK aFd1kSDK, AppsFlyerProperties appsFlyerProperties, AFPurchaseDetails aFPurchaseDetails, Map map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback, AFj1zSDK aFj1zSDK, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFd1kSDK, appsFlyerProperties, aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback, (i & 32) != 0 ? new AFj1wSDK() : aFj1zSDK);
    }
}
