package X;

import android.graphics.Matrix;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0j8U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1269320j8U {
    public Matrix LIZ;
    public float[] LIZIZ;

    public final void LIZ(float[] fArr) {
        float[] fArrCopyOf;
        Matrix matrix;
        if (this.LIZ != null && ((fArr == null && this.LIZIZ == null) || Arrays.equals(fArr, this.LIZIZ))) {
            return;
        }
        if (fArr != null) {
            fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        } else {
            fArrCopyOf = null;
        }
        this.LIZIZ = fArrCopyOf;
        if (fArr != null) {
            matrix = C1273010jER.LIZJ(0, fArr);
        } else {
            matrix = new Matrix();
        }
        this.LIZ = matrix;
    }
}
