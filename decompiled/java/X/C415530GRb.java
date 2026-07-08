package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GRb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C415530GRb extends View {
    public final int LL;
    public final int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public final Paint LLILZLL;

    public final int getScrollOffset() {
        return this.LLILLL;
    }

    public final int getTotalWidth() {
        return this.LLILZIL;
    }

    public final int getVisibleWidth() {
        return this.LLILZ;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        float f = height / 2.0f;
        this.LLILZLL.setColor(this.LLILLJJLI);
        this.LLILZLL.setStyle(Paint.Style.FILL);
        canvas.drawRoundRect(0.0f, 0.0f, width, height, f, f, this.LLILZLL);
        int i = this.LLILZIL;
        int i2 = 1;
        if (i < 1) {
            i = 1;
        }
        int i3 = this.LLILZ;
        if (i3 > i) {
            i3 = i;
        }
        int i4 = i - i3;
        int iLJ = C13LZ.LJ(this.LLILLL, 0, i4);
        float f2 = 0.5f * width;
        if (i4 >= 1) {
            i2 = i4;
        }
        float f3 = (width - f2) * (iLJ / i2);
        float f4 = f2 + f3;
        this.LLILZLL.setColor(this.LL);
        this.LLILZLL.setStyle(Paint.Style.FILL);
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f4 <= width) {
            width = f4;
        }
        canvas.drawRoundRect(f3, 0.0f, width, height, f, f, this.LLILZLL);
    }

    public final void setScrollOffset(int i) {
        this.LLILLL = i;
        invalidate();
    }

    public final void setTotalWidth(int i) {
        this.LLILZIL = i;
        invalidate();
    }

    public final void setVisibleWidth(int i) {
        this.LLILZ = i;
        invalidate();
    }

    public C415530GRb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = C475630Ikz.LIZIZ(R.attr.a1p, context);
        this.LLILLJJLI = C475630Ikz.LIZIZ(R.attr.a02, context);
        this.LLILZ = 1;
        this.LLILZIL = 1;
        this.LLILZLL = new Paint(1);
    }
}
