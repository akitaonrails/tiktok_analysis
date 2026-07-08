package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.AwS51S0001000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0GWv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C417030GWv extends Drawable {
    public final C417040GWw LIZ;
    public final C01GW LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1109));

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return ((Paint) this.LIZIZ.getValue()).getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iWidth = getBounds().width();
        int iHeight = getBounds().height();
        if (iWidth > 0 && iHeight > 0) {
            float f = iWidth;
            float f2 = iHeight;
            float fMin = Math.min(f, f2) / 2.0f;
            RectF rectF = new RectF(0.0f, 0.0f, f, f2);
            C417040GWw c417040GWw = this.LIZ;
            if (c417040GWw != null) {
                float fAbs = Math.abs(c417040GWw.LIZJ) + c417040GWw.LIZ;
                rectF.top += fAbs;
                rectF.bottom -= fAbs;
                rectF.left += fAbs;
                rectF.right -= fAbs;
                canvas.save();
                canvas.translate(0.0f, c417040GWw.LIZJ);
                canvas.drawRoundRect(rectF, fMin, fMin, (Paint) this.LIZJ.getValue());
                canvas.restore();
            }
            canvas.drawRoundRect(rectF, fMin, fMin, (Paint) this.LIZIZ.getValue());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (((Paint) this.LIZIZ.getValue()).getAlpha() != i) {
            ((Paint) this.LIZIZ.getValue()).setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        ((Paint) this.LIZIZ.getValue()).setColorFilter(colorFilter);
        invalidateSelf();
    }

    public C417030GWv(int i, C417040GWw c417040GWw) {
        this.LIZ = c417040GWw;
        this.LIZIZ = C452501pT.LIZIZ(new AwS51S0001000_6(i, 6));
    }
}
