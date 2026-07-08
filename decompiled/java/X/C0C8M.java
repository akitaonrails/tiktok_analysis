package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0C8M, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C8M implements Runnable {
    public static final C0C8M LL = new C0C8M();

    public static void LIZ() {
        int i;
        C01GW c01gw = C0C8O.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis() - ((long) C0C8O.LIZIZ());
        if (C0C8O.LJ > jCurrentTimeMillis && (i = C0C8O.LJFF) < 3) {
            C0C8O.LJFF = i + 1;
            C0C8O.LIZLLL();
            return;
        }
        C0C8O.LJFF = 0;
        Iterator it2 = ((LinkedHashMap) C0C8O.LIZLLL).entrySet().iterator();
        while (it2.hasNext()) {
            if (((Number) ((Map.Entry) it2.next()).getValue()).longValue() < jCurrentTimeMillis) {
                it2.remove();
            }
        }
        if (!C0C8O.LIZLLL.isEmpty()) {
            C0C8O.LIZLLL();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("RepeatRequestQuicklyMob@5bda.cleanRunnable$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RepeatRequestQuicklyMob@5bda.cleanRunnable$1");
    }
}
