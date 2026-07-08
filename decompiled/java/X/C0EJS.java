package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0EJS, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EJS extends View {
    public int LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;

    private final Paint getArcPaint() {
        return (Paint) this.LLILLL.getValue();
    }

    private final RectF getArcRectF() {
        return new RectF(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)), getMeasuredWidth() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)), getMeasuredHeight() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)));
    }

    private final Paint getCirclePaint() {
        return (Paint) this.LLILLJJLI.getValue();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawArc(getArcRectF(), -90.0f, 360.0f, false, getCirclePaint());
        canvas.drawArc(getArcRectF(), -90.0f, (this.LL / 100.0f) * 360.0f, false, getArcPaint());
    }

    public final void setProgress(int i) {
        this.LL = i;
        invalidate();
    }

    public C0EJS(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS549S0100000_5(context, 15));
        this.LLILLL = C452501pT.LIZIZ(new AwS549S0100000_5(context, 14));
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }
}
