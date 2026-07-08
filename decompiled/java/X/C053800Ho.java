package X;

import android.graphics.PointF;
import java.util.Arrays;

/* JADX INFO: renamed from: X.00Ho, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C053800Ho {
    public final int[][] LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final int LJ;
    public PointF[] LJFF = null;

    public final int hashCode() {
        return (((((Arrays.deepHashCode(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + Float.floatToIntBits(this.LIZJ)) * 31) + Float.floatToIntBits(this.LIZLLL);
    }

    public C053800Ho(int[][] iArr, float f, float f2, float f3, int i) {
        this.LIZ = iArr;
        this.LIZIZ = f;
        this.LIZJ = f2;
        this.LIZLLL = f3;
        this.LJ = i;
    }
}
