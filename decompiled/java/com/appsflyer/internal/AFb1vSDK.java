package com.appsflyer.internal;

import X.C0WZX;
import X.C1C7U;
import X.C2179971ATj;
import X.C2204961BRm;
import X.C786410Ut5;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.appsflyer.AFPurchaseDetails;
import com.appsflyer.AFVersionDeclaration;
import com.appsflyer.AppsFlyerConsent;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerInAppPurchaseValidationCallback;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFb1vSDK;
import com.appsflyer.internal.AFd1jSDK;
import com.appsflyer.internal.AFd1xSDK;
import com.appsflyer.internal.AFe1cSDK.AnonymousClass2;
import com.appsflyer.internal.AFf1gSDK;
import com.appsflyer.internal.AFf1hSDK;
import com.appsflyer.internal.AFg1uSDK;
import com.appsflyer.internal.AFi1hSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.platform_extension.PluginInfo;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.URI;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public final class AFb1vSDK extends AppsFlyerLib {
    public static int $10 = 0;
    public static int $11 = 1;
    public static final String AFInAppEventParameterName;
    public static AppsFlyerInAppPurchaseValidatorListener AFKeystoreWrapper = null;
    public static AFb1vSDK AFLogger = null;
    public static int AFPurchaseDetails = 0;
    public static int afDebugLog = 0;
    public static byte[] afErrorLog = null;
    public static int afLogForce = 1;
    public static int afVerboseLog;
    public static int afWarnLog;
    public static short[] getLevel;
    public static final String valueOf;
    public static final String values;
    public volatile AppsFlyerConversionListener AFInAppEventType;
    public SharedPreferences afInfoLog;
    public AFf1eSDK afRDLog;
    public Map<Long, String> d;
    public final AFd1nSDK force;
    public Application v;
    public boolean w;
    public long e = -1;
    public long registerClient = -1;
    public long unregisterClient = TimeUnit.SECONDS.toMillis(5);
    public boolean i = false;

    public class AFa1uSDK implements AFe1fSDK {
        @Override // com.appsflyer.internal.AFe1fSDK
        public final void AFInAppEventType(AFe1dSDK<?> aFe1dSDK) {
        }

        private boolean AFInAppEventType() {
            return AFb1vSDK.this.AFInAppEventType != null;
        }

        public AFa1uSDK() {
        }

        @Override // com.appsflyer.internal.AFe1fSDK
        public final void values(AFe1dSDK<?> aFe1dSDK) {
            if (aFe1dSDK instanceof AFf1cSDK) {
                AFb1vSDK.this.AFInAppEventParameterName().AFLogger().values(((AFf1lSDK) aFe1dSDK).unregisterClient.AFLogger);
            }
        }

        public /* synthetic */ AFa1uSDK(AFb1vSDK aFb1vSDK, byte b) {
            this();
        }

        @Override // com.appsflyer.internal.AFe1fSDK
        public final void values(AFe1dSDK<?> aFe1dSDK, AFe1bSDK aFe1bSDK) {
            JSONObject jSONObjectValueOf;
            AFg1oSDK aFg1oSDKValueOf;
            if (aFe1dSDK instanceof AFf1lSDK) {
                AFf1nSDK aFf1nSDK = (AFf1nSDK) aFe1dSDK;
                boolean z = aFe1dSDK instanceof AFf1cSDK;
                if (z && AFInAppEventType()) {
                    AFf1cSDK aFf1cSDK = (AFf1cSDK) aFe1dSDK;
                    if (aFf1cSDK.values == AFe1bSDK.SUCCESS || aFf1cSDK.AFKeystoreWrapper == 1) {
                        AFg1eSDK aFg1eSDK = new AFg1eSDK(aFf1cSDK, AFb1vSDK.this.AFInAppEventParameterName().valueOf());
                        AFe1cSDK aFe1cSDKAfInfoLog = AFb1vSDK.this.AFInAppEventParameterName().afInfoLog();
                        aFe1cSDKAfInfoLog.valueOf.execute(aFe1cSDKAfInfoLog.new AnonymousClass2(aFg1eSDK));
                    }
                }
                if (aFe1bSDK == AFe1bSDK.SUCCESS) {
                    AFb1vSDK aFb1vSDK = AFb1vSDK.this;
                    aFb1vSDK.AFInAppEventParameterName(AFb1vSDK.AFInAppEventParameterName(aFb1vSDK)).AFInAppEventParameterName("sentSuccessfully", "true");
                    if (!(aFe1dSDK instanceof AFf1dSDK) && (aFg1oSDKValueOf = new AFg1nSDK(AFb1vSDK.AFInAppEventParameterName(AFb1vSDK.this)).valueOf()) != null && aFg1oSDKValueOf.values()) {
                        String str = aFg1oSDKValueOf.values;
                        AFLogger.INSTANCE.d(AFg1aSDK.UNINSTALL, "Resending Uninstall token to AF servers: ".concat(String.valueOf(str)));
                        AFg1nSDK.values(str);
                    }
                    ResponseNetwork responseNetwork = aFf1nSDK.registerClient;
                    if (responseNetwork != null && (jSONObjectValueOf = AFc1sSDK.valueOf((String) responseNetwork.getBody())) != null) {
                        AFb1vSDK.AFInAppEventType(AFb1vSDK.this, jSONObjectValueOf.optBoolean("send_background", false));
                    }
                    if (z) {
                        AFb1vSDK.valueOf(AFb1vSDK.this, System.currentTimeMillis());
                        return;
                    }
                    return;
                }
                return;
            }
            if ((aFe1dSDK instanceof AFg1eSDK) && aFe1bSDK != AFe1bSDK.SUCCESS) {
                AFg1lSDK aFg1lSDK = new AFg1lSDK(AFb1vSDK.this.AFInAppEventParameterName());
                AFe1cSDK aFe1cSDKAfInfoLog2 = AFb1vSDK.this.AFInAppEventParameterName().afInfoLog();
                aFe1cSDKAfInfoLog2.valueOf.execute(aFe1cSDKAfInfoLog2.new AnonymousClass2(aFg1lSDK));
            }
        }
    }

    public class AFa1vSDK implements Runnable {
        public final AFa1qSDK values;

        @Override // java.lang.Runnable
        public final void run() {
            C1C7U.LIZ("AFb1vSDK$AFa1vSDK@6e71.run");
            com_appsflyer_internal_AFb1vSDK$AFa1vSDK_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            C1C7U.LIZIZ("AFb1vSDK$AFa1vSDK@6e71.run");
        }

        public final void com_appsflyer_internal_AFb1vSDK$AFa1vSDK__run$___twin___() {
            AFb1vSDK.values(AFb1vSDK.this, this.values);
        }

        public static void com_appsflyer_internal_AFb1vSDK$AFa1vSDK_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AFa1vSDK aFa1vSDK) {
            try {
                aFa1vSDK.com_appsflyer_internal_AFb1vSDK$AFa1vSDK__run$___twin___();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (!C2179971ATj.LIZ(th)) {
                    throw th;
                }
            }
        }

        public AFa1vSDK(AFa1qSDK aFa1qSDK) {
            this.values = aFa1qSDK;
        }

        public /* synthetic */ AFa1vSDK(AFb1vSDK aFb1vSDK, AFa1qSDK aFa1qSDK, byte b) {
            this(aFa1qSDK);
        }
    }

    public static void AFInAppEventType() {
        afWarnLog = 908301821;
        afVerboseLog = 401442715;
        afDebugLog = 221303939;
        afErrorLog = new byte[]{-26, -23, 8, -28, -21, 29, -31, 16, -16, 28, -32, -27};
    }

    private synchronized AFf1eSDK e() {
        int i = afLogForce;
        AFPurchaseDetails = (i + 125) % 128;
        if (this.afRDLog == null) {
            this.afRDLog = new AFf1eSDK() { // from class: X.13o5
                @Override // com.appsflyer.internal.AFf1eSDK
                public final void onRemoteConfigUpdateFinished(AFf1gSDK aFf1gSDK) {
                    this.LIZ.AFInAppEventParameterName(aFf1gSDK);
                }
            };
            AFPurchaseDetails = (i + 79) % 128;
        }
        return this.afRDLog;
    }

    public static /* synthetic */ void lambda$semisugar$AFInAppEventType$0(AFb1vSDK aFb1vSDK, Context context, Intent intent) {
        C1C7U.LIZ("AFb1vSDK@cf4.performOnDeepLinking$1L");
        aFb1vSDK.AFInAppEventType(context, intent);
        C1C7U.LIZIZ("AFb1vSDK@cf4.performOnDeepLinking$1L");
    }

    public static /* synthetic */ void lambda$semisugar$AFLogger$0(AFb1vSDK aFb1vSDK) {
        C1C7U.LIZ("AFb1vSDK@cf4.init$1L");
        aFb1vSDK.AFLogger();
        C1C7U.LIZIZ("AFb1vSDK@cf4.init$1L");
    }

    public static /* synthetic */ void lambda$semisugar$valueOf$0(AFd1kSDK aFd1kSDK) {
        C1C7U.LIZ("AFb1vSDK@cf4.stop$1L");
        valueOf(aFd1kSDK);
        C1C7U.LIZIZ("AFb1vSDK@cf4.stop$1L");
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFb1vSDK$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] AFKeystoreWrapper;

        static {
            int[] iArr = new int[AppsFlyerProperties.EmailsCryptType.values().length];
            AFKeystoreWrapper = iArr;
            try {
                iArr[AppsFlyerProperties.EmailsCryptType.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                AFKeystoreWrapper[AppsFlyerProperties.EmailsCryptType.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    public static AFb1vSDK AFKeystoreWrapper() {
        int i = AFPurchaseDetails + 121;
        int i2 = i % 128;
        afLogForce = i2;
        if (i % 2 != 0) {
            AFb1vSDK aFb1vSDK = AFLogger;
            AFPurchaseDetails = (i2 + 47) % 128;
            return aFb1vSDK;
        }
        try {
            throw null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }

    private /* synthetic */ void AFLogger() {
        values(new AFh1oSDK());
        int i = afLogForce + 125;
        AFPurchaseDetails = i % 128;
        if (i % 2 != 0) {
            try {
                throw null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    private boolean d() {
        if (this.e <= 0) {
            isStopped();
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.e;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z", Locale.US);
        AFKeystoreWrapper(simpleDateFormat, this.e);
        AFKeystoreWrapper(simpleDateFormat, this.registerClient);
        if (jCurrentTimeMillis < this.unregisterClient && !isStopped()) {
            return true;
        }
        if (!isStopped()) {
            int i = (afLogForce + 21) % 128;
            AFPurchaseDetails = i;
            afLogForce = (i + 75) % 128;
        }
        return false;
    }

    private AFi1hSDK[] registerClient() {
        int i = afLogForce + 83;
        AFPurchaseDetails = i % 128;
        if (i % 2 == 0) {
            return AFInAppEventParameterName().force().AFKeystoreWrapper();
        }
        AFInAppEventParameterName().force().AFKeystoreWrapper();
        try {
            throw null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }

    private void unregisterClient() {
        int i = afLogForce + 57;
        AFPurchaseDetails = i % 128;
        if (i % 2 != 0) {
            if (AFf1oSDK.e()) {
                return;
            }
        } else if (AFf1oSDK.e()) {
            return;
        }
        AFd1kSDK aFd1kSDKAFInAppEventParameterName = AFInAppEventParameterName();
        AFe1cSDK aFe1cSDKAfInfoLog = aFd1kSDKAFInAppEventParameterName.afInfoLog();
        aFe1cSDKAfInfoLog.valueOf.execute(aFe1cSDKAfInfoLog.new AnonymousClass2(new AFf1oSDK(aFd1kSDKAFInAppEventParameterName)));
        int i2 = afLogForce + 121;
        AFPurchaseDetails = i2 % 128;
        if (i2 % 2 != 0) {
            try {
                throw null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static String valueOf() {
        AFPurchaseDetails = (afLogForce + 117) % 128;
        String strAFKeystoreWrapper = AFKeystoreWrapper("AppUserId");
        AFPurchaseDetails = (afLogForce + 73) % 128;
        return strAFKeystoreWrapper;
    }

    public final AFd1kSDK AFInAppEventParameterName() {
        int i = (AFPurchaseDetails + 117) % 128;
        afLogForce = i;
        AFd1nSDK aFd1nSDK = this.force;
        int i2 = i + 35;
        AFPurchaseDetails = i2 % 128;
        if (i2 % 2 == 0) {
            return aFd1nSDK;
        }
        try {
            throw null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostName() {
        AFPurchaseDetails = (afLogForce + 29) % 128;
        String strAFInAppEventParameterName = AFInAppEventParameterName().afVerboseLog().AFInAppEventParameterName();
        afLogForce = (AFPurchaseDetails + 73) % 128;
        return strAFInAppEventParameterName;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostPrefix() {
        int i = AFPurchaseDetails + 81;
        afLogForce = i % 128;
        if (i % 2 != 0) {
            String strAFInAppEventType = AFInAppEventParameterName().afVerboseLog().AFInAppEventType();
            int i2 = AFPurchaseDetails + 19;
            afLogForce = i2 % 128;
            return i2 % 2 != 0 ? strAFInAppEventType : strAFInAppEventType;
        }
        AFInAppEventParameterName().afVerboseLog().AFInAppEventType();
        try {
            throw null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getSdkVersion() {
        AFPurchaseDetails = (afLogForce + 43) % 128;
        AFInAppEventParameterName().v().AFInAppEventParameterName("getSdkVersion", new String[0]);
        String strRegisterClient = AFd1sSDK.registerClient();
        int i = AFPurchaseDetails + 5;
        afLogForce = i % 128;
        return i % 2 == 0 ? strRegisterClient : strRegisterClient;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final boolean isStopped() {
        int i = afLogForce + 49;
        AFPurchaseDetails = i % 128;
        if (!(i % 2 == 0)) {
            AFInAppEventParameterName().i().AFKeystoreWrapper();
            try {
                throw null;
            } finally {
            }
        }
        boolean zAFKeystoreWrapper = AFInAppEventParameterName().i().AFKeystoreWrapper();
        int i2 = AFPurchaseDetails + 53;
        afLogForce = i2 % 128;
        if (i2 % 2 != 0) {
            return zAFKeystoreWrapper;
        }
        try {
            throw null;
        } finally {
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setSharingFilterForAllPartners() {
        afLogForce = (AFPurchaseDetails + 69) % 128;
        setSharingFilterForPartners("all");
        int i = afLogForce + 35;
        AFPurchaseDetails = i % 128;
        if (i % 2 != 0) {
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void unregisterConversionListener() {
        int i = AFPurchaseDetails + 25;
        afLogForce = i % 128;
        if ((i % 2 == 0 ? '7' : ',') != '7') {
            AFInAppEventParameterName().v().AFInAppEventParameterName("unregisterConversionListener", new String[0]);
        } else {
            AFInAppEventParameterName().v().AFInAppEventParameterName("unregisterConversionListener", new String[0]);
        }
        this.AFInAppEventType = null;
        int i2 = afLogForce + 79;
        AFPurchaseDetails = i2 % 128;
        if (i2 % 2 != 0) {
            try {
                throw null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final boolean values() {
        int i = afLogForce + 87;
        AFPurchaseDetails = i % 128;
        if (i % 2 != 0) {
            AFInAppEventType("waitForCustomerId");
            try {
                throw null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if ((AFInAppEventType("waitForCustomerId") ? 'K' : 'Q') == 'Q' || valueOf() != null) {
            return false;
        }
        int i2 = afLogForce + 33;
        AFPurchaseDetails = i2 % 128;
        return i2 % 2 == 0;
    }

    static {
        AFInAppEventType();
        values = "288";
        AFInAppEventParameterName = "6.14";
        valueOf = "6.14/androidevent?buildnumber=6.14.0&app_id=";
        AFKeystoreWrapper = null;
        AFLogger = new AFb1vSDK();
        int i = AFPurchaseDetails + 51;
        afLogForce = i % 128;
        if (i % 2 == 0) {
            try {
                throw null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public AFb1vSDK() {
        AFVersionDeclaration.init();
        this.force = new AFd1nSDK();
        AFInAppEventParameterName().AFLogger$LogLevel().values();
        AFInAppEventParameterName().AFLogger$LogLevel().AFInAppEventType();
        AFe1cSDK aFe1cSDKAfInfoLog = AFInAppEventParameterName().afInfoLog();
        aFe1cSDKAfInfoLog.AFInAppEventParameterName.add(new AFa1uSDK(this, (byte) 0));
    }

    private void AFInAppEventParameterName(String str) {
        AFh1rSDK aFh1rSDK = new AFh1rSDK();
        byte b = 0;
        aFh1rSDK.AFInAppEventType(AFInAppEventParameterName().AFInAppEventType().AFKeystoreWrapper.valueOf("appsFlyerCount", 0));
        aFh1rSDK.unregisterClient = str;
        if (str != null) {
            int i = afLogForce + 51;
            AFPurchaseDetails = i % 128;
            if (i % 2 != 0) {
                if (str.length() <= 4) {
                    return;
                }
            } else if (str.length() <= 5) {
                return;
            }
            if (AFInAppEventParameterName().force().AFKeystoreWrapper(aFh1rSDK)) {
                AFj1rSDK.values(AFInAppEventParameterName().AFKeystoreWrapper(), new AFa1vSDK(this, aFh1rSDK, b), 5L, TimeUnit.MILLISECONDS);
                AFPurchaseDetails = (afLogForce + 75) % 128;
            }
        }
    }

    public static void AFInAppEventType(Context context) {
        afLogForce = (AFPurchaseDetails + 65) % 128;
        try {
            if ((C786410Ut5.Y3(context.getPackageManager(), context.getPackageName(), 0).applicationInfo.flags & 32768) != 0) {
                AFPurchaseDetails = (afLogForce + 25) % 128;
                if (C786410Ut5.n3(context.getResources(), "appsflyer_backup_rules", "xml", context.getPackageName()) != 0) {
                    AFLogger.INSTANCE.i(AFg1aSDK.GENERAL, "appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data", true);
                } else {
                    AFLogger.INSTANCE.w(AFg1aSDK.GENERAL, "'allowBackup' is set to true; appsflyer_backup_rules.xml not detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <full-backup-content> rules", true);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1aSDK aFg1aSDK = AFg1aSDK.GENERAL;
            aFLogger.e(aFg1aSDK, "checkBackupRules Exception", e, false, false);
            aFLogger.v(aFg1aSDK, "checkBackupRules Exception: ".concat(String.valueOf(e)));
        }
    }

    public static void AFLogger(String str) {
        char c;
        try {
            if (new JSONObject(str).has("pid")) {
                int i = afLogForce + 7;
                AFPurchaseDetails = i % 128;
                if (i % 2 != 0) {
                    c = 0;
                } else {
                    c = ',';
                }
                if (c == ',') {
                    AFInAppEventType("preInstallName", str);
                    afLogForce = (AFPurchaseDetails + 25) % 128;
                } else {
                    AFInAppEventType("preInstallName", str);
                    try {
                        throw null;
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            }
        } catch (JSONException th) {
        }
    }

    public static Bundle INVOKEVIRTUAL_com_appsflyer_internal_AFb1vSDK_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    private AFh1xSDK e(Context context) {
        char c;
        int i = afLogForce;
        int i2 = i + 37;
        AFPurchaseDetails = i2 % 128;
        if (i2 % 2 != 0) {
            c = '7';
        } else {
            c = 'Q';
        }
        if (c != '7') {
            if (context instanceof Activity) {
                return new AFh1xSDK((Activity) context, AFInAppEventParameterName().AFPurchaseDetails());
            }
            AFPurchaseDetails = (i + 47) % 128;
            return null;
        }
        try {
            throw null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }

    public static void registerClient(Context context) {
        AFPurchaseDetails = (afLogForce + 23) % 128;
        try {
            List listAsList = Arrays.asList(C786410Ut5.Y3(context.getPackageManager(), context.getPackageName(), SpeechEngineDefines.TTS_WORK_MODE_BOTH).requestedPermissions);
            if (!listAsList.contains("android.permission.INTERNET")) {
                afLogForce = (AFPurchaseDetails + 91) % 128;
                AFLogger.INSTANCE.w(AFg1aSDK.GENERAL, "Permission android.permission.INTERNET is missing in the AndroidManifest.xml");
                afLogForce = (AFPurchaseDetails + 93) % 128;
            }
            if (!listAsList.contains("android.permission.ACCESS_NETWORK_STATE")) {
                AFLogger.INSTANCE.w(AFg1aSDK.GENERAL, "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml");
            }
            if (Build.VERSION.SDK_INT > 32 && !listAsList.contains("com.google.android.gms.permission.AD_ID")) {
                AFPurchaseDetails = (afLogForce + 105) % 128;
                AFLogger.INSTANCE.w(AFg1aSDK.GENERAL, "Permission com.google.android.gms.permission.AD_ID is missing in the AndroidManifest.xml");
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            AFLogger.INSTANCE.e(AFg1aSDK.GENERAL, "Exception while validation permissions. ", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String unregisterClient(Context context) {
        afLogForce = (AFPurchaseDetails + 109) % 128;
        String attributionId = getAttributionId(context);
        afLogForce = (AFPurchaseDetails + 105) % 128;
        return attributionId;
    }

    public static void valueOf(JSONObject jSONObject) {
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            try {
                JSONArray jSONArray = new JSONArray((String) jSONObject.get(itKeys.next()));
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(Long.valueOf(JSONArrayProtectorUtils.getLong(jSONArray, i)));
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                AFLogger.afErrorLogForExcManagerOnly("error at timeStampArr", e);
            }
        }
        Collections.sort(arrayList);
        Iterator<String> itKeys2 = jSONObject.keys();
        loop2: while (true) {
            str = null;
            while (true) {
                if (itKeys2.hasNext()) {
                    if (str != null) {
                        break loop2;
                    }
                    String next = itKeys2.next();
                    try {
                        JSONArray jSONArray2 = new JSONArray((String) jSONObject.get(next));
                        int i2 = 0;
                        while (i2 < jSONArray2.length()) {
                            afLogForce = (AFPurchaseDetails + 123) % 128;
                            if (JSONArrayProtectorUtils.getLong(jSONArray2, i2) == ((Long) ListProtector.get(arrayList, 0)).longValue() || JSONArrayProtectorUtils.getLong(jSONArray2, i2) == ((Long) ListProtector.get(arrayList, 1)).longValue()) {
                                break;
                            }
                            AFPurchaseDetails = (afLogForce + 15) % 128;
                            if (JSONArrayProtectorUtils.getLong(jSONArray2, i2) != ((Long) ListProtector.get(arrayList, arrayList.size() - 1)).longValue()) {
                                i2++;
                                str = next;
                            }
                        }
                    } catch (JSONException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        AFLogger.afErrorLogForExcManagerOnly("error at manageExtraReferrers", e2);
                    }
                } else if (str == null) {
                    return;
                }
            }
        }
        AFPurchaseDetails = (afLogForce + 81) % 128;
        jSONObject.remove(str);
    }

    private void values(AFa1qSDK aFa1qSDK) {
        String strAFInAppEventParameterName;
        long j;
        AFPurchaseDetails = (afLogForce + 37) % 128;
        Context context = AFInAppEventParameterName().w().AFKeystoreWrapper;
        if (context == null) {
            afLogForce = (AFPurchaseDetails + 89) % 128;
            return;
        }
        String str = AFInAppEventParameterName().i().AFLogger;
        AppsFlyerRequestListener appsFlyerRequestListener = aFa1qSDK.values;
        if (str != null) {
            afLogForce = (AFPurchaseDetails + 65) % 128;
            if (str.length() != 0) {
                AFd1qSDK aFd1qSDKAFInAppEventParameterName = AFInAppEventParameterName(context);
                AppsFlyerProperties.getInstance().saveProperties(aFd1qSDKAFInAppEventParameterName);
                AFInAppEventParameterName().i().AFKeystoreWrapper();
                boolean zAFInAppEventType = aFa1qSDK.AFInAppEventType();
                Map<String, ?> mapAFKeystoreWrapper = AFKeystoreWrapper(aFa1qSDK);
                isStopped();
                boolean z = false;
                int iAFInAppEventType = AFInAppEventType(aFd1qSDKAFInAppEventParameterName, false);
                AFj1xSDK aFj1xSDK = new AFj1xSDK(AFInAppEventParameterName().AFInAppEventType());
                boolean zAFInAppEventType2 = aFa1qSDK.AFInAppEventType();
                boolean z2 = aFa1qSDK instanceof AFh1sSDK;
                boolean z3 = aFa1qSDK instanceof AFh1vSDK;
                boolean z4 = aFa1qSDK instanceof AFh1rSDK;
                if (!(aFa1qSDK instanceof AFh1oSDK) && !z4) {
                    if (z3) {
                        afLogForce = (AFPurchaseDetails + 67) % 128;
                        strAFInAppEventParameterName = aFj1xSDK.AFKeystoreWrapper.AFInAppEventParameterName(AFj1xSDK.valueOf);
                    } else if (z2) {
                        strAFInAppEventParameterName = aFj1xSDK.AFKeystoreWrapper.AFInAppEventParameterName(AFj1xSDK.AFInAppEventParameterName);
                    } else if (zAFInAppEventType2) {
                        if (aFj1xSDK.AFInAppEventType.AFKeystoreWrapper.valueOf("appsFlyerCount", 0) < 2) {
                            strAFInAppEventParameterName = aFj1xSDK.AFKeystoreWrapper.AFInAppEventParameterName(AFj1xSDK.AFLogger);
                        } else {
                            strAFInAppEventParameterName = aFj1xSDK.AFKeystoreWrapper.AFInAppEventParameterName(AFj1xSDK.e);
                        }
                    } else {
                        strAFInAppEventParameterName = aFj1xSDK.AFKeystoreWrapper.AFInAppEventParameterName(AFj1xSDK.registerClient);
                        AFPurchaseDetails = (afLogForce + 125) % 128;
                    }
                } else {
                    strAFInAppEventParameterName = aFj1xSDK.AFKeystoreWrapper.AFInAppEventParameterName(AFj1xSDK.values);
                }
                String strValueOf = aFj1xSDK.valueOf(AFj1xSDK.AFInAppEventType(strAFInAppEventParameterName + aFj1xSDK.AFInAppEventType.valueOf.AFKeystoreWrapper.getPackageName(), z2));
                values(mapAFKeystoreWrapper);
                AFd1kSDK aFd1kSDKAFInAppEventParameterName = AFInAppEventParameterName();
                aFa1qSDK.valueOf(strValueOf);
                aFa1qSDK.valueOf(mapAFKeystoreWrapper);
                aFa1qSDK.AFInAppEventType(iAFInAppEventType);
                AFc1uSDK aFc1uSDK = new AFc1uSDK(aFd1kSDKAFInAppEventParameterName, aFa1qSDK, AFInAppEventParameterName().afDebugLog().AFInAppEventType());
                if (zAFInAppEventType) {
                    afLogForce = (AFPurchaseDetails + 87) % 128;
                    boolean z5 = false;
                    for (AFi1hSDK aFi1hSDK : registerClient()) {
                        if (aFi1hSDK.unregisterClient == AFi1hSDK.AFa1ySDK.STARTED) {
                            z5 = true;
                        }
                    }
                    if (AFInAppEventParameterName().afDebugLog().valueOf()) {
                        z5 = true;
                    }
                    if (AFInAppEventParameterName().i().valueOf()) {
                        int i = afLogForce + 49;
                        AFPurchaseDetails = i % 128;
                        if (i % 2 == 0) {
                            z = true;
                        }
                    } else {
                        z = z5;
                    }
                }
                ScheduledExecutorService scheduledExecutorServiceAFKeystoreWrapper = AFInAppEventParameterName().AFKeystoreWrapper();
                if (z) {
                    j = 500;
                } else {
                    j = 0;
                }
                AFj1rSDK.values(scheduledExecutorServiceAFKeystoreWrapper, aFc1uSDK, j, TimeUnit.MILLISECONDS);
                return;
            }
        }
        if (appsFlyerRequestListener != null) {
            afLogForce = (AFPurchaseDetails + 23) % 128;
            appsFlyerRequestListener.onError(41, "No dev key");
        }
    }

    public final Map<String, Object> AFKeystoreWrapper(AFa1qSDK aFa1qSDK) {
        boolean z;
        String str;
        final Context context = AFInAppEventParameterName().w().AFKeystoreWrapper;
        AFd1qSDK aFd1qSDKAFInAppEventParameterName = AFInAppEventParameterName(context);
        AFg1mSDK aFg1mSDKE = AFInAppEventParameterName().e();
        boolean zAFInAppEventType = aFa1qSDK.AFInAppEventType();
        Map<String, Object> map = aFa1qSDK.AFInAppEventType;
        long time = new Date().getTime();
        boolean z2 = false;
        Object[] objArr = new Object[1];
        a((byte) TextUtils.getCapsMode("", 0, 0), (short) (ViewConfiguration.getJumpTapTimeout() >> 16), (-567153175) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (-450712325) - TextUtils.indexOf("", "", 0, 0), MotionEvent.axisFromString("") - 113, objArr);
        map.put(((String) objArr[0]).intern(), Long.toString(time));
        try {
            if (!isStopped()) {
                StringBuilder sb = new StringBuilder("******* sendTrackingWithEvent: ");
                if (zAFInAppEventType) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    AFPurchaseDetails = (afLogForce + 89) % 128;
                    str = "Launch";
                } else {
                    str = aFa1qSDK.e;
                }
                sb.append(str);
                AFLogger.afInfoLog(sb.toString());
            }
            registerClient(context);
            aFg1mSDKE.AFInAppEventType(map, isPreInstalledApp(context), new Function0() { // from class: X.13oE
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.LL.unregisterClient(context);
                }
            });
            int iAFInAppEventType = AFInAppEventType(aFd1qSDKAFInAppEventParameterName, zAFInAppEventType);
            if (aFa1qSDK.e != null) {
                afLogForce = (AFPurchaseDetails + 59) % 128;
                z2 = true;
            }
            int iValues = values(aFd1qSDKAFInAppEventParameterName, z2);
            if (zAFInAppEventType && iAFInAppEventType == 1) {
                AppsFlyerProperties.getInstance().AFInAppEventType = true;
            }
            aFg1mSDKE.valueOf(map, iAFInAppEventType, iValues);
            afLogForce = (AFPurchaseDetails + 73) % 128;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            AFLogger.afErrorLog(th.getLocalizedMessage(), th, true);
        }
        afLogForce = (AFPurchaseDetails + 117) % 128;
        return map;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void addPushNotificationDeepLinkPath(String... strArr) {
        AFPurchaseDetails = (afLogForce + 97) % 128;
        List<String> listAsList = Arrays.asList(strArr);
        List<List<String>> list = AFInAppEventParameterName().afRDLog().AFKeystoreWrapper;
        if (!list.contains(listAsList)) {
            afLogForce = (AFPurchaseDetails + 83) % 128;
            list.add(listAsList);
            afLogForce = (AFPurchaseDetails + 41) % 128;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void anonymizeUser(boolean z) {
        AFPurchaseDetails = (afLogForce + 9) % 128;
        AFInAppEventParameterName().v().AFInAppEventParameterName("anonymizeUser", String.valueOf(z));
        AppsFlyerProperties.getInstance().set("deviceTrackingDisabled", z);
        AFPurchaseDetails = (afLogForce + 55) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableFacebookDeferredApplinks(boolean z) {
        afLogForce = (AFPurchaseDetails + 55) % 128;
        AFInAppEventParameterName().afDebugLog().values(z);
        int i = AFPurchaseDetails + 49;
        afLogForce = i % 128;
        if (i % 2 == 0) {
            try {
                throw null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableTCFDataCollection(boolean z) {
        AFPurchaseDetails = (afLogForce + 93) % 128;
        AFInAppEventType("enableTCFDataCollection", Boolean.toString(z));
        AFPurchaseDetails = (afLogForce + 103) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getAppsFlyerUID(Context context) {
        boolean z;
        int i = afLogForce + 5;
        AFPurchaseDetails = i % 128;
        if (i % 2 != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            AFInAppEventParameterName().v().AFInAppEventParameterName("getAppsFlyerUID", new String[1]);
            if (context == null) {
                return null;
            }
        } else {
            AFInAppEventParameterName().v().AFInAppEventParameterName("getAppsFlyerUID", new String[0]);
            if (context == null) {
                return null;
            }
        }
        valueOf(context);
        AFd1sSDK aFd1sSDKAFInAppEventType = AFInAppEventParameterName().AFInAppEventType();
        String strValueOf = AFb1kSDK.valueOf(aFd1sSDKAFInAppEventType.valueOf, aFd1sSDKAFInAppEventType.AFKeystoreWrapper);
        afLogForce = (AFPurchaseDetails + 59) % 128;
        return strValueOf;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getAttributionId(Context context) {
        char c;
        try {
            String strValues = new AFb1jSDK(context, AFInAppEventParameterName()).values();
            int i = afLogForce + 19;
            AFPurchaseDetails = i % 128;
            if (i % 2 != 0) {
                c = '@';
            } else {
                c = '[';
            }
            if (c == '[') {
                return strValues;
            }
            try {
                throw null;
            } finally {
                TryCatchGuardChecker.doCheck(th);
            }
        } catch (Throwable th) {
            return null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getOutOfStore(Context context) {
        char c;
        char c2;
        int i = afLogForce + 23;
        AFPurchaseDetails = i % 128;
        if (i % 2 != 0) {
            c = '\'';
        } else {
            c = 25;
        }
        if (c == 25) {
            String string = AppsFlyerProperties.getInstance().getString("api_store_value");
            if (string != null) {
                afLogForce = (AFPurchaseDetails + 75) % 128;
                return string;
            }
            String strAFInAppEventType = AFInAppEventType(context, "AF_STORE");
            if (strAFInAppEventType == null) {
                return null;
            }
            int i2 = afLogForce + 57;
            AFPurchaseDetails = i2 % 128;
            if (i2 % 2 != 0) {
                c2 = '5';
            } else {
                c2 = 0;
            }
            if (c2 != '5') {
                return strAFInAppEventType;
            }
            try {
                throw null;
            } finally {
            }
        }
        AppsFlyerProperties.getInstance().getString("api_store_value");
        try {
            throw null;
        } finally {
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final boolean isPreInstalledApp(Context context) {
        try {
            if ((C786410Ut5.V3(context.getPackageManager(), context.getPackageName(), 0).flags & 1) != 0) {
                int i = (afLogForce + 15) % 128;
                AFPurchaseDetails = i;
                afLogForce = (i + 81) % 128;
                return true;
            }
            AFPurchaseDetails = (afLogForce + 89) % 128;
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logSession(Context context) {
        afLogForce = (AFPurchaseDetails + 105) % 128;
        AFInAppEventParameterName().v().AFInAppEventParameterName("logSession", new String[0]);
        AFInAppEventParameterName().v().AFInAppEventParameterName();
        values(context, AFh1tSDK.logSession);
        values(context, null, null);
        int i = AFPurchaseDetails + 123;
        afLogForce = i % 128;
        if (i % 2 == 0) {
            try {
                throw null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void onPause(Context context) {
        int i = AFPurchaseDetails + 103;
        afLogForce = i % 128;
        if (i % 2 == 0) {
            AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType();
            try {
                throw null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType();
        afLogForce = (AFPurchaseDetails + 105) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x012f  */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void sendPushNotificationData(android.app.Activity r19) {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1vSDK.sendPushNotificationData(android.app.Activity):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAdditionalData(Map<String, Object> map) {
        afLogForce = (AFPurchaseDetails + 41) % 128;
        if (map != null) {
            AFInAppEventParameterName().v().AFInAppEventParameterName("setAdditionalData", map.toString());
            AppsFlyerProperties.getInstance().setCustomData(C786410Ut5.J3(new JSONObject(map)));
            AFPurchaseDetails = (afLogForce + 21) % 128;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAndroidIdData(String str) {
        afLogForce = (AFPurchaseDetails + 33) % 128;
        AFInAppEventParameterName().v().AFInAppEventParameterName("setAndroidIdData", str);
        AFInAppEventParameterName().getLevel().AFInAppEventType = str;
        afLogForce = (AFPurchaseDetails + 109) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAppId(String str) {
        char c;
        int i = afLogForce + 99;
        AFPurchaseDetails = i % 128;
        if (i % 2 != 0) {
            c = ';';
        } else {
            c = 25;
        }
        if (c != ';') {
            AFInAppEventParameterName().v().AFInAppEventParameterName("setAppId", str);
        } else {
            AFInAppEventParameterName().v().AFInAppEventParameterName("setAppId", str);
        }
        AFInAppEventType("appid", str);
        AFPurchaseDetails = (afLogForce + 37) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAppInviteOneLink(String str) {
        char c;
        AFInAppEventParameterName().v().AFInAppEventParameterName("setAppInviteOneLink", str);
        if (str != null) {
            c = 'A';
        } else {
            c = 28;
        }
        if (c == 28 || !str.equals(AppsFlyerProperties.getInstance().getString("oneLinkSlug"))) {
            AppsFlyerProperties.getInstance().remove("onelinkDomain");
            AppsFlyerProperties.getInstance().remove("onelinkVersion");
            AppsFlyerProperties.getInstance().remove("onelinkScheme");
            AFPurchaseDetails = (afLogForce + 51) % 128;
        }
        AFInAppEventType("oneLinkSlug", str);
        int i = AFPurchaseDetails + 49;
        afLogForce = i % 128;
        if (i % 2 != 0) {
            return;
        }
        try {
            throw null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectAndroidID(boolean z) {
        afLogForce = (AFPurchaseDetails + 49) % 128;
        AFInAppEventParameterName().v().AFInAppEventParameterName("setCollectAndroidID", String.valueOf(z));
        AFInAppEventType("collectAndroidId", Boolean.toString(z));
        AFInAppEventType("collectAndroidIdForceByUser", Boolean.toString(z));
        afLogForce = (AFPurchaseDetails + 117) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectIMEI(boolean z) {
        char c;
        int i = AFPurchaseDetails + 123;
        afLogForce = i % 128;
        if (i % 2 == 0) {
            c = '^';
        } else {
            c = '.';
        }
        if (c != '^') {
            AFInAppEventParameterName().v().AFInAppEventParameterName("setCollectIMEI", String.valueOf(z));
        } else {
            AFInAppEventParameterName().v().AFInAppEventParameterName("setCollectIMEI", String.valueOf(z));
        }
        AFInAppEventType("collectIMEI", Boolean.toString(z));
        AFInAppEventType("collectIMEIForceByUser", Boolean.toString(z));
        afLogForce = (AFPurchaseDetails + 117) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectOaid(boolean z) {
        boolean z2;
        int i = AFPurchaseDetails + 117;
        afLogForce = i % 128;
        if (i % 2 == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            AFb1bSDK aFb1bSDKV = AFInAppEventParameterName().v();
            String[] strArr = new String[1];
            strArr[1] = String.valueOf(z);
            aFb1bSDKV.AFInAppEventParameterName("setCollectOaid", strArr);
        } else {
            AFInAppEventParameterName().v().AFInAppEventParameterName("setCollectOaid", String.valueOf(z));
        }
        AFInAppEventType("collectOAID", Boolean.toString(z));
        AFPurchaseDetails = (afLogForce + 27) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setConsentData(AppsFlyerConsent appsFlyerConsent) {
        int i = AFPurchaseDetails + 61;
        afLogForce = i % 128;
        if (i % 2 == 0) {
            Objects.requireNonNull(appsFlyerConsent);
            AFInAppEventParameterName().getLevel().d = appsFlyerConsent;
        } else {
            Objects.requireNonNull(appsFlyerConsent);
            AFInAppEventParameterName().getLevel().d = appsFlyerConsent;
        }
        afLogForce = (AFPurchaseDetails + 91) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCurrencyCode(String str) {
        char c;
        int i = AFPurchaseDetails + 23;
        afLogForce = i % 128;
        if (i % 2 == 0) {
            c = 18;
        } else {
            c = 'E';
        }
        if (c != 'E') {
            AFb1bSDK aFb1bSDKV = AFInAppEventParameterName().v();
            String[] strArr = new String[0];
            strArr[1] = str;
            aFb1bSDKV.AFInAppEventParameterName("setCurrencyCode", strArr);
        } else {
            AFInAppEventParameterName().v().AFInAppEventParameterName("setCurrencyCode", str);
        }
        AppsFlyerProperties.getInstance().set("currencyCode", str);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerUserId(String str) {
        AFPurchaseDetails = (afLogForce + 39) % 128;
        AFInAppEventParameterName().v().AFInAppEventParameterName("setCustomerUserId", str);
        AFInAppEventType("AppUserId", str);
        AFInAppEventType("waitForCustomerId", false);
        AFPurchaseDetails = (afLogForce + 103) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDebugLog(boolean z) {
        AFLogger.LogLevel logLevel;
        int i = AFPurchaseDetails + 39;
        afLogForce = i % 128;
        if (i % 2 != 0 ? z : z) {
            logLevel = AFLogger.LogLevel.DEBUG;
            AFPurchaseDetails = (afLogForce + 87) % 128;
        } else {
            logLevel = AFLogger.LogLevel.NONE;
        }
        setLogLevel(logLevel);
        int i2 = AFPurchaseDetails + 53;
        afLogForce = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        try {
            throw null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableAdvertisingIdentifiers(boolean z) {
        char c;
        boolean z2 = false;
        if (!z) {
            z2 = true;
        }
        AFb1rSDK.AFInAppEventType = Boolean.valueOf(z2);
        AFd1kSDK aFd1kSDKAFInAppEventParameterName = AFInAppEventParameterName();
        aFd1kSDKAFInAppEventParameterName.getLevel().unregisterClient = z;
        if (z) {
            int i = AFPurchaseDetails + 71;
            afLogForce = i % 128;
            if (i % 2 == 0) {
                c = '0';
            } else {
                c = '2';
            }
            if (c == '2') {
                aFd1kSDKAFInAppEventParameterName.getLevel().AFLogger = null;
                return;
            }
            aFd1kSDKAFInAppEventParameterName.getLevel().AFLogger = null;
            try {
                throw null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        AFe1cSDK aFe1cSDKAfInfoLog = aFd1kSDKAFInAppEventParameterName.afInfoLog();
        aFe1cSDKAfInfoLog.valueOf.execute(aFe1cSDKAfInfoLog.new AnonymousClass2(new AFf1uSDK(AFInAppEventParameterName())));
        AFPurchaseDetails = (afLogForce + 51) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableNetworkData(boolean z) {
        AFPurchaseDetails = (afLogForce + 47) % 128;
        AFInAppEventType("disableCollectNetworkData", z);
        AFPurchaseDetails = (afLogForce + 83) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setExtension(String str) {
        char c;
        int i = AFPurchaseDetails + 43;
        afLogForce = i % 128;
        if (i % 2 == 0) {
            c = 'T';
        } else {
            c = '[';
        }
        if (c != '[') {
            AFb1bSDK aFb1bSDKV = AFInAppEventParameterName().v();
            String[] strArr = new String[0];
            strArr[1] = str;
            aFb1bSDKV.AFInAppEventParameterName("setExtension", strArr);
        } else {
            AFInAppEventParameterName().v().AFInAppEventParameterName("setExtension", str);
        }
        AppsFlyerProperties.getInstance().set("sdkExtension", str);
        int i2 = AFPurchaseDetails + 47;
        afLogForce = i2 % 128;
        if (i2 % 2 == 0) {
            try {
                throw null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setImeiData(String str) {
        char c;
        int i = afLogForce + 15;
        AFPurchaseDetails = i % 128;
        if (i % 2 != 0) {
            c = '\f';
        } else {
            c = 30;
        }
        if (c != 30) {
            AFb1bSDK aFb1bSDKV = AFInAppEventParameterName().v();
            String[] strArr = new String[0];
            strArr[1] = str;
            aFb1bSDKV.AFInAppEventParameterName("setImeiData", strArr);
        } else {
            AFInAppEventParameterName().v().AFInAppEventParameterName("setImeiData", str);
        }
        AFInAppEventParameterName().i().unregisterClient = str;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setIsUpdate(boolean z) {
        AFPurchaseDetails = (afLogForce + 117) % 128;
        AFInAppEventParameterName().v().AFInAppEventParameterName("setIsUpdate", String.valueOf(z));
        AppsFlyerProperties.getInstance().set("IS_UPDATE", z);
        afLogForce = (AFPurchaseDetails + 115) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setLogLevel(AFLogger.LogLevel logLevel) {
        boolean z;
        int i = AFPurchaseDetails + 111;
        afLogForce = i % 128;
        if (i % 2 != 0) {
            if (logLevel.getLevel() > AFLogger.LogLevel.NONE.getLevel()) {
                z = true;
            } else {
                z = false;
            }
            AFInAppEventParameterName().v().AFInAppEventParameterName("log", String.valueOf(z));
            AppsFlyerProperties.getInstance().set("logLevel", logLevel.getLevel());
            if (!z) {
                AFPurchaseDetails = (afLogForce + 71) % 128;
                AFInAppEventParameterName().AFLogger$LogLevel().AFInAppEventType();
                return;
            } else {
                AFInAppEventParameterName().AFLogger$LogLevel().registerClient();
                return;
            }
        }
        logLevel.getLevel();
        AFLogger.LogLevel.NONE.getLevel();
        try {
            throw null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setMinTimeBetweenSessions(int i) {
        int i2 = afLogForce + 59;
        AFPurchaseDetails = i2 % 128;
        if (i2 % 2 != 0) {
            this.unregisterClient = TimeUnit.SECONDS.toMillis(i);
            try {
                throw null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        this.unregisterClient = TimeUnit.SECONDS.toMillis(i);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOaidData(String str) {
        afLogForce = (AFPurchaseDetails + 13) % 128;
        AFInAppEventParameterName().v().AFInAppEventParameterName("setOaidData", str);
        AFb1rSDK.values = str;
        int i = AFPurchaseDetails + 99;
        afLogForce = i % 128;
        if (i % 2 == 0) {
            try {
                throw null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOneLinkCustomDomain(String... strArr) {
        afLogForce = (AFPurchaseDetails + 87) % 128;
        AFInAppEventParameterName().afRDLog().unregisterClient = strArr;
        afLogForce = (AFPurchaseDetails + 67) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOutOfStore(String str) {
        int i = AFPurchaseDetails;
        afLogForce = (i + 27) % 128;
        if (str != null) {
            afLogForce = (i + 97) % 128;
            AppsFlyerProperties.getInstance().set("api_store_value", str.toLowerCase(Locale.getDefault()));
            return;
        }
        AFLogger.afWarnLog("Cannot set setOutOfStore with null", true);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPhoneNumber(String str) {
        boolean z;
        int i = afLogForce + 91;
        AFPurchaseDetails = i % 128;
        if (i % 2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            AFInAppEventParameterName().getLevel().valueOf = AFb1lSDK.AFKeystoreWrapper(str);
            int i2 = afLogForce + 83;
            AFPurchaseDetails = i2 % 128;
            if (i2 % 2 != 0) {
                try {
                    throw null;
                } finally {
                }
            }
            return;
        }
        AFInAppEventParameterName().getLevel().valueOf = AFb1lSDK.AFKeystoreWrapper(str);
        try {
            throw null;
        } finally {
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPluginInfo(PluginInfo pluginInfo) {
        AFPurchaseDetails = (afLogForce + 47) % 128;
        Objects.requireNonNull(pluginInfo);
        AFInAppEventParameterName().afWarnLog().AFKeystoreWrapper(pluginInfo);
        AFPurchaseDetails = (afLogForce + 83) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setResolveDeepLinkURLs(String... strArr) {
        AFPurchaseDetails = (afLogForce + 15) % 128;
        AFc1vSDK aFc1vSDKAfRDLog = AFInAppEventParameterName().afRDLog();
        aFc1vSDKAfRDLog.AFLogger.clear();
        aFc1vSDKAfRDLog.AFLogger.addAll(Arrays.asList(strArr));
        afLogForce = (AFPurchaseDetails + 115) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setSharingFilter(String... strArr) {
        char c;
        int i = afLogForce + 3;
        AFPurchaseDetails = i % 128;
        if (i % 2 != 0) {
            c = 'F';
        } else {
            c = '0';
        }
        setSharingFilterForPartners(strArr);
        if (c != 'F') {
            int i2 = afLogForce + 35;
            AFPurchaseDetails = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            } else {
                return;
            }
        }
        try {
            throw null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setSharingFilterForPartners(String... strArr) {
        AFInAppEventParameterName().getLevel().AFKeystoreWrapper = new AFd1wSDK(strArr);
        int i = afLogForce + 91;
        AFPurchaseDetails = i % 128;
        if (i % 2 != 0) {
            try {
                throw null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(String... strArr) {
        boolean z;
        int i = afLogForce + 107;
        AFPurchaseDetails = i % 128;
        if (i % 2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            AFInAppEventParameterName().v().AFInAppEventParameterName("setUserEmails", strArr);
            setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
            return;
        }
        AFInAppEventParameterName().v().AFInAppEventParameterName("setUserEmails", strArr);
        setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
        try {
            throw null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(Context context) {
        boolean zLJI = MethodIDManager.LJI(196626);
        afLogForce = (AFPurchaseDetails + 17) % 128;
        start(context, null);
        AFPurchaseDetails = (afLogForce + 57) % 128;
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(DeepLinkListener deepLinkListener) {
        int i = afLogForce + 41;
        AFPurchaseDetails = i % 128;
        char c = 2;
        if (i % 2 == 0) {
            c = 24;
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        if (c != 24) {
            subscribeForDeepLink(deepLinkListener, timeUnit.toMillis(3L));
        } else {
            subscribeForDeepLink(deepLinkListener, timeUnit.toMillis(3L));
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void waitForCustomerUserId(boolean z) {
        int i = AFPurchaseDetails + 79;
        afLogForce = i % 128;
        int i2 = i % 2;
        AFInAppEventType("waitForCustomerId", z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFInAppEventParameterName(AFf1gSDK aFf1gSDK) {
        afLogForce = (AFPurchaseDetails + 95) % 128;
        AFd1kSDK aFd1kSDKAFInAppEventParameterName = AFInAppEventParameterName();
        if (aFf1gSDK == AFf1gSDK.SUCCESS) {
            aFd1kSDKAFInAppEventParameterName.getCurrency().AFInAppEventParameterName();
            AFPurchaseDetails = (afLogForce + 81) % 128;
        }
        if (!aFd1kSDKAFInAppEventParameterName.v().values()) {
            afLogForce = (AFPurchaseDetails + 33) % 128;
            aFd1kSDKAFInAppEventParameterName.AFLogger$LogLevel().AFInAppEventParameterName();
        } else {
            aFd1kSDKAFInAppEventParameterName.AFLogger$LogLevel().values();
        }
    }

    public static boolean AFInAppEventType(String str) {
        int i = afLogForce + 103;
        AFPurchaseDetails = i % 128;
        int i2 = i % 2;
        boolean z = AppsFlyerProperties.getInstance().getBoolean(str, false);
        int i3 = afLogForce + 21;
        AFPurchaseDetails = i3 % 128;
        if (i3 % 2 != 0) {
            return z;
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized android.content.SharedPreferences AFKeystoreWrapper(android.content.Context r6) {
        /*
            java.lang.Class<com.appsflyer.internal.AFb1vSDK> r5 = com.appsflyer.internal.AFb1vSDK.class
            monitor-enter(r5)
            com.appsflyer.internal.AFb1vSDK r0 = AFKeystoreWrapper()     // Catch: java.lang.Throwable -> L5f
            android.content.SharedPreferences r0 = r0.afInfoLog     // Catch: java.lang.Throwable -> L5f
            r4 = 0
            r1 = 1
            if (r0 != 0) goto Le
            goto L10
        Le:
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            if (r0 == r1) goto L3b
            int r0 = com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails     // Catch: java.lang.Throwable -> L5f
            int r0 = r0 + 35
            int r0 = r0 % 128
            com.appsflyer.internal.AFb1vSDK.afLogForce = r0     // Catch: java.lang.Throwable -> L5f
            android.os.StrictMode$ThreadPolicy r3 = android.os.StrictMode.allowThreadDiskReads()     // Catch: java.lang.Throwable -> L5f
            com.appsflyer.internal.AFb1vSDK r2 = AFKeystoreWrapper()     // Catch: java.lang.Throwable -> L30
            android.content.Context r1 = X.C786410Ut5.N3(r6)     // Catch: java.lang.Throwable -> L30
            java.lang.String r0 = "appsflyer-data"
            android.content.SharedPreferences r0 = X.C810670Vr7.LIZJ(r1, r4, r0)     // Catch: java.lang.Throwable -> L30
            r2.afInfoLog = r0     // Catch: java.lang.Throwable -> L30
            goto L38
        L30:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L5f
            android.os.StrictMode.setThreadPolicy(r3)     // Catch: java.lang.Throwable -> L5f
            throw r0     // Catch: java.lang.Throwable -> L5f
        L38:
            android.os.StrictMode.setThreadPolicy(r3)     // Catch: java.lang.Throwable -> L5f
        L3b:
            com.appsflyer.internal.AFb1vSDK r0 = AFKeystoreWrapper()     // Catch: java.lang.Throwable -> L5f
            android.content.SharedPreferences r2 = r0.afInfoLog     // Catch: java.lang.Throwable -> L5f
            int r0 = com.appsflyer.internal.AFb1vSDK.afLogForce     // Catch: java.lang.Throwable -> L5f
            int r1 = r0 + 103
            int r0 = r1 % 128
            com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails = r0     // Catch: java.lang.Throwable -> L5f
            int r0 = r1 % 2
            r1 = 81
            if (r0 == 0) goto L52
            r0 = 29
            goto L54
        L52:
            r0 = 81
        L54:
            if (r0 != r1) goto L58
            monitor-exit(r5)
            return r2
        L58:
            r0 = 0
            throw r0     // Catch: java.lang.Throwable -> L5a
        L5a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L5f
            throw r0     // Catch: java.lang.Throwable -> L5f
        L5f:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1vSDK.AFKeystoreWrapper(android.content.Context):android.content.SharedPreferences");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void valueOf(com.appsflyer.internal.AFa1qSDK r7) {
        /*
            r6 = this;
            int r0 = com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails
            int r0 = r0 + 109
            int r1 = r0 % 128
            com.appsflyer.internal.AFb1vSDK.afLogForce = r1
            java.lang.String r0 = r7.e
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L28
            int r1 = r1 + 9
            int r0 = r1 % 128
            com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails = r0
            int r0 = r1 % 2
            if (r0 != 0) goto L28
            r1 = 1
        L19:
            boolean r0 = r6.values()
            if (r0 == 0) goto L2a
            int r0 = com.appsflyer.internal.AFb1vSDK.afLogForce
            int r0 = r0 + 67
            int r0 = r0 % 128
            com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails = r0
            return
        L28:
            r1 = 0
            goto L19
        L2a:
            r5 = 0
            if (r1 == 0) goto L6b
            com.appsflyer.AppsFlyerProperties r1 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r0 = "launchProtectEnabled"
            boolean r0 = r1.getBoolean(r0, r3)
            if (r0 == 0) goto L65
            int r0 = com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails
            int r0 = r0 + 49
            int r0 = r0 % 128
            com.appsflyer.internal.AFb1vSDK.afLogForce = r0
            boolean r0 = r6.d()
            if (r0 == 0) goto L65
            int r0 = com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails
            int r1 = r0 + 35
            int r0 = r1 % 128
            com.appsflyer.internal.AFb1vSDK.afLogForce = r0
            int r0 = r1 % 2
            if (r0 == 0) goto L5f
            com.appsflyer.attribution.AppsFlyerRequestListener r2 = r7.values
            if (r2 == 0) goto L5e
            r1 = 10
            java.lang.String r0 = "Event timeout. Check 'minTimeBetweenSessions' param"
            r2.onError(r1, r0)
        L5e:
            return
        L5f:
            throw r5     // Catch: java.lang.Throwable -> L60
        L60:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            throw r0
        L65:
            long r0 = java.lang.System.currentTimeMillis()
            r6.e = r0
        L6b:
            com.appsflyer.internal.AFd1kSDK r0 = r6.AFInAppEventParameterName()
            java.util.concurrent.ScheduledExecutorService r4 = r0.AFKeystoreWrapper()
            com.appsflyer.internal.AFb1vSDK$AFa1vSDK r3 = new com.appsflyer.internal.AFb1vSDK$AFa1vSDK
            r3.<init>(r6, r7, r2)
            r1 = 0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.appsflyer.internal.AFj1rSDK.values(r4, r3, r1, r0)
            int r0 = com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails
            int r1 = r0 + 69
            int r0 = r1 % 128
            com.appsflyer.internal.AFb1vSDK.afLogForce = r0
            int r0 = r1 % 2
            if (r0 == 0) goto L8c
            return
        L8c:
            throw r5     // Catch: java.lang.Throwable -> L8d
        L8d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1vSDK.valueOf(com.appsflyer.internal.AFa1qSDK):void");
    }

    public static String values(String str) {
        boolean z;
        String strValueOf;
        boolean z2;
        boolean z3;
        boolean z4;
        int i = AFPurchaseDetails + 17;
        afLogForce = i % 128;
        if (i % 2 != 0) {
            if (str == null) {
                return null;
            }
            if (str.matches("fb\\d*?://authorize.*")) {
                if (str.contains("access_token")) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    int i2 = afLogForce + 29;
                    AFPurchaseDetails = i2 % 128;
                    if (i2 % 2 != 0) {
                        strValueOf = valueOf(str);
                        if (strValueOf.length() == 0) {
                            return str;
                        }
                    } else {
                        strValueOf = valueOf(str);
                        if (strValueOf.length() == 0) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (!z2) {
                            return str;
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    if (strValueOf.contains("&")) {
                        arrayList = new ArrayList(Arrays.asList(strValueOf.split("&")));
                    } else {
                        arrayList.add(strValueOf);
                    }
                    StringBuilder sb = new StringBuilder();
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (!z3) {
                            String str2 = (String) it2.next();
                            if (str2.contains("access_token")) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            if (z4) {
                                if (sb.length() != 0) {
                                    sb.append("&");
                                } else if (!str2.startsWith("?")) {
                                    sb.append("?");
                                }
                                sb.append(str2);
                            } else {
                                AFPurchaseDetails = (afLogForce + 87) % 128;
                                it2.remove();
                            }
                        } else {
                            return str.replace(strValueOf, sb.toString());
                        }
                    }
                } else {
                    return str;
                }
            } else {
                return str;
            }
        } else {
            try {
                throw null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static Map<String, Object> AFInAppEventParameterName(Map<String, Object> map) {
        boolean z;
        int i = afLogForce + 121;
        AFPurchaseDetails = i % 128;
        if (i % 2 != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (map.containsKey("meta")) {
                Map<String, Object> map2 = (Map) map.get("meta");
                afLogForce = (AFPurchaseDetails + 75) % 128;
                return map2;
            }
            HashMap map3 = new HashMap();
            map.put("meta", map3);
            return map3;
        }
        map.containsKey("meta");
        try {
            throw null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }

    public static String AFKeystoreWrapper(String str) {
        boolean z;
        int i = afLogForce + 33;
        AFPurchaseDetails = i % 128;
        if (i % 2 != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return AppsFlyerProperties.getInstance().getString(str);
        }
        AppsFlyerProperties.getInstance().getString(str);
        try {
            throw null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0044 A[Catch: all -> 0x0062, PHI: r3
      0x0044: PHI (r3v3 android.os.Bundle) = (r3v2 android.os.Bundle), (r3v5 android.os.Bundle) binds: [B:19:0x0033, B:23:0x0042] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0062, blocks: (B:22:0x003e, B:24:0x0044, B:16:0x002c), top: B:31:0x0025 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String valueOf(android.app.Activity r7) {
        /*
            java.lang.String r6 = "af"
            int r0 = com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails
            int r0 = r0 + 103
            int r0 = r0 % 128
            com.appsflyer.internal.AFb1vSDK.afLogForce = r0
            r2 = 0
            r1 = 1
            if (r7 == 0) goto L2a
            r0 = 0
        Lf:
            r4 = 0
            if (r0 == r1) goto L35
            android.content.Intent r5 = r7.getIntent()
            if (r5 == 0) goto L28
            r0 = 1
        L19:
            if (r0 != r1) goto L35
            int r0 = com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails
            int r1 = r0 + 101
            int r0 = r1 % 128
            com.appsflyer.internal.AFb1vSDK.afLogForce = r0
            int r0 = r1 % 2
            if (r0 != 0) goto L3e
            goto L2c
        L28:
            r0 = 0
            goto L19
        L2a:
            r0 = 1
            goto Lf
        L2c:
            android.os.Bundle r3 = INVOKEVIRTUAL_com_appsflyer_internal_AFb1vSDK_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(r5)     // Catch: java.lang.Throwable -> L62
            if (r3 != 0) goto L33
            r2 = 1
        L33:
            if (r2 == 0) goto L44
        L35:
            int r0 = com.appsflyer.internal.AFb1vSDK.afLogForce
            int r0 = r0 + 101
            int r0 = r0 % 128
            com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails = r0
            return r4
        L3e:
            android.os.Bundle r3 = INVOKEVIRTUAL_com_appsflyer_internal_AFb1vSDK_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(r5)     // Catch: java.lang.Throwable -> L62
            if (r3 == 0) goto L35
        L44:
            java.lang.String r4 = r3.getString(r6)     // Catch: java.lang.Throwable -> L62
            if (r4 == 0) goto L35
            com.appsflyer.AFLogger r2 = com.appsflyer.AFLogger.INSTANCE     // Catch: java.lang.Throwable -> L64
            com.appsflyer.internal.AFg1aSDK r1 = com.appsflyer.internal.AFg1aSDK.ENGAGEMENT     // Catch: java.lang.Throwable -> L64
            java.lang.String r0 = "Push Notification received af payload = "
            java.lang.String r0 = r0.concat(r4)     // Catch: java.lang.Throwable -> L64
            r2.w(r1, r0)     // Catch: java.lang.Throwable -> L64
            r3.remove(r6)     // Catch: java.lang.Throwable -> L64
            android.content.Intent r0 = r5.putExtras(r3)     // Catch: java.lang.Throwable -> L64
            r7.setIntent(r0)     // Catch: java.lang.Throwable -> L64
            goto L35
        L62:
            r3 = move-exception
            goto L65
        L64:
            r3 = move-exception
        L65:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)
            com.appsflyer.AFLogger r2 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1aSDK r1 = com.appsflyer.internal.AFg1aSDK.ENGAGEMENT
            java.lang.String r0 = r3.getMessage()
            r2.e(r1, r0, r3)
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1vSDK.valueOf(android.app.Activity):java.lang.String");
    }

    private void values(Map<String, Object> map) {
        if (!AppsFlyerProperties.getInstance().getBoolean("collectAndroidIdForceByUser", false) && !AppsFlyerProperties.getInstance().getBoolean("collectIMEIForceByUser", false)) {
            afLogForce = (AFPurchaseDetails + 115) % 128;
            if (map.get("advertiserId") != null) {
                afLogForce = (AFPurchaseDetails + 79) % 128;
                try {
                    if (AFc1tSDK.values(AFInAppEventParameterName().getLevel().AFInAppEventType)) {
                        afLogForce = (AFPurchaseDetails + 77) % 128;
                        if (map.remove("android_id") != null) {
                            int i = afLogForce + 37;
                            AFPurchaseDetails = i % 128;
                            if (i % 2 != 0) {
                                try {
                                    throw null;
                                } finally {
                                    TryCatchGuardChecker.doCheck(th);
                                }
                            }
                        }
                    }
                    if (AFc1tSDK.values(AFInAppEventParameterName().i().unregisterClient) && map.remove("imei") != null) {
                        afLogForce = (AFPurchaseDetails + 107) % 128;
                        return;
                    }
                    return;
                } catch (Exception th) {
                }
            }
        }
        afLogForce = (AFPurchaseDetails + 119) % 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFInAppEventParameterName(boolean z) {
        if (z) {
            AFPurchaseDetails = (afLogForce + 111) % 128;
            AFInAppEventParameterName().AFLogger$LogLevel().valueOf();
        } else {
            AFInAppEventParameterName().AFLogger$LogLevel().AFKeystoreWrapper();
            AFPurchaseDetails = (afLogForce + 45) % 128;
        }
    }

    public static /* synthetic */ AFf1eSDK AFKeystoreWrapper(AFb1vSDK aFb1vSDK) {
        AFPurchaseDetails = (afLogForce + 115) % 128;
        AFf1eSDK aFf1eSDKE = aFb1vSDK.e();
        int i = AFPurchaseDetails + 115;
        afLogForce = i % 128;
        if (i % 2 == 0) {
            try {
                throw null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return aFf1eSDKE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if (r0 != 'J') goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r1 = com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails + 19;
        com.appsflyer.internal.AFb1vSDK.afLogForce = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        if ((r1 % 2) != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        r0 = 'L';
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (r0 == 'L') goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        return "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        r0 = '(';
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        if (r2 == (-1)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0046, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0049, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004a, code lost:
    
        r1 = r4.substring(r2);
        com.appsflyer.internal.AFb1vSDK.afLogForce = (com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails + 67) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String valueOf(java.lang.String r4) {
        /*
            int r0 = com.appsflyer.internal.AFb1vSDK.afLogForce
            int r1 = r0 + 79
            int r0 = r1 % 128
            com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails = r0
            int r0 = r1 % 2
            if (r0 == 0) goto L41
            r0 = 1
        Ld:
            r3 = -1
            if (r0 == 0) goto L38
            r0 = 12
            int r2 = r4.indexOf(r0)
            r1 = 74
            if (r2 != r3) goto L35
            r0 = 5
        L1b:
            if (r0 == r1) goto L4a
        L1d:
            int r0 = com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails
            int r1 = r0 + 19
            int r0 = r1 % 128
            com.appsflyer.internal.AFb1vSDK.afLogForce = r0
            int r0 = r1 % 2
            r1 = 76
            if (r0 != 0) goto L32
            r0 = 76
        L2d:
            if (r0 == r1) goto L43
            java.lang.String r0 = ""
            return r0
        L32:
            r0 = 40
            goto L2d
        L35:
            r0 = 74
            goto L1b
        L38:
            r0 = 63
            int r2 = r4.indexOf(r0)
            if (r2 != r3) goto L4a
            goto L1d
        L41:
            r0 = 0
            goto Ld
        L43:
            r0 = 0
            throw r0     // Catch: java.lang.Throwable -> L45
        L45:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            throw r0
        L4a:
            java.lang.String r1 = r4.substring(r2)
            int r0 = com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails
            int r0 = r0 + 67
            int r0 = r0 % 128
            com.appsflyer.internal.AFb1vSDK.afLogForce = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1vSDK.valueOf(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (X.C786410Ut5.b4(com.google.android.gms.common.GoogleApiAvailability.getInstance(), r5) == 0) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean values(android.content.Context r5) {
        /*
            int r0 = com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails
            int r1 = r0 + 93
            int r0 = r1 % 128
            com.appsflyer.internal.AFb1vSDK.afLogForce = r0
            int r0 = r1 % 2
            r2 = 1
            r4 = 0
            if (r0 != 0) goto L19
            com.google.android.gms.common.GoogleApiAvailability r0 = com.google.android.gms.common.GoogleApiAvailability.getInstance()     // Catch: java.lang.Throwable -> L31
            int r0 = X.C786410Ut5.b4(r0, r5)     // Catch: java.lang.Throwable -> L31
            if (r0 != 0) goto L35
            goto L23
        L19:
            com.google.android.gms.common.GoogleApiAvailability r0 = com.google.android.gms.common.GoogleApiAvailability.getInstance()     // Catch: java.lang.Throwable -> L31
            int r0 = X.C786410Ut5.b4(r0, r5)     // Catch: java.lang.Throwable -> L31
            if (r0 != 0) goto L35
        L23:
            int r0 = com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails
            int r1 = r0 + 51
            int r0 = r1 % 128
            com.appsflyer.internal.AFb1vSDK.afLogForce = r0
            int r0 = r1 % 2
            if (r0 != 0) goto L30
            return r4
        L30:
            return r2
        L31:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L35:
            android.content.pm.PackageManager r1 = r5.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L52
            java.lang.String r0 = "com.google.android.gms"
            X.C786410Ut5.Y3(r1, r0, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L52
            int r0 = com.appsflyer.internal.AFb1vSDK.afLogForce
            int r1 = r0 + 29
            int r0 = r1 % 128
            com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails = r0
            int r0 = r1 % 2
            if (r0 == 0) goto L51
            r0 = 0
            throw r0     // Catch: java.lang.Throwable -> L4c
        L4c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            throw r0
        L51:
            return r2
        L52:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)
            com.appsflyer.AFLogger r2 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1aSDK r1 = com.appsflyer.internal.AFg1aSDK.GENERAL
            java.lang.String r0 = "WARNING:  Google Play Services is unavailable. "
            r2.e(r1, r0, r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1vSDK.values(android.content.Context):boolean");
    }

    private AFf1hSDK.AFa1uSDK AFKeystoreWrapper(final Map<String, String> map) {
        AFf1hSDK.AFa1uSDK aFa1uSDK = new AFf1hSDK.AFa1uSDK() { // from class: com.appsflyer.internal.AFb1vSDK.2
            @Override // com.appsflyer.internal.AFf1hSDK.AFa1uSDK
            public final void AFKeystoreWrapper(String str) {
                AFb1vSDK.this.AFInAppEventParameterName().afRDLog().values(str, DeepLinkResult.Error.NETWORK);
            }

            @Override // com.appsflyer.internal.AFf1hSDK.AFa1uSDK
            public final void valueOf(Map<String, String> map2) {
                for (String str : map2.keySet()) {
                    map.put(str, map2.get(str));
                }
                AFb1vSDK.this.AFInAppEventParameterName().afRDLog().AFKeystoreWrapper(map);
            }
        };
        afLogForce = (AFPurchaseDetails + 25) % 128;
        return aFa1uSDK;
    }

    public static int valueOf(AFd1qSDK aFd1qSDK) {
        char c;
        int iAFInAppEventType;
        int i = AFPurchaseDetails + 45;
        afLogForce = i % 128;
        if (i % 2 == 0) {
            c = '\t';
        } else {
            c = 'R';
        }
        if (c != 'R') {
            iAFInAppEventType = AFInAppEventType(aFd1qSDK, "appsFlyerAdRevenueCount", false);
        } else {
            iAFInAppEventType = AFInAppEventType(aFd1qSDK, "appsFlyerAdRevenueCount", true);
        }
        int i2 = afLogForce + 9;
        AFPurchaseDetails = i2 % 128;
        if (i2 % 2 != 0) {
            try {
                throw null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return iAFInAppEventType;
    }

    private void values(AppsFlyerConversionListener appsFlyerConversionListener) {
        if (appsFlyerConversionListener == null) {
            int i = afLogForce + 89;
            AFPurchaseDetails = i % 128;
            if (i % 2 != 0) {
                try {
                    throw null;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return;
        }
        this.AFInAppEventType = appsFlyerConversionListener;
        int i2 = afLogForce + 33;
        AFPurchaseDetails = i2 % 128;
        if (i2 % 2 != 0) {
        }
    }

    public final AFd1qSDK AFInAppEventParameterName(Context context) {
        afLogForce = (AFPurchaseDetails + 87) % 128;
        valueOf(context);
        AFd1qSDK aFd1qSDKValueOf = AFInAppEventParameterName().valueOf();
        AFPurchaseDetails = (afLogForce + 61) % 128;
        return aFd1qSDKValueOf;
    }

    public static int AFInAppEventParameterName(AFd1qSDK aFd1qSDK) {
        afLogForce = (AFPurchaseDetails + 21) % 128;
        int iAFInAppEventType = AFInAppEventType(aFd1qSDK, "appsFlyerAdImpressionCount", true);
        afLogForce = (AFPurchaseDetails + 77) % 128;
        return iAFInAppEventType;
    }

    public final void valueOf(Context context) {
        AFd1nSDK aFd1nSDK = this.force;
        if (context != null) {
            afLogForce = (AFPurchaseDetails + 57) % 128;
            AFd1lSDK aFd1lSDK = aFd1nSDK.AFInAppEventParameterName;
            if (context != null) {
                aFd1lSDK.AFKeystoreWrapper = C786410Ut5.N3(context);
                AFPurchaseDetails = (afLogForce + 11) % 128;
            }
        }
    }

    public static /* synthetic */ Application AFInAppEventParameterName(AFb1vSDK aFb1vSDK) {
        int i = (afLogForce + 15) % 128;
        AFPurchaseDetails = i;
        Application application = aFb1vSDK.v;
        afLogForce = (i + 39) % 128;
        return application;
    }

    public static /* synthetic */ void valueOf(AFd1kSDK aFd1kSDK) {
        int i = afLogForce + 9;
        AFPurchaseDetails = i % 128;
        if (i % 2 != 0) {
        }
        aFd1kSDK.afErrorLog().valueOf();
    }

    public static /* synthetic */ void valueOf(AFb1vSDK aFb1vSDK) {
        AFPurchaseDetails = (afLogForce + 31) % 128;
        aFb1vSDK.unregisterClient();
        afLogForce = (AFPurchaseDetails + 49) % 128;
    }

    private /* synthetic */ void AFInAppEventType(Context context, Intent intent) {
        AFPurchaseDetails = (afLogForce + 117) % 128;
        valueOf(context);
        AFc1vSDK aFc1vSDKAfRDLog = AFInAppEventParameterName().afRDLog();
        AFd1qSDK aFd1qSDKValueOf = AFInAppEventParameterName().valueOf();
        boolean z = false;
        if (intent != null && "android.intent.action.VIEW".equals(intent.getAction())) {
            AFPurchaseDetails = (afLogForce + 15) % 128;
            Uri data = intent.getData();
            if (data != null) {
                AFPurchaseDetails = (afLogForce + 9) % 128;
                if (!data.toString().isEmpty()) {
                    afLogForce = (AFPurchaseDetails + 43) % 128;
                    z = true;
                }
            }
        }
        if (aFd1qSDKValueOf.AFInAppEventType("ddl_sent") && !z) {
            aFc1vSDKAfRDLog.values("No direct deep link", (DeepLinkResult.Error) null);
        } else {
            aFc1vSDKAfRDLog.AFInAppEventParameterName(AFc1oSDK.AFKeystoreWrapper(aFc1vSDKAfRDLog.e.getPurchaseToken()), intent, context);
        }
    }

    private void values(Context context, AFh1tSDK aFh1tSDK) {
        AFPurchaseDetails = (afLogForce + 47) % 128;
        valueOf(context);
        AFh1wSDK aFh1wSDKAFLogger = AFInAppEventParameterName().AFLogger();
        AFg1cSDK aFg1cSDKAFInAppEventParameterName = AFa1oSDK.AFInAppEventParameterName(context);
        boolean z = true;
        if (aFh1wSDKAFLogger.values()) {
            int i = AFPurchaseDetails + 27;
            afLogForce = i % 128;
            if (i % 2 == 0) {
                z = false;
            }
            if (z) {
                aFh1wSDKAFLogger.AFKeystoreWrapper.put("api_name", aFh1tSDK.toString());
                aFh1wSDKAFLogger.AFInAppEventParameterName(aFg1cSDKAFInAppEventParameterName);
            } else {
                aFh1wSDKAFLogger.AFKeystoreWrapper.put("api_name", aFh1tSDK.toString());
                aFh1wSDKAFLogger.AFInAppEventParameterName(aFg1cSDKAFInAppEventParameterName);
                try {
                    throw null;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        aFh1wSDKAFLogger.AFInAppEventType();
    }

    public final void AFKeystoreWrapper(Context context, Intent intent) {
        AFj1ySDK aFj1ySDK = new AFj1ySDK(intent);
        if (aFj1ySDK.AFInAppEventParameterName("appsflyer_preinstall") != null) {
            AFLogger(aFj1ySDK.AFInAppEventParameterName("appsflyer_preinstall"));
            AFPurchaseDetails = (afLogForce + 51) % 128;
        }
        AppsFlyerProperties.getInstance();
        String strAFInAppEventParameterName = aFj1ySDK.AFInAppEventParameterName("referrer");
        if (strAFInAppEventParameterName != null) {
            afLogForce = (AFPurchaseDetails + 107) % 128;
            AFInAppEventParameterName(context).AFInAppEventParameterName("referrer", strAFInAppEventParameterName);
            AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
            appsFlyerProperties.set("AF_REFERRER", strAFInAppEventParameterName);
            appsFlyerProperties.AFInAppEventParameterName = strAFInAppEventParameterName;
            if (AppsFlyerProperties.getInstance().AFKeystoreWrapper()) {
                values(context, AFh1tSDK.onReceive);
                AFInAppEventParameterName(strAFInAppEventParameterName);
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void appendParametersToDeepLinkingURL(String str, Map<String, String> map) {
        int i = AFPurchaseDetails + 9;
        afLogForce = i % 128;
        if (i % 2 == 0) {
            AFc1vSDK aFc1vSDKAfRDLog = AFInAppEventParameterName().afRDLog();
            aFc1vSDKAfRDLog.AFInAppEventParameterName = str;
            aFc1vSDKAfRDLog.values = map;
            try {
                throw null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        AFc1vSDK aFc1vSDKAfRDLog2 = AFInAppEventParameterName().afRDLog();
        aFc1vSDKAfRDLog2.AFInAppEventParameterName = str;
        aFc1vSDKAfRDLog2.values = map;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void performOnAppAttribution(Context context, URI uri) {
        boolean z;
        int i = (AFPurchaseDetails + 47) % 128;
        afLogForce = i;
        if (uri != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i2 = i + 35;
            AFPurchaseDetails = i2 % 128;
            if (i2 % 2 == 0 ? !uri.toString().isEmpty() : !uri.toString().isEmpty()) {
                if (context == null) {
                    AFInAppEventParameterName().afRDLog().values("Context is \"" + context + "\"", DeepLinkResult.Error.NETWORK);
                    int i3 = AFPurchaseDetails + 67;
                    afLogForce = i3 % 128;
                    if (i3 % 2 == 0) {
                        return;
                    } else {
                        return;
                    }
                }
                valueOf(context);
                AFInAppEventParameterName().afRDLog().AFKeystoreWrapper(context, AFc1oSDK.AFKeystoreWrapper(AFInAppEventParameterName().getPurchaseToken()), UriProtector.parse(uri.toString()));
                return;
            }
        }
        AFInAppEventParameterName().afRDLog().values("Link is \"" + uri + "\"", DeepLinkResult.Error.NETWORK);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void performOnDeepLinking(final Intent intent, Context context) {
        boolean z;
        int i = AFPurchaseDetails;
        afLogForce = (i + 101) % 128;
        if (intent == null) {
            AFInAppEventParameterName().afRDLog().values("performOnDeepLinking was called with null intent", DeepLinkResult.Error.DEVELOPER_ERROR);
            return;
        }
        if (context == null) {
            int i2 = i + 55;
            afLogForce = i2 % 128;
            if (i2 % 2 == 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                AFInAppEventParameterName().afRDLog().values("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
                return;
            } else {
                AFInAppEventParameterName().afRDLog().values("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
                return;
            }
        }
        final Context contextN3 = C786410Ut5.N3(context);
        valueOf(contextN3);
        AFInAppEventParameterName().values().execute(new Runnable() { // from class: X.13ny
            @Override // java.lang.Runnable
            public final void run() {
                AFb1vSDK.lambda$semisugar$AFInAppEventType$0(this.LL, contextN3, intent);
            }
        });
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerConversionListener(Context context, AppsFlyerConversionListener appsFlyerConversionListener) {
        afLogForce = (AFPurchaseDetails + 105) % 128;
        AFInAppEventParameterName().v().AFInAppEventParameterName("registerConversionListener", new String[0]);
        values(appsFlyerConversionListener);
        afLogForce = (AFPurchaseDetails + 119) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerValidatorListener(Context context, AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener) {
        AFInAppEventParameterName().v().AFInAppEventParameterName("registerValidatorListener", new String[0]);
        if (appsFlyerInAppPurchaseValidatorListener == null) {
            afLogForce = (AFPurchaseDetails + 115) % 128;
        } else {
            AFKeystoreWrapper = appsFlyerInAppPurchaseValidatorListener;
            afLogForce = (AFPurchaseDetails + 83) % 128;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendAdImpression(Context context, Map<String, Object> map) {
        int iAFInAppEventParameterName = AFInAppEventParameterName(AFInAppEventParameterName(context));
        HashMap map2 = new HashMap();
        map2.put("ad_network", map);
        map2.put("adimpression_counter", Integer.valueOf(iAFInAppEventParameterName));
        valueOf(context, map2, new AFh1vSDK());
        afLogForce = (AFPurchaseDetails + 99) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendAdRevenue(Context context, Map<String, Object> map) {
        int iValueOf = valueOf(AFInAppEventParameterName(context));
        HashMap map2 = new HashMap();
        map2.put("ad_network", map);
        map2.put("adrevenue_counter", Integer.valueOf(iValueOf));
        valueOf(context, map2, new AFh1sSDK());
        afLogForce = (AFPurchaseDetails + 57) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerIdAndLogSession(String str, Context context) {
        if (context != null) {
            if (values()) {
                setCustomerUserId(str);
                String referrer = AppsFlyerProperties.getInstance().getReferrer(AFInAppEventParameterName().valueOf());
                values(context, AFh1tSDK.setCustomerIdAndLogSession);
                AFInAppEventParameterName().i();
                if (referrer == null) {
                    referrer = "";
                }
                if (context instanceof Activity) {
                    afLogForce = (AFPurchaseDetails + 43) % 128;
                    ((Activity) context).getIntent();
                }
                AFKeystoreWrapper(context, referrer);
                afLogForce = (AFPurchaseDetails + 99) % 128;
                return;
            }
            setCustomerUserId(str);
        }
        int i = afLogForce + 69;
        AFPurchaseDetails = i % 128;
        if (i % 2 == 0) {
            return;
        }
        try {
            throw null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setHost(String str, String str2) {
        String strTrim;
        int i = AFPurchaseDetails + 5;
        afLogForce = i % 128;
        if (i % 2 != 0) {
            if (!AFc1tSDK.AFInAppEventType(str2)) {
                int i2 = afLogForce + 95;
                AFPurchaseDetails = i2 % 128;
                if (i2 % 2 != 0) {
                    try {
                        throw null;
                    } finally {
                    }
                }
                if (str != null) {
                    strTrim = str.trim();
                    afLogForce = (AFPurchaseDetails + 53) % 128;
                } else {
                    strTrim = "";
                }
                AFe1gSDK.valueOf(new AFe1kSDK(strTrim, str2.trim()));
                return;
            }
            return;
        }
        AFc1tSDK.AFInAppEventType(str2);
        try {
            throw null;
        } finally {
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPartnerData(String str, Map<String, Object> map) {
        String strConcat;
        AFd1pSDK level = AFInAppEventParameterName().getLevel();
        if (level.AFInAppEventParameterName == null) {
            level.AFInAppEventParameterName = new AFc1cSDK();
            afLogForce = (AFPurchaseDetails + 53) % 128;
        }
        AFc1cSDK aFc1cSDK = level.AFInAppEventParameterName;
        if (str != null) {
            int i = AFPurchaseDetails + 23;
            afLogForce = i % 128;
            if (i % 2 == 0) {
                if (str.isEmpty()) {
                    return;
                }
            } else if (str.isEmpty()) {
                return;
            }
            if (map != null && !map.isEmpty()) {
                int length = C786410Ut5.J3(new JSONObject(map)).length();
                if (length > 1000) {
                    HashMap map2 = new HashMap();
                    map2.put("error", "limit exceeded: ".concat(String.valueOf(length)));
                    aFc1cSDK.values.put(str, map2);
                    return;
                } else {
                    aFc1cSDK.AFInAppEventParameterName.put(str, map);
                    aFc1cSDK.values.remove(str);
                    return;
                }
            }
            if (aFc1cSDK.AFInAppEventParameterName.remove(str) == null) {
                strConcat = "Partner data is missing or `null`";
            } else {
                strConcat = "Cleared partner data for ".concat(str);
            }
            AFLogger.afWarnLog(strConcat);
            AFPurchaseDetails = (afLogForce + 123) % 128;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(AppsFlyerProperties.EmailsCryptType emailsCryptType, String... strArr) {
        boolean z;
        ArrayList arrayList = new ArrayList(strArr.length + 1);
        arrayList.add(emailsCryptType.toString());
        arrayList.addAll(Arrays.asList(strArr));
        AFInAppEventParameterName().v().AFInAppEventParameterName("setUserEmails", (String[]) arrayList.toArray(new String[strArr.length + 1]));
        AppsFlyerProperties.getInstance().set("userEmailsCryptType", emailsCryptType.getValue());
        HashMap map = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        int length = strArr.length;
        String str = null;
        int i = 0;
        while (true) {
            if (i < length) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                break;
            }
            AFPurchaseDetails = (afLogForce + 77) % 128;
            String str2 = strArr[i];
            if (AnonymousClass1.AFKeystoreWrapper[emailsCryptType.ordinal()] != 2) {
                arrayList2.add(AFb1lSDK.AFKeystoreWrapper(str2));
                str = "sha256_el_arr";
            } else {
                arrayList2.add(str2);
                str = "plain_el_arr";
            }
            i++;
        }
        map.put(str, arrayList2);
        AppsFlyerProperties.getInstance().setUserEmails(C786410Ut5.J3(new JSONObject(map)));
        int i2 = AFPurchaseDetails + 59;
        afLogForce = i2 % 128;
        if (i2 % 2 == 0) {
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(Context context, String str) {
        char c;
        boolean zLJI = MethodIDManager.LJI(196626);
        int i = AFPurchaseDetails + 27;
        afLogForce = i % 128;
        if (i % 2 == 0) {
            c = 26;
        } else {
            c = 18;
        }
        start(context, str, null);
        if (c != 26) {
            if (zLJI) {
                MethodIDManager.LJ();
            }
        } else {
            try {
                throw null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (zLJI) {
                    MethodIDManager.LJ();
                }
                throw th;
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void stop(boolean z, Context context) {
        afLogForce = (AFPurchaseDetails + 21) % 128;
        valueOf(context);
        final AFd1kSDK aFd1kSDKAFInAppEventParameterName = AFInAppEventParameterName();
        aFd1kSDKAFInAppEventParameterName.i().registerClient = z;
        aFd1kSDKAFInAppEventParameterName.values().submit(new Runnable() { // from class: X.13o2
            @Override // java.lang.Runnable
            public final void run() {
                AFb1vSDK.lambda$semisugar$valueOf$0(aFd1kSDKAFInAppEventParameterName);
            }
        });
        if (z) {
            aFd1kSDKAFInAppEventParameterName.valueOf().valueOf("is_stop_tracking_used", true);
            afLogForce = (AFPurchaseDetails + 73) % 128;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(DeepLinkListener deepLinkListener, long j) {
        int i = AFPurchaseDetails + 79;
        afLogForce = i % 128;
        if (i % 2 == 0) {
            AFInAppEventParameterName().afRDLog().valueOf = deepLinkListener;
            AFInAppEventParameterName().afRDLog().registerClient = j;
        } else {
            AFInAppEventParameterName().afRDLog().valueOf = deepLinkListener;
            AFInAppEventParameterName().afRDLog().registerClient = j;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void updateServerUninstallToken(Context context, String str) {
        boolean z;
        valueOf(context);
        AFg1nSDK aFg1nSDK = new AFg1nSDK(context);
        if (str != null && !str.trim().isEmpty()) {
            AFLogger.INSTANCE.i(AFg1aSDK.UNINSTALL, "Firebase Refreshed Token = ".concat(str));
            AFg1oSDK aFg1oSDKValueOf = aFg1nSDK.valueOf();
            if (aFg1oSDKValueOf == null || !str.equals(aFg1oSDKValueOf.values)) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (aFg1oSDKValueOf != null && jCurrentTimeMillis - aFg1oSDKValueOf.AFInAppEventParameterName <= TimeUnit.SECONDS.toMillis(2L)) {
                    z = false;
                } else {
                    z = true;
                }
                AFg1oSDK aFg1oSDK = new AFg1oSDK(str, jCurrentTimeMillis, !z);
                aFg1nSDK.values.AFInAppEventParameterName("afUninstallToken", aFg1oSDK.values);
                aFg1nSDK.values.AFKeystoreWrapper("afUninstallToken_received_time", aFg1oSDK.AFInAppEventParameterName);
                aFg1nSDK.values.valueOf("afUninstallToken_queued", aFg1oSDK.values());
                if (z) {
                    AFg1nSDK.values(str);
                    return;
                }
                return;
            }
            return;
        }
        AFLogger.INSTANCE.w(AFg1aSDK.UNINSTALL, "Firebase Token is either empty or null and was not registered.");
    }

    public final void valueOf(Context context, String str) {
        JSONObject jSONObject;
        JSONArray jSONArray;
        afLogForce = (AFPurchaseDetails + 51) % 128;
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strAFKeystoreWrapper = AFInAppEventParameterName(context).AFKeystoreWrapper("extraReferrers", (String) null);
            if (strAFKeystoreWrapper == null) {
                jSONObject = new JSONObject();
                jSONArray = new JSONArray();
            } else {
                jSONObject = new JSONObject(strAFKeystoreWrapper);
                if (jSONObject.has(str)) {
                    jSONArray = new JSONArray((String) jSONObject.get(str));
                } else {
                    jSONArray = new JSONArray();
                }
            }
            if (jSONArray.length() < 5) {
                jSONArray.put(jCurrentTimeMillis);
            }
            if (jSONObject.length() >= 4) {
                valueOf(jSONObject);
            }
            jSONObject.put(str, jSONArray.toString());
            AFInAppEventParameterName(context).AFInAppEventParameterName("extraReferrers", C786410Ut5.J3(jSONObject));
            int i = AFPurchaseDetails + 11;
            afLogForce = i % 128;
            if (i % 2 == 0) {
                try {
                    throw null;
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            AFLogger.afErrorLogForExcManagerOnly("error at addReferrer", e);
        } catch (Throwable th) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        r0 = 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        if (r0 == 26) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        r0 = '1';
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        if (r0 != '#') goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0049, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004a, code lost:
    
        r5.AFInAppEventParameterName("CACHED_CHANNEL", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004d, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        if (r0 != 'Y') goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        r1 = com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails + 33;
        com.appsflyer.internal.AFb1vSDK.afLogForce = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if ((r1 % 2) != 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String AFKeystoreWrapper(com.appsflyer.internal.AFd1qSDK r5, java.lang.String r6) {
        /*
            int r0 = com.appsflyer.internal.AFb1vSDK.afLogForce
            int r1 = r0 + 85
            int r0 = r1 % 128
            com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails = r0
            int r0 = r1 % 2
            r4 = 0
            java.lang.String r3 = "CACHED_CHANNEL"
            if (r0 == 0) goto L34
            java.lang.String r2 = r5.AFKeystoreWrapper(r3, r4)
            r1 = 89
            if (r2 == 0) goto L31
            r0 = 12
        L19:
            if (r0 == r1) goto L4a
        L1b:
            int r0 = com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails
            int r1 = r0 + 33
            int r0 = r1 % 128
            com.appsflyer.internal.AFb1vSDK.afLogForce = r0
            int r0 = r1 % 2
            r1 = 26
            if (r0 != 0) goto L2e
            r0 = 26
        L2b:
            if (r0 == r1) goto L44
            return r2
        L2e:
            r0 = 49
            goto L2b
        L31:
            r0 = 89
            goto L19
        L34:
            java.lang.String r2 = r5.AFKeystoreWrapper(r3, r4)
            r1 = 35
            if (r2 == 0) goto L41
            r0 = 65
        L3e:
            if (r0 == r1) goto L4a
            goto L1b
        L41:
            r0 = 35
            goto L3e
        L44:
            throw r4     // Catch: java.lang.Throwable -> L45
        L45:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            throw r0
        L4a:
            r5.AFInAppEventParameterName(r3, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1vSDK.AFKeystoreWrapper(com.appsflyer.internal.AFd1qSDK, java.lang.String):java.lang.String");
    }

    public static /* synthetic */ long valueOf(AFb1vSDK aFb1vSDK, long j) {
        boolean z;
        int i = AFPurchaseDetails + 89;
        int i2 = i % 128;
        afLogForce = i2;
        if (i % 2 == 0) {
            z = true;
        } else {
            z = false;
        }
        aFb1vSDK.registerClient = j;
        if (!z) {
            AFPurchaseDetails = (i2 + 97) % 128;
            return j;
        }
        try {
            throw null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }

    public static /* synthetic */ void values(AFb1vSDK aFb1vSDK, AFa1qSDK aFa1qSDK) {
        boolean z;
        int i = AFPurchaseDetails + 121;
        afLogForce = i % 128;
        if (i % 2 == 0) {
            z = true;
        } else {
            z = false;
        }
        aFb1vSDK.values(aFa1qSDK);
        if (!z) {
            int i2 = AFPurchaseDetails + 17;
            afLogForce = i2 % 128;
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

    public final void AFInAppEventType(AFa1qSDK aFa1qSDK, AFh1xSDK aFh1xSDK) {
        AFKeystoreWrapper(aFa1qSDK, aFh1xSDK);
        if (AFInAppEventParameterName().i().AFLogger == null) {
            AppsFlyerRequestListener appsFlyerRequestListener = aFa1qSDK.values;
            if (appsFlyerRequestListener != null) {
                appsFlyerRequestListener.onError(41, "No dev key");
                afLogForce = (AFPurchaseDetails + 73) % 128;
            }
            int i = AFPurchaseDetails + 49;
            afLogForce = i % 128;
            if (i % 2 != 0) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        String referrer = AppsFlyerProperties.getInstance().getReferrer(AFInAppEventParameterName().valueOf());
        if (referrer == null) {
            int i2 = AFPurchaseDetails + 67;
            afLogForce = i2 % 128;
            int i3 = i2 % 2;
            referrer = "";
        } else {
            afLogForce = (AFPurchaseDetails + 37) % 128;
        }
        aFa1qSDK.unregisterClient = referrer;
        valueOf(aFa1qSDK);
    }

    private String AFInAppEventType(Context context, String str) {
        boolean z;
        boolean z2 = true;
        if (context == null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            valueOf(context);
            String strAFInAppEventType = AFInAppEventParameterName().AFInAppEventType().AFInAppEventType(str);
            int i = afLogForce + 37;
            AFPurchaseDetails = i % 128;
            if (i % 2 != 0) {
                return strAFInAppEventType;
            }
            return strAFInAppEventType;
        }
        int i2 = afLogForce + 65;
        AFPurchaseDetails = i2 % 128;
        if (i2 % 2 != 0) {
            z2 = false;
        }
        if (z2) {
            return null;
        }
        try {
            throw null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }

    public static void AFKeystoreWrapper(AFa1qSDK aFa1qSDK, AFh1xSDK aFh1xSDK) {
        if (aFh1xSDK != null) {
            int i = afLogForce;
            AFPurchaseDetails = (i + 103) % 128;
            aFa1qSDK.valueOf = aFh1xSDK.AFInAppEventType;
            aFa1qSDK.d = aFh1xSDK.AFInAppEventParameterName;
            AFPurchaseDetails = (i + 5) % 128;
        }
        int i2 = afLogForce + 13;
        AFPurchaseDetails = i2 % 128;
        if (i2 % 2 != 0) {
            try {
                throw null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static int values(AFd1qSDK aFd1qSDK, boolean z) {
        AFPurchaseDetails = (afLogForce + 47) % 128;
        int iAFInAppEventType = AFInAppEventType(aFd1qSDK, "appsFlyerInAppEventCount", z);
        AFPurchaseDetails = (afLogForce + 9) % 128;
        return iAFInAppEventType;
    }

    public static int AFInAppEventType(AFd1qSDK aFd1qSDK, boolean z) {
        char c;
        int i = AFPurchaseDetails + 125;
        afLogForce = i % 128;
        if (i % 2 == 0) {
            c = '!';
        } else {
            c = 'O';
        }
        if (c == 'O') {
            return AFInAppEventType(aFd1qSDK, "appsFlyerCount", z);
        }
        AFInAppEventType(aFd1qSDK, "appsFlyerCount", z);
        try {
            throw null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }

    private void AFKeystoreWrapper(Context context, String str) {
        AFh1mSDK aFh1mSDK = new AFh1mSDK();
        valueOf(context);
        aFh1mSDK.e = null;
        aFh1mSDK.AFInAppEventParameterName = null;
        aFh1mSDK.unregisterClient = str;
        aFh1mSDK.valueOf = null;
        valueOf(aFh1mSDK);
        AFPurchaseDetails = (afLogForce + 39) % 128;
    }

    public static void AFInAppEventType(String str, boolean z) {
        afLogForce = (AFPurchaseDetails + 59) % 128;
        AppsFlyerProperties.getInstance().set(str, z);
        int i = afLogForce + 83;
        AFPurchaseDetails = i % 128;
        if (i % 2 != 0) {
            try {
                throw null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static String AFKeystoreWrapper(SimpleDateFormat simpleDateFormat, long j) {
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String str = simpleDateFormat.format(new Date(j));
        afLogForce = (AFPurchaseDetails + 117) % 128;
        return str;
    }

    public static /* synthetic */ boolean AFInAppEventType(AFb1vSDK aFb1vSDK, boolean z) {
        boolean z2;
        int i = AFPurchaseDetails + 63;
        afLogForce = i % 128;
        if (i % 2 == 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        aFb1vSDK.i = z;
        if (z2) {
            return z;
        }
        try {
            throw null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }

    public static void AFInAppEventType(String str, String str2) {
        AFPurchaseDetails = (afLogForce + 59) % 128;
        AppsFlyerProperties.getInstance().set(str, str2);
        AFPurchaseDetails = (afLogForce + 13) % 128;
    }

    public static int AFInAppEventType(AFd1qSDK aFd1qSDK, String str, boolean z) {
        int iValueOf = aFd1qSDK.valueOf(str, 0);
        if (z) {
            afLogForce = (AFPurchaseDetails + 15) % 128;
            int i = iValueOf + 1;
            aFd1qSDK.AFInAppEventParameterName(str, i);
            AFPurchaseDetails = (afLogForce + 73) % 128;
            return i;
        }
        return iValueOf;
    }

    private void valueOf(Context context, Map<String, Object> map, AFa1qSDK aFa1qSDK) {
        int i = afLogForce + 33;
        AFPurchaseDetails = i % 128;
        if (i % 2 != 0) {
            valueOf(context);
            aFa1qSDK.valueOf((Map<String, ?>) map);
            AFInAppEventType(aFa1qSDK, e(context));
        } else {
            valueOf(context);
            aFa1qSDK.valueOf((Map<String, ?>) map);
            AFInAppEventType(aFa1qSDK, e(context));
        }
    }

    private void values(Context context, String str, Map<String, Object> map) {
        AFh1jSDK aFh1jSDK = new AFh1jSDK();
        aFh1jSDK.e = str;
        aFh1jSDK.AFInAppEventParameterName = map;
        AFInAppEventType(aFh1jSDK, e(context));
        int i = AFPurchaseDetails + 39;
        afLogForce = i % 128;
        if (i % 2 == 0) {
            try {
                throw null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final AppsFlyerLib init(String str, AppsFlyerConversionListener appsFlyerConversionListener, Context context) {
        char c;
        String str2;
        AFi1xSDK aFi1ySDK;
        long j;
        boolean zLJI = MethodIDManager.LJI(202255);
        if (this.w) {
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return this;
        }
        this.w = true;
        AFInAppEventParameterName().i().AFLogger = str;
        AFb1mSDK.valueOf(str);
        if (context != null) {
            c = '\t';
        } else {
            c = 26;
        }
        if (c != 26) {
            int i = afLogForce + 17;
            AFPurchaseDetails = i % 128;
            if (i % 2 == 0) {
                valueOf(context);
                Application applicationAFInAppEventParameterName = AFb1uSDK.AFInAppEventParameterName(context);
                if (applicationAFInAppEventParameterName != null) {
                    this.v = applicationAFInAppEventParameterName;
                    AFInAppEventParameterName().afErrorLog().AFInAppEventParameterName();
                    AFInAppEventParameterName().AFLogger().values = System.currentTimeMillis();
                    AFe1cSDK aFe1cSDKAfInfoLog = AFInAppEventParameterName().afInfoLog();
                    aFe1cSDKAfInfoLog.valueOf.execute(aFe1cSDKAfInfoLog.new AnonymousClass2(new AFf1uSDK(AFInAppEventParameterName())));
                    AFh1cSDK aFh1cSDKAfLogForce = AFInAppEventParameterName().afLogForce();
                    if (Build.VERSION.SDK_INT >= 31) {
                        aFi1ySDK = new AFi1uSDK(aFh1cSDKAfLogForce.AFKeystoreWrapper);
                    } else {
                        aFi1ySDK = new AFi1ySDK(aFh1cSDKAfLogForce.AFKeystoreWrapper);
                    }
                    aFh1cSDKAfLogForce.valueOf = aFi1ySDK;
                    AFInAppEventParameterName().getCurrency().values(new AFd1jSDK.AFa1zSDK() { // from class: X.13oD
                        @Override // com.appsflyer.internal.AFd1jSDK.AFa1zSDK
                        public final void onConfigurationChanged(boolean z) {
                            this.LIZ.AFInAppEventParameterName(z);
                        }
                    });
                    AFInAppEventParameterName().registerClient().AFKeystoreWrapper(e());
                    AFi1aSDK aFi1aSDKForce = AFInAppEventParameterName().force();
                    Runnable runnable = new Runnable() { // from class: X.13o7
                        @Override // java.lang.Runnable
                        public final void run() {
                            AFb1vSDK.lambda$semisugar$AFLogger$0(this.LL);
                        }
                    };
                    AFi1lSDK aFi1lSDKValueOf = aFi1aSDKForce.valueOf(runnable);
                    Runnable runnableAFInAppEventType = aFi1aSDKForce.AFInAppEventType(aFi1lSDKValueOf, runnable);
                    aFi1aSDKForce.AFInAppEventParameterName(aFi1lSDKValueOf);
                    aFi1aSDKForce.AFInAppEventParameterName(new AFi1eSDK(aFi1aSDKForce.AFInAppEventParameterName.AFInAppEventType(), runnableAFInAppEventType));
                    aFi1aSDKForce.AFInAppEventParameterName(new AFi1nSDK(runnableAFInAppEventType, aFi1aSDKForce.AFInAppEventParameterName, new AFi1oSDK()));
                    aFi1aSDKForce.AFInAppEventParameterName(new AFi1bSDK(runnableAFInAppEventType, aFi1aSDKForce.AFInAppEventParameterName));
                    aFi1aSDKForce.AFInAppEventParameterName(runnableAFInAppEventType);
                    if (!aFi1aSDKForce.values()) {
                        Context context2 = aFi1aSDKForce.AFInAppEventParameterName.w().AFKeystoreWrapper;
                        AFd1kSDK aFd1kSDK = aFi1aSDKForce.AFInAppEventParameterName;
                        List<ResolveInfo> listQueryIntentContentProviders = context2.getPackageManager().queryIntentContentProviders(new Intent("com.appsflyer.referrer.INSTALL_PROVIDER"), 0);
                        if (listQueryIntentContentProviders != null && !listQueryIntentContentProviders.isEmpty()) {
                            ArrayList arrayList = new ArrayList();
                            Iterator<ResolveInfo> it2 = listQueryIntentContentProviders.iterator();
                            while (it2.hasNext()) {
                                ProviderInfo providerInfo = it2.next().providerInfo;
                                if (providerInfo != null) {
                                    arrayList.add(new AFi1iSDK(providerInfo, runnableAFInAppEventType, aFd1kSDK));
                                } else {
                                    AFLogger.INSTANCE.w(AFg1aSDK.PREINSTALL, "com.appsflyer.referrer.INSTALL_PROVIDER Action is set for non ContentProvider component");
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                aFi1aSDKForce.AFKeystoreWrapper.addAll(arrayList);
                                AFLogger.INSTANCE.d(AFg1aSDK.PREINSTALL, "Detected " + arrayList.size() + " valid preinstall provider(s)");
                            }
                        }
                    }
                    for (AFi1hSDK aFi1hSDK : aFi1aSDKForce.AFKeystoreWrapper()) {
                        aFi1hSDK.values(aFi1aSDKForce.AFInAppEventParameterName.w().AFKeystoreWrapper);
                    }
                    final AFg1wSDK aFg1wSDKI = this.force.i();
                    AFd1sSDK aFd1sSDKAFInAppEventType = AFInAppEventParameterName().AFInAppEventType();
                    aFg1wSDKI.valueOf = System.currentTimeMillis();
                    AFg1uSDK aFg1uSDK = aFg1wSDKI.AFInAppEventParameterName;
                    byte[] bArrValues = AFb1lSDK.values(AFb1kSDK.valueOf(aFd1sSDKAFInAppEventType.valueOf, aFd1sSDKAFInAppEventType.AFKeystoreWrapper) + aFg1wSDKI.valueOf);
                    if (bArrValues != null && bArrValues.length > 0) {
                        if (bArrValues.length > 8) {
                            bArrValues = Arrays.copyOfRange(bArrValues, 0, 8);
                        }
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                        byteBufferAllocate.put(bArrValues);
                        byteBufferAllocate.flip();
                        j = byteBufferAllocate.getLong();
                    } else {
                        j = -1;
                    }
                    aFg1wSDKI.values = aFg1uSDK.AFKeystoreWrapper(j, aFg1wSDKI.AFKeystoreWrapper.AFKeystoreWrapper, new AFg1uSDK.AFa1zSDK() { // from class: com.appsflyer.internal.AFg1wSDK.3
                        public AnonymousClass3() {
                        }

                        @Override // com.appsflyer.internal.AFg1uSDK.AFa1zSDK
                        public final void AFInAppEventType(String str3, Exception exc) {
                            AFg1wSDK.this.AFInAppEventType = new ConcurrentHashMap();
                            String message = exc.getMessage();
                            if (message == null) {
                                message = "unknown";
                            }
                            AFg1wSDK.this.values();
                            AFg1wSDK.this.AFInAppEventType.put("error", message);
                            AFLogger.afErrorLog(str3, exc, true, true, false);
                        }

                        @Override // com.appsflyer.internal.AFg1uSDK.AFa1zSDK
                        public final void AFInAppEventType(String str3, String str4) {
                            AFg1wSDK.this.AFInAppEventType = new ConcurrentHashMap();
                            AFg1wSDK.this.AFInAppEventType.put("signedData", str3);
                            AFg1wSDK.this.AFInAppEventType.put("signature", str4);
                            AFg1wSDK.this.values();
                        }
                    });
                } else {
                    afLogForce = (AFPurchaseDetails + 19) % 128;
                    if (zLJI) {
                        MethodIDManager.LJ();
                    }
                    return this;
                }
            } else {
                valueOf(context);
                AFb1uSDK.AFInAppEventParameterName(context);
                try {
                    throw null;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (zLJI) {
                        MethodIDManager.LJ();
                    }
                    throw th;
                }
            }
        } else {
            AFLogger.INSTANCE.w(AFg1aSDK.REFERRER, "context is null, Google Install Referrer will be not initialized");
        }
        AFb1bSDK aFb1bSDKV = AFInAppEventParameterName().v();
        String[] strArr = new String[2];
        strArr[0] = str;
        if (appsFlyerConversionListener == null) {
            str2 = "null";
        } else {
            str2 = "conversionDataListener";
        }
        strArr[1] = str2;
        aFb1bSDKV.AFInAppEventParameterName("init", strArr);
        AFLogger.INSTANCE.force(AFg1aSDK.GENERAL, C786410Ut5.j4("Initializing AppsFlyer SDK: (v%s.%s)", new Object[]{"6.14.0", values}));
        this.AFInAppEventType = appsFlyerConversionListener;
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return this;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(Context context, String str, Map<String, Object> map) throws Throwable {
        char c;
        int i = afLogForce + 7;
        AFPurchaseDetails = i % 128;
        if (i % 2 != 0) {
            c = 'Y';
        } else {
            c = 'G';
        }
        if (c != 'G') {
            C2204961BRm.LLJZIJLIL(this, context, str, map, new C0WZX("dzBzEgMqT9naWU4kV1yNaEAr35CqUcZV5bdsfuleyw==", new String[]{"01c45"}));
        } else {
            C2204961BRm.LLJZIJLIL(this, context, str, map, new C0WZX("dzBzEgMqT9naWU4kV1yNaEAr35CqUcZV5bdsfuleyw==", new String[]{"01c45"}));
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logLocation(Context context, double d, double d2) {
        AFInAppEventParameterName().v().AFInAppEventParameterName("logLocation", String.valueOf(d), String.valueOf(d2));
        HashMap map = new HashMap();
        map.put("af_long", Double.toString(d2));
        map.put("af_lat", Double.toString(d));
        values(context, "af_location_coordinates", map);
        int i = AFPurchaseDetails + 19;
        afLogForce = i % 128;
        if (i % 2 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[PHI: r1
      0x0027: PHI (r1v2 com.appsflyer.PurchaseHandler) = (r1v1 com.appsflyer.PurchaseHandler), (r1v4 com.appsflyer.PurchaseHandler) binds: [B:13:0x0056, B:8:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void sendInAppPurchaseData(android.content.Context r5, java.util.Map<java.lang.String, java.lang.Object> r6, com.appsflyer.PurchaseHandler.PurchaseValidationCallback r7) {
        /*
            r4 = this;
            int r0 = com.appsflyer.internal.AFb1vSDK.afLogForce
            int r1 = r0 + 39
            int r0 = r1 % 128
            com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails = r0
            int r0 = r1 % 2
            r3 = 1
            if (r0 == 0) goto L59
            r0 = 1
        Le:
            java.lang.String r2 = "purchases"
            if (r0 == 0) goto L43
            r4.valueOf(r5)
            com.appsflyer.internal.AFd1kSDK r0 = r4.AFInAppEventParameterName()
            com.appsflyer.PurchaseHandler r1 = r0.unregisterClient()
            java.lang.String[] r0 = new java.lang.String[r3]
            r0[r3] = r2
            boolean r0 = r1.valueOf(r6, r7, r0)
            if (r0 == 0) goto L3a
        L27:
            com.appsflyer.internal.AFf1mSDK r3 = new com.appsflyer.internal.AFf1mSDK
            com.appsflyer.internal.AFd1kSDK r0 = r1.AFInAppEventParameterName
            r3.<init>(r6, r7, r0)
            com.appsflyer.internal.AFe1cSDK r2 = r1.valueOf
            java.util.concurrent.Executor r1 = r2.valueOf
            com.appsflyer.internal.AFe1cSDK$2 r0 = new com.appsflyer.internal.AFe1cSDK$2
            r0.<init>(r3)
            r1.execute(r0)
        L3a:
            int r0 = com.appsflyer.internal.AFb1vSDK.AFPurchaseDetails
            int r0 = r0 + 121
            int r0 = r0 % 128
            com.appsflyer.internal.AFb1vSDK.afLogForce = r0
            return
        L43:
            r4.valueOf(r5)
            com.appsflyer.internal.AFd1kSDK r0 = r4.AFInAppEventParameterName()
            com.appsflyer.PurchaseHandler r1 = r0.unregisterClient()
            java.lang.String[] r0 = new java.lang.String[]{r2}
            boolean r0 = r1.valueOf(r6, r7, r0)
            if (r0 == 0) goto L3a
            goto L27
        L59:
            r0 = 0
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1vSDK.sendInAppPurchaseData(android.content.Context, java.util.Map, com.appsflyer.PurchaseHandler$PurchaseValidationCallback):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        AFPurchaseDetails = (afLogForce + 95) % 128;
        valueOf(context);
        PurchaseHandler purchaseHandlerUnregisterClient = AFInAppEventParameterName().unregisterClient();
        if (purchaseHandlerUnregisterClient.valueOf(map, purchaseValidationCallback, "subscriptions")) {
            AFf1ySDK aFf1ySDK = new AFf1ySDK(map, purchaseValidationCallback, purchaseHandlerUnregisterClient.AFInAppEventParameterName);
            AFe1cSDK aFe1cSDK = purchaseHandlerUnregisterClient.valueOf;
            aFe1cSDK.valueOf.execute(aFe1cSDK.new AnonymousClass2(aFf1ySDK));
        }
        int i = AFPurchaseDetails + 117;
        afLogForce = i % 128;
        if (i % 2 == 0) {
            try {
                throw null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPreinstallAttribution(String str, String str2, String str3) {
        char c;
        JSONObject jSONObject = new JSONObject();
        if (str != null) {
            try {
                jSONObject.put("pid", str);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                AFLogger.afErrorLog(e.getMessage(), e);
            }
        }
        if (str2 != null) {
            AFPurchaseDetails = (afLogForce + 63) % 128;
            jSONObject.put("c", str2);
        }
        if (str3 != null) {
            jSONObject.put("af_siteid", str3);
            AFPurchaseDetails = (afLogForce + 103) % 128;
        }
        if (jSONObject.has("pid")) {
            int i = afLogForce + 21;
            AFPurchaseDetails = i % 128;
            if (i % 2 != 0) {
                c = 'P';
            } else {
                c = '@';
            }
            if (c == '@') {
                AFInAppEventType("preInstallName", C786410Ut5.J3(jSONObject));
                return;
            }
            AFInAppEventType("preInstallName", C786410Ut5.J3(jSONObject));
            try {
                throw null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        afLogForce = (AFPurchaseDetails + 1) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(Context context, String str, final AppsFlyerRequestListener appsFlyerRequestListener) {
        boolean z;
        boolean zLJI = MethodIDManager.LJI(196626);
        if (AFInAppEventParameterName().afErrorLogForExcManagerOnly().values()) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        if (!this.w) {
            z = true;
        } else {
            z = false;
        }
        if (z && str == null) {
            if (appsFlyerRequestListener != null) {
                appsFlyerRequestListener.onError(41, "No dev key");
            }
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        valueOf(context);
        final AFh1wSDK aFh1wSDKAFLogger = AFInAppEventParameterName().AFLogger();
        aFh1wSDKAFLogger.AFInAppEventParameterName(AFa1oSDK.AFInAppEventParameterName(context));
        if (this.v == null) {
            afLogForce = (AFPurchaseDetails + 89) % 128;
            Application applicationAFInAppEventParameterName = AFb1uSDK.AFInAppEventParameterName(context);
            if (applicationAFInAppEventParameterName != null) {
                this.v = applicationAFInAppEventParameterName;
            } else {
                if (zLJI) {
                    MethodIDManager.LJ();
                    return;
                }
                return;
            }
        }
        AFInAppEventParameterName().v().AFInAppEventParameterName("start", str);
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1aSDK aFg1aSDK = AFg1aSDK.GENERAL;
        String str2 = values;
        aFLogger.i(aFg1aSDK, C786410Ut5.j4("Starting AppsFlyer: (v%s.%s)", new Object[]{"6.14.0", str2}));
        aFLogger.i(aFg1aSDK, "Build Number: " + str2);
        AppsFlyerProperties.getInstance().loadProperties(AFInAppEventParameterName().valueOf());
        if (!TextUtils.isEmpty(str)) {
            AFInAppEventParameterName().i().AFLogger = str;
            AFb1mSDK.valueOf(str);
            afLogForce = (AFPurchaseDetails + 15) % 128;
        } else if (TextUtils.isEmpty(AFInAppEventParameterName().i().AFLogger)) {
            int i = afLogForce + 117;
            int i2 = i % 128;
            AFPurchaseDetails = i2;
            if (i % 2 != 0) {
                try {
                    throw null;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (zLJI) {
                        MethodIDManager.LJ();
                    }
                    throw th;
                }
            }
            if (appsFlyerRequestListener != null) {
                int i3 = i2 + 111;
                afLogForce = i3 % 128;
                if (i3 % 2 == 0) {
                    appsFlyerRequestListener.onError(3, "No dev key");
                } else {
                    appsFlyerRequestListener.onError(41, "No dev key");
                }
            }
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        AFInAppEventParameterName().registerClient().AFKeystoreWrapper(e());
        unregisterClient();
        AFInAppEventType(this.v.getBaseContext());
        AFInAppEventParameterName().afDebugLog().AFKeystoreWrapper();
        this.force.afErrorLogForExcManagerOnly().AFInAppEventType(context, new AFd1xSDK.AFa1zSDK() { // from class: com.appsflyer.internal.AFb1vSDK.5
            @Override // com.appsflyer.internal.AFd1xSDK.AFa1zSDK
            public final void valueOf() {
                Context context2 = AFb1vSDK.this.AFInAppEventParameterName().w().AFKeystoreWrapper;
                AFh1wSDK aFh1wSDK = aFh1wSDKAFLogger;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = aFh1wSDK.unregisterClient;
                if (j != 0) {
                    long j2 = jCurrentTimeMillis - j;
                    if (j2 > 0 && j2 < 1000) {
                        j2 = 1000;
                    }
                    long seconds = TimeUnit.MILLISECONDS.toSeconds(j2);
                    aFh1wSDK.v = seconds;
                    aFh1wSDK.AFInAppEventParameterName.AFKeystoreWrapper("prev_session_dur", seconds);
                }
                AFb1vSDK.this.AFInAppEventParameterName().getCurrency().AFInAppEventType();
                AFb1bSDK aFb1bSDKV = AFb1vSDK.this.AFInAppEventParameterName().v();
                if (aFb1bSDKV.e()) {
                    aFb1bSDKV.AFInAppEventType();
                    if (context2 != null && !AppsFlyerLib.getInstance().isStopped()) {
                        aFb1bSDKV.values(context2.getPackageName(), context2.getPackageManager());
                    }
                    aFb1bSDKV.valueOf();
                }
                AFb1vSDK.this.AFInAppEventParameterName().d().AFInAppEventParameterName();
                AFb1vSDK.this.AFInAppEventParameterName().getPurchaseToken().AFInAppEventType();
            }

            @Override // com.appsflyer.internal.AFd1xSDK.AFa1zSDK
            public final void values(AFh1xSDK aFh1xSDK) {
                aFh1wSDKAFLogger.AFInAppEventType();
                AFd1kSDK aFd1kSDKAFInAppEventParameterName = AFb1vSDK.this.AFInAppEventParameterName();
                aFd1kSDKAFInAppEventParameterName.registerClient().AFKeystoreWrapper(AFb1vSDK.AFKeystoreWrapper(AFb1vSDK.this));
                AFb1vSDK.valueOf(AFb1vSDK.this);
                if (aFd1kSDKAFInAppEventParameterName.AFInAppEventType().AFKeystoreWrapper.valueOf("appsFlyerCount", 0) < 2) {
                    AFb1vSDK.this.AFInAppEventParameterName().d().values();
                }
                AFh1mSDK aFh1mSDK = new AFh1mSDK();
                if (aFh1xSDK != null) {
                    AFb1vSDK.this.AFInAppEventParameterName().afRDLog().AFInAppEventParameterName(AFc1oSDK.AFInAppEventParameterName(aFh1mSDK), aFh1xSDK.values, aFd1kSDKAFInAppEventParameterName.w().AFKeystoreWrapper);
                }
                AFb1vSDK aFb1vSDK = AFb1vSDK.this;
                aFh1mSDK.values = appsFlyerRequestListener;
                aFb1vSDK.AFInAppEventType(aFh1mSDK, aFh1xSDK);
            }
        });
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void validateAndLogInAppPurchase(AFPurchaseDetails aFPurchaseDetails, Map<String, String> map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback) {
        AFe1cSDK aFe1cSDKAfInfoLog = this.force.afInfoLog();
        aFe1cSDKAfInfoLog.valueOf.execute(aFe1cSDKAfInfoLog.new AnonymousClass2(new AFf1pSDK(this.force, AppsFlyerProperties.getInstance(), aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback)));
        int i = AFPurchaseDetails + 1;
        afLogForce = i % 128;
        if (i % 2 == 0) {
        }
    }

    public final void AFKeystoreWrapper(Context context, AFc1oSDK aFc1oSDK, Uri uri, Uri uri2) {
        char c;
        valueOf(context);
        if (!aFc1oSDK.AFKeystoreWrapper("af_deeplink")) {
            String strValues = values(uri.toString());
            AFc1vSDK aFc1vSDKAfRDLog = AFInAppEventParameterName().afRDLog();
            String str = aFc1vSDKAfRDLog.AFInAppEventParameterName;
            if (str != null && aFc1vSDKAfRDLog.values != null && strValues.contains(str)) {
                afLogForce = (AFPurchaseDetails + 45) % 128;
                Uri.Builder builderBuildUpon = UriProtector.parse(strValues).buildUpon();
                Uri.Builder builderBuildUpon2 = Uri.EMPTY.buildUpon();
                for (Map.Entry<String, String> entry : aFc1vSDKAfRDLog.values.entrySet()) {
                    builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                    builderBuildUpon2.appendQueryParameter(entry.getKey(), entry.getValue());
                }
                strValues = builderBuildUpon.build().toString();
                aFc1oSDK.AFInAppEventParameterName.put("appended_query_params", builderBuildUpon2.build().getEncodedQuery());
                AFc1kSDK aFc1kSDK = aFc1oSDK.values;
                if (aFc1kSDK != null) {
                    aFc1kSDK.values(aFc1oSDK.AFInAppEventParameterName);
                }
            }
            aFc1oSDK.AFInAppEventParameterName.put("af_deeplink", strValues);
            AFc1kSDK aFc1kSDK2 = aFc1oSDK.values;
            if (aFc1kSDK2 != null) {
                aFc1kSDK2.values(aFc1oSDK.AFInAppEventParameterName);
            }
        }
        HashMap map = new HashMap();
        map.put("link", uri.toString());
        if (uri2 != null) {
            int i = afLogForce + 27;
            AFPurchaseDetails = i % 128;
            if (i % 2 != 0) {
                c = 'E';
            } else {
                c = 18;
            }
            if (c != 'E') {
                map.put("original_link", uri2.toString());
            } else {
                map.put("original_link", uri2.toString());
                try {
                    throw null;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        AFb1uSDK.AFInAppEventParameterName(context, map, uri);
        AFf1hSDK aFf1hSDK = new AFf1hSDK(AFInAppEventParameterName(), UUID.randomUUID(), uri);
        if (aFf1hSDK.afInfoLog()) {
            aFc1oSDK.AFInAppEventParameterName.put("isBrandedDomain", Boolean.TRUE);
            AFc1kSDK aFc1kSDK3 = aFc1oSDK.values;
            if (aFc1kSDK3 != null) {
                afLogForce = (AFPurchaseDetails + 61) % 128;
                aFc1kSDK3.values(aFc1oSDK.AFInAppEventParameterName);
            }
        }
        if (aFf1hSDK.v()) {
            aFf1hSDK.unregisterClient = AFKeystoreWrapper(map);
            AFe1cSDK aFe1cSDKAfInfoLog = AFInAppEventParameterName().afInfoLog();
            aFe1cSDKAfInfoLog.valueOf.execute(aFe1cSDKAfInfoLog.new AnonymousClass2(aFf1hSDK));
            return;
        }
        AFInAppEventParameterName().afRDLog().AFKeystoreWrapper(map);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(Context context, String str, Map<String, Object> map, AppsFlyerRequestListener appsFlyerRequestListener) {
        HashMap map2;
        if (map == null) {
            map2 = null;
        } else {
            map2 = new HashMap(map);
        }
        valueOf(context);
        AFh1jSDK aFh1jSDK = new AFh1jSDK();
        aFh1jSDK.e = str;
        aFh1jSDK.values = appsFlyerRequestListener;
        if (map2 != null && map2.containsKey("af_touch_obj")) {
            HashMap map3 = new HashMap();
            Object obj = map2.get("af_touch_obj");
            if (obj instanceof MotionEvent) {
                MotionEvent motionEvent = (MotionEvent) obj;
                HashMap map4 = new HashMap();
                map4.put("x", Float.valueOf(motionEvent.getX()));
                map4.put("y", Float.valueOf(motionEvent.getY()));
                map3.put("loc", map4);
                map3.put("pf", Float.valueOf(motionEvent.getPressure()));
                map3.put("rad", Float.valueOf(motionEvent.getTouchMajor() / 2.0f));
            } else {
                map3.put("error", "Parsing failed due to invalid input in 'af_touch_obj'.");
                AFLogger.INSTANCE.w(AFg1aSDK.PREDICT, "Parsing failed due to invalid input in 'af_touch_obj'.", true);
            }
            Map<String, ?> mapSingletonMap = Collections.singletonMap("tch_data", map3);
            map2.remove("af_touch_obj");
            aFh1jSDK.valueOf(mapSingletonMap);
        }
        aFh1jSDK.AFInAppEventParameterName = map2;
        AFb1bSDK aFb1bSDKV = AFInAppEventParameterName().v();
        String[] strArr = new String[2];
        strArr[0] = str;
        Map map5 = aFh1jSDK.AFInAppEventParameterName;
        if (map5 == null) {
            map5 = new HashMap();
        }
        strArr[1] = C786410Ut5.J3(new JSONObject(map5));
        aFb1bSDKV.AFInAppEventParameterName("logEvent", strArr);
        if (str == null) {
            values(context, AFh1tSDK.logEvent);
        }
        AFInAppEventType(aFh1jSDK, e(context));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(byte r11, short r12, int r13, int r14, int r15, java.lang.Object[] r16) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1vSDK.a(byte, short, int, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009b A[PHI: r1 r2 r3
      0x009b: PHI (r1v2 char) = (r1v1 char), (r1v10 char) binds: [B:17:0x0098, B:5:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x009b: PHI (r2v3 java.lang.String[]) = (r2v2 java.lang.String[]), (r2v7 java.lang.String[]) binds: [B:17:0x0098, B:5:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x009b: PHI (r3v1 com.appsflyer.internal.AFb1bSDK) = (r3v0 com.appsflyer.internal.AFb1bSDK), (r3v5 com.appsflyer.internal.AFb1bSDK) binds: [B:17:0x0098, B:5:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0035 A[PHI: r1 r2 r3
      0x0035: PHI (r1v9 char) = (r1v1 char), (r1v10 char) binds: [B:17:0x0098, B:5:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x0035: PHI (r2v6 java.lang.String[]) = (r2v2 java.lang.String[]), (r2v7 java.lang.String[]) binds: [B:17:0x0098, B:5:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x0035: PHI (r3v4 com.appsflyer.internal.AFb1bSDK) = (r3v0 com.appsflyer.internal.AFb1bSDK), (r3v5 com.appsflyer.internal.AFb1bSDK) binds: [B:17:0x0098, B:5:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void validateAndLogInAppPurchase(android.content.Context r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.util.Map<java.lang.String, java.lang.String> r21) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1vSDK.validateAndLogInAppPurchase(android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map):void");
    }
}
