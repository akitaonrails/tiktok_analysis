package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.google.gson.p;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* JADX INFO: renamed from: X.0BuG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C303020BuG {
    public static final String LIZ = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getString("vod_feature_map", null);
    public static n LIZIZ = null;

    public static n LIZ() {
        try {
            String str = LIZ;
            if (str == null) {
                return LIZIZ;
            }
            if (LIZIZ == null) {
                new p();
                LIZIZ = p.LIZJ(str).LJIILIIL();
            }
            return LIZIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJFF(e, "vod_feature_map");
            return LIZIZ;
        }
    }
}
