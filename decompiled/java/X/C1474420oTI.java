package X;

/* JADX INFO: renamed from: X.0oTI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1474420oTI {
    public String LIZ;
    public long LIZIZ;
    public C1470240oMY LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJI;
    public String LJII;
    public C1AMG LJIIIIZZ = C1AMG.LIZ();
    public long LIZJ = -1;

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.LJ;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31 * 31 * 31 * 31 * 31;
        String str3 = this.LJI;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.LJFF;
        return ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + ((int) (this.LIZIZ * 31));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1474420oTI.class != obj.getClass()) {
            return false;
        }
        C1474420oTI c1474420oTI = (C1474420oTI) obj;
        if (this.LIZIZ == c1474420oTI.LIZIZ && LIZ(this.LIZ, c1474420oTI.LIZ) && LIZ(this.LIZLLL, c1474420oTI.LIZLLL) && LIZ(this.LJ, c1474420oTI.LJ) && LIZ(null, null) && LIZ(null, null) && LIZ(null, null) && LIZ(null, null) && LIZ(this.LJI, c1474420oTI.LJI) && LIZ(this.LJFF, c1474420oTI.LJFF)) {
            return true;
        }
        return false;
    }

    public static boolean LIZ(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }
}
