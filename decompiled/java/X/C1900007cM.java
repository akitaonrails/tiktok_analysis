package X;

import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.text.u;

/* JADX INFO: renamed from: X.07cM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1900007cM {
    public static final Map<Character, Character> LIZ = C2097608Jq.LJIIIIZZ(new Pair('\"', '\"'), new Pair('\\', '\\'), new Pair('/', '/'), new Pair('b', '\b'), new Pair('f', '\f'), new Pair('n', '\n'), new Pair('r', '\r'), new Pair('t', '\t'));
    public static final Set<Character> LIZIZ = C13LQ.LJLIIL(new Character[]{' ', ':', '\t', '\n', '\r'});

    public static String LIZ(String str) {
        int i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('\"');
        sbLIZ.append("data_type");
        sbLIZ.append('\"');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        for (int length = str.length() - strLIZIZ.length(); length >= 0; length--) {
            if (u.LJIJJLI(str, length, false, 0, strLIZIZ.length(), strLIZIZ)) {
                int length2 = length + strLIZIZ.length();
                while (length2 < str.length() && LIZIZ.contains(Character.valueOf(str.charAt(length2)))) {
                    length2++;
                }
                if (length2 < str.length() && str.charAt(length2) == '\"') {
                    int i2 = length2 + 1;
                    StringBuilder sb = new StringBuilder();
                    while (i2 < str.length()) {
                        char cCharAt = str.charAt(i2);
                        if (cCharAt != '\"') {
                            if (cCharAt == '\\' && (i = i2 + 1) < str.length()) {
                                char cCharAt2 = str.charAt(i);
                                Character ch = LIZ.get(Character.valueOf(cCharAt2));
                                if (ch != null) {
                                    cCharAt2 = ch.charValue();
                                }
                                sb.append(cCharAt2);
                                i2 += 2;
                            } else {
                                sb.append(cCharAt);
                                i2++;
                            }
                        } else {
                            return sb.toString();
                        }
                    }
                    return null;
                }
                return null;
            }
        }
        return null;
    }
}
