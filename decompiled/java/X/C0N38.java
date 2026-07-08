package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.coldcache.exp.ColdCacheReportConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0N38, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N38 extends C09AY implements Function0<ColdCacheReportConfig> {
    public C0N38() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final ColdCacheReportConfig invoke() {
        ColdCacheReportConfig coldCacheReportConfig;
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            ColdCacheReportConfig coldCacheReportConfig2 = C590610NEl.LIZIZ;
            ColdCacheReportConfig coldCacheReportConfig3 = (ColdCacheReportConfig) c0c64LJIILLIIL.LJJIIJ(true, "cold_cache_report_exp", 31744, ColdCacheReportConfig.class, coldCacheReportConfig2, 2);
            ColdCacheReportConfig coldCacheReportConfig4 = coldCacheReportConfig2;
            if (coldCacheReportConfig3 != null) {
                coldCacheReportConfig4 = coldCacheReportConfig3;
            }
            C189200o6.m2constructorimpl(coldCacheReportConfig4);
            coldCacheReportConfig = coldCacheReportConfig4;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            coldCacheReportConfig = c098200Yq;
        }
        return C189200o6.m5exceptionOrNullimpl(coldCacheReportConfig) != null ? C590610NEl.LIZIZ : coldCacheReportConfig;
    }
}
