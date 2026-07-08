package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NnQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C604540NnQ {
    public final boolean LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C604540NnQ)) {
            return false;
        }
        C604540NnQ c604540NnQ = (C604540NnQ) obj;
        return this.LIZ == c604540NnQ.LIZ && Intrinsics.LJFF(this.LIZIZ, c604540NnQ.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c604540NnQ.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c604540NnQ.LIZLLL) && Intrinsics.LJFF(this.LJ, c604540NnQ.LJ);
    }

    public final int hashCode() {
        return (((((((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GpsRequestConfig(userAgree=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", dataCertToken=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", dataCertAuth=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", decryptCertToken=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", decryptCertAuth=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C604540NnQ(boolean z, String str, String str2, String str3, String str4) {
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
    }
}
