package X;

import Y.ALAdapterS17S0100000_21;
import Y.AUListenerS228S0200000_21;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0m7V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1384030m7V extends FrameLayout {
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

    public final TuxIconView getDanmakuLikeIconActiveFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ffa);
            this.LLILLJJLI = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxIconView getDanmakuLikeIconInactiveFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ffb);
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
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS228S0200000_21(inactiveIcon, this, 0));
        ValueAnimator valueAnimatorOfFloat2 = ObjectAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(new DecelerateInterpolator(1.5f));
        valueAnimatorOfFloat2.setDuration(200L);
        valueAnimatorOfFloat2.addUpdateListener(new AUListenerS228S0200000_21(activeIcon, this, 1));
        valueAnimatorOfFloat.start();
        valueAnimatorOfFloat2.start();
        valueAnimatorOfFloat2.addListener(new ALAdapterS17S0100000_21(this, 2));
    }

    public final void setDanmakuLikeIconActiveFromXml(TuxIconView tuxIconView) {
        this.LLILLJJLI = tuxIconView;
    }

    public final void setDanmakuLikeIconInactiveFromXml(TuxIconView tuxIconView) {
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

    public C1384030m7V(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LLILLL = C452501pT.LIZ(enumC452301pR, new AwS565S0100000_21(this, 1217));
        this.LLILZ = C452501pT.LIZ(enumC452301pR, new AwS565S0100000_21(this, 1216));
        C786410Ut5.Sd(R.layout.bj4, C786410Ut5.ne(context), this);
    }
}
