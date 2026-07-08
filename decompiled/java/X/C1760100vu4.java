package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0vu4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1760100vu4 implements InterfaceC1760140vu8<C1760020vtw> {
    public final /* synthetic */ C1759980vts LIZ;

    public C1760100vu4(C1759980vts c1759980vts) {
        this.LIZ = c1759980vts;
    }

    @Override // X.InterfaceC1760140vu8
    public final void LIZ(C1741570vQB c1741570vQB, boolean z, String str) {
        String str2;
        if (z) {
            str2 = "hide_success";
        } else {
            str2 = "hide_fail";
        }
        c1741570vQB.LIZ(str2, str, null, z);
    }

    @Override // X.InterfaceC1760140vu8
    public final C1741570vQB LIZIZ(Object obj, String str, Map map) {
        ConcurrentHashMap<String, Object> concurrentHashMap;
        Integer numValueOf;
        String str2;
        EnumC1760010vtv enumC1760010vtv;
        C1054104Ah c1054104Ah;
        C1760020vtw c1760020vtw = (C1760020vtw) obj;
        SeaPdpViewModel seaPdpViewModelLIZIZ = this.LIZ.LIZ.LIZIZ();
        if (seaPdpViewModelLIZIZ != null && (c1054104Ah = seaPdpViewModelLIZIZ.LLJLIL) != null) {
            concurrentHashMap = c1054104Ah.LIZIZ;
        } else {
            concurrentHashMap = null;
        }
        if (c1760020vtw != null && (enumC1760010vtv = c1760020vtw.LIZ) != null) {
            numValueOf = Integer.valueOf(enumC1760010vtv.getValue());
        } else {
            numValueOf = null;
        }
        C1008603wy.LIZIZ(map, "type", numValueOf);
        if (c1760020vtw != null) {
            str2 = c1760020vtw.LIZIZ;
        } else {
            str2 = null;
        }
        C1008603wy.LIZIZ(map, "schema", str2);
        C1008603wy.LIZIZ(map, "pdp_component_id", str);
        C1741570vQB c1741570vQBLIZ = C1741580vQC.LIZ("pendant", "hide", concurrentHashMap, null, map);
        C1741570vQB.LIZIZ(c1741570vQBLIZ, "hide_start", null, null, 6);
        return c1741570vQBLIZ;
    }
}
