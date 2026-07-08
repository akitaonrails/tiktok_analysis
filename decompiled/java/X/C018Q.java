package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Pair;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.018Q, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C018Q {
    public static boolean LIZ;
    public static final LinkedList<Pair<Long, Long>> LIZIZ = new LinkedList<>();
    public static Pair<Long, Long> LIZJ;

    public static String LIZ(int i) {
        List listLLD = C13LP.LLD(i, LIZIZ);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLLD, 10));
        Iterator it2 = listLLD.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(((Number) ((Pair) it2.next()).getFirst()).longValue()));
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLLD, 10));
        Iterator it3 = listLLD.iterator();
        while (it3.hasNext()) {
            arrayList2.add(Long.valueOf(((Number) ((Pair) it3.next()).getSecond()).longValue()));
        }
        String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", e3.e, e3.f, 0, null, AnonymousClass0207.get$arr$(147), 24);
        String strLJJLIIIJ2 = C13LP.LJJLIIIJ(arrayList2, ",", e3.e, e3.f, 0, null, null, 56);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{\"roomIdList\": ");
        sbLIZ.append(strLJJLIIIJ);
        sbLIZ.append(",\"watchDurationList\": ");
        sbLIZ.append(strLJJLIIIJ2);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static Pair LIZIZ(int i) {
        List listLLD = C13LP.LLD(i, LIZIZ);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLLD, 10));
        Iterator it2 = listLLD.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(((Number) ((Pair) it2.next()).getFirst()).longValue()));
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listLLD, 10));
        Iterator it3 = listLLD.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Long.valueOf(((Number) ((Pair) it3.next()).getSecond()).longValue()));
        }
        ArrayList arrayList4 = new ArrayList(arrayList3);
        Pair<Long, Long> pair = LIZJ;
        if (pair != null && !arrayList2.contains(pair.getFirst())) {
            arrayList2.add(pair.getFirst());
            arrayList4.add(pair.getSecond());
        }
        return new Pair(arrayList2, arrayList4);
    }

    public static void LIZJ(long j, long j2) {
        LIZIZ.add(new Pair<>(Long.valueOf(j), Long.valueOf(j2)));
        LIZJ = null;
    }
}
