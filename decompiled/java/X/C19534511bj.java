package X;

import android.text.InputFilter;
import android.text.Spanned;

/* JADX INFO: renamed from: X.11bj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19534511bj extends InputFilter.LengthFilter {
    public C19534511bj(int i) {
        super(i);
    }

    @Override // android.text.InputFilter.LengthFilter, android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        spanned.length();
        return super.filter(charSequence, i, i2, spanned, i3, i4);
    }
}
