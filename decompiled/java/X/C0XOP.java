package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0XOP, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XOP extends C09AY implements Function0<Integer> {
    public C0XOP() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        Keva repo = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME);
        C0XOO.LIZ.getClass();
        return Integer.valueOf(repo.getInt("downgrade_bg_experiment", 0));
    }
}
