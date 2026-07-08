package X;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.19jQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21620619jQ extends Drawable {
    public final C21620819jS LIZ;
    public final boolean LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public Bitmap LJI;
    public Bitmap LJII;
    public Bitmap LJIIIIZZ;
    public Bitmap LJIIIZ;
    public C21620719jR LJIIJ;
    public final Matrix LJIIJJI;
    public final Paint LJIIL;
    public final Paint LJIILIIL;

    @Override // android.graphics.drawable.Drawable
    @InterfaceC1294060jmO
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void LIZ() {
        Bitmap bitmap = this.LJI;
        if (bitmap != null) {
            bitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
        }
        this.LJI = null;
        Bitmap bitmap2 = this.LJII;
        if (bitmap2 != null) {
            bitmap2.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap2);
        }
        this.LJII = null;
        Bitmap bitmap3 = this.LJIIIIZZ;
        if (bitmap3 != null) {
            bitmap3.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap3);
        }
        this.LJIIIIZZ = null;
        Bitmap bitmap4 = this.LJIIIZ;
        if (bitmap4 != null) {
            bitmap4.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap4);
        }
        this.LJIIIZ = null;
        this.LJIIJ = null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        C21620719jR c21620719jR;
        Bitmap bitmap4 = this.LJI;
        if (bitmap4 == null || (bitmap = this.LJIIIIZZ) == null || (bitmap2 = this.LJII) == null || (bitmap3 = this.LJIIIZ) == null || (c21620719jR = this.LJIIJ) == null) {
            return;
        }
        try {
            canvas.drawBitmap(bitmap4, c21620719jR.LIZ, c21620719jR.LJ, (Paint) null);
            canvas.drawBitmap(bitmap4, c21620719jR.LIZJ, c21620719jR.LJI, (Paint) null);
            canvas.drawBitmap(bitmap4, c21620719jR.LIZIZ, c21620719jR.LJFF, (Paint) null);
            canvas.drawBitmap(bitmap4, c21620719jR.LIZLLL, c21620719jR.LJII, (Paint) null);
            canvas.drawBitmap(bitmap, c21620719jR.LJIIIIZZ, c21620719jR.LJIIL, (Paint) null);
            canvas.drawBitmap(bitmap, c21620719jR.LJIIIZ, c21620719jR.LJIILIIL, (Paint) null);
            canvas.drawBitmap(bitmap2, c21620719jR.LJIIJ, c21620719jR.LJIILJJIL, (Paint) null);
            canvas.drawBitmap(bitmap2, c21620719jR.LJIIJJI, c21620719jR.LJIILL, (Paint) null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            canvas.drawBitmap(bitmap3, c21620719jR.LJIILLIIL, c21620719jR.LJIIZILJ, (Paint) null);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            if (bitmap3.getWidth() > 0 && bitmap3.getHeight() > 0) {
                this.LJIILIIL.setColor(bitmap3.getPixel(this.LJ, this.LIZJ));
                canvas.drawRect(c21620719jR.LJIIZILJ, this.LJIILIIL);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        int iMin;
        int iMin2;
        Bitmap bitmapCreateScaledBitmap;
        Bitmap bitmapCreateScaledBitmap2;
        Bitmap bitmapCreateScaledBitmap3;
        super.onBoundsChange(rect);
        LIZ();
        try {
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(this.LIZ.LIZIZ)));
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(this.LIZ.LIZJ)));
            Bitmap.Config config = this.LIZ.LIZ.getConfig();
            if (!this.LIZ.LIZ.isRecycled() && this.LIZ.LIZ.getHeight() > 0 && this.LIZ.LIZ.getWidth() > 0 && config != null) {
                Bitmap bitmapCreateScaledBitmap4 = Bitmap.createScaledBitmap(this.LIZ.LIZ.copy(config, true), iLIZIZ, iLIZIZ2, true);
                if (this.LIZIZ) {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap4, 0, 0, bitmapCreateScaledBitmap4.getWidth(), bitmapCreateScaledBitmap4.getHeight(), this.LJIIJJI, true);
                    bitmapCreateScaledBitmap4.recycle();
                    BitmapCrashChecker.recordBitmapRecyclePoint(bitmapCreateScaledBitmap4);
                    bitmapCreateScaledBitmap4 = bitmapCreateBitmap;
                }
                int i = iLIZIZ2 - 1;
                float f = iLIZIZ2;
                this.LIZJ = Math.min(i, Math.max(0, (int) (this.LIZ.LJ * f)));
                int iMin3 = Math.min(i, Math.max(0, (int) (f * this.LIZ.LJI)));
                this.LIZLLL = iMin3;
                int i2 = this.LIZJ;
                if (i2 > iMin3) {
                    bitmapCreateScaledBitmap4.recycle();
                    BitmapCrashChecker.recordBitmapRecyclePoint(bitmapCreateScaledBitmap4);
                    return;
                }
                int iMax = Math.max(1, iMin3 - i2);
                if (this.LIZIZ) {
                    iMin = Math.min(iLIZIZ - 1, Math.max(0, (int) (iLIZIZ * (1 - this.LIZ.LJFF))));
                } else {
                    iMin = Math.min(iLIZIZ - 1, Math.max(0, (int) (iLIZIZ * this.LIZ.LIZLLL)));
                }
                this.LJ = iMin;
                if (this.LIZIZ) {
                    iMin2 = Math.min(iLIZIZ - 1, Math.max(0, (int) (iLIZIZ * (1 - this.LIZ.LIZLLL))));
                } else {
                    iMin2 = Math.min(iLIZIZ - 1, Math.max(0, (int) (iLIZIZ * this.LIZ.LJFF)));
                }
                this.LJFF = iMin2;
                int i3 = this.LJ;
                if (i3 > iMin2) {
                    bitmapCreateScaledBitmap4.recycle();
                    BitmapCrashChecker.recordBitmapRecyclePoint(bitmapCreateScaledBitmap4);
                    return;
                }
                int iMax2 = Math.max(1, iMin2 - i3);
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateScaledBitmap4, 0, this.LIZJ, iLIZIZ, iMax);
                Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(bitmapCreateScaledBitmap4, this.LJ, 0, iMax2, iLIZIZ2);
                Bitmap bitmapCreateBitmap4 = Bitmap.createBitmap(bitmapCreateScaledBitmap4, this.LJ, this.LIZJ, iMax2, iMax);
                int iWidth = rect.width();
                int iHeight = rect.height();
                int iMax3 = Math.max(1, (iWidth - this.LJ) - ((iLIZIZ - this.LJFF) - 1));
                int iMax4 = Math.max(1, (iHeight - this.LIZJ) - ((iLIZIZ2 - this.LIZLLL) - 1));
                if (this.LIZ.LJII) {
                    bitmapCreateScaledBitmap = LIZIZ(iMax3, bitmapCreateBitmap3.getHeight(), bitmapCreateBitmap3);
                    bitmapCreateScaledBitmap2 = LIZIZ(bitmapCreateBitmap2.getWidth(), iMax4, bitmapCreateBitmap2);
                    bitmapCreateScaledBitmap3 = LIZIZ(iMax3, iMax4, bitmapCreateBitmap4);
                } else {
                    bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap3, iMax3, bitmapCreateBitmap3.getHeight(), true);
                    bitmapCreateScaledBitmap2 = Bitmap.createScaledBitmap(bitmapCreateBitmap2, bitmapCreateBitmap2.getWidth(), iMax4, true);
                    bitmapCreateScaledBitmap3 = Bitmap.createScaledBitmap(bitmapCreateBitmap4, iMax3, iMax4, true);
                }
                C786410Ut5.LJJJJ(bitmapCreateBitmap2);
                C786410Ut5.LJJJJ(bitmapCreateBitmap3);
                C786410Ut5.LJJJJ(bitmapCreateBitmap4);
                this.LJI = bitmapCreateScaledBitmap4;
                this.LJIIIIZZ = bitmapCreateScaledBitmap;
                this.LJII = bitmapCreateScaledBitmap2;
                this.LJIIIZ = bitmapCreateScaledBitmap3;
                this.LJIIJ = C0GWG.LIZ(bitmapCreateScaledBitmap4, bitmapCreateScaledBitmap, bitmapCreateScaledBitmap2, iWidth, iHeight, this.LJ, this.LIZJ, this.LJFF, this.LIZLLL);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LIZ();
        }
    }

    public C21620619jQ(C21620819jS c21620819jS, boolean z) {
        this.LIZ = c21620819jS;
        this.LIZIZ = z;
        Matrix matrix = new Matrix();
        matrix.preScale(-1.0f, 1.0f);
        this.LJIIJJI = matrix;
        Paint paint = new Paint();
        paint.setFilterBitmap(true);
        this.LJIIL = paint;
        this.LJIILIIL = new Paint();
    }

    public final Bitmap LIZIZ(int i, int i2, Bitmap bitmap) {
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = this.LJIIL;
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        canvas.drawRect(0.0f, 0.0f, i, i2, this.LJIIL);
        this.LJIIL.setShader(null);
        return bitmapCreateBitmap;
    }
}
