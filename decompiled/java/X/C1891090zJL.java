package X;

import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0zJL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1891090zJL {
    public static final C1891090zJL LIZ = new C1891090zJL();

    public static void LIZ() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "creator_tools");
        C20684815ws.LJIILLIIL("ad_authorization_off", c2344009Gk.LIZ);
    }

    public static void LIZIZ() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "creator_tools");
        C20684815ws.LJIILLIIL("ad_authorization_on", c2344009Gk.LIZ);
    }

    public static void LIZJ(boolean z) {
        ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().LJJJJIZL(z);
    }
}
