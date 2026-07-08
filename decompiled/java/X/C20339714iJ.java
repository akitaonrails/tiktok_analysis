package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import com.tiktok.strategycenterengine.manager.TTMStrategyCenterManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14iJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20339714iJ {
    public static volatile boolean LIZIZ;
    public static volatile InterfaceC830890Wid LIZJ;
    public static volatile boolean LIZLLL;
    public static volatile boolean LJ;
    public static boolean LJI;
    public static final C20339714iJ LIZ = new C20339714iJ();
    public static final Object LJFF = new Object();
    public static final List<Function0<Unit>> LJII = new ArrayList();

    public static void LIZ() {
        if (LIZLLL || LJ) {
            return;
        }
        LJ = true;
        TTMStrategyCenterManager.asyncRegisterSceneWithSceneKey("contact_cold_launch_upload", C13BV.INSTANCE, null, new AbstractC830880Wic() { // from class: X.14iK
            @Override // X.AbstractC830880Wic
            public final void LIZJ(InterfaceC830890Wid interfaceC830890Wid, EnumC2213771Bkd enumC2213771Bkd) {
                if (interfaceC830890Wid != null && enumC2213771Bkd == EnumC2213771Bkd.TTMStateCodeSuccess) {
                    C20339714iJ.LIZJ = interfaceC830890Wid;
                    C20339714iJ.LIZLLL = true;
                    List<InterfaceC830900Wie> listLIZJ = interfaceC830890Wid.LIZJ();
                    if (listLIZJ != null) {
                        Iterator<InterfaceC830900Wie> it2 = listLIZJ.iterator();
                        while (it2.hasNext()) {
                            it2.next();
                        }
                    }
                    C20339714iJ.LIZIZ(true);
                    C20339714iJ.LIZ.getClass();
                    synchronized (C20339714iJ.LJFF) {
                        try {
                            if (!C20339714iJ.LJI) {
                                C20339714iJ.LJI = true;
                                List<Function0<Unit>> list = C20339714iJ.LJII;
                                List listLLIIII = C13LP.LLIIII(list);
                                ((ArrayList) list).clear();
                                Iterator it3 = listLLIIII.iterator();
                                while (it3.hasNext()) {
                                    ((Function0) it3.next()).invoke();
                                }
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                C20339714iJ.LJ = false;
                C20339714iJ.LIZIZ(false);
            }
        });
    }

    public static final void LIZIZ(boolean z) {
        boolean zIsWeakNetwork;
        INetworkStateService iNetworkStateService = (INetworkStateService) ServiceManager.get().getService(INetworkStateService.class);
        if (iNetworkStateService != null) {
            zIsWeakNetwork = iNetworkStateService.isWeakNetwork();
        } else {
            zIsWeakNetwork = false;
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("success", String.valueOf(z));
        c0lab.LJ("weak_network", String.valueOf(zIsWeakNetwork));
        C20684815ws.LJIILLIIL("relation_contact_psp_prep", c0lab.LIZ);
    }
}
