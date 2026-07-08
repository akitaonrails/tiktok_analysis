package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.073F, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C073F extends C09AY implements Function0<Integer> {
    public C073F() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        Keva repo = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME);
        C073E.LIZ.getClass();
        return Integer.valueOf(repo.getInt("fluency_insert_downgrade_opt", C073E.LIZLLL));
    }
}
