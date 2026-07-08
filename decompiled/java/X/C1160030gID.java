package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gID, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1160030gID {
    public final float LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final boolean LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1160030gID)) {
            return false;
        }
        C1160030gID c1160030gID = (C1160030gID) obj;
        return Float.compare(this.LIZ, c1160030gID.LIZ) == 0 && Intrinsics.LJFF(this.LIZIZ, c1160030gID.LIZIZ) && this.LIZJ == c1160030gID.LIZJ && this.LIZLLL == c1160030gID.LIZLLL && this.LJ == c1160030gID.LJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BlackEdgeInfo(ratio=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", orientation=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", displayWidth=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", displayHeight=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", valid=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((((Float.floatToIntBits(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public C1160030gID(float f, int i, int i2, String str, boolean z) {
        this.LIZ = f;
        this.LIZIZ = str;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = z;
    }
}
