package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.134Y, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public abstract class C134Y<V> implements ListenableFuture<V> {
    public static final boolean LLILZ = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger LLILZIL = Logger.getLogger(C134Y.class.getName());
    public static final AbstractC199508134g LLILZLL;
    public static final Object LLIZ;
    public volatile Object LL;
    public volatile C199515134n LLILLJJLI;
    public volatile C199511134j LLILLL;

    static {
        AbstractC199508134g abstractC199508134g;
        try {
            final AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater = AtomicReferenceFieldUpdater.newUpdater(C199511134j.class, Thread.class, "LIZ");
            final AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater2 = AtomicReferenceFieldUpdater.newUpdater(C199511134j.class, C199511134j.class, "LIZIZ");
            final AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater3 = AtomicReferenceFieldUpdater.newUpdater(C134Y.class, C199511134j.class, "LLILLL");
            final AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater4 = AtomicReferenceFieldUpdater.newUpdater(C134Y.class, C199515134n.class, "LLILLJJLI");
            final AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater5 = AtomicReferenceFieldUpdater.newUpdater(C134Y.class, Object.class, "LL");
            abstractC199508134g = new AbstractC199508134g(atomicReferenceFieldUpdaterNewUpdater, atomicReferenceFieldUpdaterNewUpdater2, atomicReferenceFieldUpdaterNewUpdater3, atomicReferenceFieldUpdaterNewUpdater4, atomicReferenceFieldUpdaterNewUpdater5) { // from class: X.134f
                public final AtomicReferenceFieldUpdater<C199511134j, Thread> LIZ;
                public final AtomicReferenceFieldUpdater<C199511134j, C199511134j> LIZIZ;
                public final AtomicReferenceFieldUpdater<C134Y, C199511134j> LIZJ;
                public final AtomicReferenceFieldUpdater<C134Y, C199515134n> LIZLLL;
                public final AtomicReferenceFieldUpdater<C134Y, Object> LJ;

                @Override // X.AbstractC199508134g
                public final void LIZLLL(C199511134j c199511134j, C199511134j c199511134j2) {
                    this.LIZIZ.lazySet(c199511134j, c199511134j2);
                }

                @Override // X.AbstractC199508134g
                public final void LJ(C199511134j c199511134j, Thread thread) {
                    this.LIZ.lazySet(c199511134j, thread);
                }

                @Override // X.AbstractC199508134g
                public final boolean LIZ(C134Y<?> c134y, C199515134n c199515134n, C199515134n c199515134n2) {
                    AtomicReferenceFieldUpdater<C134Y, C199515134n> atomicReferenceFieldUpdater = this.LIZLLL;
                    while (!atomicReferenceFieldUpdater.compareAndSet(c134y, c199515134n, c199515134n2)) {
                        if (atomicReferenceFieldUpdater.get(c134y) != c199515134n) {
                            return false;
                        }
                    }
                    return true;
                }

                @Override // X.AbstractC199508134g
                public final boolean LIZIZ(C134Y<?> c134y, Object obj, Object obj2) {
                    AtomicReferenceFieldUpdater<C134Y, Object> atomicReferenceFieldUpdater = this.LJ;
                    while (!atomicReferenceFieldUpdater.compareAndSet(c134y, obj, obj2)) {
                        if (atomicReferenceFieldUpdater.get(c134y) != obj) {
                            return false;
                        }
                    }
                    return true;
                }

                @Override // X.AbstractC199508134g
                public final boolean LIZJ(C134Y<?> c134y, C199511134j c199511134j, C199511134j c199511134j2) {
                    AtomicReferenceFieldUpdater<C134Y, C199511134j> atomicReferenceFieldUpdater = this.LIZJ;
                    while (!atomicReferenceFieldUpdater.compareAndSet(c134y, c199511134j, c199511134j2)) {
                        if (atomicReferenceFieldUpdater.get(c134y) != c199511134j) {
                            return false;
                        }
                    }
                    return true;
                }

                {
                    this.LIZ = atomicReferenceFieldUpdaterNewUpdater;
                    this.LIZIZ = atomicReferenceFieldUpdaterNewUpdater2;
                    this.LIZJ = atomicReferenceFieldUpdaterNewUpdater3;
                    this.LIZLLL = atomicReferenceFieldUpdaterNewUpdater4;
                    this.LJ = atomicReferenceFieldUpdaterNewUpdater5;
                }
            };
            th = null;
        } catch (Throwable th) {
            th = th;
            TryCatchGuardChecker.doCheck(th);
            abstractC199508134g = new AbstractC199508134g() { // from class: X.134e
                @Override // X.AbstractC199508134g
                public final void LIZLLL(C199511134j c199511134j, C199511134j c199511134j2) {
                    c199511134j.LIZIZ = c199511134j2;
                }

                @Override // X.AbstractC199508134g
                public final void LJ(C199511134j c199511134j, Thread thread) {
                    c199511134j.LIZ = thread;
                }

                @Override // X.AbstractC199508134g
                public final boolean LIZ(C134Y<?> c134y, C199515134n c199515134n, C199515134n c199515134n2) {
                    synchronized (c134y) {
                        try {
                            if (c134y.LLILLJJLI == c199515134n) {
                                c134y.LLILLJJLI = c199515134n2;
                                return true;
                            }
                            return false;
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            throw th2;
                        }
                    }
                }

                @Override // X.AbstractC199508134g
                public final boolean LIZIZ(C134Y<?> c134y, Object obj, Object obj2) {
                    synchronized (c134y) {
                        try {
                            if (c134y.LL == obj) {
                                c134y.LL = obj2;
                                return true;
                            }
                            return false;
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            throw th2;
                        }
                    }
                }

                @Override // X.AbstractC199508134g
                public final boolean LIZJ(C134Y<?> c134y, C199511134j c199511134j, C199511134j c199511134j2) {
                    synchronized (c134y) {
                        try {
                            if (c134y.LLILLL == c199511134j) {
                                c134y.LLILLL = c199511134j2;
                                return true;
                            }
                            return false;
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            throw th2;
                        }
                    }
                }
            };
        }
        LLILZLL = abstractC199508134g;
        if (th != null) {
            LLILZIL.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        LLIZ = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String LJI() {
        Object obj = this.LL;
        if (obj instanceof RunnableC2043607zW) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setFuture=[");
            obj.getClass();
            sbLIZ.append("null");
            sbLIZ.append(e3.f);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("remaining delay=[");
        sbLIZ2.append(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS));
        sbLIZ2.append(" ms]");
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.LL instanceof C199516134o;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof RunnableC2043607zW)) & (this.LL != null);
    }

    public final String toString() {
        String strLIZIZ;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.LL instanceof C199516134o) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            LIZ(sb);
        } else {
            try {
                strLIZIZ = LJI();
            } catch (RuntimeException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Exception thrown from implementation: ");
                sbLIZ.append(e.getClass());
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            if (strLIZIZ != null && !strLIZIZ.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strLIZIZ);
                sb.append(e3.f);
            } else if (isDone()) {
                LIZ(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append(e3.f);
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.LL;
        if ((obj2 != null) && (!(obj2 instanceof RunnableC2043607zW))) {
            return (V) LIZLLL(obj2);
        }
        C199511134j c199511134j = this.LLILLL;
        if (c199511134j != C199511134j.LIZJ) {
            C199511134j c199511134j2 = new C199511134j();
            do {
                AbstractC199508134g abstractC199508134g = LLILZLL;
                abstractC199508134g.LIZLLL(c199511134j2, c199511134j);
                if (abstractC199508134g.LIZJ(this, c199511134j, c199511134j2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            LJII(c199511134j2);
                            throw new InterruptedException();
                        }
                        obj = this.LL;
                    } while (!((obj != null) & (!(obj instanceof RunnableC2043607zW))));
                    return (V) LIZLLL(obj);
                }
                c199511134j = this.LLILLL;
            } while (c199511134j != C199511134j.LIZJ);
        }
        return (V) LIZLLL(this.LL);
    }

    public static void LIZIZ(C134Y<?> c134y) {
        C199511134j c199511134j;
        C199515134n c199515134n;
        do {
            c199511134j = c134y.LLILLL;
        } while (!LLILZLL.LIZJ(c134y, c199511134j, C199511134j.LIZJ));
        while (c199511134j != null) {
            Thread thread = c199511134j.LIZ;
            if (thread != null) {
                c199511134j.LIZ = null;
                LockSupport.unpark(thread);
            }
            c199511134j = c199511134j.LIZIZ;
        }
        do {
            c199515134n = c134y.LLILLJJLI;
        } while (!LLILZLL.LIZ(c134y, c199515134n, C199515134n.LIZLLL));
        C199515134n c199515134n2 = null;
        while (c199515134n != null) {
            C199515134n c199515134n3 = c199515134n.LIZJ;
            c199515134n.LIZJ = c199515134n2;
            c199515134n2 = c199515134n;
            c199515134n = c199515134n3;
        }
        while (c199515134n2 != null) {
            C199515134n c199515134n4 = c199515134n2.LIZJ;
            Runnable runnable = c199515134n2.LIZ;
            if (!(runnable instanceof RunnableC2043607zW)) {
                LIZJ(runnable, c199515134n2.LIZIZ);
                c199515134n2 = c199515134n4;
            } else {
                runnable.getClass();
                throw null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final V LIZLLL(Object obj) throws ExecutionException {
        if (!(obj instanceof C199516134o)) {
            if (!(obj instanceof C199524134w)) {
                if (obj == LLIZ) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((C199524134w) obj).LIZ);
        }
        Throwable th = ((C199516134o) obj).LIZ;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    public static <V> V LJ(Future<V> future) {
        V v;
        boolean z = false;
        while (true) {
            try {
                try {
                    v = future.get();
                    break;
                } catch (InterruptedException e) {
                    TryCatchGuardChecker.doCheck(e);
                    z = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (z) {
                    C786410Ut5.u3().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            C786410Ut5.u3().interrupt();
        }
        return v;
    }

    public final void LIZ(StringBuilder sb) {
        String strValueOf;
        try {
            Object objLJ = LJ(this);
            sb.append("SUCCESS, result=[");
            if (objLJ == this) {
                strValueOf = "this future";
            } else {
                strValueOf = String.valueOf(objLJ);
            }
            sb.append(strValueOf);
            sb.append(e3.f);
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            TryCatchGuardChecker.doCheck(e2);
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            TryCatchGuardChecker.doCheck(e3);
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append(e3.f);
        }
    }

    public final void LJII(C199511134j c199511134j) {
        c199511134j.LIZ = null;
        while (true) {
            C199511134j c199511134j2 = this.LLILLL;
            if (c199511134j2 == C199511134j.LIZJ) {
                return;
            }
            C199511134j c199511134j3 = null;
            while (c199511134j2 != null) {
                C199511134j c199511134j4 = c199511134j2.LIZIZ;
                if (c199511134j2.LIZ != null) {
                    c199511134j3 = c199511134j2;
                } else if (c199511134j3 != null) {
                    c199511134j3.LIZIZ = c199511134j4;
                    if (c199511134j3.LIZ == null) {
                        break;
                    }
                } else if (!LLILZLL.LIZJ(this, c199511134j2, c199511134j4)) {
                    break;
                }
                c199511134j2 = c199511134j4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean z2;
        C199516134o c199516134o;
        Object obj = this.LL;
        if (obj == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 | (obj instanceof RunnableC2043607zW)) {
            if (LLILZ) {
                c199516134o = new C199516134o(new CancellationException("Future.cancel() was called."), z);
            } else if (z) {
                c199516134o = C199516134o.LIZIZ;
            } else {
                c199516134o = C199516134o.LIZJ;
            }
            while (!LLILZLL.LIZIZ(this, obj, c199516134o)) {
                obj = this.LL;
                if (!(obj instanceof RunnableC2043607zW)) {
                    return false;
                }
            }
            LIZIZ(this);
            if (!(obj instanceof RunnableC2043607zW)) {
                return true;
            }
            obj.getClass();
            throw null;
        }
        return false;
    }

    public static void LIZJ(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            Logger logger = LLILZIL;
            Level level = Level.SEVERE;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("RuntimeException while executing runnable ");
            sbLIZ.append(runnable);
            sbLIZ.append(" with executor ");
            sbLIZ.append(executor);
            logger.log(level, C2188811AlT.LIZIZ(sbLIZ), (Throwable) e);
        }
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void LJIIJJI(Runnable runnable, Executor executor) {
        executor.getClass();
        C199515134n c199515134n = this.LLILLJJLI;
        if (c199515134n != C199515134n.LIZLLL) {
            C199515134n c199515134n2 = new C199515134n(runnable, executor);
            do {
                c199515134n2.LIZJ = c199515134n;
                if (LLILZLL.LIZ(this, c199515134n, c199515134n2)) {
                    return;
                } else {
                    c199515134n = this.LLILLJJLI;
                }
            } while (c199515134n != C199515134n.LIZLLL);
        }
        LIZJ(runnable, executor);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x013e A[PHI: r4
      0x013e: PHI (r4v11 java.lang.String) = (r4v10 java.lang.String), (r4v15 java.lang.String) binds: [B:58:0x00ff, B:67:0x013c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V get(long r17, java.util.concurrent.TimeUnit r19) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        /*
            Method dump skipped, instruction units count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C134Y.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }
}
