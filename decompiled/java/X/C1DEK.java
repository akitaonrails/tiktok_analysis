package X;

import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS244S0300000_35;
import kotlin.jvm.internal.AwS684S0100000_35;
import skp.f0;

/* JADX INFO: renamed from: X.1DEK, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public class C1DEK<E> implements C095E<E> {
    public static final AtomicLongFieldUpdater LLILZ = AtomicLongFieldUpdater.newUpdater(C1DEK.class, "sendersAndCloseStatus");
    public static final AtomicLongFieldUpdater LLILZIL = AtomicLongFieldUpdater.newUpdater(C1DEK.class, "receivers");
    public static final AtomicLongFieldUpdater LLILZLL = AtomicLongFieldUpdater.newUpdater(C1DEK.class, "bufferEnd");
    public static final AtomicLongFieldUpdater LLIZ = AtomicLongFieldUpdater.newUpdater(C1DEK.class, "completedExpandBuffersAndPauseFlag");
    public static final AtomicReferenceFieldUpdater LLIZLLLIL = AtomicReferenceFieldUpdater.newUpdater(C1DEK.class, Object.class, "sendSegment");
    public static final AtomicReferenceFieldUpdater LLJ = AtomicReferenceFieldUpdater.newUpdater(C1DEK.class, Object.class, "receiveSegment");
    public static final AtomicReferenceFieldUpdater LLJI = AtomicReferenceFieldUpdater.newUpdater(C1DEK.class, Object.class, "bufferEndSegment");
    public static final AtomicReferenceFieldUpdater LLJIJIL = AtomicReferenceFieldUpdater.newUpdater(C1DEK.class, Object.class, "_closeCause");
    public static final AtomicReferenceFieldUpdater LLJILJIL = AtomicReferenceFieldUpdater.newUpdater(C1DEK.class, Object.class, "closeHandler");
    public final int LL;
    public final Function1<E, Unit> LLILLJJLI;
    public final AwS684S0100000_35 LLILLL;
    public volatile Object _closeCause;
    public volatile long bufferEnd;
    public volatile Object bufferEndSegment;
    public volatile Object closeHandler;
    public volatile long completedExpandBuffersAndPauseFlag;
    public volatile Object receiveSegment;
    public volatile long receivers;
    public volatile Object sendSegment;
    public volatile long sendersAndCloseStatus;

    @Override // X.AnonymousClass0954
    public final Object LJIJ(InterfaceC1364105Vn<? super C094N<? extends E>> interfaceC1364105Vn) {
        return LJJIJ(this, interfaceC1364105Vn);
    }

    public boolean LJJIII() {
        return false;
    }

    public void LJJIIZ() {
    }

    @Override // X.AnonymousClass0955
    public final boolean LJ() {
        return LJJIFFI(LLILZ.get(this), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f3, code lost:
    
        LJJI(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f8, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII() {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1DEK.LJII():void");
    }

    @Override // X.AnonymousClass0954
    public final InterfaceC2192541ArU<C094N<E>> LJIIIZ() {
        C2252441DEc c2252441DEc = C2252441DEc.LL;
        C19719512Dh.LJ(3, c2252441DEc);
        C1DEJ c1dej = C1DEJ.LL;
        C19719512Dh.LJ(3, c1dej);
        return new C2192531ArT(this, c2252441DEc, c1dej, this.LLILLL);
    }

    @Override // X.AnonymousClass0954
    public final Object LJIIJ() {
        C1DEG c1deg;
        long j = LLILZIL.get(this);
        long j2 = LLILZ.get(this);
        if (LJJIFFI(j2, true)) {
            return new C094M(LJIIZILJ());
        }
        if (j >= (j2 & 1152921504606846975L)) {
            return C094N.LIZIZ;
        }
        Object obj = C1DEN.LJIIJ;
        C1DEM<E> c1dem = (C1DEM) LLJ.get(this);
        while (!LJJII()) {
            long andIncrement = LLILZIL.getAndIncrement(this);
            long j3 = C1DEN.LIZIZ;
            long j4 = andIncrement / j3;
            int i = (int) (andIncrement % j3);
            if (c1dem.LLILLL != j4) {
                C1DEM<E> c1demLJIIL = LJIIL(j4, c1dem);
                if (c1demLJIIL != null) {
                    c1dem = c1demLJIIL;
                } else {
                    continue;
                }
            }
            Object objLJJIL = LJJIL(c1dem, i, andIncrement, obj);
            if (objLJJIL == C1DEN.LJIIL) {
                if ((obj instanceof C1DEG) && (c1deg = (C1DEG) obj) != null) {
                    c1deg.LIZLLL(c1dem, i);
                }
                LJJJI(andIncrement);
                c1dem.LJII();
                return C094N.LIZIZ;
            }
            if (objLJJIL != C1DEN.LJIILJJIL) {
                if (objLJJIL != C1DEN.LJIILIIL) {
                    c1dem.LIZ();
                    return objLJJIL;
                }
                "unexpected".toString();
                throw new IllegalStateException("unexpected");
            }
            if (andIncrement < LJJ()) {
                c1dem.LIZ();
            }
        }
        return new C094M(LJIIZILJ());
    }

    @Override // X.AnonymousClass0954
    public final InterfaceC2192541ArU<E> LJIILJJIL() {
        C2252431DEb c2252431DEb = C2252431DEb.LL;
        C19719512Dh.LJ(3, c2252431DEb);
        C1DEQ c1deq = C1DEQ.LL;
        C19719512Dh.LJ(3, c1deq);
        return new C2192531ArT(this, c2252431DEb, c1deq, this.LLILLL);
    }

    public final long LJIILLIIL() {
        return LLILZLL.get(this);
    }

    public final Throwable LJIIZILJ() {
        return (Throwable) LLJIJIL.get(this);
    }

    public final long LJIJJLI() {
        return LLILZIL.get(this);
    }

    public final long LJJ() {
        return LLILZ.get(this) & 1152921504606846975L;
    }

    public final boolean LJJII() {
        return LJJIFFI(LLILZ.get(this), true);
    }

    @Override // X.AnonymousClass0954
    public final InterfaceC824740WWy<E> iterator() {
        return new C1DEL(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x01a9, code lost:
    
        r6 = (X.C1DEM) r6.LIZIZ();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1DEK.toString():java.lang.String");
    }

    public final Throwable LJIJJ() {
        Throwable thLJIIZILJ = LJIIZILJ();
        if (thLJIIZILJ != null) {
            return thLJIIZILJ;
        }
        final String str = "Channel was closed";
        return new NoSuchElementException(str) { // from class: X.1BoJ
        };
    }

    public final Throwable LJIL() {
        Throwable thLJIIZILJ = LJIIZILJ();
        if (thLJIIZILJ != null) {
            return thLJIIZILJ;
        }
        final String str = "Channel was closed";
        return new IllegalStateException(str) { // from class: X.17nm
        };
    }

    public final boolean LJJIIJ() {
        long jLJIILLIIL = LJIILLIIL();
        return jLJIILLIIL == 0 || jLJIILLIIL == Long.MAX_VALUE;
    }

    public final boolean LIZ(long j) {
        if (j >= LJIILLIIL() && j >= LJIJJLI() + ((long) this.LL)) {
            return false;
        }
        return true;
    }

    @Override // X.AnonymousClass0954
    public final void LIZIZ(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        LIZLLL(cancellationException, true);
    }

    @Override // X.AnonymousClass0955
    public final void LIZJ(Function1<? super Throwable, Unit> function1) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LLJILJIL;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, null, function1)) {
            if (atomicReferenceFieldUpdater.get(this) != null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = LLJILJIL;
                while (true) {
                    Object obj = atomicReferenceFieldUpdater2.get(this);
                    C09AU c09au = C1DEN.LJIILLIIL;
                    if (obj == c09au) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = LLJILJIL;
                        C09AU c09au2 = C1DEN.LJIIZILJ;
                        while (!atomicReferenceFieldUpdater3.compareAndSet(this, c09au, c09au2)) {
                            if (atomicReferenceFieldUpdater3.get(this) != c09au) {
                                break;
                            }
                        }
                        function1.invoke(LJIIZILJ());
                        return;
                    }
                    if (obj == C1DEN.LJIIZILJ) {
                        "Another handler was already registered and successfully invoked".toString();
                        throw new IllegalStateException("Another handler was already registered and successfully invoked");
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Another handler is already registered: ");
                    sbLIZ.append(obj);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    strLIZIZ.toString();
                    throw new IllegalStateException(strLIZIZ);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00fc, code lost:
    
        r8 = (X.C1DEM) ((X.C1DES) X.C1DES.LLILLJJLI.get(r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0106, code lost:
    
        if (r8 != null) goto L87;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1DEM<E> LJFF(long r15) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1DEK.LJFF(long):X.1DEM");
    }

    public final void LJI(long j) {
        C2250681D7i c2250681D7iLIZIZ;
        C1DEM<E> c1dem = (C1DEM) LLJ.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = LLILZIL;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(((long) this.LL) + j2, LJIILLIIL())) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j2, j2 + 1)) {
                long j3 = C1DEN.LIZIZ;
                long j4 = j2 / j3;
                int i = (int) (j2 % j3);
                if (c1dem.LLILLL != j4) {
                    C1DEM<E> c1demLJIIL = LJIIL(j4, c1dem);
                    if (c1demLJIIL != null) {
                        c1dem = c1demLJIIL;
                    } else {
                        continue;
                    }
                }
                Object objLJJIL = LJJIL(c1dem, i, j2, null);
                if (objLJJIL == C1DEN.LJIILJJIL) {
                    if (j2 < LJJ()) {
                        c1dem.LIZ();
                    }
                } else {
                    c1dem.LIZ();
                    Function1<E, Unit> function1 = this.LLILLJJLI;
                    if (function1 != null && (c2250681D7iLIZIZ = C2250671D7h.LIZIZ(function1, objLJJIL, null)) != null) {
                        throw c2250681D7iLIZIZ;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bd, code lost:
    
        return kotlin.Unit.LIZ;
     */
    @Override // X.AnonymousClass0955
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object LJIIIIZZ(E r20) {
        /*
            r19 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = X.C1DEK.LLILZ
            r11 = r19
            long r0 = r0.get(r11)
            r6 = 0
            boolean r2 = r11.LJJIFFI(r0, r6)
            r7 = 1
            r9 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            if (r2 != 0) goto L21
            long r0 = r0 & r9
            boolean r0 = r11.LIZ(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L21
            X.094O r0 = X.C094N.LIZIZ
            return r0
        L21:
            X.09AU r5 = X.C1DEN.LJIIIZ
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.C1DEK.LLIZLLLIL
            java.lang.Object r12 = r0.get(r11)
            X.1DEM r12 = (X.C1DEM) r12
        L2b:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = X.C1DEK.LLILZ
            long r0 = r0.getAndIncrement(r11)
            long r15 = r0 & r9
            boolean r18 = r11.LJJIFFI(r0, r6)
            int r4 = X.C1DEN.LIZIZ
            long r2 = (long) r4
            long r0 = r15 / r2
            long r2 = r15 % r2
            int r13 = (int) r2
            long r2 = r12.LLILLL
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 == 0) goto L58
            X.1DEM r0 = r11.LJIILL(r0, r12)
            if (r0 != 0) goto L57
            if (r18 == 0) goto L2b
            java.lang.Throwable r0 = r11.LJIL()
            X.094M r1 = new X.094M
            r1.<init>(r0)
            return r1
        L57:
            r12 = r0
        L58:
            r3 = r12
            r14 = r20
            r17 = r5
            int r1 = r11.LJJIZ(r12, r13, r14, r15, r17, r18)
            if (r1 == 0) goto Lb8
            if (r1 == r7) goto Lbb
            r0 = 2
            if (r1 == r0) goto L97
            r0 = 3
            if (r1 == r0) goto L8b
            r0 = 4
            if (r1 == r0) goto L76
            r0 = 5
            if (r1 != r0) goto L74
            r3.LIZ()
        L74:
            r12 = r3
            goto L2b
        L76:
            long r1 = r11.LJIJJLI()
            int r0 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r0 >= 0) goto L81
            r3.LIZ()
        L81:
            java.lang.Throwable r0 = r11.LJIL()
            X.094M r1 = new X.094M
            r1.<init>(r0)
            return r1
        L8b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected"
            r0.toString()
            r1.<init>(r0)
            throw r1
        L97:
            if (r18 == 0) goto La6
            r3.LJII()
            java.lang.Throwable r0 = r11.LJIL()
            X.094M r1 = new X.094M
            r1.<init>(r0)
            return r1
        La6:
            boolean r0 = r5 instanceof X.C1DEG
            if (r0 == 0) goto Lb2
            X.1DEG r5 = (X.C1DEG) r5
            if (r5 == 0) goto Lb2
            int r13 = r13 + r4
            r5.LIZLLL(r3, r13)
        Lb2:
            r3.LJII()
            X.094O r1 = X.C094N.LIZIZ
            return r1
        Lb8:
            r12.LIZ()
        Lbb:
            kotlin.Unit r1 = kotlin.Unit.LIZ
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1DEK.LJIIIIZZ(java.lang.Object):java.lang.Object");
    }

    @Override // X.AnonymousClass0955
    public final boolean LJIIJJI(Throwable th) {
        return LIZLLL(th, false);
    }

    @Override // X.AnonymousClass0954
    public final Object LJIILIIL(InterfaceC1364105Vn<? super E> interfaceC1364105Vn) throws Throwable {
        C1DEM<E> c1dem = (C1DEM) LLJ.get(this);
        while (!LJJII()) {
            long andIncrement = LLILZIL.getAndIncrement(this);
            long j = C1DEN.LIZIZ;
            long j2 = andIncrement / j;
            int i = (int) (andIncrement % j);
            if (c1dem.LLILLL != j2) {
                C1DEM<E> c1demLJIIL = LJIIL(j2, c1dem);
                if (c1demLJIIL != null) {
                    c1dem = c1demLJIIL;
                } else {
                    continue;
                }
            }
            Object objLJJIL = LJJIL(c1dem, i, andIncrement, null);
            C09AU c09au = C1DEN.LJIIL;
            if (objLJJIL != c09au) {
                C09AU c09au2 = C1DEN.LJIILJJIL;
                if (objLJJIL == c09au2) {
                    if (andIncrement < LJJ()) {
                        c1dem.LIZ();
                    }
                } else {
                    if (objLJJIL == C1DEN.LJIILIIL) {
                        C2252611DEt c2252611DEtLIZ = C2252661DEy.LIZ(C099M.LIZLLL(interfaceC1364105Vn));
                        try {
                            Object objLJJIL2 = LJJIL(c1dem, i, andIncrement, c2252611DEtLIZ);
                            if (objLJJIL2 == c09au) {
                                c2252611DEtLIZ.LIZLLL(c1dem, i);
                            } else {
                                AwS244S0300000_35 awS244S0300000_35 = null;
                                if (objLJJIL2 == c09au2) {
                                    if (andIncrement < LJJ()) {
                                        c1dem.LIZ();
                                    }
                                    C1DEM<E> c1dem2 = (C1DEM) LLJ.get(this);
                                    while (true) {
                                        if (LJJII()) {
                                            C098200Yq c098200Yq = new C098200Yq(LJIJJ());
                                            C189200o6.m2constructorimpl(c098200Yq);
                                            c2252611DEtLIZ.resumeWith(c098200Yq);
                                            break;
                                        }
                                        long andIncrement2 = LLILZIL.getAndIncrement(this);
                                        long j3 = C1DEN.LIZIZ;
                                        long j4 = andIncrement2 / j3;
                                        int i2 = (int) (andIncrement2 % j3);
                                        if (c1dem2.LLILLL != j4) {
                                            C1DEM<E> c1demLJIIL2 = LJIIL(j4, c1dem2);
                                            if (c1demLJIIL2 != null) {
                                                c1dem2 = c1demLJIIL2;
                                            } else {
                                                continue;
                                            }
                                        }
                                        objLJJIL2 = LJJIL(c1dem2, i2, andIncrement2, c2252611DEtLIZ);
                                        if (objLJJIL2 == C1DEN.LJIIL) {
                                            c2252611DEtLIZ.LIZLLL(c1dem2, i2);
                                            break;
                                        }
                                        if (objLJJIL2 == C1DEN.LJIILJJIL) {
                                            if (andIncrement2 < LJJ()) {
                                                c1dem2.LIZ();
                                            }
                                        } else if (objLJJIL2 != C1DEN.LJIILIIL) {
                                            c1dem2.LIZ();
                                            Function1<E, Unit> function1 = this.LLILLJJLI;
                                            if (function1 != null) {
                                                awS244S0300000_35 = new AwS244S0300000_35((Function1) function1, (Function1<Object, Unit>) objLJJIL2, (Object) c2252611DEtLIZ.LLILZIL, (CoroutineContext) 8);
                                            }
                                        } else {
                                            "unexpected".toString();
                                            throw new IllegalStateException("unexpected");
                                        }
                                    }
                                } else {
                                    c1dem.LIZ();
                                    Function1<E, Unit> function12 = this.LLILLJJLI;
                                    if (function12 != null) {
                                        awS244S0300000_35 = new AwS244S0300000_35((Function1) function12, (Function1<Object, Unit>) objLJJIL2, (Object) c2252611DEtLIZ.LLILZIL, (CoroutineContext) 8);
                                    }
                                }
                                c2252611DEtLIZ.LJJIFFI(awS244S0300000_35, objLJJIL2);
                            }
                            objLJJIL = c2252611DEtLIZ.LJIJ();
                            if (objLJJIL == C099R.LJFF()) {
                                C099Q.LIZJ(interfaceC1364105Vn);
                                return objLJJIL;
                            }
                        } catch (Throwable th) {
                            c2252611DEtLIZ.LJJIIZI();
                            throw th;
                        }
                    } else {
                        c1dem.LIZ();
                    }
                    return objLJJIL;
                }
            } else {
                "unexpected".toString();
                throw new IllegalStateException("unexpected");
            }
        }
        Throwable thLJIJJ = LJIJJ();
        int i3 = f0.LIZ;
        throw thLJIJJ;
    }

    public final void LJJI(long j) {
        if ((LLIZ.addAndGet(this, j) & 4611686018427387904L) != 0) {
            while ((LLIZ.get(this) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final void LJJIJIIJIL(C1DEF c1def) {
        C1DEG c1deg;
        C1DEM<E> c1dem = (C1DEM) LLJ.get(this);
        while (!LJJII()) {
            long andIncrement = LLILZIL.getAndIncrement(this);
            long j = C1DEN.LIZIZ;
            long j2 = andIncrement / j;
            int i = (int) (andIncrement % j);
            if (c1dem.LLILLL != j2) {
                C1DEM<E> c1demLJIIL = LJIIL(j2, c1dem);
                if (c1demLJIIL != null) {
                    c1dem = c1demLJIIL;
                } else {
                    continue;
                }
            }
            Object objLJJIL = LJJIL(c1dem, i, andIncrement, c1def);
            if (objLJJIL == C1DEN.LJIIL) {
                if (!(c1def instanceof C1DEG) || (c1deg = (C1DEG) c1def) == null) {
                    return;
                }
                c1deg.LIZLLL(c1dem, i);
                return;
            }
            if (objLJJIL == C1DEN.LJIILJJIL) {
                if (andIncrement < LJJ()) {
                    c1dem.LIZ();
                }
            } else if (objLJJIL != C1DEN.LJIILIIL) {
                c1dem.LIZ();
                c1def.LIZIZ(objLJJIL);
                return;
            } else {
                "unexpected".toString();
                throw new IllegalStateException("unexpected");
            }
        }
        c1def.LIZIZ(C1DEN.LJIIJJI);
    }

    public final void LJJJI(long j) {
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        boolean z;
        long j3;
        if (LJJIIJ()) {
            return;
        }
        while (LJIILLIIL() <= j) {
        }
        int i = C1DEN.LIZJ;
        for (int i2 = 0; i2 < i; i2++) {
            long jLJIILLIIL = LJIILLIIL();
            if (jLJIILLIIL == (LLIZ.get(this) & 4611686018427387903L) && jLJIILLIIL == LJIILLIIL()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = LLIZ;
        do {
            j2 = atomicLongFieldUpdater2.get(this);
        } while (!atomicLongFieldUpdater2.compareAndSet(this, j2, 4611686018427387904L + (j2 & 4611686018427387903L)));
        while (true) {
            long jLJIILLIIL2 = LJIILLIIL();
            atomicLongFieldUpdater = LLIZ;
            long j4 = atomicLongFieldUpdater.get(this);
            long j5 = j4 & 4611686018427387903L;
            if ((j4 & 4611686018427387904L) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (jLJIILLIIL2 == j5 && jLJIILLIIL2 == LJIILLIIL()) {
                break;
            } else if (!z) {
                atomicLongFieldUpdater.compareAndSet(this, j4, j5 + 4611686018427387904L);
            }
        }
        do {
            j3 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j3, 0 + (j3 & 4611686018427387903L)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1DEK(int i, Function1<? super E, Unit> function1) {
        long j;
        AwS684S0100000_35 awS684S0100000_35;
        this.LL = i;
        this.LLILLJJLI = function1;
        if (i >= 0) {
            C1DEM<Object> c1dem = C1DEN.LIZ;
            if (i != 0) {
                if (i != Integer.MAX_VALUE) {
                    j = i;
                } else {
                    j = Long.MAX_VALUE;
                }
            } else {
                j = 0;
            }
            this.bufferEnd = j;
            this.completedExpandBuffersAndPauseFlag = LJIILLIIL();
            C1DEM<Object> c1dem2 = new C1DEM<>(0L, null, this, 3);
            this.sendSegment = c1dem2;
            this.receiveSegment = c1dem2;
            this.bufferEndSegment = LJJIIJ() ? C1DEN.LIZ : c1dem2;
            if (function1 != 0) {
                awS684S0100000_35 = new AwS684S0100000_35(this, 3);
            } else {
                awS684S0100000_35 = null;
            }
            this.LLILLL = awS684S0100000_35;
            this._closeCause = C1DEN.LJIJ;
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Invalid channel capacity: ");
        sbLIZ.append(i);
        sbLIZ.append(", should be >=0");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <E> java.lang.Object LJJIJ(X.C1DEK<E> r17, X.InterfaceC1364105Vn<? super X.C094N<? extends E>> r18) {
        /*
            r3 = r18
            boolean r0 = r3 instanceof X.C1D9B
            r8 = r17
            if (r0 == 0) goto L8f
            r4 = r3
            X.1D9B r4 = (X.C1D9B) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8f
            int r2 = r2 - r1
            r4.LLILLL = r2
        L16:
            java.lang.Object r1 = r4.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r5 = 1
            if (r0 == 0) goto L2b
            if (r0 != r5) goto L95
            X.C155000ia.LIZIZ(r1)
            X.094N r1 = (X.C094N) r1
            java.lang.Object r1 = r1.LIZ
        L2a:
            return r1
        L2b:
            X.C155000ia.LIZIZ(r1)
            r13 = 0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.C1DEK.LLJ
            java.lang.Object r9 = r0.get(r8)
            X.1DEM r9 = (X.C1DEM) r9
        L37:
            boolean r0 = r8.LJJII()
            if (r0 == 0) goto L47
            java.lang.Throwable r0 = r8.LJIIZILJ()
            X.094M r1 = new X.094M
            r1.<init>(r0)
            return r1
        L47:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = X.C1DEK.LLILZIL
            long r11 = r0.getAndIncrement(r8)
            int r2 = X.C1DEN.LIZIZ
            long r0 = (long) r2
            long r0 = r11 / r0
            long r2 = (long) r2
            long r2 = r11 % r2
            int r10 = (int) r2
            long r2 = r9.LLILLL
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 == 0) goto L63
            X.1DEM r0 = r8.LJIIL(r0, r9)
            if (r0 == 0) goto L37
            r9 = r0
        L63:
            java.lang.Object r1 = r8.LJJIL(r9, r10, r11, r13)
            X.09AU r0 = X.C1DEN.LJIIL
            if (r1 == r0) goto La1
            X.09AU r0 = X.C1DEN.LJIILJJIL
            if (r1 != r0) goto L7b
            long r1 = r8.LJJ()
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 >= 0) goto L37
            r9.LIZ()
            goto L37
        L7b:
            X.09AU r0 = X.C1DEN.LJIILIIL
            if (r1 != r0) goto L9d
            r4.LLILLL = r5
            r13 = r8
            r14 = r9
            r15 = r10
            r16 = r11
            r18 = r4
            java.lang.Object r1 = r13.LJJIJIIJI(r14, r15, r16, r18)
            if (r1 != r6) goto L2a
            return r6
        L8f:
            X.1D9B r4 = new X.1D9B
            r4.<init>(r8, r3)
            goto L16
        L95:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L9d:
            r9.LIZ()
            return r1
        La1:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected"
            r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1DEK.LJJIJ(X.1DEK, X.05Vn):java.lang.Object");
    }

    public final boolean LIZLLL(Throwable th, boolean z) {
        boolean z2;
        long j;
        long j2;
        int i;
        Object obj;
        C09AU c09au;
        long j3;
        long j4;
        if (z) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = LLILZ;
            do {
                j4 = atomicLongFieldUpdater.get(this);
                if (((int) (j4 >> 60)) != 0) {
                    break;
                }
                C1DEM<Object> c1dem = C1DEN.LIZ;
            } while (!atomicLongFieldUpdater.compareAndSet(this, j4, (((long) 1) << 60) + (j4 & 1152921504606846975L)));
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LLJIJIL;
        C09AU c09au2 = C1DEN.LJIJ;
        while (true) {
            if (atomicReferenceFieldUpdater.compareAndSet(this, c09au2, th)) {
                z2 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != c09au2) {
                z2 = false;
                break;
            }
        }
        if (z) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = LLILZ;
            do {
                j3 = atomicLongFieldUpdater2.get(this);
                C1DEM<Object> c1dem2 = C1DEN.LIZ;
            } while (!atomicLongFieldUpdater2.compareAndSet(this, j3, (((long) 3) << 60) + (j3 & 1152921504606846975L)));
        } else {
            AtomicLongFieldUpdater atomicLongFieldUpdater3 = LLILZ;
            do {
                j = atomicLongFieldUpdater3.get(this);
                int i2 = (int) (j >> 60);
                if (i2 != 0) {
                    if (i2 != 1) {
                        break;
                    }
                    j2 = j & 1152921504606846975L;
                    C1DEM<Object> c1dem3 = C1DEN.LIZ;
                    i = 3;
                } else {
                    j2 = j & 1152921504606846975L;
                    C1DEM<Object> c1dem4 = C1DEN.LIZ;
                    i = 2;
                }
            } while (!atomicLongFieldUpdater3.compareAndSet(this, j, (((long) i) << 60) + j2));
        }
        LJ();
        LJJIIZ();
        if (z2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = LLJILJIL;
            loop3: while (true) {
                obj = atomicReferenceFieldUpdater2.get(this);
                if (obj == null) {
                    c09au = C1DEN.LJIILLIIL;
                } else {
                    c09au = C1DEN.LJIIZILJ;
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, c09au)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
            }
            if (obj != null) {
                C19719512Dh.LJ(1, obj);
                ((Function1) obj).invoke(LJIIZILJ());
            }
        }
        return z2;
    }

    public final C1DEM<E> LJIIL(long j, C1DEM<E> c1dem) {
        Object objLIZ;
        long j2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LLJ;
        C1DEM<Object> c1dem2 = C1DEN.LIZ;
        C1DEP c1dep = C1DEP.LL;
        loop0: while (true) {
            objLIZ = C1DEO.LIZ(c1dem, j, c1dep);
            if (C2252451DEd.LIZIZ(objLIZ)) {
                break;
            }
            C1DET c1detLIZ = C2252451DEd.LIZ(objLIZ);
            while (true) {
                C1DET c1det = (C1DET) atomicReferenceFieldUpdater.get(this);
                if (c1det.LLILLL >= c1detLIZ.LLILLL) {
                    break loop0;
                }
                if (!c1detLIZ.LJIIIIZZ()) {
                    break;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c1det, c1detLIZ)) {
                    if (atomicReferenceFieldUpdater.get(this) != c1det) {
                        if (c1detLIZ.LJ()) {
                            c1detLIZ.LIZLLL();
                        }
                    }
                }
                if (c1det.LJ()) {
                    c1det.LIZLLL();
                }
            }
        }
        if (C2252451DEd.LIZIZ(objLIZ)) {
            LJ();
            if (c1dem.LLILLL * ((long) C1DEN.LIZIZ) < LJJ()) {
                c1dem.LIZ();
            }
        } else {
            C1DEM<E> c1dem3 = (C1DEM) C2252451DEd.LIZ(objLIZ);
            if (!LJJIIJ() && j <= LJIILLIIL() / ((long) C1DEN.LIZIZ)) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = LLJI;
                while (true) {
                    C1DET c1det2 = (C1DET) atomicReferenceFieldUpdater2.get(this);
                    if (c1det2.LLILLL >= c1dem3.LLILLL || !c1dem3.LJIIIIZZ()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, c1det2, c1dem3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != c1det2) {
                            if (c1dem3.LJ()) {
                                c1dem3.LIZLLL();
                            }
                        }
                    }
                    if (c1det2.LJ()) {
                        c1det2.LIZLLL();
                    }
                }
            }
            long j3 = c1dem3.LLILLL;
            if (j3 <= j) {
                return c1dem3;
            }
            long j4 = j3 * ((long) C1DEN.LIZIZ);
            AtomicLongFieldUpdater atomicLongFieldUpdater = LLILZIL;
            do {
                j2 = atomicLongFieldUpdater.get(this);
                if (j2 >= j4) {
                    break;
                }
            } while (!LLILZIL.compareAndSet(this, j2, j4));
            if (c1dem3.LLILLL * ((long) C1DEN.LIZIZ) < LJJ()) {
                c1dem3.LIZ();
            }
        }
        return null;
    }

    public final C1DEM<E> LJIILL(long j, C1DEM<E> c1dem) {
        Object objLIZ;
        long j2;
        long j3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LLIZLLLIL;
        C1DEM<Object> c1dem2 = C1DEN.LIZ;
        C1DEP c1dep = C1DEP.LL;
        loop0: while (true) {
            objLIZ = C1DEO.LIZ(c1dem, j, c1dep);
            if (C2252451DEd.LIZIZ(objLIZ)) {
                break;
            }
            C1DET c1detLIZ = C2252451DEd.LIZ(objLIZ);
            while (true) {
                C1DET c1det = (C1DET) atomicReferenceFieldUpdater.get(this);
                if (c1det.LLILLL >= c1detLIZ.LLILLL) {
                    break loop0;
                }
                if (!c1detLIZ.LJIIIIZZ()) {
                    break;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c1det, c1detLIZ)) {
                    if (atomicReferenceFieldUpdater.get(this) != c1det) {
                        if (c1detLIZ.LJ()) {
                            c1detLIZ.LIZLLL();
                        }
                    }
                }
                if (c1det.LJ()) {
                    c1det.LIZLLL();
                }
            }
        }
        if (C2252451DEd.LIZIZ(objLIZ)) {
            LJ();
            if (c1dem.LLILLL * ((long) C1DEN.LIZIZ) < LJIJJLI()) {
                c1dem.LIZ();
            }
        } else {
            C1DEM<E> c1dem3 = (C1DEM) C2252451DEd.LIZ(objLIZ);
            long j4 = c1dem3.LLILLL;
            if (j4 <= j) {
                return c1dem3;
            }
            long j5 = j4 * ((long) C1DEN.LIZIZ);
            AtomicLongFieldUpdater atomicLongFieldUpdater = LLILZ;
            do {
                j2 = atomicLongFieldUpdater.get(this);
                j3 = 1152921504606846975L & j2;
                if (j3 >= j5) {
                    break;
                }
                C1DEM<Object> c1dem4 = C1DEN.LIZ;
            } while (!LLILZ.compareAndSet(this, j2, (((long) ((int) (j2 >> 60))) << 60) + j3));
            if (c1dem3.LLILLL * ((long) C1DEN.LIZIZ) < LJIJJLI()) {
                c1dem3.LIZ();
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0175 A[RETURN] */
    @Override // X.AnonymousClass0955
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object LJIJI(E r25, X.InterfaceC1364105Vn<? super kotlin.Unit> r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1DEK.LJIJI(java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00bf, code lost:
    
        r0 = (X.C1DEM) ((X.C1DES) X.C1DES.LLILLJJLI.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJIFFI(long r18, boolean r20) {
        /*
            Method dump skipped, instruction units count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1DEK.LJJIFFI(long, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0010, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIJZLJL(long r8, X.C1DEM<E> r10) {
        /*
            r7 = this;
        L0:
            long r1 = r10.LLILLL
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 >= 0) goto L10
            X.1DES r0 = r10.LIZIZ()
            X.1DET r0 = (X.C1DET) r0
            if (r0 == 0) goto L10
            r10 = r0
            goto L0
        L10:
            boolean r0 = r10.LIZJ()
            if (r0 == 0) goto L20
            X.1DES r0 = r10.LIZIZ()
            X.1DET r0 = (X.C1DET) r0
            if (r0 == 0) goto L20
            r10 = r0
            goto L10
        L20:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = X.C1DEK.LLJI
        L22:
            java.lang.Object r5 = r6.get(r7)
            X.1DET r5 = (X.C1DET) r5
            long r3 = r5.LLILLL
            long r1 = r10.LLILLL
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L57
            boolean r0 = r10.LJIIIIZZ()
            if (r0 != 0) goto L37
            goto L10
        L37:
            boolean r0 = r6.compareAndSet(r7, r5, r10)
            if (r0 == 0) goto L47
            boolean r0 = r5.LJ()
            if (r0 == 0) goto L57
            r5.LIZLLL()
            return
        L47:
            java.lang.Object r0 = r6.get(r7)
            if (r0 == r5) goto L37
            boolean r0 = r10.LJ()
            if (r0 == 0) goto L22
            r10.LIZLLL()
            goto L22
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1DEK.LJJIIJZLJL(long, X.1DEM):void");
    }

    public final Object LJJIIZI(E e, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C2250681D7i c2250681D7iLIZIZ;
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        Function1<E, Unit> function1 = this.LLILLJJLI;
        if (function1 != null && (c2250681D7iLIZIZ = C2250671D7h.LIZIZ(function1, e, null)) != null) {
            C13SZ.LIZ(c2250681D7iLIZIZ, LJIL());
            C098200Yq c098200Yq = new C098200Yq(c2250681D7iLIZIZ);
            C189200o6.m2constructorimpl(c098200Yq);
            c2252611DEt.resumeWith(c098200Yq);
        } else {
            C098200Yq c098200Yq2 = new C098200Yq(LJIL());
            C189200o6.m2constructorimpl(c098200Yq2);
            c2252611DEt.resumeWith(c098200Yq2);
        }
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        if (objLJIJ == C099R.LJFF()) {
            return objLJIJ;
        }
        return Unit.LIZ;
    }

    public final void LJJIJIL(C1DEG c1deg, boolean z) {
        Throwable thLJIL;
        if (!(c1deg instanceof C1DED)) {
            if (c1deg instanceof InterfaceC20236714Gf) {
                InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c1deg;
                if (z) {
                    thLJIL = LJIJJ();
                } else {
                    thLJIL = LJIL();
                }
                C098200Yq c098200Yq = new C098200Yq(thLJIL);
                C189200o6.m2constructorimpl(c098200Yq);
                interfaceC1364105Vn.resumeWith(c098200Yq);
                return;
            }
            if (c1deg instanceof C1DER) {
                C2252611DEt<C094N<? extends E>> c2252611DEt = ((C1DER) c1deg).LL;
                C094N c094n = new C094N(new C094M(LJIIZILJ()));
                C189200o6.m2constructorimpl(c094n);
                c2252611DEt.resumeWith(c094n);
                return;
            }
            if (c1deg instanceof C1DEL) {
                C1DEL c1del = (C1DEL) c1deg;
                C2252611DEt<? super Boolean> c2252611DEt2 = c1del.LLILLJJLI;
                c1del.LLILLJJLI = null;
                c1del.LL = C1DEN.LJIIJJI;
                Throwable thLJIIZILJ = c1del.LLILLL.LJIIZILJ();
                if (thLJIIZILJ == null) {
                    Boolean bool = Boolean.FALSE;
                    C189200o6.m2constructorimpl(bool);
                    c2252611DEt2.resumeWith(bool);
                    return;
                } else {
                    C098200Yq c098200Yq2 = new C098200Yq(thLJIIZILJ);
                    C189200o6.m2constructorimpl(c098200Yq2);
                    c2252611DEt2.resumeWith(c098200Yq2);
                    return;
                }
            }
            if (c1deg instanceof C1DEF) {
                ((C1DEF) c1deg).LJ(this, C1DEN.LJIIJJI);
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Unexpected waiter: ");
            sbLIZ.append(c1deg);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            strLIZIZ.toString();
            throw new IllegalStateException(strLIZIZ);
        }
        c1deg.getClass();
        C189200o6.m2constructorimpl(Boolean.FALSE);
        throw null;
    }

    public final boolean LJJIJL(Object obj, E e) {
        if (obj instanceof C1DEF) {
            return ((C1DEF) obj).LJ(this, e);
        }
        AwS244S0300000_35 awS244S0300000_35 = null;
        if (obj instanceof C1DER) {
            C1DER c1der = (C1DER) obj;
            C2252611DEt<C094N<? extends E>> c2252611DEt = c1der.LL;
            C094N c094n = new C094N(e);
            Function1<E, Unit> function1 = this.LLILLJJLI;
            if (function1 != null) {
                awS244S0300000_35 = new AwS244S0300000_35((Function1) function1, (Function1<Object, Unit>) e, (Object) c1der.LL.LLILZIL, (CoroutineContext) 8);
            }
            return C1DEN.LIZ(c2252611DEt, c094n, awS244S0300000_35);
        }
        if (obj instanceof C1DEL) {
            C1DEL c1del = (C1DEL) obj;
            C2252611DEt<? super Boolean> c2252611DEt2 = c1del.LLILLJJLI;
            c1del.LLILLJJLI = null;
            c1del.LL = e;
            Boolean bool = Boolean.TRUE;
            Function1<E, Unit> function12 = c1del.LLILLL.LLILLJJLI;
            if (function12 != null) {
                awS244S0300000_35 = new AwS244S0300000_35((Function1) function12, (Function1<Object, Unit>) e, (Object) c2252611DEt2.LLILZIL, (CoroutineContext) 8);
            }
            return C1DEN.LIZ(c2252611DEt2, bool, awS244S0300000_35);
        }
        if (obj instanceof InterfaceC20236714Gf) {
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) obj;
            Function1<E, Unit> function13 = this.LLILLJJLI;
            if (function13 != null) {
                awS244S0300000_35 = new AwS244S0300000_35((Function1) function13, (Function1<Object, Unit>) e, (Object) interfaceC20236714Gf.getContext(), (CoroutineContext) 8);
            }
            return C1DEN.LIZ(interfaceC20236714Gf, e, awS244S0300000_35);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Unexpected receiver type: ");
        sbLIZ.append(obj);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalStateException(strLIZIZ);
    }

    public final boolean LJJIJLIJ(Object obj, C1DEM<E> c1dem, int i) {
        EnumC2207021BZk enumC2207021BZk;
        if (obj instanceof InterfaceC20236714Gf) {
            return C1DEN.LIZ((InterfaceC20236714Gf) obj, Unit.LIZ, null);
        }
        if (obj instanceof C1DEF) {
            int iLJIIL = ((C1DE8) obj).LJIIL(this, Unit.LIZ);
            if (iLJIIL != 0) {
                if (iLJIIL != 1) {
                    if (iLJIIL != 2) {
                        if (iLJIIL == 3) {
                            enumC2207021BZk = EnumC2207021BZk.ALREADY_SELECTED;
                        } else {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Unexpected internal result: ");
                            sbLIZ.append(iLJIIL);
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            strLIZIZ.toString();
                            throw new IllegalStateException(strLIZIZ);
                        }
                    } else {
                        enumC2207021BZk = EnumC2207021BZk.CANCELLED;
                    }
                } else {
                    enumC2207021BZk = EnumC2207021BZk.REREGISTER;
                }
            } else {
                enumC2207021BZk = EnumC2207021BZk.SUCCESSFUL;
            }
            if (enumC2207021BZk == EnumC2207021BZk.REREGISTER) {
                c1dem.LJIIL(i, null);
            }
            if (enumC2207021BZk == EnumC2207021BZk.SUCCESSFUL) {
                return true;
            }
            return false;
        }
        if (obj instanceof C1DED) {
            obj.getClass();
            C1DEN.LIZ(null, Boolean.TRUE, null);
            throw null;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Unexpected waiter: ");
        sbLIZ2.append(obj);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        strLIZIZ2.toString();
        throw new IllegalStateException(strLIZIZ2);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIJIIJI(X.C1DEM<E> r10, int r11, long r12, X.InterfaceC1364105Vn<? super X.C094N<? extends E>> r14) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1DEK.LJJIJIIJI(X.1DEM, int, long, X.05Vn):java.lang.Object");
    }

    public final Object LJJIL(C1DEM<E> c1dem, int i, long j, Object obj) {
        Object objLJIIJ = c1dem.LJIIJ(i);
        if (objLJIIJ == null) {
            if (j >= (LLILZ.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return C1DEN.LJIILIIL;
                }
                if (c1dem.LJIIIZ(i, objLJIIJ, obj)) {
                    LJII();
                    return C1DEN.LJIIL;
                }
            }
        } else if (objLJIIJ == C1DEN.LIZLLL && c1dem.LJIIIZ(i, objLJIIJ, C1DEN.LJIIIIZZ)) {
            LJII();
            Object obj2 = c1dem.LLILZLL.get(i * 2);
            c1dem.LJIIL(i, null);
            return obj2;
        }
        while (true) {
            Object objLJIIJ2 = c1dem.LJIIJ(i);
            if (objLJIIJ2 != null && objLJIIJ2 != C1DEN.LJ) {
                if (objLJIIJ2 == C1DEN.LIZLLL) {
                    if (c1dem.LJIIIZ(i, objLJIIJ2, C1DEN.LJIIIIZZ)) {
                        LJII();
                        Object obj3 = c1dem.LLILZLL.get(i * 2);
                        c1dem.LJIIL(i, null);
                        return obj3;
                    }
                } else {
                    C09AU c09au = C1DEN.LJIIIZ;
                    if (objLJIIJ2 == c09au) {
                        return C1DEN.LJIILJJIL;
                    }
                    if (objLJIIJ2 == C1DEN.LJII) {
                        return C1DEN.LJIILJJIL;
                    }
                    if (objLJIIJ2 == C1DEN.LJIIJJI) {
                        LJII();
                        return C1DEN.LJIILJJIL;
                    }
                    if (objLJIIJ2 != C1DEN.LJI && c1dem.LJIIIZ(i, objLJIIJ2, C1DEN.LJFF)) {
                        boolean z = objLJIIJ2 instanceof C1776450wKR;
                        if (z) {
                            objLJIIJ2 = ((C1776450wKR) objLJIIJ2).LIZ;
                        }
                        if (LJJIJLIJ(objLJIIJ2, c1dem, i)) {
                            c1dem.LJIILIIL(i, C1DEN.LJIIIIZZ);
                            LJII();
                            Object obj4 = c1dem.LLILZLL.get(i * 2);
                            c1dem.LJIIL(i, null);
                            return obj4;
                        }
                        c1dem.LJIILIIL(i, c09au);
                        c1dem.LJIIJJI(i, false);
                        if (z) {
                            LJII();
                        }
                        return C1DEN.LJIILJJIL;
                    }
                }
            } else if (j < (LLILZ.get(this) & 1152921504606846975L)) {
                if (c1dem.LJIIIZ(i, objLJIIJ2, C1DEN.LJII)) {
                    LJII();
                    return C1DEN.LJIILJJIL;
                }
            } else {
                if (obj == null) {
                    return C1DEN.LJIILIIL;
                }
                if (c1dem.LJIIIZ(i, objLJIIJ2, obj)) {
                    LJII();
                    return C1DEN.LJIIL;
                }
            }
        }
    }

    public final int LJJIZ(C1DEM<E> c1dem, int i, E e, long j, Object obj, boolean z) {
        c1dem.LJIIL(i, e);
        if (z) {
            return LJJJ(c1dem, i, e, j, obj, z);
        }
        Object objLJIIJ = c1dem.LJIIJ(i);
        if (objLJIIJ == null) {
            if (LIZ(j)) {
                if (c1dem.LJIIIZ(i, null, C1DEN.LIZLLL)) {
                    return 1;
                }
            } else {
                if (obj == null) {
                    return 3;
                }
                if (c1dem.LJIIIZ(i, null, obj)) {
                    return 2;
                }
            }
        } else if (objLJIIJ instanceof C1DEG) {
            c1dem.LJIIL(i, null);
            if (LJJIJL(objLJIIJ, e)) {
                c1dem.LJIILIIL(i, C1DEN.LJIIIIZZ);
                return 0;
            }
            C09AU c09au = C1DEN.LJIIJ;
            if (c1dem.LLILZLL.getAndSet((i * 2) + 1, c09au) != c09au) {
                c1dem.LJIIJJI(i, true);
                return 5;
            }
            return 5;
        }
        return LJJJ(c1dem, i, e, j, obj, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0000 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJJJ(X.C1DEM<E> r9, int r10, E r11, long r12, java.lang.Object r14, boolean r15) {
        /*
            r8 = this;
        L0:
            java.lang.Object r5 = r9.LJIIJ(r10)
            r2 = 1
            r7 = 4
            r3 = 0
            r6 = 0
            if (r5 != 0) goto L35
            boolean r0 = r8.LIZ(r12)
            if (r0 == 0) goto L1b
            if (r15 != 0) goto L29
            X.09AU r0 = X.C1DEN.LIZLLL
            boolean r0 = r9.LJIIIZ(r10, r6, r0)
            if (r0 == 0) goto L0
            return r2
        L1b:
            if (r15 != 0) goto L29
            if (r14 != 0) goto L21
            r0 = 3
            return r0
        L21:
            boolean r0 = r9.LJIIIZ(r10, r6, r14)
            if (r0 == 0) goto L0
            r0 = 2
            return r0
        L29:
            X.09AU r0 = X.C1DEN.LJIIIZ
            boolean r0 = r9.LJIIIZ(r10, r6, r0)
            if (r0 == 0) goto L0
            r9.LJIIJJI(r10, r3)
            return r7
        L35:
            X.09AU r0 = X.C1DEN.LJ
            if (r5 != r0) goto L42
            X.09AU r0 = X.C1DEN.LIZLLL
            boolean r0 = r9.LJIIIZ(r10, r5, r0)
            if (r0 == 0) goto L0
            return r2
        L42:
            X.09AU r4 = X.C1DEN.LJIIJ
            r1 = 5
            if (r5 != r4) goto L4b
            r9.LJIIL(r10, r6)
            return r1
        L4b:
            X.09AU r0 = X.C1DEN.LJII
            if (r5 != r0) goto L53
            r9.LJIIL(r10, r6)
            return r1
        L53:
            X.09AU r0 = X.C1DEN.LJIIJJI
            if (r5 != r0) goto L5e
            r9.LJIIL(r10, r6)
            r8.LJ()
            return r7
        L5e:
            r9.LJIIL(r10, r6)
            boolean r0 = r5 instanceof X.C1776450wKR
            if (r0 == 0) goto L69
            X.0wKR r5 = (X.C1776450wKR) r5
            X.1DEG r5 = r5.LIZ
        L69:
            boolean r0 = r8.LJJIJL(r5, r11)
            if (r0 == 0) goto L75
            X.09AU r0 = X.C1DEN.LJIIIIZZ
            r9.LJIILIIL(r10, r0)
            return r3
        L75:
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r9.LLILZLL
            int r0 = r10 * 2
            int r0 = r0 + 1
            java.lang.Object r0 = r1.getAndSet(r0, r4)
            if (r0 == r4) goto L84
            r9.LJIIJJI(r10, r2)
        L84:
            r3 = 5
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1DEK.LJJJ(X.1DEM, int, java.lang.Object, long, java.lang.Object, boolean):int");
    }
}
