package X;

import android.text.Editable;

/* JADX INFO: renamed from: X.0Zmk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C909880Zmk {
    public static final boolean LIZ(C1360570lVf c1360570lVf, boolean z) {
        String string;
        Editable editableL;
        if (c1360570lVf == null || (editableL = C2204961BRm.L(c1360570lVf, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPyhZojdkhUnVyqPNelQccyqhRnj7IjSxSe83Kw=", null))) == null || (string = editableL.toString()) == null) {
            string = "";
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            int length = string.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = string.charAt(i);
                if (cCharAt != 65532) {
                    sb.append(cCharAt);
                }
            }
            string = sb.toString();
        }
        if (string.length() == 0) {
            return true;
        }
        return false;
    }
}
