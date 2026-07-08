package X;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Tkj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C755750Tkj {
    public View LIZ;
    public AnimatorSet LIZIZ;

    public C755750Tkj(View view) {
        int iIntValue;
        Context context;
        Integer numLIZJ;
        Context context2;
        Integer numLIZJ2;
        this.LIZ = view;
        C785820Us8 c785820Us8 = new C785820Us8(Integer.TYPE, 1);
        View view2 = this.LIZ;
        int iIntValue2 = -14625300;
        if (view2 != null && (context2 = view2.getContext()) != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.a09, context2)) != null) {
            iIntValue = numLIZJ2.intValue();
        } else {
            iIntValue = -14625300;
        }
        float f = 255;
        int iLJ = (iIntValue & 16777215) | (C13LZ.LJ((int) (0.1f * f), 0, 255) << 24);
        View view3 = this.LIZ;
        if (view3 != null && (context = view3.getContext()) != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a09, context)) != null) {
            iIntValue2 = numLIZJ.intValue();
        }
        int iLJ2 = (C13LZ.LJ((int) (f * 0.0f), 0, 255) << 24) | (iIntValue2 & 16777215);
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this.LIZ, c785820Us8, iLJ, iLJ2);
        objectAnimatorOfInt.setEvaluator(new ArgbEvaluator());
        objectAnimatorOfInt.setStartDelay(3000L);
        objectAnimatorOfInt.setDuration(300L);
        C786410Ut5.Pd(objectAnimatorOfInt);
        ObjectAnimator objectAnimatorOfInt2 = ObjectAnimator.ofInt(this.LIZ, c785820Us8, iLJ2, iLJ);
        objectAnimatorOfInt2.setEvaluator(new ArgbEvaluator());
        objectAnimatorOfInt2.setStartDelay(500L);
        objectAnimatorOfInt2.setDuration(300L);
        C786410Ut5.Pd(objectAnimatorOfInt2);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(objectAnimatorOfInt2, objectAnimatorOfInt);
        this.LIZIZ = animatorSet;
    }
}
