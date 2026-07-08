package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS66S0001000_33;

/* JADX INFO: renamed from: X.19er, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21592319er extends Drawable {
    public final int LIZ;
    public final C21592419es LIZJ;
    public final C01GW LIZLLL;
    public int LIZIZ = -1;
    public final C01GW LJ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3871));
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(569));

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return ((Paint) this.LIZLLL.getValue()).getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float fLIZ;
        float fLIZ2;
        int iWidth = getBounds().width();
        int iHeight = getBounds().height();
        if (iWidth > 0 && iHeight > 0) {
            C21592419es c21592419es = this.LIZJ;
            if (c21592419es != null) {
                fLIZ = c21592419es.LJ;
            } else {
                fLIZ = C339190DRl.LIZ(24.0f);
            }
            RectF rectF = new RectF(0.0f, 0.0f, iWidth, iHeight);
            C21592419es c21592419es2 = this.LIZJ;
            if (c21592419es2 != null) {
                fLIZ2 = c21592419es2.LIZ;
            } else {
                fLIZ2 = C339190DRl.LIZ(8.0f);
            }
            rectF.top += fLIZ2;
            rectF.bottom -= fLIZ2;
            float f = fLIZ2 / 2;
            rectF.left += f;
            rectF.right -= f;
            C21592419es c21592419es3 = this.LIZJ;
            if (c21592419es3 != null) {
                canvas.save();
                canvas.translate(0.0f, c21592419es3.LIZJ);
                canvas.drawRoundRect(rectF, fLIZ, fLIZ, (Paint) this.LJ.getValue());
                canvas.restore();
            }
            if (this.LIZ != 0) {
                canvas.drawRoundRect(rectF, fLIZ, fLIZ, (Paint) this.LIZLLL.getValue());
            }
            if (this.LIZIZ != -1) {
                canvas.drawRoundRect(rectF, fLIZ, fLIZ, (Paint) this.LJFF.getValue());
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (((Paint) this.LIZLLL.getValue()).getAlpha() != i) {
            ((Paint) this.LIZLLL.getValue()).setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        ((Paint) this.LIZLLL.getValue()).setColorFilter(colorFilter);
        invalidateSelf();
    }

    public C21592319er(int i, C21592419es c21592419es) {
        this.LIZ = i;
        this.LIZJ = c21592419es;
        this.LIZLLL = C452501pT.LIZIZ(new AwS66S0001000_33(i, 9));
    }
}
