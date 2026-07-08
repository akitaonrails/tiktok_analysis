package X;

import com.bytedance.android.starship.strategy.option.StrategyStabilityConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1D1S, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D1S extends C09AY implements Function0<StrategyStabilityConfig[]> {
    public C1D1S() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.starship.strategy.option.StrategyStabilityConfig[], java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final StrategyStabilityConfig[] invoke() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        StrategyStabilityConfig[] strategyStabilityConfigArr = C1D1Q.LIZ;
        ?? LJJIIJ = c0c64LJIILLIIL.LJJIIJ(true, "starship_strategy_stability_config", 31744, StrategyStabilityConfig[].class, strategyStabilityConfigArr, 2);
        return LJJIIJ != 0 ? LJJIIJ : strategyStabilityConfigArr;
    }
}
