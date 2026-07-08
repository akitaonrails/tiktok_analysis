package X;

import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.19Hk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21513819Hk {
    public static final C21514019Hm LIZ = new AbstractC21513919Hl<Matrix>() { // from class: X.19Hm
        @Override // X.AbstractC21513919Hl
        public final Matrix LIZ() {
            return new Matrix();
        }

        @Override // X.AbstractC21513919Hl
        public final Matrix LIZIZ(Matrix matrix) {
            Matrix matrix2 = matrix;
            if (matrix2 == null) {
                return new Matrix();
            }
            matrix2.reset();
            return matrix2;
        }
    };
    public static final C21514119Hn LIZIZ = new AbstractC21513919Hl<RectF>() { // from class: X.19Hn
        @Override // X.AbstractC21513919Hl
        public final RectF LIZ() {
            return new RectF();
        }

        @Override // X.AbstractC21513919Hl
        public final RectF LIZIZ(RectF rectF) {
            RectF rectF2 = rectF;
            if (rectF2 == null) {
                return new RectF();
            }
            rectF2.setEmpty();
            return rectF2;
        }
    };

    public static Matrix LIZJ() {
        return LIZ.LIZJ();
    }

    public static float[] LIZ(Matrix matrix) {
        if (matrix != null) {
            float[] fArr = new float[9];
            matrix.getValues(fArr);
            return new float[]{fArr[0], fArr[4]};
        }
        return new float[2];
    }

    public static void LIZIZ(Matrix matrix) {
        C21514019Hm c21514019Hm = LIZ;
        if (matrix != null) {
            if (((LinkedList) c21514019Hm.LIZIZ).size() < c21514019Hm.LIZ) {
                ((LinkedList) c21514019Hm.LIZIZ).offer(matrix);
                return;
            }
            return;
        }
        c21514019Hm.getClass();
    }

    public static Matrix LIZLLL(Matrix matrix) {
        Matrix matrixLIZJ = LIZ.LIZJ();
        if (matrix != null) {
            matrixLIZJ.set(matrix);
        }
        return matrixLIZJ;
    }
}
