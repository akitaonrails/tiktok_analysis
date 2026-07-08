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
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0EaG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C367060EaG extends C12ME {
    public int LLJJIJI;
    public int LLJJIJIIJIL;
    public float LLJJIJIL;
    public final float LLJJJ;
    public final float LLJJJIL;
    public final float LLJJJJ;
    public float LLJJJJJIL;
    public float LLJJJJLIIL;
    public final float LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public int[] LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;

    public C367060EaG(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final C366990Ea9 getNegativeProgressDrawable() {
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable instanceof C366990Ea9) {
            return (C366990Ea9) progressDrawable;
        }
        return null;
    }

    public final int getActualProgress() {
        return getProgress() + this.LLJJIJI;
    }

    public final C367070EaH getNegativeThumbDrawable() {
        Drawable thumb = getThumb();
        if (thumb instanceof C367070EaH) {
            return (C367070EaH) thumb;
        }
        return null;
    }

    public final float getScale() {
        return getMax() > 0 ? (getProgress() * 1.0f) / getMax() : getMax() != 0 ? 0.0f : 1.0f;
    }

    public final int getActualMaxProgress() {
        return this.LLJJIJIIJIL;
    }

    public final int getActualMinProgress() {
        return this.LLJJIJI;
    }

    public final boolean getEnableThumbAlign() {
        return this.LLJLILLLLZIIL;
    }

    public final int[] getProgressDots() {
        return this.LLJL;
    }

    public final boolean getShowActualProgress() {
        return this.LLJLIL;
    }

    public final void LJII(boolean z) {
        final float f;
        final float f2;
        float f3;
        float f4;
        final float f5;
        final float f6;
        if (z) {
            f = this.LLJJJ;
        } else {
            f = this.LLJJJJJIL;
        }
        if (z) {
            f2 = this.LLJJJJJIL;
        } else {
            f2 = this.LLJJJ;
        }
        if (z) {
            f3 = this.LLJJJIL;
            f4 = this.LLJJJJLIIL;
            f5 = this.LLJJJJ;
            f6 = this.LLJJL;
        } else {
            f3 = this.LLJJJJLIIL;
            f4 = this.LLJJJIL;
            f5 = this.LLJJL;
            f6 = this.LLJJJJ;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f3, f4);
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.setInterpolator(C1619980sG4.LJ());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0EaJ
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float animatedFraction = f + ((int) ((f2 - r3) * valueAnimator.getAnimatedFraction()));
                float animatedFraction2 = f5 + ((int) ((f6 - r2) * valueAnimator.getAnimatedFraction()));
                C367070EaH negativeThumbDrawable = this.getNegativeThumbDrawable();
                if (negativeThumbDrawable != null) {
                    C367060EaG c367060EaG = this;
                    negativeThumbDrawable.LIZIZ = animatedFraction;
                    negativeThumbDrawable.LIZJ = fFloatValue;
                    negativeThumbDrawable.LJFF = animatedFraction2;
                    c367060EaG.invalidate();
                }
            }
        });
        valueAnimatorOfFloat.start();
    }

    @Override // X.C12ME, X.C21413918rB, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onDraw(Canvas canvas) {
        Rect bounds;
        float scale = getScale();
        C366990Ea9 negativeProgressDrawable = getNegativeProgressDrawable();
        if (negativeProgressDrawable != null) {
            negativeProgressDrawable.LJIIL = scale;
        }
        C367070EaH negativeThumbDrawable = getNegativeThumbDrawable();
        if (negativeThumbDrawable != null) {
            int iWidth = 0;
            if (scale == 1.0f && getMax() == 0) {
                C366990Ea9 negativeProgressDrawable2 = getNegativeProgressDrawable();
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
        this.LLJJIJIL = f;
        C366990Ea9 negativeProgressDrawable = getNegativeProgressDrawable();
        if (negativeProgressDrawable != null) {
            negativeProgressDrawable.LJIILIIL = f;
        }
    }

    public final void setEnableThumbAlign(boolean z) {
        float f;
        this.LLJLILLLLZIIL = z;
        C366990Ea9 negativeProgressDrawable = getNegativeProgressDrawable();
        if (negativeProgressDrawable != null) {
            if (z) {
                f = this.LLJJJ / 2;
            } else {
                f = 0.0f;
            }
            negativeProgressDrawable.LJIIIZ = f;
        }
    }

    @Override // android.widget.SeekBar
    public void setOnSeekBarChangeListener(final SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        super.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(onSeekBarChangeListener) { // from class: X.0EaI
            public final SeekBar.OnSeekBarChangeListener LL;

            {
                this.LL = onSeekBarChangeListener;
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onStartTrackingTouch(SeekBar seekBar) {
                C367060EaG c367060EaG;
                if ((seekBar instanceof C367060EaG) && (c367060EaG = (C367060EaG) seekBar) != null) {
                    C367070EaH negativeThumbDrawable = c367060EaG.getNegativeThumbDrawable();
                    if (negativeThumbDrawable != null) {
                        negativeThumbDrawable.LJII = true;
                    }
                    SeekBar.OnSeekBarChangeListener onSeekBarChangeListener2 = this.LL;
                    if (onSeekBarChangeListener2 != null) {
                        onSeekBarChangeListener2.onStartTrackingTouch(seekBar);
                    }
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onStopTrackingTouch(SeekBar seekBar) {
                C367060EaG c367060EaG;
                if ((seekBar instanceof C367060EaG) && (c367060EaG = (C367060EaG) seekBar) != null) {
                    C367070EaH negativeThumbDrawable = c367060EaG.getNegativeThumbDrawable();
                    if (negativeThumbDrawable != null) {
                        negativeThumbDrawable.LJII = false;
                    }
                    SeekBar.OnSeekBarChangeListener onSeekBarChangeListener2 = this.LL;
                    if (onSeekBarChangeListener2 != null) {
                        onSeekBarChangeListener2.onStopTrackingTouch(seekBar);
                    }
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                C367060EaG c367060EaG;
                int[] progressDots;
                int actualProgress;
                if ((seekBar instanceof C367060EaG) && (c367060EaG = (C367060EaG) seekBar) != null) {
                    C367070EaH negativeThumbDrawable = c367060EaG.getNegativeThumbDrawable();
                    if (negativeThumbDrawable != null) {
                        if (c367060EaG.getShowActualProgress()) {
                            actualProgress = c367060EaG.getActualProgress();
                        } else {
                            actualProgress = i;
                        }
                        negativeThumbDrawable.LJI = actualProgress;
                    }
                    if (c367060EaG.LLJJLIIIJLLLLLLLZ && (((progressDots = c367060EaG.getProgressDots()) != null && C13LQ.LJJIJ(i, progressDots) >= 0) || i == 0 || i == c367060EaG.LLJJIJIIJIL - c367060EaG.LLJJIJI)) {
                        new C0ZDN(c367060EaG.getContext()).LIZ(0);
                    }
                    SeekBar.OnSeekBarChangeListener onSeekBarChangeListener2 = this.LL;
                    if (onSeekBarChangeListener2 != null) {
                        onSeekBarChangeListener2.onProgressChanged(seekBar, i, z);
                    }
                }
            }
        });
    }

    public final void setProgressDots(int[] iArr) {
        float[] fArrLLI;
        this.LLJL = iArr;
        if (iArr != null) {
            ArrayList arrayList = new ArrayList(iArr.length);
            for (int i : iArr) {
                arrayList.add(Float.valueOf(i / getMax()));
            }
            fArrLLI = C13LP.LLI(arrayList);
        } else {
            fArrLLI = null;
        }
        C366990Ea9 negativeProgressDrawable = getNegativeProgressDrawable();
        if (negativeProgressDrawable != null) {
            negativeProgressDrawable.LJIILJJIL = fArrLLI;
        }
    }

    public final void setProgressHeight(float f) {
        C366990Ea9 negativeProgressDrawable = getNegativeProgressDrawable();
        if (negativeProgressDrawable != null) {
            negativeProgressDrawable.LIZJ = f;
        }
    }

    public final void setScale(float f) {
        setProgress((int) (f * getMax()));
    }

    public final void setShowActualProgress(boolean z) {
        this.LLJLIL = z;
    }

    public final void setStartStyle(boolean z) {
        C366990Ea9 negativeProgressDrawable = getNegativeProgressDrawable();
        if (negativeProgressDrawable != null) {
            negativeProgressDrawable.LJIIIIZZ = z;
        }
    }

    public final void setVibrate(boolean z) {
        this.LLJJLIIIJLLLLLLLZ = z;
    }

    public final void LJIIIIZZ(int i, int i2) {
        this.LLJJIJI = i;
        this.LLJJIJIIJIL = i2;
        setMax(i2 - i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C367060EaG(Context context, AttributeSet attributeSet, int i) {
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
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet2, R$styleable.NegativeProgressSeekBar);
        this.LLJJIJI = typedArrayObtainStyledAttributes.getInt(R$styleable.NegativeProgressSeekBar_neg_progressMin, 0);
        this.LLJJIJIIJIL = typedArrayObtainStyledAttributes.getInt(R$styleable.NegativeProgressSeekBar_neg_progressMax, 100);
        this.LLJJIJIL = typedArrayObtainStyledAttributes.getFloat(R$styleable.NegativeProgressSeekBar_neg_drawBeginScale, 0.0f);
        float fLIZIZ = C418440Gaw.LIZIZ(16);
        this.LLJJJ = fLIZIZ;
        float fLIZIZ2 = C418440Gaw.LIZIZ(20);
        this.LLJJJIL = fLIZIZ2;
        float fLIZIZ3 = C418440Gaw.LIZIZ(6);
        this.LLJJJJ = fLIZIZ3;
        this.LLJJJJJIL = C418440Gaw.LIZIZ(24);
        this.LLJJJJLIIL = C418440Gaw.LIZIZ(30);
        this.LLJJL = C418440Gaw.LIZIZ(8);
        this.LLILZLL = false;
        setMax(this.LLJJIJIIJIL - this.LLJJIJI);
        C367070EaH c367070EaH = new C367070EaH();
        c367070EaH.LIZIZ = fLIZIZ;
        c367070EaH.LIZJ = fLIZIZ2;
        c367070EaH.LJFF = fLIZIZ3;
        Integer numLIZJ = C1308910kAL.LIZJ(com.zhiliaoapp.musically.R.attr.a00, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -1;
        }
        c367070EaH.LIZ = iIntValue;
        Integer numLIZJ2 = C1308910kAL.LIZJ(com.zhiliaoapp.musically.R.attr.oz, context);
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        } else {
            iIntValue2 = -16777216;
        }
        c367070EaH.LIZLLL = iIntValue2;
        setThumb(c367070EaH);
        C366990Ea9 c366990Ea9 = new C366990Ea9();
        c366990Ea9.LJIILIIL = this.LLJJIJIL;
        Integer numLIZJ3 = C1308910kAL.LIZJ(com.zhiliaoapp.musically.R.attr.a00, context);
        c366990Ea9.LIZ = numLIZJ3 != null ? numLIZJ3.intValue() : -1;
        Integer numLIZJ4 = C1308910kAL.LIZJ(com.zhiliaoapp.musically.R.attr.a01, context);
        if (numLIZJ4 != null) {
            iIntValue3 = numLIZJ4.intValue();
        } else {
            iIntValue3 = -16777216;
        }
        c366990Ea9.LIZIZ = iIntValue3;
        Integer numLIZJ5 = C1308910kAL.LIZJ(com.zhiliaoapp.musically.R.attr.oz, context);
        c366990Ea9.LIZLLL = numLIZJ5 != null ? numLIZJ5.intValue() : -16777216;
        setProgressDrawable(c366990Ea9);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        int i3 = (int) (this.LLJJJJJIL / 2);
        C426750GoL.LJIIL(this, Integer.valueOf(i3), Integer.valueOf(iLIZIZ), Integer.valueOf(i3), Integer.valueOf(iLIZIZ), 16);
        setSplitTrack(false);
    }
}
