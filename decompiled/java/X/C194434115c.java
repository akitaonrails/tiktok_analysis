package X;

import Y.ALAdapterS23S0200000_29;
import Y.AUListenerS277S0100000_29;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.115c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C194434115c extends View implements InterfaceC2227008o0 {
    public static final float LLJJJJ = C418440Gaw.LIZIZ(Float.valueOf(4.5f));
    public static final float LLJJJJJIL;
    public static final float LLJJJJLIIL;
    public int LL;
    public float LLILLJJLI;
    public float LLILLL;
    public float LLILZ;
    public float LLILZIL;
    public boolean LLILZLL;
    public ValueAnimator LLIZ;
    public List<Float> LLIZLLLIL;
    public float LLJ;
    public boolean LLJI;
    public Function1<? super Float, Unit> LLJIJIL;
    public Function0<Unit> LLJILJIL;
    public final List<C1867707Tf> LLJILJILJ;
    public long LLJILLL;
    public ValueAnimator LLJJ;
    public boolean LLJJI;
    public float[] LLJJIII;
    public ValueAnimator LLJJIJI;
    public final Paint LLJJIJIIJIL;
    public int LLJJIJIL;
    public int LLJJJ;
    public final int LLJJJIL;

    public final void LJIIIZ() {
        this.LLJJI = false;
        ValueAnimator valueAnimator = this.LLJJ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LLJJ = null;
    }

    static {
        Float fValueOf = Float.valueOf(2.0f);
        LLJJJJJIL = C418440Gaw.LIZIZ(fValueOf);
        LLJJJJLIIL = C418440Gaw.LIZIZ(fValueOf);
    }

    public final int LJFF() {
        return Math.max(1, (int) (((getWidth() - getPaddingStart()) - getPaddingEnd()) / LLJJJJ));
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LJIIIZ();
        ValueAnimator valueAnimator = this.LLJJIJI;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LLJJIJI = null;
        ValueAnimator valueAnimator2 = this.LLIZ;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.LLIZ = null;
    }

    public final boolean getFillWidth() {
        return this.LLJI;
    }

    public final int getMode() {
        return this.LL;
    }

    public final Function0<Unit> getOnSeekFinishedListener() {
        return this.LLJILJIL;
    }

    public final Function1<Float, Unit> getOnSeekListener() {
        return this.LLJIJIL;
    }

    public final float getPlaybackAlpha() {
        return this.LLILLL;
    }

    public final float getPlaybackWidthRatio() {
        return this.LLILZ;
    }

    public final float getRecordingAlpha() {
        return this.LLILLJJLI;
    }

    public final boolean getRecordingScalePivotCenter() {
        return this.LLILZLL;
    }

    public final float getRecordingWidthScale() {
        return this.LLILZIL;
    }

    public final void LIZLLL(Canvas canvas) {
        float[] fArrLJII = this.LLJJIII;
        if (fArrLJII.length == 0) {
            if ((!this.LLIZLLLIL.isEmpty()) && getWidth() > 0) {
                List<Float> list = this.LLIZLLLIL;
                fArrLJII = LJII(LJI(list.size()), list);
                this.LLJJIII = fArrLJII;
            } else {
                return;
            }
        }
        int length = fArrLJII.length;
        if (length <= 0) {
            return;
        }
        float height = getHeight();
        float fLIZLLL = C13LZ.LIZLLL(this.LLILZ, 0.0f, 1.0f);
        float fLIZLLL2 = length * LLJJJJ * fLIZLLL * C13LZ.LIZLLL(this.LLJ, 0.0f, 1.0f);
        this.LLJJIJIIJIL.setColor(LIZIZ(this.LLILLL, this.LLJJJ));
        LIZJ(canvas, fArrLJII, height, fLIZLLL);
        if (fLIZLLL2 > 0.0f) {
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, fLIZLLL2, height);
            this.LLJJIJIIJIL.setColor(LIZIZ(this.LLILLL, this.LLJJIJIL));
            LIZJ(canvas, fArrLJII, height, fLIZLLL);
            canvas.restore();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(android.graphics.Canvas r32) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C194434115c.LJ(android.graphics.Canvas):void");
    }

    public final int LJI(int i) {
        int iLJFF = LJFF();
        if (!this.LLJI) {
            return C13LZ.LJ(i, 1, iLJFF);
        }
        return iLJFF;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z;
        super.onDraw(canvas);
        try {
            if (getLayoutDirection() == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                canvas.save();
                canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, 0.0f);
            }
            try {
                if (this.LLILLJJLI > 0.0f && (!this.LLJILJILJ.isEmpty())) {
                    LJ(canvas);
                }
                if (this.LLILLL > 0.0f && (this.LLJJIII.length != 0 || (!this.LLIZLLLIL.isEmpty()))) {
                    LIZLLL(canvas);
                }
                if (z) {
                    canvas.restore();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (z) {
                    canvas.restore();
                }
                throw th;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BulletinWaveformView onDraw guarded ");
            sbLIZ.append(th2.getClass().getSimpleName());
            sbLIZ.append(": ");
            sbLIZ.append(th2.getMessage());
            C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LL == 1 && this.LLJIJIL != null) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            return super.onTouchEvent(motionEvent);
                        }
                    }
                }
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(false);
                }
                Function0<Unit> function0 = this.LLJILJIL;
                if (function0 != null) {
                    function0.invoke();
                }
                return true;
            }
            ViewParent parent2 = getParent();
            if (parent2 != null) {
                parent2.requestDisallowInterceptTouchEvent(true);
            }
            ValueAnimator valueAnimator = this.LLJJIJI;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.LLJJIJI = null;
            float length = this.LLJJIII.length * LLJJJJ;
            if (length <= 0.0f) {
                length = (getWidth() - getPaddingStart()) - getPaddingEnd();
            }
            float fLIZLLL = C13LZ.LIZLLL((motionEvent.getX() - getPaddingStart()) / length, 0.0f, 1.0f);
            if (getLayoutDirection() == 1) {
                fLIZLLL = 1.0f - fLIZLLL;
            }
            this.LLJ = fLIZLLL;
            Function1<? super Float, Unit> function1 = this.LLJIJIL;
            if (function1 != null) {
                function1.invoke(Float.valueOf(fLIZLLL));
            }
            invalidate();
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setFillWidth(boolean z) {
        this.LLJI = z;
    }

    public final void setMode(int i) {
        this.LL = i;
        if (i != 0) {
            LJIIIZ();
        } else {
            ValueAnimator valueAnimator = this.LLJJIJI;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.LLJJIJI = null;
        }
        invalidate();
    }

    public final void setOnSeekFinishedListener(Function0<Unit> function0) {
        this.LLJILJIL = function0;
    }

    public final void setOnSeekListener(Function1<? super Float, Unit> function1) {
        this.LLJIJIL = function1;
    }

    public final void setPlaybackAlpha(float f) {
        float fLIZLLL = C13LZ.LIZLLL(f, 0.0f, 1.0f);
        if (this.LLILLL != fLIZLLL) {
            this.LLILLL = fLIZLLL;
            invalidate();
        }
    }

    public final void setPlaybackWidthRatio(float f) {
        float fLIZLLL = C13LZ.LIZLLL(f, 0.0f, 1.0f);
        if (this.LLILZ != fLIZLLL) {
            this.LLILZ = fLIZLLL;
            invalidate();
        }
    }

    public final void setProgress(float f) {
        float fLIZLLL = C13LZ.LIZLLL(f, 0.0f, 1.0f);
        float f2 = fLIZLLL - this.LLJ;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "bulletin_voice_playback_progress_anim_setting", true, true) && f2 > 1.0E-4f && f2 < 0.5f) {
            ValueAnimator valueAnimator = this.LLJJIJI;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.LLJ, fLIZLLL);
            valueAnimatorOfFloat.setDuration(50L);
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS277S0100000_29(this, 6));
            valueAnimatorOfFloat.start();
            this.LLJJIJI = valueAnimatorOfFloat;
            return;
        }
        ValueAnimator valueAnimator2 = this.LLJJIJI;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.LLJJIJI = null;
        this.LLJ = fLIZLLL;
        invalidate();
    }

    public final void setRecordingAlpha(float f) {
        float fLIZLLL = C13LZ.LIZLLL(f, 0.0f, 1.0f);
        if (this.LLILLJJLI != fLIZLLL) {
            this.LLILLJJLI = fLIZLLL;
            invalidate();
        }
    }

    public final void setRecordingScalePivotCenter(boolean z) {
        if (this.LLILZLL != z) {
            this.LLILZLL = z;
            invalidate();
        }
    }

    public final void setRecordingWidthScale(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (this.LLILZIL != f) {
            this.LLILZIL = f;
            invalidate();
        }
    }

    public final void setWaveformData(List<Float> list) {
        this.LLIZLLLIL = list;
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                if (getWidth() > 0) {
                    this.LLJJIII = LJII(LJI(list.size()), list);
                }
                if (!this.LLJI) {
                    requestLayout();
                }
                invalidate();
                return;
            }
            return;
        }
        invalidate();
    }

    public C194434115c(Context context, AttributeSet attributeSet) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        super(context, attributeSet, 0);
        this.LL = 1;
        this.LLILLL = 1.0f;
        this.LLILZ = 1.0f;
        this.LLILZIL = 1.0f;
        this.LLIZLLLIL = C13BV.INSTANCE;
        this.LLJI = true;
        this.LLJILJILJ = new ArrayList();
        this.LLJJIII = new float[0];
        Paint paint = new Paint(1);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(LLJJJJJIL);
        paint.setStyle(Paint.Style.STROKE);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -16777216;
        }
        paint.setColor(iIntValue);
        this.LLJJIJIIJIL = paint;
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, context);
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        } else {
            iIntValue2 = -16777216;
        }
        this.LLJJIJIL = iIntValue2;
        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a02, context);
        if (numLIZJ3 != null) {
            iIntValue3 = numLIZJ3.intValue();
        } else {
            iIntValue3 = -3355444;
        }
        this.LLJJJ = iIntValue3;
        Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.a1h, context);
        this.LLJJJIL = numLIZJ4 != null ? numLIZJ4.intValue() : -16777216;
    }

    public static int LIZIZ(float f, int i) {
        return (C13LZ.LJ((int) (((i >>> 24) & 255) * C13LZ.LIZLLL(f, 0.0f, 1.0f)), 0, 255) << 24) | (i & 16777215);
    }

    public static float[] LJII(int i, List list) {
        float[] fArr;
        int i2 = 0;
        if (!list.isEmpty() && i > 0) {
            float[] fArrLLI = C13LP.LLI(list);
            float fFloatValue = 0.0f;
            if (i == 1) {
                fArr = new float[1];
                Float fLJJJJJ = C13LQ.LJJJJJ(fArrLLI);
                if (fLJJJJJ != null) {
                    fFloatValue = fLJJJJJ.floatValue();
                }
                fArr[0] = fFloatValue;
            } else if (fArrLLI.length == 1) {
                fArr = new float[i];
                int i3 = 0;
                do {
                    fArr[i3] = fArrLLI[0];
                    i3++;
                } while (i3 < i);
            } else {
                if (fArrLLI.length == i) {
                    return Arrays.copyOf(fArrLLI, fArrLLI.length);
                }
                if (fArrLLI.length > i) {
                    fArr = new float[i];
                    do {
                        long j = i2;
                        long j2 = i;
                        int length = (int) (((j + 1) * ((long) fArrLLI.length)) / j2);
                        int length2 = fArrLLI.length;
                        if (length > length2) {
                            length = length2;
                        }
                        float f = 0.0f;
                        for (int length3 = (int) ((((long) fArrLLI.length) * j) / j2); length3 < length; length3++) {
                            float f2 = fArrLLI[length3];
                            if (f2 > f) {
                                f = f2;
                            }
                        }
                        fArr[i2] = f;
                        i2++;
                    } while (i2 < i);
                } else {
                    float[] fArr2 = new float[i];
                    fArr2[0] = C13LQ.LJIJJ(fArrLLI);
                    float length4 = 1.0f / (fArrLLI.length - 1);
                    int i4 = i - 1;
                    for (int i5 = 1; i5 < i4; i5++) {
                        float f3 = i5 / i4;
                        int iLJ = C13LZ.LJ((int) (f3 / length4), 0, fArrLLI.length - 2);
                        float f4 = f3 - (iLJ * length4);
                        if (f4 < 0.0f) {
                            f4 = 0.0f;
                        }
                        float f5 = fArrLLI[iLJ];
                        fArr2[i5] = f5 + ((f4 / length4) * (fArrLLI[iLJ + 1] - f5));
                    }
                    fArr2[i4] = C13LQ.LJJJI(fArrLLI);
                    return fArr2;
                }
            }
            return fArr;
        }
        return new float[0];
    }

    @Override // X.InterfaceC2227008o0
    public final void LIZ(final float f, final long j) {
        HandlerHook.viewPost(this, new Runnable() { // from class: X.10qA
            public final void LIZ() {
                int iLJFF;
                if (this.LL.getMode() == 0 && (iLJFF = this.LL.LJFF()) > 0) {
                    ListProtector.add(this.LL.LLJILJILJ, 0, new C1867707Tf(f, j));
                    while (((ArrayList) this.LL.LLJILJILJ).size() > iLJFF) {
                        List<C1867707Tf> list = this.LL.LLJILJILJ;
                        ListProtector.remove(list, ((ArrayList) list).size() - 1);
                    }
                    C194434115c c194434115c = this.LL;
                    c194434115c.LLJILLL = j;
                    if (c194434115c.LL != 0 || c194434115c.LLJJI) {
                        return;
                    }
                    c194434115c.LLJJI = true;
                    ValueAnimator valueAnimator = c194434115c.LLJJ;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat.setDuration(100L);
                    valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                    valueAnimatorOfFloat.setRepeatCount(-1);
                    valueAnimatorOfFloat.setRepeatMode(1);
                    valueAnimatorOfFloat.addUpdateListener(new AUListenerS277S0100000_29(c194434115c, 26));
                    valueAnimatorOfFloat.start();
                    c194434115c.LLJJ = valueAnimatorOfFloat;
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("BulletinWaveformView@c36f.onNewBar$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("BulletinWaveformView@c36f.onNewBar$1");
            }
        });
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    public final void LIZJ(Canvas canvas, float[] fArr, float f, float f2) {
        float f3 = LLJJJJ * f2;
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            float f4 = (i + 0.5f) * f3;
            float f5 = fArr[i];
            float f6 = LLJJJJLIIL;
            float f7 = LLJJJJJIL;
            float f8 = f - f7;
            float fMax = Math.max(f6, f5 * f8);
            float f9 = (f7 / 2) + ((f8 - fMax) / 2.0f);
            canvas.drawLine(f4, f9, f4, f9 + fMax, this.LLJJIJIIJIL);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.LL == 1 && (!this.LLIZLLLIL.isEmpty())) {
            List<Float> list = this.LLIZLLLIL;
            this.LLJJIII = LJII(LJI(list.size()), list);
        }
    }

    public final void LJIIIIZZ(final float f, final float f2, final float f3, final float f4, final float f5, final float f6, Function0<Unit> function0) {
        ValueAnimator valueAnimator = this.LLIZ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final float f7 = this.LLILLJJLI;
        final float f8 = this.LLILLL;
        setPlaybackWidthRatio(f3);
        setRecordingWidthScale(f5);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.setInterpolator(C1619980sG4.LJFF());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.115d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                C194434115c c194434115c = this.LL;
                float f9 = f7;
                c194434115c.setRecordingAlpha(f9 + ((f - f9) * fFloatValue));
                C194434115c c194434115c2 = this.LL;
                float f10 = f8;
                c194434115c2.setPlaybackAlpha(f10 + ((f2 - f10) * fFloatValue));
                C194434115c c194434115c3 = this.LL;
                float f11 = f3;
                c194434115c3.setPlaybackWidthRatio(f11 + ((f4 - f11) * fFloatValue));
                C194434115c c194434115c4 = this.LL;
                float f12 = f5;
                c194434115c4.setRecordingWidthScale(f12 + ((f6 - f12) * fFloatValue));
            }
        });
        valueAnimatorOfFloat.addListener(new ALAdapterS23S0200000_29(this, function0, 5));
        valueAnimatorOfFloat.start();
        this.LLIZ = valueAnimatorOfFloat;
    }
}
