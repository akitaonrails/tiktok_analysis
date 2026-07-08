package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Eg0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C370620Eg0 extends View {
    public final float LL;
    public float LLILLJJLI;
    public float LLILLL;
    public float LLILZ;
    public float LLILZIL;
    public float LLILZLL;
    public float LLIZ;
    public float LLIZLLLIL;
    public float LLJ;
    public float LLJI;
    public float LLJIJIL;
    public float LLJILJIL;
    public float LLJILJILJ;
    public final int[] LLJILLL;
    public final float[] LLJJ;
    public final double LLJJI;
    public final PorterDuffXfermode LLJJIII;
    public final Paint LLJJIJI;
    public final Paint LLJJIJIIJIL;
    public final Paint LLJJIJIL;
    public final Paint LLJJJ;
    public final Paint LLJJJIL;
    public final Paint LLJJJJ;
    public final PorterDuffXfermode LLJJJJJIL;
    public final Paint LLJJJJLIIL;
    public C419910GdJ LLJJL;
    public TuxIconDrawable LLJJLIIIJLLLLLLLZ;
    public final RectF LLJL;
    public final RectF LLJLIL;
    public final RectF LLJLILLLLZIIL;

    public final void LIZJ() {
        C419910GdJ c419910GdJ = this.LLJJL;
        if (c419910GdJ != null) {
            float f = this.LLJI;
            if (f > 0.0f) {
                int i = (int) f;
                if (i < 1) {
                    i = 1;
                }
                c419910GdJ.LIZIZ = i;
                c419910GdJ.LIZJ = i;
                this.LLJJLIIIJLLLLLLLZ = c419910GdJ.LIZ(getContext());
                return;
            }
        }
        this.LLJJLIIIJLLLLLLLZ = null;
    }

    public final float LIZIZ(float f) {
        return f * getResources().getDisplayMetrics().density;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z;
        float f;
        super.onDraw(canvas);
        if (this.LLILLJJLI <= 0.0f) {
            return;
        }
        float f2 = 0.0f;
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        if (getLayoutDirection() == 1) {
            z = true;
            f2 = this.LL;
        } else {
            z = false;
        }
        float f3 = this.LLILLJJLI;
        float f4 = (f3 / 2.0f) + f2;
        float f5 = f3 / 2.0f;
        float f6 = this.LLILLL / 2.0f;
        this.LLJL.set(f2 + f6, f6, (f2 + f3) - f6, f3 - f6);
        Paint paint = this.LLJJIJI;
        RectF rectF = this.LLJL;
        paint.setShader(LIZ(rectF.left, rectF.top, rectF.right, rectF.bottom));
        canvas.drawOval(this.LLJL, this.LLJJIJI);
        Paint paint2 = this.LLJJIJIIJIL;
        RectF rectF2 = this.LLJL;
        paint2.setShader(LIZ(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom));
        this.LLJJIJIIJIL.setStrokeWidth(this.LLILLL);
        this.LLJJIJIIJIL.setPathEffect(new DashPathEffect(new float[]{this.LLILZ, this.LLILZIL}, 0.0f));
        canvas.drawOval(this.LLJL, this.LLJJIJIIJIL);
        float f7 = this.LLILZLL / 2.0f;
        float f8 = this.LLIZ / 2.0f;
        float f9 = this.LLIZLLLIL;
        float f10 = f5 - f8;
        float f11 = this.LLJ;
        float f12 = f5 + f8;
        this.LLJJIJIL.setShader(LIZ((f4 - f9) - f7, f10 + f11, f9 + f4 + f7, f11 + f12));
        RectF rectF3 = this.LLJLILLLLZIIL;
        float f13 = f4 - this.LLIZLLLIL;
        float f14 = this.LLJ;
        rectF3.set(f13 - f7, f10 + f14, f13 + f7, f14 + f12);
        canvas.drawRoundRect(this.LLJLILLLLZIIL, f7, f7, this.LLJJIJIL);
        RectF rectF4 = this.LLJLILLLLZIIL;
        float f15 = f4 + this.LLIZLLLIL;
        float f16 = this.LLJ;
        rectF4.set(f15 - f7, f10 + f16, f15 + f7, f12 + f16);
        canvas.drawRoundRect(this.LLJLILLLLZIIL, f7, f7, this.LLJJIJIL);
        float f18 = this.LLJI / 2.0f;
        if (z) {
            f = f18;
        } else {
            f = (this.LLILLJJLI + this.LL) - f18;
        }
        float f19 = (this.LLILLJJLI + this.LL) - f18;
        this.LLJLIL.set(f - f18, f19 - f18, f + f18, f19 + f18);
        canvas.drawCircle(f, f19, this.LLJILJILJ + f18, this.LLJJJJ);
        TuxIconDrawable tuxIconDrawable = this.LLJJLIIIJLLLLLLLZ;
        if (tuxIconDrawable != null) {
            RectF rectF5 = this.LLJLIL;
            int iSaveLayer2 = canvas.saveLayer(rectF5.left, rectF5.top, rectF5.right, rectF5.bottom, null);
            RectF rectF6 = this.LLJLIL;
            canvas.translate(rectF6.left, rectF6.top);
            int i = (int) this.LLJI;
            tuxIconDrawable.setBounds(0, 0, i, i);
            tuxIconDrawable.draw(canvas);
            RectF rectF7 = this.LLJLIL;
            canvas.translate(-rectF7.left, -rectF7.top);
            Paint paint3 = this.LLJJJJLIIL;
            RectF rectF8 = this.LLJLIL;
            paint3.setShader(LIZ(rectF8.left, rectF8.top, rectF8.right, rectF8.bottom));
            this.LLJJJJLIIL.setXfermode(this.LLJJJJJIL);
            canvas.drawRect(this.LLJLIL, this.LLJJJJLIIL);
            this.LLJJJJLIIL.setXfermode(null);
            canvas.restoreToCount(iSaveLayer2);
        } else {
            Paint paint4 = this.LLJJJ;
            RectF rectF9 = this.LLJLIL;
            paint4.setShader(LIZ(rectF9.left, rectF9.top, rectF9.right, rectF9.bottom));
            canvas.drawCircle(f, f19, f18, this.LLJJJ);
            this.LLJJJIL.setXfermode(this.LLJJIII);
            float f20 = this.LLJIJIL / 2.0f;
            canvas.drawLine(f - f20, f19, f + f20, f19, this.LLJJJIL);
            canvas.drawLine(f, f19 - f20, f, f19 + f20, this.LLJJJIL);
            this.LLJJJIL.setXfermode(null);
        }
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        invalidate();
    }

    public final void setPlusIcon(C419910GdJ c419910GdJ) {
        C419910GdJ c419910GdJLIZJ;
        if (c419910GdJ != null) {
            c419910GdJLIZJ = c419910GdJ.LIZJ();
        } else {
            c419910GdJLIZJ = null;
        }
        this.LLJJL = c419910GdJLIZJ;
        LIZJ();
        invalidate();
    }

    public C370620Eg0(Context context, AttributeSet attributeSet) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        super(context, attributeSet, 0);
        setLayerType(1, null);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_circle_plus_fill;
        setPlusIcon(c419910GdJ);
        this.LL = LIZIZ(3.0f);
        int[] iArr = new int[4];
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.cq, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -6357048;
        }
        iArr[0] = iIntValue;
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.cc, context);
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        } else {
            iIntValue2 = -16715320;
        }
        iArr[1] = iIntValue2;
        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.ce, context);
        if (numLIZJ3 != null) {
            iIntValue3 = numLIZJ3.intValue();
        } else {
            iIntValue3 = -16716310;
        }
        iArr[2] = iIntValue3;
        Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.ce, context);
        iArr[3] = numLIZJ4 != null ? numLIZJ4.intValue() : -16716310;
        this.LLJILLL = iArr;
        this.LLJJ = new float[]{0.0f, 0.3296f, 0.6723f, 1.0f};
        this.LLJJI = 81.0d;
        PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.LLJJIII = porterDuffXfermode;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(15);
        this.LLJJIJI = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        this.LLJJIJIIJIL = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(Paint.Style.FILL);
        this.LLJJIJIL = paint3;
        Paint paint4 = new Paint(1);
        paint4.setStyle(Paint.Style.FILL);
        this.LLJJJ = paint4;
        Paint paint5 = new Paint(1);
        paint5.setStyle(Paint.Style.STROKE);
        paint5.setStrokeCap(Paint.Cap.ROUND);
        this.LLJJJIL = paint5;
        Paint paint6 = new Paint(1);
        paint6.setStyle(Paint.Style.FILL);
        paint6.setXfermode(porterDuffXfermode);
        this.LLJJJJ = paint6;
        this.LLJJJJJIL = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
        Paint paint7 = new Paint(1);
        paint7.setStyle(Paint.Style.FILL);
        this.LLJJJJLIIL = paint7;
        this.LLJL = new RectF();
        this.LLJLIL = new RectF();
        this.LLJLILLLLZIIL = new RectF();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iLIZIZ = (int) (LIZIZ(42.0f) + this.LL);
        setMeasuredDimension(View.resolveSize(iLIZIZ, i), View.resolveSize(iLIZIZ, i2));
    }

    public final Shader LIZ(float f, float f2, float f3, float f4) {
        double radians = Math.toRadians(this.LLJJI);
        float fSin = (float) Math.sin(radians);
        float fCos = (float) Math.cos(radians);
        float fAbs = (Math.abs((f3 - f) * fSin) + Math.abs((f4 - f2) * fCos)) / 2.0f;
        float f5 = (f + f3) / 2.0f;
        float f6 = (f2 + f4) / 2.0f;
        float f7 = fSin * fAbs;
        float f8 = (-fCos) * fAbs;
        return new LinearGradient(f5 - f7, f6 - f8, f5 + f7, f6 + f8, this.LLJILLL, this.LLJJ, Shader.TileMode.CLAMP);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float fMin = Math.min(i, i2) - this.LL;
        float fLIZIZ = 0.0f;
        if (fMin < 0.0f) {
            fMin = 0.0f;
        }
        this.LLILLJJLI = fMin;
        if (fMin > 0.0f) {
            fLIZIZ = fMin / LIZIZ(42.0f);
        }
        this.LLILLL = LIZIZ(1.0f) * fLIZIZ;
        this.LLILZ = LIZIZ(4.0f) * fLIZIZ;
        this.LLILZIL = LIZIZ(4.0f) * fLIZIZ;
        this.LLILZLL = LIZIZ(4.0f) * fLIZIZ;
        this.LLIZ = LIZIZ(8.0f) * fLIZIZ;
        this.LLIZLLLIL = LIZIZ(6.0f) * fLIZIZ;
        this.LLJ = LIZIZ(-3.0f) * fLIZIZ;
        this.LLJI = LIZIZ(16.5f) * fLIZIZ;
        this.LLJIJIL = LIZIZ(8.0f) * fLIZIZ;
        this.LLJILJIL = LIZIZ(1.8f) * fLIZIZ;
        this.LLJILJILJ = LIZIZ(2.75f) * fLIZIZ;
        this.LLJJJIL.setStrokeWidth(this.LLJILJIL);
        LIZJ();
    }
}
