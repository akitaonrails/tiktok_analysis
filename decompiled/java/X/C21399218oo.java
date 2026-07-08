package X;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18oo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21399218oo extends CharacterStyle {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21399218oo)) {
            return false;
        }
        C21399218oo c21399218oo = (C21399218oo) obj;
        return Intrinsics.LJFF(this.LIZ, c21399218oo.LIZ) && Intrinsics.LJFF(this.LIZIZ, c21399218oo.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LynxMentionSpan(name=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", symbol=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
    }

    public final Spannable LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(this.LIZ);
        return new SpannableString(C2188811AlT.LIZIZ(sbLIZ));
    }

    public C21399218oo(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }

    public static Spannable LIZIZ(CharSequence charSequence, Object... objArr) {
        SpannableString spannableStringValueOf = SpannableString.valueOf(charSequence);
        for (Object obj : objArr) {
            C786410Ut5.p2(spannableStringValueOf, obj, 0, spannableStringValueOf.length(), 33);
        }
        return spannableStringValueOf;
    }
}
