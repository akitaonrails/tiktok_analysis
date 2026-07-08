package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i3K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1227680i3K {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final long LJ;
    public final long LJFF;
    public final int LJI;
    public final C0ZBV LJII;
    public final Integer LJIIIIZZ;
    public final String LJIIIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1227680i3K)) {
            return false;
        }
        C1227680i3K c1227680i3K = (C1227680i3K) obj;
        return Intrinsics.LJFF(this.LIZ, c1227680i3K.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1227680i3K.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1227680i3K.LIZJ) && this.LIZLLL == c1227680i3K.LIZLLL && this.LJ == c1227680i3K.LJ && this.LJFF == c1227680i3K.LJFF && this.LJI == c1227680i3K.LJI && this.LJII == c1227680i3K.LJII && Intrinsics.LJFF(this.LJIIIIZZ, c1227680i3K.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c1227680i3K.LJIIIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (((((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL) * 31) + C786410Ut5.Y2(this.LJ)) * 31) + C786410Ut5.Y2(this.LJFF)) * 31) + this.LJI) * 31) + this.LJII.hashCode()) * 31;
        Integer num = this.LJIIIIZZ;
        return ((iHashCode + (num != null ? num.hashCode() : 0)) * 31) + this.LJIIIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreateResultParams(convId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", chatType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", groupType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", memberNum=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", networkDuration=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", processDuration=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", successMemberNum=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", resultStatus=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1227680i3K(String str, String str2, String str3, int i, long j, long j2, int i2, C0ZBV c0zbv, Integer num, String str4, int i3) {
        i2 = (i3 & 64) != 0 ? -1 : i2;
        num = (i3 & 256) != 0 ? null : num;
        str4 = (i3 & 512) != 0 ? "" : str4;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = i;
        this.LJ = j;
        this.LJFF = j2;
        this.LJI = i2;
        this.LJII = c0zbv;
        this.LJIIIIZZ = num;
        this.LJIIIZ = str4;
    }
}
