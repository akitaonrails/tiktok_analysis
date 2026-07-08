package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1CzN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2248391CzN extends C2248431CzR {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2248391CzN)) {
            return false;
        }
        C2248391CzN c2248391CzN = (C2248391CzN) obj;
        return Intrinsics.LJFF(this.LIZ, c2248391CzN.LIZ) && Intrinsics.LJFF(this.LIZIZ, c2248391CzN.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c2248391CzN.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c2248391CzN.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        String str = this.LIZLLL;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TuxColorResource(url=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", token=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", from=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", theme=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2248391CzN(String str, String str2, String str3, String str4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
    }
}
