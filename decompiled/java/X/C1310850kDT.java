package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.0kDT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1310850kDT {
    public final long LIZ;
    public final HashMap<String, String> LIZIZ;

    public C1310850kDT(HashMap<String, Object> map) {
        HashMap<String, String> map2;
        C1310750kDJ.LIZLLL("category", map);
        this.LIZ = C1310750kDJ.LIZJ(-1L, map).longValue();
        if (map.get("detail") != null) {
            map2 = (HashMap) map.get("detail");
        } else {
            map2 = new HashMap<>();
        }
        this.LIZIZ = map2;
    }
}
