package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.11xk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19671011xk extends C19670811xi {
    public Paint LLJILJILJ;
    public float LLJILLL;
    public final RectF LLJJ;
    public final RectF LLJJI;

    @Override // X.C19670811xi
    public final void LIZ() {
        super.LIZ();
        setUseCenter(true);
        this.LLJILLL = C11VU.LIZIZ(3.0f, getContext());
        Paint paint = new Paint();
        this.LLJILJILJ = paint;
        paint.setAntiAlias(true);
        Paint paint2 = this.LLJILJILJ;
        if (paint2 == null) {
            paint2 = null;
        }
        paint2.setStyle(Paint.Style.FILL);
        Paint paint3 = this.LLJILJILJ;
        Paint paint4 = paint3 != null ? paint3 : null;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.e4, getContext());
        paint4.setColor(numLIZJ != null ? numLIZJ.intValue() : -7829368);
    }

    @Override // X.C19670811xi, android.view.View
    public final void onDraw(Canvas canvas) {
        this.LLJJ.set(0.0f, 0.0f, getWidth$lib_runtime_release(), getHeight$lib_runtime_release());
        this.LLJJI.set(((getWidth$lib_runtime_release() / 2) - getCircularRadius()) + this.LLJILLL, ((getHeight$lib_runtime_release() / 2) - getCircularRadius()) + this.LLJILLL, ((getWidth$lib_runtime_release() / 2) + getCircularRadius()) - this.LLJILLL, ((getHeight$lib_runtime_release() / 2) + getCircularRadius()) - this.LLJILLL);
        Path path = new Path();
        path.addCircle(this.LLJJI.centerX(), this.LLJJI.centerY(), getCircularRadius(), Path.Direction.CW);
        path.close();
        canvas.save();
        canvas.clipPath(path, Region.Op.DIFFERENCE);
        RectF rectF = this.LLJJ;
        float borderRadius = getBorderRadius();
        float borderRadius2 = getBorderRadius();
        Paint paint = this.LLJILJILJ;
        Paint paint2 = null;
        if (paint == null) {
            paint = null;
        }
        canvas.drawRoundRect(rectF, borderRadius, borderRadius2, paint);
        canvas.restore();
        RectF rectF2 = this.LLJJI;
        float sweepAngle = getSweepAngle() - 360;
        boolean useCenter = getUseCenter();
        Paint paint3 = this.LLJILJILJ;
        if (paint3 != null) {
            paint2 = paint3;
        }
        canvas.drawArc(rectF2, -90.0f, sweepAngle, useCenter, paint2);
    }

    public final void setBackgroundPaintColor(int i) {
        Paint paint = this.LLJILJILJ;
        if (paint == null) {
            paint = null;
        }
        paint.setColor(i);
    }

    public C19671011xk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLJJ = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.LLJJI = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
    }
}
