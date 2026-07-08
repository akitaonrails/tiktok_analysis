package X;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HcY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C444920HcY extends MetricAffectingSpan {
    public Typeface LL;
    public Float LLILLJJLI;

    public C444920HcY() {
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint == null) {
            return;
        }
        updateMeasureState(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = textPaint.getTypeface();
        Typeface typeface2 = this.LL;
        if (typeface2 != null && !Intrinsics.LJFF(typeface, typeface2)) {
            textPaint.setTypeface(this.LL);
        }
        float textSize = textPaint.getTextSize();
        Float f = this.LLILLJJLI;
        if (f != null && !Intrinsics.LIZ(textSize, f)) {
            textPaint.setTextSize(f.floatValue());
        }
    }

    public C444920HcY(int i, boolean z) {
        this();
        C444900HcW c444900HcWLIZJ = C1697600uHG.LIZJ(i, true, false);
        this.LL = c444900HcWLIZJ.LIZJ;
        if (!z) {
            this.LLILLJJLI = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(c444900HcWLIZJ.LIZ)));
        }
    }
}
