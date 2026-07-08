package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.0u2V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1688450u2V extends AbstractC1691450u7L {
    public C1688450u2V() {
        super(16);
    }

    public C1688450u2V(int i) {
        super(i);
    }

    public final void LIZJ(int i) {
        LIZLLL(this.LIZIZ + 1);
        int[] iArr = this.LIZ;
        int i2 = this.LIZIZ;
        iArr[i2] = i;
        this.LIZIZ = i2 + 1;
    }

    public final void LIZLLL(int i) {
        int[] iArr = this.LIZ;
        if (iArr.length < i) {
            this.LIZ = Arrays.copyOf(iArr, Math.max(i, (iArr.length * 3) / 2));
        }
    }

    public final void LJ(int i) {
        int[] iArr = this.LIZ;
        int i2 = this.LIZIZ;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i == iArr[i3]) {
                if (i3 >= 0) {
                    LJFF(i3);
                    return;
                }
                return;
            }
        }
    }

    public final int LJFF(int i) {
        if (i >= 0 && i < this.LIZIZ) {
            int[] iArr = this.LIZ;
            int i2 = iArr[i];
            int i3 = this.LIZIZ;
            if (i != i3 - 1) {
                int i4 = i + 1;
                System.arraycopy(iArr, i4, iArr, i, i3 - i4);
            }
            this.LIZIZ--;
            return i2;
        }
        C19968313Az.LIZIZ("Index must be between 0 and size");
        throw null;
    }

    public final void LJI(int i, int i2) {
        if (i >= 0 && i < this.LIZIZ) {
            this.LIZ[i] = i2;
        } else {
            C19968313Az.LIZIZ("Index must be between 0 and size");
            throw null;
        }
    }
}
