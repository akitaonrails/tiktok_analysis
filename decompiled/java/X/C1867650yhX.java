package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.player.ab.abs.ColdCacheExpiredConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0yhX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1867650yhX extends C09AY implements Function0<ColdCacheExpiredConfig> {
    public C1867650yhX() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final ColdCacheExpiredConfig invoke() {
        ColdCacheExpiredConfig coldCacheExpiredConfig;
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            ColdCacheExpiredConfig coldCacheExpiredConfig2 = C1867660yhY.LIZIZ;
            ColdCacheExpiredConfig coldCacheExpiredConfig3 = (ColdCacheExpiredConfig) c0c64LJIILLIIL.LJJIIJ(true, "cold_cache_expired_setting", 31744, ColdCacheExpiredConfig.class, coldCacheExpiredConfig2, 2);
            ColdCacheExpiredConfig coldCacheExpiredConfig4 = coldCacheExpiredConfig2;
            if (coldCacheExpiredConfig3 != null) {
                coldCacheExpiredConfig4 = coldCacheExpiredConfig3;
            }
            C189200o6.m2constructorimpl(coldCacheExpiredConfig4);
            coldCacheExpiredConfig = coldCacheExpiredConfig4;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            coldCacheExpiredConfig = c098200Yq;
        }
        return C189200o6.m5exceptionOrNullimpl(coldCacheExpiredConfig) != null ? C1867660yhY.LIZIZ : coldCacheExpiredConfig;
    }
}
