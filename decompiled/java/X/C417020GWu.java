package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0GWu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C417020GWu extends Drawable {
    public final int LIZ;
    public final int LIZIZ;
    public final C417040GWw LIZJ;
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1110));
    public final C01GW LJ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1111));

    public final Paint LIZ() {
        return (Paint) this.LIZLLL.getValue();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return LIZ().getAlpha();
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
            C417040GWw c417040GWw = this.LIZJ;
            if (c417040GWw != null) {
                float fAbs = Math.abs(c417040GWw.LIZJ) + c417040GWw.LIZ;
                rectF.top += fAbs;
                rectF.bottom -= fAbs;
                rectF.left += fAbs;
                rectF.right -= fAbs;
                canvas.save();
                canvas.translate(0.0f, c417040GWw.LIZJ);
                canvas.drawRoundRect(rectF, fMin, fMin, (Paint) this.LJ.getValue());
                canvas.restore();
            }
            LIZ().setShader(new LinearGradient(rectF.left, 0.0f, rectF.right, 0.0f, this.LIZ, this.LIZIZ, Shader.TileMode.CLAMP));
            canvas.drawRoundRect(rectF, fMin, fMin, LIZ());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (LIZ().getAlpha() != i) {
            LIZ().setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        LIZ().setColorFilter(colorFilter);
        invalidateSelf();
    }

    public C417020GWu(int i, int i2, C417040GWw c417040GWw) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = c417040GWw;
    }
}
