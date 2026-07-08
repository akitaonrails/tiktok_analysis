package X;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0XGo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C845960XGo {
    public final String LIZ;
    public final String LIZIZ;
    public final Map<String, String> LIZJ;
    public final List<C845840XGc> LIZLLL;

    public final String LIZ(String str) {
        Map<String, String> map = this.LIZJ;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public C845960XGo(String str, String str2, List list, Map map) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = map;
        this.LIZLLL = list;
    }
}
