package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0BZZ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0BZZ extends C09AY implements Function0<Integer> {
    public C0BZZ() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(C104100aN.LIZ().LJIJJLI(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("load_more_timing_opt", 0)));
    }
}
