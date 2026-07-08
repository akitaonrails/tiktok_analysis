package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.19Qh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21536919Qh {
    public static boolean LJIILL = false;
    public static int LJIILLIIL = 1000;
    public boolean LIZ;
    public int LIZIZ;
    public final C21536619Qe LIZJ;
    public boolean LJI;
    public int LJIIIZ;
    public final C21537219Qk LJIIJJI;
    public int LJIILIIL;
    public C21536819Qg LJIILJJIL;
    public int LIZLLL = 32;
    public int LJ = 32;
    public boolean[] LJII = new boolean[32];
    public int LJIIIIZZ = 1;
    public int LJIIJ = 32;
    public C21537019Qi[] LJIIL = new C21537019Qi[LJIILLIIL];
    public C21536819Qg[] LJFF = new C21536819Qg[32];

    public final void LJIIIIZZ() {
        for (int i = 0; i < this.LJIIIZ; i++) {
            C21536819Qg c21536819Qg = this.LJFF[i];
            c21536819Qg.LIZ.LLILZIL = c21536819Qg.LIZIZ;
        }
    }

    public final void LJIJ() {
        for (int i = 0; i < this.LJIIIZ; i++) {
            C21536819Qg[] c21536819QgArr = this.LJFF;
            C21536819Qg c21536819Qg = c21536819QgArr[i];
            if (c21536819Qg != null) {
                C21537319Ql c21537319Ql = this.LJIIJJI.LIZ;
                int i2 = c21537319Ql.LIZIZ;
                Object[] objArr = c21537319Ql.LIZ;
                if (i2 < objArr.length) {
                    objArr[i2] = c21536819Qg;
                    c21537319Ql.LIZIZ = i2 + 1;
                }
            }
            c21536819QgArr[i] = null;
        }
    }

    public final void LJIJI() {
        C21537219Qk c21537219Qk;
        int i = 0;
        while (true) {
            c21537219Qk = this.LJIIJJI;
            C21537019Qi[] c21537019QiArr = c21537219Qk.LIZJ;
            if (i >= c21537019QiArr.length) {
                break;
            }
            C21537019Qi c21537019Qi = c21537019QiArr[i];
            if (c21537019Qi != null) {
                c21537019Qi.LJI();
            }
            i++;
        }
        C21537319Ql c21537319Ql = c21537219Qk.LIZIZ;
        C21537019Qi[] c21537019QiArr2 = this.LJIIL;
        int length = this.LJIILIIL;
        c21537319Ql.getClass();
        if (length > c21537019QiArr2.length) {
            length = c21537019QiArr2.length;
        }
        for (int i2 = 0; i2 < length; i2++) {
            C21537019Qi c21537019Qi2 = c21537019QiArr2[i2];
            int i3 = c21537319Ql.LIZIZ;
            Object[] objArr = c21537319Ql.LIZ;
            if (i3 < objArr.length) {
                objArr[i3] = c21537019Qi2;
                c21537319Ql.LIZIZ = i3 + 1;
            }
        }
        this.LJIILIIL = 0;
        Arrays.fill(this.LJIIJJI.LIZJ, (Object) null);
        this.LIZIZ = 0;
        C21536619Qe c21536619Qe = this.LIZJ;
        c21536619Qe.LJII = 0;
        c21536619Qe.LIZIZ = 0.0f;
        this.LJIIIIZZ = 1;
        for (int i4 = 0; i4 < this.LJIIIZ; i4++) {
        }
        LJIJ();
        this.LJIIIZ = 0;
        this.LJIILJJIL = new C21536819Qg(this.LJIIJJI);
    }

    public final C21536819Qg LJIIJJI() {
        Object obj;
        C21537219Qk c21537219Qk = this.LJIIJJI;
        C21537319Ql c21537319Ql = c21537219Qk.LIZ;
        int i = c21537319Ql.LIZIZ;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = c21537319Ql.LIZ;
            obj = objArr[i2];
            objArr[i2] = null;
            c21537319Ql.LIZIZ = i2;
        } else {
            obj = null;
        }
        C21536819Qg c21536819Qg = (C21536819Qg) obj;
        if (c21536819Qg == null) {
            return new C21536819Qg(c21537219Qk);
        }
        c21536819Qg.LIZ = null;
        c21536819Qg.LIZLLL.clear();
        c21536819Qg.LIZIZ = 0.0f;
        c21536819Qg.LJ = false;
        return c21536819Qg;
    }

    public final C21537019Qi LJIIL() {
        if (this.LJIIIIZZ + 1 >= this.LJ) {
            LJIILJJIL();
        }
        C21537019Qi c21537019QiLIZ = LIZ(EnumC21532319On.SLACK);
        int i = this.LIZIZ + 1;
        this.LIZIZ = i;
        this.LJIIIIZZ++;
        c21537019QiLIZ.LLILLJJLI = i;
        this.LJIIJJI.LIZJ[i] = c21537019QiLIZ;
        return c21537019QiLIZ;
    }

    public final void LJIILJJIL() {
        int i = this.LIZLLL * 2;
        this.LIZLLL = i;
        this.LJFF = (C21536819Qg[]) Arrays.copyOf(this.LJFF, i);
        C21537219Qk c21537219Qk = this.LJIIJJI;
        c21537219Qk.LIZJ = (C21537019Qi[]) Arrays.copyOf(c21537219Qk.LIZJ, this.LIZLLL);
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

    public C21536919Qh() {
        LJIJ();
        C21537219Qk c21537219Qk = new C21537219Qk();
        this.LJIIJJI = c21537219Qk;
        this.LIZJ = new C21536619Qe(c21537219Qk);
        this.LJIILJJIL = new C21536819Qg(c21537219Qk);
    }

    public static int LJIILIIL(C2267141DoW c2267141DoW) {
        C21537019Qi c21537019Qi = c2267141DoW.LJIIIIZZ;
        if (c21537019Qi != null) {
            return (int) (c21537019Qi.LLILZIL + 0.5f);
        }
        return 0;
    }

    public final C21537019Qi LIZ(EnumC21532319On enumC21532319On) {
        C21537319Ql c21537319Ql = this.LJIIJJI.LIZIZ;
        int i = c21537319Ql.LIZIZ;
        Object obj = null;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = c21537319Ql.LIZ;
            Object obj2 = objArr[i2];
            objArr[i2] = null;
            c21537319Ql.LIZIZ = i2;
            obj = obj2;
        }
        C21537019Qi c21537019Qi = (C21537019Qi) obj;
        if (c21537019Qi == null) {
            c21537019Qi = new C21537019Qi(enumC21532319On);
            c21537019Qi.LLJ = enumC21532319On;
        } else {
            c21537019Qi.LJI();
            c21537019Qi.LLJ = enumC21532319On;
        }
        int i3 = this.LJIILIIL;
        int i4 = LJIILLIIL;
        if (i3 >= i4) {
            int i5 = i4 * 2;
            LJIILLIIL = i5;
            this.LJIIL = (C21537019Qi[]) Arrays.copyOf(this.LJIIL, i5);
        }
        C21537019Qi[] c21537019QiArr = this.LJIIL;
        int i6 = this.LJIILIIL;
        this.LJIILIIL = i6 + 1;
        c21537019QiArr[i6] = c21537019Qi;
        return c21537019Qi;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01b7 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0162 A[PHI: r6
      0x0162: PHI (r6v3 X.19Qi) = (r6v2 X.19Qi), (r6v5 X.19Qi) binds: [B:78:0x00f4, B:80:0x00f7] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(X.C21536819Qg r15) {
        /*
            Method dump skipped, instruction units count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21536919Qh.LIZJ(X.19Qg):void");
    }

    public final void LJII(C21536819Qg c21536819Qg) {
        int i;
        if (c21536819Qg.LJ) {
            c21536819Qg.LIZ.LJII(this, c21536819Qg.LIZIZ);
        } else {
            C21536819Qg[] c21536819QgArr = this.LJFF;
            int i2 = this.LJIIIZ;
            c21536819QgArr[i2] = c21536819Qg;
            C21537019Qi c21537019Qi = c21536819Qg.LIZ;
            c21537019Qi.LLILLL = i2;
            this.LJIIIZ = i2 + 1;
            c21537019Qi.LJIIIZ(this, c21536819Qg);
        }
        if (this.LIZ) {
            int i3 = 0;
            while (i3 < this.LJIIIZ) {
                if (this.LJFF[i3] == null) {
                    System.out.println("WTF");
                }
                C21536819Qg c21536819Qg2 = this.LJFF[i3];
                if (c21536819Qg2 != null && c21536819Qg2.LJ) {
                    c21536819Qg2.LIZ.LJII(this, c21536819Qg2.LIZIZ);
                    C21537319Ql c21537319Ql = this.LJIIJJI.LIZ;
                    int i4 = c21537319Ql.LIZIZ;
                    Object[] objArr = c21537319Ql.LIZ;
                    if (i4 < objArr.length) {
                        objArr[i4] = c21536819Qg2;
                        c21537319Ql.LIZIZ = i4 + 1;
                    }
                    this.LJFF[i3] = null;
                    int i5 = i3 + 1;
                    int i6 = i5;
                    while (true) {
                        i = this.LJIIIZ;
                        if (i5 >= i) {
                            break;
                        }
                        C21536819Qg[] c21536819QgArr2 = this.LJFF;
                        int i7 = i5 - 1;
                        C21536819Qg c21536819Qg3 = c21536819QgArr2[i5];
                        c21536819QgArr2[i7] = c21536819Qg3;
                        C21537019Qi c21537019Qi2 = c21536819Qg3.LIZ;
                        if (c21537019Qi2.LLILLL == i5) {
                            c21537019Qi2.LLILLL = i7;
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

    public final C21537019Qi LJIIIZ(int i) {
        if (this.LJIIIIZZ + 1 >= this.LJ) {
            LJIILJJIL();
        }
        C21537019Qi c21537019QiLIZ = LIZ(EnumC21532319On.ERROR);
        int i2 = this.LIZIZ + 1;
        this.LIZIZ = i2;
        this.LJIIIIZZ++;
        c21537019QiLIZ.LLILLJJLI = i2;
        c21537019QiLIZ.LLILZ = i;
        this.LJIIJJI.LIZJ[i2] = c21537019QiLIZ;
        C21536619Qe c21536619Qe = this.LIZJ;
        c21536619Qe.LJIIIIZZ.LIZ = c21537019QiLIZ;
        Arrays.fill(c21537019QiLIZ.LLIZLLLIL, 0.0f);
        c21537019QiLIZ.LLIZLLLIL[c21537019QiLIZ.LLILZ] = 1.0f;
        c21536619Qe.LJIIIZ(c21537019QiLIZ);
        return c21537019QiLIZ;
    }

    public final C21537019Qi LJIIJ(Object obj) {
        C21537019Qi c21537019Qi = null;
        if (obj == null) {
            return null;
        }
        if (this.LJIIIIZZ + 1 >= this.LJ) {
            LJIILJJIL();
        }
        if (obj instanceof C2267141DoW) {
            C2267141DoW c2267141DoW = (C2267141DoW) obj;
            c21537019Qi = c2267141DoW.LJIIIIZZ;
            if (c21537019Qi == null) {
                c2267141DoW.LJII();
                c21537019Qi = c2267141DoW.LJIIIIZZ;
            }
            int i = c21537019Qi.LLILLJJLI;
            if (i != -1) {
                if (i > this.LIZIZ || this.LJIIJJI.LIZJ[i] == null) {
                    if (i != -1) {
                        c21537019Qi.LJI();
                    }
                    int i2 = this.LIZIZ + 1;
                    this.LIZIZ = i2;
                    this.LJIIIIZZ++;
                    c21537019Qi.LLILLJJLI = i2;
                    c21537019Qi.LLJ = EnumC21532319On.UNRESTRICTED;
                    this.LJIIJJI.LIZJ[i2] = c21537019Qi;
                }
            } else {
                int i22 = this.LIZIZ + 1;
                this.LIZIZ = i22;
                this.LJIIIIZZ++;
                c21537019Qi.LLILLJJLI = i22;
                c21537019Qi.LLJ = EnumC21532319On.UNRESTRICTED;
                this.LJIIJJI.LIZJ[i22] = c21537019Qi;
            }
        }
        return c21537019Qi;
    }

    public final void LJIILLIIL(C21536619Qe c21536619Qe) {
        int i = 0;
        while (true) {
            float f = 0.0f;
            if (i >= this.LJIIIZ) {
                break;
            }
            C21536819Qg c21536819Qg = this.LJFF[i];
            if (c21536819Qg.LIZ.LLJ != EnumC21532319On.UNRESTRICTED && c21536819Qg.LIZIZ < 0.0f) {
                boolean z = false;
                int i2 = 0;
                do {
                    i2++;
                    float f2 = Float.MAX_VALUE;
                    int i3 = -1;
                    int i4 = -1;
                    int i5 = 0;
                    for (int i6 = 0; i6 < this.LJIIIZ; i6++) {
                        C21536819Qg c21536819Qg2 = this.LJFF[i6];
                        if (c21536819Qg2.LIZ.LLJ != EnumC21532319On.UNRESTRICTED && !c21536819Qg2.LJ && c21536819Qg2.LIZIZ < f) {
                            int iLIZJ = c21536819Qg2.LIZLLL.LIZJ();
                            int i7 = 0;
                            while (i7 < iLIZJ) {
                                C21537019Qi c21537019QiLIZIZ = c21536819Qg2.LIZLLL.LIZIZ(i7);
                                float fLJFF = c21536819Qg2.LIZLLL.LJFF(c21537019QiLIZIZ);
                                if (fLJFF > f) {
                                    int i8 = 0;
                                    do {
                                        float f3 = c21537019QiLIZIZ.LLIZ[i8] / fLJFF;
                                        if ((f3 < f2 && i8 == i5) || i8 > i5) {
                                            i4 = c21537019QiLIZIZ.LLILLJJLI;
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
                        C21536819Qg c21536819Qg3 = this.LJFF[i3];
                        c21536819Qg3.LIZ.LLILLL = -1;
                        c21536819Qg3.LJI(this.LJIIJJI.LIZJ[i4]);
                        C21537019Qi c21537019Qi = c21536819Qg3.LIZ;
                        c21537019Qi.LLILLL = i3;
                        c21537019Qi.LJIIIZ(this, c21536819Qg3);
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
        LJIIZILJ(c21536619Qe);
        LJIIIIZZ();
    }

    public final void LJIIZILJ(C21536819Qg c21536819Qg) {
        for (int i = 0; i < this.LJIIIIZZ; i++) {
            this.LJII[i] = false;
        }
        int i2 = 0;
        while (true) {
            i2++;
            if (i2 >= this.LJIIIIZZ * 2) {
                return;
            }
            C21537019Qi c21537019Qi = c21536819Qg.LIZ;
            if (c21537019Qi != null) {
                this.LJII[c21537019Qi.LLILLJJLI] = true;
            }
            C21537019Qi c21537019QiLIZ = c21536819Qg.LIZ(this.LJII);
            if (c21537019QiLIZ != null) {
                boolean[] zArr = this.LJII;
                int i3 = c21537019QiLIZ.LLILLJJLI;
                if (zArr[i3]) {
                    return;
                }
                zArr[i3] = true;
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.LJIIIZ; i5++) {
                    C21536819Qg c21536819Qg2 = this.LJFF[i5];
                    if (c21536819Qg2.LIZ.LLJ != EnumC21532319On.UNRESTRICTED && !c21536819Qg2.LJ && c21536819Qg2.LIZLLL.LJIIIZ(c21537019QiLIZ)) {
                        float fLJFF = c21536819Qg2.LIZLLL.LJFF(c21537019QiLIZ);
                        if (fLJFF < 0.0f) {
                            float f2 = (-c21536819Qg2.LIZIZ) / fLJFF;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    C21536819Qg c21536819Qg3 = this.LJFF[i4];
                    c21536819Qg3.LIZ.LLILLL = -1;
                    c21536819Qg3.LJI(c21537019QiLIZ);
                    C21537019Qi c21537019Qi2 = c21536819Qg3.LIZ;
                    c21537019Qi2.LLILLL = i4;
                    c21537019Qi2.LJIIIZ(this, c21536819Qg3);
                }
            } else {
                return;
            }
        }
    }

    public final void LIZLLL(C21537019Qi c21537019Qi, int i) {
        int i2 = c21537019Qi.LLILLL;
        if (i2 == -1) {
            c21537019Qi.LJII(this, i);
            for (int i3 = 0; i3 < this.LIZIZ + 1; i3++) {
            }
            return;
        }
        if (i2 != -1) {
            C21536819Qg c21536819Qg = this.LJFF[i2];
            if (c21536819Qg.LJ) {
                c21536819Qg.LIZIZ = i;
                return;
            }
            if (c21536819Qg.LIZLLL.LIZJ() == 0) {
                c21536819Qg.LJ = true;
                c21536819Qg.LIZIZ = i;
                return;
            }
            C21536819Qg c21536819QgLJIIJJI = LJIIJJI();
            if (i < 0) {
                c21536819QgLJIIJJI.LIZIZ = -i;
                c21536819QgLJIIJJI.LIZLLL.LJI(c21537019Qi, 1.0f);
            } else {
                c21536819QgLJIIJJI.LIZIZ = i;
                c21536819QgLJIIJJI.LIZLLL.LJI(c21537019Qi, -1.0f);
            }
            LIZJ(c21536819QgLJIIJJI);
            return;
        }
        C21536819Qg c21536819QgLJIIJJI2 = LJIIJJI();
        c21536819QgLJIIJJI2.LIZ = c21537019Qi;
        float f = i;
        c21537019Qi.LLILZIL = f;
        c21536819QgLJIIJJI2.LIZIZ = f;
        c21536819QgLJIIJJI2.LJ = true;
        LIZJ(c21536819QgLJIIJJI2);
    }

    public final void LJ(C21537019Qi c21537019Qi, C21537019Qi c21537019Qi2, int i, int i2) {
        if (i2 == 8 && c21537019Qi2.LLILZLL && c21537019Qi.LLILLL == -1) {
            c21537019Qi.LJII(this, c21537019Qi2.LLILZIL + i);
            return;
        }
        C21536819Qg c21536819QgLJIIJJI = LJIIJJI();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            }
            c21536819QgLJIIJJI.LIZIZ = i;
        }
        if (!z) {
            c21536819QgLJIIJJI.LIZLLL.LJI(c21537019Qi, -1.0f);
            c21536819QgLJIIJJI.LIZLLL.LJI(c21537019Qi2, 1.0f);
        } else {
            c21536819QgLJIIJJI.LIZLLL.LJI(c21537019Qi, 1.0f);
            c21536819QgLJIIJJI.LIZLLL.LJI(c21537019Qi2, -1.0f);
        }
        if (i2 != 8) {
            c21536819QgLJIIJJI.LIZIZ(this, i2);
        }
        LIZJ(c21536819QgLJIIJJI);
    }

    public final void LJFF(C21537019Qi c21537019Qi, C21537019Qi c21537019Qi2, int i, int i2) {
        C21536819Qg c21536819QgLJIIJJI = LJIIJJI();
        C21537019Qi c21537019QiLJIIL = LJIIL();
        c21537019QiLJIIL.LLILZ = 0;
        c21536819QgLJIIJJI.LIZJ(c21537019Qi, c21537019Qi2, c21537019QiLJIIL, i);
        if (i2 != 8) {
            c21536819QgLJIIJJI.LIZLLL.LJI(LJIIIZ(i2), (int) (c21536819QgLJIIJJI.LIZLLL.LJFF(c21537019QiLJIIL) * (-1.0f)));
        }
        LIZJ(c21536819QgLJIIJJI);
    }

    public final void LJI(C21537019Qi c21537019Qi, C21537019Qi c21537019Qi2, int i, int i2) {
        C21536819Qg c21536819QgLJIIJJI = LJIIJJI();
        C21537019Qi c21537019QiLJIIL = LJIIL();
        c21537019QiLJIIL.LLILZ = 0;
        c21536819QgLJIIJJI.LIZLLL(c21537019Qi, c21537019Qi2, c21537019QiLJIIL, i);
        if (i2 != 8) {
            c21536819QgLJIIJJI.LIZLLL.LJI(LJIIIZ(i2), (int) (c21536819QgLJIIJJI.LIZLLL.LJFF(c21537019QiLJIIL) * (-1.0f)));
        }
        LIZJ(c21536819QgLJIIJJI);
    }

    public final void LIZIZ(C21537019Qi c21537019Qi, C21537019Qi c21537019Qi2, int i, float f, C21537019Qi c21537019Qi3, C21537019Qi c21537019Qi4, int i2, int i3) {
        C21536819Qg c21536819QgLJIIJJI = LJIIJJI();
        if (c21537019Qi2 == c21537019Qi3) {
            c21536819QgLJIIJJI.LIZLLL.LJI(c21537019Qi, 1.0f);
            c21536819QgLJIIJJI.LIZLLL.LJI(c21537019Qi4, 1.0f);
            c21536819QgLJIIJJI.LIZLLL.LJI(c21537019Qi2, -2.0f);
        } else if (f == 0.5f) {
            c21536819QgLJIIJJI.LIZLLL.LJI(c21537019Qi, 1.0f);
            c21536819QgLJIIJJI.LIZLLL.LJI(c21537019Qi2, -1.0f);
            c21536819QgLJIIJJI.LIZLLL.LJI(c21537019Qi3, -1.0f);
            c21536819QgLJIIJJI.LIZLLL.LJI(c21537019Qi4, 1.0f);
            if (i > 0 || i2 > 0) {
                c21536819QgLJIIJJI.LIZIZ = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            c21536819QgLJIIJJI.LIZLLL.LJI(c21537019Qi, -1.0f);
            c21536819QgLJIIJJI.LIZLLL.LJI(c21537019Qi2, 1.0f);
            c21536819QgLJIIJJI.LIZIZ = i;
        } else if (f >= 1.0f) {
            c21536819QgLJIIJJI.LIZLLL.LJI(c21537019Qi4, -1.0f);
            c21536819QgLJIIJJI.LIZLLL.LJI(c21537019Qi3, 1.0f);
            c21536819QgLJIIJJI.LIZIZ = -i2;
        } else {
            float f2 = 1.0f - f;
            c21536819QgLJIIJJI.LIZLLL.LJI(c21537019Qi, f2 * 1.0f);
            c21536819QgLJIIJJI.LIZLLL.LJI(c21537019Qi2, f2 * (-1.0f));
            c21536819QgLJIIJJI.LIZLLL.LJI(c21537019Qi3, (-1.0f) * f);
            c21536819QgLJIIJJI.LIZLLL.LJI(c21537019Qi4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                c21536819QgLJIIJJI.LIZIZ = ((-i) * f2) + (i2 * f);
            }
        }
        if (i3 != 8) {
            c21536819QgLJIIJJI.LIZIZ(this, i3);
        }
        LIZJ(c21536819QgLJIIJJI);
    }
}
