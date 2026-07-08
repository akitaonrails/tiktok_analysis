package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0Isa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C480340Isa {
    public final List<AbstractC480350Isb> LIZ = new CopyOnWriteArrayList();

    public final List LIZ() {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((CopyOnWriteArrayList) this.LIZ).iterator();
        while (it2.hasNext()) {
            it2.next().getClass();
            arrayList.add(AbstractC480350Isb.LIZ);
        }
        return arrayList;
    }

    public static void LIZIZ(List list) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((InterfaceC480370Isd) it2.next()).LIZ();
        }
    }
}
