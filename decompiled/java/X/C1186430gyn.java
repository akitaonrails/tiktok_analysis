package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gyn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1186430gyn implements InterfaceC1186470gyr {
    public final String LIZ;
    public final int LIZIZ = 0;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1186430gyn)) {
            return false;
        }
        C1186430gyn c1186430gyn = (C1186430gyn) obj;
        return Intrinsics.LJFF(this.LIZ, c1186430gyn.LIZ) && this.LIZIZ == c1186430gyn.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1186430gyn.LIZJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.LIZIZ) * 31;
        String str2 = this.LIZJ;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SuccessRateTrackAction(business=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", fromInstanceId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1186430gyn(String str, String str2) {
        this.LIZ = str;
        this.LIZJ = str2;
    }
}
