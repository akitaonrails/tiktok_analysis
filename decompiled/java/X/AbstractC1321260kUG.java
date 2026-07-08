package X;

import Y.ARunnableS78S0200000_9;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.image.LsImageHandlerOpt;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0kUG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1321260kUG<T> implements InterfaceC1320200kSY<T> {
    public boolean LIZIZ;
    public T LIZJ;
    public Throwable LIZLLL;
    public float LJ;
    public boolean LJI;
    public EnumC1321270kUH LIZ = EnumC1321270kUH.IN_PROGRESS;
    public final ConcurrentLinkedQueue<Pair<InterfaceC589510NAf<T>, Executor>> LJFF = new ConcurrentLinkedQueue<>();

    @Override // X.InterfaceC1320200kSY
    public final synchronized boolean LIZ() {
        return this.LIZ != EnumC1321270kUH.IN_PROGRESS;
    }

    @Override // X.InterfaceC1320200kSY
    public synchronized boolean LIZIZ() {
        return this.LIZJ != null;
    }

    @Override // X.InterfaceC1320200kSY
    public final synchronized Throwable LIZLLL() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1320200kSY
    public boolean LJ() {
        return this instanceof C1321220kUC;
    }

    public void LJFF(T t) {
    }

    public final synchronized boolean LJII() {
        return this.LIZ == EnumC1321270kUH.FAILURE;
    }

    public final synchronized boolean LJIIIIZZ() {
        return this.LIZIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean LJIILJJIL() {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.LJIIIIZZ()     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto Le
            boolean r0 = r1.LIZ()     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto Le
            goto L10
        Le:
            r0 = 0
            goto L11
        L10:
            r0 = 1
        L11:
            monitor-exit(r1)
            return r0
        L13:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1321260kUG.LJIILJJIL():boolean");
    }

    @Override // X.InterfaceC1320200kSY
    public boolean close() {
        synchronized (this) {
            try {
                if (this.LIZIZ) {
                    return false;
                }
                this.LIZIZ = true;
                T t = this.LIZJ;
                this.LIZJ = null;
                if (t != null) {
                    LJFF(t);
                }
                if (!LIZ()) {
                    LJIIJ();
                }
                synchronized (this) {
                    try {
                        this.LJFF.clear();
                    } finally {
                    }
                }
                return true;
            } finally {
            }
        }
    }

    @Override // X.InterfaceC1320200kSY
    public final synchronized float getProgress() {
        return this.LJ;
    }

    @Override // X.InterfaceC1320200kSY
    public synchronized T getResult() {
        return this.LIZJ;
    }

    public final void LJIIJ() {
        boolean zLJII = LJII();
        boolean zLJIILJJIL = LJIILJJIL();
        for (Pair<InterfaceC589510NAf<T>, Executor> pair : this.LJFF) {
            LJIIIZ((InterfaceC589510NAf) pair.first, (Executor) pair.second, zLJII, zLJIILJJIL);
        }
    }

    public boolean LJIIJJI(Throwable th) {
        synchronized (this) {
            if (!this.LIZIZ && this.LIZ == EnumC1321270kUH.IN_PROGRESS) {
                this.LIZ = EnumC1321270kUH.FAILURE;
                this.LIZLLL = th;
                LJIIJ();
                return true;
            }
            return false;
        }
    }

    public final void LJIIL(float f) {
        synchronized (this) {
            if (!this.LIZIZ && this.LIZ == EnumC1321270kUH.IN_PROGRESS) {
                if (f >= this.LJ) {
                    this.LJ = f;
                    for (Pair<InterfaceC589510NAf<T>, Executor> pair : this.LJFF) {
                        final InterfaceC589510NAf interfaceC589510NAf = (InterfaceC589510NAf) pair.first;
                        ((Executor) pair.second).execute(new Runnable() { // from class: X.0NAg
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("AbstractDataSource@7287.notifyProgressUpdate$1");
                                try {
                                    interfaceC589510NAf.LIZJ(this.LLILLJJLI);
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("AbstractDataSource@7287.notifyProgressUpdate$1");
                            }
                        });
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC1320200kSY
    public final void LIZJ(InterfaceC589510NAf<T> interfaceC589510NAf, Executor executor) {
        boolean z;
        interfaceC589510NAf.getClass();
        executor.getClass();
        synchronized (this) {
            try {
                if (this.LIZIZ) {
                    return;
                }
                if (this.LIZ == EnumC1321270kUH.IN_PROGRESS) {
                    this.LJFF.add(Pair.create(interfaceC589510NAf, executor));
                }
                if (!LIZIZ() && !LIZ() && !LJIILJJIL()) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    LJIIIZ(interfaceC589510NAf, executor, LJII(), LJIILJJIL());
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        if (r4 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0022, code lost:
    
        LJFF(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0025, code lost:
    
        LJIIJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0029, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIILIIL(T r4, boolean r5) throws java.lang.Throwable {
        /*
            r3 = this;
            r2 = 0
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L44
            boolean r0 = r3.LIZIZ     // Catch: java.lang.Throwable -> L39
            if (r0 != 0) goto L2a
            X.0kUH r1 = r3.LIZ     // Catch: java.lang.Throwable -> L39
            X.0kUH r0 = X.EnumC1321270kUH.IN_PROGRESS     // Catch: java.lang.Throwable -> L39
            if (r1 != r0) goto L2a
            if (r5 == 0) goto L16
            X.0kUH r0 = X.EnumC1321270kUH.SUCCESS     // Catch: java.lang.Throwable -> L39
            r3.LIZ = r0     // Catch: java.lang.Throwable -> L39
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.LJ = r0     // Catch: java.lang.Throwable -> L39
        L16:
            T r1 = r3.LIZJ     // Catch: java.lang.Throwable -> L39
            if (r1 == r4) goto L1e
            r3.LIZJ = r4     // Catch: java.lang.Throwable -> L2f
            r4 = r1
            goto L1f
        L1e:
            r4 = r2
        L1f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2c
            if (r4 == 0) goto L25
            r3.LJFF(r4)
        L25:
            r0 = 1
            r3.LJIIJ()
            return r0
        L2a:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2c
            goto L32
        L2c:
            r0 = move-exception
            r1 = r4
            goto L30
        L2f:
            r0 = move-exception
        L30:
            r2 = r1
            goto L3a
        L32:
            if (r4 == 0) goto L37
            r3.LJFF(r4)
        L37:
            r0 = 0
            return r0
        L39:
            r0 = move-exception
        L3a:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3f
            goto L41
        L3f:
            r0 = move-exception
            goto L3a
        L41:
            throw r0     // Catch: java.lang.Throwable -> L42
        L42:
            r0 = move-exception
            goto L45
        L44:
            r0 = move-exception
        L45:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L49
            goto L4b
        L49:
            r0 = move-exception
            goto L45
        L4b:
            if (r2 == 0) goto L50
            r3.LJFF(r2)
        L50:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1321260kUG.LJIILIIL(java.lang.Object, boolean):boolean");
    }

    public final void LJI(final InterfaceC589510NAf<T> interfaceC589510NAf, Executor executor, final boolean z, final boolean z2) {
        if ((C1321280kUI.LIZ || this.LJI) && !z && !z2 && !(executor instanceof C822690WPb) && C786410Ut5.u3() != new BPEAHandler(Looper.getMainLooper()).getLooper().getThread()) {
            if (C1328570kg3.LJIIJ(2) && C1328570kg3.LIZ.LIZIZ(2)) {
                C1328570kg3.LIZ.v("AbstractDataSource", "onNewResult sendMessageAtFrontOfQueue");
            }
            BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
            Message messageObtain = Message.obtain(bPEAHandler, new ARunnableS78S0200000_9(interfaceC589510NAf, this, 100));
            messageObtain.setAsynchronous(true);
            if (C786410Ut5.LJLJJLL(bPEAHandler, messageObtain)) {
                return;
            }
        }
        executor.execute(new Runnable() { // from class: X.0NAe
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("AbstractDataSource@7287.notifyDataSubscriber$2");
                try {
                    if (z) {
                        interfaceC589510NAf.LIZIZ(this.LLILZ);
                    } else if (z2) {
                        interfaceC589510NAf.LIZLLL(this.LLILZ);
                    } else {
                        interfaceC589510NAf.LIZ(this.LLILZ);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("AbstractDataSource@7287.notifyDataSubscriber$2");
            }
        });
    }

    public final void LJIIIZ(InterfaceC589510NAf interfaceC589510NAf, Executor executor, boolean z, boolean z2) {
        if (!z && !z2) {
            try {
                if (((LsImageHandlerOpt.LsImageHandlerOptConfig) LsImageHandlerOpt.LIZIZ.getValue()).enable) {
                    if (C1321300kUK.LIZ(interfaceC589510NAf, executor, this)) {
                        return;
                    }
                }
            } catch (Throwable th) {
                try {
                    TryCatchGuardChecker.doCheck(th);
                    C1AF0.LJ(th);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    try {
                    } finally {
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            C1AF0.LJ(th);
                            LJI(interfaceC589510NAf, executor, z, z2);
                            throw th2;
                        } finally {
                        }
                    }
                    if (!C1326230kcH.LJIIJ(interfaceC589510NAf, executor, z, z2, this)) {
                        LJI(interfaceC589510NAf, executor, z, z2);
                    }
                    throw th2;
                }
            }
        }
        try {
            if (C1326230kcH.LJIIJ(interfaceC589510NAf, executor, z, z2, this)) {
                return;
            }
        } finally {
            try {
            } finally {
            }
        }
        LJI(interfaceC589510NAf, executor, z, z2);
    }
}
