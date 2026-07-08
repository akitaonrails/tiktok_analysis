package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0A2A, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0A2A extends C09AY implements Function0<Integer> {
    public C0A2A() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("keva_and_ab_preload_delay", 0));
    }
}
