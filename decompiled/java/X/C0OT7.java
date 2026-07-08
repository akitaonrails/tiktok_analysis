package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OT7, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OT7 extends C0OT8 {
    public final long LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final boolean LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0OT7)) {
            return false;
        }
        C0OT7 c0ot7 = (C0OT7) obj;
        return this.LIZ == c0ot7.LIZ && Intrinsics.LJFF(this.LIZIZ, c0ot7.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0ot7.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0ot7.LIZLLL) && Intrinsics.LJFF(this.LJ, c0ot7.LJ) && Intrinsics.LJFF(this.LJFF, c0ot7.LJFF) && this.LJI == c0ot7.LJI;
    }

    public final int hashCode() {
        int iY2 = C786410Ut5.Y2(this.LIZ) * 31;
        String str = this.LIZIZ;
        int iHashCode = (iY2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZLLL;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJ;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJFF;
        return ((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(cacheTime=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", description=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", url=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", image=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", domain=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", contentChecked=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0OT7(long j, String str, String str2, String str3, String str4, String str5, boolean z) {
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = str5;
        this.LJI = z;
    }
}
