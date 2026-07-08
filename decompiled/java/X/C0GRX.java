package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* JADX INFO: renamed from: X.0GRX, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GRX extends View {
    public int LL;
    public boolean LLILLJJLI;
    public final int LLILLL;
    public final Paint LLILZ;
    public final Paint LLILZIL;

    public final int getColor() {
        return this.LL;
    }

    public C0GRX(Context context) {
        super(context, null);
        this.LL = -1;
        this.LLILLL = 6;
        Paint paint = new Paint();
        paint.setColor(this.LL);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        float f = 6;
        paint.setStrokeWidth(f);
        this.LLILZ = paint;
        Paint paint2 = new Paint();
        paint2.setColor(-1);
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(f);
        this.LLILZIL = paint2;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float width = getWidth() / 2;
        canvas.drawCircle(width, width, (r3 - this.LLILLL) - 4, this.LLILZIL);
        canvas.drawCircle(width, width, r3 - (this.LLILLL * 2), this.LLILZ);
    }

    public final void setSelection(boolean z) {
        this.LLILLJJLI = z;
    }
}
