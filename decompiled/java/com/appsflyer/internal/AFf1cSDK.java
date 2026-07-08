package com.appsflyer.internal;

import X.C786410Ut5;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFi1hSDK;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public final class AFf1cSDK extends AFf1lSDK {
    public final AppsFlyerProperties afErrorLog;
    public final AFi1aSDK afInfoLog;
    public final AFc1kSDK afRDLog;
    public final AFh1wSDK afVerboseLog;
    public final AFf1bSDK afWarnLog;
    public final AFd1qSDK force;
    public Map<String, Object> i;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFf1cSDK$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] AFKeystoreWrapper;

        static {
            int[] iArr = new int[AFi1hSDK.AFa1ySDK.values().length];
            AFKeystoreWrapper = iArr;
            try {
                iArr[AFi1hSDK.AFa1ySDK.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                AFKeystoreWrapper[AFi1hSDK.AFa1ySDK.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    @Override // com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFe1dSDK
    public final void AFInAppEventType() {
        super.AFInAppEventType();
        AFh1wSDK aFh1wSDK = this.afVerboseLog;
        int i = ((AFf1lSDK) this).unregisterClient.AFLogger;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (i == 1) {
            long j = aFh1wSDK.registerClient;
            if (j != 0) {
                aFh1wSDK.AFKeystoreWrapper.put("net", Long.valueOf(jCurrentTimeMillis - j));
                aFh1wSDK.AFInAppEventParameterName.AFInAppEventParameterName("first_launch", C786410Ut5.J3(new JSONObject(aFh1wSDK.AFKeystoreWrapper)));
            }
        }
    }

    @Override // com.appsflyer.internal.AFf1lSDK
    public final void valueOf(AFa1qSDK aFa1qSDK) {
        super.valueOf(aFa1qSDK);
        int i = aFa1qSDK.AFLogger;
        this.afVerboseLog.values(i);
        Map map = (Map) aFa1qSDK.AFInAppEventParameterName().get("meta");
        if (map == null) {
            map = new HashMap();
            aFa1qSDK.AFInAppEventParameterName().put("meta", map);
        }
        if (!aFa1qSDK.AFInAppEventParameterName().containsKey("af_deeplink")) {
            aFa1qSDK.valueOf(this.afRDLog.AFInAppEventParameterName());
        }
        AFh1aSDK aFh1aSDKValues = this.afWarnLog.values();
        if (aFh1aSDKValues != null) {
            HashMap map2 = new HashMap();
            map2.put("cdn_token", aFh1aSDKValues.valueOf);
            String str = aFh1aSDKValues.AFInAppEventType;
            if (str != null) {
                map2.put("c_ver", str);
            }
            long j = aFh1aSDKValues.values;
            if (j > 0) {
                map2.put("latency", Long.valueOf(j));
            }
            long j2 = aFh1aSDKValues.AFKeystoreWrapper;
            if (j2 > 0) {
                map2.put("delay", Long.valueOf(j2));
            }
            int i2 = aFh1aSDKValues.AFInAppEventParameterName;
            if (i2 > 0) {
                map2.put("res_code", Integer.valueOf(i2));
            }
            if (aFh1aSDKValues.unregisterClient != null) {
                map2.put("error", aFh1aSDKValues.unregisterClient.getClass().getSimpleName() + ": " + aFh1aSDKValues.unregisterClient.getMessage());
            }
            AFh1bSDK aFh1bSDK = aFh1aSDKValues.e;
            if (aFh1bSDK != null) {
                map2.put("sig", aFh1bSDK.toString());
            }
            String str2 = aFh1aSDKValues.registerClient;
            if (str2 != null) {
                map2.put("cdn_cache_status", str2);
            }
            map.put("rc", map2);
        }
        ((AFf1lSDK) this).v.valueOf(aFa1qSDK.AFInAppEventParameterName());
        if (i != 1) {
            if (i == 2) {
                HashMap map3 = new HashMap(this.afVerboseLog.AFKeystoreWrapper);
                if (!map3.isEmpty()) {
                    map.put("first_launch", map3);
                }
                this.afVerboseLog.AFInAppEventParameterName.AFKeystoreWrapper("first_launch");
            }
        } else {
            if (this.afErrorLog.getBoolean("waitForCustomerId", false)) {
                aFa1qSDK.AFInAppEventParameterName().put("wait_cid", Boolean.toString(true));
            }
            HashMap map4 = new HashMap(this.afVerboseLog.valueOf);
            this.afVerboseLog.AFInAppEventParameterName.AFKeystoreWrapper("ddl");
            if (!map4.isEmpty()) {
                map.put("ddl", map4);
            }
            HashMap map5 = new HashMap(this.afVerboseLog.AFKeystoreWrapper);
            if (!map5.isEmpty()) {
                map.put("first_launch", map5);
            }
        }
        if (map.isEmpty()) {
            aFa1qSDK.AFInAppEventParameterName().remove("meta");
        }
        if (i <= 2) {
            ArrayList arrayList = new ArrayList();
            for (AFi1hSDK aFi1hSDK : this.afInfoLog.AFKeystoreWrapper()) {
                boolean z = aFi1hSDK instanceof AFi1lSDK;
                int i3 = AnonymousClass1.AFKeystoreWrapper[aFi1hSDK.unregisterClient.ordinal()];
                if (i3 != 1) {
                    if (i3 == 2 && i == 2 && !z) {
                        HashMap map6 = new HashMap();
                        map6.put("source", aFi1hSDK.values);
                        map6.put("response", "TIMEOUT");
                        map6.put("type", aFi1hSDK.d);
                        arrayList.add(map6);
                    }
                } else {
                    if (z) {
                        aFa1qSDK.AFKeystoreWrapper("rfr", ((AFi1lSDK) aFi1hSDK).valueOf);
                        this.force.valueOf("newGPReferrerSent", true);
                    }
                    arrayList.add(aFi1hSDK.AFInAppEventParameterName);
                }
            }
            if (!arrayList.isEmpty()) {
                aFa1qSDK.AFKeystoreWrapper("referrers", arrayList);
            }
            Object obj = this.i;
            if (obj != null) {
                aFa1qSDK.AFKeystoreWrapper("fb_ddl", obj);
            }
        }
        ((AFf1lSDK) this).v.valueOf(aFa1qSDK);
    }

    public AFf1cSDK(AFa1qSDK aFa1qSDK, AFd1kSDK aFd1kSDK) {
        super(aFa1qSDK, aFd1kSDK);
        this.afInfoLog = aFd1kSDK.force();
        this.force = aFd1kSDK.valueOf();
        this.afVerboseLog = aFd1kSDK.AFLogger();
        this.afWarnLog = aFd1kSDK.registerClient();
        this.afErrorLog = AppsFlyerProperties.getInstance();
        this.afRDLog = aFd1kSDK.getPurchaseToken();
        this.AFInAppEventParameterName.add(AFf1zSDK.RESOLVE_ESP);
        this.AFInAppEventParameterName.add(AFf1zSDK.DLSDK);
    }
}
