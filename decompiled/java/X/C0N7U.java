package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* JADX INFO: renamed from: X.0N7U, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N7U {
    public static final boolean LIZ;
    public static final boolean LIZIZ;
    public static final boolean LIZJ;
    public static final boolean LIZLLL;
    public static final boolean LJ;

    static {
        int i = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("zl_perflock_mtk", 60);
        if (C2187451AjH.LJIIJ() && i == 60) {
            i = 65535;
        }
        LIZ = (i & 2) != 0;
        LIZIZ = (i & 4) != 0;
        LIZJ = (i & 8) != 0;
        LIZLLL = (i & 16) != 0;
        LJ = (i & 32) != 0;
    }
}
