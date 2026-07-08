package X;

import com.ss.android.ugc.aweme.ecommerce.ug.newinstall.service.IEcUgNewInstallService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.0CQD, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CQD {
    public static final C0CQD LIZ = new C0CQD();
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static String LIZLLL;

    public static void LIZ() {
        if (C1514430pVp.LIZLLL().booleanValue() && ((Boolean) C259660AFo.LIZ.getValue()).booleanValue()) {
            IEcUgNewInstallService iEcUgNewInstallService = (IEcUgNewInstallService) PluggableExtentionKt.pluggableSpi$default(IEcUgNewInstallService.class, false, false, false, 14, null);
            if (iEcUgNewInstallService != null) {
                iEcUgNewInstallService.LIZLLL();
            }
            LIZIZ = true;
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("url", LIZLLL);
            c2344009Gk.LJIIIIZZ("need_mall", "1");
            C19249910Sr.LIZIZ.LIZJ(c2344009Gk);
            C20684815ws.LJIILLIIL("shoptab_enable_decision", c2344009Gk.LIZ);
        }
    }
}
