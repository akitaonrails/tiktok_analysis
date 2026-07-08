package X;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0ax1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C954690ax1 {
    public static final String LIZ(C13E8<C954570awp> c13e8) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(c13e8, 10));
        Iterator<C954570awp> it2 = c13e8.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().toString());
        }
        return C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
    }
}
