package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0La9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C545350La9 {
    public static final List<String> LIZ(C552940LmO c552940LmO, Set<String> set) {
        if (set.isEmpty()) {
            return C13BV.INSTANCE;
        }
        Collection<C552890LmJ<?, ?, ?, ?>> collectionValues = c552940LmO.LIZLLL.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (set.contains(((C552890LmJ) obj).LIZLLL.getNodeName())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C552890LmJ) it2.next()).LIZ);
        }
        return arrayList2;
    }
}
