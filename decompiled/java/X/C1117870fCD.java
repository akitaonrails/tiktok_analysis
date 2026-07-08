package X;

import Y.AUListenerS266S0100000_17;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0fCD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1117870fCD extends View {
    public int LL;
    public int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public float LLILZIL;
    public float LLILZLL;
    public float LLIZ;
    public final Paint LLIZLLLIL;
    public final Paint LLJ;
    public final Paint LLJI;
    public final float LLJIJIL;
    public final float LLJILJIL;
    public final int LLJILJILJ;
    public Integer LLJILLL;

    public final void LIZIZ(long j) {
        final float f = j;
        float f2 = this.LLILZLL;
        float f3 = f + f2;
        float f4 = this.LLILZIL;
        if (f3 > f4) {
            f = f4 - f2;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.LLIZ, f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS266S0100000_17(this, 13));
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: X.0fCG
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                this.LL.LLIZ = f;
            }
        });
        valueAnimatorOfFloat.start();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.LLIZLLLIL;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(this.LLILZ);
        Integer num = this.LLJILLL;
        if (num != null) {
            int iIntValue = num.intValue();
            Paint paint2 = this.LLJ;
            paint2.setStyle(Paint.Style.FILL);
            paint2.setColor(iIntValue);
            paint2.setShader(null);
        } else {
            Paint paint3 = this.LLJ;
            paint3.setShader(new LinearGradient(0.0f, 0.0f, (this.LLILZLL / this.LLILZIL) * this.LL, 0.0f, getResources().getColor(R.color.aay), getResources().getColor(R.color.a5u), Shader.TileMode.REPEAT));
            paint3.setStyle(Paint.Style.FILL);
            paint3.setAntiAlias(true);
        }
        Paint paint4 = this.LLJI;
        paint4.setStyle(Paint.Style.FILL);
        paint4.setColor(getResources().getColor(R.color.ba));
        paint4.setAntiAlias(true);
        float f = this.LLILZLL;
        float f2 = this.LLILZIL;
        int i = this.LL;
        float f3 = (f / f2) * i;
        float f4 = (this.LLIZ / f2) * i;
        RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, this.LL, this.LLILLJJLI);
        float f5 = this.LLJIJIL;
        canvas.drawRoundRect(rectF, f5, f5, this.LLIZLLLIL);
        int iCeil = (int) Math.ceil(f4 / this.LLJILJILJ);
        int iLIZIZ = ((int) C497740JfY.LIZIZ(((f4 / this.LLJILJILJ) + 1) - iCeil)) * 2;
        for (int i2 = 0; i2 < iCeil; i2++) {
            Path path = new Path();
            float f6 = i2;
            path.moveTo((this.LLJILJIL * f6) + f3, 0.0f);
            path.lineTo(((this.LLJILJIL * f6) + f3) - ((int) C497740JfY.LIZIZ(2.0f)), this.LLILLJJLI);
            path.lineTo(((this.LLJILJIL * f6) + f3) - ((int) C497740JfY.LIZIZ(5.0f)), this.LLILLJJLI);
            path.lineTo(((f6 * this.LLJILJIL) + f3) - ((int) C497740JfY.LIZIZ(3.0f)), 0.0f);
            path.close();
            canvas.drawPath(path, this.LLJI);
            int i3 = iCeil - 1;
            if (i2 == i3) {
                RectF rectF2 = new RectF();
                float f7 = i3;
                float f8 = this.LLJILJIL;
                rectF2.set((f7 * f8) + f3, 0.0f, (f7 * f8) + f3 + iLIZIZ + ((int) C497740JfY.LIZIZ(4.0f)), this.LLILLJJLI);
                canvas.drawArc(rectF2, -64.0f, 180.0f, true, this.LLJI);
            }
        }
        RectF rectF3 = new RectF();
        rectF3.set(0.0f, 0.0f, this.LL * (this.LLILZLL / this.LLILZIL), this.LLILLJJLI);
        float f9 = this.LLJIJIL;
        canvas.drawRoundRect(rectF3, f9, f9, this.LLJ);
    }

    public final void setLevelProgress(float f) {
        this.LLILZLL = f;
    }

    public final void setLevelProgressColor(Integer num) {
        this.LLJILLL = num;
        invalidate();
    }

    public final void setMaxProgress(float f) {
        this.LLILZIL = f;
        invalidate();
    }

    public C1117870fCD(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int color = getResources().getColor(R.color.b4);
        this.LLILLL = color;
        this.LLILZ = color;
        this.LLILZIL = 100.0f;
        this.LLIZLLLIL = new Paint();
        this.LLJ = new Paint();
        this.LLJI = new Paint();
        this.LLJIJIL = (int) C497740JfY.LIZIZ(4.0f);
        this.LLJILJIL = (int) C497740JfY.LIZIZ(6.0f);
        this.LLJILJILJ = (int) C497740JfY.LIZIZ(6.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.UserLevelProgressBar);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        if (indexCount >= 0) {
            int i = 0;
            while (true) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == R$styleable.UserLevelProgressBar_backgroundColor) {
                    this.LLILZ = typedArrayObtainStyledAttributes.getColor(index, this.LLILLL);
                } else if (index == R$styleable.UserLevelProgressBar_progressColor) {
                    Integer numValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                    if (numValueOf.intValue() != 0) {
                        this.LLJILLL = Integer.valueOf(numValueOf.intValue());
                    }
                }
                if (i == indexCount) {
                    break;
                } else {
                    i++;
                }
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
        this.LLILLJJLI = size2;
        this.LL = size;
        setMeasuredDimension(size, size2);
        if (z) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setScaleX(-1.0f);
        }
    }

    public final void LIZ(final float f, final float f2, final InterfaceC1117910fCH interfaceC1117910fCH) {
        final float f3 = this.LLILZIL;
        if (f2 <= f3) {
            f3 = f2;
        }
        if (f3 < f) {
            if (interfaceC1117910fCH != null) {
                interfaceC1117910fCH.LIZ();
            }
        } else {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f3);
            valueAnimatorOfFloat.setDuration(300L);
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0fCE
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.LL.LLILZLL = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (f != f2) {
                        C1117870fCD c1117870fCD = this.LL;
                        float f4 = c1117870fCD.LLIZ;
                        if (f4 != 0.0f) {
                            c1117870fCD.LLIZ = f4 - (((Float) valueAnimator.getAnimatedValue()).floatValue() - f);
                        }
                    }
                    this.LL.postInvalidate();
                }
            });
            valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: X.0fCF
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    InterfaceC1117910fCH interfaceC1117910fCH2 = interfaceC1117910fCH;
                    if (interfaceC1117910fCH2 != null) {
                        interfaceC1117910fCH2.LIZ();
                    }
                    this.LLILZLL = f3;
                }
            });
            valueAnimatorOfFloat.start();
        }
    }
}
