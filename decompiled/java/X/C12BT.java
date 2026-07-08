package X;

import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IExternalService;

/* JADX INFO: renamed from: X.12BT, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12BT implements InterfaceC19744412Mw {
    @Override // X.InterfaceC19744412Mw
    public final boolean LIZ() {
        return ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().LIZ();
    }

    @Override // X.InterfaceC19744412Mw
    public final boolean LIZIZ() {
        return ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().hasECCommerceAnchor();
    }

    @Override // X.InterfaceC19744412Mw
    public final boolean LIZLLL() {
        return ((IExternalService) ServiceManager.get().getService(IExternalService.class)).commerceToolsService().usedCommerceSticker();
    }

    @Override // X.InterfaceC19744412Mw
    public final User getCurrentUser() {
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService != null) {
            return iUserService.getCurrentUser();
        }
        return null;
    }

    @Override // X.InterfaceC19744412Mw
    public final String getShootWay() {
        return ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().getShootWay();
    }

    @Override // X.InterfaceC19744412Mw
    public final boolean isCommerceChallenge() {
        return ((IExternalService) ServiceManager.get().getService(IExternalService.class)).commerceToolsService().isCommerceChallenge();
    }

    @Override // X.InterfaceC19744412Mw
    public final boolean isSubOnlyVideo() {
        return ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().isSubOnlyVideo();
    }

    @Override // X.InterfaceC19744412Mw
    public final void LIZJ(String str) {
        Aweme awemeLLILZ;
        IAwemeService iAwemeService = (IAwemeService) ServiceManager.get().getService(IAwemeService.class);
        if (iAwemeService != null && (awemeLLILZ = iAwemeService.LLILZ(str)) != null && AwemeExtKt.isAdTraffic(awemeLLILZ)) {
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("ad_music", "otherclick", awemeLLILZ.getAwemeRawAd());
            c1022820ciuLIZLLL.LIZJ("ad_music_usage", "refer");
            c1022820ciuLIZLLL.LJII();
        }
    }
}
