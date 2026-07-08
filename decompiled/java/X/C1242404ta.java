package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04ta, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1242404ta extends C09AY implements Function0<Integer> {
    public C1242404ta() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        Object c098200Yq;
        int iIntValue;
        if (((Number) C1242504tb.LIZ.getValue()).intValue() == 1) {
            iIntValue = C0C64.LJIILLIIL().LJIIZILJ(31744, -1, 2, "tt_friends_experiment", true);
        } else {
            try {
                c098200Yq = Integer.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("tt_friends_experiment", -1));
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
        return Integer.valueOf(iIntValue);
    }
}
