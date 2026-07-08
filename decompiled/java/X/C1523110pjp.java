package X;

import com.google.gson.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pjp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1523110pjp extends AbstractC1798240wta {
    public final String LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1523110pjp)) {
            return false;
        }
        C1523110pjp c1523110pjp = (C1523110pjp) obj;
        return Intrinsics.LJFF(this.LIZ, c1523110pjp.LIZ) && this.LIZIZ == c1523110pjp.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1523110pjp.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1523110pjp.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31;
        String str = this.LIZJ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZLLL;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failure(uid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", statusCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", token=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", version=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final n LIZIZ() {
        n nVar = new n();
        nVar.LJJIII(Integer.valueOf(this.LIZIZ), "status_code");
        String str = this.LIZJ;
        if (str != null && str.length() > 0) {
            nVar.LJJIIJ("token", str);
        }
        String str2 = this.LIZLLL;
        if (str2 != null && str2.length() > 0) {
            nVar.LJJIIJ("version", str2);
        }
        nVar.LJJIIJ("source", "region_service");
        return nVar;
    }

    @Override // X.AbstractC1798240wta
    public final String LIZ() {
        return this.LIZ;
    }

    public C1523110pjp(String str, int i, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = str2;
        this.LIZLLL = str3;
    }
}
