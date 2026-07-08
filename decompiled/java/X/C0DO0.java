package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: renamed from: X.0DO0, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DO0 extends ClickableSpan implements InterfaceC431020GvE {
    public final InterfaceC342000Daw LL;
    public final C1860910yWf LLILLJJLI;
    public final InterfaceC328580CuO LLILLL;

    @Override // X.InterfaceC431020GvE
    public final void LIZJ() {
    }

    @Override // X.InterfaceC431020GvE
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC431020GvE
    public final void LJ() {
    }

    @Override // X.InterfaceC431020GvE
    public final void LJFF(InterfaceC328600CuQ interfaceC328600CuQ) {
    }

    @Override // android.text.style.ClickableSpan, X.InterfaceC431020GvE
    public final void onClick(View view) {
        TextView textView;
        this.LLILLL.LIZ(this.LL, view, this.LLILLJJLI);
        if ((view instanceof TextView) && (textView = (TextView) view) != null) {
            textView.setHighlightColor(0);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }

    public C0DO0(InterfaceC342000Daw interfaceC342000Daw, C1860910yWf c1860910yWf, InterfaceC328580CuO interfaceC328580CuO) {
        this.LL = interfaceC342000Daw;
        this.LLILLJJLI = c1860910yWf;
        this.LLILLL = interfaceC328580CuO;
    }
}
