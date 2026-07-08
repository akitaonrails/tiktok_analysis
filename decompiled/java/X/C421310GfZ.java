package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.0GfZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C421310GfZ extends C1324720kZq {
    public boolean LLJILJIL;
    public float LLJILJILJ;
    public float LLJILLL;
    public Paint LLJJ;
    public final PorterDuffXfermode LLJJI;

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    public final float getStrokeWidth() {
        return this.LLJILLL;
    }

    public /* synthetic */ C421310GfZ(Context context) {
        this(context, null, 0);
    }

    @Override // X.C1324720kZq, android.view.View
    public final void draw(Canvas canvas) {
        if (this.LLJILJILJ > 0.0f) {
            Paint paint = this.LLJJ;
            if (paint == null) {
                paint = new Paint(1);
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(this.LLJILLL);
                this.LLJJ = paint;
            }
            paint.setXfermode(null);
            C417440GYk.LIZ(getWidth(), getHeight(), canvas, paint);
            super.draw(canvas);
            paint.setXfermode(this.LLJJI);
            if (this.LLJILJIL) {
                float width = getWidth();
                float f = this.LLJILJILJ;
                canvas.drawCircle(width - f, f, f, paint);
            } else {
                float f2 = this.LLJILJILJ;
                canvas.drawCircle(f2, f2, f2, paint);
            }
            canvas.restore();
            return;
        }
        super.draw(canvas);
    }

    @Override // X.C1324720kZq, X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public final void setCuttingRadius(float f) {
        if (this.LLJILJILJ != f) {
            this.LLJILJILJ = f;
            invalidate();
        }
    }

    public final void setStrokeWidth(float f) {
        this.LLJILLL = f;
    }

    @Override // X.C1324720kZq, X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean z = true;
        if (getLayoutDirection() != 1) {
            z = false;
        }
        this.LLJILJIL = z;
    }

    public C421310GfZ(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLJILLL = 1.0f;
        this.LLJJI = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
    }
}
