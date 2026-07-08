package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.071T, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C071T extends C09AY implements Function0<Boolean> {
    public C071T() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("optimize_loadedapkdispatcher", false));
    }
}
