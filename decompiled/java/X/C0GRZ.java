package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GRZ, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GRZ extends View {
    public final Paint LL;
    public float LLILLJJLI;
    public float LLILLL;

    public final float getOffset() {
        return this.LLILLJJLI;
    }

    public final Paint getPaint() {
        return this.LL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int iIntValue;
        super.onDraw(canvas);
        this.LL.setStyle(Paint.Style.STROKE);
        this.LL.setStrokeWidth(this.LLILLL);
        Paint paint = this.LL;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a02, getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        paint.setColor(iIntValue);
        float width = getWidth();
        float f = this.LLILLJJLI;
        canvas.drawLine(width - f, f, f, getHeight() - this.LLILLJJLI, this.LL);
    }

    public final void setLineOffset(float f) {
        this.LLILLJJLI = f;
        invalidate();
    }

    public final void setLineWidth(float f) {
        this.LLILLL = f;
        invalidate();
    }

    public final void setOffset(float f) {
        this.LLILLJJLI = f;
    }

    public C0GRZ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new Paint();
        this.LLILLJJLI = C0H9H.LIZ(0);
        this.LLILLL = C0H9H.LIZ(2);
    }
}
