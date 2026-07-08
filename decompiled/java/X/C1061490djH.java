package X;

import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.service.IECommerceLiveBridgeService;

/* JADX INFO: renamed from: X.0djH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1061490djH extends AbstractC1061620djU {
    @Override // X.AbstractC1059420dfw
    public final InterfaceC1051760dTa LIZ(C1059490dg3 c1059490dg3) {
        IECommerceLiveBridgeService iECommerceLiveBridgeService = (IECommerceLiveBridgeService) ServiceManager.get().getService(IECommerceLiveBridgeService.class);
        IESJsBridge iESJsBridge = c1059490dg3.LIZIZ;
        return iECommerceLiveBridgeService.LJFF(this.LLIZ, c1059490dg3.LIZLLL, iESJsBridge);
    }
}
