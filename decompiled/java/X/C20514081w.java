package X;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.081w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20514081w {
    public static final Map<String, Long> LIZ = new ConcurrentHashMap();
    public static final Map<String, Long> LIZIZ = new ConcurrentHashMap();
    public static final List<String> LIZJ = new CopyOnWriteArrayList();

    public static String LIZ(String str, boolean z) {
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("_start");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append("_end");
        return C2188811AlT.LIZIZ(sbLIZ2);
    }
}
