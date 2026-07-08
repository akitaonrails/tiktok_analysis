package X;

import android.util.SparseArray;

/* JADX INFO: renamed from: X.18pZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21403918pZ {
    public final SparseArray<C21403918pZ> LIZ;
    public C21403818pY LIZIZ;

    public C21403918pZ() {
        this(1);
    }

    public C21403918pZ(int i) {
        this.LIZ = new SparseArray<>(i);
    }

    public final void LIZ(C21403818pY c21403818pY, int i, int i2) {
        C21403918pZ c21403918pZ;
        int iLIZ = c21403818pY.LIZ(i);
        SparseArray<C21403918pZ> sparseArray = this.LIZ;
        if (sparseArray == null || (c21403918pZ = sparseArray.get(iLIZ)) == null) {
            c21403918pZ = new C21403918pZ();
            this.LIZ.put(c21403818pY.LIZ(i), c21403918pZ);
        }
        if (i2 > i) {
            c21403918pZ.LIZ(c21403818pY, i + 1, i2);
        } else {
            c21403918pZ.LIZIZ = c21403818pY;
        }
    }
}
