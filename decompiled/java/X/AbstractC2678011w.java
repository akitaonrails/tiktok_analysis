package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;

/* JADX INFO: renamed from: X.011w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2678011w extends ClickableSpan {
    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(0);
        textPaint.setUnderlineText(false);
    }
}
