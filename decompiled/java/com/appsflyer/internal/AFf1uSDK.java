package com.appsflyer.internal;

import X.C01GW;
import X.C09AY;
import X.C0WZX;
import X.C10EU;
import X.C1697810uHb;
import X.C20123813oa;
import X.C2095008Iq;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C452501pT;
import X.C786410Ut5;
import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFb1ySDK;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GoogleApiAvailability;
import com.samsung.android.game.cloudgame.dev.sdk.CloudDevCallback;
import com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes31.dex */
public final class AFf1uSDK extends AFe1dSDK<AFh1uSDK> {
    public static final AFa1tSDK AFa1tSDK = new AFa1tSDK(null);
    public final AFd1sSDK AFLogger;
    public final AFd1lSDK d;
    public final AFh1uSDK e;
    public final C01GW force;
    public final AFd1pSDK registerClient;
    public final C01GW unregisterClient;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFf1uSDK$1, reason: invalid class name */
    public final class AnonymousClass1 extends C09AY implements Function0<Boolean> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(Boolean.parseBoolean(AFf1uSDK.this.AFLogger.AFInAppEventType("com.appsflyer.enable_instant_plays")));
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFf1uSDK$2, reason: invalid class name */
    public final class AnonymousClass2 extends C09AY implements Function0<Long> {
        public AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Long invoke() {
            Long lLJIILIIL;
            String strAFInAppEventType = AFf1uSDK.this.AFLogger.AFInAppEventType("com.appsflyer.fetch_ids.timeout");
            return Long.valueOf((strAFInAppEventType == null || (lLJIILIIL = C2095008Iq.LJIILIIL(strAFInAppEventType)) == null) ? 1000L : lLJIILIIL.longValue());
        }
    }

    public static final class AFa1tSDK {
        public AFa1tSDK() {
        }

        public /* synthetic */ AFa1tSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final boolean afInfoLog() {
        boolean z;
        int i = 2;
        do {
            if ((registerClient() && AFKeystoreWrapper(i)) || AFInAppEventParameterName(i)) {
                z = true;
                break;
            }
            z = false;
            i--;
        } while (i > 0);
        this.registerClient.AFLogger = this.e;
        return z;
    }

