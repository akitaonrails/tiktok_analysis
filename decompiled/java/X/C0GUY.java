package X;

import Y.ARunnableS106S0100000_6;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS407S0200000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0GUY, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GUY extends FrameLayout implements View.OnTouchListener {
    public InterfaceC416300GUa LL;
    public EnumC429040Gs2 LLILLJJLI;
    public EnumC1996307rt LLILLL;
    public final long LLILZ;
    public long LLILZIL;
    public long LLILZLL;
    public boolean LLIZ;
    public final Integer LLIZLLLIL;
    public boolean LLJ;
    public long LLJI;
    public ScaleGestureDetector LLJIJIL;
    public int LLJILJIL;
    public final int[] LLJILJILJ;
    public final C01GW LLJILLL;
    public boolean LLJJ;
    public final ARunnableS106S0100000_6 LLJJI;
    public final float LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final float LLJJIJIL;
    public float LLJJJ;
    public final float LLJJJIL;
    public final C01GW LLJJJJ;
    public final float LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final float LLJLL;
    public final int LLJLLIL;
    public final C01GW LLJLLL;
    public final float LLJZ;
    public final C01GW LLJZIJLIL;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return false;
    }

    public final void setCanTouch(boolean z) {
    }

    public final void setGestureListener(InterfaceC416310GUb interfaceC416310GUb) {
    }

    public final void setPressingByGestureTouch(boolean z) {
    }

    private final Interpolator getEaseOutStandard() {
        return (Interpolator) this.LLJILLL.getValue();
    }

    private final Paint getIDleInnerPaint() {
        return (Paint) this.LLJJIJIIJIL.getValue();
    }

    private final Paint getIDleOuterPaint() {
        return (Paint) this.LLJJJJ.getValue();
    }

    private final Paint getLockCirclePaint() {
        return (Paint) this.LLJLIL.getValue();
    }

    private final int getNormalShadowColor() {
        return ((Number) this.LLJJIJI.getValue()).intValue();
    }

    private final Paint getProgressBgPaint() {
        return (Paint) this.LLJJL.getValue();
    }

    private final Paint getProgressPaint() {
        return (Paint) this.LLJJJJLIIL.getValue();
    }

    private final Paint getRecordingInnerPaint() {
        return (Paint) this.LLJL.getValue();
    }

    private final Paint getRecordingOuterCirclePaint() {
        return (Paint) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    private final RectF getRecordingProgressOvalRectF() {
        return (RectF) this.LLJZIJLIL.getValue();
    }

    private final Paint getRecordingRoundRectPaint() {
        return (Paint) this.LLJLILLLLZIIL.getValue();
    }

    public final float getRecordingOuterCircleWidth() {
        return ((Number) this.LLJLLL.getValue()).floatValue();
    }

    private final float getViewY() {
        View view;
        Object parent = getParent();
        return ((!(parent instanceof View) || (view = (View) parent) == null) ? 0.0f : view.getY()) + getY();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float recordingOuterCircleWidth;
        int i;
        int i2 = C0GUZ.LIZ[this.LLILLJJLI.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                long jUptimeMillis = SystemClock.uptimeMillis() - this.LLILZLL;
                float f = jUptimeMillis / this.LLJLLIL;
                if (f <= 1.0f) {
                    double d = f;
                    double d2 = ((double) 1) - d;
                    double d3 = d * d;
                    double d4 = d2 * d2;
                    double d5 = 3;
                    f = (float) ((d4 * d2 * 0.0d) + (d4 * d5 * d * 0.0d) + (d5 * d2 * d3 * 1.0d) + (d3 * d * 1.0d));
                }
                if (f < 1.0f) {
                    float f2 = 1;
                    recordingOuterCircleWidth = this.LLJJJ * (f2 + ((this.LLJLL - f2) * f));
                } else {
                    recordingOuterCircleWidth = getRecordingOuterCircleWidth();
                }
                canvas.drawCircle(getWidth() / 2, getHeight() / 2, recordingOuterCircleWidth, getRecordingOuterCirclePaint());
                if (!this.LLIZ) {
                    canvas.drawCircle(getWidth() / 2, getHeight() / 2, recordingOuterCircleWidth - (this.LLJJJJJIL / 2), getProgressBgPaint());
                }
                if (jUptimeMillis <= this.LLJLLIL) {
                    float f3 = this.LLJJJ;
                    i = 2;
                    canvas.drawCircle(getWidth() / 2, getHeight() / 2, f3 + (f * ((this.LLJJIII / 2) - f3)), getIDleInnerPaint());
                } else {
                    i = 2;
                }
                if (jUptimeMillis <= this.LLJLLIL * 2) {
                    canvas.drawCircle(getWidth() / i, getHeight() / i, this.LLJZ, getRecordingInnerPaint());
                } else {
                    canvas.drawCircle(getWidth() / i, getHeight() / i, this.LLJZ, getRecordingInnerPaint());
                }
                if (this.LLILLL == EnumC1996307rt.CLICK_RECORDING && jUptimeMillis >= 0) {
                    this.LLILLL = EnumC1996307rt.LONG_PRESS_RECORDING;
                }
                if (f >= 1.0f) {
                    canvas.drawArc(getRecordingProgressOvalRectF(), -90.0f, 360 * (0.0f / 100), false, getProgressPaint());
                    return;
                } else {
                    invalidate();
                    return;
                }
            }
            throw new C1954807lC();
        }
        float f4 = 2;
        float f5 = this.LLJJJIL / f4;
        canvas.drawOval(new RectF(f5, f5, getWidth() - (this.LLJJJIL / f4), getHeight() - (this.LLJJJIL / f4)), getIDleOuterPaint());
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, this.LLJJJ, getIDleInnerPaint());
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x005b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0GUY.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setCurrentScaleMode(int i) {
        this.LLJILJIL = i;
    }

    public final void setEnablePressRecording(boolean z) {
        this.LLJJ = z;
    }

    public final void setHasBeenMoveScaled(boolean z) {
        this.LLJ = z;
        this.LLJI = System.currentTimeMillis();
    }

    public final void setNowStoryCombine(boolean z) {
        this.LLIZ = z;
    }

    public final void setScaleGestureDetector(ScaleGestureDetector scaleGestureDetector) {
        this.LLJIJIL = scaleGestureDetector;
    }

    public final void setState(EnumC429040Gs2 enumC429040Gs2) {
        setStateInternal(enumC429040Gs2);
    }

    public final void setStateInternal(EnumC429040Gs2 enumC429040Gs2) {
        this.LLILLJJLI = enumC429040Gs2;
        invalidate();
    }

    public C0GUY(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLJJLI = EnumC429040Gs2.IDLE;
        this.LLILLL = EnumC1996307rt.LONG_PRESS_RECORDING;
        this.LLILZ = 150L;
        this.LLIZLLLIL = C1308910kAL.LIZJ(R.attr.a04, context);
        this.LLJILJILJ = new int[]{0, 0};
        this.LLJILLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(505));
        this.LLJJ = true;
        this.LLJJI = new ARunnableS106S0100000_6((Object) this, 30);
        setOnTouchListener(this);
        this.LLJJIII = C11VU.LIZIZ(36.0f, getContext());
        C11VU.LIZIZ(4.0f, getContext());
        this.LLJJIJI = C452501pT.LIZIZ(new C5182020e(context, 414));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(506));
        float fLIZIZ = C418440Gaw.LIZIZ(Double.valueOf(32.0d));
        this.LLJJIJIL = fLIZIZ;
        this.LLJJJ = fLIZIZ;
        this.LLJJJIL = C418440Gaw.LIZIZ(Double.valueOf(5.0d));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1255));
        this.LLJJJJJIL = C418440Gaw.LIZIZ(Double.valueOf(6.0d));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1258));
        this.LLJJL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1257));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS407S0200000_6(this, context, 80));
        this.LLJL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1259));
        this.LLJLIL = C452501pT.LIZIZ(new AwS550S0100000_6(context, 1256));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS550S0100000_6(context, 1262));
        C418440Gaw.LIZIZ(Double.valueOf(56.0d));
        this.LLJLL = 1.87f;
        this.LLJLLIL = 350;
        this.LLJLLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1260));
        this.LLJZ = C418440Gaw.LIZIZ(Double.valueOf(18.0d));
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1261));
    }
}
