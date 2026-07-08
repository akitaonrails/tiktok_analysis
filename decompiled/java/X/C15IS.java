package X;

import Y.ALAdapterS25S0100000_31;
import Y.ALAdapterS25S0200000_31;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.15IS, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15IS {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(TuxIconView tuxIconView, C15IT c15it) {
        if (tuxIconView != null) {
            tuxIconView.clearAnimation();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(tuxIconView, "scaleX", 1.0f, 1.08f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(tuxIconView, "scaleY", 1.0f, 1.08f);
            objectAnimatorOfFloat.setDuration(100L);
            objectAnimatorOfFloat2.setDuration(100L);
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(tuxIconView, "scaleX", 1.08f, 0.0f);
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(tuxIconView, "scaleY", 1.08f, 0.0f);
            objectAnimatorOfFloat3.setDuration(100L);
            objectAnimatorOfFloat4.setDuration(100L);
            ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(tuxIconView, "alpha", 0.0f, 1.0f);
            ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(tuxIconView, "alpha", 1.0f, 0.0f);
            objectAnimatorOfFloat6.setDuration(100L);
            objectAnimatorOfFloat5.setDuration(100L);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
            animatorSet.play(objectAnimatorOfFloat3).with(objectAnimatorOfFloat4).with(objectAnimatorOfFloat6).after(objectAnimatorOfFloat);
            ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(tuxIconView, "scaleX", 0.0f, 1.08f);
            ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(tuxIconView, "scaleY", 0.0f, 1.08f);
            objectAnimatorOfFloat7.setDuration(100L);
            objectAnimatorOfFloat8.setDuration(100L);
            ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(tuxIconView, "scaleX", 1.08f, 1.0f);
            ObjectAnimator objectAnimatorOfFloat10 = ObjectAnimator.ofFloat(tuxIconView, "scaleY", 1.08f, 1.0f);
            objectAnimatorOfFloat9.setDuration(100L);
            objectAnimatorOfFloat9.setDuration(100L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.play(objectAnimatorOfFloat7).with(objectAnimatorOfFloat8).with(objectAnimatorOfFloat5);
            animatorSet2.play(objectAnimatorOfFloat9).with(objectAnimatorOfFloat10).after(objectAnimatorOfFloat7);
            animatorSet.addListener(new ALAdapterS25S0200000_31(animatorSet2, c15it, 0));
            animatorSet2.addListener(new ALAdapterS25S0100000_31(c15it, 0));
            animatorSet.start();
        }
    }

    public static void LIZIZ(TuxIconView tuxIconView, int i) {
        if (tuxIconView != null) {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        C786410Ut5.LLLLLLZZ(tuxIconView, 8);
                        return;
                    }
                    return;
                } else {
                    C786410Ut5.LLLLLLZZ(tuxIconView, 0);
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = R.raw.icon_bookmark;
                    c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
                    tuxIconView.setTuxIcon(c419910GdJ);
                    return;
                }
            }
            C786410Ut5.LLLLLLZZ(tuxIconView, 0);
            C419910GdJ c419910GdJ2 = new C419910GdJ();
            c419910GdJ2.LIZ = R.raw.icon_bookmark_fill;
            c419910GdJ2.LJ = Integer.valueOf(R.attr.a1h);
            tuxIconView.setTuxIcon(c419910GdJ2);
        }
    }
}
