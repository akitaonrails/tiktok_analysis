package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0c9l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1001030c9l implements InterfaceC315390CXx {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final Integer LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1001030c9l)) {
            return false;
        }
        C1001030c9l c1001030c9l = (C1001030c9l) obj;
        return Intrinsics.LJFF(this.LIZ, c1001030c9l.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1001030c9l.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1001030c9l.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1001030c9l.LIZLLL) && Intrinsics.LJFF(this.LJ, c1001030c9l.LJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.LJ;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ButtonAdBottomLabelStyleEvent(awemeId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", buttonText=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", buttonTextColorValue=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", backgroundColorValue=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", arrowResource=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1001030c9l(String str, String str2, String str3, String str4, Integer num) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = num;
    }
}
