package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LtZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C557390LtZ {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final long LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final Boolean LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C557390LtZ)) {
            return false;
        }
        C557390LtZ c557390LtZ = (C557390LtZ) obj;
        return Intrinsics.LJFF(this.LIZ, c557390LtZ.LIZ) && this.LIZIZ == c557390LtZ.LIZIZ && this.LIZJ == c557390LtZ.LIZJ && this.LIZLLL == c557390LtZ.LIZLLL && Intrinsics.LJFF(this.LJ, c557390LtZ.LJ) && Intrinsics.LJFF(this.LJFF, c557390LtZ.LJFF) && Intrinsics.LJFF(this.LJI, c557390LtZ.LJI);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31;
        String str = this.LJ;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LJFF.hashCode()) * 31;
        Boolean bool = this.LJI;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageDataItem(path=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", width=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", height=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", fileSize=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", badgeText=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", mediaSource=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", hasFace=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C557390LtZ LIZ(C557390LtZ c557390LtZ, String str, Boolean bool, int i) {
        String str2;
        int i2;
        int i3;
        long j;
        Boolean bool2 = bool;
        String str3 = str;
        String str4 = null;
        if ((i & 1) != 0) {
            str2 = c557390LtZ.LIZ;
        } else {
            str2 = null;
        }
        if ((i & 2) != 0) {
            i2 = c557390LtZ.LIZIZ;
        } else {
            i2 = 0;
        }
        if ((i & 4) != 0) {
            i3 = c557390LtZ.LIZJ;
        } else {
            i3 = 0;
        }
        if ((i & 8) != 0) {
            j = c557390LtZ.LIZLLL;
        } else {
            j = 0;
        }
        if ((i & 16) != 0) {
            str3 = c557390LtZ.LJ;
        }
        if ((i & 32) != 0) {
            str4 = c557390LtZ.LJFF;
        }
        if ((i & 64) != 0) {
            bool2 = c557390LtZ.LJI;
        }
        c557390LtZ.getClass();
        return new C557390LtZ(str2, i2, i3, j, str3, str4, bool2);
    }

    public /* synthetic */ C557390LtZ(String str, int i, int i2, long j, String str2, String str3, int i3) {
        this(str, (i3 & 2) != 0 ? -1 : i, (i3 & 4) != 0 ? -1 : i2, (i3 & 8) != 0 ? -1L : j, (i3 & 16) != 0 ? null : str2, (i3 & 32) != 0 ? "" : str3, (Boolean) null);
    }

    public C557390LtZ(String str, int i, int i2, long j, String str2, String str3, Boolean bool) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = j;
        this.LJ = str2;
        this.LJFF = str3;
        this.LJI = bool;
    }
}
