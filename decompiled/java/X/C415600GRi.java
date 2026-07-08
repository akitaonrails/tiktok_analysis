package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GRi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C415600GRi extends View {
    public final RectF LL;
    public float LLILLJJLI;
    public int LLILLL;
    public final Paint LLILZ;

    public final int getMaxProgress() {
        return this.LLILLL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawArc(this.LL, -90.0f, this.LLILLJJLI - 360.0f, true, this.LLILZ);
    }

    public final void setMaxProgress(int i) {
        this.LLILLL = i;
    }

    public final void setProgress(int i) {
        this.LLILLJJLI = (Math.min(i, this.LLILLL) / this.LLILLL) * 360.0f;
        invalidate();
    }

    public C415600GRi(Context context, AttributeSet attributeSet) {
        int iIntValue;
        super(context, attributeSet);
        this.LL = new RectF();
        this.LLILLL = 100;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.e4, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -7829368;
        }
        paint.setColor(iIntValue);
        this.LLILZ = paint;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        float size = View.MeasureSpec.getSize(i);
        this.LL.set(0.0f, 0.0f, size, size);
    }
}
