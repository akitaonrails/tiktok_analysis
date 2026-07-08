package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lwT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1377190lwT {
    public final String LIZ;
    public final boolean LIZIZ;
    public final Integer LIZJ;
    public final String LIZLLL;
    public final String LJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C1377190lwT() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1377190lwT)) {
            return false;
        }
        C1377190lwT c1377190lwT = (C1377190lwT) obj;
        return Intrinsics.LJFF(this.LIZ, c1377190lwT.LIZ) && this.LIZIZ == c1377190lwT.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1377190lwT.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1377190lwT.LIZLLL) && Intrinsics.LJFF(this.LJ, c1377190lwT.LJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31;
        Integer num = this.LIZJ;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.LIZLLL;
        return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Long2ShortResult(shortenUrl=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isSuccess=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", statusCode=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", statusMsg=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", rawResponse=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1377190lwT(String str, String str2, Integer num, int i) {
        String str3;
        Integer num2 = num;
        if ((i & 1) != 0) {
            str3 = "";
        } else {
            str3 = null;
        }
        this(str3, (i & 4) != 0 ? null : num2, (i & 8) == 0 ? str : null, false, (i & 16) == 0 ? str2 : "");
    }

    public C1377190lwT(String str, Integer num, String str2, boolean z, String str3) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = num;
        this.LIZLLL = str2;
        this.LJ = str3;
    }
}
