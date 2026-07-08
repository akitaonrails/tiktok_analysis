package X;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Gwm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C431980Gwm extends CharacterStyle {
    public final int LIZ;
    public final int LIZIZ;
    public final Function1<View, Unit> LIZJ;
    public boolean LIZLLL;

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int i;
        if (this.LIZLLL) {
            i = this.LIZIZ;
        } else {
            i = this.LIZ;
        }
        textPaint.setColor(i);
        textPaint.setUnderlineText(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C431980Gwm(int i, int i2, Function1<? super View, Unit> function1) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = function1;
    }
}
