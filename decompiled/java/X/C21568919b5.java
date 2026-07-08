package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: renamed from: X.19b5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21568919b5 extends LinearLayout implements InterfaceC619830OSv {
    public float[] LL;
    public boolean LLILLJJLI;
    public final Path LLILLL;
    public final RectF LLILZ;
    public final C21568919b5 LLILZIL;
    public InterfaceC636520Oxu LLILZLL;
    public boolean LLIZ;
    public final C01GW LLIZLLLIL;
    public View LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public float LLJILJIL;
    public float LLJILJILJ;
    public MotionEvent LLJILLL;
    public final C01GW LLJJ;

    private final int getDragTouchSlop() {
        return ((Number) this.LLJJ.getValue()).intValue();
    }

    public final void LIZIZ() {
        this.LLILLL.reset();
        if (!this.LLILLJJLI || getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        this.LLILZ.set(0.0f, 0.0f, getWidth(), getHeight());
        this.LLILLL.addRoundRect(this.LLILZ, this.LL, Path.Direction.CW);
    }

    public C636490Oxr getAntiShakeGestureHelper() {
        return (C636490Oxr) this.LLIZLLLIL.getValue();
    }

    public InterfaceC636520Oxu getGestureCallback() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC619830OSv
    public C21568919b5 getMsgContentView() {
        return this.LLILZIL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009b  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21568919b5.dispatchTouchEvent(android.view.MotionEvent):boolean");
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
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getGestureCallback() == null) {
            return super.onTouchEvent(motionEvent);
        }
        getAntiShakeGestureHelper().LIZIZ(motionEvent);
        return true;
    }

    @Override // X.InterfaceC619830OSv
    public void setDispatchView(View view) {
        getAntiShakeGestureHelper().LIZ().LLILZIL = view;
    }

    @Override // X.InterfaceC619830OSv
    public void setDragPassthroughView(View view) {
        this.LLJ = view;
    }

    @Override // X.InterfaceC619830OSv
    public void setGestureCallback(InterfaceC636520Oxu interfaceC636520Oxu) {
        this.LLILZLL = interfaceC636520Oxu;
    }

    public final void setRoundingParams(C0OV6 c0ov6) {
        if (c0ov6 == null) {
            return;
        }
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
        LIZIZ();
        invalidate();
    }

    public C21568919b5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.LLILLL = new Path();
        this.LLILZ = new RectF();
        this.LLILZIL = this;
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4204));
        this.LLJJ = C452501pT.LIZIZ(new AwS550S0100000_6(context, 1632));
    }

    public final void LIZ(MotionEvent motionEvent, View view) {
        if (motionEvent != null && view != null) {
            getLocationOnScreen(new int[2]);
            view.getLocationOnScreen(new int[2]);
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.offsetLocation(r5[0] - r4[0], r5[1] - r4[1]);
            view.dispatchTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            return;
        }
        C0OPX.LJII("forwardToTarget: null event or target");
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        LIZIZ();
    }
}
