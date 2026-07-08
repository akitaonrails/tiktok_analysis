package X;

import Y.AUListenerS176S0000000_6;
import android.animation.ObjectAnimator;
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
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GbC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C418600GbC extends LinearLayout {
    public static int LLJJIJIIJIL;
    public static int LLJJIJIL;
    public static int LLJJJ;
    public static float LLJJJIL;
    public static float LLJJJJ;
    public static float LLJJJJJIL;
    public static int LLJJJJLIIL;
    public static int LLJJL;
    public Paint LL;
    public final Path LLILLJJLI;
    public final Path LLILLL;
    public RectF LLILZ;
    public float LLILZIL;
    public float LLILZLL;
    public final Path LLIZ;
    public RectF LLIZLLLIL;
    public int LLJ;
    public Matrix LLJI;
    public Bitmap LLJIJIL;
    public Canvas LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public float LLJJ;
    public int LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;

    public float getBubbleOffset() {
        float fMax = Math.max(this.LLJJ, LLJJJJJIL);
        int i = this.LLJJI;
        if (i == 0) {
            return Math.min(fMax, this.LLILZIL - LLJJJJJIL);
        }
        if (i == 1) {
            return Math.min(fMax, this.LLILZLL - LLJJJJJIL);
        }
        if (i == 2) {
            return Math.min(fMax, this.LLILZLL - LLJJJJJIL);
        }
        if (i != 3) {
            return 0.0f;
        }
        return Math.min(fMax, this.LLILZIL - LLJJJJJIL);
    }

    public final void LIZ() {
        clearAnimation();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "alpha", getAlpha(), 1.0f);
        objectAnimatorOfFloat.setDuration(100L);
        C786410Ut5.Pd(objectAnimatorOfFloat);
        objectAnimatorOfFloat.addUpdateListener(new AUListenerS176S0000000_6(1));
    }

    public C418600GbC(Context context) {
        super(context, null, 0);
        this.LLILLJJLI = new Path();
        Path path = new Path();
        this.LLILLL = path;
        Path path2 = new Path();
        this.LLIZ = path2;
        this.LLJJ = 0.75f;
        this.LLJJI = 1;
        this.LLJJIII = true;
        int iLIZIZ = (int) LIZIZ(0.5f, context);
        this.LLJ = iLIZIZ;
        if (iLIZIZ < 2) {
            this.LLJ = 2;
        }
        LLJJIJIIJIL = (int) LIZIZ(7.0f, context);
        LLJJIJIL = (int) LIZIZ(10.0f, context);
        LLJJJ = (int) LIZIZ(6.0f, context);
        LLJJJIL = 2.0f;
        LLJJJJ = LIZIZ(6.0f, context);
        LLJJJJJIL = LLJJIJIIJIL + LLJJJ;
        LLJJJJLIIL = (int) LIZIZ(50.0f, context);
        LLJJL = (int) LIZIZ(46.0f, context);
        Paint paint = new Paint();
        this.LL = paint;
        paint.setStyle(Paint.Style.FILL);
        this.LL.setStrokeCap(Paint.Cap.BUTT);
        this.LL.setAntiAlias(true);
        this.LL.setStrokeWidth(LLJJJIL);
        this.LL.setStrokeJoin(Paint.Join.MITER);
        this.LLJILJILJ = C960203pA.LIZ(R.attr.oh, context);
        this.LLJILLL = ColorProtector.parseColor("#1DFFFFFF");
        this.LL.setColor(this.LLJILJILJ);
        setLayerType(1, this.LL);
        path.moveTo(0.0f, 0.0f);
        path.lineTo(LLJJIJIIJIL, -r0);
        float f = LLJJIJIIJIL;
        path.lineTo(f, f);
        path.close();
        path2.moveTo(0.0f, 0.0f);
        path2.lineTo((float) (((double) LLJJIJIIJIL) + (((double) this.LLJ) * Math.sqrt(2.0d))), (float) (((double) (-LLJJIJIIJIL)) - (((double) this.LLJ) * Math.sqrt(2.0d))));
        path2.lineTo((float) (((double) LLJJIJIIJIL) + (((double) this.LLJ) * Math.sqrt(2.0d))), (float) (((double) LLJJIJIIJIL) + (((double) this.LLJ) * Math.sqrt(2.0d))));
        path2.close();
        setBackgroundColor(0);
        setClipChildren(false);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.LLJIJIL == null) {
            this.LLJIJIL = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            this.LLJILJIL = new Canvas(this.LLJIJIL);
        }
        float fMin = this.LLILZIL;
        float fMin2 = this.LLILZLL;
        float fMax = Math.max(this.LLJJ, LLJJJJJIL);
        float fMin3 = Math.min(fMax, fMin2 - LLJJJJJIL);
        Matrix matrix = new Matrix();
        this.LLJI = new Matrix();
        int i = this.LLJJI;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        fMin2 = fMin3;
                    } else {
                        fMin = Math.min(fMax, fMin - LLJJJJJIL);
                        matrix.postRotate(270.0f);
                        this.LLJI.postRotate(270.0f);
                        Matrix matrix2 = this.LLJI;
                        int i2 = this.LLJ;
                        matrix2.postTranslate(((i2 * 3) / 2) + fMin, (i2 * 2) + fMin2);
                        setPadding(0, 0, 0, LLJJIJIIJIL);
                        setGravity(17);
                        this.LLILZ = new RectF(0.0f, 0.0f, this.LLILZIL, this.LLILZLL - LLJJIJIIJIL);
                    }
                } else {
                    fMin2 = Math.min(fMax, fMin2 - LLJJJJJIL);
                    matrix.postRotate(180.0f);
                    this.LLJI.postRotate(180.0f);
                    Matrix matrix3 = this.LLJI;
                    int i3 = this.LLJ;
                    matrix3.postTranslate((i3 * 2) + fMin, ((i3 * 3) / 2) + fMin2);
                    setPadding(0, 0, LLJJIJIIJIL, 0);
                    setGravity(17);
                    this.LLILZ = new RectF(0.0f, 0.0f, this.LLILZIL - LLJJIJIIJIL, this.LLILZLL);
                }
            } else {
                fMin2 = Math.min(fMax, fMin2 - LLJJJJJIL);
                setPadding(LLJJIJIIJIL, 0, 0, 0);
                setGravity(17);
                this.LLJI.postTranslate(this.LLJ + 0.0f, ((r0 * 3) / 2) + fMin2);
                this.LLILZ = new RectF(LLJJIJIIJIL, 0.0f, this.LLILZIL, this.LLILZLL);
            }
            fMin = 0.0f;
        } else {
            fMin = Math.min(fMax, fMin - LLJJJJJIL);
            matrix.postRotate(90.0f);
            this.LLJI.postRotate(90.0f);
            this.LLJI.postTranslate(((r2 * 3) / 2) + fMin, this.LLJ + 0.0f);
            setPadding(0, LLJJIJIIJIL, 0, 0);
            setGravity(17);
            this.LLILZ = new RectF(0.0f, LLJJIJIIJIL, this.LLILZIL, this.LLILZLL);
            fMin2 = 0.0f;
        }
        RectF rectF = this.LLILZ;
        float f = rectF.left;
        float f2 = (this.LLJ * 3) / 2;
        rectF.left = f + f2;
        rectF.top += f2;
        rectF.right += f2;
        rectF.bottom += f2;
        RectF rectF2 = new RectF();
        this.LLIZLLLIL = rectF2;
        RectF rectF3 = this.LLILZ;
        float f3 = rectF3.left;
        int i4 = this.LLJ;
        float f4 = i4 / 2;
        rectF2.left = f3 - f4;
        rectF2.top = rectF3.top - f4;
        rectF2.right = rectF3.right + f4;
        rectF2.bottom = rectF3.bottom + f4;
        float f5 = (i4 * 3) / 2;
        matrix.postTranslate(fMin + f5, fMin2 + f5);
        this.LL.setColor(this.LLJILLL);
        this.LL.setStyle(Paint.Style.STROKE);
        this.LL.setStrokeWidth(this.LLJ);
        if (this.LLJJIII) {
            this.LLILLJJLI.reset();
            Path path = this.LLILLJJLI;
            RectF rectF4 = this.LLIZLLLIL;
            float f6 = LLJJJJ;
            int i5 = this.LLJ;
            path.addRoundRect(rectF4, (i5 / 2) + f6, f6 + (i5 / 2), Path.Direction.CW);
            this.LLILLJJLI.addPath(this.LLIZ, this.LLJI);
            this.LLJILJIL.drawPath(this.LLILLJJLI, this.LL);
        }
        this.LL.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        this.LL.setColor(this.LLJILJILJ);
        this.LL.setStyle(Paint.Style.FILL);
        this.LLILLJJLI.reset();
        Path path2 = this.LLILLJJLI;
        RectF rectF5 = this.LLILZ;
        float f7 = LLJJJJ;
        path2.addRoundRect(rectF5, f7, f7, Path.Direction.CW);
        this.LLILLJJLI.addPath(this.LLILLL, matrix);
        this.LLJILJIL.drawPath(this.LLILLJJLI, this.LL);
        this.LL.setXfermode(null);
        canvas.drawBitmap(this.LLJIJIL, 0.0f, 0.0f, (Paint) null);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3 && this.LLJJIJI) {
                    LIZ();
                }
            } else if (this.LLJJIJI) {
                LIZ();
            }
        } else if (this.LLJJIJI) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.5f);
            objectAnimatorOfFloat.setDuration(100L);
            C786410Ut5.Pd(objectAnimatorOfFloat);
            objectAnimatorOfFloat.addUpdateListener(new AUListenerS176S0000000_6(1));
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBgColor(int i) {
        this.LLJILJILJ = i;
    }

    public void setBorderColor(int i) {
        this.LLJILLL = i;
    }

    public void setBubbleOrientation(int i) {
        this.LLJJI = i;
    }

    public void setNeedPath(boolean z) {
        this.LLJJIII = z;
    }

    public void setNeedPressFade(boolean z) {
        this.LLJJIJI = z;
    }

    public static float LIZIZ(float f, Context context) {
        return (f * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0084  */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            super.onMeasure(r9, r10)
            r1 = 0
            android.view.View r0 = r8.getChildAt(r1)
            boolean r0 = r0 instanceof android.widget.TextView
            if (r0 == 0) goto L9c
            android.view.View r3 = r8.getChildAt(r1)
            android.widget.TextView r3 = (android.widget.TextView) r3
        L12:
            int r5 = android.view.View.MeasureSpec.getMode(r9)
            int r6 = android.view.View.MeasureSpec.getSize(r9)
            int r4 = android.view.View.MeasureSpec.getMode(r10)
            int r7 = android.view.View.MeasureSpec.getSize(r10)
            if (r3 == 0) goto L97
            android.text.TextPaint r1 = r3.getPaint()
            java.lang.CharSequence r0 = r3.getText()
            java.lang.String r0 = r0.toString()
            float r0 = r1.measureText(r0)
            int r2 = (int) r0
            int r0 = r3.getPaddingLeft()
            int r2 = r2 + r0
            int r0 = r3.getPaddingRight()
            int r2 = r2 + r0
        L3f:
            int r1 = r8.LLJJI
            r0 = 2
            if (r1 == r0) goto L88
            r0 = 1
            if (r1 == r0) goto L88
            int r3 = X.C418600GbC.LLJJJJLIIL
            if (r2 <= r3) goto L50
            int r0 = X.C418600GbC.LLJJIJIL
            int r3 = r0 * 2
            int r3 = r3 + r2
        L50:
            int r2 = X.C418600GbC.LLJJL
        L52:
            int r1 = r8.LLJ
            int r0 = r1 * 3
            int r3 = r3 + r0
            int r0 = r1 * 3
            int r2 = r2 + r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 != r0) goto L7c
            if (r4 != r0) goto L84
            r8.setMeasuredDimension(r3, r2)
        L63:
            int r1 = r8.getMeasuredWidth()
            int r0 = r8.LLJ
            int r0 = r0 * 3
            int r1 = r1 - r0
            float r0 = (float) r1
            r8.LLILZIL = r0
            int r1 = r8.getMeasuredHeight()
            int r0 = r8.LLJ
            int r0 = r0 * 3
            int r1 = r1 - r0
            float r0 = (float) r1
            r8.LLILZLL = r0
            return
        L7c:
            if (r5 == r0) goto L84
            if (r4 != r0) goto L63
            r8.setMeasuredDimension(r6, r2)
            goto L63
        L84:
            r8.setMeasuredDimension(r3, r7)
            goto L63
        L88:
            int r3 = X.C418600GbC.LLJJJJLIIL
            if (r2 <= r3) goto L91
            int r0 = X.C418600GbC.LLJJIJIL
            int r3 = r0 * 2
            int r3 = r3 + r2
        L91:
            int r0 = X.C418600GbC.LLJJIJIIJIL
            int r3 = r3 + r0
            int r2 = X.C418600GbC.LLJJL
            goto L52
        L97:
            int r2 = r8.getMeasuredWidth()
            goto L3f
        L9c:
            r3 = 0
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C418600GbC.onMeasure(int, int):void");
    }
}
