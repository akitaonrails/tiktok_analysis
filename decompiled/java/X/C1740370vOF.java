package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.ug.popup.libra.EcUgMallLandingDeeplinkFallbackModel;

/* JADX INFO: renamed from: X.0vOF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1740370vOF {
    public static final EcUgMallLandingDeeplinkFallbackModel LIZ = new EcUgMallLandingDeeplinkFallbackModel(false, 0);

    public static EcUgMallLandingDeeplinkFallbackModel LIZ() {
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            EcUgMallLandingDeeplinkFallbackModel ecUgMallLandingDeeplinkFallbackModel = LIZ;
            EcUgMallLandingDeeplinkFallbackModel ecUgMallLandingDeeplinkFallbackModel2 = (EcUgMallLandingDeeplinkFallbackModel) settingsManagerLIZLLL.LJIIIIZZ("ec_ug_mall_landing_deeplink_fallback", EcUgMallLandingDeeplinkFallbackModel.class, ecUgMallLandingDeeplinkFallbackModel);
            return ecUgMallLandingDeeplinkFallbackModel2 != null ? ecUgMallLandingDeeplinkFallbackModel2 : ecUgMallLandingDeeplinkFallbackModel;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return LIZ;
        }
    }
}
