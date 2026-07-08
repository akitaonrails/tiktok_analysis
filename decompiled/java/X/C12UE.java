package X;

import Y.AUListenerS277S0100000_29;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* JADX INFO: renamed from: X.12UE, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12UE extends FrameLayout {
    public ImageView LL;
    public C12UF LLILLJJLI;
    public final ValueAnimator LLILLL;
    public final ValueAnimator LLILZ;

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.LLILLL.isRunning()) {
            this.LLILLL.end();
        }
        if (this.LLILZ.isRunning()) {
            this.LLILZ.end();
        }
    }

    public C12UE(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.72f);
        this.LLILLL = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.72f, 1.0f);
        this.LLILZ = valueAnimatorOfFloat2;
        ImageView imageView = new ImageView(getContext());
        this.LL = imageView;
        imageView.setBackground(C426580Go4.LIZ(-16776961, -1, 0));
        View view = this.LL;
        addView(view == null ? null : view, new FrameLayout.LayoutParams(-1, -1));
        this.LLILLJJLI = new C12UF(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) C12ES.LIZJ(20.0f, getContext()), (int) C12ES.LIZJ(20.0f, getContext()));
        layoutParams.topMargin = (int) C12ES.LIZJ(26.0f, getContext());
        layoutParams.leftMargin = (int) C12ES.LIZJ(26.0f, getContext());
        layoutParams.setMarginStart((int) C12ES.LIZJ(26.0f, getContext()));
        View view2 = this.LLILLJJLI;
        addView(view2 != null ? view2 : null, layoutParams);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS277S0100000_29(this, 70));
        valueAnimatorOfFloat2.addUpdateListener(new AUListenerS277S0100000_29(this, 71));
    }
}
