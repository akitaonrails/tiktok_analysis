package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0CYN, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CYN {
    public static int LIZ(List list) {
        C0CYH c0cyh = C0CYH.LIZJ;
        if (!c0cyh.LJIIIZ()) {
            return list.size();
        }
        long jLJIIIIZZ = c0cyh.LJIIIIZZ();
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            i = 0;
            while (it2.hasNext()) {
                if (jCurrentTimeMillis - ((Number) it2.next()).longValue() <= jLJIIIIZZ && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        return i;
    }
}
