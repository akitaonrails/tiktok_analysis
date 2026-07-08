package X;

import Y.ALAdapterS9S0100000_12;
import Y.AUListenerS159S0300000_32;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.19Gn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21511519Gn {
    public static final /* synthetic */ int LIZ = 0;

    public static Matrix LIZIZ(float f, Matrix matrix, Matrix matrix2) {
        float[] fArr = new float[9];
        float[] fArr2 = new float[9];
        float[] fArr3 = new float[9];
        matrix.getValues(fArr);
        matrix2.getValues(fArr2);
        int i = 0;
        do {
            float f2 = fArr[i];
            fArr3[i] = f2 + ((fArr2[i] - f2) * f);
            i++;
        } while (i < 9);
        Matrix matrix3 = new Matrix();
        matrix3.setValues(fArr3);
        return matrix3;
    }

    public static void LIZ(ImageView imageView, Matrix matrix, Matrix matrix2, long j, Function0 function0, int i) {
        Interpolator interpolatorLJIILIIL;
        if ((i & 8) != 0) {
            j = 300;
        }
        if ((i & 16) != 0) {
            interpolatorLJIILIIL = C1619980sG4.LJIILIIL();
        } else {
            interpolatorLJIILIIL = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.setInterpolator(interpolatorLJIILIIL);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS159S0300000_32(matrix, matrix2, imageView, 1));
        valueAnimatorOfFloat.addListener(new ALAdapterS9S0100000_12(function0, 36));
        valueAnimatorOfFloat.start();
    }
}
