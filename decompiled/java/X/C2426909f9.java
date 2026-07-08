package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.09f9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2426909f9 {
    public static final List<InterfaceC20279414Wq> LIZ = new ArrayList();

    public static long LIZ() {
        List<InterfaceC345370DgN> listLJIIJJI = C2427009fA.LJIIJJI();
        if (listLJIIJJI == null) {
            return 0L;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJIIJJI, 10));
        Iterator it2 = ((ArrayList) listLJIIJJI).iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(((InterfaceC345370DgN) it2.next()).LJII(false)));
        }
        return C13LP.LJZL(arrayList);
    }
}
