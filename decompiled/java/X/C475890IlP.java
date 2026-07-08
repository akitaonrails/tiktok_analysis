package X;

import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: renamed from: X.0IlP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C475890IlP {
    public static void LIZ(C475860IlM c475860IlM) {
        LinkedList<C475860IlM> linkedList = C483170Ix9.LJ;
        C19719612Di.LJJIIJ(linkedList, new AwS586S0100000_7(c475860IlM, 505), true);
        if (linkedList.size() >= 5) {
            linkedList.removeLast();
        }
        Iterator<C475860IlM> it2 = linkedList.iterator();
        while (it2.hasNext()) {
            it2.next().LIZLLL = false;
        }
        c475860IlM.LIZLLL = true;
        C483170Ix9.LJ.addFirst(c475860IlM);
    }
}
