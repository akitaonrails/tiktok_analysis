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

/* JADX INFO: renamed from: X.0vuB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1760170vuB extends AbstractC1760060vu0 {
    public final C1757400vpi LJIIJ;
    public C1760300vuO LJIIJJI;
    public volatile boolean LJIIL;
    public AnonymousClass0956 LJIILIIL;

    @Override // X.AbstractC1760060vu0
    public final void LIZLLL() {
        C1760300vuO c1760300vuO = this.LJIIJJI;
        if (c1760300vuO != null) {
            c1760300vuO.LIZIZ();
        }
        this.LJIIJJI = null;
    }

    @Override // X.AbstractC1760060vu0
    public final View LJ() {
        View viewLIZJ;
        AnonymousClass0956 anonymousClass0956 = this.LJIILIIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LJIILIIL = null;
        C1760300vuO c1760300vuO = this.LJIIJJI;
        if (c1760300vuO == null || (viewLIZJ = c1760300vuO.LIZJ()) == null) {
            return null;
        }
        C03DZ.LIZ(viewLIZJ);
        return viewLIZJ;
    }

    @Override // X.AbstractC1760060vu0
    public final View LJFF(Context context, InterfaceC1760220vuG interfaceC1760220vuG) {
        C1054104Ah c1054104Ah;
        IPdpStarter.PdpEnterParam pdpEnterParam;
        Map<String, Object> map;
        String strLJIIIIZZ;
        long j = this.LJ.LJ;
        if (j > 0) {
            this.LJIILIIL = C313201Ji.LIZ(new C1760180vuC(j, this, interfaceC1760220vuG, null));
        }
        ConcurrentHashMap<String, Object> concurrentHashMap = null;
        C1760300vuO c1760300vuOLIZ = C1760260vuK.LIZ(InterfaceC1760230vuH.LIZ, null, 3);
        C1759970vtr c1759970vtr = this.LJ;
        String str = c1759970vtr.LIZJ;
        HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(c1759970vtr.LIZLLL);
        Map mapLJIIJ2 = C2097608Jq.LJIIJ(new Pair("pdp_component_id", this.LJFF));
        SeaPdpViewModel seaPdpViewModelLIZIZ = this.LJIIJ.LIZIZ();
        if (seaPdpViewModelLIZIZ != null && (pdpEnterParam = seaPdpViewModelLIZIZ.LLIZ) != null && (map = pdpEnterParam.trackParams) != null && (strLJIIIIZZ = C1741890vQh.LJIIIIZZ(map)) != null) {
            mapLJIIJ2.put("trackParams", strLJIIIIZZ);
        }
        ISeaPdpCommunicationService iSeaPdpCommunicationServiceLIZ = this.LJIIJ.LIZ();
        SeaPdpViewModel seaPdpViewModelLIZIZ2 = this.LJIIJ.LIZIZ();
        if (seaPdpViewModelLIZIZ2 != null && (c1054104Ah = seaPdpViewModelLIZIZ2.LLJLIL) != null) {
            concurrentHashMap = c1054104Ah.LIZIZ;
        }
        final C1760030vtx c1760030vtx = (C1760030vtx) interfaceC1760220vuG;
        c1760300vuOLIZ.LIZLLL(context, new C1760290vuN("pdp_page_popup", str, mapLJIIJ, mapLJIIJ2, iSeaPdpCommunicationServiceLIZ, concurrentHashMap, this), new InterfaceC1760340vuS() { // from class: X.0vuF
            @Override // X.InterfaceC1760340vuS
            public final void LIZ() {
            }

            @Override // X.InterfaceC1760340vuS
            public final void LJJ() {
            }

            @Override // X.InterfaceC1760340vuS
            public final void LJIJJLI() {
                if (this.LIZ.LJIIL) {
                    return;
                }
                AnonymousClass0956 anonymousClass0956 = this.LIZ.LJIILIIL;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                this.LIZ.LJIILIIL = null;
                c1760030vtx.LIZ();
                c1760030vtx.LIZIZ();
            }

            @Override // X.InterfaceC1760340vuS
            public final void LJIL(String str2) {
                Map<String, Object> mapLJIIJ3;
                if (this.LIZ.LJIIL) {
                    return;
                }
                InterfaceC1760220vuG interfaceC1760220vuG2 = c1760030vtx;
                String str3 = this.LIZ.LJFF;
                if (str2 != null) {
                    mapLJIIJ3 = C2097608Jq.LJIIJ(new Pair("extra_error_info", str2));
                } else {
                    mapLJIIJ3 = null;
                }
                interfaceC1760220vuG2.LIZJ(str3, "load fail", mapLJIIJ3);
            }
        });
        this.LJIIJJI = c1760300vuOLIZ;
        return c1760300vuOLIZ.LIZJ();
    }

    public C1760170vuB(C1757400vpi c1757400vpi, C1760040vty c1760040vty, ViewGroup viewGroup, C1759970vtr c1759970vtr) {
        super(c1757400vpi, c1760040vty, viewGroup, c1759970vtr);
        this.LJIIJ = c1757400vpi;
    }
}
