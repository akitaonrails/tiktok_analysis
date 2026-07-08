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

/* JADX INFO: renamed from: X.134M, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public abstract class C134M<V> implements ListenableFuture<V> {
    public static final boolean LLILZ = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger LLILZIL = Logger.getLogger(C134M.class.getName());
    public static final C134R LLILZLL;
    public static final Object LLIZ;
    public volatile Object LL;
    public volatile C134T LLILLJJLI;
    public volatile C134S LLILLL;

    static {
        C134R c134r;
        try {
            final AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater = AtomicReferenceFieldUpdater.newUpdater(C134S.class, Thread.class, "LIZ");
            final AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater2 = AtomicReferenceFieldUpdater.newUpdater(C134S.class, C134S.class, "LIZIZ");
            final AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater3 = AtomicReferenceFieldUpdater.newUpdater(C134M.class, C134S.class, "LLILLL");
            final AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater4 = AtomicReferenceFieldUpdater.newUpdater(C134M.class, C134T.class, "LLILLJJLI");
            final AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater5 = AtomicReferenceFieldUpdater.newUpdater(C134M.class, Object.class, "LL");
            c134r = new C134R(atomicReferenceFieldUpdaterNewUpdater, atomicReferenceFieldUpdaterNewUpdater2, atomicReferenceFieldUpdaterNewUpdater3, atomicReferenceFieldUpdaterNewUpdater4, atomicReferenceFieldUpdaterNewUpdater5) { // from class: X.134Q
                public final AtomicReferenceFieldUpdater<C134S, Thread> LIZ;
                public final AtomicReferenceFieldUpdater<C134S, C134S> LIZIZ;
                public final AtomicReferenceFieldUpdater<C134M, C134S> LIZJ;
                public final AtomicReferenceFieldUpdater<C134M, C134T> LIZLLL;
                public final AtomicReferenceFieldUpdater<C134M, Object> LJ;

                @Override // X.C134R
                public final void LIZLLL(C134S c134s, C134S c134s2) {
                    this.LIZIZ.lazySet(c134s, c134s2);
                }

                @Override // X.C134R
                public final void LJ(C134S c134s, Thread thread) {
                    this.LIZ.lazySet(c134s, thread);
                }

                @Override // X.C134R
                public final boolean LIZ(C134M<?> c134m, C134T c134t, C134T c134t2) {
                    AtomicReferenceFieldUpdater<C134M, C134T> atomicReferenceFieldUpdater = this.LIZLLL;
                    while (!atomicReferenceFieldUpdater.compareAndSet(c134m, c134t, c134t2)) {
                        if (atomicReferenceFieldUpdater.get(c134m) != c134t) {
                            return false;
                        }
                    }
                    return true;
                }

                @Override // X.C134R
                public final boolean LIZIZ(C134M<?> c134m, Object obj, Object obj2) {
                    AtomicReferenceFieldUpdater<C134M, Object> atomicReferenceFieldUpdater = this.LJ;
                    while (!atomicReferenceFieldUpdater.compareAndSet(c134m, obj, obj2)) {
                        if (atomicReferenceFieldUpdater.get(c134m) != obj) {
                            return false;
                        }
                    }
                    return true;
                }

                @Override // X.C134R
                public final boolean LIZJ(C134M<?> c134m, C134S c134s, C134S c134s2) {
                    AtomicReferenceFieldUpdater<C134M, C134S> atomicReferenceFieldUpdater = this.LIZJ;
                    while (!atomicReferenceFieldUpdater.compareAndSet(c134m, c134s, c134s2)) {
                        if (atomicReferenceFieldUpdater.get(c134m) != c134s) {
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
            c134r = new C134R() { // from class: X.134P
                @Override // X.C134R
                public final void LIZLLL(C134S c134s, C134S c134s2) {
                    c134s.LIZIZ = c134s2;
                }

                @Override // X.C134R
                public final void LJ(C134S c134s, Thread thread) {
                    c134s.LIZ = thread;
                }

                @Override // X.C134R
                public final boolean LIZ(C134M<?> c134m, C134T c134t, C134T c134t2) {
                    synchronized (c134m) {
                        try {
                            if (c134m.LLILLJJLI == c134t) {
                                c134m.LLILLJJLI = c134t2;
                                return true;
                            }
                            return false;
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            throw th2;
                        }
                    }
                }

                @Override // X.C134R
                public final boolean LIZIZ(C134M<?> c134m, Object obj, Object obj2) {
                    synchronized (c134m) {
                        try {
                            if (c134m.LL == obj) {
                                c134m.LL = obj2;
                                return true;
                            }
                            return false;
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            throw th2;
                        }
                    }
                }

                @Override // X.C134R
                public final boolean LIZJ(C134M<?> c134m, C134S c134s, C134S c134s2) {
                    synchronized (c134m) {
                        try {
                            if (c134m.LLILLL == c134s) {
                                c134m.LLILLL = c134s2;
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
        LLILZLL = c134r;
        if (th != null) {
            LLILZIL.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        LLIZ = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String LJII() {
        Object obj = this.LL;
        if (obj instanceof C134O) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setFuture=[");
            ListenableFuture<? extends V> listenableFuture = ((C134O) obj).LLILLJJLI;
            sbLIZ.append(listenableFuture == this ? "this future" : String.valueOf(listenableFuture));
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
        return this.LL instanceof C134U;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof C134O)) & (this.LL != null);
    }

    public final String toString() {
        String strLIZIZ;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.LL instanceof C134U) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            LIZ(sb);
        } else {
            try {
                strLIZIZ = LJII();
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
        if ((obj2 != null) && (!(obj2 instanceof C134O))) {
            return (V) LIZLLL(obj2);
        }
        C134S c134s = this.LLILLL;
        if (c134s != C134S.LIZJ) {
            C134S c134s2 = new C134S();
            do {
                C134R c134r = LLILZLL;
                c134r.LIZLLL(c134s2, c134s);
                if (c134r.LIZJ(this, c134s, c134s2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            LJIIIIZZ(c134s2);
                            throw new InterruptedException();
                        }
                        obj = this.LL;
                    } while (!((obj != null) & (!(obj instanceof C134O))));
                    return (V) LIZLLL(obj);
                }
                c134s = this.LLILLL;
            } while (c134s != C134S.LIZJ);
        }
        return (V) LIZLLL(this.LL);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void LIZIZ(C134M<?> c134m) {
        C134T c134t;
        C134T c134t2;
        C134T c134t3 = null;
        while (true) {
            C134S c134s = c134m.LLILLL;
            if (LLILZLL.LIZJ(c134m, c134s, C134S.LIZJ)) {
                while (c134s != null) {
                    Thread thread = c134s.LIZ;
                    if (thread != null) {
                        c134s.LIZ = null;
                        LockSupport.unpark(thread);
                    }
                    c134s = c134s.LIZIZ;
                }
                do {
                    c134t = c134m.LLILLJJLI;
                } while (!LLILZLL.LIZ(c134m, c134t, C134T.LIZLLL));
                while (true) {
                    c134t2 = c134t3;
                    c134t3 = c134t;
                    if (c134t == null) {
                        break;
                    }
                    c134t = c134t.LIZJ;
                    c134t3.LIZJ = c134t2;
                }
                while (c134t2 != null) {
                    c134t3 = c134t2.LIZJ;
                    Runnable runnable = c134t2.LIZ;
                    if (runnable instanceof C134O) {
                        C134O c134o = (C134O) runnable;
                        c134m = c134o.LL;
                        if (c134m.LL == c134o) {
                            if (LLILZLL.LIZIZ(c134m, c134o, LJ(c134o.LLILLJJLI))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        LIZJ(runnable, c134t2.LIZIZ);
                    }
                    c134t2 = c134t3;
                }
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final V LIZLLL(Object obj) throws ExecutionException {
        if (!(obj instanceof C134U)) {
            if (!(obj instanceof C134V)) {
                if (obj == LLIZ) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((C134V) obj).LIZ);
        }
        Throwable th = ((C134U) obj).LIZIZ;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    public static Object LJ(ListenableFuture<?> listenableFuture) {
        if (listenableFuture instanceof C134M) {
            Object obj = ((C134M) listenableFuture).LL;
            if (obj instanceof C134U) {
                C134U c134u = (C134U) obj;
                if (c134u.LIZ) {
                    if (c134u.LIZIZ != null) {
                        return new C134U(c134u.LIZIZ, false);
                    }
                    return C134U.LIZLLL;
                }
                return obj;
            }
            return obj;
        }
        boolean zIsCancelled = listenableFuture.isCancelled();
        if ((!LLILZ) & zIsCancelled) {
            return C134U.LIZLLL;
        }
        try {
            Object objLJI = LJI(listenableFuture);
            if (objLJI == null) {
                return LLIZ;
            }
            return objLJI;
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            if (!zIsCancelled) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
                sbLIZ.append(listenableFuture);
                return new C134V(new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ), e));
            }
            return new C134U(e, false);
        } catch (ExecutionException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return new C134V(e2.getCause());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return new C134V(th);
        }
    }

    public static <V> V LJI(Future<V> future) {
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
            Object objLJI = LJI(this);
            sb.append("SUCCESS, result=[");
            if (objLJI == this) {
                strValueOf = "this future";
            } else {
                strValueOf = String.valueOf(objLJI);
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

    public final void LJIIIIZZ(C134S c134s) {
        c134s.LIZ = null;
        while (true) {
            C134S c134s2 = this.LLILLL;
            if (c134s2 == C134S.LIZJ) {
                return;
            }
            C134S c134s3 = null;
            while (c134s2 != null) {
                C134S c134s4 = c134s2.LIZIZ;
                if (c134s2.LIZ != null) {
                    c134s3 = c134s2;
                } else if (c134s3 != null) {
                    c134s3.LIZIZ = c134s4;
                    if (c134s3.LIZ == null) {
                        break;
                    }
                } else if (!LLILZLL.LIZJ(this, c134s2, c134s4)) {
                    break;
                }
                c134s2 = c134s4;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0059, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean cancel(boolean r7) {
        /*
            r6 = this;
            java.lang.Object r4 = r6.LL
            r5 = 1
            if (r4 != 0) goto L53
            r1 = 1
        L6:
            boolean r0 = r4 instanceof X.C134O
            r1 = r1 | r0
            if (r1 == 0) goto L5a
            boolean r0 = X.C134M.LLILZ
            if (r0 == 0) goto L4b
            X.134U r3 = new X.134U
            java.util.concurrent.CancellationException r1 = new java.util.concurrent.CancellationException
            java.lang.String r0 = "Future.cancel() was called."
            r1.<init>(r0)
            r3.<init>(r1, r7)
        L1b:
            r2 = r6
            r1 = 0
        L1d:
            X.134R r0 = X.C134M.LLILZLL
            boolean r0 = r0.LIZIZ(r2, r4, r3)
            if (r0 == 0) goto L44
            LIZIZ(r2)
            boolean r0 = r4 instanceof X.C134O
            if (r0 == 0) goto L59
            X.134O r4 = (X.C134O) r4
            com.google.common.util.concurrent.ListenableFuture<? extends V> r2 = r4.LLILLJJLI
            boolean r0 = r2 instanceof X.C134M
            if (r0 == 0) goto L55
            X.134M r2 = (X.C134M) r2
            java.lang.Object r4 = r2.LL
            if (r4 != 0) goto L42
            r1 = 1
        L3b:
            boolean r0 = r4 instanceof X.C134O
            r1 = r1 | r0
            if (r1 == 0) goto L59
            r1 = 1
            goto L1d
        L42:
            r1 = 0
            goto L3b
        L44:
            java.lang.Object r4 = r2.LL
            boolean r0 = r4 instanceof X.C134O
            if (r0 != 0) goto L1d
            return r1
        L4b:
            if (r7 == 0) goto L50
            X.134U r3 = X.C134U.LIZJ
            goto L1b
        L50:
            X.134U r3 = X.C134U.LIZLLL
            goto L1b
        L53:
            r1 = 0
            goto L6
        L55:
            r2.cancel(r7)
            return r5
        L59:
            return r5
        L5a:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C134M.cancel(boolean):boolean");
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
        C134T c134t = this.LLILLJJLI;
        if (c134t != C134T.LIZLLL) {
            C134T c134t2 = new C134T(runnable, executor);
            do {
                c134t2.LIZJ = c134t;
                if (LLILZLL.LIZ(this, c134t, c134t2)) {
                    return;
                } else {
                    c134t = this.LLILLJJLI;
                }
            } while (c134t != C134T.LIZLLL);
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
        throw new UnsupportedOperationException("Method not decompiled: X.C134M.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }
}
