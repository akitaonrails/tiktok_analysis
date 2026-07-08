package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.07UJ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07UJ {
    public static final List<InterfaceC20685415wy> LIZ = new ArrayList();
    public static final List<C07UL> LIZIZ = new ArrayList();

    public static List LIZ(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6).iterator();
        while (it2.hasNext()) {
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL((String) it2.next(), new String[]{":"}, 0, 6);
            Object objLJJJLZIJ = C13LP.LJJJLZIJ(0, listLJJLIIIJILLIZJL);
            Object obj = "";
            if (objLJJJLZIJ == null) {
                objLJJJLZIJ = "";
            }
            Object objLJJJLZIJ2 = C13LP.LJJJLZIJ(1, listLJJLIIIJILLIZJL);
            if (objLJJJLZIJ2 != null) {
                obj = objLJJJLZIJ2;
            }
            arrayList.add(new Pair(objLJJJLZIJ, obj));
        }
        return arrayList;
    }
}
