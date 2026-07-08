package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0WZt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C825470WZt {
    public final String LIZ;
    public final String LIZIZ;
    public final Map<String, Object> LIZJ;

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        Map<String, Object> map = this.LIZJ;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public C825470WZt(String str, String str2, Map<String, ? extends Object> map) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = map;
    }
}
