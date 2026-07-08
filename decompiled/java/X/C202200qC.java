package X;

import kotlin.Pair;
import kotlin.text.Regex;
import kotlin.text.u;

/* JADX INFO: renamed from: X.00qC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C202200qC {
    public static final Regex LIZ = new Regex("%(?:(\\d+)\\$([sdfSDF])|([sdfSDF])(?![a-zA-Z]))");

    public static final String LIZ(String str, Pair<String, ? extends Object>... pairArr) {
        String string;
        if (pairArr.length == 0) {
            return str;
        }
        for (Pair<String, ? extends Object> pair : pairArr) {
            String first = pair.getFirst();
            Object second = pair.getSecond();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('{');
            sbLIZ.append(first);
            sbLIZ.append('}');
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (second == null || (string = second.toString()) == null) {
                string = "";
            }
            str = u.LJJIFFI(str, strLIZIZ, string, false);
        }
        Regex regex = LIZ;
        if (regex.containsMatchIn(str)) {
            return regex.replace(str, new C020W(new C118300cf(), (C118300cf) pairArr, (Pair<String, ? extends Object>[]) 86));
        }
        return str;
    }
}
