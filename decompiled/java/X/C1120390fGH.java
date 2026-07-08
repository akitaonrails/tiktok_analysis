package X;

import Y.ALAdapterS12S0200000_17;
import Y.AUListenerS266S0100000_17;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveLikeDegradeSettings;

/* JADX INFO: renamed from: X.0fGH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1120390fGH {
    public ImageView LIZ;
    public final boolean LIZIZ;
    public final AnimatorSet LIZJ;
    public final /* synthetic */ C1120350fGD LIZLLL;

    public final AnimatorSet LIZ(boolean z) {
        long j;
        long j2;
        long j3;
        long j4;
        AnimatorSet animatorSet = new AnimatorSet();
        C1120350fGD c1120350fGD = this.LIZLLL;
        ImageView imageView = this.LIZ;
        if (imageView != null) {
            C786410Ut5.LJZI(0, imageView);
            if (c1120350fGD.LLIZ) {
                imageView.setLayerType(2, null);
            }
            Animator[] animatorArr = new Animator[2];
            AnimatorSet animatorSet2 = new AnimatorSet();
            Animator[] animatorArr2 = new Animator[2];
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.5f);
            if (z) {
                j = 350;
            } else if (this.LIZIZ) {
                j = 100;
            } else {
                j = 150;
            }
            valueAnimatorOfFloat.setDuration(j);
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS266S0100000_17(this, 17));
            animatorArr2[0] = valueAnimatorOfFloat;
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.5f, 1.36f, 1.4f);
            if (z) {
                j2 = 350;
            } else if (this.LIZIZ) {
                j2 = 100;
            } else {
                j2 = 150;
            }
            valueAnimatorOfFloat2.setDuration(j2);
            valueAnimatorOfFloat2.addUpdateListener(new AUListenerS266S0100000_17(this, 18));
            if (z) {
                valueAnimatorOfFloat2.addListener(new ALAdapterS12S0200000_17(this, c1120350fGD, 6));
            }
            animatorArr2[1] = valueAnimatorOfFloat2;
            animatorSet2.playSequentially(animatorArr2);
            animatorArr[0] = animatorSet2;
            AnimatorSet animatorSet3 = new AnimatorSet();
            Animator[] animatorArr3 = new Animator[2];
            ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, -8.0f);
            if (z) {
                j3 = 350;
            } else if (this.LIZIZ) {
                j3 = 100;
            } else {
                j3 = 150;
            }
            valueAnimatorOfFloat3.setDuration(j3);
            valueAnimatorOfFloat3.addUpdateListener(new AUListenerS266S0100000_17(this, 19));
            animatorArr3[0] = valueAnimatorOfFloat3;
            ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(-8.0f, 3.0f, 0.0f);
            if (z) {
                j4 = 350;
            } else if (this.LIZIZ) {
                j4 = 100;
            } else {
                j4 = 150;
            }
            valueAnimatorOfFloat4.setDuration(j4);
            valueAnimatorOfFloat4.addUpdateListener(new AUListenerS266S0100000_17(this, 20));
            animatorArr3[1] = valueAnimatorOfFloat4;
            animatorSet3.playSequentially(animatorArr3);
            animatorArr[1] = animatorSet3;
            animatorSet.playTogether(animatorArr);
        }
        return animatorSet;
    }

    public C1120390fGH(C1120350fGD c1120350fGD, Bitmap bitmap, PointF pointF, PointF pointF2, boolean z) {
        this.LIZLLL = c1120350fGD;
        this.LIZIZ = !z;
        ImageView imageViewLIZIZ = c1120350fGD.LLILZLL.LIZIZ();
        this.LIZ = imageViewLIZIZ;
        if (imageViewLIZIZ == null) {
            ImageView imageView = new ImageView(c1120350fGD.getContext());
            this.LIZ = imageView;
            int i = C1120350fGD.LLJILJIL;
            c1120350fGD.addView(imageView, new ViewGroup.LayoutParams(i, i));
            imageView.layout(0, 0, i, i);
        }
        ImageView imageView2 = this.LIZ;
        if (imageView2 != null) {
            imageView2.setImageBitmap(bitmap);
            C786410Ut5.V4(imageView2, 1.0f);
        }
        ImageView imageView3 = this.LIZ;
        if (imageView3 != null) {
            float f = pointF.x;
            float f2 = C1120350fGD.LLJILJIL / 2;
            C786410Ut5.Lc(imageView3, f - f2);
            C786410Ut5.gd(imageView3, pointF.y - f2);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        if (!LiveLikeDegradeSettings.INSTANCE.disableAvatarAnim(c1120350fGD.LL) && !c1120350fGD.LLJI) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new C419720Gd0(new PointF(pointF2.x, pointF.y)), pointF, pointF2);
            valueAnimatorOfObject.setDuration(1500L);
            valueAnimatorOfObject.setInterpolator(new AccelerateDecelerateInterpolator());
            valueAnimatorOfObject.addUpdateListener(new AUListenerS266S0100000_17(this, 26));
            valueAnimatorOfObject.addListener(new ALAdapterS12S0200000_17(this, c1120350fGD, 8));
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(255, 153);
            valueAnimatorOfInt.setDuration(500L);
            valueAnimatorOfInt.addUpdateListener(new AUListenerS266S0100000_17(this, 27));
            valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
            ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(153, 0);
            valueAnimatorOfInt2.setDuration(1000L);
            valueAnimatorOfInt2.addUpdateListener(new AUListenerS266S0100000_17(this, 28));
            valueAnimatorOfInt2.setInterpolator(new AccelerateDecelerateInterpolator());
            valueAnimatorOfInt2.setStartDelay(500L);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.4f, 0.5f);
            valueAnimatorOfFloat.setDuration(500L);
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS266S0100000_17(this, 29));
            animatorSet2.playTogether(valueAnimatorOfObject, valueAnimatorOfInt, valueAnimatorOfInt2, valueAnimatorOfFloat);
            animatorSet2.setStartDelay(200L);
            animatorSet.playSequentially(LIZ(false), animatorSet2);
        } else {
            animatorSet.playSequentially(LIZ(true));
        }
        this.LIZJ = animatorSet;
    }
}
