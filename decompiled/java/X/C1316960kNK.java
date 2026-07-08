package X;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import java.util.Objects;

/* JADX INFO: renamed from: X.0kNK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1316960kNK extends MetricAffectingSpan {
    public final Typeface LL;

    public final int hashCode() {
        Typeface typeface = this.LL;
        if (typeface == null) {
            return 0;
        }
        return typeface.hashCode();
    }

    public C1316960kNK(Typeface typeface) {
        this.LL = typeface;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1316960kNK.class == obj.getClass()) {
            return Objects.equals(this.LL, ((C1316960kNK) obj).LL);
        }
        return false;
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
