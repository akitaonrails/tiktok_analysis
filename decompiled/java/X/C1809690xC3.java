package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xC3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1809690xC3 extends ClickableSpan {
    public Function0<Unit> LL = null;
    public Function0<Unit> LLILLJJLI = null;

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Function0<Unit> function0 = this.LLILLJJLI;
        if (function0 != null) {
            function0.invoke();
        }
        Function0<Unit> function02 = this.LL;
        if (function02 != null) {
            function02.invoke();
        }
    }
}
