package X;

import Y.AUListenerS234S0200000_32;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.18kd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21373318kd extends FrameLayout {
    public int LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;

    private final TuxIconView getActiveIcon() {
        return (TuxIconView) this.LLILLL.getValue();
    }

    private final TuxIconView getInactiveIcon() {
        return (TuxIconView) this.LLILLJJLI.getValue();
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
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS234S0200000_32(inactiveIcon, this, 0));
        ValueAnimator valueAnimatorOfFloat2 = ObjectAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(new DecelerateInterpolator(1.5f));
        valueAnimatorOfFloat2.setDuration(200L);
        valueAnimatorOfFloat2.addUpdateListener(new AUListenerS234S0200000_32(activeIcon, this, 1));
        valueAnimatorOfFloat.start();
        valueAnimatorOfFloat2.start();
    }

    public final void setInactiveIconTintColor(int i) {
        this.LL = i;
        getInactiveIcon().setTintColor(i);
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

    public C21373318kd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C786410Ut5.Sd(R.layout.e62, C786410Ut5.ne(context), this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.PoiPostCellLikeView, 0, 0);
        this.LL = typedArrayObtainStyledAttributes.getColor(R$styleable.PoiPostCellLikeView_inactiveIconTintColor, C960203pA.LIZ(R.attr.ui, context));
        typedArrayObtainStyledAttributes.recycle();
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS576S0100000_32(this, 844));
        this.LLILLL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 843));
    }
}
