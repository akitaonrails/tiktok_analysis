package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;

/* JADX INFO: renamed from: X.0Gvk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC431340Gvk extends ClickableSpan {
    public boolean mIsPressed;
    public final int normalTextColor;
    public final int pressedTextColor;

    public final int getNormalTextColor() {
        return this.normalTextColor;
    }

    public final int getPressedTextColor() {
        return this.pressedTextColor;
    }

    public final void setPressed(boolean z) {
        this.mIsPressed = z;
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        int i;
        super.updateDrawState(textPaint);
        if (this.mIsPressed) {
            i = this.pressedTextColor;
        } else {
            i = this.normalTextColor;
        }
        textPaint.setColor(i);
        textPaint.setUnderlineText(false);
    }

    public AbstractC431340Gvk(int i, int i2) {
        this.normalTextColor = i;
        this.pressedTextColor = i2;
    }
}
