package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Eq4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C376860Eq4 extends View {
    public final Paint LL;
    public final Paint LLILLJJLI;
    public final float LLILLL;
    public final float LLILZ;
    public final float LLILZIL;
    public final float LLILZLL;
    public final float LLIZ;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth() / 2.0f;
        float f = this.LLILLL;
        canvas.drawCircle(width, f, f, this.LL);
        float f2 = this.LLIZ;
        float f3 = 2;
        float f4 = f + this.LLILLL + this.LLILZIL;
        RectF rectF = new RectF(width - (f2 / f3), f4, width + (f2 / f3), this.LLILZLL + f4);
        float f5 = this.LLILZ;
        canvas.drawRoundRect(rectF, f5, f5, this.LLILLJJLI);
    }

    public C376860Eq4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint();
        paint.setColor(C497740JfY.LIZJ(R.attr.aew));
        paint.setAntiAlias(true);
        this.LL = paint;
        Paint paint2 = new Paint();
        paint2.setColor(C497740JfY.LIZJ(R.attr.aew));
        paint2.setAntiAlias(true);
        this.LLILLJJLI = paint2;
        this.LLILLL = C497740JfY.LIZIZ(28.0f);
        this.LLILZ = C497740JfY.LIZIZ(4.0f);
        this.LLILZIL = C497740JfY.LIZIZ(10.0f);
        this.LLILZLL = C497740JfY.LIZIZ(12.0f);
        this.LLIZ = C497740JfY.LIZIZ(48.0f);
    }
}
