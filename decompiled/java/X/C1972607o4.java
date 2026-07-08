package X;

import android.text.InputFilter;
import android.text.Spanned;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.07o4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1972607o4 implements InputFilter {
    public static final C1972607o4 LL = new C1972607o4();

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (a0.LJJIJ(charSequence, '\n')) {
            return u.LJJIFFI(charSequence.toString(), "\n", "", false);
        }
        return null;
    }
}
