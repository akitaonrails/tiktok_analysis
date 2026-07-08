package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0F4H, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F4H extends AppCompatImageView {
    public Function2<? super Canvas, ? super Paint, Unit> LL;
    public final Paint LLILLJJLI;
    public Paint LLILLL;
    public Paint LLILZ;
    public Paint LLILZIL;

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    public final Paint getBackdropLayerPaint() {
        return this.LLILZIL;
    }

    public final Function2<Canvas, Paint, Unit> getHollowLayerContent() {
        return this.LL;
    }

    public final Paint getInnerBorderPaint() {
        return this.LLILLL;
    }

    public final Paint getOverlayLayerPaint() {
        return this.LLILZ;
    }

    public C0F4H(Context context) {
        super(context);
        Paint paint = new Paint(1);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setFlags(1);
        this.LLILLJJLI = paint;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            Paint paint = this.LLILZIL;
            if (paint != null) {
                canvas.drawPaint(paint);
            }
            if (this.LLILLL == null) {
                canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
                super.onDraw(canvas);
                Paint paint2 = this.LLILZ;
                if (paint2 != null) {
                    canvas.drawPaint(paint2);
                }
                Function2<? super Canvas, ? super Paint, Unit> function2 = this.LL;
                if (function2 != null) {
                    function2.invoke(canvas, this.LLILLJJLI);
                }
                canvas.restore();
            }
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public final void setBackdropLayerPaint(Paint paint) {
        this.LLILZIL = paint;
        invalidate();
    }

    public final void setHollowLayerContent(Function2<? super Canvas, ? super Paint, Unit> function2) {
        this.LL = function2;
        invalidate();
    }

    public final void setInnerBorderPaint(Paint paint) {
        this.LLILLL = paint;
        invalidate();
    }

    public final void setOverlayLayerPaint(Paint paint) {
        this.LLILZ = paint;
        invalidate();
    }
}
