package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableString;
import android.text.style.LeadingMarginSpan;
import android.text.style.ReplacementSpan;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0H15, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H15 extends ReplacementSpan {
    public final CharSequence LL;
    public final int LLILLJJLI;
    public final List<Pair<Integer, Integer>> LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        SpannableString spannableString;
        if (fontMetricsInt != null) {
            int i3 = fontMetricsInt.ascent;
            int i4 = this.LLILZIL;
            int i5 = this.LLILZLL;
            fontMetricsInt.ascent = i3 - (i4 + i5);
            fontMetricsInt.top -= i4 + i5;
            fontMetricsInt.descent += i4 - i5;
            fontMetricsInt.bottom += i4 - i5;
        }
        float fMeasureText = this.LLILZ;
        for (Pair<Integer, Integer> pair : this.LLILLL) {
            fMeasureText += paint.measureText(this.LL, pair.getFirst().intValue(), pair.getSecond().intValue());
        }
        if ((charSequence instanceof SpannableString) && (spannableString = (SpannableString) charSequence) != null) {
            Object[] spans = spannableString.getSpans(i, i2, LeadingMarginSpan.class);
            ArrayList arrayList = new ArrayList();
            for (Object obj : spans) {
                if (!(obj instanceof C445060Hcm) && !(obj instanceof C445030Hcj) && !(obj instanceof C445020Hci) && !(obj instanceof C445010Hch)) {
                    arrayList.add(obj);
                }
            }
            Iterator it2 = arrayList.iterator();
            int leadingMargin = 0;
            while (it2.hasNext()) {
                leadingMargin += ((LeadingMarginSpan) it2.next()).getLeadingMargin(false);
            }
            fMeasureText += leadingMargin;
        }
        float f = this.LLILLJJLI - fMeasureText;
        if (f < 0.0f) {
            f = 0.0f;
        }
        return (int) f;
    }

    public C0H15(CharSequence charSequence, int i, List<Pair<Integer, Integer>> list, int i2, int i3, int i4) {
        this.LL = charSequence;
        this.LLILLJJLI = i;
        this.LLILLL = list;
        this.LLILZ = i2;
        this.LLILZIL = i3;
        this.LLILZLL = i4;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        canvas.drawText(charSequence, i, i2, f, i4, paint);
    }
}
