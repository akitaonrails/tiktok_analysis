package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.19Qi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21537019Qi implements Comparable<C21537019Qi> {
    public boolean LL;
    public int LLILZ;
    public float LLILZIL;
    public boolean LLILZLL;
    public EnumC21532319On LLJ;
    public int LLJIJIL;
    public int LLJILJIL;
    public int LLILLJJLI = -1;
    public int LLILLL = -1;
    public final float[] LLIZ = new float[9];
    public final float[] LLIZLLLIL = new float[9];
    public C21536819Qg[] LLJI = new C21536819Qg[16];

    public final void LJI() {
        this.LLJ = EnumC21532319On.UNKNOWN;
        this.LLILZ = 0;
        this.LLILLJJLI = -1;
        this.LLILLL = -1;
        this.LLILZIL = 0.0f;
        this.LLILZLL = false;
        int i = this.LLJIJIL;
        for (int i2 = 0; i2 < i; i2++) {
            this.LLJI[i2] = null;
        }
        this.LLJIJIL = 0;
        this.LLJILJIL = 0;
        this.LL = false;
        Arrays.fill(this.LLIZLLLIL, 0.0f);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("");
        sbLIZ.append(this.LLILLJJLI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C21537019Qi(EnumC21532319On enumC21532319On) {
        this.LLJ = enumC21532319On;
    }

    public final void LIZJ(C21536819Qg c21536819Qg) {
        int i = 0;
        while (true) {
            int i2 = this.LLJIJIL;
            if (i < i2) {
                if (this.LLJI[i] == c21536819Qg) {
                    return;
                } else {
                    i++;
                }
            } else {
                C21536819Qg[] c21536819QgArr = this.LLJI;
                if (i2 >= c21536819QgArr.length) {
                    this.LLJI = (C21536819Qg[]) Arrays.copyOf(c21536819QgArr, c21536819QgArr.length * 2);
                }
                C21536819Qg[] c21536819QgArr2 = this.LLJI;
                int i3 = this.LLJIJIL;
                c21536819QgArr2[i3] = c21536819Qg;
                this.LLJIJIL = i3 + 1;
                return;
            }
        }
    }

    public final void LJFF(C21536819Qg c21536819Qg) {
        int i = this.LLJIJIL;
        int i2 = 0;
        while (i2 < i) {
            if (this.LLJI[i2] != c21536819Qg) {
                i2++;
            } else {
                while (i2 < i - 1) {
                    C21536819Qg[] c21536819QgArr = this.LLJI;
                    int i3 = i2 + 1;
                    c21536819QgArr[i2] = c21536819QgArr[i3];
                    i2 = i3;
                }
                this.LLJIJIL--;
                return;
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(C21537019Qi c21537019Qi) {
        return this.LLILLJJLI - c21537019Qi.LLILLJJLI;
    }

    public final void LJII(C21536919Qh c21536919Qh, float f) {
        this.LLILZIL = f;
        this.LLILZLL = true;
        int i = this.LLJIJIL;
        this.LLILLL = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.LLJI[i2].LJII(c21536919Qh, this, false);
        }
        this.LLJIJIL = 0;
    }

    public final void LJIIIZ(C21536919Qh c21536919Qh, C21536819Qg c21536819Qg) {
        int i = this.LLJIJIL;
        for (int i2 = 0; i2 < i; i2++) {
            this.LLJI[i2].LJIIIIZZ(c21536919Qh, c21536819Qg, false);
        }
        this.LLJIJIL = 0;
    }
}
