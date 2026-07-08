package X;

import com.bytedance.keva.KevaImpl;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Buo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C303360Buo extends C09AY implements Function0<Integer> {
    public C303360Buo() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(KevaImpl.getRepoSync(FollowFeedViewStubExperiment.REPO_NAME, 0).getInt("main_looper_private_repo_opt_enable", 0));
    }
}
