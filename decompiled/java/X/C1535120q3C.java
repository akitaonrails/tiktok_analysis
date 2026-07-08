package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.internal.AwS567S0100000_23;

/* JADX INFO: renamed from: X.0q3C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1535120q3C {
    public final AtomicInteger LIZ = new AtomicInteger(1);
    public volatile boolean LIZIZ;
    public final /* synthetic */ C1535040q34 LIZJ;

    public final boolean LIZ() {
        int i;
        do {
            i = this.LIZ.get();
            if (i >= 1073741824 || i <= 0) {
                return true;
            }
        } while (!this.LIZ.compareAndSet(i, 1073741824 | i));
        return false;
    }

    public final void LIZIZ() {
        Unit unit;
        try {
            Thread thread = this.LIZJ.LJI;
            if (thread != null) {
                thread.interrupt();
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        C1535200q3K c1535200q3K = this.LIZJ.LJII;
        if (c1535200q3K != null) {
            c1535200q3K.LIZ();
        }
        this.LIZJ.LJI = null;
        this.LIZJ.LJII = null;
    }

    public final void LIZJ() {
        int i;
        Unit unit;
        Object c098200Yq;
        do {
            i = this.LIZ.get();
        } while (!this.LIZ.compareAndSet(i, Integer.MIN_VALUE | i));
        this.LIZJ.LJIIJJI.countDown();
        C1534320q1u<C1535200q3K<Runnable>> c1534320q1u = this.LIZJ.LJIIL;
        c1534320q1u.LIZIZ = true;
        while (c1534320q1u.LIZJ.get() > 0) {
        }
        if (!this.LIZJ.LJIIL.LIZIZ()) {
            C086F c086f = C086F.LIZ;
            AwS567S0100000_23 awS567S0100000_23 = new AwS567S0100000_23(this.LIZJ, 2);
            c086f.getClass();
            C086F.LJI(awS567S0100000_23);
        }
        C1534360q1y<?> c1534360q1y = this.LIZJ.LJIILJJIL;
        if (c1534360q1y != null) {
            this.LIZJ.LJIILJJIL = null;
            try {
                c1534360q1y.LIZIZ();
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m1boximpl(c098200Yq);
        }
        while (true) {
            try {
                Iterator<Map.Entry<Class<?>, C1535180q3I<C1535110q3B<?>>>> it2 = this.LIZJ.LJIILL.entrySet().iterator();
                while (it2.hasNext()) {
                    C1535110q3B<?> c1535110q3BLIZ = it2.next().getValue().LIZ();
                    if (c1535110q3BLIZ != null) {
                        try {
                            C1534360q1y<?> c1534360q1y2 = c1535110q3BLIZ.LJI;
                            if (c1534360q1y2 != null) {
                                c1534360q1y2.LIZIZ();
                                unit = Unit.LIZ;
                            } else {
                                unit = null;
                            }
                            C189200o6.m2constructorimpl(unit);
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            C189200o6.m2constructorimpl(new C098200Yq(th2));
                        }
                        c1535110q3BLIZ.LIZIZ(null, false, null);
                    }
                }
                return;
            } catch (ConcurrentModificationException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public C1535120q3C(C1535040q34 c1535040q34) {
        this.LIZJ = c1535040q34;
    }

    public final boolean LJ(int i) {
        int i2;
        if (i <= 0) {
            return false;
        }
        if (this.LIZ.get() < 0) {
            return true;
        }
        if (LIZLLL(i, true)) {
            this.LIZ.set(Integer.MIN_VALUE);
            LIZIZ();
            return true;
        }
        do {
            i2 = this.LIZ.get();
            if (i2 < 0) {
                LIZIZ();
                return true;
            }
            if (i2 != i && i2 != 1073741824 + i) {
                this.LIZ.getAndAdd(-i);
                return false;
            }
        } while (!this.LIZ.compareAndSet(i2, Integer.MIN_VALUE));
        LIZJ();
        LIZIZ();
        return true;
    }

    public final boolean LIZLLL(int i, boolean z) {
        C1535040q34 c1535040q34 = this.LIZJ.LIZLLL;
        if (c1535040q34 != null) {
            C1535040q34 c1535040q342 = this.LIZJ;
            LinkedList<String> linkedList = c1535040q342.LJIIIIZZ;
            if (linkedList == null) {
                linkedList = new LinkedList<>();
            }
            linkedList.addAll(c1535040q34.LIZJ);
            c1535040q342.LJIIIIZZ = linkedList;
            if (i > 0) {
                if (z) {
                    c1535040q34.LJIIIZ.LJ(i);
                    return true;
                }
                c1535040q34.LJIIIZ.LIZ.addAndGet(-i);
                return true;
            }
            return true;
        }
        return false;
    }
}
