package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0mG7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1389370mG7 extends C09AY implements Function0<Integer> {
    public C1389370mG7() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        C2213981Bky c2213981Bky = C2213981Bky.LIZIZ;
        return Integer.valueOf((c2213981Bky.LIZLLL() || C2093608Ic.LIZJ(c2213981Bky.getChannel(), "rhea")) ? -1 : Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("device_screen_info_cache_opt", 0));
    }
}
