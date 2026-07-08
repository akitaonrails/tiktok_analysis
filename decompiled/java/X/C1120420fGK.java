package X;

import Y.ALAdapterS12S0200000_17;
import Y.AUListenerS224S0200000_17;
import Y.AUListenerS266S0100000_17;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveLikeDegradeSettings;

/* JADX INFO: renamed from: X.0fGK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1120420fGK {
    public final Bitmap LIZ;
    public final RectF LIZIZ;
    public int LIZJ;
    public float LIZLLL;
    public final boolean LJ;
    public final AnimatorSet LJFF;
    public final /* synthetic */ C1120360fGE LJI;

    public final AnimatorSet LIZ(boolean z) {
        long j;
        long j2;
        long j3;
        AnimatorSet animatorSet = new AnimatorSet();
        C1120360fGE c1120360fGE = this.LJI;
        Animator[] animatorArr = new Animator[2];
        AnimatorSet animatorSet2 = new AnimatorSet();
        Animator[] animatorArr2 = new Animator[2];
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.5f);
        long j4 = 350;
        if (z) {
            j = 350;
        } else if (this.LJ) {
            j = 100;
        } else {
            j = 150;
        }
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS224S0200000_17(this, c1120360fGE, 5));
        animatorArr2[0] = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.5f, 1.36f, 1.4f);
        if (z) {
            j2 = 350;
        } else if (this.LJ) {
            j2 = 100;
        } else {
            j2 = 150;
        }
        valueAnimatorOfFloat2.setDuration(j2);
        valueAnimatorOfFloat2.addUpdateListener(new AUListenerS224S0200000_17(this, c1120360fGE, 6));
        if (z) {
            valueAnimatorOfFloat2.addListener(new ALAdapterS12S0200000_17(c1120360fGE, this, 7));
        }
        animatorArr2[1] = valueAnimatorOfFloat2;
        animatorSet2.playSequentially(animatorArr2);
        animatorArr[0] = animatorSet2;
        AnimatorSet animatorSet3 = new AnimatorSet();
        Animator[] animatorArr3 = new Animator[2];
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, -8.0f);
        if (z) {
            j3 = 350;
        } else if (this.LJ) {
            j3 = 100;
        } else {
            j3 = 150;
        }
        valueAnimatorOfFloat3.setDuration(j3);
        valueAnimatorOfFloat3.addUpdateListener(new AUListenerS224S0200000_17(this, c1120360fGE, 7));
        animatorArr3[0] = valueAnimatorOfFloat3;
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(-8.0f, 3.0f, 0.0f);
        if (!z) {
            if (this.LJ) {
                j4 = 100;
            } else {
                j4 = 150;
            }
        }
        valueAnimatorOfFloat4.setDuration(j4);
        valueAnimatorOfFloat4.addUpdateListener(new AUListenerS224S0200000_17(this, c1120360fGE, 8));
        animatorArr3[1] = valueAnimatorOfFloat4;
        animatorSet3.playSequentially(animatorArr3);
        animatorArr[1] = animatorSet3;
        animatorSet.playTogether(animatorArr);
        return animatorSet;
    }

    public final void LIZIZ(float f) {
        RectF rectF = this.LIZIZ;
        float fCenterX = rectF.centerX();
        float fCenterY = rectF.centerY();
        float f2 = (C1120360fGE.LLJ * f) / 2;
        rectF.left = fCenterX - f2;
        rectF.top = fCenterY - f2;
        rectF.right = fCenterX + f2;
        rectF.bottom = fCenterY + f2;
    }

    public C1120420fGK(C1120360fGE c1120360fGE, Bitmap bitmap, PointF pointF, PointF pointF2, boolean z) {
        this.LJI = c1120360fGE;
        this.LIZ = bitmap;
        RectF rectF = new RectF();
        this.LIZIZ = rectF;
        this.LIZJ = 255;
        this.LJ = !z;
        float f = pointF.x;
        float f2 = C1120360fGE.LLJ / 2;
        rectF.left = f - f2;
        float f3 = pointF.y;
        rectF.top = f3 - f2;
        rectF.right = f + f2;
        rectF.bottom = f3 + f2;
        AnimatorSet animatorSet = new AnimatorSet();
        if (!LiveLikeDegradeSettings.INSTANCE.disableAvatarAnim(c1120360fGE.LL) && !c1120360fGE.LLIZ) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new C419720Gd0(new PointF(pointF2.x, pointF.y)), pointF, pointF2);
            valueAnimatorOfObject.setDuration(1500L);
            valueAnimatorOfObject.setInterpolator(new AccelerateDecelerateInterpolator());
            valueAnimatorOfObject.addUpdateListener(new AUListenerS224S0200000_17(this, c1120360fGE, 10));
            valueAnimatorOfObject.addListener(new ALAdapterS12S0200000_17(c1120360fGE, this, 10));
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(255, 153);
            valueAnimatorOfInt.setDuration(500L);
            valueAnimatorOfInt.addUpdateListener(new AUListenerS266S0100000_17(this, 32));
            valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
            ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(153, 0);
            valueAnimatorOfInt2.setDuration(1000L);
            valueAnimatorOfInt2.addUpdateListener(new AUListenerS266S0100000_17(this, 33));
            valueAnimatorOfInt2.setInterpolator(new AccelerateDecelerateInterpolator());
            valueAnimatorOfInt2.setStartDelay(500L);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.4f, 0.5f);
            valueAnimatorOfFloat.setDuration(500L);
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS266S0100000_17(this, 34));
            animatorSet2.playTogether(valueAnimatorOfObject, valueAnimatorOfInt, valueAnimatorOfInt2, valueAnimatorOfFloat);
            animatorSet2.setStartDelay(200L);
            animatorSet.playSequentially(LIZ(false), animatorSet2);
        } else {
            animatorSet.playSequentially(LIZ(true));
        }
        this.LJFF = animatorSet;
    }
}
