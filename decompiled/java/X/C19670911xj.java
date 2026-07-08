package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.11xj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19670911xj extends C19670811xi {
    public Paint LLJILJILJ;
    public Paint LLJILLL;
    public final RectF LLJJ;

    @Override // X.C19670811xi
    public final void LIZ() {
        super.LIZ();
        setUseCenter(true);
        Paint bgPaint = getBgPaint();
        if (bgPaint != null) {
            bgPaint.setStyle(Paint.Style.FILL);
            setProgressPaint(new Paint(bgPaint));
            getProgressPaint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
        Paint paint = new Paint();
        this.LLJILJILJ = paint;
        paint.setAntiAlias(true);
        Paint paint2 = this.LLJILJILJ;
        if (paint2 == null) {
            paint2 = null;
        }
        paint2.setStyle(Paint.Style.STROKE);
        Paint paint3 = this.LLJILJILJ;
        if (paint3 == null) {
            paint3 = null;
        }
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint4 = new Paint();
        this.LLJILLL = paint4;
        paint4.setAntiAlias(true);
        Paint paint5 = this.LLJILLL;
        if (paint5 == null) {
            paint5 = null;
        }
        paint5.setStyle(Paint.Style.FILL);
        Paint paint6 = this.LLJILLL;
        (paint6 != null ? paint6 : null).setColor(C446980Hfs.LIZ(getContext(), R.color.xe));
    }

    @Override // X.C19670811xi, android.view.View
    public final void onDraw(Canvas canvas) {
        setWillNotDraw(false);
        Paint paint = null;
        setLayerType(1, null);
        this.LLJJ.set(0.0f, 0.0f, getWidth$lib_runtime_release(), getHeight$lib_runtime_release());
        RectF rectF = this.LLJJ;
        float borderRadius = getBorderRadius();
        float borderRadius2 = getBorderRadius();
        Paint paint2 = this.LLJILLL;
        if (paint2 == null) {
            paint2 = null;
        }
        canvas.drawRoundRect(rectF, borderRadius, borderRadius2, paint2);
        float width$lib_runtime_release = getWidth$lib_runtime_release() / 2;
        float height$lib_runtime_release = getHeight$lib_runtime_release() / 2;
        float circularRadius = getCircularRadius();
        Paint paint3 = this.LLJILJILJ;
        if (paint3 != null) {
            paint = paint3;
        }
        canvas.drawCircle(width$lib_runtime_release, height$lib_runtime_release, circularRadius, paint);
        super.onDraw(canvas);
    }

    @Override // X.C19670811xi
    public void setCircleRadius(float f) {
        super.setCircleRadius(f);
        Paint paint = this.LLJILJILJ;
        if (paint == null) {
            paint = null;
        }
        paint.setStrokeWidth(getCircularRadius() / 4);
    }

    public C19670911xj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLJJ = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
    }
}
