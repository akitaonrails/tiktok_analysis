package X;

import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.12Gb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19726712Gb {
    public static final C19727112Gf LIZ = new AbstractC19726912Gd<Matrix>() { // from class: X.12Gf
        @Override // X.AbstractC19726912Gd
        public final Matrix LIZ() {
            return new Matrix();
        }

        @Override // X.AbstractC19726912Gd
        public final Matrix LIZIZ(Matrix matrix) {
            Matrix matrix2 = matrix;
            if (matrix2 == null) {
                return new Matrix();
            }
            matrix2.reset();
            return matrix2;
        }
    };
    public static final C19727212Gg LIZIZ = new AbstractC19726912Gd<RectF>() { // from class: X.12Gg
        @Override // X.AbstractC19726912Gd
        public final RectF LIZ() {
            return new RectF();
        }

        @Override // X.AbstractC19726912Gd
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

    public static void LIZJ(Matrix matrix) {
        C19727112Gf c19727112Gf = LIZ;
        if (matrix != null) {
            if (((LinkedList) c19727112Gf.LIZIZ).size() < c19727112Gf.LIZ) {
                ((LinkedList) c19727112Gf.LIZIZ).offer(matrix);
                return;
            }
            return;
        }
        c19727112Gf.getClass();
    }

    public static void LJ(RectF rectF) {
        C19727212Gg c19727212Gg = LIZIZ;
        if (((LinkedList) c19727212Gg.LIZIZ).size() < c19727212Gg.LIZ) {
            ((LinkedList) c19727212Gg.LIZIZ).offer(rectF);
        }
    }

    public static void LIZIZ(Matrix matrix, RectF rectF, RectF rectF2) {
        float fWidth;
        float fHeight;
        float fWidth2 = 0.0f;
        if (rectF.width() * rectF2.height() > rectF2.width() * rectF.height()) {
            fWidth = rectF2.height() / rectF.height();
            fWidth2 = (rectF2.width() - (rectF.width() * fWidth)) * 0.5f;
            fHeight = 0.0f;
        } else {
            fWidth = rectF2.width() / rectF.width();
            fHeight = (rectF2.height() - (rectF.height() * fWidth)) * 0.5f;
        }
        matrix.setScale(fWidth, fWidth);
        matrix.postTranslate(fWidth2, fHeight);
    }
}
