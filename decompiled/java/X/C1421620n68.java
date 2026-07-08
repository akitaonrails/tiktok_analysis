package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0n68, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1421620n68 {
    public static final /* synthetic */ int LIZ = 0;

    public static C1421350n5h LIZ(String str) {
        String strLIZIZ;
        List<String> listLJJJJIZL = a0.LJJJJIZL(a0.LJLILLLLZI(str).toString());
        if (listLJJJJIZL.isEmpty()) {
            return null;
        }
        MatchResult matchResultFind$default = Regex.find$default(new Regex("(?i)(.*?\\b)(pov)(?:([:\\uFF1A\\s\\u3000\\-_.])[\\s\\u3000]*(.*)|[\\s\\u3000]*$)"), (String) C13LP.LJJLIIIJJI(listLJJJJIZL), 0, 2, null);
        if (matchResultFind$default == null) {
            return null;
        }
        String str2 = (String) ListProtector.get(matchResultFind$default.LIZ(), 1);
        String str3 = (String) ListProtector.get(matchResultFind$default.LIZ(), 2);
        ListProtector.get(matchResultFind$default.LIZ(), 3);
        String str4 = (String) ListProtector.get(matchResultFind$default.LIZ(), 4);
        if (listLJJJJIZL.size() > 1) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C13LP.LJJLIIIJ(C13LP.LJJJJJ(1, listLJJJJIZL), "\n", null, null, 0, null, null, 62));
            sbLIZ.append('\n');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = "";
        }
        return new C1421350n5h(strLIZIZ, str2, str4, str3);
    }
}
