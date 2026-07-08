package aho;

import X.AbstractC2255811DRb;
import X.C054G;
import X.C09AE;
import X.C0PEM;
import X.C0VWW;
import X.C20102213l6;
import X.C201955140j;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C268080Af0;
import X.C315540CYm;
import X.InterfaceC573160Mdu;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements InterfaceC573160Mdu {
    public static final b LIZ = new b();
    public static final C054G LIZIZ = C2296808zG.LIZ(C0PEM.LIZJ);
    public static final Map<AbstractC2255811DRb, C09AE> LIZJ = new LinkedHashMap();

    @Override // X.InterfaceC573160Mdu
    public final void LIZ(AbstractC2255811DRb abstractC2255811DRb) {
        if (((Boolean) C268080Af0.LIZ.getValue()).booleanValue()) {
            Map<AbstractC2255811DRb, C09AE> map = LIZJ;
            if (!map.containsKey(abstractC2255811DRb)) {
                C20102213l6 c20102213l6 = C20102213l6.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("startMetricScene: ");
                sbLIZ.append(abstractC2255811DRb);
                C201955140j.LIZLLL(c20102213l6, "SceneMonitor", C2188811AlT.LIZIZ(sbLIZ));
                C0VWW.LJI(abstractC2255811DRb.LIZ);
                map.put(abstractC2255811DRb, C23250099c.LIZLLL(LIZIZ, null, null, new C315540CYm(abstractC2255811DRb, null), 3));
            }
        }
    }

    public static final void LIZIZ(AbstractC2255811DRb abstractC2255811DRb, boolean z) {
        if (!((Boolean) C268080Af0.LIZ.getValue()).booleanValue()) {
            return;
        }
        C20102213l6 c20102213l6 = C20102213l6.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("endMetricScene: ");
        sbLIZ.append(abstractC2255811DRb);
        sbLIZ.append(", fromTimeout=");
        sbLIZ.append(z);
        C201955140j.LIZLLL(c20102213l6, "SceneMonitor", C2188811AlT.LIZIZ(sbLIZ));
        C09AE c09aeRemove = LIZJ.remove(abstractC2255811DRb);
        if (c09aeRemove != null && !z) {
            c09aeRemove.LIZIZ(null);
        }
        C0VWW.LIZIZ(abstractC2255811DRb.LIZ);
    }
}
