package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.common.config.SearchActiveConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0QDZ, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QDZ extends C09AY implements Function0<SearchActiveConfig> {
    public C0QDZ() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final SearchActiveConfig invoke() {
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            SearchActiveConfig searchActiveConfig = C0QDY.LIZ;
            SearchActiveConfig searchActiveConfig2 = (SearchActiveConfig) c0c64LJIILLIIL.LJJII(SearchActiveConfig.class, searchActiveConfig, "search_preload_active_config", true);
            return searchActiveConfig2 != null ? searchActiveConfig2 : searchActiveConfig;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return C0QDY.LIZ;
        }
    }
}
