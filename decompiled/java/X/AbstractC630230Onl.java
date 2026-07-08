package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;

/* JADX INFO: renamed from: X.0Onl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC630230Onl extends ClickableSpan {
    public final boolean LL = false;

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(this.LL);
    }
}
