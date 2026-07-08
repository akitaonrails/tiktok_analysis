package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Exd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C381550Exd {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final Integer LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;

    public C381550Exd() {
        this(null, 0, 0, null, null, null, null, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C381550Exd)) {
            return false;
        }
        C381550Exd c381550Exd = (C381550Exd) obj;
        return Intrinsics.LJFF(this.LIZ, c381550Exd.LIZ) && this.LIZIZ == c381550Exd.LIZIZ && this.LIZJ == c381550Exd.LIZJ && Intrinsics.LJFF(this.LIZLLL, c381550Exd.LIZLLL) && Intrinsics.LJFF(this.LJ, c381550Exd.LJ) && Intrinsics.LJFF(this.LJFF, c381550Exd.LJFF) && Intrinsics.LJFF(this.LJI, c381550Exd.LJI);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31;
        Integer num = this.LIZLLL;
        int iHashCode2 = (((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.LJ.hashCode()) * 31;
        String str = this.LJFF;
        return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.LJI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCQuotaResult(reqKey=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", quotaRemain=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", quotaTotal=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", errorSource=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C381550Exd(String str, int i, int i2, Integer num, String str2, String str3, String str4, int i3) {
        str = (i3 & 1) != 0 ? "" : str;
        i = (i3 & 2) != 0 ? 0 : i;
        i2 = (i3 & 4) != 0 ? 0 : i2;
        num = (i3 & 8) != 0 ? null : num;
        str2 = (i3 & 16) != 0 ? "" : str2;
        str3 = (i3 & 32) != 0 ? null : str3;
        str4 = (i3 & 64) != 0 ? "" : str4;
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = num;
        this.LJ = str2;
        this.LJFF = str3;
        this.LJI = str4;
    }
}
