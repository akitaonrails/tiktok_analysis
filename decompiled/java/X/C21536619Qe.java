package X;

import Y.AComparatorS52S0000000_33;
import java.util.Arrays;

/* JADX INFO: renamed from: X.19Qe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21536619Qe extends C21536819Qg {
    public C21537019Qi[] LJFF;
    public C21537019Qi[] LJI;
    public int LJII;
    public final C21532419Oo LJIIIIZZ;

    @Override // X.C21536819Qg
    public final boolean LJ() {
        return this.LJII == 0;
    }

    @Override // X.C21536819Qg
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("");
        sbLIZ.append(" goal -> (");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(") : ");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        for (int i = 0; i < this.LJII; i++) {
            this.LJIIIIZZ.LIZ = this.LJFF[i];
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(this.LJIIIIZZ);
            sbLIZ2.append(" ");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        return strLIZIZ;
    }

    public C21536619Qe(C21537219Qk c21537219Qk) {
        super(c21537219Qk);
        this.LJFF = new C21537019Qi[128];
        this.LJI = new C21537019Qi[128];
        this.LJIIIIZZ = new C21532419Oo(this);
    }

    @Override // X.C21536819Qg, X.InterfaceC21537419Qm
    public final C21537019Qi LIZ(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.LJII; i2++) {
            C21537019Qi[] c21537019QiArr = this.LJFF;
            C21537019Qi c21537019Qi = c21537019QiArr[i2];
            if (!zArr[c21537019Qi.LLILLJJLI]) {
                C21532419Oo c21532419Oo = this.LJIIIIZZ;
                c21532419Oo.LIZ = c21537019Qi;
                int i3 = 8;
                if (i != -1) {
                    C21537019Qi c21537019Qi2 = c21537019QiArr[i];
                    while (true) {
                        float f = c21537019Qi2.LLIZLLLIL[i3];
                        float f2 = c21532419Oo.LIZ.LLIZLLLIL[i3];
                        if (f2 == f) {
                            i3--;
                            if (i3 >= 0) {
                            }
                        } else if (f2 < f) {
                        }
                    }
                } else {
                    do {
                        float f3 = c21532419Oo.LIZ.LLIZLLLIL[i3];
                        if (f3 > 0.0f) {
                            break;
                        }
                        if (f3 < 0.0f) {
                            i = i2;
                            break;
                        }
                        i3--;
                    } while (i3 >= 0);
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.LJFF[i];
    }

    public final void LJIIIZ(C21537019Qi c21537019Qi) {
        int i;
        int i2 = this.LJII + 1;
        C21537019Qi[] c21537019QiArr = this.LJFF;
        if (i2 > c21537019QiArr.length) {
            C21537019Qi[] c21537019QiArr2 = (C21537019Qi[]) Arrays.copyOf(c21537019QiArr, c21537019QiArr.length * 2);
            this.LJFF = c21537019QiArr2;
            this.LJI = (C21537019Qi[]) Arrays.copyOf(c21537019QiArr2, c21537019QiArr2.length * 2);
        }
        C21537019Qi[] c21537019QiArr3 = this.LJFF;
        int i3 = this.LJII;
        c21537019QiArr3[i3] = c21537019Qi;
        int i4 = i3 + 1;
        this.LJII = i4;
        if (i4 > 1 && c21537019QiArr3[i4 - 1].LLILLJJLI > c21537019Qi.LLILLJJLI) {
            int i5 = 0;
            while (true) {
                i = this.LJII;
                if (i5 >= i) {
                    break;
                }
                this.LJI[i5] = this.LJFF[i5];
                i5++;
            }
            Arrays.sort(this.LJI, 0, i, new AComparatorS52S0000000_33(13));
            for (int i6 = 0; i6 < this.LJII; i6++) {
                this.LJFF[i6] = this.LJI[i6];
            }
        }
        c21537019Qi.LL = true;
        c21537019Qi.LIZJ(this);
    }

    public final void LJIIJ(C21537019Qi c21537019Qi) {
        int i = 0;
        while (i < this.LJII) {
            if (this.LJFF[i] != c21537019Qi) {
                i++;
            } else {
                while (true) {
                    int i2 = this.LJII;
                    if (i < i2 - 1) {
                        C21537019Qi[] c21537019QiArr = this.LJFF;
                        int i3 = i + 1;
                        c21537019QiArr[i] = c21537019QiArr[i3];
                        i = i3;
                    } else {
                        this.LJII = i2 - 1;
                        c21537019Qi.LL = false;
                        return;
                    }
                }
            }
        }
    }

    @Override // X.C21536819Qg
    public final void LJIIIIZZ(C21536919Qh c21536919Qh, C21536819Qg c21536819Qg, boolean z) {
        C21537019Qi c21537019Qi = c21536819Qg.LIZ;
        if (c21537019Qi == null) {
            return;
        }
        InterfaceC21537119Qj interfaceC21537119Qj = c21536819Qg.LIZLLL;
        int iLIZJ = interfaceC21537119Qj.LIZJ();
        for (int i = 0; i < iLIZJ; i++) {
            C21537019Qi c21537019QiLIZIZ = interfaceC21537119Qj.LIZIZ(i);
            float fLJ = interfaceC21537119Qj.LJ(i);
            C21532419Oo c21532419Oo = this.LJIIIIZZ;
            c21532419Oo.LIZ = c21537019QiLIZIZ;
            boolean z2 = true;
            if (c21537019QiLIZIZ.LL) {
                int i2 = 0;
                do {
                    float[] fArr = c21532419Oo.LIZ.LLIZLLLIL;
                    float f = fArr[i2] + (c21537019Qi.LLIZLLLIL[i2] * fLJ);
                    fArr[i2] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        c21532419Oo.LIZ.LLIZLLLIL[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                    i2++;
                } while (i2 < 9);
                if (z2) {
                    c21532419Oo.LIZIZ.LJIIJ(c21532419Oo.LIZ);
                }
            } else {
                int i3 = 0;
                do {
                    float f2 = c21537019Qi.LLIZLLLIL[i3];
                    if (f2 != 0.0f) {
                        float f3 = f2 * fLJ;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        c21532419Oo.LIZ.LLIZLLLIL[i3] = f3;
                    } else {
                        c21532419Oo.LIZ.LLIZLLLIL[i3] = 0.0f;
                    }
                    i3++;
                } while (i3 < 9);
                LJIIIZ(c21537019QiLIZIZ);
            }
            this.LIZIZ += c21536819Qg.LIZIZ * fLJ;
        }
        LJIIJ(c21537019Qi);
    }
}
