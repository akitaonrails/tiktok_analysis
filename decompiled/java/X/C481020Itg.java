package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/* JADX INFO: renamed from: X.0Itg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C481020Itg extends Drawable {
    public int LIZIZ;
    public boolean LIZJ;
    public int LJ;
    public boolean LJFF;
    public GradientDrawable LIZ = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{1291845632, 0});
    public GradientDrawable LIZLLL = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1291845632, 0});

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        GradientDrawable gradientDrawable = null;
        if (this.LIZJ) {
            this.LIZJ = false;
            Rect bounds = getBounds();
            GradientDrawable gradientDrawable2 = this.LIZ;
            if (gradientDrawable2 == null) {
                gradientDrawable2 = null;
            }
            int i = bounds.left;
            int i2 = bounds.top;
            gradientDrawable2.setBounds(i, i2, bounds.right, this.LIZIZ + i2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("topDrawable bounds: ");
            GradientDrawable gradientDrawable3 = this.LIZ;
            if (gradientDrawable3 == null) {
                gradientDrawable3 = null;
            }
            sbLIZ.append(gradientDrawable3.getBounds());
            C2188811AlT.LIZIZ(sbLIZ);
        }
        GradientDrawable gradientDrawable4 = this.LIZ;
        if (gradientDrawable4 == null) {
            gradientDrawable4 = null;
        }
        gradientDrawable4.draw(canvas);
        if (this.LJFF) {
            this.LJFF = false;
            Rect bounds2 = getBounds();
            GradientDrawable gradientDrawable5 = this.LIZLLL;
            if (gradientDrawable5 == null) {
                gradientDrawable5 = null;
            }
            int i3 = bounds2.left;
            int i4 = bounds2.bottom;
            gradientDrawable5.setBounds(i3, i4 - this.LJ, bounds2.right, i4);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("bottomDrawable bounds: ");
            GradientDrawable gradientDrawable6 = this.LIZLLL;
            if (gradientDrawable6 == null) {
                gradientDrawable6 = null;
            }
            sbLIZ2.append(gradientDrawable6.getBounds());
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        GradientDrawable gradientDrawable7 = this.LIZLLL;
        if (gradientDrawable7 != null) {
            gradientDrawable = gradientDrawable7;
        }
        gradientDrawable.draw(canvas);
    }
}
