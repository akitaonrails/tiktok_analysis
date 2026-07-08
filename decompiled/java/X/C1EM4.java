package X;

import com.ss.android.ugc.aweme.experiment.FollowRealTimeReadExp;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1EM4, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1EM4 extends C09AY implements Function0<Long> {
    public C1EM4() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        return Long.valueOf(FollowRealTimeReadExp.LIZIZ().autoLocateUnreadVideoLatency);
    }
}
