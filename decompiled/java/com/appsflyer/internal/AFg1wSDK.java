package com.appsflyer.internal;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
public final class AFg1wSDK {
    public final AFg1uSDK AFInAppEventParameterName;
    public Map<String, Object> AFInAppEventType;
    public final AFd1lSDK AFKeystoreWrapper;
    public volatile String AFLogger;
    public volatile boolean registerClient;
    public volatile String unregisterClient;
    public long valueOf;
    public boolean values;

    private boolean AFInAppEventType() {
        Map<String, Object> map = this.AFInAppEventType;
        return (map == null || map.isEmpty()) ? false : true;
    }

    public final Map<String, Object> AFInAppEventParameterName() {
        HashMap map = new HashMap();
        if (AFInAppEventType()) {
            map.put("lvl", this.AFInAppEventType);
        } else if (this.values) {
            this.AFInAppEventType = new HashMap();
            values();
            this.AFInAppEventType.put("error", "pending LVL response");
            map.put("lvl", this.AFInAppEventType);
            return map;
        }
        return map;
    }

    public final boolean valueOf() {
        return this.values && !AFInAppEventType();
    }

    public final void values() {
        this.AFInAppEventType.put("ttr", Long.valueOf(System.currentTimeMillis() - this.valueOf));
        this.AFInAppEventType.put("lvl_timestamp", Long.valueOf(this.valueOf));
    }

    public final boolean AFKeystoreWrapper() {
        return this.registerClient;
    }

    public static boolean AFKeystoreWrapper(Context context) {
        if (!AppsFlyerProperties.getInstance().getBoolean("collectAndroidIdForceByUser", false) && !AppsFlyerProperties.getInstance().getBoolean("collectIMEIForceByUser", false)) {
            AFb1vSDK.AFKeystoreWrapper();
            if (AFb1vSDK.values(context)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String AFInAppEventParameterName(com.appsflyer.internal.AFd1qSDK r10) {
        /*
            r9 = this;
            com.appsflyer.AppsFlyerProperties r1 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r0 = "collectIMEI"
            r3 = 0
            boolean r0 = r1.getBoolean(r0, r3)
            java.lang.String r6 = "imeiCached"
            r5 = 0
            java.lang.String r8 = r10.AFKeystoreWrapper(r6, r5)
            if (r0 == 0) goto L62
            java.lang.String r0 = r9.unregisterClient
            boolean r0 = com.appsflyer.internal.AFc1tSDK.values(r0)
            if (r0 == 0) goto L62
            com.appsflyer.internal.AFd1lSDK r0 = r9.AFKeystoreWrapper
            android.content.Context r1 = r0.AFKeystoreWrapper
            if (r1 == 0) goto L78
            boolean r0 = AFKeystoreWrapper(r1)
            if (r0 == 0) goto L78
            java.lang.String r0 = "phone"
            java.lang.Object r7 = X.C786410Ut5.H2(r1, r0)     // Catch: java.lang.Exception -> L54 java.lang.reflect.InvocationTargetException -> L5b
            android.telephony.TelephonyManager r7 = (android.telephony.TelephonyManager) r7     // Catch: java.lang.Exception -> L54 java.lang.reflect.InvocationTargetException -> L5b
            java.lang.Class r2 = r7.getClass()     // Catch: java.lang.Exception -> L54 java.lang.reflect.InvocationTargetException -> L5b
            java.lang.String r1 = "getDeviceId"
            java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L54 java.lang.reflect.InvocationTargetException -> L5b
            java.lang.reflect.Method r4 = r2.getMethod(r1, r0)     // Catch: java.lang.Exception -> L54 java.lang.reflect.InvocationTargetException -> L5b
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L54 java.lang.reflect.InvocationTargetException -> L5b
            X.0WZX r2 = new X.0WZX     // Catch: java.lang.Exception -> L54 java.lang.reflect.InvocationTargetException -> L5b
            java.lang.String r1 = "dzBzEgMqT9naWU4kV1yNaEAr35CqUcZV5bJsf+leyw=="
            java.lang.String r0 = "01c45"
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch: java.lang.Exception -> L54 java.lang.reflect.InvocationTargetException -> L5b
            r2.<init>(r1, r0)     // Catch: java.lang.Exception -> L54 java.lang.reflect.InvocationTargetException -> L5b
            java.lang.Object r1 = X.C2204961BRm.a0(r4, r7, r3, r2)     // Catch: java.lang.Exception -> L54 java.lang.reflect.InvocationTargetException -> L5b
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L54 java.lang.reflect.InvocationTargetException -> L5b
            if (r1 != 0) goto L6e
            goto L6b
        L54:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            if (r8 == 0) goto L78
            goto L6d
        L5b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            if (r8 == 0) goto L78
            goto L6d
        L62:
            java.lang.String r0 = r9.unregisterClient
            if (r0 == 0) goto L69
            java.lang.String r1 = r9.unregisterClient
            goto L6e
        L69:
            r1 = r5
            goto L6e
        L6b:
            if (r8 == 0) goto L78
        L6d:
            r1 = r8
        L6e:
            boolean r0 = com.appsflyer.internal.AFc1tSDK.values(r1)
            if (r0 != 0) goto L7a
            r10.AFInAppEventParameterName(r6, r1)
            return r1
        L78:
            r8 = r5
            goto L6d
        L7a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1wSDK.AFInAppEventParameterName(com.appsflyer.internal.AFd1qSDK):java.lang.String");
    }

    public final Map<String, Object> valueOf(Map<String, Object> map) {
        try {
            try {
                Object[] objArr = {map, this.AFKeystoreWrapper.AFKeystoreWrapper};
                Map<Integer, Object> map2 = AFc1fSDK.afDebugLog;
                Object declaredConstructor = map2.get(1237996881);
                if (declaredConstructor == null) {
                    declaredConstructor = ((Class) AFc1fSDK.valueOf(KeyEvent.getDeadChar(0, 0) + 37, 125 - Color.red(0), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)))).getDeclaredConstructor(Map.class, Context.class);
                    map2.put(1237996881, declaredConstructor);
                }
                return (Map) ((Constructor) declaredConstructor).newInstance(objArr);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            AFLogger.afErrorLogForExcManagerOnly("AFCksmV3: reflection init failed", th2);
            return new HashMap();
        }
    }

    public AFg1wSDK(AFd1lSDK aFd1lSDK, AFg1uSDK aFg1uSDK) {
        this.AFKeystoreWrapper = aFd1lSDK;
        this.AFInAppEventParameterName = aFg1uSDK;
    }
}
