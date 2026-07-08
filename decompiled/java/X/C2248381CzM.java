package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1CzM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2248381CzM extends C2248431CzR {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2248381CzM)) {
            return false;
        }
        C2248381CzM c2248381CzM = (C2248381CzM) obj;
        return Intrinsics.LJFF(this.LIZ, c2248381CzM.LIZ) && Intrinsics.LJFF(this.LIZIZ, c2248381CzM.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c2248381CzM.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c2248381CzM.LIZLLL) && Intrinsics.LJFF(this.LJ, c2248381CzM.LJ);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        String str = this.LIZLLL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJ;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TuxIconResource(url=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", token=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", from=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", color=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", theme=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2248381CzM(String str, String str2, String str3, String str4, String str5) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
    }
}
