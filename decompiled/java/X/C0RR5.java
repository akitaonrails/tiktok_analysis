package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.performance.ab.OptimizeConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RR5, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RR5 extends C09AY implements Function0<OptimizeConfig> {
    public C0RR5() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final OptimizeConfig invoke() {
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            OptimizeConfig optimizeConfig = C0RR4.LIZ;
            OptimizeConfig optimizeConfig2 = (OptimizeConfig) c0c64LJIILLIIL.LJJII(OptimizeConfig.class, optimizeConfig, "photomode_cold_boot_opt", true);
            return optimizeConfig2 != null ? optimizeConfig2 : optimizeConfig;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C0RR4.LIZ;
        }
    }
}
