package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public class AFf1lSDK extends AFf1nSDK<String> {
    public static final AFf1zSDK[] afDebugLog = {AFf1zSDK.DLSDK, AFf1zSDK.ONELINK, AFf1zSDK.REGISTER};
    public final AFg1tSDK afErrorLog;
    public final AFe1gSDK afInfoLog;
    public final AFd1lSDK afRDLog;
    public final AFf1bSDK force;
    public final AFd1sSDK i;
    public final AFa1qSDK unregisterClient;
    public final AFg1mSDK v;
    public final AFd1qSDK w;

    @Override // com.appsflyer.internal.AFf1nSDK
    public boolean i() {
        return true;
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public final AppsFlyerRequestListener e() {
        return this.unregisterClient.values;
    }

    public static Map<String, Object> registerClient(AFa1qSDK aFa1qSDK) {
        Map<String, Object> map = (Map) aFa1qSDK.AFInAppEventParameterName().get("meta");
        if (map == null) {
            HashMap map2 = new HashMap();
            aFa1qSDK.AFInAppEventParameterName().put("meta", map2);
            return map2;
        }
        return map;
    }

    public void AFInAppEventParameterName(AFa1qSDK aFa1qSDK) {
        this.v.values(aFa1qSDK);
    }

    public void AFInAppEventType(AFa1qSDK aFa1qSDK) {
        this.v.AFInAppEventType(aFa1qSDK.AFInAppEventParameterName());
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0132 A[PHI: r4 r6
      0x0132: PHI (r4v11 java.lang.String) = (r4v1 java.lang.String), (r4v4 java.lang.String), (r4v12 java.lang.String) binds: [B:54:0x0100, B:27:0x00c3, B:13:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x0132: PHI (r6v12 java.lang.String) = (r6v2 java.lang.String), (r6v11 java.lang.String), (r6v13 java.lang.String) binds: [B:54:0x0100, B:27:0x00c3, B:13:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.appsflyer.internal.AFf1nSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.appsflyer.internal.AFe1sSDK<java.lang.String> AFKeystoreWrapper(java.lang.String r16) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1lSDK.AFKeystoreWrapper(java.lang.String):com.appsflyer.internal.AFe1sSDK");
    }

    public void valueOf(AFa1qSDK aFa1qSDK) {
        boolean z;
        AFe1eSDK aFe1eSDK;
        try {
            try {
                AFInAppEventType(aFa1qSDK);
                AFInAppEventParameterName(aFa1qSDK);
                values(aFa1qSDK);
                AFKeystoreWrapper(aFa1qSDK);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                AFLogger.afErrorLog("Error while collecting payload params", th, true, false);
            }
            if (aFa1qSDK.d()) {
                aFa1qSDK.valueOf(new AFd1rSDK(aFa1qSDK.AFInAppEventParameterName(), ((AFf1nSDK) this).d.AFKeystoreWrapper.AFKeystoreWrapper));
                aFa1qSDK.valueOf((Map<String, ?>) ((AFf1nSDK) this).d.valueOf(aFa1qSDK.AFInAppEventParameterName()));
                if (this.i.AFInAppEventParameterName("com.appsflyer.security.enable")) {
                    try {
                        new AFb1sSDK(aFa1qSDK).afInfoLog();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        AFLogger.afErrorLogForExcManagerOnly("native: reflection init failed", e);
                    }
                }
            }
            if (aFa1qSDK.e()) {
                aFa1qSDK.valueOf((Map<String, ?>) ((AFf1nSDK) this).d.AFInAppEventParameterName());
            }
            Set<AFf1zSDK> set = this.valueOf;
            if (!set.contains(AFf1zSDK.LAUNCH) && !set.contains(AFf1zSDK.CONVERSION)) {
                z = false;
            } else {
                z = true;
            }
            if (d() && z) {
                aFa1qSDK.AFInAppEventType(this.w.valueOf("appsFlyerCount", 0));
            }
            if (aFa1qSDK.unregisterClient()) {
                Map<String, Object> mapRegisterClient = registerClient(aFa1qSDK);
                AFe1gSDK aFe1gSDK = this.afInfoLog;
                String strAFInAppEventParameterName = aFe1gSDK.AFInAppEventParameterName();
                String strAFInAppEventType = aFe1gSDK.AFInAppEventType();
                if (AFe1gSDK.valueOf()) {
                    aFe1eSDK = AFe1eSDK.DEFAULT;
                } else {
                    aFe1eSDK = AFe1eSDK.API;
                }
                AFe1hSDK aFe1hSDK = new AFe1hSDK(strAFInAppEventParameterName, strAFInAppEventType, aFe1eSDK);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("name", aFe1hSDK.AFKeystoreWrapper);
                AFe1eSDK aFe1eSDK2 = aFe1hSDK.values;
                if (aFe1eSDK2 != AFe1eSDK.DEFAULT) {
                    jSONObject.put("method", aFe1eSDK2.AFInAppEventType);
                }
                String str = aFe1hSDK.AFInAppEventType;
                if (str != null && !a0.LJJJIL(str)) {
                    jSONObject.put("prefix", aFe1hSDK.AFInAppEventType);
                }
                mapRegisterClient.put("host", jSONObject);
            }
            if (this.i.AFInAppEventParameterName("AF_PREINSTALL_DISABLED")) {
                registerClient(aFa1qSDK).put("preinstall_disabled", Boolean.TRUE);
            }
            this.afErrorLog.values(aFa1qSDK.AFInAppEventParameterName(), aFa1qSDK.values());
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            AFLogger.afErrorLog("Error while preparing to send event", th2, true, false);
        }
    }

    public void values(AFa1qSDK aFa1qSDK) {
        this.v.AFInAppEventType(aFa1qSDK);
    }

    public void AFKeystoreWrapper(AFa1qSDK aFa1qSDK) {
        this.v.AFKeystoreWrapper(aFa1qSDK);
    }

    public AFf1lSDK(AFa1qSDK aFa1qSDK, AFd1kSDK aFd1kSDK) {
        this(aFa1qSDK, aFd1kSDK, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1lSDK(AFa1qSDK aFa1qSDK, AFd1kSDK aFd1kSDK, String str) {
        super(aFa1qSDK.values(), new AFf1zSDK[]{AFf1zSDK.RC_CDN, AFf1zSDK.FETCH_ADVERTISING_ID}, aFd1kSDK, str);
        this.unregisterClient = aFa1qSDK;
        this.afInfoLog = aFd1kSDK.afVerboseLog();
        this.w = aFd1kSDK.valueOf();
        this.force = aFd1kSDK.registerClient();
        this.afRDLog = aFd1kSDK.w();
        this.i = aFd1kSDK.AFInAppEventType();
        this.v = aFd1kSDK.e();
        this.afErrorLog = aFd1kSDK.getPurchaseType();
        for (AFf1zSDK aFf1zSDK : afDebugLog) {
            if (this.AFInAppEventType == aFf1zSDK) {
                return;
            }
        }
        int i = this.unregisterClient.AFLogger;
        AFf1zSDK aFf1zSDK2 = this.AFInAppEventType;
        if (i <= 0) {
            AFf1zSDK aFf1zSDK3 = AFf1zSDK.CONVERSION;
            if (aFf1zSDK2 != aFf1zSDK3) {
                this.valueOf.add(aFf1zSDK3);
                return;
            }
            return;
        }
        this.AFInAppEventParameterName.add(AFf1zSDK.CONVERSION);
    }
}
