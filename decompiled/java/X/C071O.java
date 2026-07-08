package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.071O, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C071O extends C09AY implements Function0<Integer> {
    public C071O() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("live_preParse_dns_exp", -1));
    }
}
