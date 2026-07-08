package com.appsflyer.internal;

import X.C01GW;
import X.C098200Yq;
import X.C09AY;
import X.C0VSJ;
import X.C0WZX;
import X.C10EU;
import X.C1697810uHb;
import X.C189200o6;
import X.C20123713oZ;
import X.C2097608Jq;
import X.C2204961BRm;
import X.C452501pT;
import X.C786410Ut5;
import android.app.UiModeManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFd1vSDK;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public final class AFg1jSDK implements AFg1mSDK {
    public static int $10 = 0;
    public static int $11 = 1;
    public static int afErrorLog = 0;
    public static int afVerboseLog = 1;
    public final AFd1vSDK AFInAppEventParameterName;
    public final AFa1bSDK AFInAppEventType;
    public final Context AFKeystoreWrapper;
    public final AFd1qSDK AFLogger;
    public final AFd1pSDK afInfoLog;
    public final AFg1wSDK d;
    public final AFh1wSDK e;
    public final AFd1lSDK force;
    public final AFh1cSDK registerClient;
    public final AFd1sSDK unregisterClient;
    public final AFg1rSDK v;
    public final AFi1sSDK valueOf;
    public final AFi1cSDK values;
    public final AFb1hSDK w;
    public static char[] afDebugLog = {35987, 35999, 35977, 35989, 35983, 35976, 35995, 35986, 35993, 35992, 36022, 35988, 35996, 35982, 36030, 35998};
    public static char afWarnLog = 47460;
    public final C01GW i = C452501pT.LIZIZ(AnonymousClass5.valueOf);
    public final C01GW afRDLog = C452501pT.LIZIZ(AnonymousClass1.values);

    /* JADX INFO: renamed from: com.appsflyer.internal.AFg1jSDK$1, reason: invalid class name */
    public final class AnonymousClass1 extends C09AY implements Function0<SimpleDateFormat> {
        public static final AnonymousClass1 values = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: AFInAppEventType, reason: merged with bridge method [inline-methods] */
        public final SimpleDateFormat invoke() {
            return new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFg1jSDK$5, reason: invalid class name */
    public final class AnonymousClass5 extends C09AY implements Function0<AppsFlyerProperties> {
        public static final AnonymousClass5 valueOf = new AnonymousClass5();

        public AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: AFKeystoreWrapper, reason: merged with bridge method [inline-methods] */
        public final AppsFlyerProperties invoke() {
            return AppsFlyerProperties.getInstance();
        }
    }

    private final AppsFlyerProperties AFKeystoreWrapper() {
        int i = afErrorLog + 43;
        afVerboseLog = i % 128;
        if (i % 2 != 0) {
            return (AppsFlyerProperties) this.i.getValue();
        }
        this.i.getValue();
        try {
            throw null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }

    public static long AFLogger() {
        int i = afVerboseLog + 35;
        afErrorLog = i % 128;
        return i % 2 != 0 ? System.currentTimeMillis() & SystemClock.elapsedRealtime() : System.currentTimeMillis() - SystemClock.elapsedRealtime();
    }

    private boolean afInfoLog() {
        afVerboseLog = (afErrorLog + 93) % 128;
        boolean z = Boolean.parseBoolean(this.AFLogger.AFKeystoreWrapper("sentSuccessfully", (String) null));
        int i = afVerboseLog + 41;
        afErrorLog = i % 128;
        if (i % 2 == 0) {
            return z;
        }
        try {
            throw null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }

    private String d() {
        int i = afVerboseLog + 103;
        afErrorLog = i % 128;
        if (i % 2 != 0) {
            this.AFLogger.values("INSTALL_STORE");
            try {
                throw null;
            } finally {
            }
        }
        if (!this.AFLogger.values("INSTALL_STORE")) {
            String strE = !(registerClient() ? false : true) ? e() : null;
            this.AFLogger.AFInAppEventParameterName("INSTALL_STORE", strE);
            return strE;
        }
        int i2 = afVerboseLog + 97;
        afErrorLog = i2 % 128;
        if (i2 % 2 == 0) {
            return this.AFLogger.AFKeystoreWrapper("INSTALL_STORE", (String) null);
        }
        this.AFLogger.AFKeystoreWrapper("INSTALL_STORE", (String) null);
        try {
            throw null;
        } finally {
        }
    }

    private final String i() {
        int i = afErrorLog + 7;
        afVerboseLog = i % 128;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            AFLogger.afErrorLog(e.getMessage(), e);
        }
        if (i % 2 == 0) {
            this.AFLogger.AFKeystoreWrapper("androidIdCached", (String) null);
            INVOKESTATIC_com_appsflyer_internal_AFg1jSDK_com_ss_android_ugc_aweme_lancet_process_AnndroidIdSecureLancet_getString(this.AFKeystoreWrapper.getContentResolver(), "android_id");
            try {
                throw null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        String strAFKeystoreWrapper = this.AFLogger.AFKeystoreWrapper("androidIdCached", (String) null);
        String strINVOKESTATIC_com_appsflyer_internal_AFg1jSDK_com_ss_android_ugc_aweme_lancet_process_AnndroidIdSecureLancet_getString = INVOKESTATIC_com_appsflyer_internal_AFg1jSDK_com_ss_android_ugc_aweme_lancet_process_AnndroidIdSecureLancet_getString(this.AFKeystoreWrapper.getContentResolver(), "android_id");
        if ((strINVOKESTATIC_com_appsflyer_internal_AFg1jSDK_com_ss_android_ugc_aweme_lancet_process_AnndroidIdSecureLancet_getString != null ? ';' : 'H') == ';') {
            return strINVOKESTATIC_com_appsflyer_internal_AFg1jSDK_com_ss_android_ugc_aweme_lancet_process_AnndroidIdSecureLancet_getString;
        }
        if ((strAFKeystoreWrapper != null ? (char) 21 : 'A') != 21) {
            return null;
        }
        afErrorLog = (afVerboseLog + 61) % 128;
        return strAFKeystoreWrapper;
    }

    private boolean registerClient() {
        afErrorLog = (afVerboseLog + 59) % 128;
        if (this.AFLogger.values("appsFlyerCount")) {
            return false;
        }
        int i = afVerboseLog + 41;
        afErrorLog = i % 128;
        return i % 2 == 0;
    }

    public static String unregisterClient() throws Throwable {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        long jLLIFFJFJJ = C2204961BRm.LLIFFJFJJ(statFs, new C0WZX("dzBzEgMqT9naWU4kV1yNaEAr35CqUcZV5bJsYuleyw==", new String[]{"01c45"}));
        long jLLFF = C2204961BRm.LLFF(statFs, new C0WZX("dzBzEgMqT9naWU4kV1yNaEAr35CqUcZV5bJsYuleyw==", new String[]{"01c45"})) * jLLIFFJFJJ;
        long jLLFZ = C2204961BRm.LLFZ(statFs, new C0WZX("dzBzEgMqT9naWU4kV1yNaEAr35CqUcZV5bJsYuleyw==", new String[]{"01c45"})) * jLLIFFJFJJ;
        double dPow = Math.pow(2.0d, 20.0d);
        StringBuilder sb = new StringBuilder();
        sb.append((long) (jLLFF / dPow));
        sb.append('/');
        sb.append((long) (jLLFZ / dPow));
        String string = sb.toString();
        int i = afErrorLog + 35;
        afVerboseLog = i % 128;
        if ((i % 2 == 0 ? '\b' : ' ') != '\b') {
            return string;
        }
        try {
            throw null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }

    private final String v() {
        afVerboseLog = (afErrorLog + 109) % 128;
        File fileAFInAppEventParameterName = AFInAppEventParameterName(AFInAppEventType("ro.appsflyer.preinstall.path"));
        if (!(!AFKeystoreWrapper(fileAFInAppEventParameterName))) {
            int i = afErrorLog + 93;
            afVerboseLog = i % 128;
            fileAFInAppEventParameterName = (i % 2 == 0 ? 'M' : '\b') != '\b' ? AFInAppEventParameterName(valueOf("AF_PRE_INSTALL_PATH")) : AFInAppEventParameterName(valueOf("AF_PRE_INSTALL_PATH"));
        }
        if (AFKeystoreWrapper(fileAFInAppEventParameterName)) {
            int i2 = afVerboseLog + 37;
            afErrorLog = i2 % 128;
            if (i2 % 2 != 0) {
                AFInAppEventParameterName("/data/local/tmp/pre_install.appsflyer");
                try {
                    throw null;
                } finally {
                }
            }
            fileAFInAppEventParameterName = AFInAppEventParameterName("/data/local/tmp/pre_install.appsflyer");
        }
        if (AFKeystoreWrapper(fileAFInAppEventParameterName)) {
            fileAFInAppEventParameterName = AFInAppEventParameterName("/etc/pre_install.appsflyer");
        }
        if (AFKeystoreWrapper(fileAFInAppEventParameterName)) {
            return null;
        }
        String strValueOf = valueOf(fileAFInAppEventParameterName, this.AFKeystoreWrapper.getPackageName());
        int i3 = afVerboseLog + 97;
        afErrorLog = i3 % 128;
        if (i3 % 2 == 0) {
            return strValueOf;
        }
        try {
            throw null;
        } finally {
        }
    }

    private String valueOf() throws NoSuchAlgorithmException, CertificateException {
        afVerboseLog = (afErrorLog + 125) % 128;
        String strAFInAppEventParameterName = AFb1uSDK.AFInAppEventParameterName(C786410Ut5.N3(this.AFKeystoreWrapper).getPackageManager(), C786410Ut5.N3(this.AFKeystoreWrapper).getPackageName());
        int i = afErrorLog + 117;
        afVerboseLog = i % 128;
        if ((i % 2 == 0 ? '-' : (char) 25) == 25) {
            return strAFInAppEventParameterName;
        }
        try {
            throw null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }

    private final SimpleDateFormat values() {
        afErrorLog = (afVerboseLog + 41) % 128;
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) this.afRDLog.getValue();
        int i = afVerboseLog + 111;
        afErrorLog = i % 128;
        if (i % 2 == 0) {
            return simpleDateFormat;
        }
        try {
            throw null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }

    private String w() {
        afVerboseLog = (afErrorLog + 63) % 128;
        String string = AFKeystoreWrapper().getString("preInstallName");
        if ((string != null ? 'Q' : 'E') != 'E') {
            return string;
        }
        if (this.AFLogger.values("preInstallName")) {
            string = this.AFLogger.AFKeystoreWrapper("preInstallName", (String) null);
        } else {
            if (registerClient()) {
                int i = afErrorLog + 63;
                afVerboseLog = i % 128;
                if (i % 2 != 0 ? (string = v()) == null : (string = v()) == null) {
                    string = valueOf("AF_PRE_INSTALL_NAME");
                }
            }
            if (string != null) {
                this.AFLogger.AFInAppEventParameterName("preInstallName", string);
            }
        }
        if (string != null) {
            AFKeystoreWrapper().set("preInstallName", string);
        }
        afErrorLog = (afVerboseLog + 27) % 128;
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020 A[PHI: r3
      0x0020: PHI (r3v1 android.content.pm.PackageManager) = (r3v0 android.content.pm.PackageManager), (r3v2 android.content.pm.PackageManager) binds: [B:26:0x0050, B:12:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    @Override // com.appsflyer.internal.AFg1mSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Long AFInAppEventParameterName() throws java.lang.Throwable {
        /*
            r6 = this;
            com.appsflyer.internal.AFd1lSDK r0 = r6.force
            android.content.Context r4 = r0.AFKeystoreWrapper
            r2 = 1
            if (r4 == 0) goto L58
            r0 = 0
        L8:
            r5 = 0
            if (r0 == r2) goto L79
            int r0 = com.appsflyer.internal.AFg1jSDK.afVerboseLog
            int r1 = r0 + 73
            int r0 = r1 % 128
            com.appsflyer.internal.AFg1jSDK.afErrorLog = r0
            int r0 = r1 % 2
            if (r0 == 0) goto L56
            r0 = 0
        L18:
            if (r0 == r2) goto L46
            android.content.pm.PackageManager r3 = r4.getPackageManager()
            if (r3 == 0) goto L63
        L20:
            int r0 = com.appsflyer.internal.AFg1jSDK.afVerboseLog
            int r1 = r0 + 113
            int r0 = r1 % 128
            com.appsflyer.internal.AFg1jSDK.afErrorLog = r0
            int r0 = r1 % 2
            r2 = 22
            if (r0 == 0) goto L43
            r1 = 98
        L30:
            java.lang.String r0 = r4.getPackageName()
            if (r1 != r2) goto L5a
            android.content.pm.PackageInfo r0 = values(r3, r0)
            if (r0 == 0) goto L63
            long r0 = r0.firstInstallTime
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        L43:
            r1 = 22
            goto L30
        L46:
            android.content.pm.PackageManager r3 = r4.getPackageManager()
            r1 = 90
            if (r3 == 0) goto L53
            r0 = 16
        L50:
            if (r0 == r1) goto L63
            goto L20
        L53:
            r0 = 90
            goto L50
        L56:
            r0 = 1
            goto L18
        L58:
            r0 = 1
            goto L8
        L5a:
            values(r3, r0)
            throw r5     // Catch: java.lang.Throwable -> L5e
        L5e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            throw r0
        L63:
            int r0 = com.appsflyer.internal.AFg1jSDK.afVerboseLog
            int r1 = r0 + 57
            int r0 = r1 % 128
            com.appsflyer.internal.AFg1jSDK.afErrorLog = r0
            int r0 = r1 % 2
            r1 = 9
            if (r0 == 0) goto L76
            r0 = 63
        L73:
            if (r0 == r1) goto L79
            return r5
        L76:
            r0 = 9
            goto L73
        L79:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1jSDK.AFInAppEventParameterName():java.lang.Long");
    }

    @Override // com.appsflyer.internal.AFg1mSDK
    public final long AFInAppEventType() {
        afErrorLog = (afVerboseLog + 23) % 128;
        long jCurrentTimeMillis = System.currentTimeMillis();
        afVerboseLog = (afErrorLog + 51) % 128;
        return jCurrentTimeMillis;
    }

    private String e() {
        String string = AFKeystoreWrapper().getString("api_store_value");
        if (string == null) {
            afVerboseLog = (afErrorLog + 55) % 128;
            string = valueOf("AF_STORE");
        }
        afVerboseLog = (afErrorLog + 121) % 128;
        return string;
    }

    private final boolean force() {
        if ((!AFKeystoreWrapper().getBoolean("collectAndroidIdForceByUser", false) ? 'G' : 'F') == 'G' && !AFKeystoreWrapper().getBoolean("collectIMEIForceByUser", false)) {
            afErrorLog = (afVerboseLog + 69) % 128;
            int i = afErrorLog + 55;
            afVerboseLog = i % 128;
            char c = i % 2 == 0 ? '\'' : (char) 14;
            AFb1vSDK.AFKeystoreWrapper();
            if (c != 14) {
                AFb1vSDK.values(this.AFKeystoreWrapper);
                try {
                    throw null;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (AFb1vSDK.values(this.AFKeystoreWrapper)) {
                return false;
            }
        }
        return true;
    }

    private String AFInAppEventParameterName(SimpleDateFormat simpleDateFormat) {
        boolean z;
        char c;
        String strAFKeystoreWrapper = this.AFLogger.AFKeystoreWrapper("appsFlyerFirstInstall", (String) null);
        if (strAFKeystoreWrapper == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i = afErrorLog + 3;
            afVerboseLog = i % 128;
            if (i % 2 == 0) {
                c = '$';
            } else {
                c = '3';
            }
            if (c != '$') {
                if (registerClient()) {
                    strAFKeystoreWrapper = simpleDateFormat.format(new Date());
                } else {
                    strAFKeystoreWrapper = "";
                }
                this.AFLogger.AFInAppEventParameterName("appsFlyerFirstInstall", strAFKeystoreWrapper);
            } else {
                registerClient();
                try {
                    throw null;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        AFg1fSDK.i$default(AFLogger.INSTANCE, AFg1aSDK.GENERAL, "AppsFlyer: first launch date: ".concat(String.valueOf(strAFKeystoreWrapper)), false, 4, null);
        afErrorLog = (afVerboseLog + 59) % 128;
        return strAFKeystoreWrapper;
    }

    private final void AFLogger(Map<String, Object> map) {
        afErrorLog = (afVerboseLog + 25) % 128;
        if (!AFKeystoreWrapper().isOtherSdkStringDisabled()) {
            map.put("batteryLevel", String.valueOf(this.AFInAppEventParameterName.AFInAppEventParameterName(this.AFKeystoreWrapper).valueOf));
        }
        int i = afErrorLog + 13;
        afVerboseLog = i % 128;
        if (i % 2 == 0) {
            try {
                throw null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    private void AFLogger$LogLevel(Map<String, Object> map) {
        AFb1zSDK aFb1zSDKAFInAppEventParameterName = AFb1rSDK.AFInAppEventParameterName(this.AFKeystoreWrapper.getContentResolver());
        if (aFb1zSDKAFInAppEventParameterName != null) {
            afErrorLog = (afVerboseLog + 33) % 128;
            map.put("amazon_aid", aFb1zSDKAFInAppEventParameterName.AFInAppEventParameterName);
            map.put("amazon_aid_limit", String.valueOf(aFb1zSDKAFInAppEventParameterName.AFKeystoreWrapper));
            int i = afErrorLog + 15;
            afVerboseLog = i % 128;
            if (i % 2 == 0) {
                try {
                    throw null;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    private void AFPurchaseDetails(Map<String, Object> map) {
        int i = afErrorLog + 117;
        afVerboseLog = i % 128;
        if (i % 2 == 0) {
            try {
                throw null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        String str = this.d.AFLogger;
        if (str != null && str.length() != 0) {
            afVerboseLog = (afErrorLog + 23) % 128;
            map.put("appsflyerKey", str);
            afVerboseLog = (afErrorLog + 123) % 128;
        }
    }

    private void afDebugLog(Map<String, Object> map) {
        afErrorLog = (afVerboseLog + 27) % 128;
        map.putAll(this.v.values());
        int i = afErrorLog + 117;
        afVerboseLog = i % 128;
        if (i % 2 == 0) {
            try {
                throw null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    private void afErrorLog(Map<String, Object> map) {
        try {
            String strValueOf = AFb1kSDK.valueOf(this.force, this.AFLogger);
            if (strValueOf != null) {
                afErrorLog = (afVerboseLog + 87) % 128;
                map.put("uid", strValueOf);
                return;
            }
        } catch (Throwable th) {
        }
        int i = afErrorLog + 41;
        afVerboseLog = i % 128;
        if (i % 2 == 0) {
            try {
                throw null;
            } finally {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    private void afErrorLogForExcManagerOnly(Map<String, Object> map) {
        afErrorLog = (afVerboseLog + 45) % 128;
        if (this.AFLogger.values("is_stop_tracking_used")) {
            afVerboseLog = (afErrorLog + 75) % 128;
            map.put("istu", String.valueOf(this.AFLogger.AFInAppEventType("is_stop_tracking_used")));
            afErrorLog = (afVerboseLog + 71) % 128;
        }
    }

    public static void afInfoLog(Map<String, Object> map) {
        afVerboseLog = (afErrorLog + 93) % 128;
        Object objAFInAppEventType = AFb1cSDK.AFInAppEventType();
        String strAFKeystoreWrapper = AFb1cSDK.AFKeystoreWrapper();
        if (objAFInAppEventType != null) {
            int i = afErrorLog + 31;
            afVerboseLog = i % 128;
            if (i % 2 == 0) {
                if (strAFKeystoreWrapper == null) {
                    return;
                }
            } else if (strAFKeystoreWrapper == null) {
                return;
            }
            if (CastIntegerProtector.parseInt(strAFKeystoreWrapper) > 0) {
                map.put("reinstallCounter", strAFKeystoreWrapper);
                map.put("originalAppsflyerId", objAFInAppEventType);
                afVerboseLog = (afErrorLog + 99) % 128;
            }
        }
    }

    private void afLogForce(Map<String, Object> map) {
        int i = afErrorLog + 79;
        afVerboseLog = i % 128;
        if (i % 2 == 0) {
            AFg1nSDK.AFInAppEventParameterName(this.AFKeystoreWrapper);
            try {
                throw null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (!AFg1nSDK.AFInAppEventParameterName(this.AFKeystoreWrapper)) {
            map.put("tokenRefreshConfigured", Boolean.FALSE);
            afErrorLog = (afVerboseLog + 23) % 128;
        }
        map.put("registeredUninstall", Boolean.valueOf(AFg1nSDK.valueOf(this.AFLogger)));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void afRDLog(java.util.Map<java.lang.String, java.lang.Object> r7) {
        /*
            r6 = this;
            int r0 = com.appsflyer.internal.AFg1jSDK.afVerboseLog
            int r0 = r0 + 99
            int r0 = r0 % 128
            com.appsflyer.internal.AFg1jSDK.afErrorLog = r0
            com.appsflyer.internal.AFd1sSDK r0 = r6.unregisterClient
            java.lang.String r4 = r0.d()
            com.appsflyer.internal.AFd1qSDK r0 = r6.AFLogger
            java.lang.String r5 = values(r0, r4)
            r3 = 0
            if (r5 == 0) goto L33
            int r0 = com.appsflyer.internal.AFg1jSDK.afErrorLog
            int r1 = r0 + 87
            int r0 = r1 % 128
            com.appsflyer.internal.AFg1jSDK.afVerboseLog = r0
            int r0 = r1 % 2
            if (r0 != 0) goto L2c
            kotlin.jvm.internal.Intrinsics.LJFF(r5, r4)
            throw r3     // Catch: java.lang.Throwable -> L27
        L27:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            throw r0
        L2c:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r4)
            if (r0 != 0) goto L4e
            goto L49
        L33:
            r2 = 0
            if (r5 != 0) goto L94
            if (r4 == 0) goto L94
            int r0 = com.appsflyer.internal.AFg1jSDK.afVerboseLog
            int r1 = r0 + 117
            int r0 = r1 % 128
            com.appsflyer.internal.AFg1jSDK.afErrorLog = r0
            int r0 = r1 % 2
            if (r0 != 0) goto L94
            r0 = 1
        L45:
            if (r2 != 0) goto L49
            if (r0 == 0) goto L4e
        L49:
            java.lang.String r0 = "af_latestchannel"
            r7.put(r0, r4)
        L4e:
            java.lang.String r2 = r6.d()
            if (r2 == 0) goto L6d
            int r0 = com.appsflyer.internal.AFg1jSDK.afVerboseLog
            int r1 = r0 + 25
            int r0 = r1 % 128
            com.appsflyer.internal.AFg1jSDK.afErrorLog = r0
            int r0 = r1 % 2
            java.lang.String r1 = "af_installstore"
            if (r0 != 0) goto L9f
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r2.toLowerCase(r0)
            r7.put(r1, r0)
        L6d:
            java.lang.String r1 = r6.w()
            if (r1 == 0) goto L80
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "af_preinstall_name"
            r7.put(r0, r1)
        L80:
            java.lang.String r1 = r6.e()
            if (r1 == 0) goto L96
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "af_currentstore"
            r7.put(r0, r1)
            return
        L94:
            r0 = 0
            goto L45
        L96:
            int r0 = com.appsflyer.internal.AFg1jSDK.afErrorLog
            int r0 = r0 + 85
            int r0 = r0 % 128
            com.appsflyer.internal.AFg1jSDK.afVerboseLog = r0
            return
        L9f:
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r2.toLowerCase(r0)
            r7.put(r1, r0)
            throw r3     // Catch: java.lang.Throwable -> Lab
        Lab:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1jSDK.afRDLog(java.util.Map):void");
    }

    private void afVerboseLog(Map<String, Object> map) {
        String string = AFKeystoreWrapper().getString("sdkExtension");
        if (string != null && string.length() != 0) {
            afErrorLog = (afVerboseLog + 45) % 128;
            map.put("sdkExtension", string);
            afVerboseLog = (afErrorLog + 119) % 128;
        }
    }

    public static void afWarnLog(Map<String, Object> map) {
        boolean z;
        int i = afVerboseLog + 41;
        afErrorLog = i % 128;
        if (i % 2 != 0) {
            z = false;
        } else {
            z = true;
        }
        try {
            if (z) {
                map.put("lang", Locale.getDefault().getDisplayLanguage());
            } else {
                map.put("lang", Locale.getDefault().getDisplayLanguage());
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            map.put("lang_code", C786410Ut5.t2(Locale.getDefault()));
            afVerboseLog = (afErrorLog + 117) % 128;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            map.put("country", C2204961BRm.g0(Locale.getDefault(), new C0WZX("dzBzEgMqT9naWU4kV1yNaEAr35CqUcZV5bJsYuleyw==", new String[]{"01c45"})));
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
    }

    private void d(Map<String, Object> map) {
        boolean z;
        String string = AFKeystoreWrapper().getString("oneLinkSlug");
        String string2 = AFKeystoreWrapper().getString("onelinkVersion");
        if (string != null) {
            int i = afVerboseLog + 51;
            afErrorLog = i % 128;
            if (i % 2 != 0) {
                z = true;
            } else {
                z = false;
            }
            map.put("onelink_id", string);
            if (z) {
                try {
                    throw null;
                } finally {
                }
            }
        }
        if (string2 != null) {
            map.put("onelink_ver", string2);
        }
        int i2 = afErrorLog + 125;
        afVerboseLog = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        try {
            throw null;
        } finally {
        }
    }

    private final void e(Map<String, Object> map) {
        afErrorLog = (afVerboseLog + 21) % 128;
        AFd1vSDK.AFa1uSDK aFa1uSDKAFInAppEventParameterName = this.AFInAppEventParameterName.AFInAppEventParameterName(this.AFKeystoreWrapper);
        float f = aFa1uSDKAFInAppEventParameterName.valueOf;
        String str = aFa1uSDKAFInAppEventParameterName.values;
        map.put("btl", String.valueOf(f));
        if (str != null && 7 != 43) {
            int i = afErrorLog + 43;
            afVerboseLog = i % 128;
            if (i % 2 == 0) {
            }
            map.put("btch", str);
        }
        int i2 = afVerboseLog + 91;
        afErrorLog = i2 % 128;
        if (i2 % 2 != 0) {
            try {
                throw null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    private final void force(Map<String, Object> map) {
        UiModeManager uiModeManager = (UiModeManager) this.AFKeystoreWrapper.getSystemService(UiModeManager.class);
        if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
            int i = afErrorLog + 103;
            afVerboseLog = i % 128;
            if (i % 2 == 0) {
                map.put("tv", Boolean.TRUE);
            } else {
                map.put("tv", Boolean.TRUE);
            }
        }
    }

    private final void i(Map<String, Object> map) {
        if (AFg1dSDK.values(this.AFKeystoreWrapper)) {
            afVerboseLog = (afErrorLog + 115) % 128;
            map.put("inst_app", Boolean.TRUE);
            afErrorLog = (afVerboseLog + 51) % 128;
        }
    }

    public static void registerClient(Map<String, Object> map) {
        afVerboseLog = (afErrorLog + 75) % 128;
        Object[] objArr = new Object[1];
        a("\r\t\u0007\n㙑", 4 - TextUtils.lastIndexOf("", '0'), (byte) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 83), objArr);
        map.put(((String) objArr[0]).intern(), Build.BRAND);
        map.put("device", Build.DEVICE);
        map.put("product", Build.PRODUCT);
        map.put("sdk", String.valueOf(Build.VERSION.SDK_INT));
        map.put("model", Build.MODEL);
        map.put("deviceType", Build.TYPE);
        afErrorLog = (afVerboseLog + 93) % 128;
    }

    private void unregisterClient(Map<String, ? extends Object> map) {
        AFh1wSDK aFh1wSDK = this.e;
        HashMap map2 = new HashMap(aFh1wSDK.AFInAppEventType);
        aFh1wSDK.AFInAppEventType.clear();
        this.e.AFInAppEventParameterName.AFKeystoreWrapper("gcd");
        if (!map2.isEmpty()) {
            afErrorLog = (afVerboseLog + 125) % 128;
            int i = afVerboseLog + 85;
            afErrorLog = i % 128;
            if (i % 2 == 0) {
                AFb1vSDK.AFInAppEventParameterName(map).put("gcd", map2);
                return;
            }
            AFb1vSDK.AFInAppEventParameterName(map).put("gcd", map2);
            try {
                throw null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        afVerboseLog = (afErrorLog + 3) % 128;
    }

    private void v(Map<String, Object> map) {
        long j = this.e.v;
        if (j != 0) {
            afErrorLog = (afVerboseLog + 41) % 128;
            map.put("prev_session_dur", Long.valueOf(j));
            afErrorLog = (afVerboseLog + 63) % 128;
        }
        int i = afVerboseLog + 117;
        afErrorLog = i % 128;
        if (i % 2 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029 A[PHI: r1 r5
      0x0029: PHI (r1v4 long) = (r1v2 long), (r1v6 long) binds: [B:13:0x0053, B:8:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x0029: PHI (r5v1 long) = (r5v0 long), (r5v2 long) binds: [B:13:0x0053, B:8:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void w(java.util.Map<java.lang.String, java.lang.Object> r9) {
        /*
            r8 = this;
            int r0 = com.appsflyer.internal.AFg1jSDK.afErrorLog
            int r1 = r0 + 59
            int r0 = r1 % 128
            com.appsflyer.internal.AFg1jSDK.afVerboseLog = r0
            int r0 = r1 % 2
            r1 = 24
            if (r0 != 0) goto L59
            r0 = 82
        L10:
            r3 = 0
            java.lang.String r7 = "AppsFlyerTimePassedSincePrevLaunch"
            if (r0 == r1) goto L42
            com.appsflyer.internal.AFd1qSDK r0 = r8.AFLogger
            long r5 = r0.values(r7, r3)
            long r1 = java.lang.System.currentTimeMillis()
            com.appsflyer.internal.AFd1qSDK r0 = r8.AFLogger
            r0.AFKeystoreWrapper(r7, r1)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L56
        L29:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r1 = r1 - r5
            long r2 = r0.toSeconds(r1)
            int r0 = com.appsflyer.internal.AFg1jSDK.afVerboseLog
            int r0 = r0 + 95
            int r0 = r0 % 128
            com.appsflyer.internal.AFg1jSDK.afErrorLog = r0
        L38:
            java.lang.String r1 = "timepassedsincelastlaunch"
            java.lang.String r0 = java.lang.String.valueOf(r2)
            r9.put(r1, r0)
            return
        L42:
            com.appsflyer.internal.AFd1qSDK r0 = r8.AFLogger
            long r5 = r0.values(r7, r3)
            long r1 = java.lang.System.currentTimeMillis()
            com.appsflyer.internal.AFd1qSDK r0 = r8.AFLogger
            r0.AFKeystoreWrapper(r7, r1)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L56
            goto L29
        L56:
            r2 = -1
            goto L38
        L59:
            r0 = 24
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1jSDK.w(java.util.Map):void");
    }

    @Override // com.appsflyer.internal.AFg1mSDK
    public final void AFInAppEventType(Map<String, Object> map) {
        String[] strArr;
        String string = AFKeystoreWrapper().getString("appid");
        if (string != null) {
            map.put("appid", string);
            afVerboseLog = (afErrorLog + 21) % 128;
        }
        String string2 = AFKeystoreWrapper().getString("currencyCode");
        if (string2 != null) {
            int i = afVerboseLog + 47;
            afErrorLog = i % 128;
            int i2 = i % 2;
            string2.length();
            map.put("currency", string2);
        }
        String string3 = AFKeystoreWrapper().getString("IS_UPDATE");
        if (string3 != null) {
            afErrorLog = (afVerboseLog + 117) % 128;
            map.put("isUpdate", string3);
        }
        String string4 = AFKeystoreWrapper().getString("additionalCustomData");
        if (string4 != null) {
            map.put("customData", string4);
        }
        String string5 = AFKeystoreWrapper().getString("AppUserId");
        if (string5 != null) {
            map.put("appUserId", string5);
        }
        String string6 = AFKeystoreWrapper().getString("userEmails");
        if (string6 != null) {
            map.put("user_emails", string6);
        }
        AFd1wSDK aFd1wSDK = this.afInfoLog.AFKeystoreWrapper;
        if (aFd1wSDK != null) {
            int i3 = afVerboseLog + 105;
            afErrorLog = i3 % 128;
            if (i3 % 2 != 0) {
                strArr = aFd1wSDK.AFInAppEventType;
                if (strArr == null) {
                    return;
                }
            } else {
                strArr = aFd1wSDK.AFInAppEventType;
                if (strArr == null) {
                    return;
                }
            }
            map.put("sharing_filter", strArr);
        }
    }

    @Override // com.appsflyer.internal.AFg1mSDK
    public final void AFKeystoreWrapper(AFa1qSDK aFa1qSDK) {
        boolean zLJFF;
        if (!this.unregisterClient.unregisterClient()) {
            afVerboseLog = (afErrorLog + 111) % 128;
            AFb1vSDK.AFInAppEventParameterName(aFa1qSDK.AFInAppEventParameterName()).put("ad_ids_disabled", Boolean.TRUE);
        } else {
            AFh1uSDK aFh1uSDK = this.unregisterClient.AFInAppEventType.AFLogger;
            if (aFh1uSDK == null) {
                int i = afErrorLog + 91;
                afVerboseLog = i % 128;
                if (i % 2 == 0) {
                    return;
                } else {
                    return;
                }
            }
            String str = aFh1uSDK.d;
            if (str != null) {
                int i2 = afVerboseLog + 57;
                afErrorLog = i2 % 128;
                if (i2 % 2 == 0 ? str.length() != 0 : str.length() != 0) {
                    aFa1qSDK.AFKeystoreWrapper("gaidError", aFh1uSDK.d);
                }
            }
            String str2 = aFh1uSDK.AFKeystoreWrapper;
            if (str2 != null && aFh1uSDK.valueOf != null) {
                aFa1qSDK.AFKeystoreWrapper("advertiserId", str2);
                aFa1qSDK.AFKeystoreWrapper("advertiserIdEnabled", String.valueOf(aFh1uSDK.valueOf));
                aFa1qSDK.AFKeystoreWrapper("isGaidWithGps", String.valueOf(aFh1uSDK.AFInAppEventType));
            }
        }
        AFh1uSDK aFh1uSDK2 = this.unregisterClient.AFInAppEventType.AFLogger;
        if (aFh1uSDK2 != null) {
            int i3 = afErrorLog + 41;
            afVerboseLog = i3 % 128;
            if (i3 % 2 != 0) {
                zLJFF = Intrinsics.LJFF(aFh1uSDK2.registerClient, Boolean.TRUE);
            } else {
                Intrinsics.LJFF(aFh1uSDK2.registerClient, Boolean.TRUE);
                try {
                    throw null;
                } finally {
                }
            }
        } else {
            zLJFF = false;
        }
        aFa1qSDK.AFKeystoreWrapper("GAID_retry", String.valueOf(zLJFF));
        if (C1697810uHb.LJIIJJI(AFf1zSDK.CONVERSION, AFf1zSDK.LAUNCH).contains(aFa1qSDK.values())) {
            afErrorLog = (afVerboseLog + 7) % 128;
            AFe1mSDK aFe1mSDK = this.afInfoLog.registerClient;
            if (aFe1mSDK != null) {
                AFb1vSDK.AFInAppEventParameterName(aFa1qSDK.AFInAppEventParameterName()).put("fetchAdIdLatency", Long.valueOf(aFe1mSDK.AFKeystoreWrapper));
                return;
            }
        }
        int i4 = afVerboseLog + 55;
        afErrorLog = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        try {
            throw null;
        } finally {
        }
    }

    @Override // com.appsflyer.internal.AFg1mSDK
    public final void valueOf(Map<String, Object> map) {
        char c;
        Object c098200Yq;
        AFLogger aFLogger;
        AFg1aSDK aFg1aSDK;
        String str;
        boolean z;
        boolean z2;
        int i;
        String str2 = this.afInfoLog.values;
        if (str2 != null) {
            c = 14;
        } else {
            c = '8';
        }
        if (c == 14) {
            if (map.get("af_deeplink") != null) {
                int i2 = afVerboseLog + 105;
                afErrorLog = i2 % 128;
                if (i2 % 2 != 0) {
                    try {
                        throw null;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    jSONObject.put("isPush", "true");
                    map.put("af_deeplink", C786410Ut5.J3(jSONObject));
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c098200Yq = new C098200Yq(th2);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    int i3 = afErrorLog + 71;
                    afVerboseLog = i3 % 128;
                    if (i3 % 2 == 0) {
                        aFLogger = AFLogger.INSTANCE;
                        aFg1aSDK = AFg1aSDK.GENERAL;
                        str = "Exception while trying to create JSONObject from pushPayload";
                        z = false;
                        z2 = true;
                        i = 31;
                    } else {
                        aFLogger = AFLogger.INSTANCE;
                        aFg1aSDK = AFg1aSDK.GENERAL;
                        str = "Exception while trying to create JSONObject from pushPayload";
                        z = false;
                        z2 = false;
                        i = 120;
                    }
                    AFg1fSDK.e$default(aFLogger, aFg1aSDK, str, thM5exceptionOrNullimpl, z, z, z, z2, i, null);
                }
                C189200o6.m1boximpl(c098200Yq);
            }
        }
        this.afInfoLog.values = null;
    }

    @Override // com.appsflyer.internal.AFg1mSDK
    public final void values(AFa1qSDK aFa1qSDK) {
        afVerboseLog = (afErrorLog + 1) % 128;
        Map<String, Object> mapAFInAppEventParameterName = aFa1qSDK.AFInAppEventParameterName();
        if (aFa1qSDK.AFInAppEventType()) {
            afErrorLog = (afVerboseLog + 39) % 128;
            String str = aFa1qSDK.unregisterClient;
            AFd1pSDK aFd1pSDK = this.afInfoLog;
            AFInAppEventType(aFa1qSDK, str, aFd1pSDK.valueOf, aFd1pSDK.AFInAppEventParameterName);
        } else if (!(aFa1qSDK instanceof AFh1kSDK)) {
            AFKeystoreWrapper(mapAFInAppEventParameterName, aFa1qSDK.e);
            afErrorLog = (afVerboseLog + 41) % 128;
        }
        AFPurchaseDetails(mapAFInAppEventParameterName);
        afInfoLog(mapAFInAppEventParameterName);
        afDebugLog(mapAFInAppEventParameterName);
        afVerboseLog(mapAFInAppEventParameterName);
        afErrorLog(mapAFInAppEventParameterName);
        values(mapAFInAppEventParameterName, aFa1qSDK.AFInAppEventType());
        afLogForce(mapAFInAppEventParameterName);
        afErrorLogForExcManagerOnly(mapAFInAppEventParameterName);
        AFInAppEventParameterName(mapAFInAppEventParameterName, aFa1qSDK);
        mapAFInAppEventParameterName.put("af_events_api", "1");
    }

    public static File AFInAppEventParameterName(String str) {
        char c;
        boolean z;
        if (str != null) {
            c = '_';
        } else {
            c = 'U';
        }
        if (c != 'U') {
            afErrorLog = (afVerboseLog + 101) % 128;
            try {
                boolean z2 = false;
                if (a0.LJLIIIL(str).toString().length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    afErrorLog = (afVerboseLog + 79) % 128;
                } else {
                    afErrorLog = (afVerboseLog + 125) % 128;
                    z2 = true;
                }
                if (z2) {
                    return new C0VSJ(a0.LJLIIIL(str).toString());
                }
                return null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                AFLogger.afErrorLog(th.getMessage(), th);
                return null;
            }
        }
        return null;
    }

    private final void AFKeystoreWrapper(Map<String, Object> map) {
        char c;
        PackageInfo packageInfoY3;
        int i = afErrorLog + 55;
        afVerboseLog = i % 128;
        if (i % 2 == 0) {
            c = 'H';
        } else {
            c = 'b';
        }
        try {
            if (c != 'H') {
                packageInfoY3 = C786410Ut5.Y3(this.AFKeystoreWrapper.getPackageManager(), this.AFKeystoreWrapper.getPackageName(), 0);
                if (packageInfoY3.versionCode > this.AFLogger.valueOf("versionCode", 0)) {
                    afErrorLog = (afVerboseLog + 117) % 128;
                    this.AFLogger.AFInAppEventParameterName("versionCode", packageInfoY3.versionCode);
                    afErrorLog = (afVerboseLog + 7) % 128;
                }
            } else {
                packageInfoY3 = C786410Ut5.Y3(this.AFKeystoreWrapper.getPackageManager(), this.AFKeystoreWrapper.getPackageName(), 0);
                if (packageInfoY3.versionCode > this.AFLogger.valueOf("versionCode", 1)) {
                    afErrorLog = (afVerboseLog + 117) % 128;
                    this.AFLogger.AFInAppEventParameterName("versionCode", packageInfoY3.versionCode);
                    afErrorLog = (afVerboseLog + 7) % 128;
                }
            }
            map.put("app_version_code", String.valueOf(packageInfoY3.versionCode));
            Context context = this.unregisterClient.valueOf.AFKeystoreWrapper;
            map.put("app_version_name", AFb1uSDK.AFInAppEventType(context, context.getPackageName()));
            map.put("targetSDKver", Integer.valueOf(this.unregisterClient.valueOf.AFKeystoreWrapper.getApplicationInfo().targetSdkVersion));
            long j = packageInfoY3.firstInstallTime;
            long j2 = packageInfoY3.lastUpdateTime;
            map.put("date1", values().format(new Date(j)));
            map.put("date2", values().format(new Date(j2)));
            Object[] objArr = new Object[1];
            a("\u0000\u0004\u0006\u0001\u000e\t\u0007\u0005\b\t\u0006\u000f\u0005\u000e㘉", TextUtils.getOffsetAfter("", 0) + 15, (byte) (10 - View.resolveSize(0, 0)), objArr);
            map.put(((String) objArr[0]).intern(), AFInAppEventParameterName(values()));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // com.appsflyer.internal.AFg1mSDK
    public final void AFInAppEventType(AFa1qSDK aFa1qSDK) {
        afErrorLog = (afVerboseLog + 9) % 128;
        Map<String, Object> mapAFInAppEventParameterName = aFa1qSDK.AFInAppEventParameterName();
        AFInAppEventType(mapAFInAppEventParameterName, aFa1qSDK.AFInAppEventType());
        registerClient(mapAFInAppEventParameterName);
        afWarnLog(mapAFInAppEventParameterName);
        values(mapAFInAppEventParameterName);
        AFInAppEventParameterName(mapAFInAppEventParameterName, this.afInfoLog.AFInAppEventType);
        AFLogger$LogLevel(mapAFInAppEventParameterName);
        mapAFInAppEventParameterName.put("cell", C2097608Jq.LJIIIIZZ(new Pair("mcc", Integer.valueOf(this.AFKeystoreWrapper.getResources().getConfiguration().mcc)), new Pair("mnc", Integer.valueOf(this.AFKeystoreWrapper.getResources().getConfiguration().mnc))));
        mapAFInAppEventParameterName.put("sig", valueOf());
        mapAFInAppEventParameterName.put("last_boot_time", Long.valueOf(AFLogger()));
        mapAFInAppEventParameterName.put("disk", unregisterClient());
        int i = afErrorLog + 81;
        afVerboseLog = i % 128;
        if (i % 2 == 0) {
            try {
                throw null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.appsflyer.internal.AFg1mSDK
    public final void valueOf(AFa1qSDK aFa1qSDK) {
        Map<String, Object> mapAFInAppEventParameterName = aFa1qSDK.AFInAppEventParameterName();
        mapAFInAppEventParameterName.put("open_referrer", aFa1qSDK.valueOf);
        String str = aFa1qSDK.d;
        if (str != null) {
            int i = afErrorLog + 37;
            afVerboseLog = i % 128;
            if (i % 2 == 0 && 39 == 39) {
                if (a0.LJJJIL(str)) {
                    return;
                }
            } else if (a0.LJJJIL(str)) {
                return;
            }
            int i2 = afVerboseLog + 79;
            afErrorLog = i2 % 128;
            if (i2 % 2 == 0) {
                mapAFInAppEventParameterName.put("af_web_referrer", aFa1qSDK.d);
                return;
            }
            mapAFInAppEventParameterName.put("af_web_referrer", aFa1qSDK.d);
            try {
                throw null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.appsflyer.internal.AFg1mSDK
    public final void values(Map<String, Object> map) {
        AFi1wSDK aFi1wSDKAFInAppEventType;
        AFi1xSDK aFi1xSDK = this.registerClient.valueOf;
        if (aFi1xSDK != null && (aFi1wSDKAFInAppEventType = aFi1xSDK.AFInAppEventType()) != null) {
            map.put("network", aFi1wSDKAFInAppEventType.AFInAppEventParameterName);
            map.put("ivc", Boolean.valueOf(aFi1wSDKAFInAppEventType.values()));
            if (!AFKeystoreWrapper().getBoolean("disableCollectNetworkData", false)) {
                String str = aFi1wSDKAFInAppEventType.AFKeystoreWrapper;
                if (str != null) {
                    map.put("operator", str);
                }
                String str2 = aFi1wSDKAFInAppEventType.values;
                if (str2 != null) {
                    map.put("carrier", str2);
                    afErrorLog = (afVerboseLog + 71) % 128;
                    return;
                }
                return;
            }
            return;
        }
        afErrorLog = (afVerboseLog + 61) % 128;
    }

    private final void AFInAppEventParameterName(Map<String, Object> map) {
        try {
            long j = C786410Ut5.Y3(this.AFKeystoreWrapper.getPackageManager(), this.AFKeystoreWrapper.getPackageName(), 0).firstInstallTime;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            map.put("installDate", simpleDateFormat.format(new Date(j)));
            int i = afErrorLog + 19;
            afVerboseLog = i % 128;
            if (i % 2 == 0) {
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static String AFInAppEventType(String str) {
        afErrorLog = (afVerboseLog + 73) % 128;
        try {
            Object objInvoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            if (objInvoke != null) {
                String str2 = (String) objInvoke;
                afErrorLog = (afVerboseLog + 35) % 128;
                return str2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            AFLogger.afErrorLog(th.getMessage(), th);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String AFKeystoreWrapper(java.lang.String r7) {
        /*
            r6 = this;
            int r0 = com.appsflyer.internal.AFg1jSDK.afVerboseLog
            int r1 = r0 + 93
            int r0 = r1 % 128
            com.appsflyer.internal.AFg1jSDK.afErrorLog = r0
            int r0 = r1 % 2
            r5 = 0
            java.lang.String r1 = "collectAndroidId"
            r4 = 39
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L32
            com.appsflyer.AppsFlyerProperties r0 = r6.AFKeystoreWrapper()
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 == 0) goto L2f
            r0 = 39
        L1f:
            if (r0 == r4) goto L42
        L21:
            if (r7 != 0) goto L24
            r3 = 1
        L24:
            if (r3 == r2) goto L84
            int r0 = com.appsflyer.internal.AFg1jSDK.afErrorLog
            int r0 = r0 + 99
            int r0 = r0 % 128
            com.appsflyer.internal.AFg1jSDK.afVerboseLog = r0
            return r7
        L2f:
            r0 = 80
            goto L1f
        L32:
            com.appsflyer.AppsFlyerProperties r0 = r6.AFKeystoreWrapper()
            boolean r0 = r0.getBoolean(r1, r3)
            if (r0 == 0) goto L40
            r0 = 0
        L3d:
            if (r0 == 0) goto L42
            goto L21
        L40:
            r0 = 1
            goto L3d
        L42:
            if (r7 == 0) goto L62
            int r0 = com.appsflyer.internal.AFg1jSDK.afVerboseLog
            int r1 = r0 + 11
            int r0 = r1 % 128
            com.appsflyer.internal.AFg1jSDK.afErrorLog = r0
            int r0 = r1 % 2
            r1 = 12
            if (r0 == 0) goto L81
            r0 = 12
        L54:
            if (r0 == r1) goto L78
            int r1 = r7.length()
            r0 = 87
            if (r1 == 0) goto L60
            r4 = 87
        L60:
            if (r4 == r0) goto L7f
        L62:
            r0 = 1
        L63:
            if (r0 == 0) goto L76
            r0 = 1
        L66:
            if (r0 == 0) goto L21
            boolean r0 = r6.force()
            if (r0 == 0) goto L6f
            r3 = 1
        L6f:
            if (r3 != r2) goto L84
            java.lang.String r7 = r6.i()
            return r7
        L76:
            r0 = 0
            goto L66
        L78:
            int r0 = r7.length()
            if (r0 != 0) goto L7f
            goto L62
        L7f:
            r0 = 0
            goto L63
        L81:
            r0 = 36
            goto L54
        L84:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1jSDK.AFKeystoreWrapper(java.lang.String):java.lang.String");
    }

    private final String valueOf(String str) {
        afErrorLog = (afVerboseLog + 3) % 128;
        String strAFInAppEventType = this.unregisterClient.AFInAppEventType(str);
        afVerboseLog = (afErrorLog + 73) % 128;
        return strAFInAppEventType;
    }

    public static boolean AFKeystoreWrapper(File file) {
        int i = afErrorLog + 31;
        int i2 = i % 128;
        afVerboseLog = i2;
        if (i % 2 == 0) {
            try {
                throw null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (file != null) {
            int i3 = i2 + 65;
            afErrorLog = i3 % 128;
            int i4 = i3 % 2;
            boolean zExists = file.exists();
            if (i4 != 0) {
                if (!zExists) {
                }
            } else if (!zExists) {
                return true;
            }
            return false;
        }
        return true;
    }

    private void AFInAppEventParameterName(Map<String, Object> map, String str) {
        if (AFKeystoreWrapper().getBoolean("deviceTrackingDisabled", false)) {
            int i = afVerboseLog + 67;
            afErrorLog = i % 128;
            if (i % 2 != 0) {
                map.put("deviceTrackingDisabled", "true");
                return;
            } else {
                map.put("deviceTrackingDisabled", "true");
                return;
            }
        }
        String strAFInAppEventParameterName = this.d.AFInAppEventParameterName(this.AFLogger);
        if (strAFInAppEventParameterName != null && strAFInAppEventParameterName.length() != 0) {
            afErrorLog = (afVerboseLog + 5) % 128;
            int i2 = afVerboseLog + 59;
            afErrorLog = i2 % 128;
            if (i2 % 2 == 0) {
                map.put("imei", strAFInAppEventParameterName);
            } else {
                map.put("imei", strAFInAppEventParameterName);
                try {
                    throw null;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        String strAFKeystoreWrapper = AFKeystoreWrapper(str);
        if (strAFKeystoreWrapper != null) {
            afVerboseLog = (afErrorLog + 49) % 128;
            this.AFLogger.AFInAppEventParameterName("androidIdCached", strAFKeystoreWrapper);
            map.put("android_id", strAFKeystoreWrapper);
        }
        AFb1zSDK aFb1zSDKAFInAppEventType = AFb1rSDK.AFInAppEventType(this.AFKeystoreWrapper);
        if (aFb1zSDKAFInAppEventType != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("isManual", aFb1zSDKAFInAppEventType.values);
            linkedHashMap.put("val", aFb1zSDKAFInAppEventType.AFInAppEventParameterName);
            Boolean bool = aFb1zSDKAFInAppEventType.AFKeystoreWrapper;
            if (bool != null) {
                linkedHashMap.put("isLat", bool);
            }
            map.put("oaid", linkedHashMap);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void AFInAppEventType(java.util.Map<java.lang.String, java.lang.Object> r7, boolean r8) {
        /*
            r6 = this;
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r0 = "ro.product.cpu.abi"
            java.lang.String r1 = AFInAppEventType(r0)
            java.lang.String r0 = "cpu_abi"
            r2.put(r0, r1)
            java.lang.String r0 = "ro.product.cpu.abi2"
            java.lang.String r1 = AFInAppEventType(r0)
            java.lang.String r0 = "cpu_abi2"
            r2.put(r0, r1)
            java.lang.String r0 = "os.arch"
            java.lang.String r1 = AFInAppEventType(r0)
            java.lang.String r0 = "arch"
            r2.put(r0, r1)
            java.lang.String r0 = "ro.build.display.id"
            java.lang.String r1 = AFInAppEventType(r0)
            java.lang.String r0 = "build_display_id"
            r2.put(r0, r1)
            if (r8 == 0) goto L61
            int r0 = com.appsflyer.internal.AFg1jSDK.afErrorLog
            int r5 = r0 + 5
            int r0 = r5 % 128
            com.appsflyer.internal.AFg1jSDK.afVerboseLog = r0
            r4 = 2
            int r5 = r5 % r4
            r1 = 0
            java.lang.String r3 = "appsFlyerCount"
            if (r5 != 0) goto L74
            r6.e(r2)
            com.appsflyer.internal.AFd1sSDK r0 = r6.unregisterClient
            com.appsflyer.internal.AFd1qSDK r1 = r0.AFKeystoreWrapper
            r0 = 1
            int r0 = r1.valueOf(r3, r0)
            if (r0 > r4) goto L61
        L50:
            com.appsflyer.internal.AFi1cSDK r0 = r6.values
            java.util.Map r0 = r0.valueOf()
            r2.putAll(r0)
            int r0 = com.appsflyer.internal.AFg1jSDK.afVerboseLog
            int r0 = r0 + 27
            int r0 = r0 % 128
            com.appsflyer.internal.AFg1jSDK.afErrorLog = r0
        L61:
            com.appsflyer.internal.AFa1bSDK r1 = r6.AFInAppEventType
            android.content.Context r0 = r6.AFKeystoreWrapper
            java.util.Map r1 = r1.valueOf(r0)
            java.lang.String r0 = "dim"
            r2.put(r0, r1)
            java.lang.String r0 = "deviceData"
            r7.put(r0, r2)
            return
        L74:
            r6.e(r2)
            com.appsflyer.internal.AFd1sSDK r0 = r6.unregisterClient
            com.appsflyer.internal.AFd1qSDK r0 = r0.AFKeystoreWrapper
            int r0 = r0.valueOf(r3, r1)
            if (r0 > r4) goto L61
            goto L50
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1jSDK.AFInAppEventType(java.util.Map, boolean):void");
    }

    private void AFKeystoreWrapper(Map<String, Object> map, String str) {
        afErrorLog = (afVerboseLog + 43) % 128;
        try {
            String strAFKeystoreWrapper = this.AFLogger.AFKeystoreWrapper("prev_event_name", (String) null);
            if (strAFKeystoreWrapper != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("prev_event_timestamp", this.AFLogger.values("prev_event_timestamp", -1L));
                jSONObject.put("prev_event_name", strAFKeystoreWrapper);
                map.put("prev_event", jSONObject);
            }
            this.AFLogger.AFInAppEventParameterName("prev_event_name", str);
            this.AFLogger.AFKeystoreWrapper("prev_event_timestamp", System.currentTimeMillis());
            afVerboseLog = (afErrorLog + 59) % 128;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static String INVOKESTATIC_com_appsflyer_internal_AFg1jSDK_com_ss_android_ugc_aweme_lancet_process_AnndroidIdSecureLancet_getString(ContentResolver contentResolver, String str) {
        if (TextUtils.equals(str, "android_id")) {
            if (C10EU.LJIILIIL() && C20123713oZ.LIZ()) {
                return "";
            }
            if (TextUtils.isEmpty(C20123713oZ.LIZ)) {
                C20123713oZ.LIZ = C2204961BRm.LLIIIL(contentResolver, str, new C0WZX("dzBzEgMqT9naWU4kV1yNaEAr35CqUcZV5bJsYuleyw==", new String[]{"01c45"}));
            }
            return C20123713oZ.LIZ;
        }
        return C2204961BRm.LLIIIL(contentResolver, str, new C0WZX("dzBzEgMqT9naWU4kV1yNaEAr35CqUcZV5bJsYuleyw==", new String[]{"01c45"}));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0076 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String valueOf(java.io.File r5, java.lang.String r6) {
        /*
            int r1 = com.appsflyer.internal.AFg1jSDK.afVerboseLog
            int r0 = r1 + 9
            int r0 = r0 % 128
            com.appsflyer.internal.AFg1jSDK.afErrorLog = r0
            r2 = 1
            if (r5 != 0) goto L10
            r0 = 0
        Lc:
            r4 = 0
            if (r0 == 0) goto L8d
            goto L12
        L10:
            r0 = 1
            goto Lc
        L12:
            java.util.Properties r2 = new java.util.Properties     // Catch: java.lang.Throwable -> L41 java.io.FileNotFoundException -> L53
            r2.<init>()     // Catch: java.lang.Throwable -> L41 java.io.FileNotFoundException -> L53
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L41 java.io.FileNotFoundException -> L53
            X.0VSP r1 = new X.0VSP     // Catch: java.lang.Throwable -> L41 java.io.FileNotFoundException -> L53
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L41 java.io.FileNotFoundException -> L53
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()     // Catch: java.lang.Throwable -> L41 java.io.FileNotFoundException -> L53
            r3.<init>(r1, r0)     // Catch: java.lang.Throwable -> L41 java.io.FileNotFoundException -> L53
            r2.load(r3)     // Catch: java.lang.Throwable -> L3d java.io.FileNotFoundException -> L3f
            java.lang.String r2 = r2.getProperty(r6)     // Catch: java.lang.Throwable -> L3d java.io.FileNotFoundException -> L3f
            r3.close()     // Catch: java.lang.Throwable -> L30
            goto L3c
        L30:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.String r0 = r1.getMessage()
            com.appsflyer.AFLogger.afErrorLog(r0, r1)
            return r2
        L3c:
            return r2
        L3d:
            r1 = move-exception
            goto L43
        L3f:
            r0 = move-exception
            goto L55
        L41:
            r1 = move-exception
            r3 = r4
        L43:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L77
            java.lang.String r0 = r1.getMessage()     // Catch: java.lang.Throwable -> L77
            com.appsflyer.AFLogger.afErrorLog(r0, r1)     // Catch: java.lang.Throwable -> L77
            if (r3 == 0) goto L69
            r3.close()     // Catch: java.lang.Throwable -> L5e
            goto L69
        L53:
            r0 = move-exception
            r3 = r4
        L55:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L77
            if (r3 == 0) goto L69
            r3.close()     // Catch: java.lang.Throwable -> L5e
            goto L69
        L5e:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.String r0 = r1.getMessage()
            com.appsflyer.AFLogger.afErrorLog(r0, r1)
        L69:
            int r0 = com.appsflyer.internal.AFg1jSDK.afErrorLog
            int r1 = r0 + 97
            int r0 = r1 % 128
            com.appsflyer.internal.AFg1jSDK.afVerboseLog = r0
            int r0 = r1 % 2
            if (r0 != 0) goto L76
            return r4
        L76:
            return r4
        L77:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            if (r3 == 0) goto L8c
            r3.close()     // Catch: java.lang.Throwable -> L81
            throw r2
        L81:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.String r0 = r1.getMessage()
            com.appsflyer.AFLogger.afErrorLog(r0, r1)
        L8c:
            throw r2
        L8d:
            int r1 = r1 + 45
            int r0 = r1 % 128
            com.appsflyer.internal.AFg1jSDK.afErrorLog = r0
            int r0 = r1 % 2
            if (r0 == 0) goto L98
            r2 = 0
        L98:
            if (r2 == 0) goto L9b
            return r4
        L9b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1jSDK.valueOf(java.io.File, java.lang.String):java.lang.String");
    }

    public static PackageInfo values(PackageManager packageManager, String str) throws Throwable {
        int i = afVerboseLog + 59;
        afErrorLog = i % 128;
        if (i % 2 == 0 ? Build.VERSION.SDK_INT >= 33 : Build.VERSION.SDK_INT >= 28) {
            PackageInfo packageInfoLJJJJLI = C2204961BRm.LJJJJLI(packageManager, str, PackageManager.PackageInfoFlags.of(0L), new C0WZX("dzBzEgMqT9naWU4kV1yNaEAr35CqUcZV5bJsYuleyw==", new String[]{"01c45"}));
            afVerboseLog = (afErrorLog + 77) % 128;
            return packageInfoLJJJJLI;
        }
        return C786410Ut5.Y3(packageManager, str, 0);
    }

    public static void AFInAppEventParameterName(Map<String, Object> map, AFa1qSDK aFa1qSDK) {
        String str = aFa1qSDK.e;
        if (str != null) {
            map.put("eventName", str);
            Map map2 = aFa1qSDK.AFInAppEventParameterName;
            if (map2 == null) {
                map2 = new HashMap();
            }
            map.put("eventValue", C786410Ut5.J3(new JSONObject(map2)));
        }
    }

    private void AFInAppEventType(Map<String, Object> map, String str) {
        char c;
        boolean z;
        afVerboseLog = (afErrorLog + 95) % 128;
        if (str != null) {
            c = '/';
        } else {
            c = 20;
        }
        if (c != 20 && str.length() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            map.put("referrer", str);
        }
        String strAFKeystoreWrapper = this.AFLogger.AFKeystoreWrapper("extraReferrers", (String) null);
        if (strAFKeystoreWrapper != null) {
            int i = afVerboseLog + 93;
            afErrorLog = i % 128;
            if (i % 2 != 0) {
                map.put("extraReferrers", strAFKeystoreWrapper);
            } else {
                map.put("extraReferrers", strAFKeystoreWrapper);
            }
        }
        String referrer = AFKeystoreWrapper().getReferrer(this.AFLogger);
        if (referrer != null && referrer.length() != 0) {
            if (map.get("referrer") == null) {
                int i2 = afVerboseLog + 51;
                afErrorLog = i2 % 128;
                if (i2 % 2 != 0) {
                }
                map.put("referrer", referrer);
                return;
            }
            return;
        }
        afErrorLog = (afVerboseLog + 25) % 128;
    }

    private void valueOf(Map<String, Object> map, Function0<String> function0) {
        boolean z;
        String strInvoke;
        afVerboseLog = (afErrorLog + 33) % 128;
        if (AFKeystoreWrapper().getBoolean("collectFacebookAttrId", true)) {
            int i = afErrorLog + 103;
            afVerboseLog = i % 128;
            if (i % 2 == 0) {
                z = true;
            } else {
                z = false;
            }
            try {
                if (!z) {
                    C786410Ut5.V3(this.AFKeystoreWrapper.getPackageManager(), "com.facebook.katana", 0);
                    strInvoke = function0.invoke();
                } else {
                    C786410Ut5.V3(this.AFKeystoreWrapper.getPackageManager(), "com.facebook.katana", 1);
                    strInvoke = function0.invoke();
                }
                String str = strInvoke;
                if (str != null) {
                    afErrorLog = (afVerboseLog + 25) % 128;
                    map.put("fb", str);
                }
            } catch (PackageManager.NameNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
                AFLogger.afErrorLogForExcManagerOnly("com.facebook.katana not found", e, true);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    private void values(Map<String, Object> map, boolean z) {
        map.put("platformextension", this.w.valueOf());
        if (z) {
            afVerboseLog = (afErrorLog + 75) % 128;
            map.put("platform_extension_v2", this.valueOf.values());
            afVerboseLog = (afErrorLog + 13) % 128;
        }
    }

    public static void valueOf(Map<String, Object> map, boolean z) {
        boolean z2;
        int i = afErrorLog + 71;
        afVerboseLog = i % 128;
        if (i % 2 == 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        map.put("af_preinstalled", String.valueOf(z));
        if (z2) {
            int i2 = afErrorLog + 105;
            afVerboseLog = i2 % 128;
            if (i2 % 2 == 0) {
                try {
                    throw null;
                } finally {
                }
            }
            return;
        }
        try {
            throw null;
        } finally {
        }
    }

    public static String values(AFd1qSDK aFd1qSDK, String str) {
        String strAFKeystoreWrapper = aFd1qSDK.AFKeystoreWrapper("CACHED_CHANNEL", (String) null);
        if (strAFKeystoreWrapper != null) {
            afVerboseLog = (afErrorLog + 39) % 128;
            return strAFKeystoreWrapper;
        }
        aFd1qSDK.AFInAppEventParameterName("CACHED_CHANNEL", str);
        afVerboseLog = (afErrorLog + 97) % 128;
        return str;
    }

    public static void valueOf(Map<String, Object> map, String str) {
        if (str != null) {
            afVerboseLog = (afErrorLog + 125) % 128;
            map.put("phone", str);
            afVerboseLog = (afErrorLog + 81) % 128;
        }
    }

    @Override // com.appsflyer.internal.AFg1mSDK
    public final void AFInAppEventType(Map<String, Object> map, boolean z, Function0<String> function0) {
        afVerboseLog = (afErrorLog + 45) % 128;
        AFInAppEventParameterName(map);
        AFKeystoreWrapper(map);
        afRDLog(map);
        valueOf(map, z);
        valueOf(map, function0);
        int i = afErrorLog + 45;
        afVerboseLog = i % 128;
        if (i % 2 == 0) {
            try {
                throw null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.appsflyer.internal.AFg1mSDK
    public final void valueOf(Map<String, Object> map, int i, int i2) {
        boolean z;
        int i3 = afErrorLog + 57;
        afVerboseLog = i3 % 128;
        if (i3 % 2 != 0) {
            map.put("counter", String.valueOf(i));
            map.put("iaecounter", String.valueOf(i2));
            if (!afInfoLog()) {
                z = true;
            } else {
                z = false;
            }
            map.put("isFirstCall", String.valueOf(z));
            afVerboseLog = (afErrorLog + 95) % 128;
            return;
        }
        map.put("counter", String.valueOf(i));
        map.put("iaecounter", String.valueOf(i2));
        afInfoLog();
        try {
            throw null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }

    private void AFInAppEventType(AFa1qSDK aFa1qSDK, String str, String str2, AFc1cSDK aFc1cSDK) {
        Map<String, Object> mapAFInAppEventParameterName = aFa1qSDK.AFInAppEventParameterName();
        if (aFa1qSDK.values() == AFf1zSDK.CONVERSION) {
            afErrorLog = (afVerboseLog + 115) % 128;
            AFLogger(mapAFInAppEventParameterName);
            force(mapAFInAppEventParameterName);
            i(mapAFInAppEventParameterName);
            AFb1cSDK.valueOf(this.force, this.AFLogger);
        }
        w(mapAFInAppEventParameterName);
        d(mapAFInAppEventParameterName);
        unregisterClient(mapAFInAppEventParameterName);
        valueOf(mapAFInAppEventParameterName, str2);
        AFInAppEventType(mapAFInAppEventParameterName, str);
        v(mapAFInAppEventParameterName);
        if (aFc1cSDK != null) {
            aFc1cSDK.values(mapAFInAppEventParameterName);
            int i = afErrorLog + 35;
            afVerboseLog = i % 128;
            if (i % 2 == 0) {
                try {
                    throw null;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public static void a(String str, int i, byte b, Object[] objArr) {
        int i2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        AFk1wSDK aFk1wSDK = new AFk1wSDK();
        char[] cArr2 = afDebugLog;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                cArr3[i3] = (char) (((long) cArr2[i3]) ^ 8472772857875446112L);
            }
            $10 = ($11 + 9) % 128;
            cArr2 = cArr3;
        }
        char c = (char) (8472772857875446112L ^ ((long) afWarnLog));
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i4 = $10 + 57;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                i2 = i + 103;
                cArr4[i2] = (char) (cArr[i2] / b);
            } else {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            aFk1wSDK.AFInAppEventType = 0;
            while (true) {
                int i5 = aFk1wSDK.AFInAppEventType;
                if (i5 >= i2) {
                    break;
                }
                char c2 = cArr[i5];
                aFk1wSDK.AFInAppEventParameterName = c2;
                char c3 = cArr[i5 + 1];
                aFk1wSDK.AFKeystoreWrapper = c3;
                if (c2 == c3) {
                    cArr4[i5] = (char) (c2 - b);
                    cArr4[i5 + 1] = (char) (c3 - b);
                    $11 = ($10 + 9) % 128;
                } else {
                    int i6 = c2 / c;
                    aFk1wSDK.valueOf = i6;
                    int i7 = c2 % c;
                    aFk1wSDK.registerClient = i7;
                    int i8 = c3 / c;
                    aFk1wSDK.values = i8;
                    int i9 = c3 % c;
                    aFk1wSDK.unregisterClient = i9;
                    if (i7 == i9) {
                        $11 = ($10 + 67) % 128;
                        int i10 = ((i6 + c) - 1) % c;
                        aFk1wSDK.valueOf = i10;
                        int i11 = ((i8 + c) - 1) % c;
                        aFk1wSDK.values = i11;
                        cArr4[i5] = cArr2[(i10 * c) + i7];
                        cArr4[i5 + 1] = cArr2[(i11 * c) + i9];
                    } else if (i6 == i8) {
                        int i12 = ((i7 + c) - 1) % c;
                        aFk1wSDK.registerClient = i12;
                        int i13 = ((i9 + c) - 1) % c;
                        aFk1wSDK.unregisterClient = i13;
                        cArr4[i5] = cArr2[(i6 * c) + i12];
                        cArr4[i5 + 1] = cArr2[(i8 * c) + i13];
                    } else {
                        cArr4[i5] = cArr2[(i6 * c) + i9];
                        cArr4[i5 + 1] = cArr2[(i8 * c) + i7];
                    }
                }
                aFk1wSDK.AFInAppEventType = i5 + 2;
            }
        }
        for (int i14 = 0; i14 < i; i14++) {
            cArr4[i14] = (char) (cArr4[i14] ^ 13722);
        }
        String str2 = new String(cArr4);
        $11 = ($10 + 83) % 128;
        objArr[0] = str2;
    }

    public AFg1jSDK(Context context, AFi1sSDK aFi1sSDK, AFd1vSDK aFd1vSDK, AFi1cSDK aFi1cSDK, AFa1bSDK aFa1bSDK, AFh1wSDK aFh1wSDK, AFd1qSDK aFd1qSDK, AFd1sSDK aFd1sSDK, AFh1cSDK aFh1cSDK, AFg1wSDK aFg1wSDK, AFb1hSDK aFb1hSDK, AFd1lSDK aFd1lSDK, AFg1rSDK aFg1rSDK, AFd1pSDK aFd1pSDK) {
        this.AFKeystoreWrapper = context;
        this.valueOf = aFi1sSDK;
        this.AFInAppEventParameterName = aFd1vSDK;
        this.values = aFi1cSDK;
        this.AFInAppEventType = aFa1bSDK;
        this.e = aFh1wSDK;
        this.AFLogger = aFd1qSDK;
        this.unregisterClient = aFd1sSDK;
        this.registerClient = aFh1cSDK;
        this.d = aFg1wSDK;
        this.w = aFb1hSDK;
        this.force = aFd1lSDK;
        this.v = aFg1rSDK;
        this.afInfoLog = aFd1pSDK;
    }
}
