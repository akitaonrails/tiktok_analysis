package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EgG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C370780EgG {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C370780EgG)) {
            return false;
        }
        C370780EgG c370780EgG = (C370780EgG) obj;
        return Intrinsics.LJFF(this.LIZ, c370780EgG.LIZ) && this.LIZIZ == c370780EgG.LIZIZ && this.LIZJ == c370780EgG.LIZJ && this.LIZLLL == c370780EgG.LIZLLL && this.LJ == c370780EgG.LJ && this.LJFF == c370780EgG.LJFF;
    }

    public final int hashCode() {
        return (((((((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PriorityFrame(path=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", timestamp=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", priority=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isImage=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isUploadSlot=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", isAlphaSplit=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C370780EgG(int i, int i2, String str, boolean z, boolean z2) {
        this(i, i2, str, z, z2, false);
    }

    public C370780EgG(int i, int i2, String str, boolean z, boolean z2, boolean z3) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = z3;
    }
}
