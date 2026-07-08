package X;

import android.animation.AnimatorSet;
import android.animation.FloatArrayEvaluator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.19ba, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21572019ba {
    public static final Matrix LIZ(Rect rect, int i, int i2, Rect rect2, InterfaceC417910Ga5 interfaceC417910Ga5) {
        if (rect2 != null) {
            int iWidth = rect2.width();
            float f = iWidth;
            float f2 = i / f;
            RectF rectF = new RectF(0.0f, 0.0f, f, rect2.height());
            Matrix matrix = new Matrix();
            matrix.setScale(f2, f2, iWidth / 2, r7 / 2);
            matrix.postTranslate((i - iWidth) / 2, (i2 - r7) / 2);
            matrix.mapRect(rectF, rectF);
            return interfaceC417910Ga5.LIZ(rect, rectF);
        }
        return new Matrix();
    }

    public static final AnimatorSet LIZIZ(Matrix matrix, Matrix matrix2, Rect rect, C16CY c16cy, Function1<? super Matrix, Unit> function1) {
        RectF rectF;
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float[] fArr2 = new float[9];
        matrix2.getValues(fArr2);
        C21572119bb c21572119bb = new C21572119bb(rect, fArr, function1);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(c21572119bb, PropertyValuesHolder.ofObject(C21572219bc.LIZ, new FloatArrayEvaluator(new float[9]), fArr, fArr2));
        objectAnimatorOfPropertyValuesHolder.setDuration(c16cy.LIZJ);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(c16cy.LIZ);
        C16CZ c16cz = c16cy.LJ;
        if (rect != null) {
            rectF = new RectF(rect);
        } else {
            rectF = null;
        }
        RectF rectF2 = new RectF(rectF);
        RectF rectF3 = new RectF();
        RectF rectF4 = new RectF();
        matrix.mapRect(rectF3, rectF2);
        matrix2.mapRect(rectF4, rectF2);
        Path path = c16cz.getPath(rectF3.centerX(), rectF3.centerY(), rectF4.centerX(), rectF4.centerY());
        C2189481AmY c2189481AmY = C21572219bc.LIZIZ;
        C21572319bd.LIZ.getValue().getClass();
        ObjectAnimator objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(c21572119bb, PropertyValuesHolder.ofObject(c2189481AmY, (TypeConverter) null, path));
        objectAnimatorOfPropertyValuesHolder2.setDuration(c16cy.LIZJ);
        objectAnimatorOfPropertyValuesHolder2.setInterpolator(c16cy.LIZ);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfPropertyValuesHolder, objectAnimatorOfPropertyValuesHolder2);
        return animatorSet;
    }
}
