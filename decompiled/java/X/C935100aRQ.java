package X;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0aRQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C935100aRQ implements InterfaceC500690JkJ {
    public View LIZ;
    public AnimatorSet LIZIZ;

    @Override // X.InterfaceC500690JkJ
    public final void release() {
        this.LIZ = null;
        AnimatorSet animatorSet = this.LIZIZ;
        if (animatorSet != null) {
            animatorSet.setTarget(null);
        }
        AnimatorSet animatorSet2 = this.LIZIZ;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.LIZIZ = null;
    }

    @Override // X.InterfaceC500690JkJ
    public final void LIZ() {
        AnimatorSet animatorSet = this.LIZIZ;
        if (animatorSet == null || !animatorSet.isStarted()) {
            C20441214yg.LIZIZ("MultiGuestHighLightAnimationHelper", "onAppear");
            AnimatorSet animatorSet2 = this.LIZIZ;
            if (animatorSet2 != null) {
                animatorSet2.start();
            }
        }
    }

    public final int LIZIZ() {
        Context context;
        Integer numValueOf;
        View view = this.LIZ;
        if (view == null || (context = view.getContext()) == null) {
            return -14625300;
        }
        if (C960203pA.LIZIZ(context)) {
            numValueOf = C1308910kAL.LIZJ(R.attr.c9c, context);
        } else {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.eus, context);
            numValueOf = Integer.valueOf(numLIZJ != null ? numLIZJ.intValue() : -14625300);
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return -14625300;
    }

    public C935100aRQ(View view) {
        this.LIZ = view;
        C986850bmt c986850bmt = new C986850bmt(Integer.TYPE, 1);
        float f = 255;
        int iLIZIZ = (LIZIZ() & 16777215) | (C13LZ.LJ((int) (0.08f * f), 0, 255) << 24);
        int iLJ = (C13LZ.LJ((int) (f * 0.0f), 0, 255) << 24) | (LIZIZ() & 16777215);
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this.LIZ, c986850bmt, iLIZIZ, iLJ);
        objectAnimatorOfInt.setEvaluator(new ArgbEvaluator());
        objectAnimatorOfInt.setStartDelay(3000L);
        objectAnimatorOfInt.setDuration(300L);
        C786410Ut5.Pd(objectAnimatorOfInt);
        ObjectAnimator objectAnimatorOfInt2 = ObjectAnimator.ofInt(this.LIZ, c986850bmt, iLJ, iLIZIZ);
        objectAnimatorOfInt2.setEvaluator(new ArgbEvaluator());
        objectAnimatorOfInt2.setStartDelay(500L);
        objectAnimatorOfInt2.setDuration(300L);
        C786410Ut5.Pd(objectAnimatorOfInt2);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(objectAnimatorOfInt2, objectAnimatorOfInt);
        this.LIZIZ = animatorSet;
    }
}
