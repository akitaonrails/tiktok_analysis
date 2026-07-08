package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ISearchService;

/* JADX INFO: renamed from: X.0nin, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1445590nin {
    public static final C1445590nin LIZ = new C1445590nin();

    public static final boolean LIZ() {
        return (LIZIZ() <= 0 || C0CHQ.LIZ().getAccountService().LIZ() || ((ISearchService) ServiceManager.get().getService(ISearchService.class)).LLZLI().disableEffectSearch) ? false : true;
    }

    public static final int LIZIZ() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_effects_panel_support_search", true);
    }
}
