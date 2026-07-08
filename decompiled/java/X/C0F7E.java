package X;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: X.0F7E, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F7E extends View {
    public float LL;
    public float LLILLJJLI;
    public int LLILLL;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getWidth() > 0 && getHeight() > 0) {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(this.LLILLL);
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
            if (this.LL > 0.0f) {
                float f = this.LL;
                RectF rectF = new RectF(f, f, getWidth() - this.LL, getHeight() - this.LL);
                Paint paint2 = new Paint();
                paint2.setAntiAlias(true);
                paint2.setStyle(Paint.Style.STROKE);
                paint2.setStrokeWidth(this.LL);
                paint2.setColor(this.LLILLL);
                paint2.setMaskFilter(new BlurMaskFilter(this.LL, BlurMaskFilter.Blur.NORMAL));
                float f2 = this.LLILLJJLI;
                canvas.drawRoundRect(rectF, f2, f2, paint2);
            }
        }
    }

    public final void setFlashColor(int i) {
        this.LLILLL = i;
        invalidate();
    }

    public C0F7E(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = C418440Gaw.LIZIZ(24);
        this.LLILLJJLI = C418440Gaw.LIZIZ(24);
        this.LLILLL = -1;
        if (Build.VERSION.SDK_INT >= 28) {
            setLayerType(2, null);
        } else {
            setLayerType(1, null);
        }
    }
}
