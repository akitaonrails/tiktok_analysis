package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07Md, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1849307Md extends C09AY implements Function0<Long> {
    public C1849307Md() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        return Long.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getLong("key_dex2oat_execute_timestamp", 0L));
    }
}
