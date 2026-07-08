package X;

import Y.ALAdapterS14S0110000_33;
import Y.AUListenerS280S0100000_33;
import Y.AUListenerS4S0100002_33;
import android.R;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.19PN, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19PN extends View {
    public Paint LL;
    public int LLILLJJLI;
    public RectF LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public float LLILZLL;
    public float LLIZ;
    public float LLIZLLLIL;
    public float LLJ;
    public int LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public float LLJJ;
    public ValueAnimator LLJJI;
    public AnimatorSet LLJJIII;
    public float LLJJIJI;

    public final void LIZ() {
        ValueAnimator valueAnimator = this.LLJJI;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.LLJJI.cancel();
        }
        AnimatorSet animatorSet = this.LLJJIII;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.LLJJIII.cancel();
        }
        float f = 360.0f;
        if (!this.LLILZ) {
            float f2 = this.LLJJIJI;
            this.LLJJ = f2;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f2, f2 + 360.0f);
            this.LLJJI = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setDuration(this.LLJILJILJ);
            this.LLJJI.setInterpolator(new DecelerateInterpolator(2.0f));
            this.LLJJI.addUpdateListener(new AUListenerS280S0100000_33(this, 11));
            this.LLJJI.start();
            return;
        }
        this.LLIZLLLIL = 15.0f;
        this.LLJJIII = new AnimatorSet();
        AnimatorSet animatorSet2 = null;
        int i = 0;
        while (true) {
            int i2 = this.LLJILLL;
            if (i >= i2) {
                this.LLJJIII.addListener(new ALAdapterS14S0110000_33(this, 0));
                this.LLJJIII.start();
                return;
            }
            float f3 = i;
            float f4 = (((i2 - 1) * f) / i2) + 15.0f;
            float f5 = ((f4 - 15.0f) * f3) - 90.0f;
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(15.0f, f4);
            valueAnimatorOfFloat2.setDuration((this.LLJILJIL / this.LLJILLL) / 2);
            valueAnimatorOfFloat2.setInterpolator(new DecelerateInterpolator(1.0f));
            valueAnimatorOfFloat2.addUpdateListener(new AUListenerS280S0100000_33(this, 49));
            float f6 = this.LLJILLL;
            float f7 = (0.5f + f3) * 720.0f;
            ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat((f3 * 720.0f) / f6, f7 / f6);
            valueAnimatorOfFloat3.setDuration((this.LLJILJIL / this.LLJILLL) / 2);
            valueAnimatorOfFloat3.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat3.addUpdateListener(new AUListenerS280S0100000_33(this, 50));
            ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(f5, (f5 + f4) - 15.0f);
            valueAnimatorOfFloat4.setDuration((this.LLJILJIL / this.LLJILLL) / 2);
            valueAnimatorOfFloat4.setInterpolator(new DecelerateInterpolator(1.0f));
            valueAnimatorOfFloat4.addUpdateListener(new AUListenerS4S0100002_33(this, f4, f5, 2));
            float f8 = this.LLJILLL;
            ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(f7 / f8, ((f3 + 1.0f) * 720.0f) / f8);
            valueAnimatorOfFloat5.setDuration((this.LLJILJIL / this.LLJILLL) / 2);
            valueAnimatorOfFloat5.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat5.addUpdateListener(new AUListenerS280S0100000_33(this, 51));
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.play(valueAnimatorOfFloat2).with(valueAnimatorOfFloat3);
            animatorSet3.play(valueAnimatorOfFloat4).with(valueAnimatorOfFloat5).after(valueAnimatorOfFloat3);
            AnimatorSet.Builder builderPlay = this.LLJJIII.play(animatorSet3);
            if (animatorSet2 != null) {
                builderPlay.after(animatorSet2);
            }
            i++;
            animatorSet2 = animatorSet3;
            f = 360.0f;
        }
    }

    public final void LIZIZ() {
        ValueAnimator valueAnimator = this.LLJJI;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.LLJJI = null;
        }
        AnimatorSet animatorSet = this.LLJJIII;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.LLJJIII = null;
        }
    }

    public final void LIZLLL() {
        this.LL.setColor(this.LLJIJIL);
        this.LL.setStyle(Paint.Style.STROKE);
        this.LL.setStrokeWidth(this.LLJI);
        this.LL.setStrokeCap(Paint.Cap.ROUND);
    }

    public final void LIZJ() {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        RectF rectF = this.LLILLL;
        int i = this.LLJI;
        int i2 = this.LLILLJJLI;
        rectF.set(paddingLeft + i, paddingTop + i, (i2 - paddingLeft) - i, (i2 - paddingTop) - i);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.LLILZIL) {
            LIZ();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LIZIZ();
    }

    public int getColor() {
        return this.LLJIJIL;
    }

    public float getMaxProgress() {
        return this.LLIZ;
    }

    public float getProgress() {
        return this.LLILZLL;
    }

    public int getThickness() {
        return this.LLJI;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        isInEditMode();
        float f = (this.LLILZLL / this.LLIZ) * 360.0f;
        if (!this.LLILZ) {
            canvas.drawArc(this.LLILLL, this.LLJJ, f, false, this.LL);
        } else {
            canvas.drawArc(this.LLILLL, this.LLJJ + this.LLJ, this.LLIZLLLIL, false, this.LL);
        }
    }

    public void setColor(int i) {
        this.LLJIJIL = i;
        LIZLLL();
        invalidate();
    }

    public void setIndeterminate(boolean z) {
        if (this.LLILZ != z) {
            this.LLILZ = z;
            LIZ();
        }
    }

    public void setMaxProgress(float f) {
        this.LLIZ = f;
        invalidate();
    }

    public void setProgress(float f) {
        this.LLILZLL = f;
        invalidate();
    }

    public void setThickness(int i) {
        this.LLJI = i;
        LIZLLL();
        LIZJ();
        invalidate();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        int visibility = getVisibility();
        super.setVisibility(i);
        if (i != visibility) {
            if (i == 0) {
                LIZ();
            } else {
                if (i != 8 && i != 4) {
                    return;
                }
                LIZIZ();
            }
        }
    }

    public C19PN(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.DFCircularProgressView, 0, 0);
        int iArgb = Color.argb(255, 33, 150, 243);
        this.LLILZLL = typedArrayObtainStyledAttributes.getFloat(R$styleable.DFCircularProgressView_cpv_progress, 0.0f);
        this.LLIZ = typedArrayObtainStyledAttributes.getFloat(R$styleable.DFCircularProgressView_cpv_maxProgress, 100.0f);
        this.LLJI = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.DFCircularProgressView_cpv_thickness, (int) C12ES.LIZJ(2.0f, getContext()));
        this.LLILZ = typedArrayObtainStyledAttributes.getBoolean(R$styleable.DFCircularProgressView_cpv_indeterminate, false);
        this.LLILZIL = typedArrayObtainStyledAttributes.getBoolean(R$styleable.DFCircularProgressView_cpv_animAutostart, false);
        float f = typedArrayObtainStyledAttributes.getFloat(R$styleable.DFCircularProgressView_cpv_startAngle, -90.0f);
        this.LLJJIJI = f;
        this.LLJJ = f;
        int iN3 = C786410Ut5.n3(getContext().getResources(), "colorAccent", "attr", getContext().getPackageName());
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.DFCircularProgressView_cpv_color)) {
            this.LLJIJIL = typedArrayObtainStyledAttributes.getColor(R$styleable.DFCircularProgressView_cpv_color, iArgb);
        } else if (iN3 != 0) {
            TypedValue typedValue = new TypedValue();
            getContext().getTheme().resolveAttribute(iN3, typedValue, true);
            this.LLJIJIL = typedValue.data;
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(new int[]{R.attr.colorAccent});
            this.LLJIJIL = typedArrayObtainStyledAttributes2.getColor(0, iArgb);
            typedArrayObtainStyledAttributes2.recycle();
        }
        this.LLJILJIL = typedArrayObtainStyledAttributes.getInteger(R$styleable.DFCircularProgressView_cpv_animDuration, 4000);
        this.LLJILJILJ = typedArrayObtainStyledAttributes.getInteger(R$styleable.DFCircularProgressView_cpv_animSwoopDuration, 5000);
        typedArrayObtainStyledAttributes.getInteger(R$styleable.DFCircularProgressView_cpv_animSyncDuration, 500);
        this.LLJILLL = typedArrayObtainStyledAttributes.getInteger(R$styleable.DFCircularProgressView_cpv_animSteps, 3);
        typedArrayObtainStyledAttributes.recycle();
        this.LL = new Paint(1);
        LIZLLL();
        this.LLILLL = new RectF();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int measuredWidth = getMeasuredWidth() - paddingLeft;
        int measuredHeight = getMeasuredHeight() - paddingTop;
        if (measuredWidth >= measuredHeight) {
            measuredWidth = measuredHeight;
        }
        this.LLILLJJLI = measuredWidth;
        setMeasuredDimension(paddingLeft + measuredWidth, measuredWidth + paddingTop);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i >= i2) {
            i = i2;
        }
        this.LLILLJJLI = i;
        LIZJ();
    }
}
