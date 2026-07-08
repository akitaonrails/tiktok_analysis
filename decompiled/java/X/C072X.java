package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.072X, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C072X extends C09AY implements Function0<Long> {
    public C072X() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        Keva repo = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME);
        new Object() { // from class: X.072Y
        }.getClass();
        return Long.valueOf(repo.getLong("lego_boot_finish_min_sparse", 0L));
    }
}
