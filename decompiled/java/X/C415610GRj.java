package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.mt.protector.impl.color.ColorProtector;

/* JADX INFO: renamed from: X.0GRj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C415610GRj extends View {
    public final Paint LL;
    public final Paint LLILLJJLI;
    public final Paint LLILLL;
    public final int LLILZ;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint;
        Paint paint2;
        super.onDraw(canvas);
        float width = getWidth() / 3.0f;
        Path path = new Path();
        path.addRoundRect(new RectF(0.0f, 0.0f, width - this.LLILZ, getHeight()), new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
        Path path2 = new Path();
        path2.moveTo(width - this.LLILZ, getHeight());
        float height = getHeight();
        int i = this.LLILZ;
        path2.cubicTo(width + (this.LLILZ * 0.5f), height, width - (i * 0.5f), 0.0f, width + i, 0.0f);
        path2.lineTo(width - this.LLILZ, 0.0f);
        Path path3 = new Path();
        path3.moveTo(width - this.LLILZ, getHeight());
        float height2 = getHeight();
        int i2 = this.LLILZ;
        path3.cubicTo(width + (this.LLILZ * 0.5f), height2, width - (i2 * 0.5f), 0.0f, width + i2, 0.0f);
        path3.lineTo(this.LLILZ + width, getHeight());
        Path path4 = new Path();
        int i3 = this.LLILZ;
        float f = 2 * width;
        path4.addRoundRect(new RectF(i3 + width, 0.0f, f - i3, getHeight()), new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
        Path path5 = new Path();
        path5.moveTo(f - this.LLILZ, 0.0f);
        int i4 = this.LLILZ;
        path5.cubicTo(f + (i4 * 0.5f), 0.0f, f - (i4 * 0.5f), getHeight(), f + this.LLILZ, getHeight());
        path5.lineTo(f - this.LLILZ, getHeight());
        Path path6 = new Path();
        path6.moveTo(f - this.LLILZ, 0.0f);
        int i5 = this.LLILZ;
        path6.cubicTo(f + (i5 * 0.5f), 0.0f, f - (i5 * 0.5f), getHeight(), f + this.LLILZ, getHeight());
        path6.lineTo(this.LLILZ + f, 0.0f);
        Path path7 = new Path();
        path7.addRoundRect(new RectF(f + this.LLILZ, 0.0f, 3 * width, getHeight()), new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
        Path path8 = new Path();
        path8.addPath(path);
        path8.addPath(path2);
        if (C497740JfY.LJJ()) {
            paint = this.LLILLL;
        } else {
            paint = this.LL;
        }
        canvas.drawPath(path8, paint);
        Path path9 = new Path();
        path9.addPath(path3);
        path9.addPath(path4);
        path9.addPath(path5);
        canvas.drawPath(path9, this.LLILLJJLI);
        Path path10 = new Path();
        path10.addPath(path6);
        path10.addPath(path7);
        if (C497740JfY.LJJ()) {
            paint2 = this.LL;
        } else {
            paint2 = this.LLILLL;
        }
        canvas.drawPath(path10, paint2);
    }

    public C415610GRj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        paint.setColor(ColorProtector.parseColor("#FFFFFF"));
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.LL = paint;
        Paint paint2 = new Paint();
        paint2.setColor(ColorProtector.parseColor("#FFFFFF"));
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.FILL);
        this.LLILLJJLI = paint2;
        Paint paint3 = new Paint();
        paint3.setColor(ColorProtector.parseColor("#0D000000"));
        paint3.setAntiAlias(true);
        paint3.setStyle(Paint.Style.FILL);
        this.LLILLL = paint3;
        this.LLILZ = (int) C497740JfY.LIZIZ(16.0f);
    }

    public final void LIZ(EnumC429020Gs0 enumC429020Gs0, int i) {
        int i2 = C416110GTh.LIZ[enumC429020Gs0.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                this.LLILLL.setColor(i);
            } else {
                this.LLILLJJLI.setColor(i);
            }
        } else {
            this.LL.setColor(i);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension((int) (View.MeasureSpec.getSize(i) * 1.5f), View.MeasureSpec.getSize(i2));
    }
}
