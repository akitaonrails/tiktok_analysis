package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.06zj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1790106zj extends C09AY implements Function0<Long> {
    public C1790106zj() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        Keva repo = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME);
        C1790306zl.LIZ.getClass();
        return Long.valueOf(repo.getLong("lego_request_idle_trigger_delay", C1790306zl.LIZIZ));
    }
}
