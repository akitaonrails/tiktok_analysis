package X;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* JADX INFO: renamed from: X.0uGR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1697090uGR extends CharacterStyle implements UpdateAppearance {
    public final float LL;
    public final String LLILLJJLI;
    public final int[] LLILLL;
    public Shader LLILZ;

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint == null) {
            return;
        }
        Shader shader = this.LLILZ;
        if (shader != null) {
            textPaint.setShader(shader);
            textPaint.setTextScaleX(1.01f);
            return;
        }
        float fMeasureText = textPaint.measureText(this.LLILLJJLI);
        float f = this.LL;
        LinearGradient linearGradient = new LinearGradient(f, 0.0f, f + fMeasureText, 0.0f, this.LLILLL, (float[]) null, Shader.TileMode.CLAMP);
        textPaint.setShader(linearGradient);
        this.LLILZ = linearGradient;
        textPaint.setTextScaleX(1.01f);
    }

    public C1697090uGR(float f, String str, int[] iArr) {
        this.LL = f;
        this.LLILLJJLI = str;
        this.LLILLL = iArr;
    }
}
