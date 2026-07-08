package X;

import com.bytedance.bddatefmt.BDDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0M3U, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M3U {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C0M0P c0m0p) {
        int i = c0m0p.LIZLLL;
        if (i != 106) {
            if (i == 114) {
                c0m0p.LIZLLL = 119;
                return;
            }
            return;
        }
        c0m0p.LIZLLL = 118;
    }

    public static List LIZIZ(List list) {
        ArrayList arrayList = new ArrayList();
        if ((!list.isEmpty()) && (C13LP.LJJJJZI(list) instanceof C561190Lzh)) {
            arrayList.add(C13LP.LJJJJZI(list));
        }
        Iterator it2 = list.iterator();
        String str = "";
        while (it2.hasNext()) {
            C561950M2f c561950M2f = (C561950M2f) it2.next();
            if (c561950M2f instanceof C0M0P) {
                String str2 = ((C0M0P) c561950M2f).LJJIIJZLJL;
                if (!Intrinsics.LJFF(str2, str)) {
                    arrayList.add(new C0M3S(str2, 1));
                    arrayList.add(c561950M2f);
                    str = str2;
                } else {
                    arrayList.add(c561950M2f);
                }
            }
        }
        return arrayList;
    }

    public static void LIZJ(List list) {
        HashSet hashSet = new HashSet();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C561950M2f c561950M2f = (C561950M2f) it2.next();
            if (c561950M2f instanceof C0M0P) {
                C0M0P c0m0p = (C0M0P) c561950M2f;
                LIZ(c0m0p);
                C562280M3m.LIZ.getClass();
                String strLIZIZ = ((BDDateFormat) C562280M3m.LIZLLL.getValue()).LIZIZ(c0m0p.LIZIZ(), C562280M3m.LIZIZ);
                if (!hashSet.contains(strLIZIZ)) {
                    c0m0p.LJJII = true;
                    hashSet.add(strLIZIZ);
                }
            }
        }
    }

    public static void LIZLLL(List list, List list2) {
        HashSet hashSet = new HashSet();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C561950M2f c561950M2f = (C561950M2f) it2.next();
            if (c561950M2f instanceof C0M0P) {
                C0M0P c0m0p = (C0M0P) c561950M2f;
                c0m0p.LJJIIJZLJL = C562270M3l.LJI(c0m0p).LIZ;
                if (c0m0p.LIZIZ() < jCurrentTimeMillis && (list2 == null || !list2.contains(c0m0p.LJJIIJZLJL))) {
                    LIZ(c0m0p);
                    C562280M3m.LIZ.getClass();
                    String strLIZIZ = ((BDDateFormat) C562280M3m.LIZLLL.getValue()).LIZIZ(c0m0p.LIZIZ(), C562280M3m.LIZIZ);
                    if (!hashSet.contains(strLIZIZ)) {
                        c0m0p.LJJII = true;
                        hashSet.add(strLIZIZ);
                    }
                }
            }
        }
    }
}
