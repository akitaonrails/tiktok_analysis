package X;

import android.app.Activity;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;

/* JADX INFO: renamed from: X.10bH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19276910bH extends AbstractC1893900zNs {
    @Override // X.InterfaceC19271510aP
    public final String getName() {
        return "micro_app_handler";
    }

    public C19276910bH(InterfaceC1879420z0W interfaceC1879420z0W) {
        super(interfaceC1879420z0W);
    }

    @Override // X.InterfaceC19271510aP
    public final boolean LIZIZ(int i, String str) {
        Activity activityLJFF;
        if (TextUtils.isEmpty(str) || (activityLJFF = C2214201BlK.LJFF()) == null) {
            return false;
        }
        IMiniAppService iMiniAppServiceLIZIZ = C988700bps.LIZ.LIZIZ();
        C1611490s2N c1611490s2N = new C1611490s2N();
        if (!C1030670cvZ.LIZ(str)) {
            return false;
        }
        iMiniAppServiceLIZIZ.openMiniApp(activityLJFF, str, c1611490s2N);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "scan");
        c2344009Gk.LJIIIIZZ("enter_method", "scan_cam");
        c2344009Gk.LJIIIIZZ("microapp_id", C018G.LIZIZ(str, "app_id"));
        C20684815ws.LJIILLIIL("enter_microapp", c2344009Gk.LIZ);
        return true;
    }
}
