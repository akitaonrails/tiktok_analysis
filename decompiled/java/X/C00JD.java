package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.00JD, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00JD {
    public static final List<Integer> LIZ = C1697810uHb.LJIIJJI(5, 5, 5);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0C64] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.List<java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public static List LIZ() {
        ?? LJIILLIIL = C0C64.LJIILLIIL();
        ?? arrayList = LIZ;
        List list = (List) LJIILLIIL.LJJII(List.class, arrayList, "smart_movie_bach_count", true);
        if (list != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(Integer.valueOf((int) ((Number) it2.next()).doubleValue()));
            }
        }
        return arrayList;
    }
}