    public static boolean e() {
        String str;
        try {
            Class.forName("com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk");
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (th instanceof ClassNotFoundException) {
                str = "CloudDevSdk not found";
            } else {
                str = "Unexpected exception while checking if running in cloud environment: " + th.getMessage();
            }
            AFLogger.afErrorLog(str, th, true);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final boolean valueOf() {
        return false;
    }

    private final boolean registerClient() {
        return ((Boolean) this.force.getValue()).booleanValue();
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final long AFInAppEventParameterName() {
        return ((Number) this.unregisterClient.getValue()).longValue();
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final AFe1bSDK AFKeystoreWrapper() {
        if (this.registerClient.valueOf()) {
            return AFe1bSDK.FAILURE;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Boolean bool = Boolean.FALSE;
        AFe1bSDK aFe1bSDK = C1697810uHb.LJIIJJI(Boolean.valueOf(afInfoLog()), bool, bool).contains(Boolean.TRUE) ? AFe1bSDK.SUCCESS : AFe1bSDK.FAILURE;
        this.registerClient.values(new AFe1mSDK(System.currentTimeMillis() - jCurrentTimeMillis));
        return aFe1bSDK;
    }

    public static final class AFa1zSDK {
        public String advertisingId;
        public boolean advertisingIdWithGps;
        public final StringBuilder gaidError;
        public Boolean isLimitAdTrackingEnabled;

        /* JADX WARN: Multi-variable type inference failed */
        public AFa1zSDK() {
            this(null, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AFa1zSDK)) {
                return false;
            }
            AFa1zSDK aFa1zSDK = (AFa1zSDK) obj;
            return Intrinsics.LJFF(this.advertisingId, aFa1zSDK.advertisingId) && Intrinsics.LJFF(this.isLimitAdTrackingEnabled, aFa1zSDK.isLimitAdTrackingEnabled) && this.advertisingIdWithGps == aFa1zSDK.advertisingIdWithGps && Intrinsics.LJFF(this.gaidError, aFa1zSDK.gaidError);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v10 */
        /* JADX WARN: Type inference failed for: r0v5, types: [int] */
        /* JADX WARN: Type inference failed for: r0v8 */
        public final int hashCode() {
            String str = this.advertisingId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.isLimitAdTrackingEnabled;
            int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 31;
            boolean z = this.advertisingIdWithGps;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return ((iHashCode2 + r0) * 31) + this.gaidError.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AFa1zSDK(advertisingId=");
            sbLIZ.append(this.advertisingId);
            sbLIZ.append(", isLimitAdTrackingEnabled=");
            sbLIZ.append(this.isLimitAdTrackingEnabled);
            sbLIZ.append(", advertisingIdWithGps=");
            sbLIZ.append(this.advertisingIdWithGps);
            sbLIZ.append(", gaidError=");
            sbLIZ.append((Object) this.gaidError);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final Boolean isLimitAdTrackingEnabled() {
            return this.isLimitAdTrackingEnabled;
        }

        public final void setAdvertisingId(String str) {
            this.advertisingId = str;
        }

        public final void setAdvertisingIdWithGps(boolean z) {
            this.advertisingIdWithGps = z;
        }

        public final void setLimitAdTrackingEnabled(Boolean bool) {
            this.isLimitAdTrackingEnabled = bool;
        }

        public AFa1zSDK(String str, Boolean bool, boolean z, StringBuilder sb) {
            this.advertisingId = str;
            this.isLimitAdTrackingEnabled = bool;
            this.advertisingIdWithGps = z;
            this.gaidError = sb;
        }

        public /* synthetic */ AFa1zSDK(String str, Boolean bool, boolean z, StringBuilder sb, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? false : z, (i & 8) != 0 ? new StringBuilder() : sb);
        }
    }

    public final class AFa1uSDK implements CloudDevCallback {
        public final /* synthetic */ AFa1zSDK $fetchGaidData;
        public final /* synthetic */ CountDownLatch $latch;

        public final void onError(String str) {
            StringBuilder sb = this.$fetchGaidData.gaidError;
            sb.append(str);
            sb.append(" |");
            this.$latch.countDown();
        }

        public final void onSuccess(Map<String, String> map) {
            this.$fetchGaidData.setAdvertisingId(map.get("gaid"));
            this.$latch.countDown();
        }

        public AFa1uSDK(AFa1zSDK aFa1zSDK, CountDownLatch countDownLatch) {
            this.$fetchGaidData = aFa1zSDK;
            this.$latch = countDownLatch;
        }
    }

    public AFf1uSDK(AFd1kSDK aFd1kSDK) {
        super(AFf1zSDK.FETCH_ADVERTISING_ID, new AFf1zSDK[0], "FetchAdvertisingIdTask");
        this.d = aFd1kSDK.w();
        this.AFLogger = aFd1kSDK.AFInAppEventType();
        this.registerClient = aFd1kSDK.getLevel();
        this.e = new AFh1uSDK(null, null, null, null, null, null, null, null, 255, null);
        this.unregisterClient = C452501pT.LIZIZ(new AnonymousClass2());
        this.force = C452501pT.LIZIZ(new AnonymousClass1());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean AFInAppEventParameterName(int i) {
        Boolean boolValueOf;
        boolean z;
        AFa1zSDK aFa1zSDK = new AFa1zSDK(null, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
        int iValues = values(this.d.AFKeystoreWrapper);
        boolean z2 = false;
        if (!valueOf(this.d.AFKeystoreWrapper, aFa1zSDK)) {
            if (AppsFlyerProperties.getInstance().getBoolean("enableGpsFallback", true) && AFInAppEventType(this.d.AFKeystoreWrapper, aFa1zSDK)) {
                z = true;
            } else {
                z = false;
            }
            String string = aFa1zSDK.gaidError.toString();
            if (string != null && !a0.LJJJIL(string)) {
                string = iValues + ": " + a0.LJLIIIL(string).toString();
            }
            values(this.e, string);
            if (!z) {
                return false;
            }
        }
        AFh1uSDK aFh1uSDK = this.e;
        aFh1uSDK.AFKeystoreWrapper = aFa1zSDK.advertisingId;
        aFh1uSDK.AFInAppEventParameterName = aFa1zSDK.isLimitAdTrackingEnabled();
        if (aFa1zSDK.isLimitAdTrackingEnabled() != null) {
            boolValueOf = Boolean.valueOf(!r0.booleanValue());
        } else {
            boolValueOf = null;
        }
        aFh1uSDK.valueOf = boolValueOf;
        aFh1uSDK.AFInAppEventType = Boolean.valueOf(aFa1zSDK.advertisingIdWithGps);
        aFh1uSDK.values = Boolean.FALSE;
        if (i != 2) {
            z2 = true;
        }
        aFh1uSDK.registerClient = Boolean.valueOf(z2);
        return true;
    }

    private final boolean AFKeystoreWrapper(int i) {
        return valueOf(i);
    }

    public static AdvertisingIdClient.Info INVOKESTATIC_com_appsflyer_internal_AFf1uSDK_com_ss_android_ugc_aweme_lancet_process_GoogleAdvertisingInfoLancet_getAdvertisingIdInfo(Context context) {
        if (C10EU.LJIILIIL() && C20123813oa.LIZ()) {
            return new AdvertisingIdClient.Info("00000000-0000-0000-0000-000000000000", true);
        }
        return C2204961BRm.LLLLLILLIL(context, new C0WZX("dzBzEgMqT9naWU4kV1yNaEAr35CqUcZV5bNsfeleyw==", new String[]{"01c45"}));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean valueOf(int i) {
        String str;
        boolean z = false;
        if (!e() || !CloudDevSdk.INSTANCE.isCloudEnvironment(this.d.AFKeystoreWrapper)) {
            return false;
        }
        AFa1zSDK aFa1zSDK = new AFa1zSDK(null, 0 == true ? 1 : 0, z, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            CloudDevSdk.INSTANCE.request(this.d.AFKeystoreWrapper, Collections.singletonList("gaid"), new AFa1uSDK(aFa1zSDK, countDownLatch));
            countDownLatch.await(((Number) this.unregisterClient.getValue()).longValue(), TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            try {
                TryCatchGuardChecker.doCheck(th);
                if (th instanceof InterruptedException) {
                    str = "Fetch GAID using Samsung Cloud Dev interrupted or reached to timeout";
                } else if (th instanceof ClassNotFoundException) {
                    str = "CloudDevSdk not found";
                } else {
                    str = "Unexpected exception while fetching GAID using Samsung Cloud Dev " + th.getMessage();
                }
                AFLogger.afErrorLog(str, th, true);
                StringBuilder sb = aFa1zSDK.gaidError;
                sb.append(th.getClass().getSimpleName());
                sb.append(" |");
                if (aFa1zSDK.gaidError.length() > 0) {
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                if (aFa1zSDK.gaidError.length() > 0) {
                    values(this.e, aFa1zSDK.gaidError.toString());
                }
                throw th2;
            }
        }
        if (aFa1zSDK.gaidError.length() > 0) {
            values(this.e, aFa1zSDK.gaidError.toString());
        }
        String str2 = aFa1zSDK.advertisingId;
        if (str2 == null || str2.length() == 0) {
            return false;
        }
        AFh1uSDK aFh1uSDK = this.e;
        aFh1uSDK.AFKeystoreWrapper = aFa1zSDK.advertisingId;
        Boolean bool = Boolean.FALSE;
        aFh1uSDK.AFInAppEventParameterName = bool;
        Boolean bool2 = Boolean.TRUE;
        aFh1uSDK.valueOf = bool2;
        aFh1uSDK.AFInAppEventType = bool;
        aFh1uSDK.values = bool2;
        if (i != 2) {
            z = true;
        }
        aFh1uSDK.registerClient = Boolean.valueOf(z);
        return true;
    }

    public static int values(Context context) {
        try {
            return C786410Ut5.b4(GoogleApiAvailability.getInstance(), context);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            AFLogger.afErrorLogForExcManagerOnly("isGooglePlayServicesAvailable error", th);
            return -1;
        }
    }

    private final boolean AFInAppEventType(Context context, AFa1zSDK aFa1zSDK) {
        try {
            AFb1ySDK.AFa1uSDK aFa1uSDKValues = AFb1ySDK.values(context);
            aFa1zSDK.setAdvertisingId(aFa1uSDKValues.AFKeystoreWrapper);
            aFa1zSDK.setLimitAdTrackingEnabled(Boolean.valueOf(aFa1uSDKValues.valueOf()));
            String str = aFa1zSDK.advertisingId;
            if (str == null || str.length() == 0) {
                aFa1zSDK.gaidError.append("emptyOrNull (bypass) |");
            }
            if (Unit.LIZ != null) {
                return true;
            }
            aFa1zSDK.gaidError.append("gpsAdInfo-null (bypass) |");
            "GpsAdInfo is null (bypass)".toString();
            throw new IllegalStateException("GpsAdInfo is null (bypass)");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            AFLogger.afErrorLog("Failed to fetch GAID: " + th.getMessage(), th, true, false, false);
            StringBuilder sb = aFa1zSDK.gaidError;
            sb.append(th.getClass().getSimpleName());
            sb.append(" |");
            String localizedMessage = th.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = th.toString();
            }
            AFLogger.afInfoLog(localizedMessage);
            return false;
        }
    }

    private final boolean valueOf(Context context, AFa1zSDK aFa1zSDK) {
        try {
            Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
            AdvertisingIdClient.Info infoINVOKESTATIC_com_appsflyer_internal_AFf1uSDK_com_ss_android_ugc_aweme_lancet_process_GoogleAdvertisingInfoLancet_getAdvertisingIdInfo = INVOKESTATIC_com_appsflyer_internal_AFf1uSDK_com_ss_android_ugc_aweme_lancet_process_GoogleAdvertisingInfoLancet_getAdvertisingIdInfo(context);
            if (infoINVOKESTATIC_com_appsflyer_internal_AFf1uSDK_com_ss_android_ugc_aweme_lancet_process_GoogleAdvertisingInfoLancet_getAdvertisingIdInfo != null) {
                aFa1zSDK.setAdvertisingId(C2204961BRm.LLLLLIL(infoINVOKESTATIC_com_appsflyer_internal_AFf1uSDK_com_ss_android_ugc_aweme_lancet_process_GoogleAdvertisingInfoLancet_getAdvertisingIdInfo, new C0WZX("dzBzEgMqT9naWU4kV1yNaEAr35CqUcZV5bNsfeleyw==", new String[]{"01c45"})));
                aFa1zSDK.setLimitAdTrackingEnabled(Boolean.valueOf(infoINVOKESTATIC_com_appsflyer_internal_AFf1uSDK_com_ss_android_ugc_aweme_lancet_process_GoogleAdvertisingInfoLancet_getAdvertisingIdInfo.LIZIZ));
                aFa1zSDK.setAdvertisingIdWithGps(true);
                String str = aFa1zSDK.advertisingId;
                if (str == null || str.length() == 0) {
                    aFa1zSDK.gaidError.append("emptyOrNull |");
                }
                if (Unit.LIZ != null) {
                    return true;
                }
            }
            aFa1zSDK.gaidError.append("gpsAdInfo-null |");
            "GpsAdIndo is null".toString();
            throw new IllegalStateException("GpsAdIndo is null");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sb = aFa1zSDK.gaidError;
            sb.append(th.getClass().getSimpleName());
            sb.append(" |");
            return false;
        }
    }

    public static void values(AFh1uSDK aFh1uSDK, String str) {
        if (str == null) {
            return;
        }
        String str2 = aFh1uSDK.d;
        if (str2 != null) {
            String str3 = str2 + " | " + str;
            if (str3 != null) {
                str = str3;
            }
        }
        aFh1uSDK.d = str;
    }
}
