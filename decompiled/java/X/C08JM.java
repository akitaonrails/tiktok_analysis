package X;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.08JM, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08JM {
    public static final ConcurrentHashMap<String, C1020920cfq> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, C1020920cfq> LIZIZ = new ConcurrentHashMap<>();

    public static void LIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('|');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Iterator<String> it2 = LIZ.keySet().iterator();
        while (it2.hasNext()) {
            if (u.LJJIIJZLJL(it2.next(), strLIZIZ, false)) {
                it2.remove();
            }
        }
        Iterator<Map.Entry<String, C1020920cfq>> it3 = LIZIZ.entrySet().iterator();
        while (it3.hasNext()) {
            if (Intrinsics.LJFF(it3.next().getValue().LIZ, str)) {
                it3.remove();
            }
        }
    }

    public static C1020920cfq LIZIZ(String str, String str2, String str3) {
        if (str2 == null) {
            return null;
        }
        if (str3 != null && (!a0.LJJJIL(str3))) {
            ConcurrentHashMap<String, C1020920cfq> concurrentHashMap = LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('|');
            sbLIZ.append(str3);
            sbLIZ.append('|');
            sbLIZ.append(str2);
            C1020920cfq c1020920cfq = concurrentHashMap.get(C2188811AlT.LIZIZ(sbLIZ));
            if (c1020920cfq != null) {
                return c1020920cfq;
            }
            ConcurrentHashMap<String, C1020920cfq> concurrentHashMap2 = LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str3);
            sbLIZ2.append('|');
            sbLIZ2.append(str2);
            C1020920cfq c1020920cfq2 = concurrentHashMap2.get(C2188811AlT.LIZIZ(sbLIZ2));
            if (c1020920cfq2 != null) {
                return c1020920cfq2;
            }
        }
        ConcurrentHashMap<String, C1020920cfq> concurrentHashMap3 = LIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(str);
        sbLIZ3.append('|');
        sbLIZ3.append(str2);
        C1020920cfq c1020920cfq3 = concurrentHashMap3.get(C2188811AlT.LIZIZ(sbLIZ3));
        if (c1020920cfq3 == null) {
            return LIZIZ.get(str2);
        }
        return c1020920cfq3;
    }
}
