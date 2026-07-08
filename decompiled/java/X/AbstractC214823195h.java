package X;

import android.util.SparseIntArray;

/* JADX INFO: renamed from: X.195h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC214823195h {
    public final SparseIntArray LIZ = new SparseIntArray();
    public final SparseIntArray LIZIZ = new SparseIntArray();
    public boolean LIZJ = false;
    public boolean LIZLLL = false;

    public abstract int LJFF(int i);

    public final void LJI() {
        this.LIZ.clear();
    }

    public static int LIZ(SparseIntArray sparseIntArray, int i) {
        int size = sparseIntArray.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            if (sparseIntArray.keyAt(i3) < i) {
                i2 = i3 + 1;
            } else {
                size = i3 - 1;
            }
        }
        int i4 = i2 - 1;
        if (i4 < 0 || i4 >= sparseIntArray.size()) {
            return -1;
        }
        return sparseIntArray.keyAt(i4);
    }

    public final int LIZIZ(int i, int i2) {
        if (!this.LIZLLL) {
            return LIZLLL(i, i2);
        }
        int i3 = this.LIZIZ.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int iLIZLLL = LIZLLL(i, i2);
        this.LIZIZ.put(i, iLIZLLL);
        return iLIZLLL;
    }

    public final int LIZJ(int i, int i2) {
        if (!this.LIZJ) {
            return LJ(i, i2);
        }
        int i3 = this.LIZ.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int iLJ = LJ(i, i2);
        this.LIZ.put(i, iLJ);
        return iLJ;
    }

    public final int LIZLLL(int i, int i2) {
        int i3;
        int i4;
        int iLIZJ;
        int iLIZ;
        if (this.LIZLLL && (iLIZ = LIZ(this.LIZIZ, i)) != -1) {
            i3 = this.LIZIZ.get(iLIZ);
            i4 = iLIZ + 1;
            iLIZJ = LIZJ(iLIZ, i2) + LJFF(iLIZ);
            if (iLIZJ == i2) {
                i3++;
                iLIZJ = 0;
            }
        } else {
            i3 = 0;
            i4 = 0;
            iLIZJ = 0;
        }
        int iLJFF = LJFF(i);
        while (i4 < i) {
            int iLJFF2 = LJFF(i4);
            iLIZJ += iLJFF2;
            if (iLIZJ == i2) {
                i3++;
                iLIZJ = 0;
            } else if (iLIZJ > i2) {
                i3++;
                iLIZJ = iLJFF2;
            }
            i4++;
        }
        if (iLIZJ + iLJFF > i2) {
            return i3 + 1;
        }
        return i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x002a -> B:10:0x001f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002c -> B:10:0x001f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x002e -> B:10:0x001f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int LJ(int r6, int r7) {
        /*
            r5 = this;
            int r4 = r5.LJFF(r6)
            r3 = 0
            if (r4 != r7) goto L8
            return r3
        L8:
            boolean r0 = r5.LIZJ
            if (r0 == 0) goto L30
            android.util.SparseIntArray r0 = r5.LIZ
            int r2 = LIZ(r0, r6)
            if (r2 < 0) goto L30
            android.util.SparseIntArray r0 = r5.LIZ
            int r1 = r0.get(r2)
            int r0 = r5.LJFF(r2)
            int r1 = r1 + r0
        L1f:
            int r2 = r2 + 1
        L21:
            if (r2 >= r6) goto L33
            int r0 = r5.LJFF(r2)
            int r1 = r1 + r0
            if (r1 != r7) goto L2c
            r1 = 0
            goto L1f
        L2c:
            if (r1 <= r7) goto L1f
            r1 = r0
            goto L1f
        L30:
            r2 = 0
            r1 = 0
            goto L21
        L33:
            int r4 = r4 + r1
            if (r4 > r7) goto L37
            return r1
        L37:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC214823195h.LJ(int, int):int");
    }
}
