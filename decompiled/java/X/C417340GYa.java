package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.0GYa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C417340GYa extends C1322110kVd {
    public float LL;
    public final RectF LLILLJJLI;
    public final Path LLILLL;

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    public final void LIZ(Canvas canvas) {
        this.LLILLJJLI.left = getPaddingLeft();
        this.LLILLJJLI.right = getWidth() - getPaddingRight();
        this.LLILLJJLI.top = getPaddingTop();
        this.LLILLJJLI.bottom = getHeight() - getPaddingBottom();
        this.LLILLL.reset();
        Path path = this.LLILLL;
        RectF rectF = this.LLILLJJLI;
        float f = this.LL;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        canvas.clipPath(this.LLILLL);
        super.onDraw(canvas);
    }

    @Override // X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            LIZ(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public final void setRadius(float f) {
        this.LL = f;
        invalidate();
    }

    public C417340GYa(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C417340GYa(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = 10 * getResources().getDisplayMetrics().density;
        this.LLILLJJLI = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.LLILLL = new Path();
    }
}
