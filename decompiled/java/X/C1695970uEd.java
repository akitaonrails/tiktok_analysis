package X;

import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0uEd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1695970uEd {
    public final InterfaceC1695980uEe LIZ;
    public Outline LJFF;
    public float LJIIIZ;
    public AbstractC1680810tqB LJIIJ;
    public InterfaceC1680960tqQ LJIIJJI;
    public C1695950uEb LJIIL;
    public boolean LJIILIIL;
    public C1695140uDI LJIILJJIL;
    public C1695150uDJ LJIILL;
    public int LJIILLIIL;
    public boolean LJIJ;
    public long LJIJI;
    public long LJIJJ;
    public long LJIJJLI;
    public boolean LJIL;
    public RectF LJJ;
    public InterfaceC1690500u5o LIZIZ = C1680440tpa.LIZ;
    public EnumC1671200tag LIZJ = EnumC1671200tag.Ltr;
    public Function1<? super InterfaceC1675870tiD, Unit> LIZLLL = AFwS266S0000000_25.get$arr$(0);
    public final AwS604S0100000_25 LJ = new AwS604S0100000_25(this, 4);
    public boolean LJI = true;
    public long LJII = 0;
    public long LJIIIIZZ = 9205357640488583168L;
    public final C1696020uEi LJIIZILJ = new C1696020uEi();

    public final void LJFF() {
        this.LJIIJ = null;
        this.LJIIJJI = null;
        this.LJIIIIZZ = 9205357640488583168L;
        this.LJII = 0L;
        this.LJIIIZ = 0.0f;
        this.LJI = true;
        this.LJIILIIL = false;
    }

    static {
        if (C1696080uEo.LIZ) {
            return;
        }
        int i = Build.VERSION.SDK_INT;
    }

    public final void LIZ() {
        Outline outline;
        if (this.LJI) {
            Outline outline2 = null;
            if (this.LJIL || this.LIZ.LJJI() > 0.0f) {
                InterfaceC1680960tqQ interfaceC1680960tqQ = this.LJIIJJI;
                if (interfaceC1680960tqQ != null) {
                    RectF rectF = this.LJJ;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.LJJ = rectF;
                    }
                    if (!(interfaceC1680960tqQ instanceof C1695950uEb)) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    C1695950uEb c1695950uEb = (C1695950uEb) interfaceC1680960tqQ;
                    c1695950uEb.LIZIZ.computeBounds(rectF, false);
                    int i = Build.VERSION.SDK_INT;
                    if (i > 28 || interfaceC1680960tqQ.LIZLLL()) {
                        outline = this.LJFF;
                        if (outline == null) {
                            outline = new Outline();
                            this.LJFF = outline;
                        }
                        if (i >= 30) {
                            outline.setPath(c1695950uEb.LIZIZ);
                        } else {
                            outline.setConvexPath(c1695950uEb.LIZIZ);
                        }
                        this.LJIILIIL = true ^ outline.canClip();
                    } else {
                        Outline outline3 = this.LJFF;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.LJIILIIL = true;
                        this.LIZ.LJJIIZI();
                        outline = null;
                    }
                    this.LJIIJJI = interfaceC1680960tqQ;
                    if (outline != null) {
                        outline.setAlpha(this.LIZ.LIZ());
                        outline2 = outline;
                    }
                    this.LIZ.LJIJJLI(outline2, (4294967295L & ((long) Math.round(rectF.height()))) | (((long) Math.round(rectF.width())) << 32));
                    if (this.LJIILIIL && this.LJIL) {
                        this.LIZ.LJIILIIL(false);
                        this.LIZ.LJIILL();
                    } else {
                        this.LIZ.LJIILIIL(this.LJIL);
                    }
                } else {
                    this.LIZ.LJIILIIL(this.LJIL);
                    Outline outline4 = this.LJFF;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.LJFF = outline4;
                    }
                    long jLIZIZ = C1296570jqR.LIZIZ(this.LJIJJ);
                    long j = this.LJII;
                    long j2 = this.LJIIIIZZ;
                    if (j2 != 9205357640488583168L) {
                        jLIZIZ = j2;
                    }
                    int i2 = (int) (j >> 32);
                    int i3 = (int) (j & 4294967295L);
                    int i4 = (int) (jLIZIZ >> 32);
                    int i5 = (int) (jLIZIZ & 4294967295L);
                    outline4.setRoundRect(Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i3)), Math.round(Float.intBitsToFloat(i2) + Float.intBitsToFloat(i4)), Math.round(Float.intBitsToFloat(i3) + Float.intBitsToFloat(i5)), this.LJIIIZ);
                    outline4.setAlpha(this.LIZ.LIZ());
                    this.LIZ.LJIJJLI(outline4, (((long) Math.round(Float.intBitsToFloat(i5))) & 4294967295L) | (((long) Math.round(Float.intBitsToFloat(i4))) << 32));
                }
            } else {
                this.LIZ.LJIILIIL(false);
                this.LIZ.LJIJJLI(null, 0L);
            }
        }
        this.LJI = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            r17 = this;
            r10 = r17
            boolean r0 = r10.LJIJ
            if (r0 == 0) goto L72
            int r0 = r10.LJIILLIIL
            if (r0 != 0) goto L72
            X.0uEi r2 = r10.LJIIZILJ
            X.0uEd r1 = r2.LIZ
            if (r1 == 0) goto L1c
            int r0 = r1.LJIILLIIL
            int r0 = r0 + (-1)
            r1.LJIILLIIL = r0
            r1.LIZIZ()
            r0 = 0
            r2.LIZ = r0
        L1c:
            X.13Kx<X.0uEd> r9 = r2.LIZJ
            if (r9 == 0) goto L6d
            java.lang.Object[] r8 = r9.LIZIZ
            long[] r7 = r9.LIZ
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto L6a
            r5 = 0
        L2a:
            r2 = r7[r5]
            long r0 = ~r2
            r4 = 7
            long r0 = r0 << r4
            long r0 = r0 & r2
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r11
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r4 == 0) goto L65
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r12 = 8
            int r11 = 8 - r0
            r4 = 0
        L44:
            if (r4 >= r11) goto L63
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r2
            r13 = 128(0x80, double:6.3E-322)
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 >= 0) goto L5f
            int r0 = r5 << 3
            int r0 = r0 + r4
            r1 = r8[r0]
            X.0uEd r1 = (X.C1695970uEd) r1
            int r0 = r1.LJIILLIIL
            int r0 = r0 + (-1)
            r1.LJIILLIIL = r0
            r1.LIZIZ()
        L5f:
            long r2 = r2 >> r12
            int r4 = r4 + 1
            goto L44
        L63:
            if (r11 != r12) goto L6a
        L65:
            if (r5 == r6) goto L6a
            int r5 = r5 + 1
            goto L2a
        L6a:
            r9.LJ()
        L6d:
            X.0uEe r0 = r10.LIZ
            r0.LJIILL()
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1695970uEd.LIZIZ():void");
    }

    public final AbstractC1680810tqB LIZLLL() {
        AbstractC1680810tqB c1680780tq8;
        AbstractC1680810tqB abstractC1680810tqB = this.LJIIJ;
        InterfaceC1680960tqQ interfaceC1680960tqQ = this.LJIIJJI;
        if (abstractC1680810tqB != null) {
            return abstractC1680810tqB;
        }
        if (interfaceC1680960tqQ != null) {
            C1680800tqA c1680800tqA = new C1680800tqA(interfaceC1680960tqQ);
            this.LJIIJ = c1680800tqA;
            return c1680800tqA;
        }
        long jLIZIZ = C1296570jqR.LIZIZ(this.LJIJJ);
        long j = this.LJII;
        long j2 = this.LJIIIIZZ;
        if (j2 != 9205357640488583168L) {
            jLIZIZ = j2;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jLIZIZ >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = fIntBitsToFloat2 + Float.intBitsToFloat((int) (jLIZIZ & 4294967295L));
        float f = this.LJIIIZ;
        if (f > 0.0f) {
            c1680780tq8 = new C1680730tq3(C1680750tq5.LIZ(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (((long) Float.floatToRawIntBits(f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f)))));
        } else {
            c1680780tq8 = new C1680780tq8(new C1683130ttv(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.LJIIJ = c1680780tq8;
        return c1680780tq8;
    }

    public C1695970uEd(InterfaceC1695980uEe interfaceC1695980uEe) {
        this.LIZ = interfaceC1695980uEe;
        interfaceC1695980uEe.LJIILIIL(false);
        this.LJIJI = 0L;
        this.LJIJJ = 0L;
        this.LJIJJLI = 9205357640488583168L;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(X.InterfaceC1675870tiD r17) {
        /*
            r16 = this;
            r3 = r16
            X.0uEi r2 = r3.LJIIZILJ
            X.0uEd r0 = r2.LIZ
            r2.LIZIZ = r0
            X.13Kx<X.0uEd> r1 = r2.LIZJ
            if (r1 == 0) goto L22
            boolean r0 = r1.LIZJ()
            if (r0 == 0) goto L22
            X.13Kx<X.0uEd> r0 = r2.LIZLLL
            if (r0 != 0) goto L1c
            X.13Kx r0 = X.C13X4.LIZ()
            r2.LIZLLL = r0
        L1c:
            r0.LJIIIZ(r1)
            r1.LJ()
        L22:
            r0 = 1
            r2.LJ = r0
            kotlin.jvm.functions.Function1<? super X.0tiD, kotlin.Unit> r0 = r3.LIZLLL
            r1 = r17
            r0.invoke(r1)
            r0 = 0
            r2.LJ = r0
            X.0uEd r1 = r2.LIZIZ
            if (r1 == 0) goto L3c
            int r0 = r1.LJIILLIIL
            int r0 = r0 + (-1)
            r1.LJIILLIIL = r0
            r1.LIZIZ()
        L3c:
            X.13Kx<X.0uEd> r10 = r2.LIZLLL
            if (r10 == 0) goto L93
            boolean r0 = r10.LIZJ()
            if (r0 == 0) goto L93
            java.lang.Object[] r9 = r10.LIZIZ
            long[] r8 = r10.LIZ
            int r0 = r8.length
            int r7 = r0 + (-2)
            if (r7 < 0) goto L90
            r6 = 0
        L50:
            r2 = r8[r6]
            long r0 = ~r2
            r4 = 7
            long r0 = r0 << r4
            long r0 = r0 & r2
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r11
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r4 == 0) goto L8b
            int r0 = r6 - r7
            int r0 = ~r0
            int r0 = r0 >>> 31
            r11 = 8
            int r5 = 8 - r0
            r4 = 0
        L6a:
            if (r4 >= r5) goto L89
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r2
            r12 = 128(0x80, double:6.3E-322)
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 >= 0) goto L85
            int r0 = r6 << 3
            int r0 = r0 + r4
            r1 = r9[r0]
            X.0uEd r1 = (X.C1695970uEd) r1
            int r0 = r1.LJIILLIIL
            int r0 = r0 + (-1)
            r1.LJIILLIIL = r0
            r1.LIZIZ()
        L85:
            long r2 = r2 >> r11
            int r4 = r4 + 1
            goto L6a
        L89:
            if (r5 != r11) goto L90
        L8b:
            if (r6 == r7) goto L90
            int r6 = r6 + 1
            goto L50
        L90:
            r10.LJ()
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1695970uEd.LIZJ(X.0tiD):void");
    }

    public final void LJI(float f) {
        if (this.LIZ.LIZ() != f) {
            this.LIZ.setAlpha(f);
        }
    }

    public final void LJII(float f, long j, long j2) {
        if (!C1378605aS.LIZJ(this.LJII, j) || !C1680770tq7.LIZ(this.LJIIIIZZ, j2) || this.LJIIIZ != f || this.LJIIJJI != null) {
            LJFF();
            this.LJII = j;
            this.LJIIIIZZ = j2;
            this.LJIIIZ = f;
            LIZ();
        }
    }

    public final void LJ(InterfaceC1690500u5o interfaceC1690500u5o, EnumC1671200tag enumC1671200tag, long j, Function1<? super InterfaceC1675870tiD, Unit> function1) {
        if (!C1682900ttY.LIZIZ(this.LJIJJ, j)) {
            this.LJIJJ = j;
            long j2 = this.LJIJI;
            this.LIZ.LJJIZ((int) (j2 >> 32), C1676820tjk.LIZJ(j2), j);
            if (this.LJIIIIZZ == 9205357640488583168L) {
                this.LJI = true;
                LIZ();
            }
        }
        this.LIZIZ = interfaceC1690500u5o;
        this.LIZJ = enumC1671200tag;
        this.LIZLLL = function1;
        this.LIZ.LJJIIZI();
        this.LIZ.LJJIJIIJI(this.LIZIZ, this.LIZJ, this, this.LJ);
    }
}
