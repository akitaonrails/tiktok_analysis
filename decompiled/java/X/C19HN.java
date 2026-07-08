package X;

import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.19HN, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19HN {
    public static final C19HR LIZ = new C19HP<Matrix>() { // from class: X.19HR
        @Override // X.C19HP
        public final Matrix LIZ() {
            return new Matrix();
        }

        @Override // X.C19HP
        public final Matrix LIZIZ(Matrix matrix) {
            Matrix matrix2 = matrix;
            if (matrix2 == null) {
                return new Matrix();
            }
            matrix2.reset();
            return matrix2;
        }
    };
    public static final C19HS LIZIZ = new C19HP<RectF>() { // from class: X.19HS
        @Override // X.C19HP
        public final RectF LIZ() {
            return new RectF();
        }

        @Override // X.C19HP
        public final RectF LIZIZ(RectF rectF) {
            RectF rectF2 = rectF;
            if (rectF2 == null) {
                return new RectF();
            }
            rectF2.setEmpty();
            return rectF2;
        }
    };

    public static Matrix LIZLLL() {
        Matrix matrixLIZJ = LIZ.LIZJ();
        return matrixLIZJ == null ? new Matrix() : matrixLIZJ;
    }

    public static RectF LJFF() {
        RectF rectFLIZJ = LIZIZ.LIZJ();
        return rectFLIZJ == null ? new RectF() : rectFLIZJ;
    }

    public static float[] LIZ(Matrix matrix) {
        if (matrix != null) {
            float[] fArr = new float[9];
            matrix.getValues(fArr);
            return new float[]{fArr[0], fArr[4]};
        }
        return new float[2];
    }

    public static boolean LIZIZ(Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float f = 0.0f;
        int i = 0;
        do {
            f += fArr[i];
            i++;
        } while (i < 9);
        if (Math.abs(3.0f - f) > 0.01f) {
            return false;
        }
        return true;
    }

    public static void LIZJ(Matrix matrix) {
        C19HR c19hr = LIZ;
        if (((LinkedList) c19hr.LIZIZ).size() < c19hr.LIZ) {
            ((LinkedList) c19hr.LIZIZ).offer(matrix);
        }
    }

    public static Matrix LJ(Matrix matrix) {
        Matrix matrixLIZJ = LIZ.LIZJ();
        if (matrixLIZJ == null) {
            matrixLIZJ = new Matrix();
        }
        if (matrix != null) {
            matrixLIZJ.set(matrix);
        }
        return matrixLIZJ;
    }

    public static RectF LJI(float f, float f2) {
        RectF rectFLIZJ = LIZIZ.LIZJ();
        if (rectFLIZJ == null) {
            rectFLIZJ = new RectF();
        }
        rectFLIZJ.set(0.0f, 0.0f, f, f2);
        return rectFLIZJ;
    }
}
