package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QcI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C674080QcI {
    public final Boolean LIZ;
    public final Boolean LIZIZ;
    public final Boolean LIZJ;
    public final Boolean LIZLLL;
    public final Boolean LJ;
    public final Boolean LJFF;

    /* JADX WARN: Illegal instructions before constructor call */
    public C674080QcI() {
        Boolean bool = null;
        this(bool, bool, bool, bool, bool, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C674080QcI)) {
            return false;
        }
        C674080QcI c674080QcI = (C674080QcI) obj;
        return Intrinsics.LJFF(this.LIZ, c674080QcI.LIZ) && Intrinsics.LJFF(this.LIZIZ, c674080QcI.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c674080QcI.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c674080QcI.LIZLLL) && Intrinsics.LJFF(this.LJ, c674080QcI.LJ) && Intrinsics.LJFF(this.LJFF, c674080QcI.LJFF);
    }

    public final int hashCode() {
        Boolean bool = this.LIZ;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.LJ;
        int iHashCode5 = (iHashCode4 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.LJFF;
        return iHashCode5 + (bool6 != null ? bool6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EcSearchBarInteractionSnapshot(aiInputEnabled=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", photoSearchEnabled=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", clearIvEnabled=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", clearAllTvEnabled=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", microphoneIvEnabled=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", searchTvEnabled=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C674080QcI(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, int i) {
        this((Boolean) null, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : bool3, (i & 16) != 0 ? null : bool4, (i & 32) != 0 ? null : bool5);
    }

    public static C674080QcI LIZ(C674080QcI c674080QcI, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i) {
        Boolean bool5;
        Boolean bool6 = bool4;
        Boolean bool7 = bool3;
        Boolean bool8 = bool2;
        Boolean bool9 = bool;
        if ((i & 1) != 0) {
            bool9 = c674080QcI.LIZ;
        }
        Boolean bool10 = null;
        if ((i & 2) != 0) {
            bool5 = c674080QcI.LIZIZ;
        } else {
            bool5 = null;
        }
        if ((i & 4) != 0) {
            bool10 = c674080QcI.LIZJ;
        }
        if ((i & 8) != 0) {
            bool8 = c674080QcI.LIZLLL;
        }
        if ((i & 16) != 0) {
            bool7 = c674080QcI.LJ;
        }
        if ((i & 32) != 0) {
            bool6 = c674080QcI.LJFF;
        }
        c674080QcI.getClass();
        return new C674080QcI(bool9, bool5, bool10, bool8, bool7, bool6);
    }

    public C674080QcI(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6) {
        this.LIZ = bool;
        this.LIZIZ = bool2;
        this.LIZJ = bool3;
        this.LIZLLL = bool4;
        this.LJ = bool5;
        this.LJFF = bool6;
    }
}
