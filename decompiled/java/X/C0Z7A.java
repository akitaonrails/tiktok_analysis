package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS201S0000000_14;

/* JADX INFO: renamed from: X.0Z7A, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z7A {
    public static final C01GW<C0Z7A> LIZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(429));

    public static final void LIZ(long j) {
        C0Z79 c0z79LIZ = C1492305sn.LIZ();
        if (!c0z79LIZ.LJIILJJIL().get()) {
            c0z79LIZ.LIZJ.LJIILL = j;
        }
    }

    public static final void LIZIZ(long j) {
        C0Z79 c0z79LIZ = C1492305sn.LIZ();
        if (!c0z79LIZ.LJIILJJIL().get()) {
            C0Z7B c0z7b = c0z79LIZ.LIZJ;
            c0z7b.LJIJ += j;
            c0z7b.LJIJI++;
        }
    }

    public static final void LIZJ(long j) {
        C0Z7C c0z7cLJIILL;
        C0Z7C c0z7cLJIILL2;
        C1495105tF c1495105tFLIZIZ;
        C0Z79 c0z79LIZ = C1492305sn.LIZ();
        if (!c0z79LIZ.LJIILJJIL().get()) {
            c0z79LIZ.LIZJ.LJIJJ = j;
        }
        C0Z79 c0z79LIZ2 = C1492305sn.LIZ();
        if (!c0z79LIZ2.LJIILJJIL().get()) {
            C0Z7B c0z7b = c0z79LIZ2.LIZJ;
            if (c0z7b.LIZ > 0 && c0z7b.LJIILL > 0) {
                c0z79LIZ2.LJIILJJIL().set(true);
                Map mapLJIIL = C0Z79.LJIIL(c0z79LIZ2.LIZJ);
                InterfaceC1493105sv interfaceC1493105sv = (InterfaceC1493105sv) c0z79LIZ2.LIZ.getValue();
                LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(mapLJIIL.size()));
                for (Map.Entry entry : ((LinkedHashMap) mapLJIIL).entrySet()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue().toString());
                }
                interfaceC1493105sv.sendEvent("dm_conversation_data_flow_performance_revamp", linkedHashMap);
            } else {
                c0z79LIZ2.LJIILJJIL().set(true);
            }
        }
        C0Z79 c0z79LIZ3 = C1492305sn.LIZ();
        C0Z7B c0z7b2 = c0z79LIZ3.LIZJ;
        if (c0z7b2.LIZ > 0 && c0z7b2.LJIILL > 0 && (c0z7cLJIILL = c0z79LIZ3.LJIILL()) != null && C0Z79.LJIILIIL(c0z7cLJIILL) && (c0z7cLJIILL2 = c0z79LIZ3.LJIILL()) != null && (c1495105tFLIZIZ = c0z7cLJIILL2.LIZIZ(C0Z79.LJIIL(c0z79LIZ3.LIZJ))) != null) {
            c1495105tFLIZIZ.LJI();
            c1495105tFLIZIZ.LJFF("avatar_rendered", "activity_status_ready");
            c1495105tFLIZIZ.LJII();
            c1495105tFLIZIZ.LIZ(c0z79LIZ3.LIZJ.LJIILL, "user_click_inbox", null);
        }
    }
}
