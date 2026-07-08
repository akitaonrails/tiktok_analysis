package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.00mL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C178300mL {
    public static final ConcurrentHashMap<Integer, String> LIZ = new ConcurrentHashMap<>();

    static {
        new ConcurrentHashMap();
    }

    public static void LIZ(Object obj, String str) {
        if (obj != null) {
            LIZ.put(Integer.valueOf(obj.hashCode()), str);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("-----bindPopup()： ");
            sbLIZ.append(obj);
            sbLIZ.append(' ');
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }
}
