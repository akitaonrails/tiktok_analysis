package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0FJM, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FJM extends View {
    public float LL;
    public int LLILLJJLI;
    public final Paint LLILLL;

    public final float getProgress() {
        return this.LL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        if (width > height) {
            f = height;
        } else {
            f = width;
        }
        float f2 = 2;
        canvas.drawCircle(width, height, f - (this.LLILLL.getStrokeWidth() / f2), this.LLILLL);
        this.LLILLL.setStyle(Paint.Style.FILL);
        canvas.drawArc(this.LLILLL.getStrokeWidth() / f2, this.LLILLL.getStrokeWidth() / f2, getWidth() - (this.LLILLL.getStrokeWidth() / f2), getHeight() - (this.LLILLL.getStrokeWidth() / f2), -90.0f, 360 * this.LL, true, this.LLILLL);
        this.LLILLL.setStyle(Paint.Style.STROKE);
    }

    public final void setProgress(float f) {
        this.LL = f;
        invalidate();
    }

    public final void setProgressColor(int i) {
        this.LLILLJJLI = i;
        this.LLILLL.setColor(i);
    }

    public C0FJM(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        float f = 2 * getResources().getDisplayMetrics().density;
        Integer numLIZ = C1308910kAL.LIZ(R.attr.ee, context);
        if (numLIZ != null) {
            this.LLILLJJLI = numLIZ.intValue();
            Paint paint = new Paint();
            this.LLILLL = paint;
            paint.setColor(this.LLILLJJLI);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(f);
            paint.setAntiAlias(true);
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
