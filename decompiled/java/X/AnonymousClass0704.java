package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0704, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class AnonymousClass0704 extends C09AY implements Function0<Integer> {
    public AnonymousClass0704() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("thread_convergence_optimize_experiment", 0));
    }
}
