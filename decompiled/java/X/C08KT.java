package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.08KT, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public class C08KT {
    public final ConcurrentHashMap<String, Object> LIZ = new ConcurrentHashMap<>();

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CacheInfo:");
        sbLIZ.append(C08KT.class.getSimpleName());
        sbLIZ.append(" , featureMap:");
        sbLIZ.append(this.LIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZ(Object obj, String str) {
        if (obj != null) {
            this.LIZ.put(str, obj);
        }
    }
}
