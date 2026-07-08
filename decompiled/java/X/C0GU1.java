package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0GU1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GU1 extends LinearLayout {
    public final C01GW LL;
    public boolean LLILLJJLI;
    public float LLILLL;
    public float LLILZ;

    private final Paint getPaint() {
        return (Paint) this.LL.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLILLJJLI = false;
    }

    public final boolean getDrawMask() {
        return this.LLILLJJLI;
    }

    public final float getMaskEdge() {
        return this.LLILLL;
    }

    public final float getMaskWidth() {
        return this.LLILZ;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f;
        if (this.LLILLJJLI) {
            int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
            super.dispatchDraw(canvas);
            if (C497740JfY.LJJ()) {
                f = this.LLILLL;
            } else {
                f = this.LLILLL - this.LLILZ;
            }
            canvas.translate(f, 0.0f);
            canvas.drawPaint(getPaint());
            canvas.restoreToCount(iSaveLayer);
            return;
        }
        super.dispatchDraw(canvas);
    }

    public final void setDrawMask(boolean z) {
        this.LLILLJJLI = z;
    }

    public final void setMaskEdge(float f) {
        this.LLILLL = f - getLeft();
        invalidate();
    }

    public final void setMaskWidth(float f) {
        this.LLILZ = f;
    }

    public C0GU1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1343));
        this.LLILLL = Float.MAX_VALUE;
        setWillNotDraw(false);
    }
}
