package X;

import android.text.InputFilter;
import android.text.Spanned;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0lQR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1357330lQR implements InputFilter {
    public final /* synthetic */ C20584715gj LL;

    public C1357330lQR(C20584715gj c20584715gj) {
        this.LL = c20584715gj;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        String strLJJIFFI = u.LJJIFFI(charSequence.subSequence(i, i2).toString(), "\n", " ", false);
        if (Intrinsics.LJFF(charSequence.toString(), strLJJIFFI)) {
            return null;
        }
        this.LL.setNewLineReplaceHappened(true);
        return strLJJIFFI;
    }
}
