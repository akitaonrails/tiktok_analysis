package X;

import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.19HH, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public class C19HH {
    public static final C19HJ LIZ = new C19HI<Matrix>() { // from class: X.19HJ
        @Override // X.C19HI
        public final Matrix LIZ() {
            return new Matrix();
        }

        @Override // X.C19HI
        public final Matrix LIZIZ(Matrix matrix) {
            Matrix matrix2 = matrix;
            if (matrix2 == null) {
                return new Matrix();
            }
            matrix2.reset();
            return matrix2;
        }
    };
    public static final C19HK LIZIZ = new C19HI<RectF>() { // from class: X.19HK
        @Override // X.C19HI
        public final RectF LIZ() {
            return new RectF();
        }

        @Override // X.C19HI
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
        C19HJ c19hj = LIZ;
        if (matrix != null) {
            if (((LinkedList) c19hj.LIZIZ).size() < c19hj.LIZ) {
                ((LinkedList) c19hj.LIZIZ).offer(matrix);
                return;
            }
            return;
        }
        c19hj.getClass();
    }

    public static Matrix LIZLLL(Matrix matrix) {
        Matrix matrixLIZJ = LIZ.LIZJ();
        if (matrix != null) {
            matrixLIZJ.set(matrix);
        }
        return matrixLIZJ;
    }

    public static void LJ(RectF rectF) {
        C19HK c19hk = LIZIZ;
        if (((LinkedList) c19hk.LIZIZ).size() < c19hk.LIZ) {
            ((LinkedList) c19hk.LIZIZ).offer(rectF);
        }
    }
}
