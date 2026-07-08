package X;

import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.ecommerce.debug.IEComOfflineService;

/* JADX INFO: renamed from: X.0vdw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1750100vdw {
    public static C1331670kl3 LIZIZ(C1331670kl3 c1331670kl3, Image image) {
        LIZ(c1331670kl3, image, C2296808zG.LIZ(C0PEM.LIZJ));
        return c1331670kl3;
    }

    public static final C1331670kl3 LIZ(C1331670kl3 c1331670kl3, Image image, InterfaceC497601wk interfaceC497601wk) {
        if (C7879035x.LIZLLL() || C7879035x.LJ()) {
            IEComOfflineService iEComOfflineService = (IEComOfflineService) ServiceManager.get().getService(IEComOfflineService.class);
            C7879035x.LIZ();
            iEComOfflineService.LJII();
        }
        return c1331670kl3;
    }
}
