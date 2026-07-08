package X;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0oY8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1477420oY8 extends C1477370oY3 {
    public InterfaceC1475640oVG LJFF;

    public C1477420oY8(InterfaceC1477480oYE interfaceC1477480oYE) {
        super(interfaceC1477480oYE);
    }

    @Override // X.C1477370oY3, X.InterfaceC1475640oVG
    public final C1477120oXe LIZIZ(List<? extends InterfaceC1477220oXo> list, Map<String, Object> map) {
        Float f;
        C1477120oXe c1477120oXe = new C1477120oXe();
        c1477120oXe.LLIZ.append("SmartBitrateSelector");
        if (list != null && !list.isEmpty()) {
            map.get("source_id");
            Object obj = map.get("KEY_AUTO_BITRATE_SET");
            if (obj instanceof InterfaceC1475360oUo) {
                this.LJFF.LIZ((InterfaceC1475360oUo) obj);
                c1477120oXe.LLIZ.append(", change curve");
                return this.LJFF.LIZIZ(list, map);
            }
            AbstractC1511510pR7 abstractC1511510pR7LIZIZ = C1511420pQy.LIZ().LIZIZ("smart_model_play_selection");
            if (abstractC1511510pR7LIZIZ != null && abstractC1511510pR7LIZIZ.enable()) {
                C1509310pNZ c1509310pNZ = new C1509310pNZ();
                c1509310pNZ.LIZ().putAll(map);
                C1512100pS4 c1512100pS4RunSync = abstractC1511510pR7LIZIZ.runSync(c1509310pNZ);
                if (c1512100pS4RunSync != null && c1512100pS4RunSync.LIZIZ() && (f = c1512100pS4RunSync.LIZLLL) != null) {
                    c1477120oXe.LLIZ.append(", smartSelect");
                    double dDoubleValue = f.doubleValue();
                    c1477120oXe.LLILZLL = dDoubleValue;
                    LJ(c1477120oXe, new C1477650oYV(true, dDoubleValue), list);
                    C786410Ut5.j4("smart select success: calcBitRate:%s, finalBitRate:%s", new Object[]{Double.valueOf(c1477120oXe.LLILZLL), c1477120oXe.LL});
                    return c1477120oXe;
                }
            }
            c1477120oXe.LLIZ.append(", smartFallback");
            return this.LJFF.LIZIZ(list, map);
        }
        c1477120oXe.LLIZ.append(", bitRates empty");
        c1477120oXe.LLILZIL = new C1477070oXZ(0, "bitrate list is empty...");
        return c1477120oXe;
    }
}
