package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0FRV, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FRV extends FrameLayout {
    public float LL;
    public float LLILLJJLI;
    public float LLILLL;
    public final Paint LLILZ;

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float left;
        float top;
        if (this.LLILLL > 0.0f && getChildCount() > 0) {
            if (getChildCount() > 1) {
                View childAt = getChildAt(1);
                left = childAt.getLeft() + (childAt.getWidth() / 2.0f);
                top = childAt.getTop() + (childAt.getHeight() / 2.0f);
            } else {
                left = this.LL;
                top = this.LLILLJJLI;
            }
            int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
            drawChild(canvas, getChildAt(0), getDrawingTime());
            canvas.drawCircle(left, top, this.LLILLL, this.LLILZ);
            canvas.restoreToCount(iSaveLayer);
            int childCount = getChildCount();
            for (int i = 1; i < childCount; i++) {
                drawChild(canvas, getChildAt(i), getDrawingTime());
            }
            return;
        }
        super.dispatchDraw(canvas);
    }

    public C0FRV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.LLILZ = paint;
    }
}
