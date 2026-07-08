package X;

import android.text.style.ClickableSpan;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0ezS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1109960ezS extends C431500Gw0 {
    public InterfaceC1109980ezU LJIIIIZZ;

    @Override // X.C431500Gw0
    public final void LIZJ(ClickableSpan clickableSpan) {
        InterfaceC1109980ezU interfaceC1109980ezU = this.LJIIIIZZ;
        if (interfaceC1109980ezU != null) {
            interfaceC1109980ezU.onEventDown(clickableSpan);
        }
    }

    @Override // X.C431500Gw0
    public final void LIZIZ(ClickableSpan clickableSpan, TextView textView) {
        MESSAGE message;
        MESSAGE message2;
        this.LIZLLL = true;
        Object tag = null;
        if (clickableSpan instanceof C1110020ezY) {
            if (textView != null) {
                tag = textView.getTag(R.id.yuz);
            }
            if ((tag instanceof AbstractC1110800f0o) && (message2 = ((AbstractC1110800f0o) tag).LJIL) != 0) {
                C499230Jhx.LIZJ(message2);
                return;
            }
            return;
        }
        if (!(clickableSpan instanceof C1110050ezb)) {
            return;
        }
        if (textView != null) {
            tag = textView.getTag(R.id.yuz);
        }
        if (!(tag instanceof AbstractC1110800f0o) || (message = ((AbstractC1110800f0o) tag).LJIL) == 0) {
            return;
        }
        C499230Jhx.LIZIZ(message);
    }
}
