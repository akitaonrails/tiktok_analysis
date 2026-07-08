package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.coldcache.exp.ColdCacheRevertStrategyConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0C9J, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C9J extends C09AY implements Function0<ColdCacheRevertStrategyConfig> {
    public C0C9J() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final ColdCacheRevertStrategyConfig invoke() {
        ColdCacheRevertStrategyConfig coldCacheRevertStrategyConfig;
        ColdCacheRevertStrategyConfig coldCacheRevertStrategyConfig2;
        try {
            if (C07JK.LIZ()) {
                coldCacheRevertStrategyConfig2 = C1EPP.LIZJ;
            } else {
                C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
                ColdCacheRevertStrategyConfig coldCacheRevertStrategyConfig3 = C1EPP.LIZIZ;
                ColdCacheRevertStrategyConfig coldCacheRevertStrategyConfig4 = (ColdCacheRevertStrategyConfig) c0c64LJIILLIIL.LJJIIJ(true, "cold_cache_revert_strategy_exp", 31744, ColdCacheRevertStrategyConfig.class, coldCacheRevertStrategyConfig3, 2);
                coldCacheRevertStrategyConfig2 = coldCacheRevertStrategyConfig3;
                if (coldCacheRevertStrategyConfig4 != null) {
                    coldCacheRevertStrategyConfig2 = coldCacheRevertStrategyConfig4;
                }
            }
            C189200o6.m2constructorimpl(coldCacheRevertStrategyConfig2);
            coldCacheRevertStrategyConfig = coldCacheRevertStrategyConfig2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            coldCacheRevertStrategyConfig = c098200Yq;
        }
        return C189200o6.m5exceptionOrNullimpl(coldCacheRevertStrategyConfig) != null ? C1EPP.LIZIZ : coldCacheRevertStrategyConfig;
    }
}
