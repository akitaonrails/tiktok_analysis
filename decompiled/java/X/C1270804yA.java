package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.04yA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1270804yA {
    public final List<C1270904yB> LIZ;

    public C1270804yA(List list) {
        list = list.isEmpty() ? Collections.singletonList(C13BV.INSTANCE) : list;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C1270904yB((List) it2.next()));
        }
        this.LIZ = arrayList;
    }
}
