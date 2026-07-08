package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.coldcache.exp.ColdCacheExtensionsConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0yhT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1867610yhT extends C09AY implements Function0<ColdCacheExtensionsConfig> {
    public C1867610yhT() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final ColdCacheExtensionsConfig invoke() {
        ColdCacheExtensionsConfig coldCacheExtensionsConfig;
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            ColdCacheExtensionsConfig coldCacheExtensionsConfig2 = C1867620yhU.LIZIZ;
            ColdCacheExtensionsConfig coldCacheExtensionsConfig3 = (ColdCacheExtensionsConfig) c0c64LJIILLIIL.LJJIIJ(true, "cold_cache_extensions_exp", 31744, ColdCacheExtensionsConfig.class, coldCacheExtensionsConfig2, 2);
            ColdCacheExtensionsConfig coldCacheExtensionsConfig4 = coldCacheExtensionsConfig2;
            if (coldCacheExtensionsConfig3 != null) {
                coldCacheExtensionsConfig4 = coldCacheExtensionsConfig3;
            }
            C189200o6.m2constructorimpl(coldCacheExtensionsConfig4);
            coldCacheExtensionsConfig = coldCacheExtensionsConfig4;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            coldCacheExtensionsConfig = c098200Yq;
        }
        return C189200o6.m5exceptionOrNullimpl(coldCacheExtensionsConfig) != null ? C1867620yhU.LIZIZ : coldCacheExtensionsConfig;
    }
}
