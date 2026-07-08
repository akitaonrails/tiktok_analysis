package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.12MM, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public abstract class C12MM extends ImageView {
    public final C12MU LL;
    public final Matrix LLILLJJLI;
    public Matrix LLILLL;
    public Matrix LLILZ;
    public final BPEAHandler LLILZIL;
    public RunnableC19381210s6 LLILZLL;
    public boolean LLIZ;
    public float LLIZLLLIL;
    public float LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public final Matrix LLJILJIL;
    public final float[] LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public final PointF LLJJI;
    public EnumC19380910s3 LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public final RectF LLJJIJIL;
    public final RectF LLJJJ;
    public final RectF LLJJJIL;

    public void LJII(float f) {
    }

    @Override // android.view.View
    public float getRotation() {
        return 0.0f;
    }

    public void setOnDrawableChangedListener(InterfaceC19381010s4 interfaceC19381010s4) {
    }

    public void setOnLayoutChangeListener(InterfaceC19381110s5 interfaceC19381110s5) {
    }

    public float getBaseScale() {
        return LJFF(this.LLILLJJLI);
    }

    public RectF getBitmapRect() {
        return LIZJ(this.LLILLL);
    }

    public Matrix getDisplayMatrix() {
        return new Matrix(this.LLILLL);
    }

    public Matrix getImageViewMatrix() {
        Matrix matrix = this.LLILLL;
        this.LLJILJIL.set(this.LLILLJJLI);
        this.LLJILJIL.postConcat(matrix);
        return this.LLJILJIL;
    }

    public float getMaxScale() {
        if (this.LLIZLLLIL == -1.0f) {
            this.LLIZLLLIL = getDrawable() == null ? 1.0f : Math.max(r1.getIntrinsicWidth() / this.LLJILLL, r1.getIntrinsicHeight() / this.LLJJ) * 8.0f;
        }
        return this.LLIZLLLIL;
    }

    public float getMinScale() {
        if (this.LLJ == -1.0f) {
            this.LLJ = getDrawable() != null ? Math.min(1.0f, 1.0f / LJFF(this.LLILLJJLI)) : 1.0f;
        }
        return this.LLJ;
    }

    public float getScale() {
        return LJFF(this.LLILLL);
    }

    public final void LIZIZ() {
        if (getDrawable() == null) {
            return;
        }
        RectF rectFLIZLLL = LIZLLL(this.LLILLL);
        float f = rectFLIZLLL.left;
        if (f == 0.0f && rectFLIZLLL.top == 0.0f) {
            return;
        }
        LJIIIZ(f, rectFLIZLLL.top);
    }

    public PointF getCenter() {
        return this.LLJJI;
    }

    public EnumC19380910s3 getDisplayType() {
        return this.LLJJIII;
    }

    public final RectF LIZJ(Matrix matrix) {
        if (getDrawable() == null) {
            return null;
        }
        this.LLJILJIL.set(this.LLILLJJLI);
        this.LLJILJIL.postConcat(matrix);
        Matrix matrix2 = this.LLJILJIL;
        this.LLJJIJIL.set(0.0f, 0.0f, r5.getIntrinsicWidth(), r5.getIntrinsicHeight());
        matrix2.mapRect(this.LLJJIJIL);
        return this.LLJJIJIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.RectF LIZLLL(android.graphics.Matrix r9) {
        /*
            r8 = this;
            android.graphics.drawable.Drawable r0 = r8.getDrawable()
            r4 = 0
            if (r0 != 0) goto Ld
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r4, r4, r4, r4)
            return r0
        Ld:
            android.graphics.RectF r0 = r8.LLJJJ
            r0.set(r4, r4, r4, r4)
            android.graphics.RectF r6 = r8.LIZJ(r9)
            float r1 = r6.height()
            float r7 = r6.width()
            int r0 = r8.LLJJ
            float r5 = (float) r0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            r3 = 1073741824(0x40000000, float:2.0)
            if (r0 >= 0) goto L50
            float r5 = r5 - r1
            float r5 = r5 / r3
            float r1 = r6.top
        L2b:
            float r5 = r5 - r1
        L2c:
            int r0 = r8.LLJILLL
            float r2 = (float) r0
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 >= 0) goto L40
            float r2 = r2 - r7
            float r2 = r2 / r3
            float r1 = r6.left
        L37:
            float r2 = r2 - r1
        L38:
            android.graphics.RectF r0 = r8.LLJJJ
            r0.set(r2, r5, r4, r4)
            android.graphics.RectF r0 = r8.LLJJJ
            return r0
        L40:
            float r1 = r6.left
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L48
            float r2 = -r1
            goto L38
        L48:
            float r1 = r6.right
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 < 0) goto L37
            r2 = 0
            goto L38
        L50:
            float r1 = r6.top
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L58
            float r5 = -r1
            goto L2c
        L58:
            float r1 = r6.bottom
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 < 0) goto L2b
            r5 = 0
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12MM.LIZLLL(android.graphics.Matrix):android.graphics.RectF");
    }

    public final float LJ(EnumC19380910s3 enumC19380910s3) {
        if (enumC19380910s3 == EnumC19380910s3.FIT_TO_SCREEN) {
            return 1.0f;
        }
        if (enumC19380910s3 == EnumC19380910s3.FIT_IF_BIGGER) {
            return Math.min(1.0f, 1.0f / LJFF(this.LLILLJJLI));
        }
        return 1.0f / LJFF(this.LLILLJJLI);
    }

    public final float LJFF(Matrix matrix) {
        matrix.getValues(this.LLJILJILJ);
        return this.LLJILJILJ[0];
    }

    public final void LJIIL(float f) {
        if (f > getMaxScale()) {
            f = getMaxScale();
        }
        if (f < getMinScale()) {
            f = getMinScale();
        }
        PointF center = getCenter();
        LJIILIIL(f, center.x, center.y);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public void setDisplayType(EnumC19380910s3 enumC19380910s3) {
        if (enumC19380910s3 != this.LLJJIII) {
            this.LLIZ = false;
            this.LLJJIII = enumC19380910s3;
            this.LLJJIJI = true;
            requestLayout();
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(final Bitmap bitmap) {
        if (bitmap != null) {
            LJIIJ(new Drawable(bitmap) { // from class: X.0GVr
                public final Bitmap LIZ;
                public final Paint LIZIZ;
                public final int LIZJ;
                public final int LIZLLL;

                @Override // android.graphics.drawable.Drawable
                public final int getOpacity() {
                    return -3;
                }

                @Override // android.graphics.drawable.Drawable
                public final int getIntrinsicHeight() {
                    return this.LIZLLL;
                }

                @Override // android.graphics.drawable.Drawable
                public final int getIntrinsicWidth() {
                    return this.LIZJ;
                }

                @Override // android.graphics.drawable.Drawable
                public final int getMinimumHeight() {
                    return this.LIZLLL;
                }

                @Override // android.graphics.drawable.Drawable
                public final int getMinimumWidth() {
                    return this.LIZJ;
                }

                {
                    this.LIZ = bitmap;
                    if (bitmap != null) {
                        this.LIZJ = bitmap.getWidth();
                        this.LIZLLL = bitmap.getHeight();
                    } else {
                        this.LIZJ = 0;
                        this.LIZLLL = 0;
                    }
                    Paint paint = new Paint();
                    this.LIZIZ = paint;
                    paint.setDither(true);
                    paint.setFilterBitmap(true);
                }

                @Override // android.graphics.drawable.Drawable
                public final void draw(Canvas canvas) {
                    Bitmap bitmap2 = this.LIZ;
                    if (bitmap2 != null && !bitmap2.isRecycled()) {
                        canvas.drawBitmap(this.LIZ, 0.0f, 0.0f, this.LIZIZ);
                    }
                }

                @Override // android.graphics.drawable.Drawable
                public final void setAlpha(int i) {
                    this.LIZIZ.setAlpha(i);
                }

                @Override // android.graphics.drawable.Drawable
                public final void setColorFilter(ColorFilter colorFilter) {
                    this.LIZIZ.setColorFilter(colorFilter);
                }
            }, null, -1.0f, -1.0f);
        } else {
            LJIIJ(null, null, -1.0f, -1.0f);
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        LJIIJ(drawable, null, -1.0f, -1.0f);
    }

    @Override // android.widget.ImageView
    public void setImageMatrix(Matrix matrix) {
        Matrix imageMatrix = getImageMatrix();
        if (matrix == null) {
            imageMatrix.isIdentity();
        } else {
            imageMatrix.equals(matrix);
        }
        super.setImageMatrix(matrix);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        setImageDrawable(getContext().getResources().getDrawable(i));
    }

    public void setMaxScale(float f) {
        this.LLIZLLLIL = f;
    }

    public void setMinScale(float f) {
        this.LLJ = f;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == ImageView.ScaleType.MATRIX) {
            super.setScaleType(scaleType);
        }
    }

    public C12MM(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void LJI(Context context, AttributeSet attributeSet) {
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public final void LJIIIIZZ(double d, double d2) {
        RectF bitmapRect = getBitmapRect();
        this.LLJJJIL.set((float) d, (float) d2, 0.0f, 0.0f);
        LJIIJJI(bitmapRect, this.LLJJJIL);
        RectF rectF = this.LLJJJIL;
        LJIIIZ(rectF.left, rectF.top);
        LIZIZ();
    }

    public final void LJIIIZ(float f, float f2) {
        if (f != 0.0f || f2 != 0.0f) {
            this.LLILLL.postTranslate(f, f2);
            setImageMatrix(getImageViewMatrix());
        }
    }

    public final void LJIIJJI(RectF rectF, RectF rectF2) {
        if (rectF == null) {
            return;
        }
        if (rectF.top >= 0.0f && rectF.bottom <= this.LLJJ) {
            rectF2.top = 0.0f;
        }
        if (rectF.left >= 0.0f && rectF.right <= this.LLJILLL) {
            rectF2.left = 0.0f;
        }
        if (rectF2.top + rectF.top >= 0.0f && rectF.bottom > this.LLJJ) {
            rectF2.top = (int) (0.0f - r2);
        }
        if (rectF2.top + rectF.bottom <= this.LLJJ && rectF.top < 0.0f) {
            rectF2.top = (int) (r1 - r4);
        }
        if (rectF2.left + rectF.left >= 0.0f) {
            rectF2.left = (int) (0.0f - r1);
        }
        if (rectF2.left + rectF.right <= this.LLJILLL) {
            rectF2.left = (int) (r1 - r3);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.12MU] */
    public C12MM(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.LL = new Object() { // from class: X.12MU
        };
        this.LLILLJJLI = new Matrix();
        this.LLILLL = new Matrix();
        this.LLILZIL = new BPEAHandler();
        this.LLILZLL = null;
        this.LLIZ = false;
        this.LLIZLLLIL = -1.0f;
        this.LLJ = -1.0f;
        this.LLJILJIL = new Matrix();
        this.LLJILJILJ = new float[9];
        this.LLJILLL = -1;
        this.LLJJ = -1;
        this.LLJJI = new PointF();
        this.LLJJIII = EnumC19380910s3.NONE;
        this.LLJJIJIL = new RectF();
        this.LLJJJ = new RectF();
        this.LLJJJIL = new RectF();
        LJI(context, attributeSet);
    }

    public final void LJIILIIL(float f, float f2, float f3) {
        if (f > getMaxScale()) {
            f = getMaxScale();
        }
        float scale = f / getScale();
        this.LLILLL.postScale(scale, scale, f2, f3);
        setImageMatrix(getImageViewMatrix());
        getScale();
        LIZIZ();
    }

    public void LIZ(Drawable drawable, Matrix matrix, float f, float f2) {
        if (drawable != null) {
            super.setImageDrawable(drawable);
        } else {
            this.LLILLJJLI.reset();
            super.setImageDrawable(null);
        }
        if (f != -1.0f && f2 != -1.0f) {
            float fMin = Math.min(f, f2);
            float fMax = Math.max(fMin, f2);
            this.LLJ = fMin;
            this.LLIZLLLIL = fMax;
            this.LLJIJIL = true;
            this.LLJI = true;
            EnumC19380910s3 enumC19380910s3 = this.LLJJIII;
            if (enumC19380910s3 == EnumC19380910s3.FIT_TO_SCREEN || enumC19380910s3 == EnumC19380910s3.FIT_IF_BIGGER) {
                if (fMin >= 1.0f) {
                    this.LLJIJIL = false;
                    this.LLJ = -1.0f;
                }
                if (fMax <= 1.0f) {
                    this.LLJI = true;
                    this.LLIZLLLIL = -1.0f;
                }
            }
        } else {
            this.LLJ = -1.0f;
            this.LLIZLLLIL = -1.0f;
            this.LLJIJIL = false;
            this.LLJI = false;
        }
        if (matrix != null) {
            this.LLILZ = new Matrix(matrix);
        }
        this.LLJJIJIIJIL = true;
        requestLayout();
    }

    public final void LJIIJ(Drawable drawable, Matrix matrix, float f, float f2) {
        if (getWidth() <= 0) {
            this.LLILZLL = new RunnableC19381210s6(this, drawable, matrix, f, f2);
        } else {
            LIZ(drawable, matrix, f, f2);
        }
    }

    public final void LJIILJJIL(float f, float f2, float f3, final float f4) {
        if (f > getMaxScale()) {
            f = getMaxScale();
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final float scale = getScale();
        final float f5 = f - scale;
        Matrix matrix = new Matrix(this.LLILLL);
        matrix.postScale(f, f, f2, f3);
        RectF rectFLIZLLL = LIZLLL(matrix);
        final float f6 = f2 + (rectFLIZLLL.left * f);
        final float f7 = f3 + (rectFLIZLLL.top * f);
        C786410Ut5.LJJZZIII(this.LLILZIL, new Runnable() { // from class: X.12MQ
            public final void LIZ() {
                double d;
                float fMin = Math.min(f4, System.currentTimeMillis() - jCurrentTimeMillis);
                C12MU c12mu = this.LLIZ.LL;
                double d2 = f5;
                double d3 = f4;
                c12mu.getClass();
                double d4 = ((double) fMin) / (d3 / 2.0d);
                double d5 = d2 / 2.0d;
                if (d4 < 1.0d) {
                    d = d5 * d4 * d4 * d4;
                } else {
                    double d6 = d4 - 2.0d;
                    d = d5 * ((d6 * d6 * d6) + 2.0d);
                }
                this.LLIZ.LJIILIIL(scale + ((float) (d + 0.0d)), f6, f7);
                if (fMin < f4) {
                    C786410Ut5.LJJZZIII(this.LLIZ.LLILZIL, this);
                    return;
                }
                C12MM c12mm = this.LLIZ;
                c12mm.LJII(c12mm.getScale());
                this.LLIZ.LIZIZ();
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    LIZ();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        });
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        float fLJ;
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            int i7 = this.LLJILLL;
            int i8 = this.LLJJ;
            int i9 = i3 - i;
            this.LLJILLL = i9;
            int i10 = i4 - i2;
            this.LLJJ = i10;
            i5 = i9 - i7;
            i6 = i10 - i8;
            PointF pointF = this.LLJJI;
            pointF.x = i9 / 2.0f;
            pointF.y = i10 / 2.0f;
        } else {
            i5 = 0;
            i6 = 0;
        }
        RunnableC19381210s6 runnableC19381210s6 = this.LLILZLL;
        if (runnableC19381210s6 != null) {
            this.LLILZLL = null;
            runnableC19381210s6.run();
        }
        Drawable drawable = getDrawable();
        if (drawable != null) {
            if (z || this.LLJJIJI || this.LLJJIJIIJIL) {
                LJ(this.LLJJIII);
                float fLJFF = LJFF(this.LLILLJJLI);
                float scale = getScale();
                float fMin = Math.min(1.0f, 1.0f / fLJFF);
                Matrix matrix = this.LLILLJJLI;
                float f = this.LLJILLL;
                float f2 = this.LLJJ;
                float intrinsicWidth = drawable.getIntrinsicWidth();
                float intrinsicHeight = drawable.getIntrinsicHeight();
                matrix.reset();
                if (intrinsicWidth <= f && intrinsicHeight <= f2) {
                    float fMin2 = Math.min(f / intrinsicWidth, f2 / intrinsicHeight);
                    matrix.postScale(fMin2, fMin2);
                    matrix.postTranslate((f - (intrinsicWidth * fMin2)) / 2.0f, (f2 - (intrinsicHeight * fMin2)) / 2.0f);
                } else {
                    float fMin3 = Math.min(f / intrinsicWidth, f2 / intrinsicHeight);
                    matrix.postScale(fMin3, fMin3);
                    matrix.postTranslate((f - (intrinsicWidth * fMin3)) / 2.0f, (f2 - (intrinsicHeight * fMin3)) / 2.0f);
                }
                float fLJFF2 = LJFF(this.LLILLJJLI);
                if (!this.LLJJIJIIJIL && !this.LLJJIJI) {
                    if (z) {
                        if (!this.LLJIJIL) {
                            this.LLJ = -1.0f;
                        }
                        if (!this.LLJI) {
                            this.LLIZLLLIL = -1.0f;
                        }
                        setImageMatrix(getImageViewMatrix());
                        LJIIIZ(-i5, -i6);
                        if (!this.LLIZ) {
                            fLJ = LJ(this.LLJJIII);
                            LJIIL(fLJ);
                        } else {
                            if (Math.abs(scale - fMin) > 0.001d) {
                                fLJ = (fLJFF / fLJFF2) * scale;
                            } else {
                                fLJ = 1.0f;
                            }
                            LJIIL(fLJ);
                        }
                    } else {
                        fLJ = 1.0f;
                    }
                } else {
                    Matrix matrix2 = this.LLILZ;
                    if (matrix2 != null) {
                        this.LLILLL.set(matrix2);
                        this.LLILZ = null;
                        fLJ = getScale();
                    } else {
                        this.LLILLL.reset();
                        fLJ = LJ(this.LLJJIII);
                    }
                    setImageMatrix(getImageViewMatrix());
                    if (fLJ != getScale()) {
                        LJIIL(fLJ);
                    }
                }
                this.LLIZ = false;
                if (fLJ > getMaxScale() || fLJ < getMinScale()) {
                    LJIIL(fLJ);
                }
                LIZIZ();
                boolean z2 = this.LLJJIJIIJIL;
                if (this.LLJJIJI) {
                    this.LLJJIJI = false;
                }
                if (z2) {
                    this.LLJJIJIIJIL = false;
                    return;
                }
                return;
            }
            return;
        }
        if (this.LLJJIJIIJIL) {
            this.LLJJIJIIJIL = false;
        }
        if (!this.LLJJIJI) {
            return;
        }
        this.LLJJIJI = false;
    }
}
