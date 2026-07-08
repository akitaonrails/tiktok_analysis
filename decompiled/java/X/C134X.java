package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.134X, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public class C134X implements InterfaceFutureC1488980oqm {
    public static final boolean LLILZ = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger LLILZIL = Logger.getLogger(C134X.class.getName());
    public static final AbstractC199513134l LLILZLL;
    public static final Object LLIZ;
    public volatile Object LL;
    public volatile C199523134v LLILLJJLI;
    public volatile C199512134k LLILLL;

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.LL instanceof C199517134p;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (this.LL != null) & (!(r1 instanceof RunnableC165600kI));
    }

    static {
        AbstractC199513134l abstractC199513134l;
        try {
            final AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater = AtomicReferenceFieldUpdater.newUpdater(C199512134k.class, Thread.class, "LIZ");
            final AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater2 = AtomicReferenceFieldUpdater.newUpdater(C199512134k.class, C199512134k.class, "LIZIZ");
            final AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater3 = AtomicReferenceFieldUpdater.newUpdater(C134X.class, C199512134k.class, "LLILLL");
            final AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater4 = AtomicReferenceFieldUpdater.newUpdater(C134X.class, C199523134v.class, "LLILLJJLI");
            final AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater5 = AtomicReferenceFieldUpdater.newUpdater(C134X.class, Object.class, "LL");
            abstractC199513134l = new AbstractC199513134l(atomicReferenceFieldUpdaterNewUpdater, atomicReferenceFieldUpdaterNewUpdater2, atomicReferenceFieldUpdaterNewUpdater3, atomicReferenceFieldUpdaterNewUpdater4, atomicReferenceFieldUpdaterNewUpdater5) { // from class: X.134m
                public final AtomicReferenceFieldUpdater LIZ;
                public final AtomicReferenceFieldUpdater LIZIZ;
                public final AtomicReferenceFieldUpdater LIZJ;
                public final AtomicReferenceFieldUpdater LIZLLL;
                public final AtomicReferenceFieldUpdater LJ;

                {
                    this.LIZ = atomicReferenceFieldUpdaterNewUpdater;
                    this.LIZIZ = atomicReferenceFieldUpdaterNewUpdater2;
                    this.LIZJ = atomicReferenceFieldUpdaterNewUpdater3;
                    this.LIZLLL = atomicReferenceFieldUpdaterNewUpdater4;
                    this.LJ = atomicReferenceFieldUpdaterNewUpdater5;
                }

                @Override // X.AbstractC199513134l
                public final void LIZ(C199512134k c199512134k, C199512134k c199512134k2) {
                    this.LIZIZ.lazySet(c199512134k, c199512134k2);
                }

                @Override // X.AbstractC199513134l
                public final void LIZIZ(C199512134k c199512134k, Thread thread) {
                    this.LIZ.lazySet(c199512134k, thread);
                }

                @Override // X.AbstractC199513134l
                public final boolean LIZJ(C134X c134x, C199523134v c199523134v, C199523134v c199523134v2) {
                    return AnonymousClass1350.LIZ(this.LIZLLL, c134x, c199523134v, c199523134v2);
                }

                @Override // X.AbstractC199513134l
                public final boolean LIZLLL(C134X c134x, Object obj, Object obj2) {
                    return AnonymousClass1350.LIZ(this.LJ, c134x, obj, obj2);
                }

                @Override // X.AbstractC199513134l
                public final boolean LJ(C134X c134x, C199512134k c199512134k, C199512134k c199512134k2) {
                    return AnonymousClass1350.LIZ(this.LIZJ, c134x, c199512134k, c199512134k2);
                }
            };
            th = null;
        } catch (Throwable th) {
            th = th;
            TryCatchGuardChecker.doCheck(th);
            abstractC199513134l = new AbstractC199513134l() { // from class: X.134i
                @Override // X.AbstractC199513134l
                public final void LIZ(C199512134k c199512134k, C199512134k c199512134k2) {
                    c199512134k.LIZIZ = c199512134k2;
                }

                @Override // X.AbstractC199513134l
                public final void LIZIZ(C199512134k c199512134k, Thread thread) {
                    c199512134k.LIZ = thread;
                }

                @Override // X.AbstractC199513134l
                public final boolean LIZJ(C134X c134x, C199523134v c199523134v, C199523134v c199523134v2) {
                    synchronized (c134x) {
                        try {
                            if (c134x.LLILLJJLI == c199523134v) {
                                c134x.LLILLJJLI = c199523134v2;
                                return true;
                            }
                            return false;
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            throw th2;
                        }
                    }
                }

                @Override // X.AbstractC199513134l
                public final boolean LIZLLL(C134X c134x, Object obj, Object obj2) {
                    synchronized (c134x) {
                        try {
                            if (c134x.LL == obj) {
                                c134x.LL = obj2;
                                return true;
                            }
                            return false;
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            throw th2;
                        }
                    }
                }

                @Override // X.AbstractC199513134l
                public final boolean LJ(C134X c134x, C199512134k c199512134k, C199512134k c199512134k2) {
                    synchronized (c134x) {
                        try {
                            if (c134x.LLILLL == c199512134k) {
                                c134x.LLILLL = c199512134k2;
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
        LLILZLL = abstractC199513134l;
        if (th != null) {
            LLILZIL.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        LLIZ = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String LIZ() {
        Object obj = this.LL;
        if (obj instanceof RunnableC165600kI) {
            obj.getClass();
            return "setFuture=[null]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.LL instanceof C199517134p) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            LIZJ(sb);
        } else {
            try {
                strConcat = LIZ();
            } catch (RuntimeException e) {
                TryCatchGuardChecker.doCheck(e);
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(e.getClass()));
            }
            if (strConcat != null && !strConcat.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strConcat);
                sb.append(e3.f);
            } else if (isDone()) {
                LIZJ(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append(e3.f);
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.LL;
        if ((obj2 != null) && (!(obj2 instanceof RunnableC165600kI))) {
            return LJI(obj2);
        }
        C199512134k c199512134k = this.LLILLL;
        C199512134k c199512134k2 = C199512134k.LIZJ;
        if (c199512134k != c199512134k2) {
            C199512134k c199512134k3 = new C199512134k();
            do {
                AbstractC199513134l abstractC199513134l = LLILZLL;
                abstractC199513134l.LIZ(c199512134k3, c199512134k);
                if (abstractC199513134l.LJ(this, c199512134k, c199512134k3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            LJ(c199512134k3);
                            throw new InterruptedException();
                        }
                        obj = this.LL;
                    } while (!((obj != null) & (!(obj instanceof RunnableC165600kI))));
                    return LJI(obj);
                }
                c199512134k = this.LLILLL;
            } while (c199512134k != c199512134k2);
        }
        return LJI(this.LL);
    }

    public static void LIZIZ(C134X c134x) {
        C199512134k c199512134k;
        AbstractC199513134l abstractC199513134l;
        C199523134v c199523134v;
        do {
            c199512134k = c134x.LLILLL;
            abstractC199513134l = LLILZLL;
        } while (!abstractC199513134l.LJ(c134x, c199512134k, C199512134k.LIZJ));
        while (c199512134k != null) {
            Thread thread = c199512134k.LIZ;
            if (thread != null) {
                c199512134k.LIZ = null;
                LockSupport.unpark(thread);
            }
            c199512134k = c199512134k.LIZIZ;
        }
        do {
            c199523134v = c134x.LLILLJJLI;
        } while (!abstractC199513134l.LIZJ(c134x, c199523134v, C199523134v.LIZLLL));
        C199523134v c199523134v2 = null;
        while (c199523134v != null) {
            C199523134v c199523134v3 = c199523134v.LIZJ;
            c199523134v.LIZJ = c199523134v2;
            c199523134v2 = c199523134v;
            c199523134v = c199523134v3;
        }
        while (c199523134v2 != null) {
            Runnable runnable = c199523134v2.LIZ;
            C199523134v c199523134v4 = c199523134v2.LIZJ;
            if (!(runnable instanceof RunnableC165600kI)) {
                LIZLLL(runnable, c199523134v2.LIZIZ);
                c199523134v2 = c199523134v4;
            } else {
                runnable.getClass();
                throw null;
            }
        }
    }

    public static final Object LJI(Object obj) throws ExecutionException {
        if (!(obj instanceof C199517134p)) {
            if (!(obj instanceof C199527134z)) {
                if (obj == LLIZ) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((C199527134z) obj).LIZ);
        }
        Throwable th = ((C199517134p) obj).LIZ;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    public final void LIZJ(StringBuilder sb) {
        Object obj;
        String strValueOf;
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException e) {
                    TryCatchGuardChecker.doCheck(e);
                    z = true;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (z) {
                        C786410Ut5.u3().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException e2) {
                TryCatchGuardChecker.doCheck(e2);
                sb.append("CANCELLED");
                return;
            } catch (RuntimeException e3) {
                TryCatchGuardChecker.doCheck(e3);
                sb.append("UNKNOWN, cause=[");
                sb.append(e3.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (ExecutionException e4) {
                TryCatchGuardChecker.doCheck(e4);
                sb.append("FAILURE, cause=[");
                sb.append(e4.getCause());
                sb.append(e3.f);
                return;
            }
        }
        if (z) {
            C786410Ut5.u3().interrupt();
        }
        sb.append("SUCCESS, result=[");
        if (obj == this) {
            strValueOf = "this future";
        } else {
            strValueOf = String.valueOf(obj);
        }
        sb.append(strValueOf);
        sb.append(e3.f);
    }

    public final void LJ(C199512134k c199512134k) {
        c199512134k.LIZ = null;
        while (true) {
            C199512134k c199512134k2 = this.LLILLL;
            if (c199512134k2 != C199512134k.LIZJ) {
                C199512134k c199512134k3 = null;
                while (c199512134k2 != null) {
                    C199512134k c199512134k4 = c199512134k2.LIZIZ;
                    if (c199512134k2.LIZ != null) {
                        c199512134k3 = c199512134k2;
                    } else if (c199512134k3 != null) {
                        c199512134k3.LIZIZ = c199512134k4;
                        if (c199512134k3.LIZ == null) {
                            break;
                        }
                    } else if (!LLILZLL.LJ(this, c199512134k2, c199512134k4)) {
                        break;
                    }
                    c199512134k2 = c199512134k4;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean z2;
        C199517134p c199517134p;
        Object obj = this.LL;
        boolean z3 = obj instanceof RunnableC165600kI;
        if (obj == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z3 | z2) {
            if (LLILZ) {
                c199517134p = new C199517134p(new CancellationException("Future.cancel() was called."));
            } else if (z) {
                c199517134p = C199517134p.LIZIZ;
            } else {
                c199517134p = C199517134p.LIZJ;
            }
            while (!LLILZLL.LIZLLL(this, obj, c199517134p)) {
                obj = this.LL;
                if (!(obj instanceof RunnableC165600kI)) {
                    return false;
                }
            }
            LIZIZ(this);
            if (!(obj instanceof RunnableC165600kI)) {
                return true;
            }
            obj.getClass();
            throw null;
        }
        return false;
    }

    public static void LIZLLL(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            LLILZIL.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e);
        }
    }

    @Override // X.InterfaceFutureC1488980oqm
    public final void LJFF(Runnable runnable, Executor executor) {
        executor.getClass();
        C199523134v c199523134v = this.LLILLJJLI;
        C199523134v c199523134v2 = C199523134v.LIZLLL;
        if (c199523134v != c199523134v2) {
            C199523134v c199523134v3 = new C199523134v(runnable, executor);
            do {
                c199523134v3.LIZJ = c199523134v;
                if (LLILZLL.LIZJ(this, c199523134v, c199523134v3)) {
                    return;
                } else {
                    c199523134v = this.LLILLJJLI;
                }
            } while (c199523134v != c199523134v2);
        }
        LIZLLL(runnable, executor);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0127 A[PHI: r7
      0x0127: PHI (r7v2 java.lang.String) = (r7v1 java.lang.String), (r7v5 java.lang.String) binds: [B:60:0x00fa, B:69:0x0125] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0087 -> B:31:0x006a). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(long r18, java.util.concurrent.TimeUnit r20) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C134X.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }
}
