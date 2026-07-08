package X;

import Y.AUListenerS234S0200000_32;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.18kb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21373118kb extends FrameLayout {
    public final C01GW LL;
    public final C01GW LLILLJJLI;

    private final TuxIconView getActiveIcon() {
        return (TuxIconView) this.LLILLJJLI.getValue();
    }

    private final TuxIconView getInactiveIcon() {
        return (TuxIconView) this.LL.getValue();
    }

    public final void LIZ(boolean z) {
        TuxIconView inactiveIcon;
        TuxIconView activeIcon;
        if (z) {
            inactiveIcon = getActiveIcon();
            activeIcon = getInactiveIcon();
        } else {
            inactiveIcon = getInactiveIcon();
            activeIcon = getActiveIcon();
        }
        ValueAnimator valueAnimatorOfFloat = ObjectAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator(1.5f));
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS234S0200000_32(inactiveIcon, this, 5));
        ValueAnimator valueAnimatorOfFloat2 = ObjectAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(new DecelerateInterpolator(1.5f));
        valueAnimatorOfFloat2.setDuration(200L);
        valueAnimatorOfFloat2.addUpdateListener(new AUListenerS234S0200000_32(activeIcon, this, 6));
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

    public C21373118kb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 707));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS576S0100000_32(this, 706));
        C786410Ut5.Sd(R.layout.ds5, C786410Ut5.ne(context), this);
    }
}
