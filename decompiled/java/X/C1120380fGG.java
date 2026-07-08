package X;

import Y.AUListenerS224S0200000_17;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.RectF;

/* JADX INFO: renamed from: X.0fGG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1120380fGG {
    public final Bitmap LIZ;
    public int LIZIZ = 255;
    public final RectF LIZJ;
    public final AnimatorSet LIZLLL;

    public C1120380fGG(C1120360fGE c1120360fGE, Bitmap bitmap, PointF pointF) {
        this.LIZ = bitmap;
        RectF rectF = new RectF();
        this.LIZJ = rectF;
        float f = pointF.x;
        float f2 = C1120360fGE.LLJ / 2;
        rectF.left = f - f2;
        float f3 = pointF.y;
        rectF.top = f3 - f2;
        rectF.right = f + f2;
        rectF.bottom = f3 + f2;
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.7f, 1.1f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS224S0200000_17(this, c1120360fGE, 11));
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(c1120360fGE.LLILZIL, c1120360fGE.LLILZLL);
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.setStartDelay(200L);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS224S0200000_17(this, c1120360fGE, 12));
        animatorSet.playSequentially(valueAnimatorOfFloat, valueAnimatorOfInt);
        this.LIZLLL = animatorSet;
    }
}
