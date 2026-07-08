package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;

/* JADX INFO: renamed from: X.0mRc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1396500mRc extends AbstractC1396720mRy<C1052760dVC> {
    public final Paint LLJILLL = new Paint(5);
    public final Paint LLJJ = new Paint(5);

    @Override // X.AbstractC1396720mRy
    public final int LJFF() {
        return 1001;
    }

    @Override // X.AbstractC1396720mRy
    public final void LJJII() {
        super.LJJII();
        this.LLJILLL.reset();
        this.LLJJ.reset();
    }

    @Override // X.AbstractC1396720mRy
    public final void LJIL(C1384750m8f c1384750m8f) {
        CharSequence charSequence;
        int length;
        float f;
        float f2;
        CharSequence charSequence2;
        C1052760dVC c1052760dVC = (C1052760dVC) this.LL;
        CharSequence charSequence3 = null;
        if (c1052760dVC != null) {
            charSequence = c1052760dVC.LJIIJJI;
        } else {
            charSequence = null;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.LLJILLL.setTextSize(c1384750m8f.LJ.LIZ);
            this.LLJILLL.setTypeface(c1384750m8f.LJ.LIZJ);
            Paint paint = this.LLJILLL;
            C1052760dVC c1052760dVC2 = (C1052760dVC) this.LL;
            if (c1052760dVC2 != null) {
                charSequence3 = c1052760dVC2.LJIIJJI;
            }
            if (c1052760dVC2 != null && (charSequence2 = c1052760dVC2.LJIIJJI) != null) {
                length = charSequence2.length();
            } else {
                length = 0;
            }
            this.LLILZIL = paint.measureText(charSequence3, 0, length);
            boolean z = c1384750m8f.LJ.LJFF;
            Paint paint2 = this.LLJILLL;
            if (z) {
                f = paint2.getFontMetrics().bottom;
                f2 = paint2.getFontMetrics().top;
            } else {
                f = paint2.getFontMetrics().bottom;
                f2 = paint2.getFontMetrics().ascent;
            }
            this.LLILZLL = f - f2;
            return;
        }
        this.LLILZIL = 0.0f;
        this.LLILZLL = 0.0f;
    }

    @Override // X.AbstractC1396720mRy
    public final void LJIJI(AbstractC1384320m7y abstractC1384320m7y, C1384750m8f c1384750m8f) {
        this.LLJILLL.setFlags(5);
        this.LLJJ.setFlags(5);
    }

    @Override // X.AbstractC1396720mRy
    public final void LJIJJ(Canvas canvas, C1384750m8f c1384750m8f) {
        CharSequence charSequence;
        int iIntValue;
        float f;
        Integer num;
        int iIntValue2;
        Integer num2;
        Paint paint = this.LLJILLL;
        C1052760dVC c1052760dVC = (C1052760dVC) this.LL;
        if (c1052760dVC != null && (charSequence = c1052760dVC.LJIIJJI) != null) {
            Float fValueOf = Float.valueOf(c1384750m8f.LJ.LIZLLL);
            if (fValueOf.floatValue() > 0) {
                float fFloatValue = fValueOf.floatValue();
                paint.setStyle(Paint.Style.STROKE);
                C1052760dVC c1052760dVC2 = (C1052760dVC) this.LL;
                if (c1052760dVC2 != null && (num2 = c1052760dVC2.LJIILIIL) != null) {
                    iIntValue2 = num2.intValue();
                } else {
                    iIntValue2 = c1384750m8f.LJ.LJ;
                }
                paint.setColor(iIntValue2);
                paint.setTypeface(c1384750m8f.LJ.LIZJ);
                paint.setTextSize(c1384750m8f.LJ.LIZ);
                paint.setStrokeWidth(fFloatValue);
                paint.setFlags(paint.getFlags() | 1 | 4);
                canvas.drawText(charSequence, 0, charSequence.length(), this.LLILLJJLI, this.LLILLL - paint.getFontMetrics().top, paint);
            }
            paint.setStyle(Paint.Style.FILL);
            C1052760dVC c1052760dVC3 = (C1052760dVC) this.LL;
            if (c1052760dVC3 != null && (num = c1052760dVC3.LJIIL) != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = c1384750m8f.LJ.LIZIZ;
            }
            paint.setColor(iIntValue);
            paint.setTypeface(c1384750m8f.LJ.LIZJ);
            paint.setTextSize(c1384750m8f.LJ.LIZ);
            paint.setFlags(paint.getFlags() | 1 | 4);
            paint.setStrokeWidth(0.0f);
            boolean z = c1384750m8f.LJ.LJFF;
            float f2 = this.LLILLL;
            if (z) {
                f = paint.getFontMetrics().top;
            } else {
                f = paint.getFontMetrics().ascent;
            }
            float f3 = f2 - f;
            if (this.LLILZIL != 0.0f && this.LLILZLL != 0.0f) {
                canvas.drawText(charSequence, 0, charSequence.length(), this.LLILLJJLI, f3, paint);
            }
        }
    }
}
