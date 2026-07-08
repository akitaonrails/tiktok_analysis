package X;

import android.text.InputFilter;
import android.text.Spanned;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0F9J, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F9J implements InputFilter {
    public final InterfaceC384670F6j LL;

    public C0F9J(InterfaceC384670F6j interfaceC384670F6j) {
        this.LL = interfaceC384670F6j;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if ("\n".equals(charSequence) && i == 0 && i2 == 1) {
            this.LL.LIZ();
            return "";
        }
        if (charSequence != null && charSequence.length() != 0 && spanned != null && spanned.length() != 0) {
            Character ch = '\n';
            if (ch.equals(Character.valueOf(C13LN.LJLLL(charSequence))) && a0.LJJIJIL(spanned.subSequence(i3, i4).toString(), C13LN.LJLJLLL(charSequence))) {
                this.LL.LIZ();
                return C13LN.LJLJLLL(charSequence);
            }
            return null;
        }
        return null;
    }
}
