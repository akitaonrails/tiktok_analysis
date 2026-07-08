package X;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0uDT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1695250uDT extends CharacterStyle implements UpdateAppearance {
    public final AbstractC1682800ttO LL;
    public final float LLILLJJLI;
    public final C05P0 LLILLL = C20028913Yh.LJI(new C1680770tq7(9205357640488583168L));
    public final C13YZ LLILZ = C20028913Yh.LJ(new AwS569S0100000_25(this, 838));

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        C418510Gb3.LIZ(textPaint, this.LLILLJJLI);
        textPaint.setShader((Shader) this.LLILZ.getValue());
    }

    public C1695250uDT(AbstractC1682800ttO abstractC1682800ttO, float f) {
        this.LL = abstractC1682800ttO;
        this.LLILLJJLI = f;
    }
}
