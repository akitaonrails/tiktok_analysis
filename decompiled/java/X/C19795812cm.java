package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.12cm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19795812cm {
    public static final AbstractC19875112pZ<String> LIZLLL = AbstractC19875112pZ.of("_syn", "_err", "_el");
    public String LIZ;
    public final long LIZIZ;
    public final Map<String, Object> LIZJ;

    public final /* synthetic */ Object clone() {
        return new C19795812cm(this.LIZIZ, this.LIZ, new HashMap(this.LIZJ));
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        long j = this.LIZIZ;
        return ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        return "Event{name='" + this.LIZ + "', timestamp=" + this.LIZIZ + ", params=" + String.valueOf(this.LIZJ) + "}";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19795812cm)) {
            return false;
        }
        C19795812cm c19795812cm = (C19795812cm) obj;
        if (this.LIZIZ != c19795812cm.LIZIZ || !this.LIZ.equals(c19795812cm.LIZ)) {
            return false;
        }
        return this.LIZJ.equals(c19795812cm.LIZJ);
    }

    public C19795812cm(long j, String str, Map map) {
        this.LIZ = str;
        this.LIZIZ = j;
        HashMap map2 = new HashMap();
        this.LIZJ = map2;
        if (map != null) {
            map2.putAll(map);
        }
    }

    public static Object LIZ(Object obj, String str, Object obj2) {
        if (LIZLLL.contains(str) && (obj2 instanceof Double)) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (str.startsWith("_")) {
            if (!(obj instanceof String) && obj != null) {
                return obj;
            }
            return obj2;
        }
        if (obj instanceof Double) {
            return obj2;
        }
        if (obj instanceof Long) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (obj instanceof String) {
            return obj2.toString();
        }
        return obj2;
    }
}
