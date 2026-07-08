package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CCK, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CCK extends C09AY implements Function0<Integer> {
    public C0CCK() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        Keva repo = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME);
        C0CCR.LIZ.getClass();
        return Integer.valueOf(repo.getInt("is_opt_lego_bootfinish", C0CCR.LIZIZ));
    }
}
