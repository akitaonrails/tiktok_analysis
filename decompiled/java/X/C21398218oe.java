package X;

import android.text.Editable;
import android.text.NoCopySpan;
import android.text.SpannableStringBuilder;

/* JADX INFO: renamed from: X.18oe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21398218oe extends Editable.Factory {
    public final NoCopySpan[] LIZ;

    public C21398218oe(NoCopySpan... noCopySpanArr) {
        this.LIZ = noCopySpanArr;
    }

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(charSequence);
        for (NoCopySpan noCopySpan : this.LIZ) {
            C786410Ut5.q2(spannableStringBuilderValueOf, noCopySpan, 0, charSequence.length(), 18);
        }
        return spannableStringBuilderValueOf;
    }
}
