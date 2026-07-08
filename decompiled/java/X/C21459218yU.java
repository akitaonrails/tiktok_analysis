package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: X.18yU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21459218yU extends C21459118yT {
    public Paint getPaint() {
        return this.LL;
    }

    public String getText() {
        return this.LLILLL;
    }

    @Override // X.C21459118yT, android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        if (!TextUtils.isEmpty(this.LLILLL)) {
            float width = 0.0f;
            if (this.LLIZLLLIL != 0.0f) {
                if (this.LLJIJIL) {
                    width = getWidth() - this.LLIZLLLIL;
                }
                long jUptimeMillis = SystemClock.uptimeMillis();
                if (this.LLJI > 0) {
                    float f = ((jUptimeMillis - r8) * ((long) this.LLILZIL)) / 1000.0f;
                    float f2 = this.LLIZ;
                    if (this.LLJIJIL) {
                        i2 = 1;
                    } else {
                        i2 = -1;
                    }
                    this.LLIZ = (f2 + (f * i2)) % this.LLIZLLLIL;
                }
                if (this.LLJ == 0) {
                    this.LLJI = jUptimeMillis;
                }
                this.LL.getFontMetrics(this.LLILLJJLI);
                float f3 = -this.LLILLJJLI.top;
                if (this.LLILZ) {
                    float height = getHeight();
                    Paint.FontMetrics fontMetrics = this.LLILLJJLI;
                    f3 = ((height - fontMetrics.descent) - fontMetrics.ascent) / 2.0f;
                }
                if (this.LLJ == 0) {
                    while (true) {
                        float measuredWidth = getMeasuredWidth();
                        float f4 = this.LLIZ;
                        if (this.LLJIJIL) {
                            i = 1;
                        } else {
                            i = -1;
                        }
                        if (width >= measuredWidth + (i * f4)) {
                            break;
                        }
                        canvas.drawText(this.LLILLL, f4 + width, f3, this.LL);
                        width += this.LLIZLLLIL;
                    }
                } else {
                    canvas.drawText(this.LLILLL, this.LLIZ + width, f3, this.LL);
                }
                if (this.LLJ == 0) {
                    postInvalidateDelayed(this.LLILZLL);
                }
            }
        }
    }

    @Override // X.C21459118yT
    public void setText(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("    ");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        this.LLILLL = strLIZIZ;
        this.LLIZLLLIL = this.LL.measureText(strLIZIZ);
        this.LLIZ = 0.0f;
        this.LLJI = 0L;
        this.LLJIJIL = LIZ(this.LLILLL);
        requestLayout();
    }

    public C21459218yU(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // X.C21459118yT, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE && View.MeasureSpec.getMode(i2) != 0) {
            super.onMeasure(i, i2);
            return;
        }
        this.LL.getFontMetrics(this.LLILLJJLI);
        Paint.FontMetrics fontMetrics = this.LLILLJJLI;
        setMeasuredDimension(View.MeasureSpec.getSize(i), (int) (fontMetrics.bottom - fontMetrics.top));
    }

    public C21459218yU(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
