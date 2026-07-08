package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04xc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1267404xc {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;
    public final int LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1267404xc)) {
            return false;
        }
        C1267404xc c1267404xc = (C1267404xc) obj;
        return Intrinsics.LJFF(this.LIZ, c1267404xc.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1267404xc.LIZIZ) && this.LIZJ == c1267404xc.LIZJ && this.LIZLLL == c1267404xc.LIZLLL && this.LJ == c1267404xc.LJ;
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + this.LJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VariantKey(realPath=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", axesSig=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", effectiveWeight=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", italic=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", weightAdjustmentSnapshot=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1267404xc(int i, int i2, String str, String str2, boolean z) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
        this.LIZLLL = z;
        this.LJ = i2;
    }
}
