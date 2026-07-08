package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0tAU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1654960tAU implements InterfaceC1655090tAh {
    public final Map<InterfaceC1655120tAk, C0URV> LIZ;
    public final Map<InterfaceC1655100tAi, InterfaceC772580USi> LIZIZ;
    public final Map<InterfaceC1655110tAj, InterfaceC772590USj> LIZJ;

    public C1654960tAU() {
        new HashMap();
        this.LIZ = new HashMap();
        this.LIZIZ = new HashMap();
        this.LIZJ = new HashMap();
    }

    public static final InterfaceC1654970tAV LIZ() {
        return ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).d5();
    }

    public static final boolean LIZIZ() {
        return ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).P3().LIZLLL();
    }

    public static final void LIZLLL(boolean z) {
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).P3().LIZIZ();
    }

    public final void LJ(C1654990tAX c1654990tAX) {
        InterfaceC772580USi interfaceC772580USi = (InterfaceC772580USi) ((HashMap) this.LIZIZ).get(c1654990tAX);
        if (interfaceC772580USi != null) {
            ((HashMap) this.LIZIZ).remove(c1654990tAX);
            ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).startLiveManager().LJII(interfaceC772580USi);
        }
    }

    public final void LJFF(C1654950tAT c1654950tAT) {
        InterfaceC772590USj interfaceC772590USj = (InterfaceC772590USj) ((HashMap) this.LIZJ).get(c1654950tAT);
        if (interfaceC772590USj != null) {
            ((HashMap) this.LIZJ).remove(c1654950tAT);
            ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).startLiveManager().LIZIZ(interfaceC772590USj);
        }
    }

    public final void LJI(C1654930tAR c1654930tAR) {
        C0URV c0urv = (C0URV) ((HashMap) this.LIZ).get(c1654930tAR);
        if (c0urv != null) {
            ((HashMap) this.LIZ).remove(c1654930tAR);
            ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).startLiveManager().LJ(c0urv);
        }
    }

    public static final void LIZJ(String str, boolean z, C0UPN c0upn) {
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).P3().LJIIJJI(str, z, new C783970Up9(c0upn));
    }
}
