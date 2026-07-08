package X;

import Y.AAListenerS316S0100000_5;
import android.animation.Animator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0Efr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC370530Efr extends C214906198m {
    public final Context LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1281));
    public float LLILLL;
    public float LLILZ;

    public final boolean LJJIIZ() {
        return ((Boolean) this.LLILLJJLI.getValue()).booleanValue();
    }

    public final void LJJIIJ() {
        View contentView = getContentView();
        if (contentView != null) {
            contentView.animate().alpha(0.0f).translationYBy(C418440Gaw.LIZIZ(2)).setDuration(300L).setInterpolator(new InterpolatorC366870EZx()).setListener(new AAListenerS316S0100000_5(contentView, 6));
        }
    }

    public AbstractC370530Efr(Context context) {
        this.LL = context;
    }

    public void LJJIIJZLJL(float f, float f2, View view) {
        ViewGroup viewGroup;
        View contentView = getContentView();
        if (contentView != null) {
            C786410Ut5.T4(contentView, 0.0f);
        }
        View contentView2 = getContentView();
        if (contentView2 != null) {
            C368610Ecl.LIZIZ(contentView2);
        }
        if (getBackground() == null && getContentView() != null && getContentView().getParent() != null) {
            ViewParent parent = getContentView().getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(getContentView(), viewGroup);
            }
        }
        showAsDropDown(view, (int) this.LLILZ, (int) this.LLILLL);
    }

    public void LJJIJ(float f, float f2, View view) {
        if (isShowing()) {
            update(view, (int) this.LLILZ, (int) this.LLILLL, -1, -1);
        } else {
            LJJIIJZLJL(f, f2, view);
        }
        View contentView = getContentView();
        if (contentView != null && contentView.getVisibility() != 0) {
            C368610Ecl.LIZJ(contentView);
            C786410Ut5.ed(contentView, 0.0f);
            C786410Ut5.T4(contentView, 0.0f);
            contentView.animate().alpha(1.0f).setDuration(300L).setInterpolator(new InterpolatorC366870EZx()).setListener(new Animator.AnimatorListener() { // from class: X.0Efu
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
                }
            }).start();
        }
    }
}
