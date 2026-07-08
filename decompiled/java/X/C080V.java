package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.080V, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C080V {
    public static final Map<String, Object> LIZ(List<C080U> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C080U c080u : list) {
            linkedHashMap.put(c080u.LIZ, c080u.LIZIZ);
        }
        return linkedHashMap;
    }
}
