package X;

import android.text.InputFilter;
import android.text.Spanned;

/* JADX INFO: renamed from: X.0iSi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1243420iSi implements InputFilter {
    public static final C1243420iSi LL = new C1243420iSi();

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (i3 != 0 || charSequence.length() <= 0) {
            return null;
        }
        int i5 = i;
        while (i5 < i2 && Character.isWhitespace(charSequence.charAt(i5))) {
            i5++;
        }
        if (i5 <= i) {
            return null;
        }
        if (i5 < i2) {
            return charSequence.subSequence(i5, i2);
        }
        return "";
    }
}
