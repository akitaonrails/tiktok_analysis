package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.TextPaint;
import java.util.List;

/* JADX INFO: renamed from: X.0Hcp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C445090Hcp extends C445080Hco {
    public final int LLILZIL;
    public final List<Integer> LLILZLL;
    public final int LLIZ;
    public final Typeface LLIZLLLIL;
    public final List<Typeface> LLJ;
    public final boolean LLJI;

    @Override // X.C445080Hco, android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
    }

    public final void LIZIZ(TextPaint textPaint) {
        Integer numValueOf;
        Typeface typeface;
        Number number;
        List<Integer> list = this.LLILZLL;
        if (list != null && (number = (Number) C13LP.LJJJLZIJ(this.LLILZIL - 1, list)) != null) {
            numValueOf = Integer.valueOf(C445120Hcs.LIZ(number));
        } else {
            switch (this.LLILZIL) {
                case 1:
                    numValueOf = Integer.valueOf(C445120Hcs.LIZ(20));
                    break;
                case 2:
                    numValueOf = Integer.valueOf(C445120Hcs.LIZ(19));
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    numValueOf = Integer.valueOf(C445120Hcs.LIZ(17));
                    break;
                default:
                    numValueOf = null;
                    break;
            }
        }
        List<Typeface> list2 = this.LLJ;
        if (list2 == null || (typeface = (Typeface) C13LP.LJJJLZIJ(this.LLILZIL - 1, list2)) == null) {
            typeface = this.LLIZLLLIL;
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            if (typeface == null) {
                textPaint.setFakeBoldText(true);
            } else {
                textPaint.setTypeface(typeface);
            }
            textPaint.setTextSize(iIntValue + C445120Hcs.LIZIZ(Integer.valueOf(this.LLIZ)));
        }
    }

    @Override // X.C445080Hco, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        LIZIZ(textPaint);
    }

    @Override // X.C445080Hco, android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        LIZIZ(textPaint);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C445090Hcp(C448860Hiu c448860Hiu, int i, List<Integer> list, int i2, Typeface typeface, List<? extends Typeface> list2, boolean z) {
        super(c448860Hiu, i);
        this.LLILZIL = i;
        this.LLILZLL = list;
        this.LLIZ = i2;
        this.LLIZLLLIL = typeface;
        this.LLJ = list2;
        this.LLJI = z;
    }
}
