package X;

import android.text.InputFilter;
import android.text.Spanned;
import androidx.fragment.app.Fragment;

/* JADX INFO: renamed from: X.09M6, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09M6 implements InputFilter {
    public final int LL;
    public final Fragment LLILLJJLI;

    public C09M6(int i, Fragment fragment) {
        this.LL = i;
        this.LLILLJJLI = fragment;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        Fragment fragment;
        if (charSequence == null || spanned == null) {
            return "";
        }
        int length = this.LL - (spanned.length() - (i4 - i3));
        if (charSequence.length() > length && (fragment = this.LLILLJJLI) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(fragment);
            c1389890mGx.LJIIIZ(2131828122);
            c1389890mGx.LJIIJJI();
        }
        if (length <= 0) {
            return "";
        }
        if (length >= i2 - i) {
            return null;
        }
        int i5 = length + i;
        int i6 = i5 - 1;
        if (Character.isHighSurrogate(charSequence.charAt(i6))) {
            if (i6 == i) {
                return "";
            }
            i5 = i6;
        }
        return charSequence.subSequence(i, i5);
    }
}
