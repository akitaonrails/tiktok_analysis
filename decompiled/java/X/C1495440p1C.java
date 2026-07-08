package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.Reference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;
import xlp.c;

/* JADX INFO: renamed from: X.0p1C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1495440p1C {
    public static final C822650WOx LJI;
    public final int LIZ;
    public final long LIZIZ;
    public final RunnableC1495460p1E LIZJ;
    public final Deque<C1495650p1X> LIZLLL;
    public final C1494020oyu LJ;
    public boolean LJFF;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        byte[] bArr = c.LIZ;
        LJI = new C822650WOx(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new ThreadFactoryC1496300p2a("OkHttp ConnectionPool", true));
    }

    public C1495440p1C() {
        this(5, 5L, TimeUnit.MINUTES);
    }

    public final long LIZ(long j) {
        synchronized (this) {
            try {
                C1495650p1X c1495650p1X = null;
                long j2 = Long.MIN_VALUE;
                int i = 0;
                int i2 = 0;
                for (C1495650p1X c1495650p1X2 : (ArrayDeque) this.LIZLLL) {
                    if (LIZIZ(c1495650p1X2, j) > 0) {
                        i2++;
                    } else {
                        i++;
                        long j3 = j - c1495650p1X2.LJIILJJIL;
                        if (j3 > j2) {
                            c1495650p1X = c1495650p1X2;
                            j2 = j3;
                        }
                    }
                }
                long j4 = this.LIZIZ;
                if (j2 < j4 && i <= this.LIZ) {
                    if (i > 0) {
                        return j4 - j2;
                    }
                    if (i2 > 0) {
                        return j4;
                    }
                    this.LJFF = false;
                    return -1L;
                }
                ((ArrayDeque) this.LIZLLL).remove(c1495650p1X);
                c.LJFF(c1495650p1X.LJ);
                return 0L;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final int LIZIZ(C1495650p1X c1495650p1X, long j) {
        List<Reference<C1495430p1B>> list = c1495650p1X.LJIILIIL;
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i < arrayList.size()) {
                Reference reference = (Reference) ListProtector.get(arrayList, i);
                if (reference.get() != null) {
                    i++;
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("A connection to ");
                    sbLIZ.append(c1495650p1X.LIZJ.LIZ.LIZ);
                    sbLIZ.append(" was leaked. Did you forget to close a response body?");
                    C842670X3x.LIZ.LJIIL(((C1495480p1G) reference).LIZ, C2188811AlT.LIZIZ(sbLIZ));
                    ListProtector.remove(arrayList, i);
                    c1495650p1X.LJIIJ = true;
                    if (arrayList.isEmpty()) {
                        c1495650p1X.LJIILJJIL = j - this.LIZIZ;
                        return 0;
                    }
                }
            } else {
                return arrayList.size();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0p1E] */
    public C1495440p1C(int i, long j, TimeUnit timeUnit) {
        this.LIZJ = new Runnable() { // from class: X.0p1E
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                while (true) {
                    try {
                        long jLIZ = this.LL.LIZ(System.nanoTime());
                        if (jLIZ == -1) {
                            return;
                        }
                        if (jLIZ > 0) {
                            long j2 = jLIZ / 1000000;
                            Long.signum(j2);
                            long j3 = jLIZ - (1000000 * j2);
                            synchronized (this.LL) {
                                try {
                                    try {
                                        this.LL.wait(j2, (int) j3);
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        throw th;
                                    }
                                } catch (InterruptedException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            }
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                }
            }
        };
        this.LIZLLL = new ArrayDeque();
        this.LJ = new C1494020oyu();
        this.LIZ = i;
        this.LIZIZ = timeUnit.toNanos(j);
        if (j > 0) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("keepAliveDuration <= 0: ");
        sbLIZ.append(j);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
