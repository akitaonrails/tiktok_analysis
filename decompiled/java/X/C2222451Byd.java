package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.1Byd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2222451Byd {
    public double LIZ;
    public int LIZIZ = -1;
    public int LIZJ = -1;

    public final String LIZJ() {
        return C786410Ut5.j4("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(this.LIZ)}, 1));
    }

    public final int LIZ() {
        int i = this.LIZIZ;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    public final int LIZIZ() {
        int i = this.LIZJ;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    public final void LIZLLL() {
        this.LIZ = 0.0d;
        LJ(-1);
        LJFF(-1);
    }

    public final void LJ(int i) {
        int i2 = this.LIZIZ;
        if (i2 != -1) {
            i = Math.max(i, i2);
        }
        this.LIZIZ = i;
    }

    public final void LJFF(int i) {
        int i2 = this.LIZJ;
        if (i2 != -1) {
            i = Math.min(i, i2);
        }
        this.LIZJ = i;
    }
}
