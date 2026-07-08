package X;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.05f4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1407205f4 {
    public static final boolean LIZ(C1346605Ou c1346605Ou, List<String> list) {
        if (list.isEmpty()) {
            return false;
        }
        if (!list.isEmpty()) {
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                AbstractC1406905f1 abstractC1406905f1 = c1346605Ou.LIZ.get(it2.next());
                if (!(abstractC1406905f1 instanceof C1406405ew) && !(abstractC1406905f1 instanceof C1406605ey) && !(abstractC1406905f1 instanceof C1407005f2)) {
                    return false;
                }
            }
        }
        return true;
    }
}
