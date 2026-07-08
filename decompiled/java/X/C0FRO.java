package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.0FRO, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FRO extends AppCompatImageView {
    public final Path LL;
    public float LLILLJJLI;
    public final RectF LLILLL;

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            this.LL.reset();
            this.LLILLL.set(0.0f, 0.0f, getWidth(), getHeight());
            Path path = this.LL;
            RectF rectF = this.LLILLL;
            float f = this.LLILLJJLI;
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
            canvas.clipPath(this.LL);
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public final void setRadius(float f) {
        this.LLILLJJLI = f;
    }

    public C0FRO(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = new Path();
        this.LLILLL = new RectF();
    }
}
