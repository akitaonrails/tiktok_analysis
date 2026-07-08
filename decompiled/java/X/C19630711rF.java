package X;

import java.lang.Character;
import java.util.List;

/* JADX INFO: renamed from: X.11rF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19630711rF {
    public static final boolean LIZ(String str) {
        List listLJIIJJI = C1697810uHb.LJIIJJI(Character.UnicodeBlock.ARABIC, Character.UnicodeBlock.HEBREW, Character.UnicodeBlock.THAANA, Character.UnicodeBlock.SYRIAC, Character.UnicodeBlock.MANDAIC, Character.UnicodeBlock.SAMARITAN, Character.UnicodeBlock.NKO);
        for (int i = 0; i < str.length(); i++) {
            Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(str.charAt(i));
            if (unicodeBlockOf != null && listLJIIJJI.contains(unicodeBlockOf)) {
                return true;
            }
        }
        return false;
    }
}
