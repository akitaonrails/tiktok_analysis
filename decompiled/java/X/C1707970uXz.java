package X;

import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0uXz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1707970uXz {
    public static final Map<String, WeakReference<C1707840uXm>> LIZ = new LinkedHashMap();
    public static final Map<String, WeakReference<C1708220uYO>> LIZIZ = new LinkedHashMap();

    public static void LIZ(String str) {
        C1708720uZC c1708720uZCLIZ = C1708710uZB.LIZ("Cashier");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("endBindQuery ");
        sbLIZ.append(str);
        c1708720uZCLIZ.LIZ(4, C2188811AlT.LIZIZ(sbLIZ));
        LIZIZ.remove(str);
    }

    public static void LIZIZ(String str, C1708220uYO c1708220uYO) {
        C1708720uZC c1708720uZCLIZ = C1708710uZB.LIZ("Cashier");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("registerBindQuery ");
        sbLIZ.append(str);
        c1708720uZCLIZ.LIZ(4, C2188811AlT.LIZIZ(sbLIZ));
        LIZIZ.put(str, new WeakReference<>(c1708220uYO));
    }
}
