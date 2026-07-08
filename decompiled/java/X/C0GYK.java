package X;

import Y.AUListenerS256S0100000_6;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GYK, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GYK extends FrameLayout {
    public float LL;
    public float LLILLJJLI;
    public int LLILLL;
    public float LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public C16F5 LLIZ;
    public C0GYI LLIZLLLIL;

    public final void LIZ() {
        this.LLILLJJLI = 0.0f;
        C0GYI c0gyi = this.LLIZLLLIL;
        if (c0gyi != null) {
            c0gyi.setProgressWithoutAnimation(0.0f);
        }
        C16F5 c16f5 = this.LLIZ;
        if (c16f5 != null) {
            c16f5.setText("0%");
        }
        C0GYI c0gyi2 = this.LLIZLLLIL;
        if (c0gyi2 != null) {
            c0gyi2.invalidate();
        }
    }

    public final void setProgress(float f) {
        float f2 = this.LLILLJJLI;
        if (f < f2) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f2, f);
        valueAnimatorOfFloat.setDuration((long) (((f - f2) / 100.0f) * 2000));
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6(this, 177));
        valueAnimatorOfFloat.start();
    }

    public C0GYK(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLL = 100;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.LiveCircleProgress);
        this.LL = typedArrayObtainStyledAttributes.getDimension(R$styleable.LiveCircleProgressLayout_layout_radius, (int) C497740JfY.LIZIZ(63.0f));
        this.LLILZIL = typedArrayObtainStyledAttributes.getColor(R$styleable.LiveCircleProgressLayout_layout_solid_bg_color, C497740JfY.LIZLLL(R.attr.c5x, context));
        this.LLILZLL = typedArrayObtainStyledAttributes.getColor(R$styleable.LiveCircleProgressLayout_layout_solid_color, C497740JfY.LIZLLL(R.attr.eu5, context));
        this.LLILZ = typedArrayObtainStyledAttributes.getDimension(R$styleable.LiveCircleProgressLayout_layout_stroke_width, (int) C497740JfY.LIZIZ(6.5f));
        this.LLILLL = typedArrayObtainStyledAttributes.getInteger(R$styleable.LiveCircleProgressLayout_layout_maxProgress, 100);
        typedArrayObtainStyledAttributes.recycle();
        View viewInflate = FrameLayout.inflate(context, R.layout.hbm, this);
        C16F5 c16f5 = (C16F5) viewInflate.findViewById(R.id.s_2);
        this.LLIZ = c16f5;
        if (c16f5 != null) {
            c16f5.setText("0%");
        }
        viewInflate.findViewById(R.id.s97);
        C0GYI c0gyi = (C0GYI) viewInflate.findViewById(R.id.s8q);
        this.LLIZLLLIL = c0gyi;
        if (c0gyi != null) {
            float f = this.LL;
            int i = this.LLILZIL;
            int i2 = this.LLILZLL;
            float f2 = this.LLILZ;
            int i3 = this.LLILLL;
            c0gyi.LLIZ = f;
            Paint paint = c0gyi.LLILLL;
            if (paint != null) {
                paint.setColor(i);
            }
            Paint paint2 = c0gyi.LL;
            if (paint2 != null) {
                paint2.setColor(i2);
            }
            Paint paint3 = c0gyi.LLILLL;
            if (paint3 != null) {
                paint3.setStrokeWidth(f2);
            }
            Paint paint4 = c0gyi.LL;
            if (paint4 != null) {
                paint4.setStrokeWidth(f2);
            }
            c0gyi.LLJILJIL = i3;
        }
    }
}
