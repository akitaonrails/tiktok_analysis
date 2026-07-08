package X;

import com.bytedance.forest.Forest;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0QlX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C679810QlX {
    public static void LIZIZ(String str) {
        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
        if (C1161970gLL.LIZIZ().LIZ && str.length() > 4000) {
            int iMin = 0;
            while (iMin < str.length()) {
                iMin = Math.min(iMin + 4000, str.length());
            }
        }
    }

    public static void LIZ(C1536940q68 c1536940q68, List list, InterfaceC679820QlY interfaceC679820QlY, Forest forest, int i) {
        Forest forest2 = forest;
        C01GW<C1537720q7O> c01gw = C1540620qC4.LJJJJIZL;
        if ((i & 4) != 0) {
            interfaceC679820QlY = null;
        }
        if ((i & 8) != 0) {
            forest2 = null;
        }
        C683880Qs6.LIZIZ(c1536940q68);
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C23250099c.LIZLLL(C817503Hh.LL, null, null, new C680030Qlt((String) it2.next(), c1536940q68, forest2, copyOnWriteArrayList, null), 3);
        }
        if (interfaceC679820QlY != null) {
            interfaceC679820QlY.LIZ();
        }
    }
}
