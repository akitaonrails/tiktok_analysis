package X;

import com.bytedance.ies.im.core.api.PlatformApi;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMNetworkSaasApi;
import com.ss.android.ugc.aweme.im.service.network.IMChatRoomNetDispatchConfigService;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0YlK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C883520YlK implements InterfaceC872790YLt {
    public static final C883520YlK LIZ;
    public static final C01GW LIZIZ;

    static {
        C883520YlK c883520YlK = new C883520YlK();
        LIZ = c883520YlK;
        LIZIZ = C452501pT.LIZIZ(new C883510YlJ());
        EventBus.LIZLLL().LJIJJ(c883520YlK);
    }

    public static final int LIZIZ() {
        IMNetworkSaasApi.LIZ.getClass();
        IMNetworkSaasApi iMNetworkSaasApiLIZ = C05O2.LIZ();
        if (iMNetworkSaasApiLIZ != null) {
            return iMNetworkSaasApiLIZ.getNqeNetworkLevel();
        }
        return -1;
    }

    public static final boolean LIZJ() {
        C0I0B.LJFF.LIZJ();
        return C0XF1.LIZLLL(C894660Z7w.LIZ());
    }

    public static final void LIZLLL() {
        IMChatRoomNetDispatchConfigService.LIZ.getClass();
        IMChatRoomNetDispatchConfigService iMChatRoomNetDispatchConfigServiceLIZ = C883540YlM.LIZ();
        if (iMChatRoomNetDispatchConfigServiceLIZ != null) {
            iMChatRoomNetDispatchConfigServiceLIZ.register();
        }
    }

    public static final void LJ() {
        IMChatRoomNetDispatchConfigService.LIZ.getClass();
        IMChatRoomNetDispatchConfigService iMChatRoomNetDispatchConfigServiceLIZ = C883540YlM.LIZ();
        if (iMChatRoomNetDispatchConfigServiceLIZ != null) {
            iMChatRoomNetDispatchConfigServiceLIZ.LJI();
        }
        IMChatRoomNetDispatchConfigService iMChatRoomNetDispatchConfigServiceLIZ2 = C883540YlM.LIZ();
        if (iMChatRoomNetDispatchConfigServiceLIZ2 != null) {
            iMChatRoomNetDispatchConfigServiceLIZ2.LJI();
        }
    }

    public static final void LIZ(InterfaceC872780YLs interfaceC872780YLs) {
        ((CopyOnWriteArraySet) LIZIZ.getValue()).add(interfaceC872780YLs);
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onNetworkEvent(C2411109cb c2411109cb) {
        C0I0B.LJFF.LIZJ();
        C0XF1.LIZLLL(C894660Z7w.LIZ());
        if (c2411109cb.LIZ != 1) {
        }
        Iterator it2 = ((CopyOnWriteArraySet) LIZIZ.getValue()).iterator();
        while (it2.hasNext()) {
            ((InterfaceC872780YLs) it2.next()).LIZ();
        }
    }

    public static final void LJFF(C883410Yl9 c883410Yl9, C914120Zta c914120Zta) {
        PlatformApi.LIZ.LJ(c883410Yl9, c914120Zta);
    }

    public static final void LJI(C883410Yl9 c883410Yl9, C914120Zta c914120Zta) {
        PlatformApi.LIZ.LJFF(c883410Yl9, c914120Zta);
    }
}
