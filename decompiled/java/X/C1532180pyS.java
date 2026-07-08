package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pyS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1532180pyS {
    public C1532280pyc LIZ;
    public C1532280pyc LIZIZ;
    public volatile C1532120pyM<C1532340pyi> LIZJ;
    public final AtomicInteger LIZLLL = new AtomicInteger(0);
    public final AtomicReference<C1532010pyB<C1532340pyi>> LJ = new AtomicReference<>(null);
    public HashMap<Class<?>, AbstractC1532320pyg<?, ?>> LJFF;

    public final C1532340pyi LIZJ(boolean z) {
        WeakReference<C1532340pyi> weakReference;
        Class<? extends Object> clsLIZLLL;
        C1532340pyi c1532340pyi;
        C1532120pyM<C1532340pyi> c1532120pyM = this.LIZJ;
        if (c1532120pyM == null) {
            return null;
        }
        C1532340pyi c1532340pyiLIZ = c1532120pyM.LIZ();
        if (z) {
            if (c1532340pyiLIZ != null) {
                clsLIZLLL = c1532340pyiLIZ.LIZLLL();
            } else {
                clsLIZLLL = null;
            }
            if (!Intrinsics.LJFF(clsLIZLLL, File.class) && (c1532340pyi = c1532120pyM.LIZ) != null) {
                c1532120pyM.LIZIZ = new WeakReference<>(c1532340pyi);
                c1532120pyM.LIZ = null;
            }
        }
        if (c1532340pyiLIZ == null && (weakReference = c1532120pyM.LIZIZ) != null && weakReference.get() == null) {
            synchronized (this.LIZLLL) {
                try {
                    if (c1532120pyM == this.LIZJ) {
                        this.LIZLLL.set(0);
                        this.LIZJ = null;
                        return null;
                    }
                    C1532120pyM<C1532340pyi> c1532120pyM2 = this.LIZJ;
                    if (c1532120pyM2 == null) {
                        return null;
                    }
                    return c1532120pyM2.LIZ();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return c1532340pyiLIZ;
    }

    public final int LIZLLL(boolean z) {
        if (z) {
            if (!this.LIZLLL.compareAndSet(0, 1)) {
                return -1;
            }
            return 0;
        }
        while (true) {
            int i = this.LIZLLL.get();
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (this.LIZLLL.incrementAndGet() > 4) {
                            return -3;
                        }
                        return -2;
                    }
                    if (this.LIZLLL.compareAndSet(2, 4)) {
                        return -1;
                    }
                } else if (this.LIZLLL.compareAndSet(1, 3)) {
                    return 1;
                }
            } else if (this.LIZLLL.compareAndSet(0, 3)) {
                return 0;
            }
        }
    }

    public final void LJ(boolean z) {
        if (z) {
            this.LIZ = null;
            this.LIZLLL.set(0);
            LIZIZ(null, false);
            return;
        }
        LIZIZ(null, true);
    }

    public final void LIZ(C1541080qCo<?> c1541080qCo, Function1<? super C1532340pyi, Unit> function1) {
        C1532340pyi c1532340pyiLIZ;
        C1532010pyB<C1532340pyi> andSet;
        C1532340pyi c1532340pyiLIZ2;
        C1532120pyM<C1532340pyi> c1532120pyM = this.LIZJ;
        if (c1532120pyM != null && (c1532340pyiLIZ2 = c1532120pyM.LIZ()) != null) {
            function1.invoke(c1532340pyiLIZ2);
            return;
        }
        C1532010pyB<C1532340pyi> c1532010pyB = this.LJ.get();
        C1532340pyi c1532340pyiLIZ3 = null;
        if (c1532010pyB == null) {
            AtomicReference<C1532010pyB<C1532340pyi>> atomicReference = this.LJ;
            C1532010pyB<C1532340pyi> c1532010pyB2 = new C1532010pyB<>();
            while (!atomicReference.compareAndSet(null, c1532010pyB2) && atomicReference.get() == null) {
            }
        }
        C1532120pyM<C1532340pyi> c1532120pyM2 = this.LIZJ;
        if (c1532120pyM2 != null && (c1532340pyiLIZ = c1532120pyM2.LIZ()) != null) {
            if (c1532010pyB == null && (andSet = this.LJ.getAndSet(null)) != null) {
                andSet.LIZIZ(c1532340pyiLIZ);
            }
            function1.invoke(c1532340pyiLIZ);
            return;
        }
        if (c1532010pyB == null && (c1532010pyB = this.LJ.get()) == null) {
            C1532120pyM<C1532340pyi> c1532120pyM3 = this.LIZJ;
            if (c1532120pyM3 != null) {
                c1532340pyiLIZ3 = c1532120pyM3.LIZ();
            }
            function1.invoke(c1532340pyiLIZ3);
            return;
        }
        c1532010pyB.LIZ(c1541080qCo, function1);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.C1532340pyi r5, boolean r6) {
        /*
            r4 = this;
            r3 = 0
            r4.LIZIZ = r3
            X.0pyM<X.0pyi> r0 = r4.LIZJ
            if (r0 == 0) goto Ld
            java.lang.Object r0 = r0.LIZ()
            if (r0 != 0) goto L25
        Ld:
            X.0pyM r2 = new X.0pyM
            if (r6 == 0) goto L35
            if (r5 == 0) goto L33
            java.lang.Class r1 = r5.LIZLLL()
        L17:
            java.lang.Class<java.io.File> r0 = java.io.File.class
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L35
            r0 = 1
        L20:
            r2.<init>(r5, r0)
            r4.LIZJ = r2
        L25:
            java.util.concurrent.atomic.AtomicReference<X.0pyB<X.0pyi>> r0 = r4.LJ
            java.lang.Object r0 = r0.getAndSet(r3)
            X.0pyB r0 = (X.C1532010pyB) r0
            if (r0 == 0) goto L32
            r0.LIZIZ(r5)
        L32:
            return
        L33:
            r1 = r3
            goto L17
        L35:
            r0 = 0
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1532180pyS.LIZIZ(X.0pyi, boolean):void");
    }
}
