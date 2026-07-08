package X;

import Y.AUListenerS266S0100000_17;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.0fNT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1124850fNT extends View {
    public final int LL;
    public final int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public float LLILZIL;
    public float LLILZLL;
    public float LLIZ;
    public int LLIZLLLIL;
    public final float LLJ;
    public int LLJI;
    public int LLJIJIL;
    public final Paint LLJILJIL;
    public final RectF LLJILJILJ;
    public final RectF LLJILLL;

    public final int getAnimDuration() {
        return this.LLIZLLLIL;
    }

    public final int getBackgroundColor() {
        return this.LLILLL;
    }

    public final float getMaxProgress() {
        return this.LLILZIL;
    }

    public final float getProgress() {
        return this.LLIZ;
    }

    public final int getProgressColor() {
        return this.LLILZ;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.LLJILJIL.setColor(this.LLILLL);
        this.LLJILJILJ.set(0.0f, 0.0f, this.LLJI, this.LLJIJIL);
        RectF rectF = this.LLJILJILJ;
        float f = this.LLJ;
        canvas.drawRoundRect(rectF, f, f, this.LLJILJIL);
        this.LLJILJIL.setColor(this.LLILZ);
        this.LLJILLL.set(0.0f, 0.0f, (this.LLJI * this.LLILZLL) / this.LLILZIL, this.LLJIJIL);
        RectF rectF2 = this.LLJILLL;
        float f2 = this.LLJ;
        canvas.drawRoundRect(rectF2, f2, f2, this.LLJILJIL);
    }

    public final void setAnimDuration(int i) {
        this.LLIZLLLIL = i;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.LLILLL = i;
        invalidate();
    }

    public final void setMaxProgress(float f) {
        this.LLILZIL = f;
        invalidate();
    }

    public final void setProgress(float f) {
        this.LLIZ = f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.LLILZLL, f);
        valueAnimatorOfFloat.setDuration(this.LLIZLLLIL);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS266S0100000_17(this, 70));
        valueAnimatorOfFloat.start();
    }

    public final void setProgressColor(int i) {
        this.LLILZ = i;
        invalidate();
    }

    public C1124850fNT(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int color = ColorProtector.parseColor("#3F51B5");
        this.LL = color;
        int color2 = ColorProtector.parseColor("#FF4081");
        this.LLILLJJLI = color2;
        this.LLILLL = color;
        this.LLILZ = color2;
        this.LLILZIL = 100.0f;
        this.LLIZLLLIL = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
        this.LLJ = C1117830fC9.LIZJ(4);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.LLJILJIL = paint;
        this.LLJILJILJ = new RectF();
        this.LLJILLL = new RectF();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.HorizontalProgressBar);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == R$styleable.HorizontalProgressBar_backgroundColor) {
                this.LLILLL = typedArrayObtainStyledAttributes.getColor(index, this.LL);
            } else if (index == R$styleable.HorizontalProgressBar_progressColor) {
                this.LLILZ = typedArrayObtainStyledAttributes.getColor(index, this.LLILLJJLI);
            } else if (index == R$styleable.HorizontalProgressBar_maxProgress) {
                this.LLILZIL = typedArrayObtainStyledAttributes.getInt(index, 100);
            } else if (index == R$styleable.HorizontalProgressBar_progress) {
                float f = typedArrayObtainStyledAttributes.getInt(index, 0);
                this.LLIZ = f;
                float f2 = this.LLILZIL;
                if (f > f2) {
                    this.LLIZ = f2;
                }
                this.LLILZLL = this.LLIZ;
            } else if (index == R$styleable.HorizontalProgressBar_animDuration) {
                this.LLIZLLLIL = typedArrayObtainStyledAttributes.getInt(index, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
            } else if (index == R$styleable.HorizontalProgressBar_progressbar_radius) {
                this.LLJ = typedArrayObtainStyledAttributes.getFloat(index, this.LLJ);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        boolean z = true;
        if (getLayoutDirection() != 1) {
            z = false;
        }
        if (mode != 1073741824) {
            size2 = 8;
        }
        this.LLJIJIL = size2;
        this.LLJI = size;
        setMeasuredDimension(size, size2);
        if (z) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setScaleX(-1.0f);
        }
    }
}
