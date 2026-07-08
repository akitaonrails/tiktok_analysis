package X;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.07k4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1947807k4 implements InputFilter {
    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (TextUtils.isEmpty(a0.LJLIIIL(charSequence.toString()).toString()) && charSequence.length() > 0 && i3 == 0) {
            return "";
        }
        return null;
    }
}
