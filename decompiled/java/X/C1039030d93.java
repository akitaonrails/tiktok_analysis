package X;

import kotlin.text.u;

/* JADX INFO: renamed from: X.0d93, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1039030d93 {
    public static final C1039030d93 LIZ = new C1039030d93();

    public static final boolean LIZ(CharSequence charSequence) {
        String string;
        if (charSequence == null || (string = charSequence.toString()) == null) {
            string = "";
        }
        if (!u.LJJIIJZLJL(string, "http", false) && !u.LJJIIJZLJL(string, "https", false) && !u.LJJIIJZLJL(string, "about:", false)) {
            return false;
        }
        return true;
    }
}
