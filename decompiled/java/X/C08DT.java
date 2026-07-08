package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* JADX INFO: renamed from: X.08DT, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08DT {
    public static final boolean LIZ;
    public static final boolean LIZIZ;

    static {
        int i = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("zl_network_ipc_fix", 2);
        int i2 = (C2187451AjH.LJIIJ() && i == 2) ? 2 : i;
        LIZ = (i2 & 2) != 0;
        LIZIZ = (i2 & 4) != 0;
    }
}
