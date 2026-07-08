package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0gL3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1161790gL3 {
    public static final ConcurrentHashMap<String, C1166240gSE> LIZ = new ConcurrentHashMap<>();

    public static C1166240gSE LIZ(String str) {
        ConcurrentHashMap<String, C1166240gSE> concurrentHashMap = LIZ;
        if (str == null) {
            str = "";
        }
        C1166240gSE c1166240gSE = concurrentHashMap.get(str);
        Pair[] pairArr = new Pair[2];
        boolean z = false;
        pairArr[0] = new Pair("tab_id", -10000);
        if (c1166240gSE != null) {
            z = true;
        }
        pairArr[1] = new Pair("data_init", Boolean.valueOf(z));
        C1161850gL9.LIZLLL(C2097608Jq.LJIIIIZZ(pairArr));
        return c1166240gSE;
    }
}
