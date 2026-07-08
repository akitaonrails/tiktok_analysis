package X;

import Y.AComparatorS52S0000000_33;
import java.util.Arrays;

/* JADX INFO: renamed from: X.19Oe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21531419Oe extends C21531319Od {
    public C21531519Of[] LJFF;
    public C21531519Of[] LJI;
    public int LJII;
    public final C21531719Oh LJIIIIZZ;

    @Override // X.C21531319Od
    public final boolean LJ() {
        return this.LJII == 0;
    }

    @Override // X.C21531319Od
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("");
        sbLIZ.append(" goal -> (");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(") : ");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        for (int i = 0; i < this.LJII; i++) {
            this.LJIIIIZZ.LL = this.LJFF[i];
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(this.LJIIIIZZ);
            sbLIZ2.append(" ");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        return strLIZIZ;
    }

    public C21531419Oe(C21532019Ok c21532019Ok) {
        super(c21532019Ok);
        this.LJFF = new C21531519Of[128];
        this.LJI = new C21531519Of[128];
        this.LJIIIIZZ = new C21531719Oh(this);
    }

    @Override // X.C21531319Od, X.InterfaceC21532219Om
    public final C21531519Of LIZ(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.LJII; i2++) {
            C21531519Of[] c21531519OfArr = this.LJFF;
            C21531519Of c21531519Of = c21531519OfArr[i2];
            if (!zArr[c21531519Of.LIZJ]) {
                C21531719Oh c21531719Oh = this.LJIIIIZZ;
                c21531719Oh.LL = c21531519Of;
                int i3 = 8;
                if (i != -1) {
                    C21531519Of c21531519Of2 = c21531519OfArr[i];
                    while (true) {
                        float f = c21531519Of2.LJIIIIZZ[i3];
                        float f2 = c21531719Oh.LL.LJIIIIZZ[i3];
                        if (f2 == f) {
                            i3--;
                            if (i3 >= 0) {
                            }
                        } else if (f2 < f) {
                        }
                    }
                } else {
                    do {
                        float f3 = c21531719Oh.LL.LJIIIIZZ[i3];
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

    public final void LJIIIZ(C21531519Of c21531519Of) {
        int i;
        int i2 = this.LJII + 1;
        C21531519Of[] c21531519OfArr = this.LJFF;
        if (i2 > c21531519OfArr.length) {
            C21531519Of[] c21531519OfArr2 = (C21531519Of[]) Arrays.copyOf(c21531519OfArr, c21531519OfArr.length * 2);
            this.LJFF = c21531519OfArr2;
            this.LJI = (C21531519Of[]) Arrays.copyOf(c21531519OfArr2, c21531519OfArr2.length * 2);
        }
        C21531519Of[] c21531519OfArr3 = this.LJFF;
        int i3 = this.LJII;
        c21531519OfArr3[i3] = c21531519Of;
        int i4 = i3 + 1;
        this.LJII = i4;
        if (i4 > 1 && c21531519OfArr3[i4 - 1].LIZJ > c21531519Of.LIZJ) {
            int i5 = 0;
            while (true) {
                i = this.LJII;
                if (i5 >= i) {
                    break;
                }
                this.LJI[i5] = this.LJFF[i5];
                i5++;
            }
            Arrays.sort(this.LJI, 0, i, new AComparatorS52S0000000_33(1));
            for (int i6 = 0; i6 < this.LJII; i6++) {
                this.LJFF[i6] = this.LJI[i6];
            }
        }
        c21531519Of.LIZ = true;
        c21531519Of.LIZ(this);
    }

    public final void LJIIJ(C21531519Of c21531519Of) {
        int i = 0;
        while (i < this.LJII) {
            if (this.LJFF[i] != c21531519Of) {
                i++;
            } else {
                while (true) {
                    int i2 = this.LJII;
                    if (i < i2 - 1) {
                        C21531519Of[] c21531519OfArr = this.LJFF;
                        int i3 = i + 1;
                        c21531519OfArr[i] = c21531519OfArr[i3];
                        i = i3;
                    } else {
                        this.LJII = i2 - 1;
                        c21531519Of.LIZ = false;
                        return;
                    }
                }
            }
        }
    }

    @Override // X.C21531319Od
    public final void LJIIIIZZ(C21531219Oc c21531219Oc, C21531319Od c21531319Od, boolean z) {
        C21531519Of c21531519Of = c21531319Od.LIZ;
        if (c21531519Of == null) {
            return;
        }
        InterfaceC21531819Oi interfaceC21531819Oi = c21531319Od.LIZLLL;
        int iLIZJ = interfaceC21531819Oi.LIZJ();
        for (int i = 0; i < iLIZJ; i++) {
            C21531519Of c21531519OfLIZIZ = interfaceC21531819Oi.LIZIZ(i);
            float fLJ = interfaceC21531819Oi.LJ(i);
            C21531719Oh c21531719Oh = this.LJIIIIZZ;
            c21531719Oh.LL = c21531519OfLIZIZ;
            boolean z2 = true;
            if (c21531519OfLIZIZ.LIZ) {
                int i2 = 0;
                do {
                    float[] fArr = c21531719Oh.LL.LJIIIIZZ;
                    float f = fArr[i2] + (c21531519Of.LJIIIIZZ[i2] * fLJ);
                    fArr[i2] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        c21531719Oh.LL.LJIIIIZZ[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                    i2++;
                } while (i2 < 9);
                if (z2) {
                    c21531719Oh.LLILLJJLI.LJIIJ(c21531719Oh.LL);
                }
            } else {
                int i3 = 0;
                do {
                    float f2 = c21531519Of.LJIIIIZZ[i3];
                    if (f2 != 0.0f) {
                        float f3 = f2 * fLJ;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        c21531719Oh.LL.LJIIIIZZ[i3] = f3;
                    } else {
                        c21531719Oh.LL.LJIIIIZZ[i3] = 0.0f;
                    }
                    i3++;
                } while (i3 < 9);
                LJIIIZ(c21531519OfLIZIZ);
            }
            this.LIZIZ += c21531319Od.LIZIZ * fLJ;
        }
        LJIIJ(c21531519Of);
    }
}
