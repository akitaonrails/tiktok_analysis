package X;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: X.0HcZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C444930HcZ extends MetricAffectingSpan {
    public final Typeface LL;

    public C444930HcZ(Typeface typeface) {
        this.LL = typeface;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Typeface typeface = this.LL;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.LL;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
    }
}
