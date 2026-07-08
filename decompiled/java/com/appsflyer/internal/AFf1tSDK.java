package com.appsflyer.internal;

import X.C786410Ut5;
import android.content.Context;
import android.os.Build;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public abstract class AFf1tSDK extends AFf1nSDK<String> {
    public final AFd1sSDK afInfoLog;
    public final Map<String, Object> force;
    public final AFg1tSDK i;
    public final AFf1zSDK unregisterClient;
    public final AFg1mSDK v;
    public final AFd1qSDK w;

    public String AFInAppEventType(Map<String, Object> map) {
        return null;
    }

    public abstract AFe1sSDK<String> AFKeystoreWrapper(Map<String, Object> map, String str, String str2);

    @Override // com.appsflyer.internal.AFf1nSDK
    public final AppsFlyerRequestListener e() {
        return null;
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public final boolean i() {
        return true;
    }

    public boolean registerClient() {
        return false;
    }

    public String values(Map<String, Object> map) {
        return null;
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public final AFe1sSDK<String> AFKeystoreWrapper(String str) {
        AFe1nSDK aFe1nSDK;
        String str2;
        String strAFInAppEventParameterName;
        String str3;
        String str4;
        Map<String, Object> linkedHashMap = new LinkedHashMap<>(this.force);
        String strValues = values(linkedHashMap);
        String strAFInAppEventType = AFInAppEventType(linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        AFInAppEventType(linkedHashMap2, strValues);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        String strAFKeystoreWrapper = this.afInfoLog.AFKeystoreWrapper();
        if (strAFKeystoreWrapper != null && !a0.LJJJIL(strAFKeystoreWrapper)) {
            linkedHashMap3.put("advertising_id", strAFKeystoreWrapper);
        }
        AFb1zSDK aFb1zSDKAFInAppEventType = AFb1rSDK.AFInAppEventType(this.afInfoLog.valueOf.AFKeystoreWrapper);
        if (aFb1zSDKAFInAppEventType != null && (str4 = aFb1zSDKAFInAppEventType.AFInAppEventParameterName) != null && !a0.LJJJIL(str4)) {
            linkedHashMap3.put("oaid", str4);
        }
        AFb1zSDK aFb1zSDKAFInAppEventParameterName = AFb1rSDK.AFInAppEventParameterName(this.afInfoLog.valueOf.AFKeystoreWrapper.getContentResolver());
        if (aFb1zSDKAFInAppEventParameterName != null && (str3 = aFb1zSDKAFInAppEventParameterName.AFInAppEventParameterName) != null && !a0.LJJJIL(str3)) {
            linkedHashMap3.put("amazon_aid", str3);
        }
        if (!AppsFlyerProperties.getInstance().getBoolean("deviceTrackingDisabled", false) && (strAFInAppEventParameterName = ((AFf1nSDK) this).d.AFInAppEventParameterName(this.w)) != null && !a0.LJJJIL(strAFInAppEventParameterName)) {
            linkedHashMap3.put("imei", strAFInAppEventParameterName);
        }
        AFd1sSDK aFd1sSDK = this.afInfoLog;
        String strValueOf = AFb1kSDK.valueOf(aFd1sSDK.valueOf, aFd1sSDK.AFKeystoreWrapper);
        if (strValueOf == null) {
            strValueOf = "";
        }
        linkedHashMap3.put("appsflyer_id", strValueOf);
        linkedHashMap3.put("os_version", String.valueOf(Build.VERSION.SDK_INT));
        linkedHashMap3.put("sdk_version", "6.14.0");
        if (strAFInAppEventType != null && !a0.LJJJIL(strAFInAppEventType)) {
            linkedHashMap3.put("sdk_connector_version", strAFInAppEventType);
        }
        linkedHashMap2.put("device_data", linkedHashMap3);
        this.i.values(linkedHashMap2, this.unregisterClient);
        AFe1sSDK<String> aFe1sSDKAFKeystoreWrapper = AFKeystoreWrapper(linkedHashMap2, str, strValues);
        if (aFe1sSDKAFKeystoreWrapper != null && (aFe1nSDK = aFe1sSDKAFKeystoreWrapper.AFInAppEventParameterName) != null && (str2 = aFe1nSDK.values) != null) {
            String strJ3 = C786410Ut5.J3(new JSONObject(linkedHashMap2));
            AFb1mSDK.AFKeystoreWrapper(toString() + ": preparing data: " + strJ3);
            ((AFf1nSDK) this).e.valueOf(str2, strJ3);
        }
        return aFe1sSDKAFKeystoreWrapper;
    }

    public void AFInAppEventType(Map<String, Object> map, String str) {
        map.put("app_id", this.afInfoLog.valueOf.AFKeystoreWrapper.getPackageName());
        String strAFInAppEventParameterName = AFd1sSDK.AFInAppEventParameterName();
        if (strAFInAppEventParameterName != null) {
            map.put("cuid", strAFInAppEventParameterName);
        }
        Context context = this.afInfoLog.valueOf.AFKeystoreWrapper;
        map.put("app_version_name", AFb1uSDK.AFInAppEventType(context, context.getPackageName()));
        if (registerClient()) {
            map.put("event_timestamp", Long.valueOf(this.v.AFInAppEventType()));
        }
        if (str != null) {
            map.put("billing_lib_version", str);
        }
    }

    public AFf1tSDK(AFf1zSDK aFf1zSDK, AFf1zSDK[] aFf1zSDKArr, AFd1kSDK aFd1kSDK, String str, Map<String, ? extends Object> map) {
        super(aFf1zSDK, aFf1zSDKArr, aFd1kSDK, null);
        this.unregisterClient = aFf1zSDK;
        this.force = map;
        this.afInfoLog = aFd1kSDK.AFInAppEventType();
        this.w = aFd1kSDK.valueOf();
        this.v = aFd1kSDK.e();
        this.i = aFd1kSDK.getPurchaseType();
    }
}
