package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TSn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C747150TSn {
    public static void LIZ(int i, String str) {
        C759450Tqh c759450Tqh;
        C759450Tqh c759450Tqh2 = null;
        Object obj = null;
        for (C759450Tqh c759450Tqh3 : (ArrayList) C759450Tqh.LJIIIZ) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(((LinkedHashMap) c759450Tqh3.LJFF).keySet());
            for (Object obj2 : (ArrayList) c759450Tqh3.LIZLLL) {
                if (obj2 instanceof C759410Tqd) {
                    arrayList.add(obj2);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    Object next = it2.next();
                    if (Intrinsics.LJFF(((C759410Tqd) next).LIZLLL, str)) {
                        if (next != null) {
                            c759450Tqh2 = c759450Tqh3;
                            obj = next;
                        }
                    }
                }
            }
        }
        Pair pair = new Pair(c759450Tqh2, obj);
        C759410Tqd c759410Tqd = (C759410Tqd) pair.getSecond();
        if (c759410Tqd != null && (c759450Tqh = (C759450Tqh) pair.getFirst()) != null) {
            c759410Tqd.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(i)));
            int iIndexOf = ((ArrayList) c759450Tqh.LIZLLL).indexOf(c759410Tqd);
            C759390Tqb c759390Tqb = c759450Tqh.LIZJ;
            if (c759390Tqb != null && iIndexOf != -1) {
                c759390Tqb.notifyItemChanged(iIndexOf);
            }
        }
    }
}
