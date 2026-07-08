package X;

import Y.ARunnableS107S0100000_7;
import Y.AUListenerS1S0300004_29;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.LinearInterpolator;
import android.widget.SeekBar;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.12Ow, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19749612Ow extends C21413918rB implements SeekBar.OnSeekBarChangeListener {
    public final C19749412Ou LLILLJJLI;
    public final C19749812Oy LLILLL;
    public final C19749712Ox LLILZ;
    public SeekBar.OnSeekBarChangeListener LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public Float LLJ;
    public boolean LLJI;
    public int LLJIJIL;
    public boolean LLJILJIL;
    public final ValueAnimator LLJILJILJ;
    public final ValueAnimator LLJILLL;
    public final ValueAnimator LLJJ;
    public Integer LLJJI;
    public long LLJJIII;
    public float LLJJIJI;
    public ValueAnimator LLJJIJIIJIL;
    public float LLJJIJIL;
    public int LLJJJ;
    public final C01GW LLJJJIL;

    private final float getMinAnimStep() {
        return ((Number) this.LLJJJIL.getValue()).floatValue();
    }

    public final boolean getCanDrag() {
        return this.LLJI;
    }

    public final boolean getEnableClickToSeek() {
        return this.LLIZLLLIL;
    }

    public final boolean getHasActionMove() {
        return this.LLILZLL;
    }

    public final ValueAnimator getKeyPointAnimator() {
        return this.LLJJ;
    }

    public final float getLastProgress() {
        return this.LLJJIJI;
    }

    public final Float getMDownEventRawX() {
        return this.LLJ;
    }

    public final boolean getMPauseStatus() {
        return this.LLIZ;
    }

    public final ValueAnimator getProcessAnimator() {
        return this.LLJILJILJ;
    }

    public final int getRealWidth() {
        return this.LLJIJIL;
    }

    public final int getScreenWidth() {
        return this.LLJJJ;
    }

    public final ValueAnimator getThumbnailAnimator() {
        return this.LLJILLL;
    }

    public final Integer getVideoDuration() {
        return this.LLJJI;
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
        if (this.LLILZLL) {
            return true;
        }
        return super.canScrollHorizontally(i);
    }

    @Override // X.C21413918rB, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.LLJIJIL != (getWidth() - getPaddingLeft()) - getPaddingRight() || this.LLJILJIL) {
            HandlerHook.viewPost(this, new ARunnableS107S0100000_7(this, 176));
        }
        float fLJII = LJII(getProgress());
        float fLJII2 = LJII(getSecondaryProgress());
        C19749712Ox c19749712Ox = this.LLILZ;
        c19749712Ox.LJIILIIL = fLJII;
        c19749712Ox.LJIILJJIL = fLJII2;
        this.LLILLJJLI.LJIIIZ = fLJII;
        super.onDraw(canvas);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.LLILZIL;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStartTrackingTouch(seekBar);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        requestLayout();
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.LLILZIL;
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
                this.LLILZLL = false;
                this.LLJ = Float.valueOf(motionEvent.getRawX());
                super.onTouchEvent(motionEvent);
            } else if (numValueOf.intValue() == 2) {
                Float f = this.LLJ;
                if (f != null && Math.abs(f.floatValue() - motionEvent.getRawX()) > 10.0f) {
                    this.LLILZLL = true;
                    super.onTouchEvent(motionEvent);
                    return true;
                }
            } else {
                if (numValueOf.intValue() == 1) {
                    if (!this.LLILZLL && !this.LLIZ && !this.LLIZLLLIL) {
                        onStartTrackingTouch(this);
                        onStopTrackingTouch(this);
                    } else {
                        super.onTouchEvent(motionEvent);
                    }
                    this.LLILZLL = false;
                    return true;
                }
                if (numValueOf.intValue() == 3) {
                    super.onTouchEvent(motionEvent);
                    this.LLILZLL = false;
                    return true;
                }
            }
        }
        return true;
    }

    public final void setCanDrag(boolean z) {
        this.LLJI = z;
    }

    public final void setCustomOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.LLILZIL = onSeekBarChangeListener;
    }

    public final void setEnableClickToSeek(boolean z) {
        this.LLIZLLLIL = z;
    }

    public final void setHasActionMove(boolean z) {
        this.LLILZLL = z;
    }

    public final void setKeyPointsProgressPositions(List<Float> list) {
        C19749812Oy c19749812Oy = this.LLILLL;
        ((ArrayList) c19749812Oy.LJIIJJI).clear();
        ((ArrayList) c19749812Oy.LJIIJJI).addAll(list);
    }

    public final void setLastProgress(float f) {
        this.LLJJIJI = f;
    }

    public final void setMDownEventRawX(Float f) {
        this.LLJ = f;
    }

    public final void setMPauseStatus(boolean z) {
        this.LLIZ = z;
    }

    public final void setPauseStatus(boolean z) {
        this.LLIZ = z;
    }

    @Override // android.widget.ProgressBar
    public void setProgress(int i) {
        if (this.LLILZLL) {
            return;
        }
        super.setProgress(i);
    }

    public final void setProgressWithAnim(float f) {
        float f2;
        int iIntValue;
        final float f3;
        int iLIZLLL;
        int i;
        if (f > 100.0f) {
            f2 = 100.0f;
        } else {
            f2 = f;
        }
        Integer num = this.LLJJI;
        boolean z = false;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJJIII;
        if (jCurrentTimeMillis > 500) {
            jCurrentTimeMillis = 300;
        }
        boolean z2 = true;
        if (iIntValue < 30000 && 1 <= (i = (int) (((100.0f - f) / 100) * iIntValue)) && i < 300) {
            jCurrentTimeMillis = ((long) i) + 300;
            f2 = 100.0f;
        }
        Pair pair = new Pair(Float.valueOf(f2), Long.valueOf(jCurrentTimeMillis));
        final float fFloatValue = ((Number) pair.getFirst()).floatValue();
        float f4 = this.LLJJIJI;
        if (fFloatValue >= f4) {
            f3 = fFloatValue - f4;
        } else {
            f3 = (100.0f - f4) + fFloatValue;
        }
        if (this.LLJJIJIL <= 0.0f) {
            if (this.LLJJJ <= 0) {
                Integer numValueOf = Integer.valueOf(C12ES.LJIIJ(getContext()));
                if (numValueOf.intValue() > 0) {
                    iLIZLLL = numValueOf.intValue();
                } else {
                    C844470XAv.LIZ.getClass();
                    iLIZLLL = C418440Gaw.LIZLLL(C844470XAv.LIZ());
                }
                this.LLJJJ = iLIZLLL;
            }
            this.LLJJIJIL = (getMinAnimStep() * 100.0f) / this.LLJJJ;
        }
        if (f3 < this.LLJJIJIL / 2) {
            return;
        }
        this.LLJJIII = System.currentTimeMillis();
        if (((Number) pair.getSecond()).longValue() < 50) {
            z2 = false;
        }
        if (f3 > 20.0f) {
            z2 = false;
        }
        if (f3 >= ((double) this.LLJJIJIL) * 1.5d) {
            z = z2;
        }
        ValueAnimator valueAnimator = this.LLJJIJIIJIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LLJJIJIIJIL = null;
        if (z) {
            setProgress((int) (this.LLJJIJI * 100.0f));
            final C817403Hg c817403Hg = new C817403Hg();
            c817403Hg.element = this.LLJJIJI;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            valueAnimatorOfFloat.setDuration(((Number) pair.getSecond()).longValue());
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.12P0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    float fFloatValue2 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    float f5 = fFloatValue - (f3 * fFloatValue2);
                    if (f5 < 0.0f) {
                        f5 += 100.0f;
                    }
                    if (fFloatValue2 >= 0.08f) {
                        float f6 = c817403Hg.element;
                        if (f5 - f6 < this.LLJJIJIL && f5 - f6 >= 0.0f) {
                            return;
                        }
                    }
                    this.setProgress((int) (100.0f * f5));
                    c817403Hg.element = f5;
                }
            });
            this.LLJJIJIIJIL = valueAnimatorOfFloat;
            valueAnimatorOfFloat.start();
        } else {
            setProgress((int) (100.0f * fFloatValue));
        }
        this.LLJJIJI = fFloatValue;
    }

    public final void setRealWidth(int i) {
        this.LLJIJIL = i;
    }

    public final void setScreenWidth(int i) {
        this.LLJJJ = i;
    }

    public final void setVideoDuration(Integer num) {
        this.LLJJI = num;
    }

    public C19749612Ow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.fhp);
        C19749412Ou c19749412Ou = new C19749412Ou();
        this.LLILLJJLI = c19749412Ou;
        C19749812Oy c19749812Oy = new C19749812Oy();
        this.LLILLL = c19749812Oy;
        C19749712Ox c19749712Ox = new C19749712Ox(c19749412Ou, c19749812Oy, C1308910kAL.LIZJ(R.attr.a16, getContext()));
        this.LLILZ = c19749712Ox;
        this.LLJI = true;
        this.LLJILJILJ = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.LLJILLL = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.LLJJ = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.LLJJJIL = C452501pT.LIZIZ(new C0C1Y());
        setOnSeekBarChangeListener(this);
        setThumb(new Drawable() { // from class: X.12P1
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
        if (((Boolean) C07HV.LIZ.getValue()).booleanValue()) {
            setBackground(null);
        }
        setProgressDrawable(c19749712Ox);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LLILLJJLI.LJIIIIZZ = getMeasuredHeight();
        this.LLILLL.LJ = getMeasuredHeight();
        this.LLILLL.LIZLLL = getMeasuredWidth();
    }

    public final float LJI(ValueAnimator valueAnimator, float f, float f2) {
        return f + ((f2 - f) * ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.LLILZIL;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onProgressChanged(seekBar, i, z);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int paddingRight = (i - getPaddingRight()) - getPaddingLeft();
        this.LLJIJIL = paddingRight;
        this.LLILLJJLI.LJIIJ = paddingRight;
        this.LLJILJIL = false;
    }

    public final void LJIIIIZZ(Integer num, Integer num2, Float f, Float f2, Integer num3, float f3, boolean z) {
        boolean z2;
        C19749712Ox c19749712Ox = this.LLILZ;
        float f4 = c19749712Ox.LJI;
        float f5 = c19749712Ox.LJII;
        float f6 = c19749712Ox.LJIIIIZZ;
        if (num != null) {
            int iIntValue = num.intValue();
            C19749712Ox c19749712Ox2 = this.LLILZ;
            if (c19749712Ox2.LIZLLL != iIntValue) {
                z2 = true;
            } else {
                z2 = false;
            }
            c19749712Ox2.LIZLLL = iIntValue;
        } else {
            z2 = false;
        }
        if (num2 != null) {
            int iIntValue2 = num2.intValue();
            C19749712Ox c19749712Ox3 = this.LLILZ;
            if (c19749712Ox3.LJFF != iIntValue2) {
                z2 = true;
            }
            c19749712Ox3.LJFF = iIntValue2;
        }
        if (num3 != null) {
            int iIntValue3 = num3.intValue();
            C19749712Ox c19749712Ox4 = this.LLILZ;
            if (c19749712Ox4.LJ != iIntValue3) {
                z2 = true;
            }
            c19749712Ox4.LJ = iIntValue3;
        }
        if (f != null) {
            float fFloatValue = f.floatValue();
            C19749712Ox c19749712Ox5 = this.LLILZ;
            if (c19749712Ox5.LJI != fFloatValue) {
                z2 = true;
            }
            c19749712Ox5.LJI = fFloatValue;
        }
        if (f2 != null) {
            float fFloatValue2 = f2.floatValue();
            C19749712Ox c19749712Ox6 = this.LLILZ;
            if (c19749712Ox6.LJII != fFloatValue2) {
                z2 = true;
            }
            c19749712Ox6.LJII = fFloatValue2;
        }
        C19749712Ox c19749712Ox7 = this.LLILZ;
        if (c19749712Ox7.LJIIIIZZ != f3) {
            z2 = true;
        }
        c19749712Ox7.LJIIIIZZ = f3;
        if (z2) {
            requestLayout();
            if (z) {
                this.LLJILJILJ.removeAllUpdateListeners();
                this.LLJILJILJ.setInterpolator(C1619980sG4.LJIILIIL());
                this.LLJILJILJ.setDuration(100L);
                this.LLJILJILJ.addUpdateListener(new AUListenerS1S0300004_29(f5, f4, f6, f3, this, f2, f, 0));
                this.LLJILJILJ.start();
                return;
            }
            this.LLJILJIL = true;
            invalidate();
        }
    }

    public static void LJIIJJI(final C19749612Ow c19749612Ow, Float f, Float f2, Float f3, Integer num, float f4, boolean z, int i) {
        boolean z2;
        boolean z3;
        final float f5 = f4;
        final Float f6 = f3;
        final Float f7 = f2;
        final Float f8 = f;
        Integer num2 = null;
        if ((i & 1) != 0) {
            f8 = null;
        }
        if ((i & 2) != 0) {
            f7 = null;
        }
        if ((i & 4) != 0) {
            f6 = null;
        }
        if ((i & 8) == 0) {
            num2 = num;
        }
        if ((i & 256) != 0) {
            f5 = 0.0f;
        }
        if ((i & 512) != 0) {
            z = false;
        }
        C19749412Ou c19749412Ou = c19749612Ow.LLILLJJLI;
        final float f9 = c19749412Ou.LJIIJJI;
        final float f10 = c19749412Ou.LJFF;
        final float f11 = c19749412Ou.LJ;
        final float f12 = c19749412Ou.LJI;
        if (f8 != null) {
            float fFloatValue = f8.floatValue();
            C19749412Ou c19749412Ou2 = c19749612Ow.LLILLJJLI;
            if (c19749412Ou2.LJ == fFloatValue) {
                z3 = true;
            } else {
                z3 = false;
            }
            z2 = !z3;
            c19749412Ou2.LJ = fFloatValue;
        } else {
            z2 = false;
        }
        if (f7 != null) {
            float fFloatValue2 = f7.floatValue();
            C19749412Ou c19749412Ou3 = c19749612Ow.LLILLJJLI;
            if (c19749412Ou3.LJFF != fFloatValue2) {
                z2 = true;
            }
            c19749412Ou3.LJFF = fFloatValue2;
        }
        if (f6 != null) {
            float fFloatValue3 = f6.floatValue();
            C19749412Ou c19749412Ou4 = c19749612Ow.LLILLJJLI;
            if (c19749412Ou4.LJI != fFloatValue3) {
                z2 = true;
            }
            c19749412Ou4.LJI = fFloatValue3;
        }
        if (num2 != null) {
            int iIntValue = num2.intValue();
            C19749412Ou c19749412Ou5 = c19749612Ow.LLILLJJLI;
            if (c19749412Ou5.LIZIZ != iIntValue) {
                z2 = true;
            }
            c19749412Ou5.LIZIZ = iIntValue;
        }
        C19749412Ou c19749412Ou6 = c19749612Ow.LLILLJJLI;
        if (c19749412Ou6.LJIIJJI != f5) {
            z2 = true;
        }
        c19749412Ou6.LJIIJJI = f5;
        if (z2) {
            if (z) {
                c19749612Ow.LLJILLL.removeAllUpdateListeners();
                c19749612Ow.LLJILLL.setInterpolator(C1619980sG4.LJIILIIL());
                c19749612Ow.LLJILLL.setDuration(100L);
                c19749612Ow.LLJILLL.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.12Oz
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float fFloatValue4;
                        float fFloatValue5;
                        C19749612Ow c19749612Ow2 = this.LL;
                        c19749612Ow2.LLILLJJLI.LJIIJJI = c19749612Ow2.LJI(valueAnimator, f9, f5);
                        C19749612Ow c19749612Ow3 = this.LL;
                        C19749412Ou c19749412Ou7 = c19749612Ow3.LLILLJJLI;
                        float f13 = f10;
                        Float f14 = f7;
                        float fFloatValue6 = 0.0f;
                        if (f14 != null) {
                            fFloatValue4 = f14.floatValue();
                        } else {
                            fFloatValue4 = 0.0f;
                        }
                        c19749412Ou7.LJFF = c19749612Ow3.LJI(valueAnimator, f13, fFloatValue4);
                        C19749612Ow c19749612Ow4 = this.LL;
                        C19749412Ou c19749412Ou8 = c19749612Ow4.LLILLJJLI;
                        float f15 = f11;
                        Float f16 = f8;
                        if (f16 != null) {
                            fFloatValue5 = f16.floatValue();
                        } else {
                            fFloatValue5 = 0.0f;
                        }
                        c19749412Ou8.LJ = c19749612Ow4.LJI(valueAnimator, f15, fFloatValue5);
                        C19749612Ow c19749612Ow5 = this.LL;
                        C19749412Ou c19749412Ou9 = c19749612Ow5.LLILLJJLI;
                        float f18 = f12;
                        Float f19 = f6;
                        if (f19 != null) {
                            fFloatValue6 = f19.floatValue();
                        }
                        c19749412Ou9.LJI = c19749612Ow5.LJI(valueAnimator, f18, fFloatValue6);
                        C19749612Ow c19749612Ow6 = this.LL;
                        c19749612Ow6.LLJILJIL = true;
                        c19749612Ow6.invalidate();
                    }
                });
                c19749612Ow.LLJILLL.start();
                return;
            }
            c19749612Ow.LLJILJIL = true;
            c19749612Ow.invalidate();
        }
    }

    public static void LJIIJ(C19749612Ow c19749612Ow, Float f, Float f2, float f3, Float f4, Float f5, Float f6, Integer num, boolean z, int i) {
        boolean z2;
        boolean z3;
        float f7 = f3;
        Float f8 = f2;
        Float f9 = f;
        Integer num2 = null;
        if ((i & 1) != 0) {
            f9 = null;
        }
        if ((i & 2) != 0) {
            f8 = null;
        }
        if ((i & 4) != 0) {
            f7 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = null;
        }
        if ((i & 16) != 0) {
            f5 = null;
        }
        if ((i & 32) != 0) {
            f6 = null;
        }
        if ((i & 64) == 0) {
            num2 = num;
        }
        if ((i & 128) != 0) {
            z = false;
        }
        C19749812Oy c19749812Oy = c19749612Ow.LLILLL;
        float f10 = c19749812Oy.LIZIZ;
        float f11 = c19749812Oy.LIZ;
        float f12 = c19749812Oy.LIZJ;
        if (f9 != null) {
            float fFloatValue = f9.floatValue();
            C19749812Oy c19749812Oy2 = c19749612Ow.LLILLL;
            if (c19749812Oy2.LIZIZ == fFloatValue) {
                z3 = true;
            } else {
                z3 = false;
            }
            z2 = !z3;
            c19749812Oy2.LIZIZ = fFloatValue;
        } else {
            z2 = false;
        }
        if (f8 != null) {
            float fFloatValue2 = f8.floatValue();
            C19749812Oy c19749812Oy3 = c19749612Ow.LLILLL;
            if (c19749812Oy3.LIZ != fFloatValue2) {
                z2 = true;
            }
            c19749812Oy3.LIZ = fFloatValue2;
        }
        C19749812Oy c19749812Oy4 = c19749612Ow.LLILLL;
        if (c19749812Oy4.LIZJ != f7) {
            z2 = true;
        }
        c19749812Oy4.LIZJ = f7;
        if (f4 != null) {
            float fFloatValue3 = f4.floatValue();
            C19749812Oy c19749812Oy5 = c19749612Ow.LLILLL;
            if (c19749812Oy5.LJIIIIZZ != fFloatValue3) {
                z2 = true;
            }
            c19749812Oy5.LJIIIIZZ = fFloatValue3;
        }
        if (f5 != null) {
            float fFloatValue4 = f5.floatValue();
            C19749812Oy c19749812Oy6 = c19749612Ow.LLILLL;
            if (c19749812Oy6.LJIIIZ != fFloatValue4) {
                z2 = true;
            }
            c19749812Oy6.LJIIIZ = fFloatValue4;
        }
        if (f6 != null) {
            float fFloatValue5 = f6.floatValue();
            C19749812Oy c19749812Oy7 = c19749612Ow.LLILLL;
            if (c19749812Oy7.LJIIJ != fFloatValue5) {
                z2 = true;
            }
            c19749812Oy7.LJIIJ = fFloatValue5;
        }
        if (num2 != null) {
            int iIntValue = num2.intValue();
            C19749812Oy c19749812Oy8 = c19749612Ow.LLILLL;
            if (c19749812Oy8.LJII != iIntValue) {
                z2 = true;
            }
            c19749812Oy8.LJII = iIntValue;
        }
        if (z2) {
            if (z) {
                c19749612Ow.LLJJ.removeAllUpdateListeners();
                c19749612Ow.LLJJ.setInterpolator(C1619980sG4.LJIILIIL());
                c19749612Ow.LLJJ.setDuration(100L);
                c19749612Ow.LLJJ.addUpdateListener(new AUListenerS1S0300004_29(f12, f7, f10, f11, c19749612Ow, f9, f8, 1));
                c19749612Ow.LLJJ.start();
                return;
            }
            c19749612Ow.LLJILJIL = true;
            c19749612Ow.invalidate();
        }
    }
}
