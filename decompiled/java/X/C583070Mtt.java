package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0Mtt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C583070Mtt {
    public static int LIZIZ;
    public static long LIZJ;
    public static long LIZLLL;
    public static final C583070Mtt LIZ = new C583070Mtt();
    public static final AtomicBoolean LJ = new AtomicBoolean(false);

    public static final void LIZ() {
        if (LIZLLL != 0) {
            LIZJ += System.currentTimeMillis() - LIZLLL;
            LIZLLL = 0L;
            LIZIZ++;
            Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).storeInt("loadmore_wait_count", LIZIZ);
            Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).storeLong("loadmore_wait_duration", LIZJ);
            LJ.set(false);
        }
    }
}
