package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.0GYj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C417430GYj extends AppCompatImageView {
    public final Paint LL;
    public final PorterDuffXfermode LLILLJJLI;
    public final int LLILLL;
    public boolean LLILZ;

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (this.LLILZ) {
            C417440GYk.LIZ(getWidth(), getHeight(), canvas, this.LL);
            super.draw(canvas);
            this.LL.setXfermode(this.LLILLJJLI);
            if (C497740JfY.LJJ()) {
                canvas.drawCircle(0.0f, getHeight(), this.LLILLL, this.LL);
            } else {
                canvas.drawCircle(getWidth(), getHeight(), this.LLILLL, this.LL);
            }
            this.LL.setXfermode(null);
            canvas.restore();
            return;
        }
        super.draw(canvas);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public final void setTrayVisible(boolean z) {
        this.LLILZ = z;
        postInvalidate();
    }

    public C417430GYj(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C417430GYj(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        this.LL = paint;
        this.LLILLJJLI = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
        this.LLILLL = (int) C497740JfY.LIZIZ(10.0f);
    }
}
