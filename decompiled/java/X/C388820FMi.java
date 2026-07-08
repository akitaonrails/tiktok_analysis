package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* JADX INFO: renamed from: X.0FMi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C388820FMi extends View {
    public Paint LL;
    public Paint LLILLJJLI;
    public final int LLILLL;
    public final float LLILZ;
    public int LLILZIL;
    public boolean LLILZLL;

    public int getColor() {
        return this.LLILZIL;
    }

    public C388820FMi(Context context) {
        super(context, null);
        int iLIZIZ = (int) C11VU.LIZIZ(2.0f, getContext());
        this.LLILLL = iLIZIZ;
        this.LLILZ = C418440Gaw.LIZIZ(2);
        this.LLILZIL = -1;
        this.LLILZLL = false;
        Paint paint = new Paint();
        this.LLILLJJLI = paint;
        paint.setColor(-1);
        this.LLILLJJLI.setAntiAlias(true);
        this.LLILLJJLI.setStyle(Paint.Style.STROKE);
        float f = iLIZIZ;
        this.LLILLJJLI.setStrokeWidth(f);
        Paint paint2 = new Paint();
        this.LL = paint2;
        paint2.setColor(this.LLILZIL);
        this.LL.setAntiAlias(true);
        this.LL.setStyle(Paint.Style.FILL);
        this.LL.setStrokeWidth(f);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float width = getWidth() / 2.0f;
        canvas.drawCircle(width, width, width, this.LL);
        if (this.LLILZIL == -1) {
            this.LLILLJJLI.setShadowLayer(this.LLILZ, 0.0f, 0.0f, 1291845632);
        } else {
            this.LLILLJJLI.clearShadowLayer();
        }
        canvas.drawCircle(width, width, width - (this.LLILLL / 2.0f), this.LLILLJJLI);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.getDefaultSize(getSuggestedMinimumWidth(), i), View.getDefaultSize(getSuggestedMinimumHeight(), i2));
    }
}
