package X;

import android.os.SystemClock;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0vmi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1755540vmi {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ() {
        return C1697810uHb.LJIIJJI(C602400Njy.class, C04I0.class, C1743390vT7.class, C1766310w45.class, C1515040pWo.class, C1750870vfB.class, C1757880vqU.class);
    }

    public static void LIZIZ(C1075770e6J c1075770e6J, InterfaceC1748810vbr interfaceC1748810vbr, View view, PdpViewModel pdpViewModel) {
        boolean z;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (c1075770e6J == null) {
            C1019103yf.LIZ(EnumC1014603xw.ERR49, new RuntimeException("hybridBridge is null"), null);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("register registerBridgeModuleForCard ");
        if (interfaceC1748810vbr != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C1326490kch.LJI(C2188811AlT.LIZIZ(sbLIZ));
        if (interfaceC1748810vbr != null) {
            c1075770e6J.LJIJJ(InterfaceC1748810vbr.class, interfaceC1748810vbr);
            c1075770e6J.LJIJJ(View.class, view);
            c1075770e6J.LJIJJ(PdpViewModel.class, pdpViewModel);
        }
        boolean zLIZ = C0C16.LIZ();
        if (!zLIZ) {
            Iterator it2 = LIZ().iterator();
            while (it2.hasNext()) {
                c1075770e6J.LJIILL((Class) it2.next(), EnumC1063300dmC.ALL);
            }
        }
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        C1755550vmj c1755550vmj = new C1755550vmj(zLIZ, jElapsedRealtime);
        c2341109Fh.getClass();
        C2341109Fh.LIZIZ(c1755550vmj);
    }
}
