package X;

import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.share.systemshare.SystemShareFragment;

/* JADX INFO: renamed from: X.0IDK, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0IDK implements Animation.AnimationListener {
    public final int $t;
    public Object l0;

    public static final void onAnimationRepeat$0(C0IDK c0idk, Animation animation) {
    }

    public static final void onAnimationRepeat$1(C0IDK c0idk, Animation animation) {
    }

    public static final void onAnimationStart$0(C0IDK c0idk, Animation animation) {
    }

    public static final void onAnimationStart$1(C0IDK c0idk, Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animation);
                break;
            case 1:
                onAnimationEnd$1(this, animation);
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        switch (this.$t) {
            case 0:
                onAnimationRepeat$0(this, animation);
                break;
            case 1:
                onAnimationRepeat$1(this, animation);
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animation);
                break;
            case 1:
                onAnimationStart$1(this, animation);
                break;
        }
    }

    public C0IDK(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationEnd$0(C0IDK c0idk, Animation animation) {
        C421410Gfj c421410Gfj = (C421410Gfj) c0idk.l0;
        if (c421410Gfj.LLILZIL) {
            int visibility = c421410Gfj.getVisibility();
            c421410Gfj.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c421410Gfj);
        }
    }

    public static final void onAnimationEnd$1(C0IDK c0idk, Animation animation) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = ((SystemShareFragment) c0idk.l0).NR().getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            SystemShareFragment systemShareFragment = (SystemShareFragment) c0idk.l0;
            marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
            LinearLayout linearLayoutNR = systemShareFragment.NR();
            if (linearLayoutNR != null) {
                C786410Ut5.d6(linearLayoutNR, marginLayoutParams);
            }
            LinearLayout linearLayoutNR2 = systemShareFragment.NR();
            if (linearLayoutNR2 != null) {
                linearLayoutNR2.clearAnimation();
            }
        }
    }
}
