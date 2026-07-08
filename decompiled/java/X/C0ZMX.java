package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.strategy.experiment.StrategyConfigurationConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ZMX, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZMX extends C09AY implements Function0<StrategyConfigurationConfig> {
    public C0ZMX() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final StrategyConfigurationConfig invoke() {
        StrategyConfigurationConfig strategyConfigurationConfig;
        try {
            StrategyConfigurationConfig strategyConfigurationConfig2 = (StrategyConfigurationConfig) SettingsManager.LIZLLL().LJIIIIZZ("tt_im_strategy_configuration_config", StrategyConfigurationConfig.class, C0ZMY.LIZIZ);
            C189200o6.m2constructorimpl(strategyConfigurationConfig2);
            strategyConfigurationConfig = strategyConfigurationConfig2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            strategyConfigurationConfig = c098200Yq;
        }
        return (C189200o6.m7isFailureimpl(strategyConfigurationConfig) || strategyConfigurationConfig == 0) ? C0ZMY.LIZIZ : strategyConfigurationConfig;
    }
}
