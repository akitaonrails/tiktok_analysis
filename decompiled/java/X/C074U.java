package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.074U, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C074U extends C09AY implements Function0<Integer> {
    public C074U() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        int i = 0;
        try {
            i = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("loading_experience_opt", 0);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return Integer.valueOf(i);
    }
}
