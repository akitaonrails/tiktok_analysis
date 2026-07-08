package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.06zi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1790006zi extends C09AY implements Function0<Long> {
    public C1790006zi() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        Keva repo = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME);
        C1790206zk.LIZ.getClass();
        return Long.valueOf(repo.getLong("lego_request_boot_finish_trigger_delay", C1790206zk.LIZIZ));
    }
}
