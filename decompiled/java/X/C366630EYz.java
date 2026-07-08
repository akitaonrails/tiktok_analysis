package X;

import Y.ARunnableS105S0100000_5;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.0EYz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C366630EYz extends View {
    public final Paint LL;
    public final long LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public final RectF LLIZ;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        long j;
        float height;
        super.onDraw(canvas);
        int width = (getWidth() - this.LLILZ) / (this.LLILZIL - 1);
        long jCurrentTimeMillis = (System.currentTimeMillis() - this.LLILLJJLI) % ((long) this.LLILLL);
        int i = this.LLILZIL;
        float f = 0.0f;
        for (int i2 = 0; i2 < i; i2++) {
            if (jCurrentTimeMillis < 0) {
                j = ((long) this.LLILLL) + jCurrentTimeMillis;
            } else {
                j = jCurrentTimeMillis;
            }
            if (j < this.LLILLL / 2) {
                height = (getHeight() - this.LLILZLL) * (0.5f - ((j * 1.0f) / this.LLILLL));
            } else {
                height = (getHeight() - this.LLILZLL) * (((j * 1.0f) / this.LLILLL) - 0.5f);
            }
            if (canvas != null) {
                RectF rectF = this.LLIZ;
                rectF.set(f, height, this.LLILZ + f, getHeight() - height);
                int i3 = this.LLILZ;
                canvas.drawRoundRect(rectF, i3 / 2.0f, i3 / 2.0f, this.LL);
            }
            f += width;
            jCurrentTimeMillis -= (long) 100;
        }
        HandlerHook.viewPostDelay(this, new ARunnableS105S0100000_5(this, 12), 50L);
    }

    public C366630EYz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint(1);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        this.LL = paint;
        this.LLILLJJLI = System.currentTimeMillis();
        this.LLILLL = 600;
        this.LLILZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        this.LLILZIL = 6;
        this.LLILZLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(4.5d)));
        this.LLIZ = new RectF();
    }
}
