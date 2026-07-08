package X;

import android.text.InputFilter;
import android.text.Spanned;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0vWp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1745690vWp implements InputFilter {
    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (C2105908Mv.LIZ(a0.LJLIIIL(charSequence.toString()).toString()) && charSequence.length() > 0 && i3 == 0) {
            return "";
        }
        return null;
    }
}
