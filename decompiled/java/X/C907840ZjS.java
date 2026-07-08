package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZjS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C907840ZjS {
    public final int LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;
    public final long LJ;
    public final Integer LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C907840ZjS)) {
            return false;
        }
        C907840ZjS c907840ZjS = (C907840ZjS) obj;
        return this.LIZ == c907840ZjS.LIZ && Intrinsics.LJFF(this.LIZIZ, c907840ZjS.LIZIZ) && this.LIZJ == c907840ZjS.LIZJ && Intrinsics.LJFF(this.LIZLLL, c907840ZjS.LIZLLL) && this.LJ == c907840ZjS.LJ && Intrinsics.LJFF(this.LJFF, c907840ZjS.LJFF) && Intrinsics.LJFF(this.LJI, c907840ZjS.LJI) && Intrinsics.LJFF(this.LJII, c907840ZjS.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c907840ZjS.LJIIIIZZ);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Y2(this.LJ)) * 31;
        Integer num = this.LJFF;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.LJI;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJII;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJIIIIZZ;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("business ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(' ');
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(" content ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(' ');
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(" group ");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(' ');
        sbLIZ.append(this.LJI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C907840ZjS(int i, String str, int i2, String str2, long j, Integer num, String str3, int i3) {
        this(i, str, i2, str2, j, (i3 & 32) != 0 ? null : num, (i3 & 64) != 0 ? null : str3, null, null);
    }

    public C907840ZjS(int i, String str, int i2, String str2, long j, Integer num, String str3, String str4, String str5) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = i2;
        this.LIZLLL = str2;
        this.LJ = j;
        this.LJFF = num;
        this.LJI = str3;
        this.LJII = str4;
        this.LJIIIIZZ = str5;
    }
}
