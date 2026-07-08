package X;

import Y.AUListenerS215S0200000_4;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS548S0100000_4;

/* JADX INFO: renamed from: X.0DLy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C337760DLy extends FrameLayout {
    public static TuxIconDrawable LLILZIL;
    public static TuxIconDrawable LLILZLL;
    public static Boolean LLIZ;
    public static Boolean LLIZLLLIL;
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

    public final TuxIconView getUniversalLikeIconActiveFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.universal_like_icon_active);
            this.LLILLJJLI = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxIconView getUniversalLikeIconInactiveFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.universal_like_icon_inactive);
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
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS215S0200000_4(inactiveIcon, this, 0));
        ValueAnimator valueAnimatorOfFloat2 = ObjectAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(new DecelerateInterpolator(1.5f));
        valueAnimatorOfFloat2.setDuration(200L);
        valueAnimatorOfFloat2.addUpdateListener(new AUListenerS215S0200000_4(activeIcon, this, 1));
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

    public final void setUniversalLikeIconActiveFromXml(TuxIconView tuxIconView) {
        this.LLILLJJLI = tuxIconView;
    }

    public final void setUniversalLikeIconInactiveFromXml(TuxIconView tuxIconView) {
        this.LL = tuxIconView;
    }

    public C337760DLy(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C337760DLy(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.LLILLL = C452501pT.LIZIZ(new AwS548S0100000_4(this, 134));
        this.LLILZ = C452501pT.LIZIZ(new AwS548S0100000_4(this, 133));
        if (!C281360B1a.LIZ) {
            C786410Ut5.Sd(R.layout.c5f, C786410Ut5.ne(context), this);
        }
    }
}
