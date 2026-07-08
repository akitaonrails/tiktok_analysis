package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadResultListener;
import com.ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig;

/* JADX INFO: renamed from: X.0BuZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C303210BuZ {
    public static int LIZ = -1;
    public static boolean LIZIZ;
    public static final C1485700olU LIZJ = new ISmartFeedPreloadResultListener() { // from class: X.0olU
        @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadResultListener
        public final void onSmartFeedPreloadResult(String str, String str2, float f) {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && f >= 0.0f) {
                C1478160oZK.LIZ().LJII(str2);
                if (C1485710olV.LIZIZ != null) {
                    C1478160oZK.LIZ().LJJIIZ(str2);
                }
            }
        }
    };

    public static PreloadStrategyConfig LIZ() {
        PreloadStrategyConfig preloadStrategyConfig;
        try {
            C0C64.LJIILLIIL().getClass();
            preloadStrategyConfig = (PreloadStrategyConfig) C0C64.LJJI(PreloadStrategyConfig.class, "preload_strategy", true);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return preloadStrategyConfig == null ? PreloadStrategyConfig.convertOldConfig(C0C64.LJIILLIIL().LJIJ(31744, 5, "video_preload_number", true), C0C64.LJIILLIIL().LJIJ(31744, 800, "video_preload_size", true)) : preloadStrategyConfig;
    }

    public static int LIZIZ() {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getUnLoginDiggExperiment() - ");
        sbLIZ.append(C0C64.LJIILLIIL().LJIJ(31744, 0, "unlogin_digg_limit", true));
        C2188811AlT.LIZIZ(sbLIZ);
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "unlogin_digg_limit", true);
    }
}
