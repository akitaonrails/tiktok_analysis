package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.0EpH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C376370EpH extends AppCompatImageView {
    public boolean LL;
    public final Paint LLILLJJLI;
    public final RectF LLILLL;
    public final Path LLILZ;
    public float LLILZIL;

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    public final void LIZ(Canvas canvas) {
        if (this.LL) {
            int iSave = canvas.save();
            this.LLILLL.set(0.0f, 0.0f, getWidth(), getHeight());
            this.LLILZ.reset();
            Path path = this.LLILZ;
            RectF rectF = this.LLILLL;
            float f = this.LLILZIL;
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
            canvas.clipPath(this.LLILZ);
            RectF rectF2 = this.LLILLL;
            float f2 = this.LLILZIL;
            canvas.drawRoundRect(rectF2, f2, f2, this.LLILLJJLI);
            super.onDraw(canvas);
            canvas.restoreToCount(iSave);
            return;
        }
        super.onDraw(canvas);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            LIZ(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public final void setCornerRadius(float f) {
        this.LLILZIL = f;
        invalidate();
    }

    public C376370EpH(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C376370EpH(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = true;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(0);
        this.LLILLJJLI = paint;
        this.LLILLL = new RectF();
        this.LLILZ = new Path();
        this.LLILZIL = C418440Gaw.LIZIZ(8);
    }
}
