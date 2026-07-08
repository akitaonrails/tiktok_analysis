package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.0EqP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C377070EqP extends AppCompatImageView {
    public final RectF LL;
    public float LLILLJJLI;
    public final float[] LLILLL;
    public final Path LLILZ;

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    public final void LIZ(Canvas canvas) {
        this.LLILZ.reset();
        RectF rectF = this.LL;
        float[] fArr = this.LLILLL;
        rectF.set(fArr[0], fArr[1], getWidth() - this.LLILLL[2], getHeight() - this.LLILLL[3]);
        Path path = this.LLILZ;
        RectF rectF2 = this.LL;
        float f = this.LLILLJJLI;
        path.addRoundRect(rectF2, f, f, Path.Direction.CW);
        canvas.clipPath(this.LLILZ);
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

    public final void setRenderRadius(float f) {
        this.LLILLJJLI = f;
    }

    public C377070EqP(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = new RectF();
        this.LLILLL = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        this.LLILZ = new Path();
    }
}
