package X;

import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.19HW, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public class C19HW {
    public static final C19HY LIZ = new C19HX<Matrix>() { // from class: X.19HY
        @Override // X.C19HX
        public final Matrix LIZ() {
            return new Matrix();
        }

        @Override // X.C19HX
        public final Matrix LIZIZ(Matrix matrix) {
            Matrix matrix2 = matrix;
            if (matrix2 == null) {
                return new Matrix();
            }
            matrix2.reset();
            return matrix2;
        }
    };
    public static final C19HZ LIZIZ = new C19HX<RectF>() { // from class: X.19HZ
        @Override // X.C19HX
        public final RectF LIZ() {
            return new RectF();
        }

        @Override // X.C19HX
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
        C19HY c19hy = LIZ;
        if (matrix != null) {
            if (((LinkedList) c19hy.LIZIZ).size() < c19hy.LIZ) {
                ((LinkedList) c19hy.LIZIZ).offer(matrix);
                return;
            }
            return;
        }
        c19hy.getClass();
    }

    public static Matrix LIZLLL(Matrix matrix) {
        Matrix matrixLIZJ = LIZ.LIZJ();
        if (matrix != null) {
            matrixLIZJ.set(matrix);
        }
        return matrixLIZJ;
    }
}
