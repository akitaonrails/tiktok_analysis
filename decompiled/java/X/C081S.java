package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* JADX INFO: renamed from: X.081S, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C081S implements AnonymousClass0813 {
    public static final void LIZ(int i) {
        Keva repo = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME);
        int i2 = AnonymousClass0810.LIZ.LIZJ;
        if (i2 == 2) {
            repo.storeInt("zl_perflock_mtk", C0C64.LJIILLIIL().LJIJ(31744, 60, "zl_perflock_mtk", true));
        } else if (i2 == 3) {
            repo.storeInt("zl_perflock_kirin", C0C64.LJIILLIIL().LJIJ(31744, 46, "zl_perflock_kirin", true));
        }
        repo.storeInt("perflock_data", i);
    }
}
