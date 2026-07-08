package X;

import java.util.regex.Matcher;

/* JADX INFO: renamed from: X.12wk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19919612wk {
    public final C19919512wj LIZ = new C19919512wj();

    public final boolean LIZ(CharSequence charSequence, C2218591BsP c2218591BsP) {
        String nationalNumberPattern = c2218591BsP.getNationalNumberPattern();
        if (nationalNumberPattern.length() == 0) {
            return false;
        }
        Matcher matcher = this.LIZ.LIZ(nationalNumberPattern).matcher(charSequence);
        if (!matcher.lookingAt()) {
            return false;
        }
        return matcher.matches();
    }
}
