package X;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.bytedance.mt.protector.impl.collections.ListProtector;

/* JADX INFO: renamed from: X.0kN1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1316770kN1 extends MetricAffectingSpan {
    public int LL;
    public float LLILLJJLI;
    public int LLILLL;
    public C1316870kNB LLILZ;
    public float LLILZIL = 1.0E21f;

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        C1316870kNB c1316870kNB;
        Paint.FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
        if (this.LLILZIL != 1.0E21f && fontMetricsInt != null && (c1316870kNB = this.LLILZ) != null) {
            float fFloatValue = ((Float) ListProtector.get(c1316870kNB.LIZ, 1)).floatValue() - ((Float) ListProtector.get(this.LLILZ.LIZ, 0)).floatValue();
            int i = this.LL;
            if (i == 4) {
                this.LLILLL = -((int) ((((Math.ceil(this.LLILZIL) - ((double) fFloatValue)) / 2.0d) + ((double) fontMetricsInt.ascent)) - ((double) ((Float) ListProtector.get(this.LLILZ.LIZ, 0)).floatValue())));
            } else if (i == 7) {
                this.LLILLL = (int) (((Math.ceil(this.LLILZIL) - ((double) fFloatValue)) / 2.0d) + ((double) ((-fontMetricsInt.descent) + ((Float) ListProtector.get(this.LLILZ.LIZ, 1)).floatValue())));
            }
        }
        textPaint.baselineShift = this.LLILLL;
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        C1316870kNB c1316870kNB;
        Paint.FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
        if (fontMetricsInt != null && (c1316870kNB = this.LLILZ) != null) {
            int iLIZ = ((int) c1316870kNB.LIZ(this.LLILLJJLI, fontMetricsInt.ascent, fontMetricsInt.descent, this.LL)) - fontMetricsInt.ascent;
            this.LLILLL = iLIZ;
            textPaint.baselineShift = iLIZ;
        }
    }
}
