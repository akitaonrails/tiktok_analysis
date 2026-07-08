package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ENX, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0ENX extends AbstractC363520ENa {
    public final C0ENU LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ENX)) {
            return false;
        }
        C0ENX c0enx = (C0ENX) obj;
        return Intrinsics.LJFF(this.LIZ, c0enx.LIZ) && Float.compare(this.LIZIZ, c0enx.LIZIZ) == 0 && Float.compare(this.LIZJ, c0enx.LIZJ) == 0 && Float.compare(this.LIZLLL, c0enx.LIZLLL) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RectangleMask(baseData=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", width=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", height=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", roundCorner=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + Float.floatToIntBits(this.LIZJ)) * 31) + Float.floatToIntBits(this.LIZLLL);
    }

    @Override // X.AbstractC363520ENa
    public final C0ENU LIZ() {
        return this.LIZ;
    }

    public C0ENX(C0ENU c0enu, float f, float f2, float f3) {
        this.LIZ = c0enu;
        this.LIZIZ = f;
        this.LIZJ = f2;
        this.LIZLLL = f3;
    }

    public static C0ENX LIZIZ(C0ENX c0enx, C0ENU c0enu, float f, float f2, float f3, int i) {
        if ((i & 1) != 0) {
            c0enu = c0enx.LIZ;
        }
        if ((i & 2) != 0) {
            f = c0enx.LIZIZ;
        }
        if ((i & 4) != 0) {
            f2 = c0enx.LIZJ;
        }
        if ((i & 8) != 0) {
            f3 = c0enx.LIZLLL;
        }
        return new C0ENX(c0enu, f, f2, f3);
    }
}
