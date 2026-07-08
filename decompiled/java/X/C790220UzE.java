package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0UzE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C790220UzE {
    public final ConcurrentHashMap<String, Object> LIZ = new ConcurrentHashMap<>();

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CacheInfo:");
        sbLIZ.append(getClass().getSimpleName());
        sbLIZ.append(" , dataMap:");
        sbLIZ.append(this.LIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZ(Object obj, String str) {
        if (obj != null) {
            this.LIZ.put(str, obj);
        }
    }
}
