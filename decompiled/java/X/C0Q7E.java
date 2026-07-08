package X;

import Y.ARunnableS15S1100000_10;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Q7E, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q7E {
    public static final Map<String, C0Q7J> LIZ = new LinkedHashMap();

    public static void LIZ(String str) {
        C0Q7J c0q7j;
        if (str != null && (c0q7j = (C0Q7J) ((LinkedHashMap) LIZ).get(str)) != null) {
            if (c0q7j.LIZIZ > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                c0q7j.LIZLLL = jCurrentTimeMillis - c0q7j.LIZJ;
                c0q7j.LJFF = jCurrentTimeMillis - c0q7j.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("cost:");
                sbLIZ.append(c0q7j.LJFF);
                C2188811AlT.LIZIZ(sbLIZ);
            }
            C823050WQl.LIZLLL().execute(new ARunnableS15S1100000_10(c0q7j, str, 0));
        }
    }

    public static C0Q7J LIZIZ(String str) {
        if (str != null) {
            C0Q7J c0q7j = (C0Q7J) ((LinkedHashMap) LIZ).get(str);
            if (c0q7j == null) {
                return C0Q7P.LIZ;
            }
            return c0q7j;
        }
        return C0Q7P.LIZ;
    }
}
