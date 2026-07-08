package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.communication.ISeaPdpCommunicationService;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0vuA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1760160vuA extends AbstractC1760070vu1 {
    public final C1757400vpi LJIIIZ;
    public C1760300vuO LJIIJ;

    @Override // X.AbstractC1760070vu1
    public final void LIZLLL() {
        C1760300vuO c1760300vuO = this.LJIIJ;
        if (c1760300vuO != null) {
            c1760300vuO.LIZIZ();
        }
        this.LJIIJ = null;
    }

    @Override // X.AbstractC1760070vu1
    public final View LJ() {
        View viewLIZJ;
        C1760300vuO c1760300vuO = this.LJIIJ;
        if (c1760300vuO == null || (viewLIZJ = c1760300vuO.LIZJ()) == null) {
            return null;
        }
        C03DZ.LIZ(viewLIZJ);
        return viewLIZJ;
    }

    public final View LJI(Context context, InterfaceC1760220vuG interfaceC1760220vuG) {
        ConcurrentHashMap<String, Object> concurrentHashMap;
        C1054104Ah c1054104Ah;
        IPdpStarter.PdpEnterParam pdpEnterParam;
        Map<String, Object> map;
        String strLJIIIIZZ;
        C1760300vuO c1760300vuOLIZ = C1760260vuK.LIZ(InterfaceC1760230vuH.LIZ, null, 3);
        C1760020vtw c1760020vtw = this.LIZLLL;
        String str = c1760020vtw.LIZIZ;
        HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(c1760020vtw.LIZJ);
        Map mapLJIIJ2 = C2097608Jq.LJIIJ(new Pair("pdp_component_id", this.LJ));
        SeaPdpViewModel seaPdpViewModelLIZIZ = this.LJIIIZ.LIZIZ();
        if (seaPdpViewModelLIZIZ != null && (pdpEnterParam = seaPdpViewModelLIZIZ.LLIZ) != null && (map = pdpEnterParam.trackParams) != null && (strLJIIIIZZ = C1741890vQh.LJIIIIZZ(map)) != null) {
            mapLJIIJ2.put("trackParams", strLJIIIIZZ);
        }
        ISeaPdpCommunicationService iSeaPdpCommunicationServiceLIZ = this.LJIIIZ.LIZ();
        SeaPdpViewModel seaPdpViewModelLIZIZ2 = this.LJIIIZ.LIZIZ();
        if (seaPdpViewModelLIZIZ2 != null && (c1054104Ah = seaPdpViewModelLIZIZ2.LLJLIL) != null) {
            concurrentHashMap = c1054104Ah.LIZIZ;
        } else {
            concurrentHashMap = null;
        }
        final C1760130vu7 c1760130vu7 = (C1760130vu7) interfaceC1760220vuG;
        c1760300vuOLIZ.LIZLLL(context, new C1760290vuN("pdp_page_pendant", str, mapLJIIJ, mapLJIIJ2, iSeaPdpCommunicationServiceLIZ, concurrentHashMap, this), new InterfaceC1760340vuS() { // from class: X.0vuE
            @Override // X.InterfaceC1760340vuS
            public final void LIZ() {
            }

            @Override // X.InterfaceC1760340vuS
            public final void LJJ() {
            }

            @Override // X.InterfaceC1760340vuS
            public final void LJIJJLI() {
                c1760130vu7.LIZ();
                C313201Ji.LIZ(new C1760190vuD(this, null));
                c1760130vu7.LIZIZ();
            }

            @Override // X.InterfaceC1760340vuS
            public final void LJIL(String str2) {
                Map<String, Object> mapLJIIJ3;
                InterfaceC1760220vuG interfaceC1760220vuG2 = c1760130vu7;
                String str3 = this.LJ;
                if (str2 != null) {
                    mapLJIIJ3 = C2097608Jq.LJIIJ(new Pair("extra_error_info", str2));
                } else {
                    mapLJIIJ3 = null;
                }
                interfaceC1760220vuG2.LIZJ(str3, "load fail", mapLJIIJ3);
            }
        });
        this.LJIIJ = c1760300vuOLIZ;
        View viewLIZJ = c1760300vuOLIZ.LIZJ();
        if (viewLIZJ == null) {
            return null;
        }
        C03DZ.LIZ(viewLIZJ);
        return viewLIZJ;
    }

    public C1760160vuA(C1757400vpi c1757400vpi, C1760050vtz c1760050vtz, ViewGroup viewGroup, C1760020vtw c1760020vtw) {
        super(c1760050vtz, viewGroup, c1760020vtw);
        this.LJIIIZ = c1757400vpi;
    }
}
