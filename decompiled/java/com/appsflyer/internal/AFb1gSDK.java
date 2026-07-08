package com.appsflyer.internal;

import X.C1C7U;
import X.C786410Ut5;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFb1gSDK;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public final class AFb1gSDK implements AFb1bSDK {
    public static int $10 = 0;
    public static int $11 = 1;
    public static final int AFInAppEventParameterName;
    public static int AFLogger = 0;
    public static char[] d = null;
    public static int force = 1;
    public final AFd1kSDK unregisterClient;
    public List<String> valueOf = new ArrayList();
    public boolean AFInAppEventType = true;
    public final Map<String, Object> values = new HashMap();
    public boolean e = true ^ AppsFlyerProperties.getInstance().getBoolean("disableProxy", false);
    public int AFKeystoreWrapper = 0;
    public boolean registerClient = false;

    public static void AFLogger() {
        d = new char[]{54246, 54193, 54207, 54197, 54204};
    }

    public static /* synthetic */ boolean lambda$semisugar$AFKeystoreWrapper$0(AFd1mSDK aFd1mSDK) {
        C1C7U.LIZ("AFb1gSDK@de8b.values$1L");
        return aFd1mSDK.AFKeystoreWrapper();
    }

    private synchronized void registerClient() {
        int i = AFLogger + 77;
        int i2 = i % 128;
        force = i2;
        if (!(i % 2 != 0)) {
            try {
                throw null;
            } finally {
            }
        }
        if (this.registerClient) {
            int i3 = i2 + 59;
            AFLogger = i3 % 128;
            if (i3 % 2 != 0) {
                try {
                    throw null;
                } finally {
                }
            }
            return;
        }
        this.registerClient = true;
        try {
            AFInAppEventParameterName("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
            return;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            AFLogger.INSTANCE.e(AFg1aSDK.PROXY, "Error while starting remote debugger", th, true, true, true);
            return;
        }
    }

    private synchronized Map<String, Object> v() {
        Map<String, Object> map;
        int i = force + 125;
        AFLogger = i % 128;
        if ((i % 2 != 0 ? (char) 14 : ' ') == 14) {
            this.values.put("data", this.valueOf);
            w();
            try {
                throw null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        this.values.put("data", this.valueOf);
        w();
        map = this.values;
        AFLogger = (force + 61) % 128;
        return map;
    }

    private synchronized void w() {
        this.valueOf = new ArrayList();
        this.AFKeystoreWrapper = 0;
        AFLogger = (force + 43) % 128;
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final synchronized void AFInAppEventType() {
        int i = (force + 49) % 128;
        AFLogger = i;
        if (!this.registerClient) {
            force = (i + 83) % 128;
            if (!this.AFInAppEventType) {
                return;
            }
        }
        this.registerClient = false;
        this.AFInAppEventType = false;
        try {
            AFInAppEventParameterName("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            AFLogger.INSTANCE.e(AFg1aSDK.PROXY, "Error while stopping remote debugger", th, true, true, true);
        }
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final synchronized void AFKeystoreWrapper() {
        AFLogger = (force + 65) % 128;
        this.AFInAppEventType = false;
        valueOf();
        w();
        force = (AFLogger + 41) % 128;
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final synchronized void valueOf() {
        int i = force + 87;
        AFLogger = i % 128;
        if ((i % 2 != 0 ? (char) 19 : (char) 28) != 28) {
            this.values.clear();
            this.valueOf.clear();
        } else {
            this.values.clear();
            this.valueOf.clear();
        }
        this.AFKeystoreWrapper = 0;
    }

    private boolean afInfoLog() {
        int i = AFLogger + 107;
        force = i % 128;
        if (i % 2 != 0) {
            boolean zAFInAppEventType = this.unregisterClient.valueOf().AFInAppEventType("participantInProxy");
            int i2 = AFLogger + 121;
            force = i2 % 128;
            return i2 % 2 == 0 ? zAFInAppEventType : zAFInAppEventType;
        }
        this.unregisterClient.valueOf().AFInAppEventType("participantInProxy");
        try {
            throw null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }

    public static String d() {
        int i = force;
        int i2 = i + 35;
        AFLogger = i2 % 128;
        int i3 = i2 % 2;
        AFLogger = (i + 63) % 128;
        return "6.14.0";
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
    
        if (r4.registerClient != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean force() {
        /*
            r4 = this;
            boolean r0 = r4.e
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L2b
            int r0 = com.appsflyer.internal.AFb1gSDK.force
            int r0 = r0 + 73
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1gSDK.AFLogger = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L25
            boolean r0 = r4.AFInAppEventType
            if (r0 != 0) goto L1a
        L16:
            boolean r0 = r4.registerClient
            if (r0 == 0) goto L2b
        L1a:
            int r1 = r1 + 33
            int r0 = r1 % 128
            com.appsflyer.internal.AFb1gSDK.force = r0
            int r0 = r1 % 2
            if (r0 != 0) goto L2a
            return r3
        L25:
            boolean r0 = r4.AFInAppEventType
            if (r0 != 0) goto L1a
            goto L16
        L2a:
            return r3
        L2b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1gSDK.force():boolean");
    }

    private void i() {
        int i = AFLogger + 1;
        force = i % 128;
        if (i % 2 != 0) {
            this.unregisterClient.valueOf().AFKeystoreWrapper("participantInProxy");
            AFLogger = (force + 23) % 128;
        } else {
            this.unregisterClient.valueOf().AFKeystoreWrapper("participantInProxy");
            try {
                throw null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static float unregisterClient() {
        float fNextFloat = new Random().nextFloat();
        int i = force + 37;
        AFLogger = i % 128;
        if (i % 2 == 0) {
            return fNextFloat;
        }
        try {
            throw null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final void AFInAppEventParameterName() {
        int i = force + 81;
        int i2 = i % 128;
        AFLogger = i2;
        int i3 = i % 2;
        this.e = false;
        int i4 = i2 + 57;
        force = i4 % 128;
        if (i4 % 2 == 0) {
            try {
                throw null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final boolean e() {
        int i = force;
        AFLogger = (i + 15) % 128;
        boolean z = this.registerClient;
        int i2 = i + 37;
        AFLogger = i2 % 128;
        return i2 % 2 != 0 ? z : z;
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final boolean values() {
        int i;
        boolean zAFInAppEventParameterName = AFInAppEventParameterName(AFInAppEventType(this.unregisterClient.registerClient().valueOf.valueOf), AFInAppEventType(this.unregisterClient.registerClient().valueOf.values));
        if (zAFInAppEventParameterName) {
            force = (AFLogger + 103) % 128;
            registerClient();
            i = force + 95;
        } else {
            AFKeystoreWrapper();
            AFInAppEventType();
            i = force + 91;
        }
        AFLogger = i % 128;
        return zAFInAppEventParameterName;
    }

    static {
        AFLogger();
        AFInAppEventParameterName = 98166;
        int i = force + 31;
        AFLogger = i % 128;
        if (i % 2 != 0) {
        }
    }

    public AFb1gSDK(AFd1kSDK aFd1kSDK) {
        this.unregisterClient = aFd1kSDK;
    }

    public static AFh1hSDK AFInAppEventType(AFi1zSDK aFi1zSDK) {
        char c;
        AFh1gSDK aFh1gSDK;
        if (aFi1zSDK != null) {
            int i = AFLogger + 5;
            force = i % 128;
            if (i % 2 != 0 ? (aFh1gSDK = aFi1zSDK.AFInAppEventParameterName) != null : (aFh1gSDK = aFi1zSDK.AFInAppEventParameterName) != null) {
                return aFh1gSDK.AFInAppEventType;
            }
        }
        int i2 = AFLogger + 5;
        force = i2 % 128;
        if (i2 % 2 == 0) {
            c = 24;
        } else {
            c = '_';
        }
        if (c != 24) {
            return null;
        }
        try {
            throw null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }

    private void AFKeystoreWrapper(boolean z) {
        boolean z2;
        int i = force + 69;
        AFLogger = i % 128;
        if (i % 2 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            this.unregisterClient.valueOf().valueOf("participantInProxy", z);
            AFLogger = (force + 57) % 128;
        } else {
            this.unregisterClient.valueOf().valueOf("participantInProxy", z);
            try {
                throw null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final void values(Throwable th) {
        String message;
        StackTraceElement[] stackTrace;
        Throwable cause = th.getCause();
        String simpleName = th.getClass().getSimpleName();
        if (cause == null) {
            AFLogger = (force + 57) % 128;
            message = th.getMessage();
            if (cause == null) {
                int i = force + 53;
                AFLogger = i % 128;
                if (i % 2 != 0) {
                    stackTrace = th.getStackTrace();
                } else {
                    stackTrace = th.getStackTrace();
                }
            }
            AFInAppEventParameterName("exception", simpleName, AFInAppEventParameterName(message, stackTrace));
        }
        message = cause.getMessage();
        stackTrace = cause.getStackTrace();
        AFLogger = (force + 85) % 128;
        AFInAppEventParameterName("exception", simpleName, AFInAppEventParameterName(message, stackTrace));
    }

    public static boolean AFInAppEventType(String str) {
        AFLogger = (force + 65) % 128;
        if (AFc1tSDK.AFInAppEventType(str)) {
            return true;
        }
        new AFe1zSDK();
        boolean zAFInAppEventType = AFe1zSDK.AFInAppEventType(d(), str);
        force = (AFLogger + 115) % 128;
        return zAFInAppEventType;
    }

    private boolean AFKeystoreWrapper(String str) {
        if (AFc1tSDK.AFInAppEventType(str)) {
            AFLogger = (force + 85) % 128;
            return true;
        }
        Context context = this.unregisterClient.AFInAppEventType().valueOf.AFKeystoreWrapper;
        boolean zEquals = str.equals(AFb1uSDK.AFInAppEventType(context, context.getPackageName()));
        AFLogger = (force + 47) % 128;
        return zEquals;
    }

    public static boolean values(float f) {
        char c;
        double d2 = f;
        if (d2 >= 1.0d) {
            c = 29;
        } else {
            c = '4';
        }
        if (c != '4') {
            force = (AFLogger + 79) % 128;
            return true;
        }
        if (d2 <= 0.0d) {
            AFLogger = (force + 117) % 128;
            return false;
        }
        if (unregisterClient() <= f) {
            return true;
        }
        return false;
    }

    private synchronized boolean AFInAppEventParameterName(AFh1hSDK aFh1hSDK, AFh1hSDK aFh1hSDK2) {
        char c;
        if (aFh1hSDK == null) {
            c = 20;
        } else {
            c = '%';
        }
        boolean z = false;
        if (c != '%') {
            i();
            force = (AFLogger + 59) % 128;
            return false;
        }
        if (!aFh1hSDK.AFInAppEventParameterName()) {
            int i = force + 93;
            AFLogger = i % 128;
            if (i % 2 == 0) {
                return false;
            }
            try {
                throw null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (this.unregisterClient.AFInAppEventType().AFKeystoreWrapper.valueOf("appsFlyerCount", 0) <= aFh1hSDK.AFInAppEventType) {
            if (!AFKeystoreWrapper(aFh1hSDK, aFh1hSDK2)) {
                return false;
            }
            if (!AFKeystoreWrapper(aFh1hSDK.AFInAppEventParameterName)) {
                int i2 = AFLogger + 13;
                int i3 = i2 % 128;
                force = i3;
                if (i2 % 2 == 0) {
                    z = true;
                }
                AFLogger = (i3 + 113) % 128;
                return z;
            }
            if (AFInAppEventType(aFh1hSDK.AFLogger)) {
                return true;
            }
            int i4 = AFLogger + 79;
            force = i4 % 128;
            return i4 % 2 == 0 ? false : false;
        }
        int i5 = force + 121;
        AFLogger = i5 % 128;
        return i5 % 2 != 0 ? false : false;
    }

    private boolean AFKeystoreWrapper(AFh1hSDK aFh1hSDK, AFh1hSDK aFh1hSDK2) {
        force = (AFLogger + 25) % 128;
        if (aFh1hSDK.equals(aFh1hSDK2)) {
            int i = force + 37;
            AFLogger = i % 128;
            if (i % 2 != 0) {
                afInfoLog();
                try {
                    throw null;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return afInfoLog();
        }
        boolean zValues = values(aFh1hSDK.values);
        AFKeystoreWrapper(zValues);
        return zValues;
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final void valueOf(String str, String str2) {
        boolean z;
        int i = AFLogger + 97;
        force = i % 128;
        if (i % 2 == 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            AFInAppEventParameterName("server_request", str, str2);
        } else {
            String[] strArr = new String[1];
            strArr[1] = str2;
            AFInAppEventParameterName("server_request", str, strArr);
        }
        int i2 = force + 65;
        AFLogger = i2 % 128;
        if (i2 % 2 != 0) {
            try {
                throw null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final void values(String str, PackageManager packageManager) {
        AFLogger = (force + 33) % 128;
        try {
            final AFe1wSDK aFe1wSDKAFKeystoreWrapper = this.unregisterClient.AFInAppEventParameterName().AFKeystoreWrapper(AFInAppEventParameterName(str, packageManager), this.unregisterClient.i().AFLogger);
            if (aFe1wSDKAFKeystoreWrapper == null) {
                AFLogger.afErrorLogForExcManagerOnly("could not send null proxy data", new NullPointerException("request was null"));
            } else {
                this.unregisterClient.values().execute(new Runnable() { // from class: X.13nx
                    @Override // java.lang.Runnable
                    public final void run() {
                        AFb1gSDK.lambda$semisugar$AFKeystoreWrapper$0(aFe1wSDKAFKeystoreWrapper);
                    }
                });
                AFLogger = (force + 33) % 128;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            AFLogger.afErrorLogForExcManagerOnly("could not send proxy data", th);
        }
    }

    public static String[] AFInAppEventParameterName(String str, StackTraceElement[] stackTraceElementArr) {
        char c;
        boolean z;
        int i = AFLogger;
        int i2 = i + 73;
        force = i2 % 128;
        if (i2 % 2 != 0) {
            if (stackTraceElementArr == null) {
                c = ';';
            } else {
                c = 4;
            }
            if (c != 4) {
                int i3 = i + 95;
                force = i3 % 128;
                if (i3 % 2 == 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    return new String[]{str};
                }
                String[] strArr = new String[1];
                strArr[1] = str;
                return strArr;
            }
            String[] strArr2 = new String[stackTraceElementArr.length + 1];
            strArr2[0] = str;
            for (int i4 = 1; i4 < stackTraceElementArr.length; i4++) {
                strArr2[i4] = stackTraceElementArr[i4].toString();
            }
            return strArr2;
        }
        try {
            throw null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final void AFKeystoreWrapper(String str, String str2) {
        force = (AFLogger + 41) % 128;
        AFInAppEventParameterName(null, str, str2);
        force = (AFLogger + 51) % 128;
    }

    private Map<String, Object> AFInAppEventParameterName(String str, PackageManager packageManager) {
        char c;
        int i = AFLogger + 63;
        force = i % 128;
        if (i % 2 == 0) {
            c = '!';
        } else {
            c = '*';
        }
        if (c != '!') {
            valueOf(str, packageManager, this.unregisterClient.i(), this.unregisterClient.getLevel());
            return v();
        }
        valueOf(str, packageManager, this.unregisterClient.i(), this.unregisterClient.getLevel());
        v();
        try {
            throw null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final void AFInAppEventParameterName(String str, String... strArr) {
        force = (AFLogger + 67) % 128;
        AFInAppEventParameterName("public_api_call", str, strArr);
        int i = AFLogger + 89;
        force = i % 128;
        if (i % 2 == 0) {
        }
    }

    private synchronized void AFInAppEventParameterName(String str, String str2, String... strArr) {
        String strSubstring;
        force = (AFLogger + 121) % 128;
        if (force()) {
            AFLogger = (force + 35) % 128;
            if (this.AFKeystoreWrapper < 98304) {
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    String strJoin = TextUtils.join(", ", strArr);
                    if (str != null) {
                        strSubstring = jCurrentTimeMillis + " " + C786410Ut5.u3().getId() + " _/AppsFlyer_6.14.0 [" + str + "] " + str2 + " " + strJoin;
                        AFLogger = (force + 99) % 128;
                    } else {
                        strSubstring = jCurrentTimeMillis + " " + C786410Ut5.u3().getId() + " " + str2 + "/AppsFlyer_6.14.0 " + strJoin;
                    }
                    int length = this.AFKeystoreWrapper + (strSubstring.length() << 1);
                    int i = AFInAppEventParameterName;
                    boolean z = false;
                    if (length > i) {
                        strSubstring = strSubstring.substring(0, (i - this.AFKeystoreWrapper) / 2);
                        z = true;
                    }
                    this.valueOf.add(strSubstring);
                    this.AFKeystoreWrapper += strSubstring.length() << 1;
                    if (z) {
                        this.valueOf.add("+~+~ The limit has been exceeded, and no more data is available. +~+~");
                        this.AFKeystoreWrapper += 138;
                        force = (AFLogger + 17) % 128;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
    }

    private synchronized void AFInAppEventType(String str, String str2, String str3) {
        force = (AFLogger + 33) % 128;
        try {
            Map<String, Object> map = this.values;
            Object[] objArr = new Object[1];
            a(new int[]{0, 5, 0, 3}, "\u0001\u0001\u0000\u0000\u0000", false, objArr);
            map.put(((String) objArr[0]).intern(), Build.BRAND);
            this.values.put("model", Build.MODEL);
            this.values.put("platform", "Android");
            this.values.put("platform_version", Build.VERSION.RELEASE);
            if (str != null) {
                AFLogger = (force + 121) % 128;
                if (str.length() > 0) {
                    int i = AFLogger + 43;
                    force = i % 128;
                    if (i % 2 != 0) {
                        this.values.put("advertiserId", str);
                    } else {
                        this.values.put("advertiserId", str);
                        throw null;
                    }
                }
            }
            if (str2 != null) {
                force = (AFLogger + 59) % 128;
                if (str2.length() > 0) {
                    this.values.put("imei", str2);
                }
            }
            if (str3 != null && str3.length() > 0) {
                this.values.put("android_id", str3);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final void AFKeystoreWrapper(String str, int i, String str2) {
        force = (AFLogger + 77) % 128;
        AFInAppEventParameterName("server_response", str, String.valueOf(i), str2);
        int i2 = AFLogger + 43;
        force = i2 % 128;
        if (i2 % 2 == 0) {
            try {
                throw null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    private synchronized void AFInAppEventParameterName(String str, String str2, String str3, String str4) {
        AFLogger = (force + 45) % 128;
        if (str != null) {
            try {
                if (str.length() > 0) {
                    int i = force + 21;
                    AFLogger = i % 128;
                    if (i % 2 == 0) {
                        this.values.put("app_id", str);
                        force = (AFLogger + 21) % 128;
                    } else {
                        this.values.put("app_id", str);
                        throw null;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return;
            }
        }
        if (str2 != null) {
            int i2 = AFLogger + 107;
            force = i2 % 128;
            if (i2 % 2 != 0) {
                if (str2.length() > 0) {
                    this.values.put("app_version", str2);
                }
            } else {
                throw null;
            }
        }
        if (str3 != null && str3.length() > 0) {
            this.values.put("channel", str3);
        }
        if (str4 != null) {
            force = (AFLogger + 7) % 128;
            if (str4.length() > 0) {
                this.values.put("preInstall", str4);
            }
        }
    }

    private synchronized void AFKeystoreWrapper(String str, String str2, String str3, String str4) {
        try {
            this.values.put("sdk_version", str);
            if (str2 != null && str2.length() > 0) {
                this.values.put("devkey", str2);
            }
            if (str3 != null && str3.length() > 0) {
                int i = AFLogger + 31;
                force = i % 128;
                if (i % 2 == 0) {
                    this.values.put("originalAppsFlyerId", str3);
                } else {
                    this.values.put("originalAppsFlyerId", str3);
                }
            }
            if (str4 != null && str4.length() > 0) {
                AFLogger = (force + 87) % 128;
                this.values.put("uid", str4);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void a(int[] iArr, String str, boolean z, Object[] objArr) throws UnsupportedEncodingException {
        char c;
        String str2 = str;
        if (str2 != null) {
            c = 'X';
        } else {
            c = 'J';
        }
        Object bytes = str2;
        if (c == 'X') {
            $11 = ($10 + 79) % 128;
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        AFj1dSDK aFj1dSDK = new AFj1dSDK();
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        char[] cArr = d;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                cArr2[i5] = (char) (((long) cArr[i5]) ^ 4656066899128210390L);
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i2];
        System.arraycopy(cArr, i, cArr3, 0, i2);
        if (bArr != null) {
            $10 = ($11 + 9) % 128;
            char[] cArr4 = new char[i2];
            aFj1dSDK.AFKeystoreWrapper = 0;
            char c2 = 0;
            while (true) {
                int i6 = aFj1dSDK.AFKeystoreWrapper;
                if (i6 >= i2) {
                    break;
                }
                int i7 = $11 + 59;
                $10 = i7 % 128;
                if (i7 % 2 == 0 ? bArr[i6] == 1 : bArr[i6] == 0) {
                    cArr4[i6] = (char) (((cArr3[i6] * 2) + 1) - c2);
                } else {
                    cArr4[i6] = (char) ((cArr3[i6] * 2) - c2);
                }
                c2 = cArr4[i6];
                aFj1dSDK.AFKeystoreWrapper = i6 + 1;
            }
            cArr3 = cArr4;
        }
        if (i4 > 0) {
            char[] cArr5 = new char[i2];
            System.arraycopy(cArr3, 0, cArr5, 0, i2);
            int i8 = i2 - i4;
            System.arraycopy(cArr5, 0, cArr3, i8, i4);
            System.arraycopy(cArr5, i4, cArr3, 0, i8);
        }
        if (z) {
            char[] cArr6 = new char[i2];
            aFj1dSDK.AFKeystoreWrapper = 0;
            while (true) {
                int i9 = aFj1dSDK.AFKeystoreWrapper;
                if (i9 >= i2) {
                    break;
                }
                cArr6[i9] = cArr3[(i2 - i9) - 1];
                aFj1dSDK.AFKeystoreWrapper = i9 + 1;
            }
            $10 = ($11 + 19) % 128;
            cArr3 = cArr6;
        }
        if (i3 > 0) {
            aFj1dSDK.AFKeystoreWrapper = 0;
            $11 = ($10 + 123) % 128;
            while (true) {
                int i10 = aFj1dSDK.AFKeystoreWrapper;
                if (i10 >= i2) {
                    break;
                }
                $10 = ($11 + 107) % 128;
                cArr3[i10] = (char) (cArr3[i10] - iArr[2]);
                aFj1dSDK.AFKeystoreWrapper = i10 + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    private synchronized void valueOf(String str, PackageManager packageManager, AFg1wSDK aFg1wSDK, AFd1pSDK aFd1pSDK) {
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        String string = appsFlyerProperties.getString("remote_debug_static_data");
        this.values.clear();
        if (string != null) {
            try {
                this.values.putAll(AFa1oSDK.AFInAppEventType(new JSONObject(string)));
                int i = AFLogger + 121;
                force = i % 128;
                if (i % 2 == 0) {
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            this.values.put("launch_counter", String.valueOf(this.unregisterClient.AFInAppEventType().AFKeystoreWrapper.valueOf("appsFlyerCount", 0)));
        } else {
            AFb1vSDK aFb1vSDKAFKeystoreWrapper = AFb1vSDK.AFKeystoreWrapper();
            AFh1uSDK aFh1uSDK = AFb1vSDK.AFKeystoreWrapper().AFInAppEventParameterName().AFInAppEventType().AFInAppEventType.AFLogger;
            String str2 = null;
            if (aFh1uSDK != null) {
                AFb1zSDK aFb1zSDK = new AFb1zSDK(aFh1uSDK.AFKeystoreWrapper, aFh1uSDK.AFInAppEventParameterName);
                AFLogger = (force + 19) % 128;
                str2 = aFb1zSDK.AFInAppEventParameterName;
            }
            AFInAppEventType(str2, aFg1wSDK.unregisterClient, aFd1pSDK.AFInAppEventType);
            AFKeystoreWrapper("6.14.0." + AFb1vSDK.values, aFb1vSDKAFKeystoreWrapper.AFInAppEventParameterName().i().AFLogger, appsFlyerProperties.getString("KSAppsFlyerId"), appsFlyerProperties.getString("uid"));
            try {
                AFInAppEventParameterName(str, String.valueOf(C786410Ut5.Y3(packageManager, str, 0).versionCode), appsFlyerProperties.getString("channel"), appsFlyerProperties.getString("preInstallName"));
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
            appsFlyerProperties.set("remote_debug_static_data", C786410Ut5.J3(new JSONObject(this.values)));
            this.values.put("launch_counter", String.valueOf(this.unregisterClient.AFInAppEventType().AFKeystoreWrapper.valueOf("appsFlyerCount", 0)));
        }
    }
}
