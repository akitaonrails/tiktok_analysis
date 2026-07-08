package X;

import Y.AUListenerS265S0100000_16;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0dTr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1051930dTr extends RelativeLayout {
    public TuxIconView LL;
    public ValueAnimator LLILLJJLI;
    public ValueAnimator LLILLL;
    public boolean LLILZ;

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.hlc);
        this.LL = tuxIconView;
        if (tuxIconView == null) {
            tuxIconView = null;
        }
        C786410Ut5.x5(tuxIconView, 0.5f);
    }

    public final void setAnimationEnabled(boolean z) {
        this.LLILZ = z;
    }

    public final void setImageResource(int i) {
        TuxIconView tuxIconView = this.LL;
        if (tuxIconView == null) {
            tuxIconView = null;
        }
        tuxIconView.setIconRes(i);
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        ValueAnimator valueAnimator = this.LLILLJJLI;
        ValueAnimator valueAnimator2 = null;
        if (valueAnimator == null) {
            valueAnimator = null;
        }
        valueAnimator.cancel();
        ValueAnimator valueAnimator3 = this.LLILLL;
        if (valueAnimator3 == null) {
            valueAnimator3 = null;
        }
        valueAnimator3.cancel();
        if (z) {
            if (this.LLILZ) {
                ValueAnimator valueAnimator4 = this.LLILLJJLI;
                if (valueAnimator4 != null) {
                    valueAnimator2 = valueAnimator4;
                }
                valueAnimator2.start();
                return;
            }
            return;
        }
        if (!this.LLILZ) {
            return;
        }
        ValueAnimator valueAnimator5 = this.LLILLL;
        if (valueAnimator5 != null) {
            valueAnimator2 = valueAnimator5;
        }
        valueAnimator2.start();
    }

    public C1051930dTr(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILZ = true;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.5f, 1.0f);
        this.LLILLJJLI = valueAnimatorOfFloat;
        (valueAnimatorOfFloat == null ? null : valueAnimatorOfFloat).addUpdateListener(new AUListenerS265S0100000_16(this, 17));
        ValueAnimator valueAnimator = this.LLILLJJLI;
        (valueAnimator == null ? null : valueAnimator).setDuration(150L);
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.5f);
        this.LLILLL = valueAnimatorOfFloat2;
        (valueAnimatorOfFloat2 == null ? null : valueAnimatorOfFloat2).addUpdateListener(new AUListenerS265S0100000_16(this, 18));
        ValueAnimator valueAnimator2 = this.LLILLL;
        (valueAnimator2 != null ? valueAnimator2 : null).setDuration(150L);
    }
}
