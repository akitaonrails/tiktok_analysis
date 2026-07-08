package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.070U, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C070U extends C09AY implements Function0<Long> {
    public C070U() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        return Long.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getLong("optimize_delayliverequest", 10000L));
    }
}
