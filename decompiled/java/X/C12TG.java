package X;

import Y.AUListenerS277S0100000_29;
import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.12TG, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12TG extends FrameLayout implements C12T0 {
    public final ValueAnimator LL;
    public final ValueAnimator LLILLJJLI;
    public final ValueAnimator LLILLL;
    public final ValueAnimator LLILZ;
    public final TuxIconView LLILZIL;
    public final TuxIconView LLILZLL;

    @Override // X.C12T0
    public final void LIZIZ() {
        this.LLILLL.end();
        this.LLILZ.end();
        this.LL.start();
        this.LLILLJJLI.start();
    }

    @Override // X.C12T0
    public final void LIZJ() {
        this.LL.end();
        this.LLILLJJLI.end();
        this.LLILLL.start();
        this.LLILZ.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.LLILLL.isRunning()) {
            this.LLILLL.end();
        }
        if (this.LLILZ.isRunning()) {
            this.LLILZ.end();
        }
        if (this.LL.isRunning()) {
            this.LL.end();
        }
        if (this.LLILLJJLI.isRunning()) {
            this.LLILLJJLI.end();
        }
    }

    @Override // X.C12T0
    public void setRecordingTintRes(int i) {
        this.LLILZIL.setIconRes(i);
    }

    @Override // X.C12T0
    public void setStopTintColorRes(int i) {
        this.LLILZLL.setTintColorRes(i);
    }

    public C12TG(Context context, float f) {
        super(context);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.72f);
        this.LL = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.LLILLJJLI = valueAnimatorOfFloat2;
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.72f, 1.0f);
        this.LLILLL = valueAnimatorOfFloat3;
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.LLILZ = valueAnimatorOfFloat4;
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        this.LLILZLL = tuxIconView;
        tuxIconView.setTintColorRes(R.attr.ee);
        tuxIconView.setIconRes(R.drawable.a6j);
        tuxIconView.setIconHeight((int) C12ES.LIZJ(15.0f, context));
        tuxIconView.setIconWidth((int) C12ES.LIZJ(15.0f, context));
        C786410Ut5.x5(this.LLILZLL, 0.0f);
        int i = (int) f;
        addView(tuxIconView, new FrameLayout.LayoutParams(i, i));
        TuxIconView tuxIconView2 = new TuxIconView(context, null, 0, 6, null);
        this.LLILZIL = tuxIconView2;
        tuxIconView2.setTintColorRes(R.attr.ee);
        tuxIconView2.setIconRes(R.raw.icon_microphone_fill);
        C786410Ut5.x5(this.LLILZIL, 1.0f);
        addView(tuxIconView2, new FrameLayout.LayoutParams(i, i));
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.setInterpolator(C1619980sG4.LJ());
        valueAnimatorOfFloat2.setDuration(150L);
        valueAnimatorOfFloat2.setInterpolator(C1619980sG4.LJ());
        valueAnimatorOfFloat3.setDuration(150L);
        valueAnimatorOfFloat3.setInterpolator(C1619980sG4.LJ());
        valueAnimatorOfFloat4.setDuration(150L);
        valueAnimatorOfFloat4.setInterpolator(C1619980sG4.LJ());
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS277S0100000_29(this, 32));
        valueAnimatorOfFloat2.addUpdateListener(new AUListenerS277S0100000_29(this, 33));
        valueAnimatorOfFloat3.addUpdateListener(new AUListenerS277S0100000_29(this, 34));
        valueAnimatorOfFloat4.addUpdateListener(new AUListenerS277S0100000_29(this, 35));
    }

    @Override // X.C12T0
    public final void LIZ(int i, int i2) {
        this.LLILZLL.setIconHeight(i2);
        this.LLILZLL.setIconWidth(i);
    }
}
