package X;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GbA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C418580GbA extends LinearLayout {
    public static int LLJJJJLIIL;
    public static int LLJJL;
    public static float LLJJLIIIJLLLLLLLZ;
    public static float LLJL;
    public static float LLJLIL;
    public static int LLJLILLLLZIIL;
    public static int LLJLL;
    public float LL;
    public Paint LLILLJJLI;
    public Path LLILLL;
    public Path LLILZ;
    public RectF LLILZIL;
    public float LLILZLL;
    public float LLIZ;
    public Path LLIZLLLIL;
    public RectF LLJ;
    public int LLJI;
    public Matrix LLJIJIL;
    public Bitmap LLJILJIL;
    public Canvas LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public int LLJJI;
    public boolean LLJJIII;
    public float LLJJIJI;
    public int LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;

    public final float getBubbleOffset() {
        float f = this.LLJJIJI;
        float f2 = LLJLIL;
        if (f < f2) {
            f = f2;
        }
        int i = this.LLJJIJIIJIL;
        if (i == 0) {
            float f3 = this.LLILZLL - f2;
            return f > f3 ? f3 : f;
        }
        if (i == 1) {
            float f4 = this.LLIZ - f2;
            return f > f4 ? f4 : f;
        }
        if (i == 2) {
            float f5 = this.LLIZ - f2;
            return f > f5 ? f5 : f;
        }
        if (i != 3) {
            return 0.0f;
        }
        float f6 = this.LLILZLL - f2;
        return f > f6 ? f6 : f;
    }

    public final Path getMBorderBubbleArrowPath() {
        Path path = this.LLIZLLLIL;
        if (path != null) {
            return path;
        }
        return null;
    }

    public final Matrix getMBorderMatrix() {
        Matrix matrix = this.LLJIJIL;
        if (matrix != null) {
            return matrix;
        }
        return null;
    }

    public final RectF getMBorderRoundRect() {
        RectF rectF = this.LLJ;
        if (rectF != null) {
            return rectF;
        }
        return null;
    }

    public final Path getMBubbleArrowPath() {
        Path path = this.LLILZ;
        if (path != null) {
            return path;
        }
        return null;
    }

    public final Paint getMFillPaint() {
        Paint paint = this.LLILLJJLI;
        if (paint != null) {
            return paint;
        }
        return null;
    }

    public final Path getMPath() {
        Path path = this.LLILLL;
        if (path != null) {
            return path;
        }
        return null;
    }

    public final int getPADDING() {
        return LLJJJJLIIL / 2;
    }

    public final int getMBgColor() {
        return this.LLJILLL;
    }

    public final int getMBorderColor() {
        return this.LLJJ;
    }

    public final int getMBorderWidth() {
        return this.LLJI;
    }

    public final float getMHeight() {
        return this.LLIZ;
    }

    public final boolean getMNeedAddColor() {
        return this.LLJJJJ;
    }

    public final boolean getMNeedArrow() {
        return this.LLJJJIL;
    }

    public final boolean getMNeedPath() {
        return this.LLJJIJIL;
    }

    public final boolean getMNeedPressFade() {
        return this.LLJJJ;
    }

    public final boolean getMNeedShadow() {
        return this.LLJJIII;
    }

    public final float getMPadding() {
        return this.LL;
    }

    public final int getMShadowColor() {
        return this.LLJJI;
    }

    public final float getMWidth() {
        return this.LLILZLL;
    }

    public final boolean getUseDefaultView() {
        return this.LLJJJJJIL;
    }

    public C418580GbA(Context context) {
        super(context, null, 0);
        this.LL = 12.0f;
        this.LLJJI = -16777216;
        this.LLJJIJI = 0.75f;
        this.LLJJIJIIJIL = 1;
        this.LLJJIJIL = true;
        this.LLJJJIL = true;
        this.LLJJJJ = true;
        this.LLJJJJJIL = true;
        this.LLJI = (int) C11VU.LIZIZ(0.7f, context);
        LLJJJJLIIL = (int) C11VU.LIZIZ(7.0f, context);
        LLJJLIIIJLLLLLLLZ = 2.0f;
        LLJL = C11VU.LIZIZ(8.0f, context);
        LLJLIL = C11VU.LIZIZ(3.0f, context);
        LLJLILLLLZIIL = (int) C11VU.LIZIZ(50.0f, context);
        LLJLL = (int) C11VU.LIZIZ(56.0f, context);
        setMFillPaint(new Paint());
        setMPath(new Path());
        setMBorderBubbleArrowPath(new Path());
        setMBubbleArrowPath(new Path());
        getMFillPaint().setStyle(Paint.Style.FILL);
        getMFillPaint().setStrokeCap(Paint.Cap.BUTT);
        getMFillPaint().setAntiAlias(true);
        getMFillPaint().setStrokeWidth(LLJJLIIIJLLLLLLLZ);
        getMFillPaint().setStrokeJoin(Paint.Join.MITER);
        this.LLJILLL = getResources().getColor(R.color.a00);
        this.LLJJ = getResources().getColor(R.color.u2);
        getMFillPaint().setColor(this.LLJILLL);
        setLayerType(1, getMFillPaint());
        if (this.LLJJIII) {
            getMFillPaint().setShadowLayer(2.0f, 2.0f, 5.0f, this.LLJJI);
        }
        getMBubbleArrowPath().moveTo(0.0f, 0.0f);
        getMBubbleArrowPath().lineTo(LLJJJJLIIL, -r0);
        Path mBubbleArrowPath = getMBubbleArrowPath();
        float f = LLJJJJLIIL;
        mBubbleArrowPath.lineTo(f, f);
        getMBubbleArrowPath().close();
        getMBorderBubbleArrowPath().moveTo(0.0f, 0.0f);
        getMBorderBubbleArrowPath().lineTo((float) (((double) LLJJJJLIIL) + (((double) this.LLJI) * Math.sqrt(2.0d))), (float) (((double) (-LLJJJJLIIL)) - (((double) this.LLJI) * Math.sqrt(2.0d))));
        getMBorderBubbleArrowPath().lineTo((float) (((double) LLJJJJLIIL) + (((double) this.LLJI) * Math.sqrt(2.0d))), (float) (((double) LLJJJJLIIL) + (((double) this.LLJI) * Math.sqrt(2.0d))));
        getMBorderBubbleArrowPath().close();
        setBackgroundColor(0);
        setClipChildren(false);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        RectF rectF;
        RectF rectF2;
        RectF rectF3;
        Bitmap bitmapCreateBitmap = this.LLJILJIL;
        if (bitmapCreateBitmap == null) {
            bitmapCreateBitmap = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            this.LLJILJIL = bitmapCreateBitmap;
            this.LLJILJILJ = new Canvas(bitmapCreateBitmap);
        }
        float f = this.LLILZLL;
        float f2 = this.LLIZ;
        float fMax = Math.max(this.LLJJIJI, LLJLIL);
        Matrix matrix = new Matrix();
        setMBorderMatrix(new Matrix());
        int i = this.LLJJIJIIJIL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        float fMin = Math.min(fMax, f - LLJLIL);
                        matrix.postRotate(270.0f);
                        getMBorderMatrix().postRotate(270.0f);
                        Matrix mBorderMatrix = getMBorderMatrix();
                        int i2 = this.LLJI;
                        mBorderMatrix.postTranslate((((i2 * 3) / 2) + fMin) - ((LLJJJJLIIL * 3) / 2), (i2 * 2) + f2);
                        setPadding(0, 0, 0, LLJJJJLIIL);
                        setGravity(17);
                        this.LLILZIL = new RectF(0.0f, 0.0f, this.LLILZLL, this.LLIZ - LLJJJJLIIL);
                        float f3 = (this.LLJI * 3) / 2;
                        matrix.postTranslate((fMin + f3) - ((LLJJJJLIIL * 3) / 2), f2 + f3);
                    }
                } else {
                    float fMin2 = Math.min(fMax, f2 - LLJLIL);
                    matrix.postRotate(180.0f);
                    getMBorderMatrix().postRotate(180.0f);
                    Matrix mBorderMatrix2 = getMBorderMatrix();
                    float f4 = this.LLJI * 2;
                    mBorderMatrix2.postTranslate(f4 + f, (f4 + fMin2) - ((LLJJJJLIIL * 3) / 2));
                    setPadding(0, 0, LLJJJJLIIL, 0);
                    setGravity(17);
                    this.LLILZIL = new RectF(0.0f, 0.0f, this.LLILZLL - LLJJJJLIIL, this.LLIZ);
                    int i3 = this.LLJI;
                    matrix.postTranslate(f + ((i3 * 3) / 2), (fMin2 + (i3 * 2)) - ((LLJJJJLIIL * 3) / 2));
                }
            } else {
                float fMin3 = Math.min(fMax, f2 - LLJLIL);
                setPadding(LLJJJJLIIL, 0, 0, 0);
                setGravity(17);
                getMBorderMatrix().postTranslate(this.LLJI + 0.0f, ((r0 * 2) + fMin3) - ((LLJJJJLIIL * 3) / 2));
                this.LLILZIL = new RectF(LLJJJJLIIL, 0.0f, this.LLILZLL, this.LLIZ);
                int i4 = this.LLJI;
                matrix.postTranslate(((i4 * 3) / 2) + 0.0f, (fMin3 + (i4 * 2)) - ((LLJJJJLIIL * 3) / 2));
            }
        } else {
            float fMin4 = Math.min(fMax, f - LLJLIL);
            matrix.postRotate(90.0f);
            getMBorderMatrix().postRotate(90.0f);
            getMBorderMatrix().postTranslate((((r10 * 3) / 2) + fMin4) - ((LLJJJJLIIL * 3) / 2), this.LLJI + 0.0f);
            setPadding(0, LLJJJJLIIL, 0, 0);
            setGravity(17);
            this.LLILZIL = new RectF(0.0f, LLJJJJLIIL, this.LLILZLL, this.LLIZ);
            float f5 = (this.LLJI * 3) / 2;
            matrix.postTranslate((fMin4 + f5) - ((LLJJJJLIIL * 3) / 2), f5 + 0.0f);
        }
        RectF rectF4 = this.LLILZIL;
        if (rectF4 == null) {
            rectF = null;
        } else {
            rectF = rectF4;
        }
        float f6 = rectF.left;
        float f7 = (this.LLJI * 3) / 2;
        rectF.left = f6 + f7;
        if (rectF4 == null) {
            rectF2 = null;
        } else {
            rectF2 = rectF4;
        }
        rectF2.top += f7;
        if (rectF4 == null) {
            rectF3 = null;
        } else {
            rectF3 = rectF4;
        }
        rectF3.right += f7;
        if (rectF4 == null) {
            rectF4 = null;
        }
        rectF4.bottom += f7;
        setMBorderRoundRect(new RectF());
        RectF mBorderRoundRect = getMBorderRoundRect();
        RectF rectF5 = this.LLILZIL;
        if (rectF5 == null) {
            rectF5 = null;
        }
        mBorderRoundRect.left = rectF5.left - (this.LLJI / 2);
        RectF mBorderRoundRect2 = getMBorderRoundRect();
        RectF rectF6 = this.LLILZIL;
        if (rectF6 == null) {
            rectF6 = null;
        }
        mBorderRoundRect2.top = rectF6.top - (this.LLJI / 2);
        RectF mBorderRoundRect3 = getMBorderRoundRect();
        RectF rectF7 = this.LLILZIL;
        if (rectF7 == null) {
            rectF7 = null;
        }
        mBorderRoundRect3.right = rectF7.right + (this.LLJI / 2);
        RectF mBorderRoundRect4 = getMBorderRoundRect();
        RectF rectF8 = this.LLILZIL;
        if (rectF8 == null) {
            rectF8 = null;
        }
        mBorderRoundRect4.bottom = rectF8.bottom + (this.LLJI / 2);
        if (this.LLJJIII) {
            getMFillPaint().setShadowLayer(2.0f, 2.0f, 5.0f, this.LLJJI);
        }
        if (this.LLJJIJIL) {
            getMFillPaint().setColor(this.LLJJ);
            getMFillPaint().setStyle(Paint.Style.STROKE);
            getMFillPaint().setStrokeWidth(this.LLJI);
            getMPath().reset();
            Path mPath = getMPath();
            RectF mBorderRoundRect5 = getMBorderRoundRect();
            float f8 = LLJL;
            int i5 = this.LLJI;
            mPath.addRoundRect(mBorderRoundRect5, (i5 / 2) + f8, f8 + (i5 / 2), Path.Direction.CW);
            if (this.LLJJJIL) {
                getMPath().addPath(getMBorderBubbleArrowPath(), getMBorderMatrix());
            }
            Canvas canvas2 = this.LLJILJILJ;
            if (canvas2 == null) {
                canvas2 = null;
            }
            canvas2.drawPath(getMPath(), getMFillPaint());
            if (this.LLJJJJ) {
                getMFillPaint().setColor(getResources().getColor(R.color.x9));
                getMFillPaint().setStyle(Paint.Style.STROKE);
                getMPath().reset();
                if (this.LLJJJIL) {
                    getMPath().addPath(getMBorderBubbleArrowPath(), getMBorderMatrix());
                }
                Path mPath2 = getMPath();
                RectF mBorderRoundRect6 = getMBorderRoundRect();
                float f9 = LLJL;
                int i6 = this.LLJI;
                mPath2.addRoundRect(mBorderRoundRect6, (i6 / 2) + f9, f9 + (i6 / 2), Path.Direction.CW);
                Canvas canvas3 = this.LLJILJILJ;
                if (canvas3 == null) {
                    canvas3 = null;
                }
                canvas3.drawPath(getMPath(), getMFillPaint());
            }
        }
        getMFillPaint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        getMFillPaint().setColor(this.LLJILLL);
        getMFillPaint().setStyle(Paint.Style.FILL);
        getMPath().reset();
        Path mPath3 = getMPath();
        RectF rectF9 = this.LLILZIL;
        if (rectF9 == null) {
            rectF9 = null;
        }
        float f10 = LLJL;
        mPath3.addRoundRect(rectF9, f10, f10, Path.Direction.CW);
        if (this.LLJJJIL) {
            getMPath().addPath(getMBubbleArrowPath(), matrix);
        }
        Canvas canvas4 = this.LLJILJILJ;
        if (canvas4 == null) {
            canvas4 = null;
        }
        canvas4.drawPath(getMPath(), getMFillPaint());
        getMFillPaint().setXfermode(null);
        canvas.drawBitmap(bitmapCreateBitmap, LLJJJJLIIL - C11VU.LIZIZ(1.4f, getContext()), LLJJJJLIIL - C11VU.LIZIZ(1.3f, getContext()), (Paint) null);
    }

    public final void setBubbleOrientation(int i) {
        this.LLJJIJIIJIL = i;
    }

    public final void setMBgColor(int i) {
        this.LLJILLL = i;
    }

    public final void setMBorderBubbleArrowPath(Path path) {
        this.LLIZLLLIL = path;
    }

    public final void setMBorderColor(int i) {
        this.LLJJ = i;
    }

    public final void setMBorderMatrix(Matrix matrix) {
        this.LLJIJIL = matrix;
    }

    public final void setMBorderRoundRect(RectF rectF) {
        this.LLJ = rectF;
    }

    public final void setMBorderWidth(int i) {
        this.LLJI = i;
    }

    public final void setMBubbleArrowPath(Path path) {
        this.LLILZ = path;
    }

    public final void setMFillPaint(Paint paint) {
        this.LLILLJJLI = paint;
    }

    public final void setMHeight(float f) {
        this.LLIZ = f;
    }

    public final void setMNeedAddColor(boolean z) {
        this.LLJJJJ = z;
    }

    public final void setMNeedArrow(boolean z) {
        this.LLJJJIL = z;
    }

    public final void setMNeedPath(boolean z) {
        this.LLJJIJIL = z;
    }

    public final void setMNeedPressFade(boolean z) {
        this.LLJJJ = z;
    }

    public final void setMNeedShadow(boolean z) {
        this.LLJJIII = z;
    }

    public final void setMPadding(float f) {
        this.LL = f;
    }

    public final void setMPath(Path path) {
        this.LLILLL = path;
    }

    public final void setMShadowColor(int i) {
        this.LLJJI = i;
    }

    public final void setMWidth(float f) {
        this.LLILZLL = f;
    }

    public final void setNeedAddColor(boolean z) {
        this.LLJJJJ = z;
    }

    public final void setUseDefaultView(boolean z) {
        this.LLJJJJJIL = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b6  */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C418580GbA.onMeasure(int, int):void");
    }
}
