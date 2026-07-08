package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0VMI, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VMI {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final Integer LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0VMI)) {
            return false;
        }
        C0VMI c0vmi = (C0VMI) obj;
        return Intrinsics.LJFF(this.LIZ, c0vmi.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0vmi.LIZIZ) && this.LIZJ == c0vmi.LIZJ && Intrinsics.LJFF(this.LIZLLL, c0vmi.LIZLLL) && Intrinsics.LJFF(this.LJ, c0vmi.LJ);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ) * 31;
        Integer num = this.LIZLLL;
        return ((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PackageEntity(packageName=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", md5=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", engineType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", optionType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", content=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0VMI(int i, String str, String str2, String str3, Integer num) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
        this.LIZLLL = num;
        this.LJ = str3;
    }
}
