package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0BYs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C290120BYs extends C09AY implements Function0<Integer> {
    public C290120BYs() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("layoutinfalter_hook_opt", 0));
    }
}
