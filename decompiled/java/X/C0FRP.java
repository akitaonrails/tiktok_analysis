package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: X.0FRP, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FRP extends View {
    public final Paint LL;
    public final Paint LLILLJJLI;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = ((getWidth() - getPaddingLeft()) - getPaddingRight()) / 2.0f;
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, width, this.LLILLJJLI);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, width - C418440Gaw.LIZIZ(Float.valueOf(1.25f)), this.LL);
    }

    public final void setFillColor(int i) {
        this.LL.setColor(i);
        invalidate();
    }

    public C0FRP(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(0);
        this.LL = paint;
        Paint paint2 = new Paint();
        paint2.setColor(-1);
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(C418440Gaw.LIZIZ(Float.valueOf(2.5f)));
        paint2.setShadowLayer(1.0f, C418440Gaw.LIZIZ(Float.valueOf(0.0f)), C418440Gaw.LIZIZ(Float.valueOf(1.0f)), 520093696);
        this.LLILLJJLI = paint2;
    }
}
