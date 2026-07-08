package X;

import android.util.SparseIntArray;

/* JADX INFO: renamed from: X.0khE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1329300khE {
    public final int LIZ;
    public final int LIZIZ;
    public final SparseIntArray LIZJ;
    public final int LIZLLL;

    public C1329300khE(int i, int i2, SparseIntArray sparseIntArray) {
        this(i, i2, sparseIntArray, -1);
    }

    public C1329300khE(int i, int i2, SparseIntArray sparseIntArray, int i3) {
        boolean z;
        if (i >= 0 && i2 >= i) {
            z = true;
        } else {
            z = false;
        }
        C1322350kW1.LJFF(z);
        this.LIZIZ = i;
        this.LIZ = i2;
        this.LIZJ = sparseIntArray;
        this.LIZLLL = i3;
    }
}
