package X;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0w76, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1768180w76 {
    public static final C1768180w76 LIZ = new C1768180w76();
    public static volatile WeakReference<InterfaceC1773310wFN> LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.HashMap, java.util.LinkedHashMap] */
    public static final void LIZ(String str, List list, Map map, boolean z) {
        InterfaceC1773310wFN interfaceC1773310wFN;
        ?? LJ;
        boolean zLJFF;
        Map mapLJ;
        WeakReference<InterfaceC1773310wFN> weakReference = LIZIZ;
        if (weakReference != null && (interfaceC1773310wFN = weakReference.get()) != null) {
            if (list != null) {
                LJ = new LinkedHashMap();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    LJ.put(it2.next(), "");
                }
            } else {
                LJ = C2097608Jq.LJ();
            }
            InterfaceC1773850wGF interfaceC1773850wGF = (InterfaceC1773850wGF) interfaceC1773310wFN.LIZJ().getService(InterfaceC1773850wGF.class);
            if (interfaceC1773850wGF != null) {
                if (map == null) {
                    mapLJ = C2097608Jq.LJ();
                } else {
                    mapLJ = map;
                }
                zLJFF = interfaceC1773850wGF.LJFF(new C1774950wI1(str, mapLJ, 1, 1, LJ, 68).LIZ(), null);
            } else {
                zLJFF = false;
            }
            if (!z || zLJFF) {
                return;
            }
        }
        if (map == null) {
            map = C2097608Jq.LJ();
        }
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C05A7(str, map, null), 2);
    }
}
