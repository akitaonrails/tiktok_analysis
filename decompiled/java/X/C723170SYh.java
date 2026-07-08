package X;

import Y.AUListenerS219S0200000_11;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0SYh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C723170SYh extends FrameLayout {
    public final TuxIconView LL;
    public final TuxIconView LLILLJJLI;

    public final void LIZ() {
        TuxIconView tuxIconView = isSelected() ? this.LLILLJJLI : this.LL;
        TuxIconView tuxIconView2 = isSelected() ? this.LL : this.LLILLJJLI;
        ValueAnimator valueAnimatorOfFloat = ObjectAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator(1.5f));
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS219S0200000_11(tuxIconView, this, 2));
        ValueAnimator valueAnimatorOfFloat2 = ObjectAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(new DecelerateInterpolator(1.5f));
        valueAnimatorOfFloat2.setDuration(200L);
        valueAnimatorOfFloat2.addUpdateListener(new AUListenerS219S0200000_11(tuxIconView2, this, 3));
        valueAnimatorOfFloat.start();
        valueAnimatorOfFloat2.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TuxIconView tuxIconView = this.LLILLJJLI;
        if (tuxIconView != null) {
            tuxIconView.setTintColorRes(R.attr.a1h);
        }
    }

    public final void setActiveIcon(C419910GdJ c419910GdJ) {
        TuxIconView tuxIconView = this.LL;
        if (tuxIconView != null) {
            tuxIconView.setTuxIcon(c419910GdJ);
        }
    }

    public final void setInActiveIcon(C419910GdJ c419910GdJ) {
        TuxIconView tuxIconView = this.LLILLJJLI;
        if (tuxIconView != null) {
            tuxIconView.setTuxIcon(c419910GdJ);
        }
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        if (z) {
            TuxIconView tuxIconView = this.LL;
            if (tuxIconView != null) {
                C786410Ut5.hc(tuxIconView, 1.0f);
            }
            TuxIconView tuxIconView2 = this.LL;
            if (tuxIconView2 != null) {
                C786410Ut5.Cc(tuxIconView2, 1.0f);
            }
            TuxIconView tuxIconView3 = this.LLILLJJLI;
            if (tuxIconView3 != null) {
                C786410Ut5.hc(tuxIconView3, 0.0f);
            }
            TuxIconView tuxIconView4 = this.LLILLJJLI;
            if (tuxIconView4 != null) {
                C786410Ut5.Cc(tuxIconView4, 0.0f);
                return;
            }
            return;
        }
        TuxIconView tuxIconView5 = this.LL;
        if (tuxIconView5 != null) {
            C786410Ut5.hc(tuxIconView5, 0.0f);
        }
        TuxIconView tuxIconView6 = this.LL;
        if (tuxIconView6 != null) {
            C786410Ut5.Cc(tuxIconView6, 0.0f);
        }
        TuxIconView tuxIconView7 = this.LLILLJJLI;
        if (tuxIconView7 != null) {
            C786410Ut5.hc(tuxIconView7, 1.0f);
        }
        TuxIconView tuxIconView8 = this.LLILLJJLI;
        if (tuxIconView8 == null) {
            return;
        }
        C786410Ut5.Cc(tuxIconView8, 1.0f);
    }

    public C723170SYh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View viewSd = C786410Ut5.Sd(R.layout.a4z, C786410Ut5.ne(context), this);
        this.LL = (TuxIconView) viewSd.findViewById(R.id.a5g);
        this.LLILLJJLI = (TuxIconView) viewSd.findViewById(R.id.kin);
    }
}
