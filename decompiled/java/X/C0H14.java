package X;

import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import com.larus.business.markdown.impl.markwon.core.spans.quoteblock.QuoteCustomTextSizeSpan;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0H14, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H14 extends C0H13 {
    public final float LLILLL;
    public final float LLILZ;
    public final boolean LLILZIL;

    public C0H14(float f, float f2, boolean z) {
        super(f, f2);
        this.LLILLL = f;
        this.LLILZ = f2;
        this.LLILZIL = z;
    }

    @Override // X.C0H13, android.text.style.LineHeightSpan.WithDensity
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt, TextPaint textPaint) {
        float f;
        boolean z;
        Object[] spans;
        Object[] spans2;
        if (textPaint == null || fontMetricsInt == null || charSequence == null) {
            return;
        }
        Paint.FontMetricsInt fontMetricsInt2 = textPaint.getFontMetricsInt();
        int i5 = fontMetricsInt2.descent - fontMetricsInt2.ascent;
        if (i5 <= 0) {
            return;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            ReplacementSpan[] replacementSpanArr = (ReplacementSpan[]) spanned.getSpans(i, i2, ReplacementSpan.class);
            if (replacementSpanArr != null) {
                ArrayList arrayList = new ArrayList();
                for (ReplacementSpan replacementSpan : replacementSpanArr) {
                    if (!(replacementSpan instanceof InterfaceC417190GXl)) {
                        arrayList.add(replacementSpan);
                    }
                }
                if (!arrayList.isEmpty()) {
                    return;
                }
            }
            InterfaceC434190H0v[] interfaceC434190H0vArr = (InterfaceC434190H0v[]) spanned.getSpans(i, i2, InterfaceC434190H0v.class);
            if (interfaceC434190H0vArr != null && interfaceC434190H0vArr.length != 0) {
                return;
            }
            C445090Hcp[] c445090HcpArr = (C445090Hcp[]) spanned.getSpans(i, i2, C445090Hcp.class);
            List listLJJLL = C13LQ.LJJLL(c445090HcpArr);
            if ((listLJJLL instanceof Collection) && listLJJLL.isEmpty()) {
                z = true;
                if (c445090HcpArr.length == 0) {
                }
                spans = spanned.getSpans(i, i2, C445020Hci.class);
                if (spans == null) {
                }
                spans2 = spanned.getSpans(i, i2, QuoteCustomTextSizeSpan.class);
                if (spans2 != null) {
                    return;
                }
            } else {
                Iterator it2 = listLJJLL.iterator();
                while (it2.hasNext()) {
                    if (!((C445090Hcp) it2.next()).LLJI) {
                        z = false;
                        break;
                    }
                }
                z = true;
                if (c445090HcpArr.length == 0 && !z) {
                    return;
                }
                spans = spanned.getSpans(i, i2, C445020Hci.class);
                if (spans == null && spans.length != 0) {
                    return;
                }
                spans2 = spanned.getSpans(i, i2, QuoteCustomTextSizeSpan.class);
                if (spans2 != null && spans2.length != 0) {
                    return;
                }
            }
        }
        if (C0H13.LIZ(charSequence.subSequence(i, i2)) && (!this.LLILZIL || charSequence.length() != i2 - 1)) {
            f = this.LLILLL;
        } else {
            f = this.LLILZ;
        }
        float textSize = ((textPaint.getTextSize() * f) - i5) / 2.0f;
        fontMetricsInt.top = C814420VxA.LIZIZ(fontMetricsInt2.top - textSize);
        fontMetricsInt.ascent = C814420VxA.LIZIZ(fontMetricsInt2.ascent - textSize);
        fontMetricsInt.descent = C814420VxA.LIZIZ(fontMetricsInt2.descent + textSize);
        fontMetricsInt.bottom = C814420VxA.LIZIZ(fontMetricsInt2.bottom + textSize);
    }
}
