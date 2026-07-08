package X;

/* JADX INFO: renamed from: X.087t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20667087t {
    public final String LIZ;
    public final String LIZIZ;

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.LIZIZ;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String str = this.LIZ;
        if (str == null) {
            str = "";
        }
        sbLIZ.append(str);
        sbLIZ.append(": ");
        String str2 = this.LIZIZ;
        sbLIZ.append(str2 != null ? str2 : "");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20667087t.class != obj.getClass()) {
            return false;
        }
        C20667087t c20667087t = (C20667087t) obj;
        String str = this.LIZ;
        if (str != null) {
            if (!str.equals(c20667087t.LIZ)) {
                return false;
            }
        } else if (c20667087t.LIZ != null) {
            return false;
        }
        String str2 = this.LIZIZ;
        String str3 = c20667087t.LIZIZ;
        if (str2 != null) {
            if (!str2.equals(str3)) {
                return false;
            }
        } else if (str3 != null) {
            return false;
        }
        return true;
    }

    public C20667087t(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
