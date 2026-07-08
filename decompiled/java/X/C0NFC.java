package X;

import java.util.Iterator;

/* JADX INFO: renamed from: X.0NFC, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NFC {
    public static C0NFD LIZ(int i) {
        C0NFD next;
        Iterator<C0NFD> it2 = C0NFD.getEntries().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.getValue() == i) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C0NFD c0nfd = next;
        if (c0nfd == null) {
            return C0NFD.IO_COST;
        }
        return c0nfd;
    }
}
