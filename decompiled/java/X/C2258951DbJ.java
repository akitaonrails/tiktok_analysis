package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1DbJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2258951DbJ extends C09AY implements Function0<Integer> {
    public C2258951DbJ() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        Keva repo = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME);
        C2258981DbM.LIZ.getClass();
        return Integer.valueOf(repo.getInt("fresco_total_opt", 0));
    }
}
