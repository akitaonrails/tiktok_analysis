package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.1E5n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2275691E5n {
    public static void LIZ(int i, int i2, int i3, int i4, C1842280y2c c1842280y2c) {
        C2275701E5o c2275701E5o = new C2275701E5o();
        c2275701E5o.LJI[0] = i;
        c2275701E5o.LIZIZ = i2;
        c2275701E5o.LIZJ = i3;
        c2275701E5o.LIZLLL = i4;
        c2275701E5o.LJ = 0;
        c2275701E5o.LJFF = 0;
        final int i5 = c2275701E5o.LIZ;
        final int[] iArr = c2275701E5o.LJI;
        final int i6 = c2275701E5o.LIZIZ;
        final int i7 = c2275701E5o.LIZJ;
        final int i8 = c2275701E5o.LIZLLL;
        final int i9 = c2275701E5o.LJ;
        final int i10 = c2275701E5o.LJFF;
        Drawable drawable = new Drawable(i5, iArr, i6, i7, i8, i9, i10) { // from class: X.0FP6
            public static final /* synthetic */ int LJIIIZ = 0;
            public final int LIZ;
            public final int[] LIZIZ;
            public final int LIZJ;
            public final int LIZLLL;
            public final int LJ;
            public final int LJFF;
            public final Paint LJI;
            public final Paint LJII;
            public RectF LJIIIIZZ;

            @Override // android.graphics.drawable.Drawable
            public final int getOpacity() {
                return -3;
            }

            @Override // android.graphics.drawable.Drawable
            public final void draw(Canvas canvas) {
                int[] iArr2 = this.LIZIZ;
                if (iArr2 != null) {
                    if (iArr2.length == 1) {
                        this.LJII.setColor(iArr2[0]);
                    } else {
                        Paint paint = this.LJII;
                        RectF rectF = this.LJIIIIZZ;
                        float f = rectF.left;
                        float f2 = 2;
                        float fHeight = rectF.height() / f2;
                        RectF rectF2 = this.LJIIIIZZ;
                        paint.setShader(new LinearGradient(f, fHeight, rectF2.right, rectF2.height() / f2, this.LIZIZ, (float[]) null, Shader.TileMode.CLAMP));
                    }
                }
                if (this.LIZ == 1) {
                    RectF rectF3 = this.LJIIIIZZ;
                    int i11 = this.LIZJ;
                    canvas.drawRoundRect(rectF3, i11, i11, this.LJI);
                    RectF rectF4 = this.LJIIIIZZ;
                    int i12 = this.LIZJ;
                    canvas.drawRoundRect(rectF4, i12, i12, this.LJII);
                    return;
                }
                float f3 = 2;
                canvas.drawCircle(this.LJIIIIZZ.centerX(), this.LJIIIIZZ.centerY(), Math.min(this.LJIIIIZZ.width(), this.LJIIIIZZ.height()) / f3, this.LJI);
                canvas.drawCircle(this.LJIIIIZZ.centerX(), this.LJIIIIZZ.centerY(), Math.min(this.LJIIIIZZ.width(), this.LJIIIIZZ.height()) / f3, this.LJII);
            }

            @Override // android.graphics.drawable.Drawable
            public final void setAlpha(int i11) {
                this.LJI.setAlpha(i11);
            }

            @Override // android.graphics.drawable.Drawable
            public final void setColorFilter(ColorFilter colorFilter) {
                this.LJI.setColorFilter(colorFilter);
            }

            @Override // android.graphics.drawable.Drawable
            public final void setBounds(int i11, int i12, int i13, int i14) {
                super.setBounds(i11, i12, i13, i14);
                int i15 = this.LIZLLL;
                int i16 = this.LJ;
                int i17 = this.LJFF;
                this.LJIIIIZZ = new RectF((i11 + i15) - i16, (i12 + i15) - i17, (i13 - i15) - i16, (i14 - i15) - i17);
            }

            {
                this.LIZ = i5;
                this.LIZIZ = iArr;
                this.LIZJ = i6;
                this.LIZLLL = i8;
                this.LJ = i9;
                this.LJFF = i10;
                Paint paint = new Paint();
                this.LJI = paint;
                paint.setColor(0);
                paint.setAntiAlias(true);
                paint.setShadowLayer(i8, i9, i10, i7);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
                Paint paint2 = new Paint();
                this.LJII = paint2;
                paint2.setAntiAlias(true);
            }
        };
        c1842280y2c.setLayerType(1, null);
        c1842280y2c.setBackground(drawable);
    }
}
