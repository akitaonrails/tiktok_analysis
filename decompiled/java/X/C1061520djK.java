package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;

/* JADX INFO: renamed from: X.0djK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1061520djK extends AbstractC1061590djR {
    @Override // X.AbstractC1059420dfw
    public final InterfaceC1051760dTa LIZ(C1059490dg3 c1059490dg3) {
        InterfaceC20673515v3 interfaceC20673515v3K4;
        ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
        if (iLiveOuterService != null && (interfaceC20673515v3K4 = iLiveOuterService.k4()) != null) {
            return interfaceC20673515v3K4.getLiveWalletJSBByName(this.LLIZ, c1059490dg3.LIZLLL, c1059490dg3.LIZIZ);
        }
        return null;
    }
}
