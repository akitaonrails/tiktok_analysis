package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HBm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C436960HBm {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C436960HBm)) {
            return false;
        }
        C436960HBm c436960HBm = (C436960HBm) obj;
        return Intrinsics.LJFF(this.LIZ, c436960HBm.LIZ) && Intrinsics.LJFF(this.LIZIZ, c436960HBm.LIZIZ) && this.LIZJ == c436960HBm.LIZJ && Intrinsics.LJFF(this.LIZLLL, c436960HBm.LIZLLL) && Intrinsics.LJFF(this.LJ, c436960HBm.LJ) && Intrinsics.LJFF(this.LJFF, c436960HBm.LJFF) && Intrinsics.LJFF(this.LJI, c436960HBm.LJI);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ) * 31;
        String str = this.LIZLLL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJ;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJFF;
        return ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.LJI.hashCode();
    }

    public C436960HBm(String str, String str2, int i, String str3, String str4, String str5, String str6) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = str5;
        this.LJI = str6;
    }
}
