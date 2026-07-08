package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D5D, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D5D {
    public final String LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0D5D)) {
            return false;
        }
        C0D5D c0d5d = (C0D5D) obj;
        return Intrinsics.LJFF(this.LIZ, c0d5d.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0d5d.LIZIZ) && this.LIZJ == c0d5d.LIZJ && Intrinsics.LJFF(this.LIZLLL, c0d5d.LIZLLL) && Intrinsics.LJFF(this.LJ, c0d5d.LJ);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31;
        String str = this.LIZLLL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJ;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ColorSkuItem(name=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", imageUrl=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isAvailable=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", variantId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", variantPrice=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0D5D(String str, String str2, String str3, String str4, boolean z) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = z;
        this.LIZLLL = str3;
        this.LJ = str4;
    }
}
