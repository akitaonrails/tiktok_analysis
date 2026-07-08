package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Eh7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C371310Eh7 extends View {
    public final Paint LL;
    public final Paint LLILLJJLI;
    public final RectF LLILLL;
    public int LLILZ;

    public final void LIZ() {
        C1361400lX0 c1361400lX0 = new C1361400lX0(getContext(), R.style.y0);
        Paint paint = this.LL;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a00, c1361400lX0);
        paint.setColor(numLIZJ != null ? numLIZJ.intValue() : 0);
        Paint paint2 = this.LLILLJJLI;
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a01, c1361400lX0);
        paint2.setColor(numLIZJ2 != null ? numLIZJ2.intValue() : 0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float fMin = Math.min(getWidth(), getHeight());
        float strokeWidth = this.LL.getStrokeWidth() / 2;
        float f = fMin - strokeWidth;
        this.LLILLL.set(strokeWidth, strokeWidth, f, f);
        canvas.drawArc(this.LLILLL, 0.0f, 360.0f, false, this.LLILLJJLI);
        canvas.drawArc(this.LLILLL, -90.0f, (this.LLILZ * 360.0f) / 100.0f, false, this.LL);
    }

    public final void setProgress(int i) {
        this.LLILZ = C13LZ.LJ(i, 0, 100);
        invalidate();
    }

    public C371310Eh7(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(C418440Gaw.LIZIZ(2));
        this.LL = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(C418440Gaw.LIZIZ(2));
        this.LLILLJJLI = paint2;
        this.LLILLL = new RectF();
    }
}
