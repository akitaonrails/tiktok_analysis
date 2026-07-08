package X;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: X.0kNC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1316880kNC extends MetricAffectingSpan {
    public final float LL;

    public C1316880kNC(float f) {
        this.LL = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (!Float.isNaN(this.LL)) {
            textPaint.setLetterSpacing(this.LL / textPaint.getTextSize());
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        if (!Float.isNaN(this.LL)) {
            textPaint.setLetterSpacing(this.LL / textPaint.getTextSize());
        }
    }
}
