package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.07LT, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07LT {
    public static final Map<Integer, Integer> LIZ = C2097608Jq.LJIIJ(new Pair(0, 2), new Pair(1, 1), new Pair(4, 3), new Pair(5, 2));

    public static int LIZ(int i) {
        Integer num = (Integer) ((LinkedHashMap) LIZ).get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        return 10000;
    }
}
