package X;

import android.text.InputFilter;
import android.text.Spanned;

/* JADX INFO: renamed from: X.0UUy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C773260UUy implements InputFilter {
    public static final C773260UUy LL = new C773260UUy();

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (i < i2) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt != '\n' && cCharAt != '\r') {
                sb.append(cCharAt);
            } else {
                z = true;
            }
            i++;
        }
        if (z) {
            return sb.toString();
        }
        return null;
    }
}
