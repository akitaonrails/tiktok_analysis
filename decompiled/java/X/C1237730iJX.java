package X;

import android.text.InputFilter;
import android.text.Spanned;

/* JADX INFO: renamed from: X.0iJX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1237730iJX implements InputFilter {
    public static final C1237730iJX LL = new C1237730iJX();

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (charSequence.length() == 0 && i4 > i3) {
            return spanned.subSequence(i3, i4);
        }
        return "";
    }
}
