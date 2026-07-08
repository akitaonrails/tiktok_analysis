package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.coldcache.exp.ColdCommonCacheProviderConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0N39, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N39 extends C09AY implements Function0<ColdCommonCacheProviderConfig> {
    public C0N39() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final ColdCommonCacheProviderConfig invoke() {
        ColdCommonCacheProviderConfig coldCommonCacheProviderConfig;
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            ColdCommonCacheProviderConfig coldCommonCacheProviderConfig2 = C591010NFz.LIZIZ;
            ColdCommonCacheProviderConfig coldCommonCacheProviderConfig3 = (ColdCommonCacheProviderConfig) c0c64LJIILLIIL.LJJIIJ(true, "cold_common_cache_provider_setting", 31744, ColdCommonCacheProviderConfig.class, coldCommonCacheProviderConfig2, 2);
            ColdCommonCacheProviderConfig coldCommonCacheProviderConfig4 = coldCommonCacheProviderConfig2;
            if (coldCommonCacheProviderConfig3 != null) {
                coldCommonCacheProviderConfig4 = coldCommonCacheProviderConfig3;
            }
            C189200o6.m2constructorimpl(coldCommonCacheProviderConfig4);
            coldCommonCacheProviderConfig = coldCommonCacheProviderConfig4;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            coldCommonCacheProviderConfig = c098200Yq;
        }
        return C189200o6.m5exceptionOrNullimpl(coldCommonCacheProviderConfig) != null ? C591010NFz.LIZIZ : coldCommonCacheProviderConfig;
    }
}
