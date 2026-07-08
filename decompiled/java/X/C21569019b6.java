package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: renamed from: X.19b6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21569019b6 extends FrameLayout implements InterfaceC619830OSv {
    public float[] LL;
    public boolean LLILLJJLI;
    public final Path LLILLL;
    public final RectF LLILZ;
    public final C21569019b6 LLILZIL;
    public InterfaceC636520Oxu LLILZLL;
    public final C01GW LLIZ;

    @Override // X.InterfaceC619830OSv
    public void setDragPassthroughView(View view) {
    }

    public C636490Oxr getAntiShakeGestureHelper() {
        return (C636490Oxr) this.LLIZ.getValue();
    }

    public final float[] getCornerRadius() {
        return this.LL;
    }

    public InterfaceC636520Oxu getGestureCallback() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC619830OSv
    public C21569019b6 getMsgContentView() {
        return this.LLILZIL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getGestureCallback() == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (this.LLILLJJLI && !this.LLILLL.isEmpty()) {
            int iSave = canvas.save();
            canvas.clipPath(this.LLILLL);
            super.draw(canvas);
            canvas.restoreToCount(iSave);
            return;
        }
        super.draw(canvas);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (getGestureCallback() == null) {
            return super.onTouchEvent(motionEvent);
        }
        getAntiShakeGestureHelper().LIZIZ(motionEvent);
        return true;
    }

    public final void setCornerRadius(float[] fArr) {
        this.LL = fArr;
    }

    @Override // X.InterfaceC619830OSv
    public void setDispatchView(View view) {
        getAntiShakeGestureHelper().LIZ().LLILZIL = view;
    }

    @Override // X.InterfaceC619830OSv
    public void setGestureCallback(InterfaceC636520Oxu interfaceC636520Oxu) {
        this.LLILZLL = interfaceC636520Oxu;
    }

    public void setRoundingParams(C0OV6 c0ov6) {
        float f = c0ov6.LIZ;
        boolean z = false;
        float f2 = c0ov6.LIZIZ;
        float f3 = c0ov6.LIZJ;
        float f4 = c0ov6.LIZLLL;
        this.LL = new float[]{f, f, f2, f2, f3, f3, f4, f4};
        if (f > 0.0f || f2 > 0.0f || f3 > 0.0f || f4 > 0.0f) {
            z = true;
        }
        this.LLILLJJLI = z;
        invalidate();
    }

    public C21569019b6(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LLILLL.reset();
        if (this.LLILLJJLI && getMeasuredWidth() > 0 && getMeasuredHeight() > 0) {
            this.LLILZ.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            this.LLILLL.addRoundRect(this.LLILZ, this.LL, Path.Direction.CW);
        }
    }

    public C21569019b6(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.LLILLL = new Path();
        this.LLILZ = new RectF();
        this.LLILZIL = this;
        this.LLIZ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4208));
    }
}
