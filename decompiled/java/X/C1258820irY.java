package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0irY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1258820irY {
    public final EnumC1258840ira LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1258820irY)) {
            return false;
        }
        C1258820irY c1258820irY = (C1258820irY) obj;
        return this.LIZ == c1258820irY.LIZ && Intrinsics.LJFF(this.LIZIZ, c1258820irY.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1258820irY.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1258820irY.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZLLL;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EmptyStateSpec(mode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", buttonText=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1258820irY(EnumC1258840ira enumC1258840ira, String str, String str2, String str3) {
        this.LIZ = enumC1258840ira;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
    }
}
