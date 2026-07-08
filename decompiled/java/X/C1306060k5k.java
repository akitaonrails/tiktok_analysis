package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0k5k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1306060k5k {
    public Object LIZ;
    public String LIZIZ;
    public Map<String, ? extends Object> LIZJ;
    public String LIZLLL;

    public final <T> T LIZ(String str) {
        Map map;
        T t;
        Object obj = this.LIZ;
        if (!(obj instanceof Map) || (map = (Map) obj) == null || (t = (T) map.get(str)) == null) {
            return null;
        }
        return t;
    }
}
