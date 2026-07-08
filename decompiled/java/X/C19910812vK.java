package X;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: X.12vK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19910812vK implements Map.Entry, Comparable {
    public final Comparable LL;
    public Object LLILLJJLI;
    public final /* synthetic */ C19910112vD LLILLL;

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.LL;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.LLILLJJLI;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.LL;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.LLILLJJLI;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.LL);
        String strValueOf2 = String.valueOf(this.LLILLJJLI);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strValueOf);
        sbLIZ.append("=");
        sbLIZ.append(strValueOf2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.LL.compareTo(((C19910812vK) obj).LL);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Comparable comparable = this.LL;
        Object key = entry.getKey();
        if (comparable != null ? comparable.equals(key) : key == null) {
            Object obj2 = this.LLILLJJLI;
            Object value = entry.getValue();
            if (obj2 == null) {
                if (value != null) {
                    return false;
                }
            } else if (obj2.equals(value)) {
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.LLILLL.LJII();
        Object obj2 = this.LLILLJJLI;
        this.LLILLJJLI = obj;
        return obj2;
    }

    public C19910812vK(C19910112vD c19910112vD, Comparable comparable, Object obj) {
        Objects.requireNonNull(c19910112vD);
        this.LLILLL = c19910112vD;
        this.LL = comparable;
        this.LLILLJJLI = obj;
    }
}
