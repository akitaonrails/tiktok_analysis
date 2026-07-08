package X;

import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.11FE, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11FE {
    public static final C11FE LIZ = new C11FE();

    public static int LIZ(boolean z) {
        if (LIZIZ(z) && !C0A1V.LIZ(z)) {
            return 1;
        }
        return 0;
    }

    public static final boolean LIZIZ(boolean z) {
        if ((C0C64.LJIILLIIL().LJIIIZ(31744, "enable_unlimited_music_tab_server", true, true) && !((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LJIIJ() && !((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().LIZ()) || z) {
            return true;
        }
        return false;
    }
}
