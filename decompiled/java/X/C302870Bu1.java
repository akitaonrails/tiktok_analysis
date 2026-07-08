package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* JADX INFO: renamed from: X.0Bu1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C302870Bu1 {
    public static boolean LIZ;
    public static volatile boolean LIZIZ;

    public static boolean LIZ() {
        if (!LIZIZ) {
            LIZ = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("performance_player_opt_great_reversal", false);
            LIZIZ = true;
        }
        return LIZ;
    }
}
