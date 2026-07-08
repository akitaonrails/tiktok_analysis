package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13YF, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public class C13YF extends C13YG {
    public static final int[] LJIILJJIL = new int[0];
    public final Function1<Object, Unit> LJFF;
    public final Function1<Object, Unit> LJI;
    public int LJII;
    public C19994113Kx<C13YP> LJIIIIZZ;
    public List<? extends C13YP> LJIIIZ;
    public C13BZ LJIIJ;
    public int[] LJIIJJI;
    public int LJIIL;
    public boolean LJIILIIL;

    @Override // X.C13YG
    public boolean LJFF() {
        return false;
    }

    @Override // X.C13YG
    public final void LIZIZ() {
        C13YE.LIZLLL = C13YE.LIZLLL.LJ(LJI()).LIZJ(this.LJIIJ);
    }

    @Override // X.C13YG
    public void LIZJ() {
        if (this.LIZJ) {
            return;
        }
        super.LIZJ();
        LJIIJJI();
    }

    @Override // X.C13YG
    public void LJIIJ() {
        this.LJIIL++;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    @Override // X.C13YG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJIIJJI() {
        /*
            r17 = this;
            r9 = r17
            int r0 = r9.LJIIL
            if (r0 > 0) goto Lb
            java.lang.String r0 = "no pending nested snapshots"
            X.C13D4.LIZ(r0)
        Lb:
            int r0 = r9.LJIIL
            int r0 = r0 + (-1)
            r9.LJIIL = r0
            if (r0 != 0) goto L95
            boolean r0 = r9.LJIILIIL
            if (r0 != 0) goto L95
            X.13Kx r1 = r9.LJJ()
            if (r1 == 0) goto L92
            boolean r0 = r9.LJIILIIL
            r0 = r0 ^ 1
            if (r0 != 0) goto L28
            java.lang.String r0 = "Unsupported operation on a snapshot that has been applied"
            X.C13D4.LIZIZ(r0)
        L28:
            r0 = 0
            r9.LJJIIJ(r0)
            long r15 = r9.LJI()
            java.lang.Object[] r10 = r1.LIZIZ
            long[] r8 = r1.LIZ
            int r0 = r8.length
            int r7 = r0 + (-2)
            if (r7 < 0) goto L92
            r6 = 0
        L3a:
            r4 = r8[r6]
            long r0 = ~r4
            r2 = 7
            long r0 = r0 << r2
            long r0 = r0 & r4
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r11
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 == 0) goto L8d
            int r0 = r6 - r7
            int r0 = ~r0
            int r0 = r0 >>> 31
            r12 = 8
            int r11 = 8 - r0
            r3 = 0
        L54:
            if (r3 >= r11) goto L8b
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r4
            r1 = 128(0x80, double:6.3E-322)
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 >= 0) goto L87
            int r0 = r6 << 3
            int r0 = r0 + r3
            r0 = r10[r0]
            X.13YP r0 = (X.C13YP) r0
            X.13Ej r2 = r0.LJIIZILJ()
        L6a:
            if (r2 == 0) goto L87
            long r0 = r2.LIZ
            int r13 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r13 == 0) goto L7e
            X.13BZ r13 = r9.LJIIJ
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            boolean r0 = X.C13LP.LJJJJ(r0, r13)
            if (r0 == 0) goto L84
        L7e:
            X.13YC r0 = X.C13YE.LIZ
            r0 = 0
            r2.LIZ = r0
        L84:
            X.13Ej r2 = r2.LIZIZ
            goto L6a
        L87:
            long r4 = r4 >> r12
            int r3 = r3 + 1
            goto L54
        L8b:
            if (r11 != r12) goto L92
        L8d:
            if (r6 == r7) goto L92
            int r6 = r6 + 1
            goto L3a
        L92:
            r9.LIZ()
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13YF.LJIIJJI():void");
    }

    @Override // X.C13YG
    public void LJIIL() {
        if (this.LJIILIIL || this.LIZJ) {
            return;
        }
        LJIJJLI();
    }

    @Override // X.C13YG
    public final void LJIILL() {
        int length = this.LJIIJJI.length;
        for (int i = 0; i < length; i++) {
            C13YE.LJIJJ(this.LJIIJJI[i]);
        }
        LJIILJJIL();
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.C13YQ LJIL() {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13YF.LJIL():X.13YQ");
    }

    public final void LJIJJLI() {
        LJJII(LJI());
        if (this.LJIILIIL || this.LIZJ) {
            return;
        }
        long jLJI = LJI();
        synchronized (C13YE.LIZJ) {
            try {
                long j = C13YE.LJ;
                C13YE.LJ = j + 1;
                LJIJ(j);
                C13YE.LIZLLL = C13YE.LIZLLL.LJIIIZ(LJI());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        LJIIZILJ(C13YE.LIZLLL(jLJI + 1, LJI(), LIZLLL()));
    }

    @Override // X.C13YG
    public int LJII() {
        return this.LJII;
    }

    @Override // X.C13YG
    public Function1<Object, Unit> LJIIIIZZ() {
        return this.LJI;
    }

    public C19994113Kx<C13YP> LJJ() {
        return this.LJIIIIZZ;
    }

    @Override // X.C13YG
    /* JADX INFO: renamed from: LJJI, reason: merged with bridge method [inline-methods] */
    public Function1<Object, Unit> LJ() {
        return this.LJFF;
    }

    @Override // X.C13YG
    public void LJIILIIL(C13YP c13yp) {
        C19994113Kx<C13YP> c19994113KxLJJ = LJJ();
        if (c19994113KxLJJ == null) {
            c19994113KxLJJ = C13X4.LIZ();
            LJJIIJ(c19994113KxLJJ);
        }
        c19994113KxLJJ.LIZLLL(c13yp);
    }

    @Override // X.C13YG
    public void LJIJI(int i) {
        this.LJII = i;
    }

    @Override // X.C13YG
    public C13YG LJIJJ(Function1<Object, Unit> function1) {
        C13YL c13yl;
        if (!(!this.LIZJ)) {
            C13D4.LIZ("Cannot use a disposed snapshot");
        }
        if (this.LJIILIIL && this.LIZLLL < 0) {
            C13D4.LIZIZ("Unsupported operation on a disposed or applied snapshot");
        }
        long jLJI = LJI();
        LJJII(LJI());
        Object obj = C13YE.LIZJ;
        synchronized (obj) {
            try {
                long j = C13YE.LJ;
                C13YE.LJ = j + 1;
                C13YE.LIZLLL = C13YE.LIZLLL.LJIIIZ(j);
                c13yl = new C13YL(j, C13YE.LIZLLL(jLJI + 1, j, LIZLLL()), C13YE.LJIIJ(function1, LJ(), true), this);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (!this.LJIILIIL && !this.LIZJ) {
            long jLJI2 = LJI();
            synchronized (obj) {
                try {
                    long j2 = C13YE.LJ;
                    C13YE.LJ = j2 + 1;
                    LJIJ(j2);
                    C13YE.LIZLLL = C13YE.LIZLLL.LJIIIZ(LJI());
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
            LJIIZILJ(C13YE.LIZLLL(jLJI2 + 1, LJI(), LIZLLL()));
        }
        return c13yl;
    }

    public final void LJJII(long j) {
        synchronized (C13YE.LIZJ) {
            try {
                this.LJIIJ = this.LJIIJ.LJIIIZ(j);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJJIII(C13BZ c13bz) {
        synchronized (C13YE.LIZJ) {
            try {
                this.LJIIJ = this.LJIIJ.LJIIIIZZ(c13bz);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void LJJIIJ(C19994113Kx<C13YP> c19994113Kx) {
        this.LJIIIIZZ = c19994113Kx;
    }

    public C13YF LJJIIJZLJL(Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
        C13YF c13yf;
        if (!(!this.LIZJ)) {
            C13D4.LIZ("Cannot use a disposed snapshot");
        }
        if (this.LJIILIIL && this.LIZLLL < 0) {
            C13D4.LIZIZ("Unsupported operation on a disposed or applied snapshot");
        }
        LJJII(LJI());
        Object obj = C13YE.LIZJ;
        synchronized (obj) {
            try {
                final long j = C13YE.LJ;
                C13YE.LJ = j + 1;
                C13YE.LIZLLL = C13YE.LIZLLL.LJIIIZ(j);
                C13BZ c13bzLIZLLL = LIZLLL();
                LJIIZILJ(c13bzLIZLLL.LJIIIZ(j));
                final C13BZ c13bzLIZLLL2 = C13YE.LIZLLL(LJI() + 1, j, c13bzLIZLLL);
                final Function1<Object, Unit> function1LJIIJ = C13YE.LJIIJ(function1, LJ(), true);
                final Function1 function1LIZ = C13YE.LIZ(function12, LJIIIIZZ());
                c13yf = new C13YF(j, c13bzLIZLLL2, function1LJIIJ, function1LIZ, this) { // from class: X.13YH
                    public final C13YF LJIILL;
                    public boolean LJIILLIIL;

                    @Override // X.C13YF
                    public final C13YQ LJIL() {
                        C13YF c13yf2 = this.LJIILL;
                        if (c13yf2.LJIILIIL || c13yf2.LIZJ) {
                            return new C13YR();
                        }
                        C19994113Kx<C13YP> c19994113Kx = this.LJIIIIZZ;
                        long j2 = this.LIZIZ;
                        Map<AbstractC19977113Ej, ? extends AbstractC19977113Ej> mapLIZIZ = c19994113Kx != null ? C13YE.LIZIZ(c13yf2.LJI(), this, this.LJIILL.LIZLLL()) : null;
                        synchronized (C13YE.LIZJ) {
                            try {
                                C13YE.LIZJ(this);
                                if (c19994113Kx == null || c19994113Kx.LIZLLL == 0) {
                                    LIZ();
                                } else {
                                    C13YQ c13yqLJJIFFI = LJJIFFI(this.LJIILL.LJI(), c19994113Kx, mapLIZIZ, this.LJIILL.LIZLLL());
                                    if (!Intrinsics.LJFF(c13yqLJJIFFI, C13YS.LIZ)) {
                                        return c13yqLJJIFFI;
                                    }
                                    C19994113Kx<C13YP> c19994113KxLJJ = this.LJIILL.LJJ();
                                    if (c19994113KxLJJ != null) {
                                        c19994113KxLJJ.LJIIIZ(c19994113Kx);
                                    } else {
                                        this.LJIILL.LJJIIJ(c19994113Kx);
                                        this.LJIIIIZZ = null;
                                    }
                                }
                                if (this.LJIILL.LJI() < j2) {
                                    this.LJIILL.LJIJJLI();
                                }
                                C13YF c13yf3 = this.LJIILL;
                                c13yf3.LJIIZILJ(c13yf3.LIZLLL().LJ(j2).LIZJ(this.LJIIJ));
                                this.LJIILL.LJJII(j2);
                                C13YF c13yf4 = this.LJIILL;
                                int i = this.LIZLLL;
                                this.LIZLLL = -1;
                                if (i >= 0) {
                                    int[] iArr = c13yf4.LJIIJJI;
                                    int length = iArr.length;
                                    int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                                    iArrCopyOf[length] = i;
                                    c13yf4.LJIIJJI = iArrCopyOf;
                                } else {
                                    c13yf4.getClass();
                                }
                                this.LJIILL.LJJIII(this.LJIIJ);
                                C13YF c13yf5 = this.LJIILL;
                                int[] iArr2 = this.LJIIJJI;
                                c13yf5.getClass();
                                if (iArr2.length != 0) {
                                    int[] iArr3 = c13yf5.LJIIJJI;
                                    if (iArr3.length != 0) {
                                        int length2 = iArr3.length;
                                        int length3 = iArr2.length;
                                        int[] iArrCopyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                                        System.arraycopy(iArr2, 0, iArrCopyOf2, length2, length3);
                                        iArr2 = iArrCopyOf2;
                                    }
                                    c13yf5.LJIIJJI = iArr2;
                                }
                                this.LJIILIIL = true;
                                if (!this.LJIILLIIL) {
                                    this.LJIILLIIL = true;
                                    this.LJIILL.LJIIJJI();
                                }
                                return C13YS.LIZ;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                    }

                    @Override // X.C13YF, X.C13YG
                    public final void LIZJ() {
                        if (this.LIZJ) {
                            return;
                        }
                        super.LIZJ();
                        if (this.LJIILLIIL) {
                            return;
                        }
                        this.LJIILLIIL = true;
                        this.LJIILL.LJIIJJI();
                    }

                    {
                        this.LJIILL = this;
                        this.LJIIJ();
                    }
                };
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (!this.LJIILIIL && !this.LIZJ) {
            long jLJI = LJI();
            synchronized (obj) {
                try {
                    long j2 = C13YE.LJ;
                    C13YE.LJ = j2 + 1;
                    LJIJ(j2);
                    C13YE.LIZLLL = C13YE.LIZLLL.LJIIIZ(LJI());
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
            LJIIZILJ(C13YE.LIZLLL(jLJI + 1, LJI(), LIZLLL()));
        }
        return c13yf;
    }

    public C13YF(long j, C13BZ c13bz, Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
        super(j, c13bz);
        this.LJFF = function1;
        this.LJI = function12;
        this.LJIIJ = C13BZ.LLILZIL;
        this.LJIIJJI = LJIILJJIL;
        this.LJIIL = 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010d A[PHI: r4 r5
      0x010d: PHI (r4v2 java.util.ArrayList) = (r4v17 java.util.ArrayList), (r4v18 java.util.ArrayList) binds: [B:6:0x003a, B:48:0x010b] A[DONT_GENERATE, DONT_INLINE]
      0x010d: PHI (r5v2 java.util.ArrayList) = (r5v1 java.util.ArrayList), (r5v4 java.util.ArrayList) binds: [B:6:0x003a, B:48:0x010b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C13YQ LJJIFFI(long r25, X.C19994113Kx<X.C13YP> r27, java.util.Map<X.AbstractC19977113Ej, ? extends X.AbstractC19977113Ej> r28, X.C13BZ r29) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13YF.LJJIFFI(long, X.13Kx, java.util.Map, X.13BZ):X.13YQ");
    }
}
