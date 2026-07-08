package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.ReDexExperimentOpt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import v7.o;

/* JADX INFO: renamed from: X.15O7, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15O7<TResult> {
    public static final ExecutorService LJI;
    public static final C08LU LJII;
    public static final ExecutorC2206508kh LJIIIIZZ;
    public static final C15O7<?> LJIIIZ;
    public static final C15O7<Boolean> LJIIJ;
    public static final C15O7<Boolean> LJIIJJI;
    public static final C15O7<?> LJIIL;
    public boolean LIZIZ;
    public boolean LIZJ;
    public TResult LIZLLL;
    public Exception LJ;
    public final Object LIZ = new Object();
    public List<InterfaceC2385309Wh<TResult, Void>> LJFF = new ArrayList();

    static {
        C2206308kf c2206308kf = C2206308kf.LIZJ;
        LJI = C823050WQl.LIZJ();
        LJII = C2206308kf.LIZJ.LIZIZ;
        LJIIIIZZ = C2206408kg.LIZIZ.LIZ;
        LJIIIZ = new C15O7<>((Object) null);
        LJIIJ = new C15O7<>(Boolean.TRUE);
        LJIIJJI = new C15O7<>(Boolean.FALSE);
        LJIIL = new C15O7<>(0);
    }

    private final void LJIJ$redex$base() {
        synchronized (this.LIZ) {
            try {
                Iterator<InterfaceC2385309Wh<TResult, Void>> it2 = this.LJFF.iterator();
                while (it2.hasNext()) {
                    try {
                        it2.next().then(this);
                    } catch (RuntimeException e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw e;
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        throw new RuntimeException(e2);
                    }
                }
                this.LJFF = null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    private final void LJIJ$redex$opt() {
        synchronized (this.LIZ) {
            try {
                List<InterfaceC2385309Wh<TResult, Void>> list = this.LJFF;
                int i = 0;
                int size = list.size();
                while (i < size) {
                    InterfaceC2385309Wh<TResult, Void> interfaceC2385309Wh = list.get(i);
                    i++;
                    try {
                        interfaceC2385309Wh.then(this);
                    } catch (RuntimeException e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw e;
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        throw new RuntimeException(e2);
                    }
                }
                this.LJFF = null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final Exception LJIIJJI() {
        Exception exc;
        synchronized (this.LIZ) {
            try {
                exc = this.LJ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return exc;
    }

    public final TResult LJIIL() {
        TResult tresult;
        synchronized (this.LIZ) {
            try {
                tresult = this.LIZLLL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return tresult;
    }

    public final boolean LJIILIIL() {
        boolean z;
        synchronized (this.LIZ) {
            try {
                z = this.LIZJ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return z;
    }

    public final boolean LJIILJJIL() {
        boolean z;
        synchronized (this.LIZ) {
            try {
                z = this.LIZIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return z;
    }

    public final boolean LJIILL() {
        boolean z;
        synchronized (this.LIZ) {
            try {
                z = LJIIJJI() != null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return z;
    }

    public final boolean LJIJI() {
        synchronized (this.LIZ) {
            try {
                if (this.LIZIZ) {
                    return false;
                }
                this.LIZIZ = true;
                this.LIZJ = true;
                this.LIZ.notifyAll();
                LJIJ();
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIJJLI() {
        synchronized (this.LIZ) {
            try {
                if (!LJIILJJIL()) {
                    this.LIZ.wait();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C15O7() {
    }

    public final void LJIJ() {
        if (ReDexExperimentOpt.getAbTest()) {
            LJIJ$redex$opt();
        } else {
            LJIJ$redex$base();
        }
    }

    public C15O7(int i) {
        LJIJI();
    }

    public static <TResult> C15O7<TResult> LIZ(Callable<TResult> callable) {
        return LIZIZ(callable, LJII, null);
    }

    public static <TResult> C15O7<TResult> LIZJ(Callable<TResult> callable) {
        return LIZIZ(callable, LJI, null);
    }

    public static C15O7<Void> LJIIIIZZ(long j) {
        C2206308kf c2206308kf = C2206308kf.LIZJ;
        ScheduledExecutorService scheduledExecutorServiceLJ = C823050WQl.LJ();
        if (j <= 0) {
            return LJIIJ(null);
        }
        final o oVar = new o();
        scheduledExecutorServiceLJ.schedule(new Runnable() { // from class: X.0sk8
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    oVar.LJ(null);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        }, j, TimeUnit.MILLISECONDS);
        return oVar.LIZ;
    }

    public static <TResult> C15O7<TResult> LJIIIZ(Exception exc) {
        o oVar = new o();
        oVar.LIZIZ(exc);
        return oVar.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <TResult> C15O7<TResult> LJIIJ(TResult tresult) {
        if (tresult == 0) {
            return (C15O7<TResult>) LJIIIZ;
        }
        if (tresult instanceof Boolean) {
            if (((Boolean) tresult).booleanValue()) {
                return (C15O7<TResult>) LJIIJ;
            }
            return (C15O7<TResult>) LJIIJJI;
        }
        o oVar = new o();
        oVar.LIZJ(tresult);
        return oVar.LIZ;
    }

    public static C15O7<Void> LJJ(Collection<? extends C15O7<?>> collection) {
        if (collection.size() == 0) {
            return LJIIJ(null);
        }
        final o oVar = new o();
        final ArrayList arrayList = new ArrayList();
        final Object obj = new Object();
        final AtomicInteger atomicInteger = new AtomicInteger(collection.size());
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        Iterator<? extends C15O7<?>> it2 = collection.iterator();
        while (it2.hasNext()) {
            it2.next().LIZLLL(new InterfaceC2385309Wh<Object, Void>() { // from class: X.09oF
                @Override // X.InterfaceC2385309Wh
                public final Void then(C15O7<Object> c15o7) {
                    if (c15o7.LJIILL()) {
                        synchronized (obj) {
                            try {
                                arrayList.add(c15o7.LJIIJJI());
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                    }
                    if (c15o7.LJIILIIL()) {
                        atomicBoolean.set(true);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        if (arrayList.size() != 0) {
                            if (arrayList.size() == 1) {
                                oVar.LIZIZ((Exception) ListProtector.get(arrayList, 0));
                            } else {
                                oVar.LIZIZ(new C2483409oG(C786410Ut5.j4("There were %d exceptions.", new Object[]{Integer.valueOf(arrayList.size())}), arrayList));
                                return null;
                            }
                        } else {
                            if (atomicBoolean.get()) {
                                oVar.LIZ();
                                return null;
                            }
                            oVar.LIZJ(null);
                            return null;
                        }
                    }
                    return null;
                }
            });
        }
        return oVar.LIZ;
    }

    public static <TResult> C15O7<List<TResult>> LJJI(Collection<? extends C15O7<TResult>> collection) {
        return (C15O7<List<TResult>>) LJJ(collection).LJIILLIIL(new C346480DiA(collection, 11));
    }

    public static <TResult> C15O7<C15O7<TResult>> LJJIFFI(Collection<? extends C15O7<TResult>> collection) {
        if (collection.size() == 0) {
            return LJIIJ(null);
        }
        o oVar = new o();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        Iterator<? extends C15O7<TResult>> it2 = collection.iterator();
        while (it2.hasNext()) {
            it2.next().LIZLLL(new C1698280uIM(atomicBoolean, oVar, 1));
        }
        return oVar.LIZ;
    }

    public final <TContinuationResult> C15O7<TContinuationResult> LIZLLL(InterfaceC2385309Wh<TResult, TContinuationResult> interfaceC2385309Wh) {
        return LJ(interfaceC2385309Wh, LJII, null);
    }

    public final <TContinuationResult> C15O7<TContinuationResult> LJI(InterfaceC2385309Wh<TResult, C15O7<TContinuationResult>> interfaceC2385309Wh) {
        return LJII(interfaceC2385309Wh, LJII);
    }

    public final <TContinuationResult> C15O7<TContinuationResult> LJIILLIIL(InterfaceC2385309Wh<TResult, TContinuationResult> interfaceC2385309Wh) {
        return LJIIZILJ(interfaceC2385309Wh, LJII);
    }

    public final boolean LJIJJ(TResult tresult) {
        synchronized (this.LIZ) {
            try {
                if (this.LIZIZ) {
                    return false;
                }
                this.LIZIZ = true;
                this.LIZLLL = tresult;
                this.LIZ.notifyAll();
                LJIJ();
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C15O7(TResult tresult) {
        LJIJJ(tresult);
    }

    public final void LJFF(InterfaceC2385309Wh interfaceC2385309Wh, Executor executor) {
        LJ(interfaceC2385309Wh, executor, null);
    }

    public final C15O7 LJII(final InterfaceC2385309Wh interfaceC2385309Wh, final Executor executor) {
        boolean zLJIILJJIL;
        final o oVar = new o();
        synchronized (this.LIZ) {
            try {
                zLJIILJJIL = LJIILJJIL();
                if (!zLJIILJJIL) {
                    ((ArrayList) this.LJFF).add(new InterfaceC2385309Wh<Object, Void>() { // from class: X.15O9
                        public final /* synthetic */ C2472709mX LIZLLL = null;

                        @Override // X.InterfaceC2385309Wh
                        public final Void then(C15O7<Object> c15o7) {
                            o oVar2 = oVar;
                            InterfaceC2385309Wh interfaceC2385309Wh2 = interfaceC2385309Wh;
                            try {
                                executor.execute(new C15OA(this.LIZLLL, oVar2, interfaceC2385309Wh2, c15o7));
                                return null;
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                oVar2.LIZIZ(new C838360Wug(e));
                                return null;
                            }
                        }
                    });
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (zLJIILJJIL) {
            try {
                executor.execute(new C15OA(null, oVar, interfaceC2385309Wh, this));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                oVar.LIZIZ(new C838360Wug(e));
            }
        }
        return oVar.LIZ;
    }

    public final C15O7 LJIIZILJ(InterfaceC2385309Wh interfaceC2385309Wh, Executor executor) {
        return LJII(new C19774412Yk(interfaceC2385309Wh, 8), executor);
    }

    public final boolean LJIL(long j, TimeUnit timeUnit) {
        boolean zLJIILJJIL;
        synchronized (this.LIZ) {
            try {
                if (!LJIILJJIL()) {
                    this.LIZ.wait(timeUnit.toMillis(j));
                }
                zLJIILJJIL = LJIILJJIL();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return zLJIILJJIL;
    }

    public static <TResult> C15O7<TResult> LIZIZ(final Callable<TResult> callable, Executor executor, final C2472709mX c2472709mX) {
        final o oVar = new o();
        try {
            executor.execute(new Runnable() { // from class: X.09oD
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        C2472709mX c2472709mX2 = c2472709mX;
                        if (c2472709mX2 != null && c2472709mX2.LIZ()) {
                            oVar.LIZ();
                            return;
                        }
                        try {
                            try {
                                oVar.LIZJ(callable.call());
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                oVar.LIZIZ(e);
                            }
                        } catch (CancellationException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            oVar.LIZ();
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (!C2179971ATj.LIZ(th)) {
                            throw th;
                        }
                    }
                }
            });
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            oVar.LIZIZ(new C838360Wug(e));
        }
        return oVar.LIZ;
    }

    public final <TContinuationResult> C15O7<TContinuationResult> LJ(final InterfaceC2385309Wh<TResult, TContinuationResult> interfaceC2385309Wh, final Executor executor, final C2472709mX c2472709mX) {
        boolean zLJIILJJIL;
        final o oVar = new o();
        synchronized (this.LIZ) {
            try {
                zLJIILJJIL = LJIILJJIL();
                if (!zLJIILJJIL) {
                    ((ArrayList) this.LJFF).add(new InterfaceC2385309Wh<TResult, Void>() { // from class: X.15O8
                        @Override // X.InterfaceC2385309Wh
                        public final Void then(C15O7 c15o7) {
                            o oVar2 = oVar;
                            InterfaceC2385309Wh interfaceC2385309Wh2 = interfaceC2385309Wh;
                            try {
                                executor.execute(new RunnableC2483209oE(c2472709mX, oVar2, interfaceC2385309Wh2, c15o7));
                                return null;
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                oVar2.LIZIZ(new C838360Wug(e));
                                return null;
                            }
                        }
                    });
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (zLJIILJJIL) {
            try {
                executor.execute(new RunnableC2483209oE(c2472709mX, oVar, interfaceC2385309Wh, this));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                oVar.LIZIZ(new C838360Wug(e));
            }
        }
        return oVar.LIZ;
    }
}
