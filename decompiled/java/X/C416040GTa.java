package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* JADX INFO: renamed from: X.0GTa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C416040GTa extends View {
    public int LL;
    public final Paint LLILLJJLI;

    public C416040GTa(Context context) {
        super(context);
        setLayerType(1, null);
        Paint paint = new Paint(1);
        paint.setColor(-15686971);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(((int) getResources().getDisplayMetrics().density) * 2.0f);
        paint.setAntiAlias(true);
        this.LLILLJJLI = paint;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (!C936720aU2.LIZIZ() && this.LL <= 0) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.LLILLJJLI);
            setBackground(null);
        }
    }

    public final void setCornerRadius(int i) {
        this.LL = i;
        if (C936720aU2.LIZIZ() || i > 0) {
            C936720aU2.LIZLLL(this, -15686971, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), i);
        }
        invalidate();
    }
}
