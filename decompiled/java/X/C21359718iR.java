package X;

import android.text.InputFilter;
import android.text.Spanned;

/* JADX INFO: renamed from: X.18iR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21359718iR implements InputFilter {
    public static final C21359718iR LL = new C21359718iR();

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        return spanned.subSequence(i3, i4);
    }
}
