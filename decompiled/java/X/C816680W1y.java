package X;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0W1y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C816680W1y {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final long LJII;

    public final C816680W1y LIZ() {
        if (((ArrayList) C13LQ.LJIJI(new String[]{this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI})).isEmpty()) {
            return null;
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C816680W1y)) {
            return false;
        }
        C816680W1y c816680W1y = (C816680W1y) obj;
        return Intrinsics.LJFF(this.LIZ, c816680W1y.LIZ) && Intrinsics.LJFF(this.LIZIZ, c816680W1y.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c816680W1y.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c816680W1y.LIZLLL) && Intrinsics.LJFF(this.LJ, c816680W1y.LJ) && Intrinsics.LJFF(this.LJFF, c816680W1y.LJFF) && Intrinsics.LJFF(this.LJI, c816680W1y.LJI) && this.LJII == c816680W1y.LJII;
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZLLL;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJ;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJFF;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJI;
        return ((iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.LJII);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MafInfo(uid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", recType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", recReason=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", relationType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", socialInfo=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", mutualStruct=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", externalRecReason=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", version=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C816680W1y(String str, String str2, long j, String str3, String str4, String str5, String str6, String str7) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = str6;
        this.LJI = str7;
        this.LJII = j;
    }
}
