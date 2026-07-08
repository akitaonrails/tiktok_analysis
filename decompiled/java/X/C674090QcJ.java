package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QcJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C674090QcJ {
    public final Boolean LIZ;
    public final Boolean LIZIZ;
    public final Boolean LIZJ;
    public final Boolean LIZLLL;
    public final Boolean LJ;
    public final Boolean LJFF;
    public final Boolean LJI;

    /* JADX WARN: Illegal instructions before constructor call */
    public C674090QcJ() {
        Boolean bool = null;
        this(bool, bool, bool, bool, bool, bool, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C674090QcJ)) {
            return false;
        }
        C674090QcJ c674090QcJ = (C674090QcJ) obj;
        return Intrinsics.LJFF(this.LIZ, c674090QcJ.LIZ) && Intrinsics.LJFF(this.LIZIZ, c674090QcJ.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c674090QcJ.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c674090QcJ.LIZLLL) && Intrinsics.LJFF(this.LJ, c674090QcJ.LJ) && Intrinsics.LJFF(this.LJFF, c674090QcJ.LJFF) && Intrinsics.LJFF(this.LJI, c674090QcJ.LJI);
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
        int iHashCode6 = (iHashCode5 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.LJI;
        return iHashCode6 + (bool7 != null ? bool7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EcSearchBarVisibilitySnapshot(normalInputVisible=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", aiInputVisible=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", aiHintVisible=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", aiBackgroundVisible=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", clearAllTvVisible=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", microphoneIvVisible=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", voiceWaveVisible=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C674090QcJ LIZ(C674090QcJ c674090QcJ, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i) {
        Boolean bool5;
        Boolean bool6;
        Boolean bool7 = bool4;
        Boolean bool8 = bool3;
        Boolean bool9 = bool2;
        Boolean bool10 = bool;
        Boolean bool11 = null;
        if ((i & 1) != 0) {
            bool5 = c674090QcJ.LIZ;
        } else {
            bool5 = null;
        }
        if ((i & 2) != 0) {
            bool10 = c674090QcJ.LIZIZ;
        }
        if ((i & 4) != 0) {
            bool9 = c674090QcJ.LIZJ;
        }
        if ((i & 8) != 0) {
            bool6 = c674090QcJ.LIZLLL;
        } else {
            bool6 = null;
        }
        if ((i & 16) != 0) {
            bool11 = c674090QcJ.LJ;
        }
        if ((i & 32) != 0) {
            bool8 = c674090QcJ.LJFF;
        }
        if ((i & 64) != 0) {
            bool7 = c674090QcJ.LJI;
        }
        c674090QcJ.getClass();
        return new C674090QcJ(bool5, bool10, bool9, bool6, bool11, bool8, bool7);
    }

    public /* synthetic */ C674090QcJ(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, int i) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : bool4, (Boolean) null, (i & 32) != 0 ? null : bool5, (i & 64) != 0 ? null : bool6);
    }

    public C674090QcJ(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7) {
        this.LIZ = bool;
        this.LIZIZ = bool2;
        this.LIZJ = bool3;
        this.LIZLLL = bool4;
        this.LJ = bool5;
        this.LJFF = bool6;
        this.LJI = bool7;
    }
}
