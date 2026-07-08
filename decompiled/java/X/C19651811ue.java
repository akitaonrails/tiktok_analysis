package X;

import kotlin.text.a0;

/* JADX INFO: renamed from: X.11ue, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19651811ue {
    public static final boolean LIZ(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return false;
        }
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt != 0 && cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && (' ' > cCharAt || (cCharAt >= 55296 && (57344 > cCharAt || (cCharAt >= 65534 && (0 > cCharAt || cCharAt >= 0)))))) {
                return true;
            }
        }
        return false;
    }

    public static final String LIZIZ(String str) {
        String string;
        String string2;
        if (str == null || (string = a0.LJLJJL(str).toString()) == null || (string2 = a0.LJLILLLLZI(string).toString()) == null) {
            return "";
        }
        return string2;
    }
}
