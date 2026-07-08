package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.pages.result.common.tabs.core.ai.SearchSmartDynamicTabConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0PH6, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PH6 extends C09AY implements Function0<SearchSmartDynamicTabConfig> {
    public C0PH6() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final SearchSmartDynamicTabConfig invoke() {
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            SearchSmartDynamicTabConfig searchSmartDynamicTabConfig = C0PH7.LIZ;
            SearchSmartDynamicTabConfig searchSmartDynamicTabConfig2 = (SearchSmartDynamicTabConfig) c0c64LJIILLIIL.LJJII(SearchSmartDynamicTabConfig.class, searchSmartDynamicTabConfig, "search_smart_dynamic_tab_config", true);
            return searchSmartDynamicTabConfig2 != null ? searchSmartDynamicTabConfig2 : searchSmartDynamicTabConfig;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C0PH7.LIZ;
        }
    }
}
