package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0q8W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1538420q8W {
    public static final ConcurrentHashMap<String, AbstractC1538480q8c> LIZ = new ConcurrentHashMap<>();

    public static void LIZ(AbstractC1538480q8c abstractC1538480q8c) {
        ConcurrentHashMap<String, AbstractC1538480q8c> concurrentHashMap = LIZ;
        if (concurrentHashMap.get(abstractC1538480q8c.LIZ) != null) {
            C1489090oqx c1489090oqx = C1489090oqx.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("bid: ");
            sbLIZ.append(abstractC1538480q8c.LIZ);
            sbLIZ.append(" has been registered before");
            C2188811AlT.LIZIZ(sbLIZ);
            c1489090oqx.getClass();
        }
        concurrentHashMap.put(abstractC1538480q8c.LIZ, abstractC1538480q8c);
    }
}
