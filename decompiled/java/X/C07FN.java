package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07FN, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07FN extends C09AY implements Function0<Integer> {
    public C07FN() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("start_up_memory_opt", 0));
    }
}
