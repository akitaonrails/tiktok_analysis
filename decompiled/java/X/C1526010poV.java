package X;

/* JADX INFO: renamed from: X.0poV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1526010poV {
    public final String LIZ;
    public final String LIZIZ;

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.LIZIZ;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1526010poV.class != obj.getClass()) {
            return false;
        }
        C1526010poV c1526010poV = (C1526010poV) obj;
        String str = this.LIZ;
        if (str != null) {
            if (!str.equals(c1526010poV.LIZ)) {
                return false;
            }
        } else if (c1526010poV.LIZ != null) {
            return false;
        }
        String str2 = this.LIZIZ;
        String str3 = c1526010poV.LIZIZ;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 == null) {
            return true;
        }
        return false;
    }

    public C1526010poV(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
