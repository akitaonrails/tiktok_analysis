package X;

import Y.ACListenerS167S0100000_33;
import Y.ARunnableS133S0100000_33;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import avg.f;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS612S0100000_33;
import mf.a;

/* JADX INFO: renamed from: X.19at, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21567719at extends View {
    public boolean LL;
    public volatile boolean LLILLJJLI;
    public final float LLILLL;
    public float LLILZ;
    public float LLILZIL;
    public final float LLILZLL;
    public final RectF LLIZ;
    public final float LLIZLLLIL;
    public final float LLJ;
    public final float LLJI;
    public Function0<Boolean> LLJIJIL;
    public Function1<? super Boolean, Unit> LLJILJIL;
    public Function1<? super String, Unit> LLJILJILJ;
    public final Paint LLJILLL;
    public final Paint LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public boolean LLJJIJI;
    public final ARunnableS133S0100000_33 LLJJIJIIJIL;

    public final void LIZ() {
        if (this.LLILLJJLI) {
            getStopRecordAnimator().start();
            Function1<? super String, Unit> function1 = this.LLJILJILJ;
            if (function1 != null) {
                function1.invoke("auto");
            }
        }
    }

    public final AnimatorSet getStartRecordAnimator() {
        return (AnimatorSet) this.LLJJI.getValue();
    }

    public final AnimatorSet getStopRecordAnimator() {
        return (AnimatorSet) this.LLJJIII.getValue();
    }

    public final Function0<Boolean> getOnPermissionCheck() {
        return this.LLJIJIL;
    }

    public final Function1<Boolean, Unit> getOnRecordStart() {
        return this.LLJILJIL;
    }

    public final Function1<String, Unit> getOnRecordStop() {
        return this.LLJILJILJ;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = 2;
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, (getWidth() / 2.0f) - (this.LLILLL / f), this.LLJJ);
        float fCenterX = this.LLIZ.centerX();
        float f2 = this.LLILZIL / f;
        if (f2 > fCenterX) {
            return;
        }
        float f3 = fCenterX - f2;
        float f4 = fCenterX + f2;
        this.LLIZ.set(f3, f3, f4, f4);
        RectF rectF = this.LLIZ;
        float f5 = this.LLILZ;
        canvas.drawRoundRect(rectF, f5, f5, this.LLJILLL);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                HandlerHook.viewRemoveCallbacks(this, this.LLJJIJIIJIL);
                if (this.LLJJIJI) {
                    if (this.LLILLJJLI) {
                        getStopRecordAnimator().start();
                        Function1<? super String, Unit> function1 = this.LLJILJILJ;
                        if (function1 != null) {
                            function1.invoke("long_press");
                        }
                    }
                    return true;
                }
            }
        } else {
            this.LLJJIJI = false;
            HandlerHook.viewPostDelay(this, this.LLJJIJIIJIL, 200L);
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setOnPermissionCheck(Function0<Boolean> function0) {
        this.LLJIJIL = function0;
    }

    public final void setOnRecordStart(Function1<? super Boolean, Unit> function1) {
        this.LLJILJIL = function1;
    }

    public final void setOnRecordStop(Function1<? super String, Unit> function1) {
        this.LLJILJILJ = function1;
    }

    public final void setRecordButtonRadius(float f) {
        this.LLILZ = f;
        invalidate();
    }

    public final void setRecordButtonWidth(float f) {
        this.LLILZIL = f;
        invalidate();
    }

    public C21567719at(Context context, AttributeSet attributeSet) {
        int iIntValue;
        super(context, attributeSet, 0);
        float fLIZ = C0FU0.LIZ(3.0f);
        this.LLILLL = fLIZ;
        this.LLILZLL = C0FU0.LIZ(3.0f);
        this.LLIZ = new RectF();
        this.LLIZLLLIL = C0FU0.LIZ(50.0f);
        this.LLJ = C0FU0.LIZ(24.0f);
        this.LLJI = C0FU0.LIZ(4.0f);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a04, getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -65536;
        }
        paint.setColor(iIntValue);
        paint.setAntiAlias(true);
        this.LLJILLL = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(-1);
        paint2.setAntiAlias(true);
        paint2.setStrokeWidth(fLIZ);
        this.LLJJ = paint2;
        this.LLJJI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3848));
        this.LLJJIII = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3849));
        this.LLJJIJIIJIL = new ARunnableS133S0100000_33(this, 79);
        View.OnClickListener aCListenerS167S0100000_33 = new ACListenerS167S0100000_33(new AwS612S0100000_33(this, 135), 69);
        a aVar = new a(C1848410yCV.LIZ ? new f(aCListenerS167S0100000_33) : aCListenerS167S0100000_33);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        RectF rectF = this.LLIZ;
        rectF.left = this.LLILLL + this.LLILZLL;
        rectF.right = getWidth() - rectF.left;
        rectF.top = this.LLILLL + this.LLILZLL;
        rectF.bottom = getHeight() - rectF.top;
        if (this.LLILZ == 0.0f) {
            this.LLILZ = this.LLIZ.width() / 2.0f;
        }
        if (this.LLILZIL == 0.0f) {
            this.LLILZIL = this.LLIZ.width();
        }
    }
}
