package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: X.0Ec0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C368140Ec0 extends View {
    public final Paint LL;
    public final Paint LLILLJJLI;
    public float LLILLL;
    public float LLILZ;

    private final float getBackgroundWidth() {
        return this.LLILLL + (2 * this.LLILZ);
    }

    public final float getGapWidth() {
        return this.LLILZ;
    }

    public final float getPlayHeadWidth() {
        return this.LLILLL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.LL.setStrokeWidth(getBackgroundWidth());
        this.LLILLJJLI.setStrokeWidth(this.LLILLL);
        float width = getWidth() / 2.0f;
        float f = 2;
        float strokeWidth = this.LL.getStrokeWidth() / f;
        float strokeWidth2 = this.LLILLJJLI.getStrokeWidth() / f;
        canvas.drawLine(width, strokeWidth, width, getHeight() - strokeWidth, this.LL);
        canvas.drawLine(width, strokeWidth2 + this.LLILZ, width, getHeight() - (strokeWidth2 + this.LLILZ), this.LLILLJJLI);
    }

    public final void setGapWidth(float f) {
        this.LLILZ = f;
    }

    public final void setPlayHeadWidth(float f) {
        this.LLILLL = f;
    }

    public C368140Ec0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint();
        this.LL = paint;
        Paint paint2 = new Paint();
        this.LLILLJJLI = paint2;
        this.LLILLL = C0FU0.LIZ(2.0f);
        this.LLILZ = C0FU0.LIZ(1.0f);
        paint.setStrokeWidth(getBackgroundWidth());
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-16777216);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setAntiAlias(true);
        paint2.setStrokeWidth(this.LLILLL);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(-1);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setAntiAlias(true);
        setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }
}
