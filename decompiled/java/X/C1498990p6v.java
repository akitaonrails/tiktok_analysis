package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.net.experiment.RepeatRequestFilterStrategy;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0p6v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1498990p6v extends C09AY implements Function0<RepeatRequestFilterStrategy> {
    public C1498990p6v() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final RepeatRequestFilterStrategy invoke() {
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            RepeatRequestFilterStrategy repeatRequestFilterStrategy = C1498980p6u.LIZ;
            RepeatRequestFilterStrategy repeatRequestFilterStrategy2 = (RepeatRequestFilterStrategy) c0c64LJIILLIIL.LJJII(RepeatRequestFilterStrategy.class, repeatRequestFilterStrategy, "net_repeat_request_filter", true);
            return repeatRequestFilterStrategy2 != null ? repeatRequestFilterStrategy2 : repeatRequestFilterStrategy;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C1498980p6u.LIZ;
        }
    }
}
