package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.050e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12826050e {
    public final String LIZ;
    public final Number LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12826050e)) {
            return false;
        }
        C12826050e c12826050e = (C12826050e) obj;
        return Intrinsics.LJFF(this.LIZ, c12826050e.LIZ) && Intrinsics.LJFF(this.LIZIZ, c12826050e.LIZIZ) && this.LIZJ == c12826050e.LIZJ && Intrinsics.LJFF(this.LIZLLL, c12826050e.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Number number = this.LIZIZ;
        int iHashCode2 = (((iHashCode + (number == null ? 0 : number.hashCode())) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31;
        String str = this.LIZLLL;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Outcome(status=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", factor=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", terminal=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", errorMessage=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C12826050e(String str, Number number, boolean z, String str2, int i) {
        z = (i & 4) != 0 ? false : z;
        str2 = (i & 8) != 0 ? null : str2;
        this.LIZ = str;
        this.LIZIZ = number;
        this.LIZJ = z;
        this.LIZLLL = str2;
    }
}
