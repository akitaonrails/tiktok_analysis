package X;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0sEO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1618940sEO {
    public static final C1618940sEO LIZ = new C1618940sEO();
    public static final AtomicInteger LIZIZ = new AtomicInteger(0);
    public static final AtomicInteger LIZJ = new AtomicInteger(0);
    public static final AtomicBoolean LIZLLL = new AtomicBoolean(false);
    public static final AtomicInteger LJ = new AtomicInteger(0);
    public static final AtomicInteger LJFF = new AtomicInteger(0);

    public static void LIZ(int i, boolean z) {
        AtomicInteger atomicInteger = LJFF;
        AtomicInteger atomicInteger2 = LJ;
        atomicInteger.set(atomicInteger2.get());
        atomicInteger2.set(i);
        int i2 = atomicInteger2.get();
        int i3 = atomicInteger.get();
        if (i2 > 99) {
            if (i3 > 99) {
                return;
            }
        } else if (i2 == i3) {
            return;
        }
        LIZIZ.incrementAndGet();
        if (!z) {
            return;
        }
        LIZJ.incrementAndGet();
    }
}
