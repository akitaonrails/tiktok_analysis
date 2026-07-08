package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0VpO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C809600VpO {
    public final List<C809610VpP> LIZ = new ArrayList();
    public final String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;

    public final int hashCode() {
        List<C809610VpP> list = this.LIZ;
        int iHashCode = (list != null ? ((ArrayList) list).hashCode() : 0) * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.LJ;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Component{name='");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", intentFilter=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", processName='");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('\'');
        sbLIZ.append(", permission='");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append('\'');
        sbLIZ.append(", authorities='");
        sbLIZ.append(this.LJ);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C809600VpO(String str) {
        this.LIZIZ = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C809600VpO)) {
            return false;
        }
        C809600VpO c809600VpO = (C809600VpO) obj;
        List<C809610VpP> list = this.LIZ;
        if (list != null) {
            if (!((ArrayList) list).equals(c809600VpO.LIZ)) {
                return false;
            }
        } else if (c809600VpO.LIZ != null) {
            return false;
        }
        String str = this.LIZIZ;
        if (str != null) {
            if (!str.equals(c809600VpO.LIZIZ)) {
                return false;
            }
        } else if (c809600VpO.LIZIZ != null) {
            return false;
        }
        String str2 = this.LIZJ;
        if (str2 != null) {
            if (!str2.equals(c809600VpO.LIZJ)) {
                return false;
            }
        } else if (c809600VpO.LIZJ != null) {
            return false;
        }
        String str3 = this.LIZLLL;
        if (str3 != null) {
            if (!str3.equals(c809600VpO.LIZLLL)) {
                return false;
            }
        } else if (c809600VpO.LIZLLL != null) {
            return false;
        }
        String str4 = this.LJ;
        String str5 = c809600VpO.LJ;
        if (str4 != null) {
            if (!str4.equals(str5)) {
                return false;
            }
        } else if (str5 != null) {
            return false;
        }
        return true;
    }
}
