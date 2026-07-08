package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.SeekBar;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.12Or, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19749112Or extends C21413918rB implements SeekBar.OnSeekBarChangeListener {
    public static final /* synthetic */ int LLJILLL = 0;
    public final C19749312Ot LLILLJJLI;
    public final C19749212Os LLILLL;
    public SeekBar.OnSeekBarChangeListener LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public Float LLIZLLLIL;
    public boolean LLJ;
    public int LLJI;
    public boolean LLJIJIL;
    public final ValueAnimator LLJILJIL;
    public final ValueAnimator LLJILJILJ;

    public final boolean getCanDrag() {
        return this.LLJ;
    }

    public final Float getDownEventRawX() {
        return this.LLIZLLLIL;
    }

    public final boolean getEnableClickToSeek() {
        return this.LLIZ;
    }

    public final boolean getHasActionMove() {
        return this.LLILZIL;
    }

    public final boolean getPauseStatus() {
        return this.LLILZLL;
    }

    public final ValueAnimator getProcessAnimator() {
        return this.LLJILJIL;
    }

    public final int getRealWidth() {
        return this.LLJI;
    }

    public final ValueAnimator getThumbnailAnimator() {
        return this.LLJILJILJ;
    }

    public final float LJII(int i) {
        float min;
        int max;
        if (Build.VERSION.SDK_INT >= 26) {
            max = getMax() - getMin();
            if (max <= 0) {
                return 0.0f;
            }
            min = (i - getMin()) * 1.0f;
        } else {
            if (getMax() <= 0) {
                return 0.0f;
            }
            min = i * 1.0f;
            max = getMax();
        }
        return min / max;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (this.LLILZIL) {
            return true;
        }
        return super.canScrollHorizontally(i);
    }

    @Override // X.C21413918rB, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.LLJI != (getWidth() - getPaddingLeft()) - getPaddingRight() || this.LLJIJIL) {
            HandlerHook.viewPost(this, new Runnable() { // from class: X.0T6a
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("MutableSeekBar@27da.checkUpdateDrawableBounds$1");
                    try {
                        C19749112Or c19749112Or = this.LL;
                        c19749112Or.onSizeChanged(c19749112Or.getWidth(), this.LL.getHeight(), 0, 0);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("MutableSeekBar@27da.checkUpdateDrawableBounds$1");
                }
            });
        }
        float fLJII = LJII(getProgress());
        float fLJII2 = LJII(getSecondaryProgress());
        C19749212Os c19749212Os = this.LLILLL;
        c19749212Os.LJIIIIZZ = fLJII;
        c19749212Os.LJIIIZ = fLJII2;
        this.LLILLJJLI.LJIIIZ = fLJII;
        super.onDraw(canvas);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.LLILZ;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStartTrackingTouch(seekBar);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        requestLayout();
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.LLILZ;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStopTrackingTouch(seekBar);
        }
    }

    @Override // android.widget.AbsSeekBar, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf;
        if (motionEvent != null) {
            numValueOf = Integer.valueOf(motionEvent.getAction());
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            if (numValueOf.intValue() == 0) {
                this.LLILZIL = false;
                this.LLIZLLLIL = Float.valueOf(motionEvent.getRawX());
                super.onTouchEvent(motionEvent);
            } else if (numValueOf.intValue() == 2) {
                Float f = this.LLIZLLLIL;
                if (f != null && Math.abs(f.floatValue() - motionEvent.getRawX()) > 10.0f) {
                    this.LLILZIL = true;
                    super.onTouchEvent(motionEvent);
                    return true;
                }
            } else {
                if (numValueOf.intValue() == 1) {
                    if (!this.LLILZIL && !this.LLILZLL && !this.LLIZ) {
                        onStartTrackingTouch(this);
                        onStopTrackingTouch(this);
                    } else {
                        super.onTouchEvent(motionEvent);
                    }
                    this.LLILZIL = false;
                    return true;
                }
                if (numValueOf.intValue() == 3) {
                    super.onTouchEvent(motionEvent);
                    this.LLILZIL = false;
                    return true;
                }
            }
        }
        return true;
    }

    public final void setCanDrag(boolean z) {
        this.LLJ = z;
    }

    public final void setCustomOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.LLILZ = onSeekBarChangeListener;
    }

    public final void setDownEventRawX(Float f) {
        this.LLIZLLLIL = f;
    }

    public final void setEnableClickToSeek(boolean z) {
        this.LLIZ = z;
    }

    public final void setHasActionMove(boolean z) {
        this.LLILZIL = z;
    }

    public final void setPauseStatus(boolean z) {
        this.LLILZLL = z;
    }

    @Override // android.widget.ProgressBar
    public void setProgress(int i) {
        if (this.LLILZIL) {
            return;
        }
        super.setProgress(i);
    }

    public final void setRealWidth(int i) {
        this.LLJI = i;
    }

    public C19749112Or(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.fhp);
        C19749312Ot c19749312Ot = new C19749312Ot();
        this.LLILLJJLI = c19749312Ot;
        C19749212Os c19749212Os = new C19749212Os(c19749312Ot);
        this.LLILLL = c19749212Os;
        this.LLJ = true;
        this.LLJILJIL = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.LLJILJILJ = ValueAnimator.ofFloat(0.0f, 1.0f);
        setOnSeekBarChangeListener(this);
        setThumb(new Drawable() { // from class: X.12Ov
            @Override // android.graphics.drawable.Drawable
            public final void draw(Canvas canvas) {
            }

            @Override // android.graphics.drawable.Drawable
            public final int getOpacity() {
                return -3;
            }

            @Override // android.graphics.drawable.Drawable
            public final void setAlpha(int i) {
            }

            @Override // android.graphics.drawable.Drawable
            public final void setColorFilter(ColorFilter colorFilter) {
            }
        });
        setProgressDrawable(c19749212Os);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LLILLJJLI.LJIIIIZZ = getMeasuredHeight();
    }

    public final float LJI(ValueAnimator valueAnimator, float f, float f2) {
        return f + ((f2 - f) * ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.LLILZ;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onProgressChanged(seekBar, i, z);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int paddingRight = (i - getPaddingRight()) - getPaddingLeft();
        this.LLJI = paddingRight;
        this.LLILLJJLI.LJIIJ = paddingRight;
        this.LLJIJIL = false;
    }
}
