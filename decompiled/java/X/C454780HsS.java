package X;

import java.text.BreakIterator;

/* JADX INFO: renamed from: X.0HsS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C454780HsS {
    public static String LIZ(String str) {
        if (str == null) {
            return "";
        }
        if (str.length() <= 17) {
            return str;
        }
        C1360520lVa c1360520lVa = new C1360520lVa();
        if (str.length() > 17) {
            BreakIterator characterInstance = BreakIterator.getCharacterInstance();
            characterInstance.setText(str);
            int iFollowing = characterInstance.following(17);
            if (iFollowing == -1) {
                iFollowing = str.length();
            }
            int i = iFollowing - 1;
            if (Character.isHighSurrogate(str.charAt(i))) {
                iFollowing = i;
            }
            str = str.substring(0, iFollowing);
        }
        c1360520lVa.LIZ.append((CharSequence) str);
        c1360520lVa.LIZ.append((CharSequence) "...");
        return c1360520lVa.LIZ.toString();
    }
}
