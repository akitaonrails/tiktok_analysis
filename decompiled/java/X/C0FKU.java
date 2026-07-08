package X;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0FKU, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FKU {
    public static final C0FTJ LIZ(int i, List list) {
        Object next;
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (((C0FTJ) next).getStickerId() == i) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return (C0FTJ) next;
    }
}
