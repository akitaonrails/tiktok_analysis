package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.0F2r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C383710F2r extends AppCompatImageView {
    public final Paint LL;
    public float LLILLJJLI;
    public final Path LLILLL;
    public final Path LLILZ;
    public final RectF LLILZIL;
    public final boolean LLILZLL;

    public final void LIZ() {
        this.LLILLL.reset();
        this.LLILZ.reset();
        this.LLILZIL.set(0.0f, 0.0f, getWidth(), getHeight());
        Path path = this.LLILZ;
        RectF rectF = this.LLILZIL;
        float f = this.LLILLJJLI;
        path.addRoundRect(rectF, f, f, Path.Direction.CCW);
        this.LLILLL.addRect(this.LLILZIL, Path.Direction.CCW);
        this.LLILLL.op(this.LLILZ, Path.Op.XOR);
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
            if (this.LLILLJJLI != 0.0f) {
                canvas.drawPath(this.LLILLL, this.LL);
                if (this.LLILZLL) {
                    canvas.drawLine(0.0f, 0.0f, getWidth(), 0.0f, this.LL);
                }
            }
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public final void setBGColor(int i) {
        this.LL.setColor(i);
    }

    public final void setCornerRadius(int i) {
        this.LLILLJJLI = i;
        LIZ();
    }

    public C383710F2r(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C383710F2r(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(-15000805);
        this.LL = paint;
        this.LLILLL = new Path();
        this.LLILZ = new Path();
        this.LLILZIL = new RectF();
        this.LLILZLL = Build.SUPPORTED_64_BIT_ABIS.length == 0;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.LLILLJJLI == 0.0f) {
            return;
        }
        LIZ();
    }
}
