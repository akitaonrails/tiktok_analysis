package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.15RX, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15RX extends C15RW {
    public int LLJJJJJIL;
    public int LLJJJJLIIL;
    public int LLJJL;
    public Drawable LLJJLIIIJLLLLLLLZ;
    public Drawable LLJL;
    public int LLJLIL;
    public int LLJLILLLLZIIL;
    public int LLJLL;
    public float LLJLLIL;
    public int LLJLLL;
    public C1361400lX0 LLJZ;

    @Override // X.C15RW
    public final float LIZLLL(int i) {
        if (i == 0) {
            return 0.0f;
        }
        int i2 = this.LL;
        return ((((i - i2) * 1.0f) * this.LLJLILLLLZIIL) / (this.LLILLJJLI - i2)) + this.LLJLLIL;
    }

    @Override // X.C15RW
    public final void LJI(Context context) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        int iIntValue5;
        int iIntValue6;
        Integer numLIZJ;
        Integer numLIZJ2;
        Integer numLIZJ3;
        Integer numLIZJ4;
        Integer numLIZJ5;
        super.LJI(context);
        this.LLJJI.setIsLongpressEnabled(false);
        C1361400lX0 c1361400lX0 = new C1361400lX0(context, R.style.y0);
        this.LLJZ = c1361400lX0;
        C15RU c15ru = this.LLJI;
        Integer numLIZJ6 = C1308910kAL.LIZJ(R.attr.a09, c1361400lX0);
        if (numLIZJ6 != null) {
            iIntValue = numLIZJ6.intValue();
        } else {
            iIntValue = 0;
        }
        c15ru.LIZLLL(iIntValue);
        C15RU c15ru2 = this.LLJIJIL;
        C1361400lX0 c1361400lX02 = this.LLJZ;
        if (c1361400lX02 != null && (numLIZJ5 = C1308910kAL.LIZJ(R.attr.zi, c1361400lX02)) != null) {
            iIntValue2 = numLIZJ5.intValue();
        } else {
            iIntValue2 = 0;
        }
        c15ru2.LIZLLL(iIntValue2);
        C15RU c15ru3 = this.LLJ;
        C1361400lX0 c1361400lX03 = this.LLJZ;
        if (c1361400lX03 != null && (numLIZJ4 = C1308910kAL.LIZJ(R.attr.a09, c1361400lX03)) != null) {
            iIntValue3 = numLIZJ4.intValue();
        } else {
            iIntValue3 = 0;
        }
        c15ru3.LIZLLL(iIntValue3);
        C15RU c15ru4 = this.LLJILJIL;
        C1361400lX0 c1361400lX04 = this.LLJZ;
        if (c1361400lX04 != null && (numLIZJ3 = C1308910kAL.LIZJ(R.attr.zi, c1361400lX04)) != null) {
            iIntValue4 = numLIZJ3.intValue();
        } else {
            iIntValue4 = 0;
        }
        c15ru4.LIZLLL(C2441009hQ.LJIIL(iIntValue4, 10));
        Paint paint = this.LLILZIL;
        C1361400lX0 c1361400lX05 = this.LLJZ;
        if (c1361400lX05 != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.zj, c1361400lX05)) != null) {
            iIntValue5 = numLIZJ2.intValue();
        } else {
            iIntValue5 = 0;
        }
        paint.setColor(iIntValue5);
        this.LLJILLL = false;
        this.LLJJ = false;
        C1361400lX0 c1361400lX06 = this.LLJZ;
        if (c1361400lX06 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zi, c1361400lX06)) != null) {
            iIntValue6 = numLIZJ.intValue();
        } else {
            iIntValue6 = 0;
        }
        this.LLJJJJJIL = iIntValue6;
        this.LLJJJJLIIL = (int) C0JAI.LIZ(1.0f, context);
        int iLIZ = (int) C0JAI.LIZ(8.0f, context);
        this.LLJJL = iLIZ;
        int i = this.LLJJJJJIL;
        int i2 = this.LLJJJJLIIL;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setStroke(i2, i);
        gradientDrawable.setCornerRadius(iLIZ);
        this.LLJJLIIIJLLLLLLLZ = gradientDrawable;
        Drawable drawable = context.getDrawable(R.drawable.d5o);
        if (drawable == null) {
            return;
        }
        this.LLJL = drawable;
        this.LLJLIL = (int) C0JAI.LIZ(12.0f, context);
        this.LLJLLIL = C0JAI.LIZ(0.0f, context);
        int iLIZ2 = (int) C0JAI.LIZ(2.0f, getContext());
        this.LLJLLL = iLIZ2;
        C15RU c15ru5 = this.LLJ;
        c15ru5.LJ = iLIZ2;
        C15RU c15ru6 = this.LLJI;
        c15ru6.LJ = iLIZ2;
        C15RU c15ru7 = this.LLJIJIL;
        c15ru7.LJ = iLIZ2;
        C15RU c15ru8 = this.LLJILJIL;
        c15ru8.LJ = iLIZ2;
        c15ru5.LJIILIIL = false;
        c15ru6.LJIILIIL = false;
        c15ru7.LJIILIIL = false;
        c15ru8.LJIILIIL = false;
    }

    @Override // X.C15RW
    public final void LJIIIIZZ(AVMusicWaveBean aVMusicWaveBean) {
        super.LJIIIIZZ(aVMusicWaveBean);
        C15RU c15ru = this.LLJ;
        int i = this.LLJLLL;
        c15ru.LJ = i;
        this.LLJI.LJ = i;
        this.LLJIJIL.LJ = i;
        this.LLJILJIL.LJ = i;
    }

    public C15RX(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // X.C15RW
    public final AVMusicWaveBean LJ(int i, Context context) {
        Integer numLIZJ;
        Integer numLIZJ2;
        AVMusicWaveBean aVMusicWaveBean = new AVMusicWaveBean();
        int iLJI = C15R5.LJI.LJI(context);
        float[] fArr = {0.1f, 0.2f, 0.3f, 0.4f, 0.5f, 0.6f, 0.7f, 0.8f, 0.9f, 0.8f, 0.7f, 0.6f, 0.5f, 0.4f, 0.3f, 0.2f, 0.1f};
        float[] fArr2 = new float[iLJI];
        int iIntValue = 0;
        if (i > 0) {
            for (int i2 = 0; i2 < iLJI; i2++) {
                fArr2[i2] = (float) Math.random();
            }
            C15RU c15ru = this.LLJI;
            C1361400lX0 c1361400lX0 = this.LLJZ;
            if (c1361400lX0 != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.a09, c1361400lX0)) != null) {
                iIntValue = numLIZJ2.intValue();
            }
            c15ru.LIZLLL(iIntValue);
        } else {
            for (int i3 = 0; i3 < iLJI; i3++) {
                fArr2[i3] = fArr[i3 % 17];
            }
            C15RU c15ru2 = this.LLJI;
            C1361400lX0 c1361400lX02 = this.LLJZ;
            if (c1361400lX02 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zi, c1361400lX02)) != null) {
                iIntValue = numLIZJ.intValue();
            }
            c15ru2.LIZLLL(iIntValue);
        }
        aVMusicWaveBean.setMusicWavePointArray(fArr2);
        return aVMusicWaveBean;
    }

    @Override // X.C15RW
    public final void LJFF(Canvas canvas, boolean z) {
        float f;
        RectF rectF = this.LLILLL;
        float fLIZLLL = LIZLLL(this.LLJJIII);
        float fLIZLLL2 = LIZLLL(this.LLJJIJIIJIL);
        float fLIZLLL3 = LIZLLL(this.LLJJIJIL);
        if (fLIZLLL2 < fLIZLLL) {
            fLIZLLL2 = fLIZLLL;
        }
        int i = this.LLJJJJLIIL;
        rectF.left = i;
        rectF.right = fLIZLLL;
        rectF.top = i;
        rectF.bottom = this.LLJLL - i;
        if (fLIZLLL > this.LLJLLIL) {
            Path path = new Path();
            int i2 = this.LLJJL;
            path.addRoundRect(rectF, new float[]{i2, i2, 0.0f, 0.0f, 0.0f, 0.0f, i2, i2}, Path.Direction.CW);
            canvas.drawPath(path, this.LLILZIL);
        }
        float f2 = ((this.LL * (-1.0f)) / (this.LLILLJJLI - r3)) * this.LLJLILLLLZIIL;
        float f3 = this.LLJLLIL;
        float f4 = f2 + f3;
        rectF.left = f3;
        rectF.right = fLIZLLL;
        canvas.save();
        canvas.clipRect(rectF);
        if (z) {
            canvas.translate(f4, 0.0f);
            canvas.drawBitmap(this.LLILZLL, (Rect) null, rectF, (Paint) null);
        } else {
            this.LLJ.LIZJ(canvas);
        }
        canvas.restore();
        if (fLIZLLL2 > this.LLJLLIL) {
            fLIZLLL2 += 3;
        }
        rectF.left = fLIZLLL;
        if (fLIZLLL2 > fLIZLLL3) {
            f = fLIZLLL3;
        } else {
            f = fLIZLLL2;
        }
        rectF.right = f;
        canvas.save();
        canvas.clipRect(rectF);
        if (z) {
            canvas.translate(f4, 0.0f);
            canvas.drawBitmap(this.LLIZ, (Rect) null, rectF, (Paint) null);
        } else {
            this.LLJI.LIZJ(canvas);
        }
        canvas.restore();
        if (fLIZLLL2 > fLIZLLL3) {
            fLIZLLL2 = fLIZLLL3;
        }
        rectF.left = fLIZLLL2;
        rectF.right = fLIZLLL3;
        canvas.save();
        canvas.clipRect(rectF);
        if (z) {
            canvas.translate(f4, 0.0f);
            canvas.drawBitmap(this.LLIZLLLIL, (Rect) null, rectF, (Paint) null);
        } else {
            this.LLJIJIL.LIZJ(canvas);
        }
        canvas.restore();
        rectF.left = fLIZLLL3;
        rectF.right = this.LLJLILLLLZIIL + ((int) this.LLJLLIL);
        canvas.save();
        canvas.clipRect(rectF);
        if (z) {
            canvas.translate(f4, 0.0f);
            canvas.drawBitmap(this.LLIZLLLIL, (Rect) null, rectF, (Paint) null);
        } else {
            this.LLJILJIL.LIZJ(canvas);
        }
        canvas.restore();
        rectF.left = fLIZLLL3;
        float f5 = this.LLJLIL + fLIZLLL3;
        rectF.right = f5;
        rectF.top = 0.0f;
        float f6 = this.LLJLL;
        rectF.bottom = f6;
        Drawable drawable = this.LLJL;
        if (drawable != null) {
            drawable.setBounds((int) fLIZLLL3, 0, (int) f5, (int) f6);
        }
        Drawable drawable2 = this.LLJL;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        rectF.left = 0.0f;
        Drawable drawable3 = this.LLJJLIIIJLLLLLLLZ;
        if (drawable3 != null) {
            drawable3.setBounds(0, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        }
        Drawable drawable4 = this.LLJJLIIIJLLLLLLLZ;
        if (drawable4 != null) {
            drawable4.draw(canvas);
        }
    }

    @Override // X.C15RW, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LLJLILLLLZIIL = (View.MeasureSpec.getSize(i) - ((int) this.LLJLLIL)) - this.LLJLIL;
        int size = View.MeasureSpec.getSize(i2);
        this.LLJLL = size;
        this.LLJ.LJ(this.LLJLILLLLZIIL, size);
        this.LLJI.LJ(this.LLJLILLLLZIIL, this.LLJLL);
        this.LLJIJIL.LJ(this.LLJLILLLLZIIL, this.LLJLL);
        this.LLJILJIL.LJ(this.LLJLILLLLZIIL, this.LLJLL);
    }
}
