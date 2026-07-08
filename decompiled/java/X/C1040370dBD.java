package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.settings.GeckoCountConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0dBD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1040370dBD implements InterfaceC1037730d6x {
    public static final List<String> LIZJ() {
        try {
            List<String> adCardPreloadCommonChannel = C0CLW.LIZIZ.LIZ.getAdLandingPageConfig().getAdCardPreloadCommonChannel();
            return adCardPreloadCommonChannel == null ? new ArrayList() : adCardPreloadCommonChannel;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            return new ArrayList();
        }
    }

    public static final String LJ() {
        try {
            return C0CLW.LIZIZ.LIZ.getAdLandingPageConfig().getAnalytics();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            return null;
        }
    }

    public static final int LIZ() {
        if (C1336210ksN.LIZ()) {
            return ((Number) C2250201D5m.LJIILIIL.getValue()).intValue();
        }
        GeckoCountConfig geckoCountConfigLIZ = C07K1.LIZ();
        if (geckoCountConfigLIZ != null) {
            return geckoCountConfigLIZ.h5PageGeckoCacheCount;
        }
        try {
            Integer adLandingPagePreloadCacheCount = C0CLW.LIZIZ.LIZ.getAdLandingPageConfig().getAdLandingPagePreloadCacheCount();
            if (adLandingPagePreloadCacheCount != null) {
                return adLandingPagePreloadCacheCount.intValue();
            }
            return 40;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            return 40;
        }
    }

    public static final int LIZIZ() {
        if (C1336210ksN.LIZ()) {
            return ((Number) C2250201D5m.LJIIJJI.getValue()).intValue();
        }
        GeckoCountConfig geckoCountConfigLIZ = C07K1.LIZ();
        if (geckoCountConfigLIZ != null) {
            return geckoCountConfigLIZ.splashPageGeckoCacheCount;
        }
        try {
            Integer adSplashPagePreloadCacheCount = C0CLW.LIZIZ.LIZ.getAdLandingPageConfig().getAdSplashPagePreloadCacheCount();
            if (adSplashPagePreloadCacheCount != null) {
                return adSplashPagePreloadCacheCount.intValue();
            }
            return 40;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            return 40;
        }
    }

    public static final String LIZLLL() {
        C2230608oa<String> adLandingPageConfig = SharePrefCache.inst().getAdLandingPageConfig();
        if (adLandingPageConfig != null) {
            return adLandingPageConfig.LIZ();
        }
        return null;
    }

    public static final int LJFF() {
        if (C1336210ksN.LIZ()) {
            return ((Number) C2250201D5m.LJIILIIL.getValue()).intValue();
        }
        GeckoCountConfig geckoCountConfigLIZ = C07K1.LIZ();
        if (geckoCountConfigLIZ != null) {
            return geckoCountConfigLIZ.loadingFormatGeckoCacheCount;
        }
        return 40;
    }

    public static final int LJI() {
        if (C1336210ksN.LIZ()) {
            return ((Number) C2250201D5m.LJIIL.getValue()).intValue();
        }
        GeckoCountConfig geckoCountConfigLIZ = C07K1.LIZ();
        if (geckoCountConfigLIZ != null) {
            return geckoCountConfigLIZ.lynxPageGeckoCacheCount;
        }
        try {
            Integer adLynxPagePreloadCacheCount = C0CLW.LIZIZ.LIZ.getAdLandingPageConfig().getAdLynxPagePreloadCacheCount();
            if (adLynxPagePreloadCacheCount != null) {
                return adLynxPagePreloadCacheCount.intValue();
            }
            return 40;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            return 40;
        }
    }
}
