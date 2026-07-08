package X;

import android.text.InputFilter;
import android.text.Spanned;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Xjg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C857020Xjg implements InputFilter {
    public static final C857020Xjg LL = new C857020Xjg();

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (a0.LJJIJ(charSequence, '\n')) {
            return new Regex("\n").replace(charSequence, "");
        }
        return null;
    }
}
