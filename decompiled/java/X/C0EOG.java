package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0EOG, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EOG extends View {
    public float LL;
    public final RectF LLILLJJLI;
    public final Paint LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public float LLILZLL;

    public final Paint getPaint() {
        return this.LLILLL;
    }

    public final float getProgress() {
        return this.LLILZLL;
    }

    public final float getRadius() {
        return this.LL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.LLILLJJLI;
        rectF.left = 0.0f;
        rectF.right = getMeasuredWidth();
        RectF rectF2 = this.LLILLJJLI;
        rectF2.top = 0.0f;
        rectF2.bottom = getMeasuredHeight();
        this.LLILLL.setColor(this.LLILZ);
        RectF rectF3 = this.LLILLJJLI;
        float f = this.LL;
        canvas.drawRoundRect(rectF3, f, f, this.LLILLL);
        this.LLILLL.setColor(this.LLILZIL);
        this.LLILLJJLI.right = getMeasuredWidth() * this.LLILZLL;
        RectF rectF4 = this.LLILLJJLI;
        float f2 = this.LL;
        canvas.drawRoundRect(rectF4, f2, f2, this.LLILLL);
    }

    public final void setProgress(float f) {
        this.LLILZLL = f;
        invalidate();
    }

    public final void setRadius(float f) {
        this.LL = f;
    }

    public C0EOG(Context context, AttributeSet attributeSet) {
        int iIntValue;
        int iIntValue2;
        super(context, attributeSet, 0);
        this.LL = C418440Gaw.LIZIZ(4);
        this.LLILLJJLI = new RectF();
        this.LLILLL = new Paint();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bw, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -1;
        }
        this.LLILZ = iIntValue;
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.e2, context);
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        } else {
            iIntValue2 = -16777216;
        }
        this.LLILZIL = iIntValue2;
    }
}
