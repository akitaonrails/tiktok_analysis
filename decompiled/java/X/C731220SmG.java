package X;

import com.ss.android.ugc.aweme.experiment.DislikeToMainAreaStage2Config;

/* JADX INFO: renamed from: X.0SmG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C731220SmG {
    public static final boolean LIZ;
    public static final long LIZIZ;
    public static final int LIZJ;
    public static final int LIZLLL;

    static {
        DislikeToMainAreaStage2Config dislikeToMainAreaStage2Config = new DislikeToMainAreaStage2Config(false, 86400L, 3, 60);
        new DislikeToMainAreaStage2Config(true, 86400L, 3, 60);
        DislikeToMainAreaStage2Config dislikeToMainAreaStage2Config2 = (DislikeToMainAreaStage2Config) C0C64.LJIILLIIL().LJJII(DislikeToMainAreaStage2Config.class, dislikeToMainAreaStage2Config, "dislike_to_main_area_phase_2", true);
        if (dislikeToMainAreaStage2Config2 != null) {
            dislikeToMainAreaStage2Config = dislikeToMainAreaStage2Config2;
        }
        LIZ = dislikeToMainAreaStage2Config.showToast;
        LIZIZ = dislikeToMainAreaStage2Config.showToastDelay;
        LIZJ = dislikeToMainAreaStage2Config.showToastCount;
        LIZLLL = dislikeToMainAreaStage2Config.dislikeTextMaxLength;
    }
}
