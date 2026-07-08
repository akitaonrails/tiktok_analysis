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
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: renamed from: X.0Son, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C732790Son extends FrameLayout {
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

    public final TuxIconView getVideoLikeIconActiveFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.video_like_icon_active);
            this.LLILLJJLI = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxIconView getVideoLikeIconInactiveFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.video_like_icon_inactive);
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
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS219S0200000_11(inactiveIcon, this, 5));
        ValueAnimator valueAnimatorOfFloat2 = ObjectAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(new DecelerateInterpolator(1.5f));
        valueAnimatorOfFloat2.setDuration(200L);
        valueAnimatorOfFloat2.addUpdateListener(new AUListenerS219S0200000_11(activeIcon, this, 6));
        valueAnimatorOfFloat.start();
        valueAnimatorOfFloat2.start();
    }

    public final void setIconSize(int i) {
        getInactiveIcon().getLayoutParams().height = i;
        getInactiveIcon().getLayoutParams().width = i;
        getActiveIcon().getLayoutParams().height = i;
        getActiveIcon().getLayoutParams().width = i;
        getInactiveIcon().setIconWidth(i);
        getInactiveIcon().setIconHeight(i);
        getActiveIcon().setIconWidth(i);
        getActiveIcon().setIconHeight(i);
    }

    public final void setInactiveIconRes(int i) {
        getInactiveIcon().setIconRes(i);
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

    public final void setVideoLikeIconActiveFromXml(TuxIconView tuxIconView) {
        this.LLILLJJLI = tuxIconView;
    }

    public final void setVideoLikeIconInactiveFromXml(TuxIconView tuxIconView) {
        this.LL = tuxIconView;
    }

    public C732790Son(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C732790Son(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.LLILLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1518));
        this.LLILZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1517));
        C786410Ut5.Sd(R.layout.bb8, C786410Ut5.ne(context), this);
    }
}
