package X;

import Y.AUListenerS234S0200000_32;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.18ka, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21373018ka extends FrameLayout {
    public TuxIconView LL;
    public TuxIconView LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;

    private final TuxIconView getActiveIcon() {
        return (TuxIconView) this.LLILZ.getValue();
    }

    private final TuxIconView getInactiveIcon() {
        return (TuxIconView) this.LLILLL.getValue();
    }

    public final TuxIconView getPostModeLikeIconActiveFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rl4);
            this.LLILLJJLI = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxIconView getPostModeLikeIconInactiveFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rl5);
            this.LL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final void LIZ() {
        TuxIconView inactiveIcon = isSelected() ? getInactiveIcon() : getActiveIcon();
        TuxIconView activeIcon = isSelected() ? getActiveIcon() : getInactiveIcon();
        ValueAnimator valueAnimatorOfFloat = ObjectAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator(1.5f));
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS234S0200000_32(inactiveIcon, this, 3));
        ValueAnimator valueAnimatorOfFloat2 = ObjectAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(new DecelerateInterpolator(1.5f));
        valueAnimatorOfFloat2.setDuration(200L);
        valueAnimatorOfFloat2.addUpdateListener(new AUListenerS234S0200000_32(activeIcon, this, 4));
        valueAnimatorOfFloat.start();
        valueAnimatorOfFloat2.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getInactiveIcon().setTintColorRes(R.attr.a1h);
    }

    public final void setIconSize(int i) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(i, i);
        }
        layoutParams.width = i;
        layoutParams.height = i;
        C786410Ut5.W5(this, layoutParams);
        for (TuxIconView tuxIconView : C13LQ.LJIIJJI(new TuxIconView[]{getInactiveIcon(), getActiveIcon()})) {
            ViewGroup.LayoutParams layoutParams2 = tuxIconView.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new ViewGroup.LayoutParams(i, i);
            }
            layoutParams2.width = i;
            layoutParams2.height = i;
            C786410Ut5.W5(tuxIconView, layoutParams2);
            tuxIconView.setIconWidth(i);
            tuxIconView.setIconHeight(i);
        }
    }

    public final void setPostModeLikeIconActiveFromXml(TuxIconView tuxIconView) {
        this.LLILLJJLI = tuxIconView;
    }

    public final void setPostModeLikeIconInactiveFromXml(TuxIconView tuxIconView) {
        this.LL = tuxIconView;
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        if (z) {
            C786410Ut5.hc(getActiveIcon(), 1.0f);
            C786410Ut5.Cc(getActiveIcon(), 1.0f);
            C786410Ut5.hc(getInactiveIcon(), 0.0f);
            C786410Ut5.Cc(getInactiveIcon(), 0.0f);
            return;
        }
        C786410Ut5.hc(getActiveIcon(), 0.0f);
        C786410Ut5.Cc(getActiveIcon(), 0.0f);
        C786410Ut5.hc(getInactiveIcon(), 1.0f);
        C786410Ut5.Cc(getInactiveIcon(), 1.0f);
    }

    public C21373018ka(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 747));
        this.LLILZ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 746));
        C786410Ut5.Sd(R.layout.ea8, C786410Ut5.ne(context), this);
    }
}
