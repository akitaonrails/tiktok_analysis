package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.13L3, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13L3 {
    public static final float[] LIZ;

    static {
        new C13L4() { // from class: X.13L5
            {
                long[] jArr;
                int iLJ = C19992013Kc.LJ(0);
                int iMax = iLJ > 0 ? Math.max(7, C19992013Kc.LIZLLL(iLJ)) : 0;
                this.LIZJ = iMax;
                if (iMax == 0) {
                    jArr = C19992013Kc.LIZ;
                } else {
                    int i = ((((iMax + 1) + 7) + 7) & (-8)) >> 3;
                    jArr = new long[i];
                    Arrays.fill(jArr, 0, i, -9187201950435737472L);
                }
                this.LIZ = jArr;
                int i2 = iMax >> 3;
                long j = 255 << ((iMax & 7) << 3);
                jArr[i2] = (jArr[i2] & (~j)) | j;
                C19992013Kc.LIZ(this.LIZJ);
                this.LIZIZ = new float[iMax];
            }
        };
        LIZ = new float[0];
    }
}
