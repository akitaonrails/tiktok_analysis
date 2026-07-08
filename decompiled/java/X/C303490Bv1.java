package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Bv1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C303490Bv1 extends C09AY implements Function0<Integer> {
    public C303490Bv1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("is_downgrade_splite_opt", 0));
    }
}
