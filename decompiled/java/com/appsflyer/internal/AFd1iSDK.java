package com.appsflyer.internal;

import X.C01GW;
import X.C09AY;
import X.C1C7U;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C452501pT;
import X.C786410Ut5;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1iSDK;
import com.appsflyer.internal.AFd1jSDK;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public final class AFd1iSDK implements AFd1jSDK {
    public static int $10 = 0;
    public static int $11 = 1;
    public static long afInfoLog = -3294779024785760528L;
    public static int force = 680283152;
    public static char i = 19472;
    public static int v = 0;
    public static int w = 1;
    public AFd1kSDK AFKeystoreWrapper;
    public AFd1jSDK.AFa1zSDK AFLogger;
    public final C01GW values = C452501pT.LIZIZ(new AnonymousClass1());
    public final C01GW AFInAppEventType = C452501pT.LIZIZ(new AnonymousClass5());
    public final C01GW AFInAppEventParameterName = C452501pT.LIZIZ(new AnonymousClass3());
    public final C01GW valueOf = C452501pT.LIZIZ(new AnonymousClass8());
    public final C01GW unregisterClient = C452501pT.LIZIZ(new AnonymousClass2());
    public final String registerClient = "6.14.0";
    public final C01GW d = C452501pT.LIZIZ(new AnonymousClass4());
    public final C01GW e = C452501pT.LIZIZ(new AnonymousClass7());

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1iSDK$1, reason: invalid class name */
    public final class AnonymousClass1 extends C09AY implements Function0<AFf1bSDK> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: valueOf, reason: merged with bridge method [inline-methods] */
        public final AFf1bSDK invoke() {
            return AFd1iSDK.AFKeystoreWrapper(AFd1iSDK.this).registerClient();
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1iSDK$2, reason: invalid class name */
    public final class AnonymousClass2 extends C09AY implements Function0<ExecutorService> {
        public AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: valueOf, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            return AFd1iSDK.AFKeystoreWrapper(AFd1iSDK.this).values();
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1iSDK$3, reason: invalid class name */
    public final class AnonymousClass3 extends C09AY implements Function0<AFd1qSDK> {
        public AnonymousClass3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: values, reason: merged with bridge method [inline-methods] */
        public final AFd1qSDK invoke() {
            return AFd1iSDK.AFKeystoreWrapper(AFd1iSDK.this).valueOf();
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1iSDK$4, reason: invalid class name */
    public final class AnonymousClass4 extends C09AY implements Function0<AFd1hSDK> {
        public AnonymousClass4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: AFInAppEventParameterName, reason: merged with bridge method [inline-methods] */
        public final AFd1hSDK invoke() {
            return new AFd1hSDK(AFd1iSDK.AFKeystoreWrapper(AFd1iSDK.this).w());
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1iSDK$5, reason: invalid class name */
    public final class AnonymousClass5 extends C09AY implements Function0<AFd1sSDK> {
        public AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: values, reason: merged with bridge method [inline-methods] */
        public final AFd1sSDK invoke() {
            return AFd1iSDK.AFKeystoreWrapper(AFd1iSDK.this).AFInAppEventType();
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1iSDK$7, reason: invalid class name */
    public final class AnonymousClass7 extends C09AY implements Function0<AFd1cSDK> {
        public AnonymousClass7() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: AFInAppEventType, reason: merged with bridge method [inline-methods] */
        public final AFd1cSDK invoke() {
            return new AFd1cSDK(AFd1iSDK.this.valueOf());
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1iSDK$8, reason: invalid class name */
    public final class AnonymousClass8 extends C09AY implements Function0<AFg1wSDK> {
        public AnonymousClass8() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: AFInAppEventType, reason: merged with bridge method [inline-methods] */
        public final AFg1wSDK invoke() {
            return AFd1iSDK.AFKeystoreWrapper(AFd1iSDK.this).i();
        }
    }

    public static /* synthetic */ void lambda$semisugar$AFInAppEventParameterName$0(AFd1iSDK aFd1iSDK, Throwable th, String str) {
        C1C7U.LIZ("AFd1iSDK@4125.values$2L");
        AFInAppEventParameterName(aFd1iSDK, th, str);
        C1C7U.LIZIZ("AFd1iSDK@4125.values$2L");
    }

    public static /* synthetic */ void lambda$semisugar$AFInAppEventType$0(AFd1iSDK aFd1iSDK) {
        C1C7U.LIZ("AFd1iSDK@4125.values$4L");
        AFInAppEventType(aFd1iSDK);
        C1C7U.LIZIZ("AFd1iSDK@4125.values$4L");
    }

    public static /* synthetic */ void lambda$semisugar$valueOf$0(AFd1iSDK aFd1iSDK) {
        C1C7U.LIZ("AFd1iSDK@4125.AFInAppEventParameterName$1L");
        valueOf(aFd1iSDK);
        C1C7U.LIZIZ("AFd1iSDK@4125.AFInAppEventParameterName$1L");
    }

    public static /* synthetic */ void lambda$semisugar$values$0(AFd1iSDK aFd1iSDK) {
        C1C7U.LIZ("AFd1iSDK@4125.AFInAppEventType$1L");
        values(aFd1iSDK);
        C1C7U.LIZIZ("AFd1iSDK@4125.AFInAppEventType$1L");
    }

    private final synchronized void v() {
        w = (v + 121) % 128;
        AFh1fSDK aFh1fSDKE = e();
        boolean zAFKeystoreWrapper = false;
        if (aFh1fSDKE != null) {
            if (aFh1fSDKE.AFInAppEventType == -1) {
                registerClient().AFKeystoreWrapper("af_send_exc_to_server_window");
            } else if (registerClient().values("af_send_exc_to_server_window", -1L) == -1) {
                valueOf(aFh1fSDKE);
            }
            zAFKeystoreWrapper = AFKeystoreWrapper(aFh1fSDKE);
            v = (w + 13) % 128;
        }
        AFd1jSDK.AFa1zSDK aFa1zSDK = this.AFLogger;
        if (aFa1zSDK != null) {
            v = (w + 11) % 128;
            aFa1zSDK.onConfigurationChanged(zAFKeystoreWrapper);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0102 A[Catch: all -> 0x01f2, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0007, B:6:0x0009, B:8:0x0018, B:12:0x0042, B:17:0x004f, B:19:0x005a, B:21:0x0060, B:23:0x0068, B:25:0x006c, B:27:0x0079, B:29:0x008b, B:31:0x008f, B:33:0x0095, B:34:0x0099, B:36:0x00a7, B:38:0x00ab, B:40:0x00b1, B:41:0x00b5, B:43:0x00c3, B:45:0x00c7, B:47:0x00d2, B:57:0x00ec, B:59:0x00f2, B:62:0x00f8, B:63:0x00fc, B:65:0x0102, B:67:0x010e, B:68:0x0112, B:70:0x0118, B:72:0x011c, B:75:0x0125, B:83:0x014d, B:90:0x01ca, B:92:0x01ce, B:94:0x01d9, B:96:0x01df, B:97:0x01e3, B:98:0x01e7, B:84:0x015b, B:86:0x0166, B:87:0x0182, B:76:0x012e, B:89:0x01af, B:81:0x0139, B:55:0x00e6, B:50:0x00db, B:88:0x019e), top: B:108:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x015b A[Catch: all -> 0x01f2, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0007, B:6:0x0009, B:8:0x0018, B:12:0x0042, B:17:0x004f, B:19:0x005a, B:21:0x0060, B:23:0x0068, B:25:0x006c, B:27:0x0079, B:29:0x008b, B:31:0x008f, B:33:0x0095, B:34:0x0099, B:36:0x00a7, B:38:0x00ab, B:40:0x00b1, B:41:0x00b5, B:43:0x00c3, B:45:0x00c7, B:47:0x00d2, B:57:0x00ec, B:59:0x00f2, B:62:0x00f8, B:63:0x00fc, B:65:0x0102, B:67:0x010e, B:68:0x0112, B:70:0x0118, B:72:0x011c, B:75:0x0125, B:83:0x014d, B:90:0x01ca, B:92:0x01ce, B:94:0x01d9, B:96:0x01df, B:97:0x01e3, B:98:0x01e7, B:84:0x015b, B:86:0x0166, B:87:0x0182, B:76:0x012e, B:89:0x01af, B:81:0x0139, B:55:0x00e6, B:50:0x00db, B:88:0x019e), top: B:108:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x019e A[Catch: all -> 0x01f2, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0007, B:6:0x0009, B:8:0x0018, B:12:0x0042, B:17:0x004f, B:19:0x005a, B:21:0x0060, B:23:0x0068, B:25:0x006c, B:27:0x0079, B:29:0x008b, B:31:0x008f, B:33:0x0095, B:34:0x0099, B:36:0x00a7, B:38:0x00ab, B:40:0x00b1, B:41:0x00b5, B:43:0x00c3, B:45:0x00c7, B:47:0x00d2, B:57:0x00ec, B:59:0x00f2, B:62:0x00f8, B:63:0x00fc, B:65:0x0102, B:67:0x010e, B:68:0x0112, B:70:0x0118, B:72:0x011c, B:75:0x0125, B:83:0x014d, B:90:0x01ca, B:92:0x01ce, B:94:0x01d9, B:96:0x01df, B:97:0x01e3, B:98:0x01e7, B:84:0x015b, B:86:0x0166, B:87:0x0182, B:76:0x012e, B:89:0x01af, B:81:0x0139, B:55:0x00e6, B:50:0x00db, B:88:0x019e), top: B:108:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized void w() {
        /*
            Method dump skipped, instruction units count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1iSDK.w():void");
    }

    private final AFf1bSDK AFKeystoreWrapper() {
        v = (w + 95) % 128;
        AFf1bSDK aFf1bSDK = (AFf1bSDK) this.values.getValue();
        int i2 = w + 41;
        v = i2 % 128;
        return i2 % 2 != 0 ? aFf1bSDK : aFf1bSDK;
    }

    private final ExecutorService AFLogger() {
        v = (w + 15) % 128;
        ExecutorService executorService = (ExecutorService) this.unregisterClient.getValue();
        int i2 = w + 101;
        v = i2 % 128;
        return !(i2 % 2 != 0) ? executorService : executorService;
    }

    private AFd1bSDK d() {
        v = (w + 39) % 128;
        AFd1bSDK aFd1bSDK = (AFd1bSDK) this.e.getValue();
        v = (w + 17) % 128;
        return aFd1bSDK;
    }

    private final AFh1fSDK e() {
        AFi1zSDK aFi1zSDK;
        int i2 = v + 125;
        w = i2 % 128;
        if ((i2 % 2 == 0 ? 'O' : 'V') != 'O') {
            aFi1zSDK = AFKeystoreWrapper().valueOf.valueOf;
            if (aFi1zSDK == null) {
                return null;
            }
        } else {
            aFi1zSDK = AFKeystoreWrapper().valueOf.valueOf;
            if (aFi1zSDK == null) {
                return null;
            }
        }
        AFh1gSDK aFh1gSDK = aFi1zSDK.AFInAppEventParameterName;
        if (aFh1gSDK == null) {
            return null;
        }
        AFh1fSDK aFh1fSDK = aFh1gSDK.valueOf;
        v = (w + 27) % 128;
        return aFh1fSDK;
    }

    private final void i() {
        w = (v + 51) % 128;
        AFh1fSDK aFh1fSDKE = e();
        if (aFh1fSDKE != null) {
            if (values(aFh1fSDKE)) {
                w = (v + 81) % 128;
                String str = unregisterClient().AFLogger;
                if (str != null) {
                    valueOf(C786410Ut5.J3(new JSONObject(AFInAppEventParameterName(AFInAppEventParameterName(aFh1fSDKE), valueOf().AFInAppEventParameterName()))), str);
                    return;
                }
                return;
            }
            AFg1fSDK.v$default(AFLogger.INSTANCE, AFg1aSDK.EXCEPTION_MANAGER, "skipping", false, 4, null);
            int i2 = w + 57;
            v = i2 % 128;
            if (i2 % 2 != 0) {
                try {
                    throw null;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    private final AFd1qSDK registerClient() {
        w = (v + 123) % 128;
        AFd1qSDK aFd1qSDK = (AFd1qSDK) this.AFInAppEventParameterName.getValue();
        w = (v + 37) % 128;
        return aFd1qSDK;
    }

    private final AFg1wSDK unregisterClient() {
        w = (v + 123) % 128;
        AFg1wSDK aFg1wSDK = (AFg1wSDK) this.valueOf.getValue();
        w = (v + 25) % 128;
        return aFg1wSDK;
    }

    private final AFd1sSDK values() {
        int i2 = w + 81;
        v = i2 % 128;
        if (!(i2 % 2 == 0)) {
            this.AFInAppEventType.getValue();
            try {
                throw null;
            } finally {
            }
        }
        AFd1sSDK aFd1sSDK = (AFd1sSDK) this.AFInAppEventType.getValue();
        int i3 = v + 29;
        w = i3 % 128;
        if (i3 % 2 != 0) {
            return aFd1sSDK;
        }
        try {
            throw null;
        } finally {
        }
    }

    @Override // com.appsflyer.internal.AFd1jSDK
    public final void AFInAppEventParameterName() {
        v = (w + 67) % 128;
        AFLogger().execute(new Runnable() { // from class: X.13o9
            @Override // java.lang.Runnable
            public final void run() {
                AFd1iSDK.lambda$semisugar$valueOf$0(this.LL);
            }
        });
        int i2 = v + 99;
        w = i2 % 128;
        if (i2 % 2 == 0) {
        }
    }

    @Override // com.appsflyer.internal.AFd1jSDK
    public final void AFInAppEventType() {
        v = (w + 103) % 128;
        AFLogger().execute(new Runnable() { // from class: X.13o8
            @Override // java.lang.Runnable
            public final void run() {
                AFd1iSDK.lambda$semisugar$values$0(this.LL);
            }
        });
        v = (w + 95) % 128;
    }

    public final AFd1gSDK valueOf() {
        int i2 = v + 41;
        w = i2 % 128;
        if (i2 % 2 != 0) {
            return (AFd1gSDK) this.d.getValue();
        }
        this.d.getValue();
        try {
            throw null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }

    public AFd1iSDK(AFd1kSDK aFd1kSDK) {
        this.AFKeystoreWrapper = aFd1kSDK;
    }

    private final Map<String, String> AFInAppEventParameterName(AFh1fSDK aFh1fSDK) {
        Object[] objArr = new Object[1];
        a(View.MeasureSpec.makeMeasureSpec(0, 0) - 801052847, (char) (TextUtils.indexOf("", "", 0, 0) + 25652), "텤\ue8cd㘏跣艷", "틠\udeb0羳༈", "册䃧㓐蹤", objArr);
        AFd1sSDK aFd1sSDKValues = values();
        Map<String, String> mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair(((String) objArr[0]).intern(), Build.BRAND), new Pair("model", Build.MODEL), new Pair("app_id", values().valueOf.AFKeystoreWrapper.getPackageName()), new Pair("p_ex", new AFb1hSDK().valueOf()), new Pair("api", String.valueOf(Build.VERSION.SDK_INT)), new Pair("sdk", this.registerClient), new Pair("uid", AFb1kSDK.valueOf(aFd1sSDKValues.valueOf, aFd1sSDKValues.AFKeystoreWrapper)), new Pair("exc_config", aFh1fSDK.valueOf()));
        v = (w + 33) % 128;
        return mapLJIIIIZZ;
    }

    private final boolean AFInAppEventType(AFh1fSDK aFh1fSDK) {
        new AFe1zSDK();
        boolean zAFInAppEventType = AFe1zSDK.AFInAppEventType(this.registerClient, aFh1fSDK.AFKeystoreWrapper);
        int i2 = v + 51;
        w = i2 % 128;
        if (i2 % 2 == 0) {
            try {
                throw null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return zAFInAppEventType;
    }

    private final boolean AFKeystoreWrapper(AFh1fSDK aFh1fSDK) {
        int i2 = w + 13;
        v = i2 % 128;
        if (i2 % 2 == 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jValues = registerClient().values("af_send_exc_to_server_window", -1L);
            if (aFh1fSDK.AFInAppEventParameterName < TimeUnit.MILLISECONDS.toSeconds(jCurrentTimeMillis)) {
                int i3 = w + 109;
                v = i3 % 128;
                if (i3 % 2 == 0) {
                    return false;
                }
                return true;
            }
            if (jValues == -1 || jValues < jCurrentTimeMillis) {
                return false;
            }
            return AFInAppEventType(aFh1fSDK);
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        registerClient().values("af_send_exc_to_server_window", -1L);
        TimeUnit.MILLISECONDS.toSeconds(jCurrentTimeMillis2);
        try {
            throw null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }

    private final void valueOf(AFh1fSDK aFh1fSDK) {
        boolean z;
        int i2;
        long jCurrentTimeMillis;
        int i3 = v + 83;
        w = i3 % 128;
        if (i3 % 2 == 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            i2 = aFh1fSDK.valueOf;
            jCurrentTimeMillis = System.currentTimeMillis() * TimeUnit.DAYS.toMillis(aFh1fSDK.AFInAppEventType);
        } else {
            i2 = aFh1fSDK.valueOf;
            jCurrentTimeMillis = System.currentTimeMillis() + TimeUnit.DAYS.toMillis(aFh1fSDK.AFInAppEventType);
        }
        AFd1qSDK aFd1qSDKRegisterClient = registerClient();
        aFd1qSDKRegisterClient.AFKeystoreWrapper("af_send_exc_to_server_window", jCurrentTimeMillis);
        aFd1qSDKRegisterClient.AFInAppEventParameterName("af_send_exc_min", i2);
    }

    private final boolean values(AFh1fSDK aFh1fSDK) {
        char c;
        int iValueOf;
        v = (w + 13) % 128;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jValues = registerClient().values("af_send_exc_to_server_window", -1L);
        if (aFh1fSDK.AFInAppEventParameterName < TimeUnit.MILLISECONDS.toSeconds(jCurrentTimeMillis)) {
            c = '&';
        } else {
            c = '5';
        }
        if (c == '5' && jValues != -1 && jValues >= jCurrentTimeMillis && (iValueOf = registerClient().valueOf("af_send_exc_min", -1)) != -1) {
            int i2 = w + 73;
            v = i2 % 128;
            if (i2 % 2 == 0) {
                if (valueOf().values() >= iValueOf) {
                    return AFInAppEventType(aFh1fSDK);
                }
            } else {
                valueOf().values();
                try {
                    throw null;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return false;
    }

    public static final void AFInAppEventType(AFd1iSDK aFd1iSDK) {
        w = (v + 93) % 128;
        aFd1iSDK.w();
        int i2 = w + 35;
        v = i2 % 128;
        if (i2 % 2 != 0) {
        }
    }

    public static final /* synthetic */ AFd1kSDK AFKeystoreWrapper(AFd1iSDK aFd1iSDK) {
        char c;
        int i2 = v + 25;
        int i3 = i2 % 128;
        w = i3;
        if (i2 % 2 == 0) {
            c = ',';
        } else {
            c = 'Z';
        }
        AFd1kSDK aFd1kSDK = aFd1iSDK.AFKeystoreWrapper;
        if (c == 'Z') {
            int i4 = i3 + 87;
            v = i4 % 128;
            if (i4 % 2 != 0) {
                return aFd1kSDK;
            }
            return aFd1kSDK;
        }
        try {
            throw null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }

    public static final void valueOf(AFd1iSDK aFd1iSDK) {
        w = (v + 69) % 128;
        aFd1iSDK.v();
        int i2 = v + 63;
        w = i2 % 128;
        if (i2 % 2 == 0) {
            try {
                throw null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.appsflyer.internal.AFd1jSDK
    public final void values(AFd1jSDK.AFa1zSDK aFa1zSDK) {
        int i2 = w + 77;
        v = i2 % 128;
        if (i2 % 2 != 0) {
            this.AFLogger = aFa1zSDK;
            AFLogger().execute(new Runnable() { // from class: X.13oA
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1iSDK.lambda$semisugar$AFInAppEventType$0(this.LL);
                }
            });
            try {
                throw null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        this.AFLogger = aFa1zSDK;
        AFLogger().execute(new Runnable() { // from class: X.13oA
            @Override // java.lang.Runnable
            public final void run() {
                AFd1iSDK.lambda$semisugar$AFInAppEventType$0(this.LL);
            }
        });
    }

    public static final void values(AFd1iSDK aFd1iSDK) {
        boolean z;
        int i2 = v + 59;
        w = i2 % 128;
        if (i2 % 2 == 0) {
            z = true;
        } else {
            z = false;
        }
        aFd1iSDK.i();
        if (!z) {
            v = (w + 51) % 128;
            return;
        }
        try {
            throw null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }

    public static Map<String, Object> AFInAppEventParameterName(Map<String, ? extends Object> map, List<AFd1fSDK> list) {
        char c;
        Map<String, Object> mapLJIIIIZZ;
        int i2 = v + 63;
        w = i2 % 128;
        if (i2 % 2 == 0) {
            c = '*';
        } else {
            c = 'E';
        }
        if (c != '*') {
            mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("deviceInfo", map), new Pair("excs", AFd1eSDK.AFInAppEventType(list)));
        } else {
            mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("deviceInfo", map), new Pair("excs", AFd1eSDK.AFInAppEventType(list)));
        }
        v = (w + 73) % 128;
        return mapLJIIIIZZ;
    }

    private final void valueOf(String str, String str2) {
        w = (v + 37) % 128;
        d().valueOf(str.getBytes(Charsets.UTF_8), C2097908Jt.LIZJ(new Pair("Authorization", AFb1lSDK.AFKeystoreWrapper(str, str2))), 2000);
        v = (w + 83) % 128;
    }

    @Override // com.appsflyer.internal.AFd1jSDK
    public final void values(final Throwable th, final String str) {
        int i2 = v + 9;
        w = i2 % 128;
        if (i2 % 2 == 0) {
            AFLogger().execute(new Runnable() { // from class: X.13o3
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1iSDK.lambda$semisugar$AFInAppEventParameterName$0(this.LL, th, str);
                }
            });
            try {
                throw null;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        AFLogger().execute(new Runnable() { // from class: X.13o3
            @Override // java.lang.Runnable
            public final void run() {
                AFd1iSDK.lambda$semisugar$AFInAppEventParameterName$0(this.LL, th, str);
            }
        });
    }

    public static final void AFInAppEventParameterName(AFd1iSDK aFd1iSDK, Throwable th, String str) {
        AFh1fSDK aFh1fSDKE = aFd1iSDK.e();
        if (aFh1fSDKE != null && 15 != 82 && aFd1iSDK.AFKeystoreWrapper(aFh1fSDKE)) {
            int i2 = (w + 103) % 128;
            v = i2;
            w = (i2 + 93) % 128;
            v = (w + 3) % 128;
            aFd1iSDK.valueOf().AFInAppEventParameterName(th, str);
        }
    }

    public static void a(int i2, char c, String str, String str2, String str3, Object[] objArr) {
        String str4 = str3;
        $11 = ($10 + 61) % 128;
        Object charArray = str4;
        if (str4 != null) {
            charArray = str4.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        AFj1eSDK aFj1eSDK = new AFj1eSDK();
        int length = cArr.length;
        char[] cArr3 = new char[length];
        int length2 = cArr2.length;
        char[] cArr4 = new char[length2];
        System.arraycopy(cArr, 0, cArr3, 0, length);
        System.arraycopy(cArr2, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c);
        cArr4[2] = (char) (cArr4[2] + ((char) i2));
        int length3 = ((char[]) charArray3).length;
        char[] cArr5 = new char[length3];
        aFj1eSDK.valueOf = 0;
        while (true) {
            int i3 = aFj1eSDK.valueOf;
            if (i3 < length3) {
                $11 = ($10 + 3) % 128;
                int i4 = (i3 + 3) % 4;
                int i5 = cArr3[i3 % 4] * 32718;
                char c2 = cArr4[(i3 + 2) % 4];
                char c3 = (char) ((i5 + c2) % 65535);
                aFj1eSDK.AFKeystoreWrapper = c3;
                cArr4[i4] = (char) (((cArr3[i4] * 32718) + c2) / 65535);
                cArr3[i4] = c3;
                cArr5[i3] = (char) (((((long) (r14[i3] ^ c3)) ^ (afInfoLog ^ (-2499805256334160880L))) ^ ((long) ((int) (((long) force) ^ (-2499805256334160880L))))) ^ ((long) ((char) (((long) i) ^ (-2499805256334160880L)))));
                aFj1eSDK.valueOf = i3 + 1;
            } else {
                objArr[0] = new String(cArr5);
                return;
            }
        }
    }
}
