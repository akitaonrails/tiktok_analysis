package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0gHE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1159420gHE {
    public static final List<C1159480gHK> LIZ(List<C1159480gHK> list, boolean z) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<C1159480gHK> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(C1159480gHK.LIZ(it2.next(), 0.0f, z, false, 95));
        }
        return arrayList;
    }
}
