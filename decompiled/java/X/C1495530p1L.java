package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;
import xlp.c;

/* JADX INFO: renamed from: X.0p1L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1495530p1L {
    public ExecutorService LIZJ;
    public final int LIZ = 64;
    public final int LIZIZ = 5;
    public final Deque<C1495550p1N> LIZLLL = new ArrayDeque();
    public final Deque<C1495550p1N> LJ = new ArrayDeque();
    public final Deque<C1495500p1I> LJFF = new ArrayDeque();

    public final synchronized ExecutorService LIZJ() {
        if (this.LIZJ == null) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            SynchronousQueue synchronousQueue = new SynchronousQueue();
            byte[] bArr = c.LIZ;
            this.LIZJ = new C822650WOx(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new ThreadFactoryC1496300p2a("OkHttp Dispatcher", false));
        }
        return this.LIZJ;
    }

    public final synchronized int LJI() {
        return this.LJ.size() + this.LJFF.size();
    }

    public final void LJFF() {
        int i;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it2 = ((ArrayDeque) this.LIZLLL).iterator();
                while (true) {
                    i = 0;
                    if (!it2.hasNext()) {
                        break;
                    }
                    C1495550p1N c1495550p1N = (C1495550p1N) it2.next();
                    if (((ArrayDeque) this.LJ).size() >= this.LIZ) {
                        break;
                    }
                    Iterator it3 = ((ArrayDeque) this.LJ).iterator();
                    while (it3.hasNext()) {
                        C1495500p1I c1495500p1I = ((C1495550p1N) it3.next()).LLILLL;
                        if (!c1495500p1I.LLILZLL && c1495500p1I.LLILZIL.url().LIZLLL.equals(c1495550p1N.LLILLL.LLILZIL.url().LIZLLL)) {
                            i++;
                        }
                    }
                    if (i < this.LIZIZ) {
                        it2.remove();
                        arrayList.add(c1495550p1N);
                        ((ArrayDeque) this.LJ).add(c1495550p1N);
                    }
                }
                LJI();
            } finally {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        int size = arrayList.size();
        while (i < size) {
            C1495550p1N c1495550p1N2 = (C1495550p1N) ListProtector.get(arrayList, i);
            ExecutorService executorServiceLIZJ = LIZJ();
            c1495550p1N2.getClass();
            try {
                try {
                    executorServiceLIZJ.execute(c1495550p1N2);
                } catch (RejectedExecutionException e) {
                    TryCatchGuardChecker.doCheck(e);
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e);
                    c1495550p1N2.LLILLL.LLILZ.callFailed(c1495550p1N2.LLILLL, interruptedIOException);
                    c1495550p1N2.LLILLJJLI.onFailure(c1495550p1N2.LLILLL, interruptedIOException);
                    c1495550p1N2.LLILLL.LL.LL.LIZLLL(c1495550p1N2);
                }
                i++;
            } catch (Throwable th) {
                c1495550p1N2.LLILLL.LL.LL.LIZLLL(c1495550p1N2);
                throw th;
            }
        }
    }

    public C1495530p1L() {
    }

    public C1495530p1L(ExecutorService executorService) {
        this.LIZJ = executorService;
    }

    public final void LIZ(C1495550p1N c1495550p1N) {
        synchronized (this) {
            try {
                ((ArrayDeque) this.LIZLLL).add(c1495550p1N);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        LJFF();
    }

    public final synchronized void LIZIZ(C1495500p1I c1495500p1I) {
        ((ArrayDeque) this.LJFF).add(c1495500p1I);
    }

    public final void LIZLLL(C1495550p1N c1495550p1N) {
        Deque<C1495550p1N> deque = this.LJ;
        synchronized (this) {
            try {
                if (!((ArrayDeque) deque).remove(c1495550p1N)) {
                    throw new AssertionError("Call wasn't in-flight!");
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        LJFF();
    }

    public final void LJ(C1495500p1I c1495500p1I) {
        Deque<C1495500p1I> deque = this.LJFF;
        synchronized (this) {
            try {
                if (!((ArrayDeque) deque).remove(c1495500p1I)) {
                    throw new AssertionError("Call wasn't in-flight!");
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        LJFF();
    }
}
