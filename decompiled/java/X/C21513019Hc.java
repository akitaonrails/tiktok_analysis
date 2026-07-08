package X;

import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.19Hc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21513019Hc {
    public static final C21513319Hf LIZ = new AbstractC21513119Hd<Matrix>() { // from class: X.19Hf
        @Override // X.AbstractC21513119Hd
        public final Matrix LIZ() {
            return new Matrix();
        }

        @Override // X.AbstractC21513119Hd
        public final Matrix LIZIZ(Matrix matrix) {
            Matrix matrix2 = matrix;
            if (matrix2 == null) {
                return new Matrix();
            }
            matrix2.reset();
            return matrix2;
        }
    };
    public static final C21513419Hg LIZIZ = new AbstractC21513119Hd<RectF>() { // from class: X.19Hg
        @Override // X.AbstractC21513119Hd
        public final RectF LIZ() {
            return new RectF();
        }

        @Override // X.AbstractC21513119Hd
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
        C21513319Hf c21513319Hf = LIZ;
        if (matrix != null) {
            if (((LinkedList) c21513319Hf.LIZIZ).size() < c21513319Hf.LIZ) {
                ((LinkedList) c21513319Hf.LIZIZ).offer(matrix);
                return;
            }
            return;
        }
        c21513319Hf.getClass();
    }

    public static Matrix LIZLLL(Matrix matrix) {
        Matrix matrixLIZJ = LIZ.LIZJ();
        if (matrix != null) {
            matrixLIZJ.set(matrix);
        }
        return matrixLIZJ;
    }
}
