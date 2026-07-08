package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0XG3, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XG3 {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final boolean LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;

    public C0XG3() {
        this(0L, false, 511);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0XG3)) {
            return false;
        }
        C0XG3 c0xg3 = (C0XG3) obj;
        return this.LIZ == c0xg3.LIZ && this.LIZIZ == c0xg3.LIZIZ && this.LIZJ == c0xg3.LIZJ && this.LIZLLL == c0xg3.LIZLLL && this.LJ == c0xg3.LJ && this.LJFF == c0xg3.LJFF && Intrinsics.LJFF(this.LJI, c0xg3.LJI) && Intrinsics.LJFF(this.LJII, c0xg3.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c0xg3.LJIIIIZZ);
    }

    public final int hashCode() {
        int iY2 = ((((((((((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + C786410Ut5.Y2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31;
        String str = this.LJI;
        int iHashCode = (iY2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJII;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJIIIIZZ;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SOTLLoginFlowMetrics(clickTimeMs=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", fetchTokenStartTimeMs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", fetchTokenEndTimeMs=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", oidcLoginStartTimeMs=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", oidcLoginEndTimeMs=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", hasTokenAtClick=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", failStage=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", errorDesc=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final long LIZIZ() {
        if (this.LIZ <= 0) {
            return 0L;
        }
        long j = this.LJ;
        if (j <= 0 && this.LIZJ <= 0) {
            return 0L;
        }
        Long lValueOf = Long.valueOf(j);
        return (lValueOf.longValue() > 0 ? lValueOf.longValue() : this.LIZJ) - this.LIZ;
    }

    public /* synthetic */ C0XG3(long j, boolean z, int i) {
        this((i & 1) != 0 ? 0L : j, 0L, 0L, 0L, 0L, (i & 32) != 0 ? false : z, null, null, null);
    }

    public C0XG3(long j, long j2, long j3, long j4, long j5, boolean z, String str, String str2, String str3) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LIZLLL = j4;
        this.LJ = j5;
        this.LJFF = z;
        this.LJI = str;
        this.LJII = str2;
        this.LJIIIIZZ = str3;
    }

    public static C0XG3 LIZ(C0XG3 c0xg3, long j, long j2, long j3, long j4, String str, String str2, String str3, int i) {
        long j5;
        boolean z;
        String str4 = str3;
        String str5 = str;
        String str6 = str2;
        long j6 = j4;
        long j7 = j3;
        long j8 = j2;
        long j9 = j;
        if ((i & 1) != 0) {
            j5 = c0xg3.LIZ;
        } else {
            j5 = 0;
        }
        if ((i & 2) != 0) {
            j9 = c0xg3.LIZIZ;
        }
        if ((i & 4) != 0) {
            j8 = c0xg3.LIZJ;
        }
        if ((i & 8) != 0) {
            j7 = c0xg3.LIZLLL;
        }
        if ((i & 16) != 0) {
            j6 = c0xg3.LJ;
        }
        if ((i & 32) != 0) {
            z = c0xg3.LJFF;
        } else {
            z = false;
        }
        if ((i & 64) != 0) {
            str5 = c0xg3.LJI;
        }
        if ((i & 128) != 0) {
            str6 = c0xg3.LJII;
        }
        if ((i & 256) != 0) {
            str4 = c0xg3.LJIIIIZZ;
        }
        String str7 = str4;
        boolean z2 = z;
        return new C0XG3(j5, j9, j8, j7, j6, z2, str5, str6, str7);
    }
}
