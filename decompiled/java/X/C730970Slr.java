package X;

import Y.AUListenerS219S0200000_11;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: renamed from: X.0Slr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C730970Slr extends FrameLayout {
    public final C01GW LL;
    public TuxIconView LLILLJJLI;
    public TuxIconView LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;

    private final TuxIconView getActiveIcon() {
        return (TuxIconView) this.LLILZIL.getValue();
    }

    private final int getIconSize() {
        return ((Number) this.LL.getValue()).intValue();
    }

    private final TuxIconView getInactiveIcon() {
        return (TuxIconView) this.LLILZ.getValue();
    }

    public final TuxIconView getVideoLikeIconActiveFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.k1j);
            this.LLILLL = (TuxIconView) callbackFindViewById;
        }
        TuxIconView tuxIconView = (TuxIconView) callbackFindViewById;
        if (tuxIconView == null) {
            return null;
        }
        tuxIconView.setIconHeight(getIconSize());
        tuxIconView.setIconWidth(getIconSize());
        return tuxIconView;
    }

    public final TuxIconView getVideoLikeIconInactiveFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.k1k);
            this.LLILLJJLI = (TuxIconView) callbackFindViewById;
        }
        TuxIconView tuxIconView = (TuxIconView) callbackFindViewById;
        if (tuxIconView == null) {
            return null;
        }
        tuxIconView.setIconHeight(getIconSize());
        tuxIconView.setIconWidth(getIconSize());
        return tuxIconView;
    }

    public final void LIZ() {
        TuxIconView inactiveIcon = isSelected() ? getInactiveIcon() : getActiveIcon();
        TuxIconView activeIcon = isSelected() ? getActiveIcon() : getInactiveIcon();
        ValueAnimator valueAnimatorOfFloat = ObjectAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator(1.5f));
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS219S0200000_11(inactiveIcon, this, 7));
        ValueAnimator valueAnimatorOfFloat2 = ObjectAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(new DecelerateInterpolator(1.5f));
        valueAnimatorOfFloat2.setDuration(200L);
        valueAnimatorOfFloat2.addUpdateListener(new AUListenerS219S0200000_11(activeIcon, this, 8));
        valueAnimatorOfFloat.start();
        valueAnimatorOfFloat2.start();
    }

    public C730970Slr(Context context) {
        this(context, null, 0);
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

    public C730970Slr(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C730970Slr(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.LL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(118));
        this.LLILZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 489));
        this.LLILZIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 488));
        if (C1261804wi.LIZ()) {
            C705700RmC.LIZIZ(context, R.layout.cay, this, true, true, 4);
        } else {
            C786410Ut5.Sd(R.layout.cay, C786410Ut5.ne(context), this);
        }
    }
}
