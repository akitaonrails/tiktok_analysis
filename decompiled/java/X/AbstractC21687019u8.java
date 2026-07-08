package X;

import android.util.SparseIntArray;

/* JADX INFO: renamed from: X.19u8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC21687019u8 {
    public final SparseIntArray LIZ = new SparseIntArray();
    public boolean LIZIZ = false;
    public int LIZJ = 0;

    public final int LIZ(int i, int i2) {
        if (!this.LIZIZ) {
            return (i - this.LIZJ) % i2;
        }
        int i3 = this.LIZ.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int i4 = (i - this.LIZJ) % i2;
        this.LIZ.put(i, i4);
        return i4;
    }
}
