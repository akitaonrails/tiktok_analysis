package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Btr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2219491Btr extends C09AY implements Function0<Integer> {
    public C2219491Btr() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        Keva repo = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME);
        C2219481Btq.LIZ.getClass();
        return Integer.valueOf(repo.getInt("assem_performance_opt", 0));
    }
}
