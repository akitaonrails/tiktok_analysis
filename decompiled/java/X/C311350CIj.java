package X;

import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0CIj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C311350CIj {
    public static final C311350CIj LIZ = new C311350CIj();

    public static final boolean LIZ() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "studio_editor_pro_add_recommended_music_panel", true, false) && !((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LJ() && C0CHQ.LIZ().getAccountService().isLogin();
    }
}
