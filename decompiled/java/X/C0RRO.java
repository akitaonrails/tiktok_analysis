package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.feed.platform.ab.LowScreenOptimizeAB;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RRO, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RRO extends C09AY implements Function0<LowScreenOptimizeAB.LowScreenOptConfig> {
    public C0RRO() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final LowScreenOptimizeAB.LowScreenOptConfig invoke() {
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            LowScreenOptimizeAB.LowScreenOptConfig lowScreenOptConfig = LowScreenOptimizeAB.LIZ;
            LowScreenOptimizeAB.LowScreenOptConfig lowScreenOptConfig2 = (LowScreenOptimizeAB.LowScreenOptConfig) c0c64LJIILLIIL.LJJIIJ(true, "low_screen_adaption_exp", 31744, LowScreenOptimizeAB.LowScreenOptConfig.class, lowScreenOptConfig, 2);
            return lowScreenOptConfig2 != null ? lowScreenOptConfig2 : lowScreenOptConfig;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return LowScreenOptimizeAB.LIZ;
        }
    }
}
