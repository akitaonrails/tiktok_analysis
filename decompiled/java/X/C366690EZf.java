package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0EZf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C366690EZf extends View {
    public float LL;
    public final RectF LLILLJJLI;
    public final Paint LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public float LLILZLL;

    public final int getBgColor() {
        return this.LLILZ;
    }

    public final Paint getPaint() {
        return this.LLILLL;
    }

    public final float getProgress() {
        return this.LLILZLL;
    }

    public final int getProgressColor() {
        return this.LLILZIL;
    }

    public final float getRadius() {
        return this.LL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.LL = getMeasuredHeight() / 2.0f;
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

    public final void setBgColor(int i) {
        this.LLILZ = i;
    }

    public final void setProgress(float f) {
        this.LLILZLL = f;
        invalidate();
    }

    public final void setProgressColor(int i) {
        this.LLILZIL = i;
    }

    public final void setRadius(float f) {
        this.LL = f;
    }

    public C366690EZf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = C418440Gaw.LIZIZ(2);
        this.LLILLJJLI = new RectF();
        this.LLILLL = new Paint();
        Integer numLIZ = C1308910kAL.LIZ(R.attr.zj, context);
        if (numLIZ != null) {
            this.LLILZ = numLIZ.intValue();
            Integer numLIZ2 = C1308910kAL.LIZ(R.attr.ei, context);
            if (numLIZ2 != null) {
                this.LLILZIL = numLIZ2.intValue();
                return;
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
