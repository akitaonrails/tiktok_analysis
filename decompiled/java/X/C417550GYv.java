package X;

import Y.AUListenerS256S0100000_6;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.animation.DecelerateInterpolator;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.0GYv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C417550GYv extends Drawable {
    public final int LIZ;
    public final int LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final float LJ = 1.5f;
    public final float LJFF = 0.65f;
    public final float LJI = 40.0f;
    public final float LJII = 40.0f;
    public final float LJIIIIZZ = 36.0f;
    public final boolean LJIIIZ = false;
    public final long LJIIJ = 220;
    public final RectF LJIIJJI = new RectF();
    public final RectF LJIIL = new RectF();
    public final RectF LJIILIIL = new RectF();
    public final Paint LJIILJJIL;
    public final Paint LJIILL;
    public final Paint LJIILLIIL;
    public Bitmap LJIIZILJ;
    public Bitmap LJIJ;
    public float LJIJI;
    public float LJIJJ;
    public float LJIJJLI;
    public int LJIL;
    public int LJJ;
    public float LJJI;
    public ValueAnimator LJJIFFI;

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
        Float fValueOf;
        float f = this.LIZLLL;
        float f2 = this.LIZJ;
        float f3 = f * f2;
        if (this.LJIIIZ) {
            float f4 = f3 - ((this.LJ * f2) / 2.0f);
            if (f4 < 0.0f) {
                f4 = 0.0f;
            }
            fValueOf = Float.valueOf(f4);
        } else {
            fValueOf = null;
        }
        Bitmap bitmap = this.LJIIZILJ;
        if (bitmap != null) {
            int iSaveLayer = canvas.saveLayer(this.LJIIJJI, null);
            canvas.drawBitmap(bitmap, getBounds().left, getBounds().top, this.LJIILJJIL);
            int iLJI = C2441009hQ.LJI(this.LJJI, this.LJIL, this.LJJ);
            int i = (int) (170 * this.LJJI);
            Paint paint = new Paint(1);
            paint.setColor(C2441009hQ.LJIIL(iLJI, i));
            if (Build.VERSION.SDK_INT >= 29) {
                paint.setBlendMode(BlendMode.SRC_IN);
            } else {
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            }
            canvas.drawRoundRect(this.LJIIL, f3, f3, paint);
            canvas.restoreToCount(iSaveLayer);
        }
        Bitmap bitmap2 = this.LJIJ;
        if (bitmap2 != null) {
            Paint paint2 = new Paint();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 29) {
                paint2.setBlendMode(BlendMode.SCREEN);
            } else {
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.ADD));
            }
            int iSaveLayer2 = canvas.saveLayer(this.LJIIJJI, paint2);
            canvas.drawBitmap(bitmap2, getBounds().left, getBounds().top, this.LJIILJJIL);
            int i3 = (int) (150 * this.LJJI);
            Paint paint3 = new Paint(1);
            paint3.setColor(C2441009hQ.LJIIL(-1, i3));
            if (i2 >= 29) {
                paint3.setBlendMode(BlendMode.SRC_IN);
            } else {
                paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            }
            canvas.drawRoundRect(this.LJIIL, f3, f3, paint3);
            canvas.restoreToCount(iSaveLayer2);
        }
        if (fValueOf != null) {
            fValueOf.floatValue();
            canvas.drawRoundRect(this.LJIILIIL, fValueOf.floatValue(), fValueOf.floatValue(), this.LJIILL);
            canvas.drawRoundRect(this.LJIILIIL, fValueOf.floatValue(), fValueOf.floatValue(), this.LJIILLIIL);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        float f;
        super.onBoundsChange(rect);
        this.LJIIJJI.set(rect);
        this.LJIIL.set(rect);
        float f2 = this.LJ * this.LIZJ;
        float f3 = f2 / 2.0f;
        this.LJIILIIL.set(rect.left + f3, rect.top + f3, rect.right - f3, rect.bottom - f3);
        this.LJIILL.setStrokeWidth(f2);
        this.LJIILLIIL.setStrokeWidth(f2);
        this.LJIILL.setColor(this.LIZ);
        float fAlpha = Color.alpha(this.LIZ) / 255.0f;
        float fAlpha2 = Color.alpha(this.LIZIZ) / 255.0f;
        if (fAlpha2 <= fAlpha) {
            f = 0.0f;
        } else {
            f = (fAlpha2 - fAlpha) / (1.0f - fAlpha);
        }
        int iLJ = C13LZ.LJ((int) ((f * 255.0f) + 0.5f), 0, 255);
        int iLJIIL = C2441009hQ.LJIIL(this.LIZIZ, 0);
        int iLJIIL2 = C2441009hQ.LJIIL(this.LIZIZ, iLJ);
        float fCenterX = this.LJIILIIL.centerX();
        float fCenterY = this.LJIILIIL.centerY();
        SweepGradient sweepGradient = new SweepGradient(fCenterX, fCenterY, new int[]{iLJIIL, iLJIIL, iLJIIL2, iLJIIL, iLJIIL}, new float[]{0.0f, 0.22f, 0.25f, 0.28f, 1.0f});
        Matrix matrix = new Matrix();
        matrix.postRotate(-90.0f, fCenterX, fCenterY);
        sweepGradient.setLocalMatrix(matrix);
        this.LJIILLIIL.setShader(sweepGradient);
        this.LJIJI = rect.width() * this.LJFF;
        float f4 = this.LJIIL.bottom;
        float f5 = this.LJIIIIZZ;
        float f6 = this.LIZJ;
        float f7 = f4 - (f5 * f6);
        this.LJIJJLI = f7;
        this.LJIJJ = f7 - (this.LJI * f6);
        Bitmap bitmap = this.LJIIZILJ;
        if (bitmap != null) {
            bitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
        }
        this.LJIIZILJ = null;
        Bitmap bitmap2 = this.LJIJ;
        if (bitmap2 != null) {
            bitmap2.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap2);
        }
        this.LJIJ = null;
        int iWidth = getBounds().width();
        if (iWidth < 1) {
            iWidth = 1;
        }
        int iHeight = getBounds().height();
        if (iHeight < 1) {
            iHeight = 1;
        }
        if (iWidth > 1 && iHeight > 1) {
            float fExactCenterX = getBounds().exactCenterX();
            this.LJIIZILJ = LIZ(this, iWidth, iHeight, fExactCenterX);
            this.LJIJ = LIZ(this, iWidth, iHeight, fExactCenterX + getBounds().width());
        }
    }

    public static void LIZIZ(C417550GYv c417550GYv, C417580GYy c417580GYy) {
        int iIntValue;
        Integer num = c417580GYy.LIZ;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        c417550GYv.LJIL = c417550GYv.LJJ;
        c417550GYv.LJJ = iIntValue;
        ValueAnimator valueAnimator = c417550GYv.LJJIFFI;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        c417550GYv.LJJI = 0.0f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(c417550GYv.LJIIJ);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6(c417550GYv, 183));
        valueAnimatorOfFloat.start();
        c417550GYv.LJJIFFI = valueAnimatorOfFloat;
    }

    public C417550GYv(int i, int i2, float f, float f2) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = f;
        this.LIZLLL = f2;
        Paint paint = new Paint(1);
        paint.setFilterBitmap(true);
        this.LJIILJJIL = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setDither(true);
        this.LJIILL = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setDither(true);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        this.LJIILLIIL = paint3;
        this.LJJI = 1.0f;
    }

    public static final Bitmap LIZ(C417550GYv c417550GYv, int i, int i2, float f) {
        float f2 = c417550GYv.LJIJI;
        RectF rectF = new RectF(f - (f2 / 2.0f), c417550GYv.LJIJJ, f + (f2 / 2.0f), c417550GYv.LJIJJLI);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ALPHA_8);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        paint.setColor(-1);
        canvas.drawOval(rectF, paint);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i, i2, Bitmap.Config.ALPHA_8);
        Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
        Paint paint2 = new Paint(1);
        paint2.setMaskFilter(new BlurMaskFilter(c417550GYv.LJII * c417550GYv.LIZJ, BlurMaskFilter.Blur.NORMAL));
        canvas2.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, paint2);
        C786410Ut5.LJJJJ(bitmapCreateBitmap);
        return bitmapCreateBitmap2;
    }
}
