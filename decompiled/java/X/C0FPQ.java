package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: X.0FPQ, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FPQ extends C498540Jgq {
    public final Paint LLIZ;
    public final RectF LLIZLLLIL;
    public View LLJ;

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        View view = this.LLJ;
        if (view != null && view.getVisibility() == 0 && view.getWidth() != 0) {
            int iSaveLayer = canvas.saveLayer(this.LLIZLLLIL, null);
            super.dispatchDraw(canvas);
            canvas.drawCircle((view.getLeft() + (view.getWidth() / 2.0f)) - getLeft(), (view.getTop() + (view.getHeight() / 2.0f)) - getTop(), view.getWidth() / 2.0f, this.LLIZ);
            canvas.restoreToCount(iSaveLayer);
            return;
        }
        super.dispatchDraw(canvas);
    }

    public C0FPQ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
        this.LLIZ = paint;
        this.LLIZLLLIL = new RectF();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LLIZLLLIL.set(0.0f, 0.0f, i, i2);
    }
}
