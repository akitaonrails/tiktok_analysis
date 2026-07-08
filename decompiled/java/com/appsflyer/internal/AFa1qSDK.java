package com.appsflyer.internal;

import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
public abstract class AFa1qSDK {
    public Map<String, Object> AFInAppEventParameterName;
    public final Map<String, Object> AFInAppEventType;
    public String AFKeystoreWrapper;
    public int AFLogger;
    public String d;
    public String e;
    public byte[] force;
    public String registerClient;
    public String unregisterClient;
    public String valueOf;
    public AppsFlyerRequestListener values;
    public final boolean w;

    public AFa1qSDK() {
        this(null, null, null);
    }

    public boolean AFLogger() {
        return true;
    }

    public boolean d() {
        return true;
    }

    public boolean e() {
        return true;
    }

    public boolean unregisterClient() {
        return false;
    }

    public abstract AFf1zSDK values();

    public final boolean AFInAppEventType() {
        return this.e == null && this.AFKeystoreWrapper == null;
    }

    public final Map<String, Object> AFInAppEventParameterName() {
        return this.AFInAppEventType;
    }

    public final byte[] AFKeystoreWrapper() {
        return this.force;
    }

    public final boolean valueOf() {
        return this.w;
    }

    public final AFa1qSDK AFInAppEventType(int i) {
        this.AFLogger = i;
        synchronized (this.AFInAppEventType) {
            try {
                if (this.AFInAppEventType.containsKey("counter")) {
                    this.AFInAppEventType.put("counter", Integer.toString(i));
                }
                if (this.AFInAppEventType.containsKey("launch_counter")) {
                    this.AFInAppEventType.put("launch_counter", Integer.toString(i));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return this;
    }

    public final AFa1qSDK valueOf(Map<String, ?> map) {
        synchronized (map) {
            try {
                this.AFInAppEventType.putAll(map);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return this;
    }

    public static boolean AFInAppEventType(double d) {
        if (d < 0.0d || d >= 1.0d) {
            return false;
        }
        if (d == 0.0d) {
            return true;
        }
        int i = (int) (1.0d / d);
        int i2 = i + 1;
        if (i2 > 0) {
            if (((int) ((Math.random() * ((double) (i2 - 1))) + 1.0d)) == i) {
                return false;
            }
            return true;
        }
        throw new IllegalArgumentException("Unsupported max value");
    }

    public AFa1qSDK valueOf(String str) {
        this.registerClient = str;
        return this;
    }

    public static String AFInAppEventType(String str) {
        String strD = AFb1vSDK.AFKeystoreWrapper().AFInAppEventParameterName().AFInAppEventType().d();
        if (strD != null) {
            return UriProtector.parse(str).buildUpon().appendQueryParameter("channel", strD).build().toString();
        }
        return str;
    }

    public final AFa1qSDK AFInAppEventType(byte[] bArr) {
        this.force = bArr;
        return this;
    }

    public final AFa1qSDK AFKeystoreWrapper(String str, Object obj) {
        synchronized (this.AFInAppEventType) {
            try {
                this.AFInAppEventType.put(str, obj);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return this;
    }

    public AFa1qSDK(String str, String str2, Boolean bool) {
        boolean zBooleanValue;
        this.AFInAppEventType = new HashMap();
        this.e = str;
        this.registerClient = str2;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = true;
        }
        this.w = zBooleanValue;
    }
}
