package X;

import com.ss.android.ugc.aweme.ml.ab.SmartPreloadProfileV2Experiment$PreloadProfileMLModel;

/* JADX INFO: renamed from: X.0T1p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C740150T1p {
    public static boolean LIZ;
    public static SmartPreloadProfileV2Experiment$PreloadProfileMLModel LIZIZ;
    public static int LIZJ;

    public static SmartPreloadProfileV2Experiment$PreloadProfileMLModel LIZ() {
        if (!LIZ) {
            SmartPreloadProfileV2Experiment$PreloadProfileMLModel smartPreloadProfileV2Experiment$PreloadProfileMLModel = (SmartPreloadProfileV2Experiment$PreloadProfileMLModel) C0C64.LJIILLIIL().LJJII(SmartPreloadProfileV2Experiment$PreloadProfileMLModel.class, null, "smart_feed_preload_profile_ml", false);
            LIZIZ = smartPreloadProfileV2Experiment$PreloadProfileMLModel;
            if (smartPreloadProfileV2Experiment$PreloadProfileMLModel != null) {
                LIZJ = smartPreloadProfileV2Experiment$PreloadProfileMLModel.groupId;
            }
            LIZ = true;
        }
        return LIZIZ;
    }

    public static boolean LIZIZ() {
        if (LIZ() != null) {
            return LIZ().groupId == 5 || LIZJ == 6;
        }
        return false;
    }
}
