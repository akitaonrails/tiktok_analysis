package X;

import android.text.InputFilter;
import android.text.Spanned;
import android.view.View;

/* JADX INFO: renamed from: X.09M4, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09M4 implements InputFilter {
    public final View LL;

    public C09M4(View view) {
        this.LL = view;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int length = 6000 - (spanned.length() - (i4 - i3));
        if (length <= 0) {
            C1389890mGx c1389890mGx = new C1389890mGx(this.LL);
            C0I0B.LJFF.LIZJ();
            c1389890mGx.LJIIJ(C894660Z7w.LIZ().getResources().getString(2131835733));
            c1389890mGx.LJIIJJI();
            return "";
        }
        if (length >= i2 - i) {
            return null;
        }
        int i5 = length + i;
        int i6 = i5 - 1;
        if (Character.isHighSurrogate(charSequence.charAt(i6))) {
            if (i6 == i) {
                C1389890mGx c1389890mGx2 = new C1389890mGx(this.LL);
                C0I0B.LJFF.LIZJ();
                c1389890mGx2.LJIIJ(C894660Z7w.LIZ().getResources().getString(2131835733));
                c1389890mGx2.LJIIJJI();
                return "";
            }
            i5 = i6;
        }
        return charSequence.subSequence(i, i5);
    }
}
