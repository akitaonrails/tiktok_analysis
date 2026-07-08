package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DD0, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DD0 extends C0DD4 {
    public final String LIZ;
    public final String LIZIZ;
    public final C0D7I LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public C0DD0() {
        this(null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0DD0)) {
            return false;
        }
        C0DD0 c0dd0 = (C0DD0) obj;
        return Intrinsics.LJFF(this.LIZ, c0dd0.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0dd0.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0dd0.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0dd0.LIZLLL) && Intrinsics.LJFF(this.LJ, c0dd0.LJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        C0D7I c0d7i = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (c0d7i == null ? 0 : c0d7i.hashCode())) * 31;
        String str3 = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJ;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(token=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", methodType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", billingAddress=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", paymentMethodId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", instrumentId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0DD0(String str, String str2, C0D7I c0d7i, String str3, String str4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = c0d7i;
        this.LIZLLL = str3;
        this.LJ = str4;
    }
}
