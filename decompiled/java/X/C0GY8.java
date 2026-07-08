package X;

import Y.AUListenerS256S0100000_6;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.text.SpannableString;
import android.view.animation.PathInterpolator;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.0GY8, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GY8 {
    public ValueAnimator LIZ;
    public C0GVE LIZIZ;

    public static void LIZ(C0GY8 c0gy8, TuxTextView tuxTextView, boolean z, int i) {
        int length;
        long j;
        SpannableString spannableString;
        float f;
        CharSequence text;
        if ((i & 4) != 0 && tuxTextView != null && (text = tuxTextView.getText()) != null) {
            length = text.length();
        } else {
            length = 0;
        }
        if ((i & 8) != 0) {
            j = 2000;
        } else {
            j = 0;
        }
        if ((i & 16) != 0) {
            z = false;
        }
        if (tuxTextView == null) {
            c0gy8.getClass();
            return;
        }
        ValueAnimator valueAnimator = c0gy8.LIZ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        c0gy8.LIZ = null;
        if (tuxTextView.getText() instanceof SpannableString) {
            spannableString = (SpannableString) tuxTextView.getText();
        } else {
            spannableString = new SpannableString(tuxTextView.getText());
        }
        C0GVE c0gve = new C0GVE(tuxTextView);
        c0gy8.LIZIZ = c0gve;
        C786410Ut5.p2(spannableString, c0gve, 0, length, 33);
        tuxTextView.setText(spannableString);
        ValueAnimator valueAnimator2 = c0gy8.LIZ;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        float[] fArr = new float[2];
        float f2 = 1.3f;
        if (z) {
            f = 1.3f;
        } else {
            f = -0.3f;
        }
        fArr[0] = f;
        if (z) {
            f2 = -0.3f;
        }
        fArr[1] = f2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.setInterpolator(new PathInterpolator(0.0f, 0.15f, 0.46f, 1.0f));
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6(c0gy8, 157));
        final long j2 = 100;
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: X.0Gc7
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
                ValueAnimator valueAnimator3;
                if ((animator instanceof ValueAnimator) && (valueAnimator3 = (ValueAnimator) animator) != null) {
                    valueAnimator3.pause();
                    valueAnimator3.setCurrentPlayTime(0L);
                    valueAnimator3.setStartDelay(j2);
                    valueAnimator3.resume();
                }
            }
        });
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        c0gy8.LIZ = valueAnimatorOfFloat;
        valueAnimatorOfFloat.start();
    }
}
