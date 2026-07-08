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
import android.view.View;

/* JADX INFO: renamed from: X.1E5m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2275681E5m {
    public static void LIZ(int i, int i2, int i3, int i4, int i5, int i6, View view) {
        C2275671E5l c2275671E5l = new C2275671E5l();
        c2275671E5l.LJI[0] = i;
        c2275671E5l.LIZIZ = i2;
        c2275671E5l.LIZJ = i3;
        c2275671E5l.LIZLLL = i4;
        c2275671E5l.LJ = i5;
        c2275671E5l.LJFF = i6;
        final int i7 = c2275671E5l.LIZ;
        final int[] iArr = c2275671E5l.LJI;
        final int i8 = c2275671E5l.LIZIZ;
        final int i9 = c2275671E5l.LIZJ;
        final int i10 = c2275671E5l.LIZLLL;
        final int i11 = c2275671E5l.LJ;
        final int i12 = c2275671E5l.LJFF;
        Drawable drawable = new Drawable(i7, iArr, i8, i9, i10, i11, i12) { // from class: X.0FP7
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
                    int i13 = this.LIZJ;
                    canvas.drawRoundRect(rectF3, i13, i13, this.LJI);
                    RectF rectF4 = this.LJIIIIZZ;
                    int i14 = this.LIZJ;
                    canvas.drawRoundRect(rectF4, i14, i14, this.LJII);
                    return;
                }
                float f3 = 2;
                canvas.drawCircle(this.LJIIIIZZ.centerX(), this.LJIIIIZZ.centerY(), Math.min(this.LJIIIIZZ.width(), this.LJIIIIZZ.height()) / f3, this.LJI);
                canvas.drawCircle(this.LJIIIIZZ.centerX(), this.LJIIIIZZ.centerY(), Math.min(this.LJIIIIZZ.width(), this.LJIIIIZZ.height()) / f3, this.LJII);
            }

            @Override // android.graphics.drawable.Drawable
            public final void setAlpha(int i13) {
                this.LJI.setAlpha(i13);
            }

            @Override // android.graphics.drawable.Drawable
            public final void setColorFilter(ColorFilter colorFilter) {
                this.LJI.setColorFilter(colorFilter);
            }

            @Override // android.graphics.drawable.Drawable
            public final void setBounds(int i13, int i14, int i15, int i16) {
                super.setBounds(i13, i14, i15, i16);
                int i17 = this.LIZLLL;
                int i18 = this.LJ;
                int i19 = this.LJFF;
                this.LJIIIIZZ = new RectF((i13 + i17) - i18, (i14 + i17) - i19, (i15 - i17) - i18, (i16 - i17) - i19);
            }

            {
                this.LIZ = i7;
                this.LIZIZ = iArr;
                this.LIZJ = i8;
                this.LIZLLL = i10;
                this.LJ = i11;
                this.LJFF = i12;
                Paint paint = new Paint();
                this.LJI = paint;
                paint.setColor(0);
                paint.setAntiAlias(true);
                paint.setShadowLayer(i10, i11, i12, i9);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
                Paint paint2 = new Paint();
                this.LJII = paint2;
                paint2.setAntiAlias(true);
            }
        };
        view.setLayerType(1, null);
        view.setBackground(drawable);
    }
}
