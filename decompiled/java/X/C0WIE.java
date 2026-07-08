package X;

import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0WIE, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WIE {
    public static final C0WIE LIZ = new C0WIE();

    public static void LIZ(String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("oem_name", "samsung");
        c2344009Gk.LJIIIIZZ("oem_country", ((IAccountService) ServiceManager.get().getService(IAccountService.class)).getStoreRegionUpperCase());
        c2344009Gk.LJIIIIZZ("query", str);
        c2344009Gk.LJIIIIZZ("reason", str2);
        C20684815ws.LJIILLIIL("oem_search_failed", c2344009Gk.LIZ);
    }
}
