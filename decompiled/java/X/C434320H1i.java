package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0H1i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C434320H1i extends View {
    public final float LL;
    public int LLILLJJLI;
    public int LLILLL;
    public float LLILZ;
    public final Paint LLILZIL;
    public final Paint LLILZLL;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        if (this.LLILLJJLI <= 0) {
            return;
        }
        int width = getWidth();
        float height = getHeight() / 2.0f;
        float f2 = width;
        float height2 = getHeight();
        canvas.drawRoundRect(0.0f, 0.0f, f2, height2, height, height, this.LLILZIL);
        boolean z = true;
        if (getLayoutDirection() != 1) {
            z = false;
        }
        float f3 = f2 / this.LLILLJJLI;
        float fMax = Math.max(this.LL, f3);
        float f4 = this.LLILZ * f3;
        if (z) {
            f = ((f2 - (this.LLILLL * f3)) - f4) - (f3 / 2.0f);
        } else {
            f = (this.LLILLL * f3) + f4 + (f3 / 2.0f);
        }
        float fMax2 = Math.max(0.0f, Math.min(f - (fMax / 2.0f), f2 - fMax));
        canvas.drawRoundRect(fMax2, 0.0f, fMax2 + fMax, height2, height, height, this.LLILZLL);
    }

    public final void setup(int i) {
        int iMax = Math.max(0, i);
        this.LLILLJJLI = iMax;
        this.LLILLL = 0;
        this.LLILZ = 0.0f;
        if (iMax >= 2) {
            C500260Jjc.LLFFF(this);
        } else {
            C500260Jjc.LJIILIIL(this);
        }
        invalidate();
    }

    public C434320H1i(Context context, AttributeSet attributeSet) {
        int iIntValue;
        super(context, attributeSet);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ey7, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ey8, context);
        int iIntValue2 = numLIZJ2 != null ? numLIZJ2.intValue() : 0;
        this.LL = C497740JfY.LIZIZ(10);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(iIntValue2);
        this.LLILZIL = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(iIntValue);
        this.LLILZLL = paint2;
    }
}
