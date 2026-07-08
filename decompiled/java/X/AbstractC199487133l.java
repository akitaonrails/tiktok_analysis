package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.133l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC199487133l<V> extends C133Z<V> {
    public static boolean LJII(Object obj) {
        return !(obj instanceof RunnableC199486133k);
    }

    public String LJ() {
        throw null;
    }

    public void LJI() {
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.LL instanceof C199497133v;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.LL;
        return (obj != null) & LJII(obj);
    }

    @Override // X.AbstractC199477133b
    public final Throwable LIZ() {
        if (!(this instanceof InterfaceC199479133d)) {
            return null;
        }
        Object obj = this.LL;
        if (obj instanceof AnonymousClass1341) {
            return ((AnonymousClass1341) obj).LIZ;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC199487133l.toString():java.lang.String");
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.LL;
        if ((obj2 != null) && LJII(obj2)) {
            return LIZLLL(obj2);
        }
        C133W c133w = this.LLILLL;
        if (c133w != C133W.LIZJ) {
            C133W c133w2 = new C133W();
            do {
                C133U c133u = C133Z.LLIZ;
                c133u.LIZJ(c133w2, c133w);
                if (c133u.LJI(this, c133w, c133w2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            LIZIZ(c133w2);
                            throw new InterruptedException();
                        }
                        obj = this.LL;
                    } while (!((obj != null) & LJII(obj)));
                    return LIZLLL(obj);
                }
                c133w = this.LLILLL;
            } while (c133w != C133W.LIZJ);
        }
        Object obj3 = this.LL;
        Objects.requireNonNull(obj3);
        return LIZLLL(obj3);
    }

    public static Object LIZLLL(Object obj) throws ExecutionException {
        if (!(obj instanceof C199497133v)) {
            if (!(obj instanceof AnonymousClass1341)) {
                if (obj == C133Z.LLILZ) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((AnonymousClass1341) obj).LIZ);
        }
        Throwable th = ((C199497133v) obj).LIZIZ;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object LJIIIIZZ(InterfaceFutureC1488980oqm interfaceFutureC1488980oqm) {
        Throwable thLIZ;
        if (interfaceFutureC1488980oqm instanceof InterfaceC199479133d) {
            Object c199497133v = ((C133Z) interfaceFutureC1488980oqm).LL;
            if (c199497133v instanceof C199497133v) {
                C199497133v c199497133v2 = (C199497133v) c199497133v;
                if (c199497133v2.LIZ) {
                    Throwable th = c199497133v2.LIZIZ;
                    c199497133v = th != null ? new C199497133v(th, false) : C199497133v.LIZLLL;
                }
            }
            Objects.requireNonNull(c199497133v);
            return c199497133v;
        }
        if ((interfaceFutureC1488980oqm instanceof AbstractC199477133b) && (thLIZ = ((AbstractC199477133b) interfaceFutureC1488980oqm).LIZ()) != null) {
            return new AnonymousClass1341(thLIZ);
        }
        boolean zIsCancelled = interfaceFutureC1488980oqm.isCancelled();
        if ((!C133Z.LLILZLL) & zIsCancelled) {
            C199497133v c199497133v3 = C199497133v.LIZLLL;
            Objects.requireNonNull(c199497133v3);
            return c199497133v3;
        }
        try {
            Object objLJIIIZ = LJIIIZ(interfaceFutureC1488980oqm);
            if (zIsCancelled) {
                String strValueOf = String.valueOf(interfaceFutureC1488980oqm);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sbLIZ.append(strValueOf);
                return new C199497133v(new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ)), false);
            }
            if (objLJIIIZ == null) {
                return C133Z.LLILZ;
            }
            return objLJIIIZ;
        } catch (Error e) {
            e = e;
            TryCatchGuardChecker.doCheck(e);
            return new AnonymousClass1341(e);
        } catch (CancellationException e2) {
            TryCatchGuardChecker.doCheck(e2);
            if (!zIsCancelled) {
                return new AnonymousClass1341(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(interfaceFutureC1488980oqm)), e2));
            }
            return new C199497133v(e2, false);
        } catch (ExecutionException e3) {
            TryCatchGuardChecker.doCheck(e3);
            if (zIsCancelled) {
                return new C199497133v(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(interfaceFutureC1488980oqm)), e3), false);
            }
            return new AnonymousClass1341(e3.getCause());
        } catch (Exception e4) {
            e = e4;
            TryCatchGuardChecker.doCheck(e);
            return new AnonymousClass1341(e);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public static Object LJIIIZ(Future future) {
        boolean z = false;
        ?? r1 = future;
        while (true) {
            try {
                r1 = r1.get();
                break;
            } catch (InterruptedException e) {
                TryCatchGuardChecker.doCheck(e);
                z = true;
                r1 = r1;
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
        return r1;
    }

    public static void LJIIL(AbstractC199487133l abstractC199487133l) {
        C199498133w c199498133w;
        C199498133w c199498133w2 = null;
        while (true) {
            abstractC199487133l.getClass();
            for (C133W c133wLIZIZ = C133Z.LLIZ.LIZIZ(abstractC199487133l); c133wLIZIZ != null; c133wLIZIZ = c133wLIZIZ.LIZIZ) {
                Thread thread = c133wLIZIZ.LIZ;
                if (thread != null) {
                    c133wLIZIZ.LIZ = null;
                    LockSupport.unpark(thread);
                }
            }
            abstractC199487133l.LJI();
            C199498133w c199498133wLIZ = C133Z.LLIZ.LIZ(abstractC199487133l, C199498133w.LIZLLL);
            while (c199498133wLIZ != null) {
                C199498133w c199498133w3 = c199498133wLIZ.LIZJ;
                c199498133wLIZ.LIZJ = c199498133w2;
                c199498133w2 = c199498133wLIZ;
                c199498133wLIZ = c199498133w3;
            }
            while (c199498133w2 != null) {
                Runnable runnable = c199498133w2.LIZ;
                c199498133w = c199498133w2.LIZJ;
                Objects.requireNonNull(runnable);
                if (runnable instanceof RunnableC199486133k) {
                    RunnableC199486133k runnableC199486133k = (RunnableC199486133k) runnable;
                    abstractC199487133l = runnableC199486133k.LL;
                    if (abstractC199487133l.LL != runnableC199486133k || !C133Z.LIZJ(abstractC199487133l, runnableC199486133k, LJIIIIZZ(runnableC199486133k.LLILLJJLI))) {
                    }
                } else {
                    Executor executor = c199498133w2.LIZIZ;
                    Objects.requireNonNull(executor);
                    LJIILIIL(runnable, executor);
                }
                c199498133w2 = c199498133w;
            }
            return;
            c199498133w2 = c199498133w;
        }
    }

    public final void LJIIJ(StringBuilder sb) {
        try {
            Object objLJIIIZ = LJIIIZ(this);
            sb.append("SUCCESS, result=[");
            if (objLJIIIZ == null) {
                sb.append("null");
            } else if (objLJIIIZ != this) {
                sb.append(objLJIIIZ.getClass().getName());
                sb.append(e3.g);
                sb.append(Integer.toHexString(System.identityHashCode(objLJIIIZ)));
            } else {
                sb.append("this future");
            }
            sb.append(e3.f);
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            sb.append("CANCELLED");
        } catch (ExecutionException e2) {
            TryCatchGuardChecker.doCheck(e2);
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append(e3.f);
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            sb.append("UNKNOWN, cause=[");
            sb.append(e3.getClass());
            sb.append(" thrown from get()]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean z2;
        C199497133v c199497133v;
        boolean z3;
        Object obj = this.LL;
        boolean z4 = obj instanceof RunnableC199486133k;
        boolean z5 = false;
        if (obj == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z4 | z2) {
            if (C133Z.LLILZLL) {
                c199497133v = new C199497133v(new CancellationException("Future.cancel() was called."), z);
            } else {
                if (z) {
                    c199497133v = C199497133v.LIZJ;
                } else {
                    c199497133v = C199497133v.LIZLLL;
                }
                Objects.requireNonNull(c199497133v);
            }
            AbstractC199487133l<V> abstractC199487133l = this;
            z5 = false;
            while (true) {
                if (C133Z.LIZJ(abstractC199487133l, obj, c199497133v)) {
                    LJIIL(abstractC199487133l);
                    if (obj instanceof RunnableC199486133k) {
                        InterfaceFutureC1488980oqm<? extends V> interfaceFutureC1488980oqm = ((RunnableC199486133k) obj).LLILLJJLI;
                        if (interfaceFutureC1488980oqm instanceof InterfaceC199479133d) {
                            abstractC199487133l = (AbstractC199487133l) interfaceFutureC1488980oqm;
                            obj = abstractC199487133l.LL;
                            if (obj == null) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3 | (obj instanceof RunnableC199486133k)) {
                                z5 = true;
                            } else {
                                return true;
                            }
                        } else {
                            interfaceFutureC1488980oqm.cancel(z);
                            return true;
                        }
                    } else {
                        return true;
                    }
                } else {
                    obj = abstractC199487133l.LL;
                    if (LJII(obj)) {
                        break;
                    }
                }
            }
        }
        return z5;
    }

    public static void LJIILIIL(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Logger loggerLIZ = C133Z.LLILZIL.LIZ();
            Level level = Level.SEVERE;
            String strValueOf = String.valueOf(runnable);
            String strValueOf2 = String.valueOf(executor);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("RuntimeException while executing runnable ");
            sbLIZ.append(strValueOf);
            sbLIZ.append(" with executor ");
            sbLIZ.append(strValueOf2);
            loggerLIZ.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", C2188811AlT.LIZIZ(sbLIZ), (Throwable) e);
        }
    }

    @Override // X.InterfaceFutureC1488980oqm
    public final void LJFF(Runnable runnable, Executor executor) {
        C199498133w c199498133w;
        C19863812nk.LIZJ(executor, "Executor was null.");
        if (!isDone() && (c199498133w = this.LLILLJJLI) != C199498133w.LIZLLL) {
            C199498133w c199498133w2 = new C199498133w(runnable, executor);
            do {
                c199498133w2.LIZJ = c199498133w;
                if (!C133Z.LLIZ.LJ(this, c199498133w, c199498133w2)) {
                    c199498133w = this.LLILLJJLI;
                } else {
                    return;
                }
            } while (c199498133w != C199498133w.LIZLLL);
        }
        LJIILIIL(runnable, executor);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0129 A[PHI: r8
      0x0129: PHI (r8v4 java.lang.String) = (r8v3 java.lang.String), (r8v7 java.lang.String) binds: [B:58:0x00fd, B:67:0x0127] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(long r16, java.util.concurrent.TimeUnit r18) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC199487133l.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }
}
