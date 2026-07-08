package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: X.0GRP, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GRP extends View {
    public int LL;
    public float LLILLJJLI;
    public float LLILLL;
    public float LLILZ;
    public float LLILZIL;
    public float LLILZLL;
    public final Path LLIZ;
    public final Paint LLIZLLLIL;

    public final float getArrowRightX() {
        return this.LLILZIL;
    }

    public final float getCircleRadius() {
        return this.LLILZLL;
    }

    public final int getFillColor() {
        return this.LL;
    }

    public final float getPaddingHorizontal() {
        return this.LLILLL;
    }

    public final float getPaddingVertical() {
        return this.LLILLJJLI;
    }

    public final float getRectRadius() {
        return this.LLILZ;
    }

    public static float LIZ(float f) {
        return C418440Gaw.LIZIZ(Float.valueOf(f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        this.LLIZ.reset();
        float fLIZ = LIZ(this.LLILLJJLI);
        float fLIZ2 = LIZ(this.LLILLL);
        float fLIZ3 = LIZ(this.LLILZ);
        float fLIZ4 = LIZ(this.LLILZIL);
        float f = width - fLIZ2;
        float f2 = f - fLIZ3;
        float fLIZ5 = (height - LIZ(9.3f)) - LIZ(2 * this.LLILZLL);
        PointF pointF = new PointF(f2, fLIZ);
        this.LLIZ.moveTo(pointF.x, pointF.y);
        PointF pointF2 = new PointF(LIZ(7.84f) + f2, fLIZ);
        PointF pointF3 = new PointF(LIZ(11.761f) + f2, fLIZ);
        PointF pointF4 = new PointF(LIZ(14.755f) + f2, LIZ(1.52637f) + fLIZ);
        this.LLIZ.cubicTo(pointF2.x, pointF2.y, pointF3.x, pointF3.y, pointF4.x, pointF4.y);
        PointF pointF5 = new PointF(LIZ(17.39f) + f2, LIZ(2.8686f) + fLIZ);
        PointF pointF6 = new PointF(LIZ(19.531f) + f2, LIZ(5.0103f) + fLIZ);
        PointF pointF7 = new PointF(LIZ(20.874f) + f2, fLIZ + LIZ(7.6445f));
        this.LLIZ.cubicTo(pointF5.x, pointF5.y, pointF6.x, pointF6.y, pointF7.x, pointF7.y);
        PointF pointF8 = new PointF(f, LIZ(10.6393f) + fLIZ);
        PointF pointF9 = new PointF(f, LIZ(14.5598f) + fLIZ);
        PointF pointF10 = new PointF(f, LIZ(22.4004f) + fLIZ);
        this.LLIZ.cubicTo(pointF8.x, pointF8.y, pointF9.x, pointF9.y, pointF10.x, pointF10.y);
        this.LLIZ.lineTo(f, (height - LIZ(35.004f)) - LIZ(8.0f));
        PointF pointF11 = new PointF(f, fLIZ5 - LIZ(14.5598f));
        PointF pointF12 = new PointF(f, fLIZ5 - LIZ(10.6393f));
        PointF pointF13 = new PointF(LIZ(20.874f) + f2, fLIZ5 - LIZ(7.6445f));
        this.LLIZ.cubicTo(pointF11.x, pointF11.y, pointF12.x, pointF12.y, pointF13.x, pointF13.y);
        PointF pointF14 = new PointF(f - LIZ(2.869f), fLIZ5 - LIZ(5.0103f));
        PointF pointF15 = new PointF(f - LIZ(5.01f), fLIZ5 - LIZ(2.8686f));
        PointF pointF16 = new PointF(LIZ(14.755f) + f2, fLIZ5 - LIZ(1.5264f));
        this.LLIZ.cubicTo(pointF14.x, pointF14.y, pointF15.x, pointF15.y, pointF16.x, pointF16.y);
        PointF pointF17 = new PointF(LIZ(11.761f) + f2, fLIZ5);
        PointF pointF18 = new PointF(LIZ(7.84f) + f2, fLIZ5);
        PointF pointF19 = new PointF(f - LIZ(22.4f), fLIZ5);
        this.LLIZ.cubicTo(pointF17.x, pointF17.y, pointF18.x, pointF18.y, pointF19.x, pointF19.y);
        this.LLIZ.lineTo(fLIZ4, fLIZ5);
        PointF pointF20 = new PointF(fLIZ4 - LIZ(3.62f), fLIZ5);
        PointF pointF21 = new PointF(fLIZ4 - LIZ(7.497f), LIZ(1.7819f) + fLIZ5);
        PointF pointF22 = new PointF(fLIZ4 - LIZ(9.146f), LIZ(4.7275f) + fLIZ5);
        this.LLIZ.cubicTo(pointF20.x, pointF20.y, pointF21.x, pointF21.y, pointF22.x, pointF22.y);
        PointF pointF23 = new PointF(fLIZ4 - LIZ(12.369f), LIZ(9.2395f) + fLIZ5);
        PointF pointF24 = new PointF(fLIZ4 - LIZ(19.122f), LIZ(9.3059f) + fLIZ5);
        PointF pointF25 = new PointF((fLIZ4 - LIZ(9.146f)) - LIZ(13.199f), LIZ(4.7939f) + fLIZ5);
        this.LLIZ.cubicTo(pointF23.x, pointF23.y, pointF24.x, pointF24.y, pointF25.x, pointF25.y);
        PointF pointF26 = new PointF(fLIZ4 - LIZ(24.5033f), LIZ(1.7725f) + fLIZ5);
        PointF pointF27 = new PointF(fLIZ4 - LIZ(27.6345f), LIZ(0.1064f) + fLIZ5);
        PointF pointF28 = new PointF(fLIZ4 - LIZ(30.9975f), fLIZ5);
        this.LLIZ.cubicTo(pointF26.x, pointF26.y, pointF27.x, pointF27.y, pointF28.x, pointF28.y);
        float f3 = fLIZ2 + fLIZ3;
        this.LLIZ.lineTo(f3, fLIZ5);
        PointF pointF29 = new PointF(LIZ(14.5598f) + fLIZ2, fLIZ5);
        PointF pointF30 = new PointF(LIZ(10.6393f) + fLIZ2, fLIZ5);
        PointF pointF31 = new PointF(LIZ(7.6445f) + fLIZ2, fLIZ5 - LIZ(1.5264f));
        this.LLIZ.cubicTo(pointF29.x, pointF29.y, pointF30.x, pointF30.y, pointF31.x, pointF31.y);
        PointF pointF32 = new PointF(LIZ(5.0103f) + fLIZ2, fLIZ5 - LIZ(2.8686f));
        PointF pointF33 = new PointF(LIZ(2.8686f) + fLIZ2, fLIZ5 - LIZ(5.0103f));
        PointF pointF34 = new PointF(LIZ(1.5264f) + fLIZ2, fLIZ5 - LIZ(7.6445f));
        this.LLIZ.cubicTo(pointF32.x, pointF32.y, pointF33.x, pointF33.y, pointF34.x, pointF34.y);
        PointF pointF35 = new PointF(fLIZ2, fLIZ5 - LIZ(10.6393f));
        PointF pointF36 = new PointF(fLIZ2, fLIZ5 - LIZ(14.5598f));
        PointF pointF37 = new PointF(fLIZ2, fLIZ5 - fLIZ3);
        this.LLIZ.cubicTo(pointF35.x, pointF35.y, pointF36.x, pointF36.y, pointF37.x, pointF37.y);
        this.LLIZ.lineTo(fLIZ2, fLIZ3 + fLIZ);
        PointF pointF38 = new PointF(fLIZ2, LIZ(14.5598f) + fLIZ);
        PointF pointF39 = new PointF(fLIZ2, LIZ(10.6393f) + fLIZ);
        PointF pointF40 = new PointF(LIZ(1.5264f) + fLIZ2, LIZ(7.6445f) + fLIZ);
        this.LLIZ.cubicTo(pointF38.x, pointF38.y, pointF39.x, pointF39.y, pointF40.x, pointF40.y);
        PointF pointF41 = new PointF(LIZ(2.8686f) + fLIZ2, LIZ(5.0103f) + fLIZ);
        PointF pointF42 = new PointF(LIZ(5.0103f) + fLIZ2, LIZ(2.8686f) + fLIZ);
        PointF pointF43 = new PointF(LIZ(7.6445f) + fLIZ2, LIZ(1.52637f) + fLIZ);
        this.LLIZ.cubicTo(pointF41.x, pointF41.y, pointF42.x, pointF42.y, pointF43.x, pointF43.y);
        PointF pointF44 = new PointF(LIZ(10.6393f) + fLIZ2, fLIZ);
        PointF pointF45 = new PointF(fLIZ2 + LIZ(14.5598f), fLIZ);
        PointF pointF46 = new PointF(f3, fLIZ);
        this.LLIZ.cubicTo(pointF44.x, pointF44.y, pointF45.x, pointF45.y, pointF46.x, pointF46.y);
        this.LLIZ.lineTo(f2, fLIZ);
        this.LLIZ.close();
        canvas.drawPath(this.LLIZ, this.LLIZLLLIL);
        canvas.drawCircle(LIZ((this.LLILZIL - 31.0f) + this.LLILZLL), getHeight() - LIZ(this.LLILZLL), LIZ(this.LLILZLL), this.LLIZLLLIL);
        super.onDraw(canvas);
    }

    public final void setArrowRightX(float f) {
        this.LLILZIL = f;
        invalidate();
    }

    public final void setCircleRadius(float f) {
        this.LLILZLL = f;
        invalidate();
    }

    public final void setFillColor(int i) {
        this.LL = i;
        this.LLIZLLLIL.setColor(i);
        invalidate();
    }

    public final void setPaddingHorizontal(float f) {
        this.LLILLL = f;
        invalidate();
    }

    public final void setPaddingVertical(float f) {
        this.LLILLJJLI = f;
        invalidate();
    }

    public final void setRectRadius(float f) {
        this.LLILZ = f;
        invalidate();
    }

    public C0GRP(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = -1;
        this.LLIZ = new Path();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.LL);
        paint.setShadowLayer(LIZ(5.0f), 0.0f, LIZ(2.0f), Color.argb(25, 0, 0, 0));
        this.LLIZLLLIL = paint;
        setLayerType(1, null);
        setWillNotDraw(false);
    }
}
