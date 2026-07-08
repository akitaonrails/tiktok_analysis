package X;

import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0zqi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1911780zqi {
    public static final C1911780zqi LIZ = new C1911780zqi();

    public static boolean LIZ() {
        return C0C64.LJIILLIIL().LJIJ(31744, 1, "music_pick_page_type", true) == 0;
    }

    public static boolean LIZIZ(boolean z) {
        int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 1, "music_pick_page_type", true);
        if ((iLJIJ == 1 || iLJIJ == 2) && LIZJ(z)) {
            return true;
        }
        return false;
    }

    public static final boolean LIZJ(boolean z) {
        if (C0C64.LJIILLIIL().LJIJ(31744, 1, "music_pick_page_type", true) != 0) {
            if (z || !((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LJIIJ()) {
                return true;
            }
            return false;
        }
        return false;
    }
}
