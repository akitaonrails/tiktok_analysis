package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;

/* JADX INFO: renamed from: X.0dhf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1060490dhf extends AbstractC1060820diC {
    @Override // X.AbstractC1059420dfw
    public final InterfaceC1051760dTa LIZ(C1059490dg3 c1059490dg3) {
        return ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().k4().getLiveWalletJSBByName("charge", c1059490dg3.LIZLLL, c1059490dg3.LIZIZ);
    }
}
