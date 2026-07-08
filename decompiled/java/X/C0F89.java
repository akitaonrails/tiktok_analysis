package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0F89, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F89 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0F89)) {
            return false;
        }
        C0F89 c0f89 = (C0F89) obj;
        return Intrinsics.LJFF(this.LIZ, c0f89.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0f89.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0f89.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0f89.LIZLLL) && Intrinsics.LJFF(this.LJ, c0f89.LJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJ;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NleResolvedEffect(effectId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", resourceId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", panel=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", unzipPath=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0F89(String str, String str2, String str3, String str4, String str5) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
    }
}
