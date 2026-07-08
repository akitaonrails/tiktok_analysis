package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0C6h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C308210C6h extends C09AY implements Function0<Float> {
    public C308210C6h() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        return Float.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getFloat("xjl_feed_apm_sampling_opt", -1.0f));
    }
}
