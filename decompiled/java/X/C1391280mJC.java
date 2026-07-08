package X;

import Y.ALAdapterS17S0100000_21;
import Y.AUListenerS270S0100000_21;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.tux.navigation.TuxNavBar;

/* JADX INFO: renamed from: X.0mJC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1391280mJC extends FrameLayout {
    public final TuxNavBar LL;
    public final TuxNavBar LLILLJJLI;
    public C0OM1 LLILLL;
    public final ValueAnimator LLILZ;

    public final int getCurrentNavBarBackgroundColor() {
        return this.LL.getNavBackgroundColor$tux_theme_release();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLILZ.cancel();
    }

    public final void setAlignment(C0P2N c0p2n) {
        if (c0p2n == null) {
            return;
        }
        this.LL.setAlignment(c0p2n);
        this.LLILLJJLI.setAlignment(c0p2n);
    }

    public final void setNavActions(C0OM1 c0om1) {
        if (this.LLILZ.isRunning()) {
            this.LLILZ.cancel();
        }
        if (c0om1 == null) {
            C786410Ut5.LLLLZLLLI(this.LL, 8);
            C786410Ut5.LLLLZLLLI(this.LLILLJJLI, 8);
        } else if (this.LLILLL == null) {
            C786410Ut5.LLLLZLLLI(this.LL, 0);
            this.LL.setNavActions(c0om1);
            C786410Ut5.LLLLZLLLI(this.LLILLJJLI, 8);
        } else {
            C786410Ut5.LLLLZLLLI(this.LL, 0);
            C786410Ut5.LLLLZLLLI(this.LLILLJJLI, 0);
            C786410Ut5.C5(this.LL, 0.0f);
            C786410Ut5.C5(this.LLILLJJLI, 1.0f);
            this.LL.setNavActions(c0om1);
            C0OM1 c0om12 = this.LLILLL;
            if (c0om12 != null) {
                this.LLILLJJLI.setNavActions(c0om12);
            }
            this.LLILZ.start();
        }
        this.LLILLL = c0om1;
    }

    public final void setNavBarBackgroundColor(int i) {
        this.LL.setNavBackground(i);
        this.LLILLJJLI.setNavBackground(i);
    }

    public C1391280mJC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TuxNavBar tuxNavBar = new TuxNavBar(context, null, 6);
        this.LL = tuxNavBar;
        TuxNavBar tuxNavBar2 = new TuxNavBar(context, null, 6);
        this.LLILLJJLI = tuxNavBar2;
        addView(tuxNavBar2);
        addView(tuxNavBar);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.LLILZ = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS270S0100000_21(this, 42));
        valueAnimatorOfFloat.addListener(new ALAdapterS17S0100000_21(this, 7));
    }
}
