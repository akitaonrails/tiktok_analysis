package X;

import Y.AUListenerS277S0100000_29;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.12Sv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19759912Sv extends FrameLayout {
    public final ImageView LL;
    public final C12T0 LLILLJJLI;
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

    public final void setBgColorDrawable(Drawable drawable) {
        this.LL.setBackground(drawable);
    }

    public final void setBgColorRes(int i) {
        ImageView imageView = this.LL;
        C1643380sro c1643380sro = new C1643380sro();
        c1643380sro.LIZIZ(i);
        c1643380sro.LIZLLL(1);
        imageView.setBackground(c1643380sro.LIZ());
    }

    public final void setRecordingTintRes(int i) {
        C12T0 c12t0 = this.LLILLJJLI;
        if (c12t0 != null) {
            c12t0.setRecordingTintRes(i);
        }
    }

    public final void setStopTintColorRes(int i) {
        C12T0 c12t0 = this.LLILLJJLI;
        if (c12t0 != null) {
            c12t0.setStopTintColorRes(i);
        }
    }

    public C19759912Sv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.72f);
        this.LLILLL = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.72f, 1.0f);
        this.LLILZ = valueAnimatorOfFloat2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AudioEditRecordButton, 0, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.AudioEditRecordButton_innerSize, (int) C12ES.LIZJ(20.0f, context));
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.AudioEditRecordButton_recordButtonBgColor, C960203pA.LIZ(R.attr.a04, context));
        int i = typedArrayObtainStyledAttributes.getInt(R$styleable.AudioEditRecordButton_innerStyle, 1);
        typedArrayObtainStyledAttributes.recycle();
        ImageView imageView = new ImageView(context);
        this.LL = imageView;
        C1643380sro c1643380sro = new C1643380sro();
        c1643380sro.LIZIZ(color);
        c1643380sro.LIZLLL(1);
        imageView.setBackground(c1643380sro.LIZ());
        addView(imageView, new FrameLayout.LayoutParams(-1, -1));
        if (i != 1) {
            if (i == 2) {
                this.LLILLJJLI = new C12TG(context, dimensionPixelSize);
            }
        } else {
            this.LLILLJJLI = new C12TF(context, dimensionPixelSize);
        }
        Object obj = this.LLILLJJLI;
        if (obj != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
            layoutParams.gravity = 17;
            addView((View) obj, layoutParams);
        }
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS277S0100000_29(this, 28));
        valueAnimatorOfFloat2.addUpdateListener(new AUListenerS277S0100000_29(this, 29));
    }

    public final void LIZ(int i, int i2) {
        C12T0 c12t0 = this.LLILLJJLI;
        if (c12t0 != null) {
            c12t0.LIZ(i, i2);
        }
    }
}
