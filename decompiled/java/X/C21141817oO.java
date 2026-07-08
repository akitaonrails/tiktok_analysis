package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.SearchPostRealTimeConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.17oO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21141817oO extends C09AY implements Function0<SearchPostRealTimeConfig> {
    public C21141817oO() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final SearchPostRealTimeConfig invoke() {
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            SearchPostRealTimeConfig searchPostRealTimeConfig = C21141917oP.LIZ;
            SearchPostRealTimeConfig searchPostRealTimeConfig2 = (SearchPostRealTimeConfig) c0c64LJIILLIIL.LJJII(SearchPostRealTimeConfig.class, searchPostRealTimeConfig, "search_post_real_time", true);
            return searchPostRealTimeConfig2 != null ? searchPostRealTimeConfig2 : searchPostRealTimeConfig;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C21141917oP.LIZ;
        }
    }
}
