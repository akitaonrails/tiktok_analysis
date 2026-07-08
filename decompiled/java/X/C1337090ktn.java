package X;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.widget.ImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0ktn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1337090ktn extends Drawable {
    public static final /* synthetic */ int LJIJJ = 0;
    public final RectF LIZ = new RectF();
    public final RectF LIZIZ = new RectF();
    public final RectF LIZJ;
    public final Bitmap LIZLLL;
    public final Paint LJ;
    public final int LJFF;
    public final int LJI;
    public final RectF LJII;
    public final Paint LJIIIIZZ;
    public final Matrix LJIIIZ;
    public final RectF LJIIJ;
    public Shader.TileMode LJIIJJI;
    public Shader.TileMode LJIIL;
    public boolean LJIILIIL;
    public float LJIILJJIL;
    public final boolean[] LJIILL;
    public boolean LJIILLIIL;
    public float LJIIZILJ;
    public ColorStateList LJIJ;
    public ImageView.ScaleType LJIJI;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void LIZJ() {
        float fWidth;
        float fHeight;
        int i = C340120DVa.LIZ[this.LJIJI.ordinal()];
        if (i == 1) {
            this.LJII.set(this.LIZ);
            RectF rectF = this.LJII;
            float f = this.LJIIZILJ;
            rectF.inset(f / 2.0f, f / 2.0f);
            this.LJIIIZ.reset();
            this.LJIIIZ.setTranslate((int) (((this.LJII.width() - this.LJFF) * 0.5f) + 0.5f), (int) (((this.LJII.height() - this.LJI) * 0.5f) + 0.5f));
        } else if (i == 2) {
            this.LJII.set(this.LIZ);
            RectF rectF2 = this.LJII;
            float f2 = this.LJIIZILJ;
            rectF2.inset(f2 / 2.0f, f2 / 2.0f);
            this.LJIIIZ.reset();
            float fWidth2 = 0.0f;
            if (this.LJFF * this.LJII.height() > this.LJII.width() * this.LJI) {
                fWidth = this.LJII.height() / this.LJI;
                fWidth2 = (this.LJII.width() - (this.LJFF * fWidth)) * 0.5f;
                fHeight = 0.0f;
            } else {
                fWidth = this.LJII.width() / this.LJFF;
                fHeight = (this.LJII.height() - (this.LJI * fWidth)) * 0.5f;
            }
            this.LJIIIZ.setScale(fWidth, fWidth);
            Matrix matrix = this.LJIIIZ;
            float f3 = (int) (fWidth2 + 0.5f);
            float f4 = this.LJIIZILJ;
            matrix.postTranslate(f3 + (f4 / 2.0f), ((int) (fHeight + 0.5f)) + (f4 / 2.0f));
        } else if (i == 3) {
            this.LJIIIZ.reset();
            float fMin = (((float) this.LJFF) > this.LIZ.width() || ((float) this.LJI) > this.LIZ.height()) ? Math.min(this.LIZ.width() / this.LJFF, this.LIZ.height() / this.LJI) : 1.0f;
            float fWidth3 = (int) (((this.LIZ.width() - (this.LJFF * fMin)) * 0.5f) + 0.5f);
            float fHeight2 = (int) (((this.LIZ.height() - (this.LJI * fMin)) * 0.5f) + 0.5f);
            this.LJIIIZ.setScale(fMin, fMin);
            this.LJIIIZ.postTranslate(fWidth3, fHeight2);
            this.LJII.set(this.LIZJ);
            this.LJIIIZ.mapRect(this.LJII);
            RectF rectF3 = this.LJII;
            float f5 = this.LJIIZILJ;
            rectF3.inset(f5 / 2.0f, f5 / 2.0f);
            this.LJIIIZ.setRectToRect(this.LIZJ, this.LJII, Matrix.ScaleToFit.FILL);
        } else if (i == 5) {
            this.LJII.set(this.LIZJ);
            this.LJIIIZ.setRectToRect(this.LIZJ, this.LIZ, Matrix.ScaleToFit.END);
            this.LJIIIZ.mapRect(this.LJII);
            RectF rectF4 = this.LJII;
            float f6 = this.LJIIZILJ;
            rectF4.inset(f6 / 2.0f, f6 / 2.0f);
            this.LJIIIZ.setRectToRect(this.LIZJ, this.LJII, Matrix.ScaleToFit.FILL);
        } else if (i == 6) {
            this.LJII.set(this.LIZJ);
            this.LJIIIZ.setRectToRect(this.LIZJ, this.LIZ, Matrix.ScaleToFit.START);
            this.LJIIIZ.mapRect(this.LJII);
            RectF rectF5 = this.LJII;
            float f7 = this.LJIIZILJ;
            rectF5.inset(f7 / 2.0f, f7 / 2.0f);
            this.LJIIIZ.setRectToRect(this.LIZJ, this.LJII, Matrix.ScaleToFit.FILL);
        } else if (i != 7) {
            this.LJII.set(this.LIZJ);
            this.LJIIIZ.setRectToRect(this.LIZJ, this.LIZ, Matrix.ScaleToFit.CENTER);
            this.LJIIIZ.mapRect(this.LJII);
            RectF rectF6 = this.LJII;
            float f8 = this.LJIIZILJ;
            rectF6.inset(f8 / 2.0f, f8 / 2.0f);
            this.LJIIIZ.setRectToRect(this.LIZJ, this.LJII, Matrix.ScaleToFit.FILL);
        } else {
            this.LJII.set(this.LIZ);
            RectF rectF7 = this.LJII;
            float f9 = this.LJIIZILJ;
            rectF7.inset(f9 / 2.0f, f9 / 2.0f);
            this.LJIIIZ.reset();
            this.LJIIIZ.setRectToRect(this.LIZJ, this.LJII, Matrix.ScaleToFit.FILL);
        }
        this.LIZIZ.set(this.LJII);
        this.LJIILIIL = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.LJ.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.LJ.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.LJIJ.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.LJI;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.LJFF;
    }

    public C1337090ktn(Bitmap bitmap) {
        RectF rectF = new RectF();
        this.LIZJ = rectF;
        this.LJII = new RectF();
        this.LJIIIZ = new Matrix();
        this.LJIIJ = new RectF();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.LJIIJJI = tileMode;
        this.LJIIL = tileMode;
        this.LJIILIIL = true;
        this.LJIILJJIL = 0.0f;
        this.LJIILL = new boolean[]{true, true, true, true};
        this.LJIILLIIL = false;
        this.LJIIZILJ = 0.0f;
        this.LJIJ = ColorStateList.valueOf(-16777216);
        this.LJIJI = ImageView.ScaleType.FIT_CENTER;
        this.LIZLLL = bitmap;
        int width = bitmap.getWidth();
        this.LJFF = width;
        int height = bitmap.getHeight();
        this.LJI = height;
        rectF.set(0.0f, 0.0f, width, height);
        Paint paint = new Paint();
        this.LJ = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.LJIIIIZZ = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(this.LJIJ.getColorForState(getState(), -16777216));
        paint2.setStrokeWidth(this.LJIIZILJ);
    }

    public static Drawable LIZ(Drawable drawable) {
        if (drawable != null) {
            if (drawable instanceof C1337090ktn) {
                return drawable;
            }
            if (Build.VERSION.SDK_INT >= 28 && (drawable instanceof AnimatedImageDrawable)) {
                return drawable;
            }
            if (drawable instanceof LayerDrawable) {
                Drawable.ConstantState constantState = drawable.mutate().getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                for (int i = 0; i < numberOfLayers; i++) {
                    layerDrawable.setDrawableByLayerId(layerDrawable.getId(i), LIZ(layerDrawable.getDrawable(i)));
                }
                return layerDrawable;
            }
        }
        Bitmap bitmap = null;
        if (drawable != null) {
            if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
            } else {
                try {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(Math.max(drawable.getIntrinsicWidth(), 2), Math.max(drawable.getIntrinsicHeight(), 2), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                    drawable.draw(canvas);
                    bitmap = bitmapCreateBitmap;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
        if (bitmap != null) {
            return new C1337090ktn(bitmap);
        }
        return drawable;
    }

    public final void LIZIZ(Canvas canvas) {
        for (boolean z : this.LJIILL) {
            if (z) {
                if (this.LJIILJJIL == 0.0f) {
                    return;
                }
                RectF rectF = this.LIZIZ;
                float f = rectF.left;
                float f2 = rectF.top;
                float fWidth = rectF.width() + f;
                float fHeight = this.LIZIZ.height() + f2;
                float f3 = this.LJIILJJIL;
                if (!this.LJIILL[0]) {
                    this.LJIIJ.set(f, f2, f + f3, f2 + f3);
                    canvas.drawRect(this.LJIIJ, this.LJ);
                }
                if (!this.LJIILL[1]) {
                    this.LJIIJ.set(fWidth - f3, f2, fWidth, f3);
                    canvas.drawRect(this.LJIIJ, this.LJ);
                }
                if (!this.LJIILL[2]) {
                    this.LJIIJ.set(fWidth - f3, fHeight - f3, fWidth, fHeight);
                    canvas.drawRect(this.LJIIJ, this.LJ);
                }
                if (!this.LJIILL[3]) {
                    this.LJIIJ.set(f, fHeight - f3, f3 + f, fHeight);
                    canvas.drawRect(this.LJIIJ, this.LJ);
                    return;
                }
                return;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.LJIILIIL) {
            BitmapShader bitmapShader = new BitmapShader(this.LIZLLL, this.LJIIJJI, this.LJIIL);
            Shader.TileMode tileMode = this.LJIIJJI;
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            if (tileMode == tileMode2 && this.LJIIL == tileMode2) {
                bitmapShader.setLocalMatrix(this.LJIIIZ);
            }
            this.LJ.setShader(bitmapShader);
            this.LJIILIIL = false;
        }
        Canvas canvas2 = canvas;
        if (this.LJIILLIIL) {
            if (this.LJIIZILJ > 0.0f) {
                canvas2.drawOval(this.LIZIZ, this.LJ);
                canvas2.drawOval(this.LJII, this.LJIIIIZZ);
                return;
            } else {
                canvas2.drawOval(this.LIZIZ, this.LJ);
                return;
            }
        }
        for (boolean z : this.LJIILL) {
            if (z) {
                float f = this.LJIILJJIL;
                if (this.LJIIZILJ > 0.0f) {
                    canvas2.drawRoundRect(this.LIZIZ, f, f, this.LJ);
                    canvas2.drawRoundRect(this.LJII, f, f, this.LJIIIIZZ);
                    LIZIZ(canvas2);
                    for (boolean z2 : this.LJIILL) {
                        if (z2) {
                            if (this.LJIILJJIL == 0.0f) {
                                return;
                            }
                            RectF rectF = this.LIZIZ;
                            float f2 = rectF.left;
                            float f3 = rectF.top;
                            float fWidth = rectF.width() + f2;
                            float fHeight = this.LIZIZ.height() + f3;
                            float f4 = this.LJIILJJIL;
                            float f5 = this.LJIIZILJ / 2.0f;
                            if (!this.LJIILL[0]) {
                                canvas2.drawLine(f2 - f5, f3, f2 + f4, f3, this.LJIIIIZZ);
                                canvas2.drawLine(f2, f3 - f5, f2, f3 + f4, this.LJIIIIZZ);
                            }
                            if (!this.LJIILL[1]) {
                                canvas2.drawLine((fWidth - f4) - f5, f3, fWidth, f3, this.LJIIIIZZ);
                                canvas2.drawLine(fWidth, f3 - f5, fWidth, f3 + f4, this.LJIIIIZZ);
                            }
                            if (!this.LJIILL[2]) {
                                canvas2.drawLine((fWidth - f4) - f5, fHeight, fWidth + f5, fHeight, this.LJIIIIZZ);
                                canvas2 = canvas2;
                                canvas2.drawLine(fWidth, fHeight - f4, fWidth, fHeight, this.LJIIIIZZ);
                            }
                            if (this.LJIILL[3]) {
                                return;
                            }
                            canvas2.drawLine(f2 - f5, fHeight, f2 + f4, fHeight, this.LJIIIIZZ);
                            canvas2.drawLine(f2, fHeight - f4, f2, fHeight, this.LJIIIIZZ);
                            return;
                        }
                    }
                    return;
                }
                canvas2.drawRoundRect(this.LIZIZ, f, f, this.LJ);
                LIZIZ(canvas2);
                return;
            }
        }
        canvas2.drawRect(this.LIZIZ, this.LJ);
        if (this.LJIIZILJ <= 0.0f) {
            return;
        }
        canvas2.drawRect(this.LJII, this.LJIIIIZZ);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.LIZ.set(rect);
        LIZJ();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int colorForState = this.LJIJ.getColorForState(iArr, 0);
        if (this.LJIIIIZZ.getColor() != colorForState) {
            this.LJIIIIZZ.setColor(colorForState);
            return true;
        }
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.LJ.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.LJ.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        this.LJ.setDither(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        this.LJ.setFilterBitmap(z);
        invalidateSelf();
    }
}
