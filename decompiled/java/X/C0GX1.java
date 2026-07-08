package X;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.0GX1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GX1 extends C21413918rB {
    public float LLILLJJLI;
    public int LLILLL;
    public float LLILZ;
    public float LLILZIL;
    public final float LLILZLL;
    public float LLIZ;
    public float LLIZLLLIL;
    public final float LLJ;

    public C0GX1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final C415510GQz getNegativeProgressDrawable() {
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable instanceof C415510GQz) {
            return (C415510GQz) progressDrawable;
        }
        return null;
    }

    public final int getActualProgress() {
        return getProgress() + this.LLILLL;
    }

    public final C417070GWz getNegativeThumbDrawable() {
        Drawable thumb = getThumb();
        if (thumb instanceof C417070GWz) {
            return (C417070GWz) thumb;
        }
        return null;
    }

    public final float getScale() {
        return getMax() > 0 ? (getProgress() * 1.0f) / getMax() : getMax() != 0 ? 0.0f : 1.0f;
    }

    public final void LJI(boolean z) {
        final float f;
        final float f2;
        float f3;
        float f4;
        final float f5;
        final float f6;
        if (z) {
            f = this.LLILZ;
        } else {
            f = this.LLIZ;
        }
        if (z) {
            f2 = this.LLIZ;
        } else {
            f2 = this.LLILZ;
        }
        if (z) {
            f3 = this.LLILZIL;
            f4 = this.LLIZLLLIL;
            f5 = this.LLILZLL;
            f6 = this.LLJ;
        } else {
            f3 = this.LLIZLLLIL;
            f4 = this.LLILZIL;
            f5 = this.LLJ;
            f6 = this.LLILZLL;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f3, f4);
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.setInterpolator(C1619980sG4.LJ());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0GX0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float animatedFraction = f + ((int) ((f2 - r3) * valueAnimator.getAnimatedFraction()));
                float animatedFraction2 = f5 + ((int) ((f6 - r2) * valueAnimator.getAnimatedFraction()));
                C417070GWz negativeThumbDrawable = this.getNegativeThumbDrawable();
                if (negativeThumbDrawable != null) {
                    C0GX1 c0gx1 = this;
                    negativeThumbDrawable.LIZIZ = animatedFraction;
                    negativeThumbDrawable.LIZJ = fFloatValue;
                    negativeThumbDrawable.LJ = animatedFraction2;
                    c0gx1.invalidate();
                }
            }
        });
        valueAnimatorOfFloat.start();
    }

    @Override // X.C21413918rB, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onDraw(Canvas canvas) {
        Rect bounds;
        float scale = getScale();
        C415510GQz negativeProgressDrawable = getNegativeProgressDrawable();
        if (negativeProgressDrawable != null) {
            negativeProgressDrawable.LJIIJ = scale;
        }
        C417070GWz negativeThumbDrawable = getNegativeThumbDrawable();
        if (negativeThumbDrawable != null) {
            int iWidth = 0;
            if (scale == 1.0f && getMax() == 0) {
                C415510GQz negativeProgressDrawable2 = getNegativeProgressDrawable();
                if (negativeProgressDrawable2 != null && (bounds = negativeProgressDrawable2.getBounds()) != null) {
                    iWidth = bounds.width();
                }
                int iWidth2 = iWidth - (negativeThumbDrawable.getBounds().width() / 2);
                negativeThumbDrawable.getBounds().set(iWidth2, negativeThumbDrawable.getBounds().top, negativeThumbDrawable.getBounds().width() + iWidth2, negativeThumbDrawable.getBounds().bottom);
            }
        }
        super.onDraw(canvas);
    }

    public final void setDrawBeginScale(float f) {
        this.LLILLJJLI = f;
        C415510GQz negativeProgressDrawable = getNegativeProgressDrawable();
        if (negativeProgressDrawable != null) {
            negativeProgressDrawable.LJIIJJI = f;
        }
    }

    public final void setEqualDivisionCount(int i) {
        C415510GQz negativeProgressDrawable = getNegativeProgressDrawable();
        if (negativeProgressDrawable == null) {
            return;
        }
        if (i <= 1) {
            negativeProgressDrawable.LJIIL = null;
        } else {
            int i2 = i - 1;
            float[] fArr = new float[i2];
            int i3 = 0;
            while (i3 < i2) {
                int i4 = i3 + 1;
                fArr[i3] = i4 / i;
                i3 = i4;
            }
            negativeProgressDrawable.LJIIL = fArr;
        }
        invalidate();
    }

    @Override // android.widget.SeekBar
    public void setOnSeekBarChangeListener(final SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        super.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(onSeekBarChangeListener) { // from class: X.0GX2
            public final SeekBar.OnSeekBarChangeListener LL;

            {
                this.LL = onSeekBarChangeListener;
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onStartTrackingTouch(SeekBar seekBar) {
                C0GX1 c0gx1;
                if ((seekBar instanceof C0GX1) && (c0gx1 = (C0GX1) seekBar) != null) {
                    C417070GWz negativeThumbDrawable = c0gx1.getNegativeThumbDrawable();
                    if (negativeThumbDrawable != null) {
                        negativeThumbDrawable.LJI = true;
                    }
                    SeekBar.OnSeekBarChangeListener onSeekBarChangeListener2 = this.LL;
                    if (onSeekBarChangeListener2 != null) {
                        onSeekBarChangeListener2.onStartTrackingTouch(seekBar);
                    }
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onStopTrackingTouch(SeekBar seekBar) {
                C0GX1 c0gx1;
                if ((seekBar instanceof C0GX1) && (c0gx1 = (C0GX1) seekBar) != null) {
                    C417070GWz negativeThumbDrawable = c0gx1.getNegativeThumbDrawable();
                    if (negativeThumbDrawable != null) {
                        negativeThumbDrawable.LJI = false;
                    }
                    SeekBar.OnSeekBarChangeListener onSeekBarChangeListener2 = this.LL;
                    if (onSeekBarChangeListener2 != null) {
                        onSeekBarChangeListener2.onStopTrackingTouch(seekBar);
                    }
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                C0GX1 c0gx1;
                if ((seekBar instanceof C0GX1) && (c0gx1 = (C0GX1) seekBar) != null) {
                    C417070GWz negativeThumbDrawable = c0gx1.getNegativeThumbDrawable();
                    if (negativeThumbDrawable != null) {
                        negativeThumbDrawable.LJFF = i;
                    }
                    SeekBar.OnSeekBarChangeListener onSeekBarChangeListener2 = this.LL;
                    if (onSeekBarChangeListener2 != null) {
                        onSeekBarChangeListener2.onProgressChanged(seekBar, i, z);
                    }
                }
            }
        });
    }

    public final void setProgressDotColor(int i) {
        C415510GQz negativeProgressDrawable = getNegativeProgressDrawable();
        if (negativeProgressDrawable != null) {
            negativeProgressDrawable.LJ = i;
        }
        invalidate();
    }

    public final void setProgressDotWidth(float f) {
        C415510GQz negativeProgressDrawable = getNegativeProgressDrawable();
        if (negativeProgressDrawable != null) {
            negativeProgressDrawable.LJFF = f;
        }
        invalidate();
    }

    public final void setProgressHeight(float f) {
        C415510GQz negativeProgressDrawable = getNegativeProgressDrawable();
        if (negativeProgressDrawable != null) {
            negativeProgressDrawable.LIZJ = f;
        }
    }

    public final void setScale(float f) {
        setProgress((int) (f * getMax()));
    }

    public final void setStartStyle(boolean z) {
        C415510GQz negativeProgressDrawable = getNegativeProgressDrawable();
        if (negativeProgressDrawable != null) {
            negativeProgressDrawable.LJII = z;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0GX1(Context context, AttributeSet attributeSet, int i) {
        int i2;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        AttributeSet attributeSet2 = (i & 2) != 0 ? null : attributeSet;
        if ((i & 4) != 0) {
            i2 = R.attr.seekBarStyle;
        } else {
            i2 = 0;
        }
        super(context, attributeSet2, i2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet2, R$styleable.AmeSeekBar);
        this.LLILLJJLI = typedArrayObtainStyledAttributes.getFloat(R$styleable.AmeSeekBar_drawBeginScale, 0.0f);
        this.LLILLL = typedArrayObtainStyledAttributes.getInt(R$styleable.AmeSeekBar_progressMin, 0);
        typedArrayObtainStyledAttributes.getInt(R$styleable.AmeSeekBar_progressMax, 100);
        this.LLILZ = C418440Gaw.LIZIZ(16);
        this.LLILZIL = C418440Gaw.LIZIZ(20);
        float fLIZIZ = C418440Gaw.LIZIZ(6);
        this.LLILZLL = fLIZIZ;
        this.LLIZ = C418440Gaw.LIZIZ(24);
        this.LLIZLLLIL = C418440Gaw.LIZIZ(30);
        this.LLJ = C418440Gaw.LIZIZ(8);
        C415510GQz c415510GQz = new C415510GQz();
        c415510GQz.LJIIJJI = this.LLILLJJLI;
        Integer numLIZJ = C1308910kAL.LIZJ(com.zhiliaoapp.musically.R.attr.a0p, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -1;
        }
        c415510GQz.LIZ = iIntValue;
        Integer numLIZJ2 = C1308910kAL.LIZJ(com.zhiliaoapp.musically.R.attr.a01, context);
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        } else {
            iIntValue2 = -16777216;
        }
        c415510GQz.LIZIZ = iIntValue2;
        Integer numLIZJ3 = C1308910kAL.LIZJ(com.zhiliaoapp.musically.R.attr.oz, context);
        if (numLIZJ3 != null) {
            iIntValue3 = numLIZJ3.intValue();
        } else {
            iIntValue3 = -16777216;
        }
        c415510GQz.LIZLLL = iIntValue3;
        setProgressDrawable(c415510GQz);
        C417070GWz c417070GWz = new C417070GWz();
        c417070GWz.LIZIZ = this.LLILZ;
        c417070GWz.LIZJ = this.LLILZIL;
        c417070GWz.LJ = fLIZIZ;
        Integer numLIZJ4 = C1308910kAL.LIZJ(com.zhiliaoapp.musically.R.attr.a0p, context);
        c417070GWz.LIZ = numLIZJ4 != null ? numLIZJ4.intValue() : -1;
        Integer numLIZJ5 = C1308910kAL.LIZJ(com.zhiliaoapp.musically.R.attr.oz, context);
        c417070GWz.LIZLLL = numLIZJ5 != null ? numLIZJ5.intValue() : -16777216;
        setThumb(c417070GWz);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
        int i3 = (int) (this.LLIZ / 2);
        C426750GoL.LJIIL(this, Integer.valueOf(i3), Integer.valueOf(iLIZIZ), Integer.valueOf(i3), Integer.valueOf(iLIZIZ), 16);
        setSplitTrack(false);
    }
}
