package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0vu3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1760090vu3 implements InterfaceC1760140vu8<C1759970vtr> {
    public final /* synthetic */ C1759940vto LIZ;

    public C1760090vu3(C1759940vto c1759940vto) {
        this.LIZ = c1759940vto;
    }

    @Override // X.InterfaceC1760140vu8
    public final void LIZ(C1741570vQB c1741570vQB, boolean z, String str) {
        String str2;
        if (z) {
            str2 = "destroy_success";
        } else {
            str2 = "destroy_fail";
        }
        c1741570vQB.LIZ(str2, str, null, z);
    }

    @Override // X.InterfaceC1760140vu8
    public final C1741570vQB LIZIZ(Object obj, String str, Map map) {
        ConcurrentHashMap<String, Object> concurrentHashMap;
        Integer numValueOf;
        String str2;
        EnumC1759950vtp enumC1759950vtp;
        C1054104Ah c1054104Ah;
        C1759970vtr c1759970vtr = (C1759970vtr) obj;
        SeaPdpViewModel seaPdpViewModelLIZIZ = this.LIZ.LIZ.LIZIZ();
        if (seaPdpViewModelLIZIZ != null && (c1054104Ah = seaPdpViewModelLIZIZ.LLJLIL) != null) {
            concurrentHashMap = c1054104Ah.LIZIZ;
        } else {
            concurrentHashMap = null;
        }
        if (c1759970vtr != null && (enumC1759950vtp = c1759970vtr.LIZIZ) != null) {
            numValueOf = Integer.valueOf(enumC1759950vtp.getValue());
        } else {
            numValueOf = null;
        }
        C1008603wy.LIZIZ(map, "type", numValueOf);
        if (c1759970vtr != null) {
            str2 = c1759970vtr.LIZJ;
        } else {
            str2 = null;
        }
        C1008603wy.LIZIZ(map, "schema", str2);
        C1008603wy.LIZIZ(map, "pdp_component_id", str);
        C1741570vQB c1741570vQBLIZ = C1741580vQC.LIZ("popup", "destroy", concurrentHashMap, null, map);
        C1741570vQB.LIZIZ(c1741570vQBLIZ, "destroy_start", null, null, 6);
        return c1741570vQBLIZ;
    }
}
