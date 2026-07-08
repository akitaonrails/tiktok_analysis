package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0Ixk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C483540Ixk {
    public final List<AbstractC483560Ixm> LIZ = new CopyOnWriteArrayList();

    public final List LIZ() {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((CopyOnWriteArrayList) this.LIZ).iterator();
        while (it2.hasNext()) {
            it2.next().getClass();
            arrayList.add(AbstractC483560Ixm.LIZ);
        }
        return arrayList;
    }

    public static void LIZIZ(List list) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((InterfaceC483610Ixr) it2.next()).LIZ();
        }
    }
}
