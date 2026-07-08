package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import java.util.Map;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.18ew, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21338018ew extends ClickableSpan {
    public final AbstractC21333318eB<?> LL;
    public final InterfaceC1547330qMt LLILLJJLI;
    public final C21329618da LLILLL;
    public final C21330518dj LLILZ;
    public final InterfaceC1547330qMt LLILZIL;
    public final Map<String, Object> LLILZLL;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        InterfaceC1547330qMt interfaceC1547330qMt = this.LLILLJJLI;
        if (interfaceC1547330qMt != null) {
            AbstractC21333318eB<?> abstractC21333318eB = this.LL;
            C1337990kvF.LJFF(abstractC21333318eB, interfaceC1547330qMt, abstractC21333318eB.getView(), new AwS576S0100000_32(this, 869));
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }

    public C21338018ew(AbstractC21333318eB<?> abstractC21333318eB, InterfaceC1547330qMt interfaceC1547330qMt, C21329618da c21329618da, C21330518dj c21330518dj, InterfaceC1547330qMt interfaceC1547330qMt2, Map<String, ? extends Object> map) {
        this.LL = abstractC21333318eB;
        this.LLILLJJLI = interfaceC1547330qMt;
        this.LLILLL = c21329618da;
        this.LLILZ = c21330518dj;
        this.LLILZIL = interfaceC1547330qMt2;
        this.LLILZLL = map;
    }
}
