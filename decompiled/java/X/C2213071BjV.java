package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.TextView;
import java.util.HashMap;

/* JADX INFO: renamed from: X.1BjV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2213071BjV extends C2213171Bjf {
    public boolean LL;
    public final /* synthetic */ C2212931BjH LLILLJJLI;

    public C2213071BjV(C2212931BjH c2212931BjH) {
        this.LLILLJJLI = c2212931BjH;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.LLILLJJLI.LLLIIIIL = false;
        return super.onDown(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.LLILLJJLI.LLLIIIIL = true;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.LLILLJJLI.LLLIIIIL && f2 > 0.0f) {
            C2212051Bhr.LIZJ().LJIIIZ(this.LLILLJJLI.LLJLIL, "slide_up");
        }
        C2212931BjH c2212931BjH = this.LLILLJJLI;
        c2212931BjH.LLLIIIIL = true;
        if (!this.LL && f2 >= 0.0f && c2212931BjH.LLJZ > 1) {
            TextView textView = c2212931BjH.LLJJIJI;
            String str = c2212931BjH.LLJLIL.LLLLIIIILLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LLILLJJLI.LLJZ);
            String strReplace = "";
            sbLIZ.append("");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (!TextUtils.isEmpty(str)) {
                strReplace = str.replace("%", strLIZIZ);
            }
            textView.setText(strReplace);
            if (this.LLILLJJLI.LLJJIJI.getVisibility() != 0) {
                this.LLILLJJLI.LJIIJJI();
            }
            this.LL = true;
            C2212931BjH c2212931BjH2 = this.LLILLJJLI;
            if (c2212931BjH2.LLLFFI == null) {
                c2212931BjH2.LLLFFI = new AnimatorSet();
                AnimatorListenerAdapter animatorListenerAdapter = new AnimatorListenerAdapter() { // from class: X.1BjY
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        this.LL.LL = false;
                    }
                };
                ObjectAnimator duration = ObjectAnimator.ofFloat(this.LLILLJJLI.LLJJIJI, "alpha", 1.0f, 0.0f).setDuration(300L);
                ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.LLILLJJLI.LLJJIJIIJIL, "alpha", 1.0f, 0.0f).setDuration(300L);
                duration.addListener(animatorListenerAdapter);
                duration.setStartDelay(1000L);
                duration2.setStartDelay(1000L);
                C2212931BjH c2212931BjH3 = this.LLILLJJLI;
                AnimatorSet.Builder builderPlay = c2212931BjH3.LLLFFI.play(c2212931BjH3.LJIIIIZZ(c2212931BjH3.LLJJIJI));
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LLILLJJLI.LLJJIJIIJIL, "alpha", 0.0f, 1.0f);
                objectAnimatorOfFloat.setDuration(300L);
                builderPlay.with(objectAnimatorOfFloat).before(duration).before(duration2);
            }
            this.LLILLJJLI.LLLFFI.start();
            HashMap<String, Object> map = new HashMap<>(1);
            map.put("refer", "tips");
            C2212051Bhr.LIZJ().LJIIIIZZ(this.LLILLJJLI.LLJLIL, 0L, "othershow", map, null);
        }
        return true;
    }
}
