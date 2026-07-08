package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;

/* JADX INFO: renamed from: X.1DEU, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public class C1DEU implements InterfaceC1337805Lk {
    public static final AtomicReferenceFieldUpdater LIZJ = AtomicReferenceFieldUpdater.newUpdater(C1DEU.class, Object.class, "head");
    public static final AtomicLongFieldUpdater LIZLLL = AtomicLongFieldUpdater.newUpdater(C1DEU.class, "deqIdx");
    public static final AtomicReferenceFieldUpdater LJ = AtomicReferenceFieldUpdater.newUpdater(C1DEU.class, Object.class, "tail");
    public static final AtomicLongFieldUpdater LJFF = AtomicLongFieldUpdater.newUpdater(C1DEU.class, "enqIdx");
    public static final AtomicIntegerFieldUpdater LJI = AtomicIntegerFieldUpdater.newUpdater(C1DEU.class, "_availablePermits");
    public final int LIZ;
    public final C1308560k9m LIZIZ;
    public volatile int _availablePermits;
    public volatile long deqIdx;
    public volatile long enqIdx;
    public volatile Object head;
    public volatile Object tail;

    @Override // X.InterfaceC1337805Lk
    public final void release() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        int i2;
        Object objLIZ;
        while (true) {
            int andIncrement = LJI.getAndIncrement(this);
            if (andIncrement >= this.LIZ) {
                do {
                    atomicIntegerFieldUpdater = LJI;
                    i = atomicIntegerFieldUpdater.get(this);
                    i2 = this.LIZ;
                    if (i <= i2) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i2));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("The number of released permits cannot be greater than ");
                sbLIZ.append(this.LIZ);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                strLIZIZ.toString();
                throw new IllegalStateException(strLIZIZ);
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LIZJ;
            C1DET c1det = (C1DET) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = LIZLLL.getAndIncrement(this);
            long j = andIncrement2 / ((long) C2252461DEe.LJFF);
            C2252421DEa c2252421DEa = C2252421DEa.LL;
            while (true) {
                objLIZ = C1DEO.LIZ(c1det, j, c2252421DEa);
                if (C2252451DEd.LIZIZ(objLIZ)) {
                    break;
                }
                C1DET c1detLIZ = C2252451DEd.LIZ(objLIZ);
                while (true) {
                    C1DET c1det2 = (C1DET) atomicReferenceFieldUpdater.get(this);
                    if (c1det2.LLILLL >= c1detLIZ.LLILLL) {
                        break;
                    }
                    if (!c1detLIZ.LJIIIIZZ()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, c1det2, c1detLIZ)) {
                        if (atomicReferenceFieldUpdater.get(this) != c1det2) {
                            if (c1detLIZ.LJ()) {
                                c1detLIZ.LIZLLL();
                            }
                        }
                    }
                    if (c1det2.LJ()) {
                        c1det2.LIZLLL();
                    }
                }
            }
            C1DEX c1dex = (C1DEX) C2252451DEd.LIZ(objLIZ);
            c1dex.LIZ();
            if (c1dex.LLILLL <= j) {
                int i3 = (int) (andIncrement2 % ((long) C2252461DEe.LJFF));
                Object andSet = c1dex.LLILZIL.getAndSet(i3, C2252461DEe.LIZIZ);
                if (andSet == null) {
                    int i4 = C2252461DEe.LIZ;
                    for (int i5 = 0; i5 < i4; i5++) {
                        if (c1dex.LLILZIL.get(i3) == C2252461DEe.LIZJ) {
                            return;
                        }
                    }
                    C09AU c09au = C2252461DEe.LIZIZ;
                    C09AU c09au2 = C2252461DEe.LIZLLL;
                    AtomicReferenceArray atomicReferenceArray = c1dex.LLILZIL;
                    while (!atomicReferenceArray.compareAndSet(i3, c09au, c09au2)) {
                        if (atomicReferenceArray.get(i3) != c09au) {
                            return;
                        }
                    }
                } else if (andSet == C2252461DEe.LJ) {
                    continue;
                } else if (andSet instanceof InterfaceC20236714Gf) {
                    InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) andSet;
                    C09AU c09auLJJIIJZLJL = interfaceC20236714Gf.LJJIIJZLJL(this.LIZIZ, Unit.LIZ);
                    if (c09auLJJIIJZLJL != null) {
                        interfaceC20236714Gf.LJIIL(c09auLJJIIJZLJL);
                        return;
                    }
                } else {
                    if (!(andSet instanceof C1DEF)) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("unexpected: ");
                        sbLIZ2.append(andSet);
                        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                        strLIZIZ2.toString();
                        throw new IllegalStateException(strLIZIZ2);
                    }
                    if (((C1DEF) andSet).LJ(this, Unit.LIZ)) {
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        r2.LJJIFFI(r3.LIZIZ, kotlin.Unit.LIZ);
     */
    @Override // X.InterfaceC1337805Lk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r4) {
        /*
            r3 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = X.C1DEU.LJI
            int r1 = r0.getAndDecrement(r3)
            int r0 = r3.LIZ
            if (r1 > r0) goto L0
            if (r1 <= 0) goto Lf
            kotlin.Unit r1 = kotlin.Unit.LIZ
        Le:
            return r1
        Lf:
            X.05Vn r0 = X.C099M.LIZLLL(r4)
            X.1DEt r2 = X.C2252661DEy.LIZ(r0)
            boolean r0 = r3.LJ(r2)     // Catch: java.lang.Throwable -> L56
            if (r0 != 0) goto L38
        L1d:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = X.C1DEU.LJI     // Catch: java.lang.Throwable -> L56
            int r1 = r0.getAndDecrement(r3)     // Catch: java.lang.Throwable -> L56
            int r0 = r3.LIZ     // Catch: java.lang.Throwable -> L56
            if (r1 > r0) goto L1d
            if (r1 <= 0) goto L2a
            goto L31
        L2a:
            boolean r0 = r3.LJ(r2)     // Catch: java.lang.Throwable -> L56
            if (r0 == 0) goto L1d
            goto L38
        L31:
            kotlin.Unit r1 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L56
            X.0k9m r0 = r3.LIZIZ     // Catch: java.lang.Throwable -> L56
            r2.LJJIFFI(r0, r1)     // Catch: java.lang.Throwable -> L56
        L38:
            java.lang.Object r1 = r2.LJIJ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 != r0) goto L45
            X.C099Q.LIZJ(r4)
        L45:
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 == r0) goto L4d
            kotlin.Unit r1 = kotlin.Unit.LIZ
        L4d:
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 == r0) goto Le
            kotlin.Unit r1 = kotlin.Unit.LIZ
            return r1
        L56:
            r0 = move-exception
            r2.LJJIIZI()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1DEU.LIZ(X.05Vn):java.lang.Object");
    }

    public final boolean LJ(C1DEG c1deg) {
        Object objLIZ;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LJ;
        C1DET c1det = (C1DET) atomicReferenceFieldUpdater.get(this);
        long andIncrement = LJFF.getAndIncrement(this);
        C1DEZ c1dez = C1DEZ.LL;
        long j = andIncrement / ((long) C2252461DEe.LJFF);
        loop0: while (true) {
            objLIZ = C1DEO.LIZ(c1det, j, c1dez);
            if (C2252451DEd.LIZIZ(objLIZ)) {
                break;
            }
            C1DET c1detLIZ = C2252451DEd.LIZ(objLIZ);
            while (true) {
                C1DET c1det2 = (C1DET) atomicReferenceFieldUpdater.get(this);
                if (c1det2.LLILLL >= c1detLIZ.LLILLL) {
                    break loop0;
                }
                if (!c1detLIZ.LJIIIIZZ()) {
                    break;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c1det2, c1detLIZ)) {
                    if (atomicReferenceFieldUpdater.get(this) != c1det2) {
                        if (c1detLIZ.LJ()) {
                            c1detLIZ.LIZLLL();
                        }
                    }
                }
                if (c1det2.LJ()) {
                    c1det2.LIZLLL();
                }
            }
        }
        C1DEX c1dex = (C1DEX) C2252451DEd.LIZ(objLIZ);
        int i = (int) (andIncrement % ((long) C2252461DEe.LJFF));
        AtomicReferenceArray atomicReferenceArray = c1dex.LLILZIL;
        while (!atomicReferenceArray.compareAndSet(i, null, c1deg)) {
            if (atomicReferenceArray.get(i) != null) {
                C09AU c09au = C2252461DEe.LIZIZ;
                C09AU c09au2 = C2252461DEe.LIZJ;
                AtomicReferenceArray atomicReferenceArray2 = c1dex.LLILZIL;
                while (!atomicReferenceArray2.compareAndSet(i, c09au, c09au2)) {
                    if (atomicReferenceArray2.get(i) != c09au) {
                        return false;
                    }
                }
                ((InterfaceC20236714Gf) c1deg).LJJIFFI(this.LIZIZ, Unit.LIZ);
                return true;
            }
        }
        c1deg.LIZLLL(c1dex, i);
        return true;
    }

    public C1DEU(int i, int i2) {
        this.LIZ = i;
        if (i > 0) {
            if (i2 >= 0 && i2 <= i) {
                C1DEX c1dex = new C1DEX(0L, null, 2);
                this.head = c1dex;
                this.tail = c1dex;
                this._availablePermits = i - i2;
                this.LIZIZ = new C1308560k9m(this);
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("The number of acquired permits should be in 0..");
            sbLIZ.append(i);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            strLIZIZ.toString();
            throw new IllegalArgumentException(strLIZIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Semaphore should have at least 1 permit, but had ");
        sbLIZ2.append(i);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        strLIZIZ2.toString();
        throw new IllegalArgumentException(strLIZIZ2);
    }
}
