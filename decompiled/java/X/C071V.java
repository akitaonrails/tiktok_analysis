package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.071V, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C071V extends C09AY implements Function0<Boolean> {
    public C071V() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("optimize_createbeforecreatetask_v2", false));
    }
}
