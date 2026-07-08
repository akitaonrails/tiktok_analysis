package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.ss.android.ugc.aweme.model.TextExtraStruct;

/* JADX INFO: renamed from: X.0lRa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1358040lRa extends ClickableSpan {
    public final InterfaceC1358050lRb LL;
    public final int LLILLJJLI;
    public final TextExtraStruct LLILLL;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        InterfaceC1358050lRb interfaceC1358050lRb;
        if (!C0OBG.LIZIZ(view) && (interfaceC1358050lRb = this.LL) != null) {
            interfaceC1358050lRb.LIZ(this.LLILLL);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.LLILLJJLI);
        textPaint.setUnderlineText(false);
    }

    public C1358040lRa(InterfaceC1358050lRb interfaceC1358050lRb, int i, TextExtraStruct textExtraStruct) {
        this.LL = interfaceC1358050lRb;
        this.LLILLJJLI = i;
        this.LLILLL = textExtraStruct;
    }
}
