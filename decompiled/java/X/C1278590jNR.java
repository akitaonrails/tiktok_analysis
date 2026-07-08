package X;

import android.graphics.Matrix;

/* JADX INFO: renamed from: X.0jNR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1278590jNR {
    public static float[] LIZ(Matrix matrix) {
        if (matrix == null) {
            return null;
        }
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return new float[]{fArr[0], fArr[3], 0.0f, fArr[6], fArr[1], fArr[4], 0.0f, fArr[7], 0.0f, 0.0f, 1.0f, 0.0f, fArr[2], fArr[5], 0.0f, fArr[8]};
    }
}
