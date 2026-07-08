package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0kDS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1310840kDS extends C1310800kDO {
    public final long LJ;
    public final HashMap<String, C1310850kDT> LJFF;

    public C1310840kDS(HashMap<String, Object> map) {
        HashMap map2;
        super(map);
        this.LJ = C1310750kDJ.LIZJ(-1L, map).longValue();
        if (map.get("detail") != null) {
            map2 = (HashMap) map.get("detail");
        } else {
            map2 = new HashMap();
        }
        this.LJFF = new HashMap<>();
        for (Map.Entry entry : map2.entrySet()) {
            this.LJFF.put((String) entry.getKey(), new C1310850kDT((HashMap) entry.getValue()));
        }
    }
}
