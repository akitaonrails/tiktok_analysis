package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.mt.protector.impl.color.ColorProtector;

/* JADX INFO: renamed from: X.0Gay, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C418460Gay extends View {
    public int LL;
    public int LLILLJJLI;
    public float LLILLL;
    public float LLILZ;
    public int LLILZIL;
    public float LLILZLL;
    public final Paint LLIZ;
    public final Paint LLIZLLLIL;

    public final int getDotCount() {
        return this.LL;
    }

    public final float getDotDiameterPx() {
        return this.LLILLL;
    }

    public final float getDotSpacingPx() {
        return this.LLILZ;
    }

    public final int getDotsColor() {
        return this.LLILZIL;
    }

    public final int getRating() {
        return this.LLILLJJLI;
    }

    public final float getStrokeWidthPx() {
        return this.LLILZLL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getWidth();
        getPaddingLeft();
        getPaddingRight();
        float paddingTop = getPaddingTop() + (((getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f);
        float f = this.LLILLL / 2.0f;
        float fMax = Math.max(0.0f, f - (this.LLILZLL / 2.0f));
        float paddingLeft = getPaddingLeft() + f;
        int i = this.LL;
        for (int i2 = 0; i2 < i; i2++) {
            float f2 = (i2 * (this.LLILLL + this.LLILZ)) + paddingLeft;
            if (i2 < this.LLILLJJLI) {
                canvas.drawCircle(f2, paddingTop, f, this.LLIZ);
            } else {
                canvas.drawCircle(f2, paddingTop, fMax, this.LLIZLLLIL);
            }
        }
    }

    public final void setDotCount(int i) {
        if (i < 1) {
            i = 1;
        }
        this.LL = i;
        requestLayout();
        invalidate();
    }

    public final void setDotDiameterPx(float f) {
        this.LLILLL = f;
        requestLayout();
        invalidate();
    }

    public final void setDotSpacingPx(float f) {
        this.LLILZ = f;
        requestLayout();
        invalidate();
    }

    public final void setDotsColor(int i) {
        this.LLILZIL = i;
        this.LLIZ.setColor(i);
        this.LLIZLLLIL.setColor(i);
        invalidate();
    }

    public final void setRating(int i) {
        int iLJ = C13LZ.LJ(i, 0, this.LL);
        if (this.LLILLJJLI != iLJ) {
            this.LLILLJJLI = iLJ;
            invalidate();
        }
    }

    public final void setStrokeWidthPx(float f) {
        this.LLILZLL = f;
        this.LLIZLLLIL.setStrokeWidth(f);
        invalidate();
    }

    public C418460Gay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = 5;
        this.LLILZIL = ColorProtector.parseColor("#00B747");
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.LLILZIL);
        this.LLIZ = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(this.LLILZLL);
        paint2.setColor(this.LLILZIL);
        this.LLIZLLLIL = paint2;
        setDotDiameterPx(C339190DRl.LIZ(12));
        setDotSpacingPx(C339190DRl.LIZ(2.0f));
        setStrokeWidthPx(C339190DRl.LIZ(1.0f));
        paint2.setStrokeWidth(this.LLILZLL);
        setFocusable(true);
        setClickable(false);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.resolveSize((int) ((this.LL * this.LLILLL) + ((r1 - 1) * this.LLILZ) + getPaddingLeft() + getPaddingRight()), i), View.resolveSize((int) (this.LLILLL + getPaddingTop() + getPaddingBottom()), i2));
    }
}
