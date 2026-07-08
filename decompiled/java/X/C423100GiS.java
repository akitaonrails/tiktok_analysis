package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GiS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C423100GiS extends FrameLayout {
    public AnimatorSet LL;
    public AnimatorSet LLILLJJLI;
    public C0GWS LLILLL;
    public float LLILZ;

    public final void LIZ() {
        this.LL.removeAllListeners();
        this.LLILLJJLI.removeAllListeners();
        this.LL.end();
        this.LLILLJJLI.end();
        C0GWS c0gws = this.LLILLL;
        c0gws.LLJILJILJ.removeAllUpdateListeners();
        c0gws.LLJILJILJ.end();
    }

    public C423100GiS(Context context) {
        this(context, null, 0);
    }

    public C423100GiS(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C423100GiS(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        View viewSd = C786410Ut5.Sd(R.layout.b9h, C786410Ut5.ne(context), null);
        this.LLILLL = (C0GWS) viewSd.findViewById(R.id.lr1);
        View viewFindViewById = viewSd.findViewById(R.id.lh6);
        addView(viewSd, new FrameLayout.LayoutParams(-1, -1));
        this.LLILZ = (int) TypedValue.applyDimension(1, 1.0f, context.getResources().getDisplayMetrics());
        this.LL = new AnimatorSet();
        this.LLILLJJLI = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewFindViewById, "rotation", 0.0f, 60.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(viewFindViewById, "translationY", 0.0f, this.LLILZ * (-60.0f));
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(viewFindViewById, "rotation", 60.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(viewFindViewById, "translationY", this.LLILZ * (-60.0f), 0.0f);
        this.LL.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
        this.LLILLJJLI.play(objectAnimatorOfFloat3).with(objectAnimatorOfFloat4);
        viewFindViewById.setPivotX((int) TypedValue.applyDimension(1, 114.0f, context.getResources().getDisplayMetrics()));
        viewFindViewById.setPivotY((int) TypedValue.applyDimension(1, 60.0f, context.getResources().getDisplayMetrics()));
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator(4.0f));
        objectAnimatorOfFloat2.setDuration(1000L);
        objectAnimatorOfFloat2.setInterpolator(new DecelerateInterpolator(4.0f));
        objectAnimatorOfFloat3.setDuration(1000L);
        objectAnimatorOfFloat3.setInterpolator(new DecelerateInterpolator(2.0f));
        objectAnimatorOfFloat4.setDuration(1000L);
        objectAnimatorOfFloat4.setInterpolator(new DecelerateInterpolator(2.0f));
        this.LL.addListener(new AnimatorListenerAdapter() { // from class: X.0GiT
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                AnimatorSet animatorSet = this.LL.LLILLJJLI;
                if (animatorSet != null) {
                    animatorSet.start();
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                this.LL.LLILLL.LLJILJILJ.start();
            }
        });
        this.LLILLJJLI.addListener(new AnimatorListenerAdapter() { // from class: X.0GiU
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                C423100GiS c423100GiS = this.LL;
                if (c423100GiS.LLILLJJLI != null) {
                    c423100GiS.LL.start();
                }
            }
        });
    }
}
