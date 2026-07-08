package X;

import Y.AUListenerS214S0200000_2;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: renamed from: X.06VM, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06VM extends FrameLayout {
    public TuxIconDrawable LL;
    public TuxIconDrawable LLILLJJLI;
    public Boolean LLILLL;
    public Boolean LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;

    private final TuxIconView getActiveIcon() {
        return (TuxIconView) this.LLILZLL.getValue();
    }

    private final TuxIconView getInactiveIcon() {
        return (TuxIconView) this.LLILZIL.getValue();
    }

    public final void LIZ() {
        TuxIconView activeIcon = isSelected() ? getActiveIcon() : getInactiveIcon();
        TuxIconView inactiveIcon = isSelected() ? getInactiveIcon() : getActiveIcon();
        C786410Ut5.hc(activeIcon, 0.0f);
        C786410Ut5.Cc(activeIcon, 0.0f);
        C786410Ut5.hc(inactiveIcon, 1.0f);
        C786410Ut5.Cc(inactiveIcon, 1.0f);
        ValueAnimator valueAnimatorOfFloat = ObjectAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator(1.5f));
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS214S0200000_2(activeIcon, this, 0));
        ValueAnimator valueAnimatorOfFloat2 = ObjectAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(new DecelerateInterpolator(1.5f));
        valueAnimatorOfFloat2.setDuration(200L);
        valueAnimatorOfFloat2.addUpdateListener(new AUListenerS214S0200000_2(inactiveIcon, this, 1));
        valueAnimatorOfFloat.start();
        valueAnimatorOfFloat2.start();
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

    public C06VM(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILZIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 1089));
        this.LLILZLL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 1088));
    }
}
