package X;

import Y.AAListenerS317S0100000_6;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Gfu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C421520Gfu extends LinearLayout {
    public final Animator LL;
    public final Animator LLILLJJLI;
    public final long LLILLL;
    public final C01GW LLILZ;
    public final RunnableC421530Gfv LLILZIL;

    public final TuxIconView LIZ() {
        TuxIconView tuxIconView = new TuxIconView(getContext(), null, 0, 6, null);
        LinearLayout.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.gravity = 16;
        C786410Ut5.M6(tuxIconView, layoutParamsGenerateDefaultLayoutParams);
        tuxIconView.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        tuxIconView.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        tuxIconView.setIconRes(R.raw.icon_play_fill);
        tuxIconView.setTintColorRes(R.attr.ee);
        C786410Ut5.hc(tuxIconView, C426750GoL.LIZLLL(tuxIconView.getContext()) ? -1.0f : 1.0f);
        return tuxIconView;
    }

    public final SafeHandler getUiHandler() {
        return (SafeHandler) this.LLILZ.getValue();
    }

    public final void LIZJ() {
        int visibility = getVisibility();
        setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, this);
        this.LL.cancel();
        this.LLILLJJLI.cancel();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(200L);
        objectAnimatorOfFloat.addListener(new AAListenerS317S0100000_6(this, 10));
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }

    public final void LIZLLL() {
        getUiHandler().removeCallbacks(this.LLILZIL);
        this.LL.cancel();
        this.LLILLJJLI.cancel();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(200L);
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }

    public final Animator LIZIZ(final TuxIconView tuxIconView) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(tuxIconView, "alpha", 0.0f, 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(this.LLILLL);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: X.0GYH
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                C786410Ut5.T4(tuxIconView, 0.0f);
            }
        });
        return objectAnimatorOfFloat;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.0Gfv] */
    public C421520Gfu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLL = 800L;
        this.LLILZ = C452501pT.LIZIZ(new C422050Ggl(this));
        setOrientation(0);
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setTuxFont(32);
        tuxTextView.setTextColorRes(R.attr.ee);
        tuxTextView.setText(2131828459);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
        C786410Ut5.R6(tuxTextView, marginLayoutParams);
        TuxIconView tuxIconViewLIZ = LIZ();
        TuxIconView tuxIconViewLIZ2 = LIZ();
        C0H9H.LJFF(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-2)), tuxIconViewLIZ2);
        addView(tuxTextView);
        addView(tuxIconViewLIZ);
        addView(tuxIconViewLIZ2);
        this.LL = LIZIZ(tuxIconViewLIZ);
        this.LLILLJJLI = LIZIZ(tuxIconViewLIZ2);
        this.LLILZIL = new Runnable() { // from class: X.0Gfv
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("SpeedupHintView@218f.r$1");
                try {
                    this.LL.LLILLJJLI.start();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SpeedupHintView@218f.r$1");
            }
        };
    }
}
