package X;

import java.util.Iterator;

/* JADX INFO: renamed from: X.0KED, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KED {
    public static C0KE2 LIZ(long j) {
        C0KE2 next;
        Iterator<C0KE2> it2 = C0KE2.getEntries().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.getValue() == j) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C0KE2 c0ke2 = next;
        if (c0ke2 == null) {
            return C0KE2.UNKNOWN;
        }
        return c0ke2;
    }
}
