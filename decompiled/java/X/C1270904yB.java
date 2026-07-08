package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.04yB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1270904yB {
    public final List<C1271004yC> LIZ;

    public C1270904yB(List list) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C1271004yC(new C1271104yD((Map) it2.next())));
        }
        this.LIZ = new ArrayList(arrayList);
    }
}
