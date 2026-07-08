package X;

import java.util.List;

/* JADX INFO: renamed from: X.0VpP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C809610VpP {
    public final List<String> LIZ;
    public final List<String> LIZIZ;

    public C809610VpP() {
        throw null;
    }

    public final int hashCode() {
        List<String> list = this.LIZ;
        int iHashCode = (list != null ? list.hashCode() : 0) * 31;
        List<String> list2 = this.LIZIZ;
        return (iHashCode + (list2 != null ? list2.hashCode() : 0)) * 31 * 31;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IntentFilter{actions=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", categories=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", data=");
        sbLIZ.append((Object) null);
        sbLIZ.append(", mimetype=");
        sbLIZ.append((String) null);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C809610VpP)) {
            return false;
        }
        C809610VpP c809610VpP = (C809610VpP) obj;
        List<String> list = this.LIZ;
        if (list != null) {
            if (!list.equals(c809610VpP.LIZ)) {
                return false;
            }
        } else if (c809610VpP.LIZ != null) {
            return false;
        }
        List<String> list2 = this.LIZIZ;
        if (list2 != null) {
            if (!list2.equals(c809610VpP.LIZIZ)) {
                return false;
            }
        } else if (c809610VpP.LIZIZ != null) {
            return false;
        }
        c809610VpP.getClass();
        c809610VpP.getClass();
        return true;
    }

    public C809610VpP(List<String> list, List<String> list2) {
        this.LIZ = list;
        this.LIZIZ = list2;
    }
}
