package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.19Of, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21531519Of {
    public boolean LIZ;
    public String LIZIZ;
    public int LJ;
    public float LJFF;
    public boolean LJI;
    public EnumC21531919Oj LJIIIZ;
    public int LJIIJJI;
    public int LJIIL;
    public int LIZJ = -1;
    public int LIZLLL = -1;
    public final float[] LJII = new float[9];
    public final float[] LJIIIIZZ = new float[9];
    public C21531319Od[] LJIIJ = new C21531319Od[16];

    public final void LIZJ() {
        this.LIZIZ = null;
        this.LJIIIZ = EnumC21531919Oj.UNKNOWN;
        this.LJ = 0;
        this.LIZJ = -1;
        this.LIZLLL = -1;
        this.LJFF = 0.0f;
        this.LJI = false;
        int i = this.LJIIJJI;
        for (int i2 = 0; i2 < i; i2++) {
            this.LJIIJ[i2] = null;
        }
        this.LJIIJJI = 0;
        this.LJIIL = 0;
        this.LIZ = false;
        Arrays.fill(this.LJIIIIZZ, 0.0f);
    }

    public final String toString() {
        if (this.LIZIZ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("");
            sbLIZ.append(this.LIZIZ);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("");
        sbLIZ2.append(this.LIZJ);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public C21531519Of(EnumC21531919Oj enumC21531919Oj) {
        this.LJIIIZ = enumC21531919Oj;
    }

    public final void LIZ(C21531319Od c21531319Od) {
        int i = 0;
        while (true) {
            int i2 = this.LJIIJJI;
            if (i < i2) {
                if (this.LJIIJ[i] == c21531319Od) {
                    return;
                } else {
                    i++;
                }
            } else {
                C21531319Od[] c21531319OdArr = this.LJIIJ;
                if (i2 >= c21531319OdArr.length) {
                    this.LJIIJ = (C21531319Od[]) Arrays.copyOf(c21531319OdArr, c21531319OdArr.length * 2);
                }
                C21531319Od[] c21531319OdArr2 = this.LJIIJ;
                int i3 = this.LJIIJJI;
                c21531319OdArr2[i3] = c21531319Od;
                this.LJIIJJI = i3 + 1;
                return;
            }
        }
    }

    public final void LIZIZ(C21531319Od c21531319Od) {
        int i = this.LJIIJJI;
        int i2 = 0;
        while (i2 < i) {
            if (this.LJIIJ[i2] != c21531319Od) {
                i2++;
            } else {
                while (i2 < i - 1) {
                    C21531319Od[] c21531319OdArr = this.LJIIJ;
                    int i3 = i2 + 1;
                    c21531319OdArr[i2] = c21531319OdArr[i3];
                    i2 = i3;
                }
                this.LJIIJJI--;
                return;
            }
        }
    }

    public final void LIZLLL(C21531219Oc c21531219Oc, float f) {
        this.LJFF = f;
        this.LJI = true;
        int i = this.LJIIJJI;
        this.LIZLLL = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.LJIIJ[i2].LJII(c21531219Oc, this, false);
        }
        this.LJIIJJI = 0;
    }

    public final void LJ(C21531219Oc c21531219Oc, C21531319Od c21531319Od) {
        int i = this.LJIIJJI;
        for (int i2 = 0; i2 < i; i2++) {
            this.LJIIJ[i2].LJIIIIZZ(c21531219Oc, c21531319Od, false);
        }
        this.LJIIJJI = 0;
    }
}
