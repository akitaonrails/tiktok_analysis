package X;

import java.util.List;

/* JADX INFO: renamed from: X.0WEH, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WEH extends C0WEI {
    public final long LIZ;
    public final long LIZIZ;
    public final C0WDQ LIZJ;
    public final Integer LIZLLL;
    public final String LJ;
    public final List<AbstractC819840WEc> LJFF;
    public final C0WDK LJI;

    public C0WEH() {
        throw null;
    }

    public final int hashCode() {
        long j = this.LIZ;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.LIZIZ;
        int i2 = (i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        C0WDQ c0wdq = this.LIZJ;
        int iHashCode = (i2 ^ (c0wdq == null ? 0 : c0wdq.hashCode())) * 1000003;
        Integer num = this.LIZLLL;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.LJ;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<AbstractC819840WEc> list = this.LJFF;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        C0WDK c0wdk = this.LJI;
        return iHashCode4 ^ (c0wdk != null ? c0wdk.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LogRequest{requestTimeMs=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", requestUptimeMs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", clientInfo=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", logSource=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", logSourceName=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", logEvents=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", qosTier=");
        sbLIZ.append(this.LJI);
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0WEI
    public final C0WDQ LIZ() {
        return this.LIZJ;
    }

    @Override // X.C0WEI
    public final List<AbstractC819840WEc> LIZIZ() {
        return this.LJFF;
    }

    @Override // X.C0WEI
    public final Integer LIZJ() {
        return this.LIZLLL;
    }

    @Override // X.C0WEI
    public final String LIZLLL() {
        return this.LJ;
    }

    @Override // X.C0WEI
    public final C0WDK LJ() {
        return this.LJI;
    }

    @Override // X.C0WEI
    public final long LJFF() {
        return this.LIZ;
    }

    @Override // X.C0WEI
    public final long LJI() {
        return this.LIZIZ;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0WEI)) {
            return false;
        }
        C0WEI c0wei = (C0WEI) obj;
        if (this.LIZ == c0wei.LJFF() && this.LIZIZ == c0wei.LJI()) {
            C0WDQ c0wdq = this.LIZJ;
            if (c0wdq == null) {
                if (c0wei.LIZ() != null) {
                    return false;
                }
            } else if (!c0wdq.equals(c0wei.LIZ())) {
                return false;
            }
            Integer num = this.LIZLLL;
            if (num == null) {
                if (c0wei.LIZJ() != null) {
                    return false;
                }
            } else if (!num.equals(c0wei.LIZJ())) {
                return false;
            }
            String str = this.LJ;
            if (str == null) {
                if (c0wei.LIZLLL() != null) {
                    return false;
                }
            } else if (!str.equals(c0wei.LIZLLL())) {
                return false;
            }
            List<AbstractC819840WEc> list = this.LJFF;
            if (list == null) {
                if (c0wei.LIZIZ() != null) {
                    return false;
                }
            } else if (!list.equals(c0wei.LIZIZ())) {
                return false;
            }
            C0WDK c0wdk = this.LJI;
            if (c0wdk == null) {
                if (c0wei.LJ() == null) {
                    return true;
                }
                return false;
            }
            if (c0wdk.equals(c0wei.LJ())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C0WEH(long j, long j2, C0WDQ c0wdq, Integer num, String str, List list, C0WDK c0wdk) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = c0wdq;
        this.LIZLLL = num;
        this.LJ = str;
        this.LJFF = list;
        this.LJI = c0wdk;
    }
}
