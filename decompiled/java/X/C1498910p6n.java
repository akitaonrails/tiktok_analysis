package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.net.experiment.RiskyRetryRequestStrategy;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0p6n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1498910p6n extends C09AY implements Function0<RiskyRetryRequestStrategy> {
    public C1498910p6n() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final RiskyRetryRequestStrategy invoke() {
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            RiskyRetryRequestStrategy riskyRetryRequestStrategy = C1498900p6m.LIZ;
            RiskyRetryRequestStrategy riskyRetryRequestStrategy2 = (RiskyRetryRequestStrategy) c0c64LJIILLIIL.LJJII(RiskyRetryRequestStrategy.class, riskyRetryRequestStrategy, "net_risky_retry_request_filter", true);
            return riskyRetryRequestStrategy2 != null ? riskyRetryRequestStrategy2 : riskyRetryRequestStrategy;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C1498900p6m.LIZ;
        }
    }
}
