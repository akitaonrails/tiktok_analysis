package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.19bK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21570419bK {
    public static final Matrix LIZ(Rect rect, int i, int i2, Rect rect2, InterfaceC21567619as interfaceC21567619as) {
        int iWidth;
        int iHeight;
        float f;
        float f2;
        if (rect2 != null) {
            iWidth = rect2.width();
            iHeight = rect2.height();
        } else {
            iWidth = 0;
            iHeight = 0;
        }
        if (iWidth != 0 && iHeight != 0 && iHeight / iWidth < i2 / i) {
            f = i;
            f2 = iWidth;
        } else {
            f = i2;
            f2 = iHeight;
        }
        float f3 = f / f2;
        RectF rectF = new RectF(0.0f, 0.0f, iWidth, iHeight);
        Matrix matrix = new Matrix();
        matrix.setScale(f3, f3, iWidth / 2, iHeight / 2);
        matrix.postTranslate((i - iWidth) / 2, (i2 - iHeight) / 2);
        matrix.mapRect(rectF, rectF);
        return interfaceC21567619as.LIZ(rect, rectF);
    }

    public static final AnimatorSet LIZIZ(Matrix matrix, Matrix matrix2, Rect rect, C21570819bO c21570819bO, Function1<? super Matrix, Unit> function1) {
        RectF rectF;
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float[] fArr2 = new float[9];
        matrix2.getValues(fArr2);
        C21570919bP c21570919bP = new C21570919bP(rect, fArr, function1);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(c21570919bP, PropertyValuesHolder.ofObject(C21571219bS.LIZ, new C194Y(new float[9]), fArr, fArr2));
        objectAnimatorOfPropertyValuesHolder.setDuration(c21570819bO.LJFF);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(c21570819bO.LIZIZ);
        C21571619bW c21571619bW = c21570819bO.LJIIIIZZ;
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
        float fCenterX = rectF3.centerX();
        float fCenterY = rectF3.centerY();
        float fCenterX2 = rectF4.centerX();
        float fCenterY2 = rectF4.centerY();
        c21571619bW.getClass();
        Path path = new Path();
        path.moveTo(fCenterX, fCenterY);
        path.lineTo(fCenterX2, fCenterY2);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(c21570919bP, PropertyValuesHolder.ofObject(C21571219bS.LIZIZ, (TypeConverter) null, path));
        objectAnimatorOfPropertyValuesHolder2.setDuration(c21570819bO.LJ);
        objectAnimatorOfPropertyValuesHolder2.setInterpolator(c21570819bO.LIZ);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfPropertyValuesHolder, objectAnimatorOfPropertyValuesHolder2);
        return animatorSet;
    }
}
