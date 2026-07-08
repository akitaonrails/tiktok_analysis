package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* JADX INFO: renamed from: X.11x9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19667311x9 extends View {
    public Paint LL;
    public Paint LLILLJJLI;
    public final int LLILLL;
    public int LLILZ;
    public boolean LLILZIL;

    public int getColor() {
        return this.LLILZ;
    }

    public C19667311x9(Context context) {
        super(context, null);
        this.LLILLL = 6;
        this.LLILZ = -1;
        Paint paint = new Paint();
        this.LLILLJJLI = paint;
        paint.setColor(-1);
        this.LLILLJJLI.setAntiAlias(true);
        this.LLILLJJLI.setStyle(Paint.Style.STROKE);
        float f = 6;
        this.LLILLJJLI.setStrokeWidth(f);
        Paint paint2 = new Paint();
        this.LL = paint2;
        paint2.setColor(this.LLILZ);
        this.LL.setAntiAlias(true);
        this.LL.setStyle(Paint.Style.FILL);
        this.LL.setStrokeWidth(f);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float width = getWidth() / 2;
        canvas.drawCircle(width, width, (r3 - this.LLILLL) - 4, this.LLILLJJLI);
        canvas.drawCircle(width, width, r3 - (this.LLILLL * 2), this.LL);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.getDefaultSize(getSuggestedMinimumWidth(), i), View.getDefaultSize(getSuggestedMinimumHeight(), i2));
    }
}
