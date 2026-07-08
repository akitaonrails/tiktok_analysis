package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0A2g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C256200A2g extends C09AY implements Function0<Long> {
    public C256200A2g() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        return Long.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getLong("cold_boot_request_sparse_time", 0L));
    }
}
