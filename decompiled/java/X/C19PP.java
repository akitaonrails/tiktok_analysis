package X;

import Y.ALAdapterS14S0110000_33;
import Y.AUListenerS280S0100000_33;
import Y.AUListenerS4S0100002_33;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.19PP, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19PP extends View {
    public Paint LL;
    public int LLILLJJLI;
    public RectF LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public float LLIZLLLIL;
    public float LLJ;
    public float LLJI;
    public float LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public int LLJJI;
    public float LLJJIII;
    public ValueAnimator LLJJIJI;
    public AnimatorSet LLJJIJIIJIL;
    public float LLJJIJIL;

    public final void LIZIZ() {
        this.LLILZLL = false;
        ValueAnimator valueAnimator = this.LLJJIJI;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.LLJJIJI = null;
        }
        AnimatorSet animatorSet = this.LLJJIJIIJIL;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.LLJJIJIIJIL = null;
        }
    }

    public final void LIZ() {
        if (!this.LLIZ) {
            this.LLILZLL = true;
            return;
        }
        this.LLILZLL = false;
        ValueAnimator valueAnimator = this.LLJJIJI;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.LLJJIJI.cancel();
        }
        AnimatorSet animatorSet = this.LLJJIJIIJIL;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.LLJJIJIIJIL.cancel();
        }
        float f = 360.0f;
        if (!this.LLILZ) {
            float f2 = this.LLJJIJIL;
            this.LLJJIII = f2;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f2, f2 + 360.0f);
            this.LLJJIJI = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setDuration(this.LLJJ);
            this.LLJJIJI.setInterpolator(new DecelerateInterpolator(2.0f));
            this.LLJJIJI.addUpdateListener(new AUListenerS280S0100000_33(this, 27));
            this.LLJJIJI.start();
            return;
        }
        this.LLJI = 15.0f;
        this.LLJJIJIIJIL = new AnimatorSet();
        AnimatorSet animatorSet2 = null;
        int i = 0;
        while (true) {
            int i2 = this.LLJJI;
            if (i >= i2) {
                this.LLJJIJIIJIL.addListener(new ALAdapterS14S0110000_33(this, 2));
                this.LLJJIJIIJIL.start();
                return;
            }
            float f3 = i;
            float f4 = (((i2 - 1) * f) / i2) + 15.0f;
            float f5 = ((f4 - 15.0f) * f3) - 90.0f;
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(15.0f, f4);
            valueAnimatorOfFloat2.setDuration((this.LLJILLL / this.LLJJI) / 2);
            valueAnimatorOfFloat2.setInterpolator(new DecelerateInterpolator(1.0f));
            valueAnimatorOfFloat2.addUpdateListener(new AUListenerS280S0100000_33(this, 28));
            float f6 = this.LLJJI;
            float f7 = (0.5f + f3) * 720.0f;
            ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat((f3 * 720.0f) / f6, f7 / f6);
            valueAnimatorOfFloat3.setDuration((this.LLJILLL / this.LLJJI) / 2);
            valueAnimatorOfFloat3.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat3.addUpdateListener(new AUListenerS280S0100000_33(this, 29));
            ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(f5, (f5 + f4) - 15.0f);
            valueAnimatorOfFloat4.setDuration((this.LLJILLL / this.LLJJI) / 2);
            valueAnimatorOfFloat4.setInterpolator(new DecelerateInterpolator(1.0f));
            valueAnimatorOfFloat4.addUpdateListener(new AUListenerS4S0100002_33(this, f4, f5, 1));
            float f8 = this.LLJJI;
            ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(f7 / f8, ((f3 + 1.0f) * 720.0f) / f8);
            valueAnimatorOfFloat5.setDuration((this.LLJILLL / this.LLJJI) / 2);
            valueAnimatorOfFloat5.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat5.addUpdateListener(new AUListenerS280S0100000_33(this, 30));
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.play(valueAnimatorOfFloat2).with(valueAnimatorOfFloat3);
            animatorSet3.play(valueAnimatorOfFloat4).with(valueAnimatorOfFloat5).after(valueAnimatorOfFloat3);
            AnimatorSet.Builder builderPlay = this.LLJJIJIIJIL.play(animatorSet3);
            if (animatorSet2 != null) {
                builderPlay.after(animatorSet2);
            }
            i++;
            animatorSet2 = animatorSet3;
            f = 360.0f;
        }
    }

    public final void LIZLLL() {
        this.LL.setColor(this.LLJILJILJ);
        this.LL.setStyle(Paint.Style.STROKE);
        this.LL.setStrokeWidth(this.LLJILJIL);
        this.LL.setStrokeCap(Paint.Cap.ROUND);
    }

    public final void LIZJ() {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        RectF rectF = this.LLILLL;
        int i = this.LLJILJIL;
        int i2 = this.LLILLJJLI;
        rectF.set(paddingLeft + i, paddingTop + i, (i2 - paddingLeft) - i, (i2 - paddingTop) - i);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LLIZ = true;
        if (this.LLILZIL || this.LLILZLL) {
            LIZ();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLIZ = false;
        LIZIZ();
    }

    public int getColor() {
        return this.LLJILJILJ;
    }

    public float getMaxProgress() {
        return this.LLJ;
    }

    public float getProgress() {
        return this.LLIZLLLIL;
    }

    public int getThickness() {
        return this.LLJILJIL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        isInEditMode();
        float f = (this.LLIZLLLIL / this.LLJ) * 360.0f;
        if (!this.LLILZ) {
            canvas.drawArc(this.LLILLL, this.LLJJIII, f, false, this.LL);
        } else {
            canvas.drawArc(this.LLILLL, this.LLJJIII + this.LLJIJIL, this.LLJI, false, this.LL);
        }
    }

    public void setColor(int i) {
        this.LLJILJILJ = i;
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
        this.LLJ = f;
        invalidate();
    }

    public void setProgress(float f) {
        if (this.LLIZLLLIL == f) {
            return;
        }
        this.LLIZLLLIL = f;
        invalidate();
    }

    public void setThickness(int i) {
        this.LLJILJIL = i;
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

    public C19PP(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.CircularProgressView, 0, 0);
        Resources resources = getResources();
        this.LLIZLLLIL = typedArrayObtainStyledAttributes.getFloat(R$styleable.CircularProgressView_cpv_progress, resources.getInteger(R.integer.b9));
        this.LLJ = typedArrayObtainStyledAttributes.getFloat(R$styleable.CircularProgressView_cpv_maxProgress, resources.getInteger(R.integer.b8));
        this.LLJILJIL = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CircularProgressView_cpv_thickness, resources.getDimensionPixelSize(R.dimen.pu));
        this.LLILZ = typedArrayObtainStyledAttributes.getBoolean(R$styleable.CircularProgressView_cpv_indeterminate, resources.getBoolean(R.bool.f));
        this.LLILZIL = typedArrayObtainStyledAttributes.getBoolean(R$styleable.CircularProgressView_cpv_animAutostart, resources.getBoolean(R.bool.e));
        float f = typedArrayObtainStyledAttributes.getFloat(R$styleable.CircularProgressView_cpv_startAngle, resources.getInteger(R.integer.b_));
        this.LLJJIJIL = f;
        this.LLJJIII = f;
        int iN3 = C786410Ut5.n3(getContext().getResources(), "colorAccent", "attr", getContext().getPackageName());
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.CircularProgressView_cpv_color)) {
            this.LLJILJILJ = typedArrayObtainStyledAttributes.getColor(R$styleable.CircularProgressView_cpv_color, resources.getColor(R.color.je));
        } else if (iN3 != 0) {
            TypedValue typedValue = new TypedValue();
            getContext().getTheme().resolveAttribute(iN3, typedValue, true);
            this.LLJILJILJ = typedValue.data;
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(new int[]{android.R.attr.colorAccent});
            this.LLJILJILJ = typedArrayObtainStyledAttributes2.getColor(0, resources.getColor(R.color.je));
            typedArrayObtainStyledAttributes2.recycle();
        }
        this.LLJILLL = typedArrayObtainStyledAttributes.getInteger(R$styleable.CircularProgressView_cpv_animDuration, resources.getInteger(R.integer.b4));
        this.LLJJ = typedArrayObtainStyledAttributes.getInteger(R$styleable.CircularProgressView_cpv_animSwoopDuration, resources.getInteger(R.integer.b6));
        typedArrayObtainStyledAttributes.getInteger(R$styleable.CircularProgressView_cpv_animSyncDuration, resources.getInteger(R.integer.b7));
        this.LLJJI = typedArrayObtainStyledAttributes.getInteger(R$styleable.CircularProgressView_cpv_animSteps, resources.getInteger(R.integer.b5));
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
