package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0BvY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C303820BvY extends C09AY implements Function0<Integer> {
    public C303820BvY() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(C293840BfS.LIZIZ ? 1 : ((Boolean) C303880Bve.LJIIIZ.getValue()).booleanValue() ? Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("feed_small_screen_for_size_experiment", 0) : C0C64.LJIILLIIL().LJIJ(31744, 0, "feed_small_screen_for_size_experiment", true));
    }
}
