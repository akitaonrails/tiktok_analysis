package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabTopExperiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0C7h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C308470C7h extends C09AY implements Function0<Integer> {
    public C308470C7h() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        Object c098200Yq;
        C0CXC.LIZ.getClass();
        int iIntValue = -1;
        if (!C0CXC.LIZIZ() && !C1585030rLh.LJIIL()) {
            if (((Number) C1242504tb.LIZ.getValue()).intValue() == 1) {
                iIntValue = ((FriendsTabTopExperiment.FriendsTabTopConfig) FriendsTabTopExperiment.LIZJ.getValue()).indexOnTop;
            } else {
                try {
                    c098200Yq = Integer.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("tt_friends_top_tab_experiment_index", -1));
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                    c098200Yq = -1;
                }
                iIntValue = ((Number) c098200Yq).intValue();
            }
        }
        return Integer.valueOf(iIntValue);
    }
}
