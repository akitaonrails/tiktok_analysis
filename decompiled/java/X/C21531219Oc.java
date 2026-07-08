package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.19Oc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21531219Oc {
    public static boolean LJIILL = false;
    public static int LJIILLIIL = 1000;
    public boolean LIZ;
    public int LIZIZ;
    public final C21531419Oe LIZJ;
    public boolean LJI;
    public int LJIIIZ;
    public final C21532019Ok LJIIJJI;
    public int LJIILIIL;
    public C21531319Od LJIILJJIL;
    public int LIZLLL = 32;
    public int LJ = 32;
    public boolean[] LJII = new boolean[32];
    public int LJIIIIZZ = 1;
    public int LJIIJ = 32;
    public C21531519Of[] LJIIL = new C21531519Of[LJIILLIIL];
    public C21531319Od[] LJFF = new C21531319Od[32];

    public final void LJIIIIZZ() {
        for (int i = 0; i < this.LJIIIZ; i++) {
            C21531319Od c21531319Od = this.LJFF[i];
            c21531319Od.LIZ.LJFF = c21531319Od.LIZIZ;
        }
    }

    public final void LJIJ() {
        for (int i = 0; i < this.LJIIIZ; i++) {
            C21531319Od[] c21531319OdArr = this.LJFF;
            C21531319Od c21531319Od = c21531319OdArr[i];
            if (c21531319Od != null) {
                C21532119Ol c21532119Ol = this.LJIIJJI.LIZ;
                int i2 = c21532119Ol.LIZIZ;
                Object[] objArr = c21532119Ol.LIZ;
                if (i2 < objArr.length) {
                    objArr[i2] = c21531319Od;
                    c21532119Ol.LIZIZ = i2 + 1;
                }
            }
            c21531319OdArr[i] = null;
        }
    }

    public final void LJIJI() {
        C21532019Ok c21532019Ok;
        int i = 0;
        while (true) {
            c21532019Ok = this.LJIIJJI;
            C21531519Of[] c21531519OfArr = c21532019Ok.LIZJ;
            if (i >= c21531519OfArr.length) {
                break;
            }
            C21531519Of c21531519Of = c21531519OfArr[i];
            if (c21531519Of != null) {
                c21531519Of.LIZJ();
            }
            i++;
        }
        C21532119Ol c21532119Ol = c21532019Ok.LIZIZ;
        C21531519Of[] c21531519OfArr2 = this.LJIIL;
        int length = this.LJIILIIL;
        c21532119Ol.getClass();
        if (length > c21531519OfArr2.length) {
            length = c21531519OfArr2.length;
        }
        for (int i2 = 0; i2 < length; i2++) {
            C21531519Of c21531519Of2 = c21531519OfArr2[i2];
            int i3 = c21532119Ol.LIZIZ;
            Object[] objArr = c21532119Ol.LIZ;
            if (i3 < objArr.length) {
                objArr[i3] = c21531519Of2;
                c21532119Ol.LIZIZ = i3 + 1;
            }
        }
        this.LJIILIIL = 0;
        Arrays.fill(this.LJIIJJI.LIZJ, (Object) null);
        this.LIZIZ = 0;
        C21531419Oe c21531419Oe = this.LIZJ;
        c21531419Oe.LJII = 0;
        c21531419Oe.LIZIZ = 0.0f;
        this.LJIIIIZZ = 1;
        for (int i4 = 0; i4 < this.LJIIIZ; i4++) {
        }
        LJIJ();
        this.LJIIIZ = 0;
        this.LJIILJJIL = new C21531319Od(this.LJIIJJI);
    }

    public final C21531319Od LJIIJJI() {
        Object obj;
        C21532019Ok c21532019Ok = this.LJIIJJI;
        C21532119Ol c21532119Ol = c21532019Ok.LIZ;
        int i = c21532119Ol.LIZIZ;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = c21532119Ol.LIZ;
            obj = objArr[i2];
            objArr[i2] = null;
            c21532119Ol.LIZIZ = i2;
        } else {
            obj = null;
        }
        C21531319Od c21531319Od = (C21531319Od) obj;
        if (c21531319Od == null) {
            return new C21531319Od(c21532019Ok);
        }
        c21531319Od.LIZ = null;
        c21531319Od.LIZLLL.clear();
        c21531319Od.LIZIZ = 0.0f;
        c21531319Od.LJ = false;
        return c21531319Od;
    }

    public final C21531519Of LJIIL() {
        if (this.LJIIIIZZ + 1 >= this.LJ) {
            LJIILJJIL();
        }
        C21531519Of c21531519OfLIZ = LIZ(EnumC21531919Oj.SLACK);
        int i = this.LIZIZ + 1;
        this.LIZIZ = i;
        this.LJIIIIZZ++;
        c21531519OfLIZ.LIZJ = i;
        this.LJIIJJI.LIZJ[i] = c21531519OfLIZ;
        return c21531519OfLIZ;
    }

    public final void LJIILJJIL() {
        int i = this.LIZLLL * 2;
        this.LIZLLL = i;
        this.LJFF = (C21531319Od[]) Arrays.copyOf(this.LJFF, i);
        C21532019Ok c21532019Ok = this.LJIIJJI;
        c21532019Ok.LIZJ = (C21531519Of[]) Arrays.copyOf(c21532019Ok.LIZJ, this.LIZLLL);
        int i2 = this.LIZLLL;
        this.LJII = new boolean[i2];
        this.LJ = i2;
        this.LJIIJ = i2;
    }

    public final void LJIILL() {
        if (this.LIZJ.LJ()) {
            LJIIIIZZ();
            return;
        }
        if (!this.LJI) {
            LJIILLIIL(this.LIZJ);
            return;
        }
        for (int i = 0; i < this.LJIIIZ; i++) {
            if (!this.LJFF[i].LJ) {
                LJIILLIIL(this.LIZJ);
                return;
            }
        }
        LJIIIIZZ();
    }

    public C21531219Oc() {
        LJIJ();
        C21532019Ok c21532019Ok = new C21532019Ok();
        this.LJIIJJI = c21532019Ok;
        this.LIZJ = new C21531419Oe(c21532019Ok);
        this.LJIILJJIL = new C21531319Od(c21532019Ok);
    }

    public static int LJIILIIL(C19OG c19og) {
        C21531519Of c21531519Of = c19og.LJIIIIZZ;
        if (c21531519Of != null) {
            return (int) (c21531519Of.LJFF + 0.5f);
        }
        return 0;
    }

    public final C21531519Of LIZ(EnumC21531919Oj enumC21531919Oj) {
        C21532119Ol c21532119Ol = this.LJIIJJI.LIZIZ;
        int i = c21532119Ol.LIZIZ;
        Object obj = null;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = c21532119Ol.LIZ;
            Object obj2 = objArr[i2];
            objArr[i2] = null;
            c21532119Ol.LIZIZ = i2;
            obj = obj2;
        }
        C21531519Of c21531519Of = (C21531519Of) obj;
        if (c21531519Of == null) {
            c21531519Of = new C21531519Of(enumC21531919Oj);
            c21531519Of.LJIIIZ = enumC21531919Oj;
        } else {
            c21531519Of.LIZJ();
            c21531519Of.LJIIIZ = enumC21531919Oj;
        }
        int i3 = this.LJIILIIL;
        int i4 = LJIILLIIL;
        if (i3 >= i4) {
            int i5 = i4 * 2;
            LJIILLIIL = i5;
            this.LJIIL = (C21531519Of[]) Arrays.copyOf(this.LJIIL, i5);
        }
        C21531519Of[] c21531519OfArr = this.LJIIL;
        int i6 = this.LJIILIIL;
        this.LJIILIIL = i6 + 1;
        c21531519OfArr[i6] = c21531519Of;
        return c21531519Of;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01b7 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0162 A[PHI: r6
      0x0162: PHI (r6v3 X.19Of) = (r6v2 X.19Of), (r6v5 X.19Of) binds: [B:78:0x00f4, B:80:0x00f7] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(X.C21531319Od r15) {
        /*
            Method dump skipped, instruction units count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21531219Oc.LIZJ(X.19Od):void");
    }

    public final void LJII(C21531319Od c21531319Od) {
        int i;
        if (c21531319Od.LJ) {
            c21531319Od.LIZ.LIZLLL(this, c21531319Od.LIZIZ);
        } else {
            C21531319Od[] c21531319OdArr = this.LJFF;
            int i2 = this.LJIIIZ;
            c21531319OdArr[i2] = c21531319Od;
            C21531519Of c21531519Of = c21531319Od.LIZ;
            c21531519Of.LIZLLL = i2;
            this.LJIIIZ = i2 + 1;
            c21531519Of.LJ(this, c21531319Od);
        }
        if (this.LIZ) {
            int i3 = 0;
            while (i3 < this.LJIIIZ) {
                if (this.LJFF[i3] == null) {
                    System.out.println("WTF");
                }
                C21531319Od c21531319Od2 = this.LJFF[i3];
                if (c21531319Od2 != null && c21531319Od2.LJ) {
                    c21531319Od2.LIZ.LIZLLL(this, c21531319Od2.LIZIZ);
                    C21532119Ol c21532119Ol = this.LJIIJJI.LIZ;
                    int i4 = c21532119Ol.LIZIZ;
                    Object[] objArr = c21532119Ol.LIZ;
                    if (i4 < objArr.length) {
                        objArr[i4] = c21531319Od2;
                        c21532119Ol.LIZIZ = i4 + 1;
                    }
                    this.LJFF[i3] = null;
                    int i5 = i3 + 1;
                    int i6 = i5;
                    while (true) {
                        i = this.LJIIIZ;
                        if (i5 >= i) {
                            break;
                        }
                        C21531319Od[] c21531319OdArr2 = this.LJFF;
                        int i7 = i5 - 1;
                        C21531319Od c21531319Od3 = c21531319OdArr2[i5];
                        c21531319OdArr2[i7] = c21531319Od3;
                        C21531519Of c21531519Of2 = c21531319Od3.LIZ;
                        if (c21531519Of2.LIZLLL == i5) {
                            c21531519Of2.LIZLLL = i7;
                        }
                        i6 = i5;
                        i5++;
                    }
                    if (i6 < i) {
                        this.LJFF[i6] = null;
                    }
                    this.LJIIIZ = i - 1;
                    i3--;
                }
                i3++;
            }
            this.LIZ = false;
        }
    }

    public final C21531519Of LJIIIZ(int i) {
        if (this.LJIIIIZZ + 1 >= this.LJ) {
            LJIILJJIL();
        }
        C21531519Of c21531519OfLIZ = LIZ(EnumC21531919Oj.ERROR);
        int i2 = this.LIZIZ + 1;
        this.LIZIZ = i2;
        this.LJIIIIZZ++;
        c21531519OfLIZ.LIZJ = i2;
        c21531519OfLIZ.LJ = i;
        this.LJIIJJI.LIZJ[i2] = c21531519OfLIZ;
        C21531419Oe c21531419Oe = this.LIZJ;
        c21531419Oe.LJIIIIZZ.LL = c21531519OfLIZ;
        Arrays.fill(c21531519OfLIZ.LJIIIIZZ, 0.0f);
        c21531519OfLIZ.LJIIIIZZ[c21531519OfLIZ.LJ] = 1.0f;
        c21531419Oe.LJIIIZ(c21531519OfLIZ);
        return c21531519OfLIZ;
    }

    public final C21531519Of LJIIJ(Object obj) {
        C21531519Of c21531519Of = null;
        if (obj == null) {
            return null;
        }
        if (this.LJIIIIZZ + 1 >= this.LJ) {
            LJIILJJIL();
        }
        if (obj instanceof C19OG) {
            C19OG c19og = (C19OG) obj;
            c21531519Of = c19og.LJIIIIZZ;
            if (c21531519Of == null) {
                c19og.LJIIJ();
                c21531519Of = c19og.LJIIIIZZ;
            }
            int i = c21531519Of.LIZJ;
            if (i != -1) {
                if (i > this.LIZIZ || this.LJIIJJI.LIZJ[i] == null) {
                    if (i != -1) {
                        c21531519Of.LIZJ();
                    }
                    int i2 = this.LIZIZ + 1;
                    this.LIZIZ = i2;
                    this.LJIIIIZZ++;
                    c21531519Of.LIZJ = i2;
                    c21531519Of.LJIIIZ = EnumC21531919Oj.UNRESTRICTED;
                    this.LJIIJJI.LIZJ[i2] = c21531519Of;
                }
            } else {
                int i22 = this.LIZIZ + 1;
                this.LIZIZ = i22;
                this.LJIIIIZZ++;
                c21531519Of.LIZJ = i22;
                c21531519Of.LJIIIZ = EnumC21531919Oj.UNRESTRICTED;
                this.LJIIJJI.LIZJ[i22] = c21531519Of;
            }
        }
        return c21531519Of;
    }

    public final void LJIILLIIL(C21531419Oe c21531419Oe) {
        int i = 0;
        while (true) {
            float f = 0.0f;
            if (i >= this.LJIIIZ) {
                break;
            }
            C21531319Od c21531319Od = this.LJFF[i];
            if (c21531319Od.LIZ.LJIIIZ != EnumC21531919Oj.UNRESTRICTED && c21531319Od.LIZIZ < 0.0f) {
                boolean z = false;
                int i2 = 0;
                do {
                    i2++;
                    float f2 = Float.MAX_VALUE;
                    int i3 = -1;
                    int i4 = -1;
                    int i5 = 0;
                    for (int i6 = 0; i6 < this.LJIIIZ; i6++) {
                        C21531319Od c21531319Od2 = this.LJFF[i6];
                        if (c21531319Od2.LIZ.LJIIIZ != EnumC21531919Oj.UNRESTRICTED && !c21531319Od2.LJ && c21531319Od2.LIZIZ < f) {
                            int iLIZJ = c21531319Od2.LIZLLL.LIZJ();
                            int i7 = 0;
                            while (i7 < iLIZJ) {
                                C21531519Of c21531519OfLIZIZ = c21531319Od2.LIZLLL.LIZIZ(i7);
                                float fLJIIIZ = c21531319Od2.LIZLLL.LJIIIZ(c21531519OfLIZIZ);
                                if (fLJIIIZ > f) {
                                    int i8 = 0;
                                    do {
                                        float f3 = c21531519OfLIZIZ.LJII[i8] / fLJIIIZ;
                                        if ((f3 < f2 && i8 == i5) || i8 > i5) {
                                            i4 = c21531519OfLIZIZ.LIZJ;
                                            i5 = i8;
                                            f2 = f3;
                                            i3 = i6;
                                        }
                                        i8++;
                                    } while (i8 < 9);
                                }
                                i7++;
                                f = 0.0f;
                            }
                        }
                    }
                    if (i3 != -1) {
                        C21531319Od c21531319Od3 = this.LJFF[i3];
                        c21531319Od3.LIZ.LIZLLL = -1;
                        c21531319Od3.LJI(this.LJIIJJI.LIZJ[i4]);
                        C21531519Of c21531519Of = c21531319Od3.LIZ;
                        c21531519Of.LIZLLL = i3;
                        c21531519Of.LJ(this, c21531319Od3);
                    } else {
                        z = true;
                    }
                    if (i2 > this.LJIIIIZZ / 2) {
                        break;
                    } else {
                        f = 0.0f;
                    }
                } while (!z);
            } else {
                i++;
            }
        }
        LJIIZILJ(c21531419Oe);
        LJIIIIZZ();
    }

    public final void LJIIZILJ(C21531319Od c21531319Od) {
        for (int i = 0; i < this.LJIIIIZZ; i++) {
            this.LJII[i] = false;
        }
        int i2 = 0;
        while (true) {
            i2++;
            if (i2 >= this.LJIIIIZZ * 2) {
                return;
            }
            C21531519Of c21531519Of = c21531319Od.LIZ;
            if (c21531519Of != null) {
                this.LJII[c21531519Of.LIZJ] = true;
            }
            C21531519Of c21531519OfLIZ = c21531319Od.LIZ(this.LJII);
            if (c21531519OfLIZ != null) {
                boolean[] zArr = this.LJII;
                int i3 = c21531519OfLIZ.LIZJ;
                if (zArr[i3]) {
                    return;
                }
                zArr[i3] = true;
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.LJIIIZ; i5++) {
                    C21531319Od c21531319Od2 = this.LJFF[i5];
                    if (c21531319Od2.LIZ.LJIIIZ != EnumC21531919Oj.UNRESTRICTED && !c21531319Od2.LJ && c21531319Od2.LIZLLL.LJIIIIZZ(c21531519OfLIZ)) {
                        float fLJIIIZ = c21531319Od2.LIZLLL.LJIIIZ(c21531519OfLIZ);
                        if (fLJIIIZ < 0.0f) {
                            float f2 = (-c21531319Od2.LIZIZ) / fLJIIIZ;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    C21531319Od c21531319Od3 = this.LJFF[i4];
                    c21531319Od3.LIZ.LIZLLL = -1;
                    c21531319Od3.LJI(c21531519OfLIZ);
                    C21531519Of c21531519Of2 = c21531319Od3.LIZ;
                    c21531519Of2.LIZLLL = i4;
                    c21531519Of2.LJ(this, c21531319Od3);
                }
            } else {
                return;
            }
        }
    }

    public final void LIZLLL(C21531519Of c21531519Of, int i) {
        int i2 = c21531519Of.LIZLLL;
        if (i2 == -1) {
            c21531519Of.LIZLLL(this, i);
            for (int i3 = 0; i3 < this.LIZIZ + 1; i3++) {
            }
            return;
        }
        if (i2 != -1) {
            C21531319Od c21531319Od = this.LJFF[i2];
            if (c21531319Od.LJ) {
                c21531319Od.LIZIZ = i;
                return;
            }
            if (c21531319Od.LIZLLL.LIZJ() == 0) {
                c21531319Od.LJ = true;
                c21531319Od.LIZIZ = i;
                return;
            }
            C21531319Od c21531319OdLJIIJJI = LJIIJJI();
            if (i < 0) {
                c21531319OdLJIIJJI.LIZIZ = -i;
                c21531319OdLJIIJJI.LIZLLL.LJIIJ(c21531519Of, 1.0f);
            } else {
                c21531319OdLJIIJJI.LIZIZ = i;
                c21531319OdLJIIJJI.LIZLLL.LJIIJ(c21531519Of, -1.0f);
            }
            LIZJ(c21531319OdLJIIJJI);
            return;
        }
        C21531319Od c21531319OdLJIIJJI2 = LJIIJJI();
        c21531319OdLJIIJJI2.LIZ = c21531519Of;
        float f = i;
        c21531519Of.LJFF = f;
        c21531319OdLJIIJJI2.LIZIZ = f;
        c21531319OdLJIIJJI2.LJ = true;
        LIZJ(c21531319OdLJIIJJI2);
    }

    public final void LJ(C21531519Of c21531519Of, C21531519Of c21531519Of2, int i, int i2) {
        if (i2 == 8 && c21531519Of2.LJI && c21531519Of.LIZLLL == -1) {
            c21531519Of.LIZLLL(this, c21531519Of2.LJFF + i);
            return;
        }
        C21531319Od c21531319OdLJIIJJI = LJIIJJI();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            }
            c21531319OdLJIIJJI.LIZIZ = i;
        }
        if (!z) {
            c21531319OdLJIIJJI.LIZLLL.LJIIJ(c21531519Of, -1.0f);
            c21531319OdLJIIJJI.LIZLLL.LJIIJ(c21531519Of2, 1.0f);
        } else {
            c21531319OdLJIIJJI.LIZLLL.LJIIJ(c21531519Of, 1.0f);
            c21531319OdLJIIJJI.LIZLLL.LJIIJ(c21531519Of2, -1.0f);
        }
        if (i2 != 8) {
            c21531319OdLJIIJJI.LIZIZ(this, i2);
        }
        LIZJ(c21531319OdLJIIJJI);
    }

    public final void LJFF(C21531519Of c21531519Of, C21531519Of c21531519Of2, int i, int i2) {
        C21531319Od c21531319OdLJIIJJI = LJIIJJI();
        C21531519Of c21531519OfLJIIL = LJIIL();
        c21531519OfLJIIL.LJ = 0;
        c21531319OdLJIIJJI.LIZJ(c21531519Of, c21531519Of2, c21531519OfLJIIL, i);
        if (i2 != 8) {
            c21531319OdLJIIJJI.LIZLLL.LJIIJ(LJIIIZ(i2), (int) (c21531319OdLJIIJJI.LIZLLL.LJIIIZ(c21531519OfLJIIL) * (-1.0f)));
        }
        LIZJ(c21531319OdLJIIJJI);
    }

    public final void LJI(C21531519Of c21531519Of, C21531519Of c21531519Of2, int i, int i2) {
        C21531319Od c21531319OdLJIIJJI = LJIIJJI();
        C21531519Of c21531519OfLJIIL = LJIIL();
        c21531519OfLJIIL.LJ = 0;
        c21531319OdLJIIJJI.LIZLLL(c21531519Of, c21531519Of2, c21531519OfLJIIL, i);
        if (i2 != 8) {
            c21531319OdLJIIJJI.LIZLLL.LJIIJ(LJIIIZ(i2), (int) (c21531319OdLJIIJJI.LIZLLL.LJIIIZ(c21531519OfLJIIL) * (-1.0f)));
        }
        LIZJ(c21531319OdLJIIJJI);
    }

    public final void LIZIZ(C21531519Of c21531519Of, C21531519Of c21531519Of2, int i, float f, C21531519Of c21531519Of3, C21531519Of c21531519Of4, int i2, int i3) {
        C21531319Od c21531319OdLJIIJJI = LJIIJJI();
        if (c21531519Of2 == c21531519Of3) {
            c21531319OdLJIIJJI.LIZLLL.LJIIJ(c21531519Of, 1.0f);
            c21531319OdLJIIJJI.LIZLLL.LJIIJ(c21531519Of4, 1.0f);
            c21531319OdLJIIJJI.LIZLLL.LJIIJ(c21531519Of2, -2.0f);
        } else if (f == 0.5f) {
            c21531319OdLJIIJJI.LIZLLL.LJIIJ(c21531519Of, 1.0f);
            c21531319OdLJIIJJI.LIZLLL.LJIIJ(c21531519Of2, -1.0f);
            c21531319OdLJIIJJI.LIZLLL.LJIIJ(c21531519Of3, -1.0f);
            c21531319OdLJIIJJI.LIZLLL.LJIIJ(c21531519Of4, 1.0f);
            if (i > 0 || i2 > 0) {
                c21531319OdLJIIJJI.LIZIZ = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            c21531319OdLJIIJJI.LIZLLL.LJIIJ(c21531519Of, -1.0f);
            c21531319OdLJIIJJI.LIZLLL.LJIIJ(c21531519Of2, 1.0f);
            c21531319OdLJIIJJI.LIZIZ = i;
        } else if (f >= 1.0f) {
            c21531319OdLJIIJJI.LIZLLL.LJIIJ(c21531519Of4, -1.0f);
            c21531319OdLJIIJJI.LIZLLL.LJIIJ(c21531519Of3, 1.0f);
            c21531319OdLJIIJJI.LIZIZ = -i2;
        } else {
            float f2 = 1.0f - f;
            c21531319OdLJIIJJI.LIZLLL.LJIIJ(c21531519Of, f2 * 1.0f);
            c21531319OdLJIIJJI.LIZLLL.LJIIJ(c21531519Of2, f2 * (-1.0f));
            c21531319OdLJIIJJI.LIZLLL.LJIIJ(c21531519Of3, (-1.0f) * f);
            c21531319OdLJIIJJI.LIZLLL.LJIIJ(c21531519Of4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                c21531319OdLJIIJJI.LIZIZ = ((-i) * f2) + (i2 * f);
            }
        }
        if (i3 != 8) {
            c21531319OdLJIIJJI.LIZIZ(this, i3);
        }
        LIZJ(c21531319OdLJIIJJI);
    }
}
