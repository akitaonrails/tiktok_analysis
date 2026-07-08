package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.ecommerce.core.config.ECSearchBarExploreConfig;

/* JADX INFO: renamed from: X.07KC, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07KC {
    public static final ECSearchBarExploreConfig LIZ = new ECSearchBarExploreConfig(0);

    public static boolean LIZ() {
        Object c098200Yq;
        try {
            c098200Yq = (ECSearchBarExploreConfig) C0C64.LJIILLIIL().LJJII(ECSearchBarExploreConfig.class, LIZ, "ec_search_bar_explore_config", true);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        ECSearchBarExploreConfig eCSearchBarExploreConfig = (ECSearchBarExploreConfig) c098200Yq;
        if (eCSearchBarExploreConfig == null) {
            eCSearchBarExploreConfig = LIZ;
        }
        Integer num = eCSearchBarExploreConfig.searchBarExploreType;
        return num != null && num.intValue() == 1;
    }
}
