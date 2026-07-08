package X;

import com.ss.android.ugc.aweme.experiment.FollowRealTimeReadExp;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1EM3, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1EM3 extends C09AY implements Function0<FollowRealTimeReadExp.Config> {
    public C1EM3() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.experiment.FollowRealTimeReadExp$Config, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final FollowRealTimeReadExp.Config invoke() {
        ?? LJJII = C0C64.LJIILLIIL().LJJII(FollowRealTimeReadExp.Config.class, FollowRealTimeReadExp.LIZ, "following_feed_real_time_read_exp", true);
        return LJJII == 0 ? new FollowRealTimeReadExp.Config(false, false, false, false, 240, 240, 500, 86400L, 0L) : LJJII;
    }
}
