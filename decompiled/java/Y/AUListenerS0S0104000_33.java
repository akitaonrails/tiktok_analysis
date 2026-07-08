package Y;

import X.C12DM;
import X.C194W;
import X.C194X;
import X.C19Y4;
import X.C19YB;
import X.C19YL;
import X.C19YV;
import X.C19YZ;
import X.C21556419Xu;
import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes34.dex */
public class AUListenerS0S0104000_33 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public int i1;
    public int i2;
    public int i3;
    public int i4;
    public Object l0;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$t) {
            case 0:
                onAnimationUpdate$0(this, valueAnimator);
                break;
            case 1:
                onAnimationUpdate$1(this, valueAnimator);
                break;
            case 2:
                onAnimationUpdate$2(this, valueAnimator);
                break;
            case 3:
                onAnimationUpdate$3(this, valueAnimator);
                break;
            case 4:
                onAnimationUpdate$4(this, valueAnimator);
                break;
            case 5:
                onAnimationUpdate$5(this, valueAnimator);
                break;
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS0S0104000_33 aUListenerS0S0104000_33, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        C19YV c19yv = (C19YV) aUListenerS0S0104000_33.l0;
        int i = aUListenerS0S0104000_33.i1;
        int i2 = aUListenerS0S0104000_33.i2;
        c19yv.getClass();
        int iRound = i + Math.round((i2 - i) * animatedFraction);
        C19YV c19yv2 = (C19YV) aUListenerS0S0104000_33.l0;
        int i3 = aUListenerS0S0104000_33.i3;
        int i4 = aUListenerS0S0104000_33.i4;
        c19yv2.getClass();
        int iRound2 = i3 + Math.round(animatedFraction * (i4 - i3));
        if (iRound != c19yv.LLILZLL || iRound2 != c19yv.LLIZ) {
            c19yv.LLILZLL = iRound;
            c19yv.LLIZ = iRound2;
            c19yv.postInvalidateOnAnimation();
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS0S0104000_33 aUListenerS0S0104000_33, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        C21556419Xu c21556419Xu = (C21556419Xu) aUListenerS0S0104000_33.l0;
        int i = aUListenerS0S0104000_33.i1;
        int i2 = aUListenerS0S0104000_33.i2;
        c21556419Xu.getClass();
        int iRound = i + Math.round((i2 - i) * animatedFraction);
        C21556419Xu c21556419Xu2 = (C21556419Xu) aUListenerS0S0104000_33.l0;
        int i3 = aUListenerS0S0104000_33.i3;
        int i4 = aUListenerS0S0104000_33.i4;
        c21556419Xu2.getClass();
        int iRound2 = i3 + Math.round(animatedFraction * (i4 - i3));
        if (iRound != c21556419Xu.LLILZIL || iRound2 != c21556419Xu.LLILZLL) {
            c21556419Xu.LLILZIL = iRound;
            c21556419Xu.LLILZLL = iRound2;
            c21556419Xu.postInvalidateOnAnimation();
        }
    }

    public static final void onAnimationUpdate$2(AUListenerS0S0104000_33 aUListenerS0S0104000_33, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        C19YZ c19yz = (C19YZ) aUListenerS0S0104000_33.l0;
        int i = aUListenerS0S0104000_33.i1;
        int i2 = aUListenerS0S0104000_33.i2;
        C12DM c12dm = C194W.LIZ;
        int iRound = i + Math.round((i2 - i) * animatedFraction);
        int iRound2 = aUListenerS0S0104000_33.i3 + Math.round(animatedFraction * (aUListenerS0S0104000_33.i4 - r1));
        if (iRound != c19yz.LLILZLL || iRound2 != c19yz.LLIZ) {
            c19yz.LLILZLL = iRound;
            c19yz.LLIZ = iRound2;
            c19yz.postInvalidateOnAnimation();
        }
    }

    public static final void onAnimationUpdate$3(AUListenerS0S0104000_33 aUListenerS0S0104000_33, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        C19Y4 c19y4 = (C19Y4) aUListenerS0S0104000_33.l0;
        int i = aUListenerS0S0104000_33.i1;
        int i2 = aUListenerS0S0104000_33.i2;
        c19y4.getClass();
        int iRound = i + Math.round((i2 - i) * animatedFraction);
        C19Y4 c19y42 = (C19Y4) aUListenerS0S0104000_33.l0;
        int i3 = aUListenerS0S0104000_33.i3;
        int i4 = aUListenerS0S0104000_33.i4;
        c19y42.getClass();
        int iRound2 = i3 + Math.round(animatedFraction * (i4 - i3));
        if (iRound != c19y4.LLILZIL || iRound2 != c19y4.LLILZLL) {
            c19y4.LLILZIL = iRound;
            c19y4.LLILZLL = iRound2;
            c19y4.postInvalidateOnAnimation();
        }
    }

    public static final void onAnimationUpdate$4(AUListenerS0S0104000_33 aUListenerS0S0104000_33, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        C19YL c19yl = (C19YL) aUListenerS0S0104000_33.l0;
        int i = aUListenerS0S0104000_33.i1;
        int i2 = aUListenerS0S0104000_33.i2;
        c19yl.getClass();
        int iRound = i + Math.round((i2 - i) * animatedFraction);
        C19YL c19yl2 = (C19YL) aUListenerS0S0104000_33.l0;
        int i3 = aUListenerS0S0104000_33.i3;
        int i4 = aUListenerS0S0104000_33.i4;
        c19yl2.getClass();
        int iRound2 = i3 + Math.round(animatedFraction * (i4 - i3));
        if (iRound != c19yl.LLILZIL || iRound2 != c19yl.LLILZLL) {
            c19yl.LLILZIL = iRound;
            c19yl.LLILZLL = iRound2;
            c19yl.postInvalidateOnAnimation();
        }
    }

    public static final void onAnimationUpdate$5(AUListenerS0S0104000_33 aUListenerS0S0104000_33, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        C19YB c19yb = (C19YB) aUListenerS0S0104000_33.l0;
        int i = aUListenerS0S0104000_33.i1;
        int i2 = aUListenerS0S0104000_33.i2;
        C12DM c12dm = C194X.LIZ;
        int iRound = i + Math.round((i2 - i) * animatedFraction);
        int iRound2 = aUListenerS0S0104000_33.i3 + Math.round(animatedFraction * (aUListenerS0S0104000_33.i4 - r1));
        if (iRound != c19yb.LLILZLL || iRound2 != c19yb.LLIZ) {
            c19yb.LLILZLL = iRound;
            c19yb.LLIZ = iRound2;
            c19yb.postInvalidateOnAnimation();
        }
    }

    public AUListenerS0S0104000_33(Object obj, int i, int i2, int i3, int i4, int i5) {
        this.$t = i5;
        this.l0 = obj;
        this.i1 = i;
        this.i2 = i2;
        this.i3 = i3;
        this.i4 = i4;
    }
}
