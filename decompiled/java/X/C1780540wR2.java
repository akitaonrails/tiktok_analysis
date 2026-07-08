package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wR2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1780540wR2 {
    public final int LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final float LJI;
    public final List<Integer> LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1780540wR2)) {
            return false;
        }
        C1780540wR2 c1780540wR2 = (C1780540wR2) obj;
        return this.LIZ == c1780540wR2.LIZ && this.LIZIZ == c1780540wR2.LIZIZ && this.LIZJ == c1780540wR2.LIZJ && this.LIZLLL == c1780540wR2.LIZLLL && this.LJ == c1780540wR2.LJ && this.LJFF == c1780540wR2.LJFF && Float.compare(this.LJI, c1780540wR2.LJI) == 0 && Intrinsics.LJFF(this.LJII, c1780540wR2.LJII);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ZoomAbilitySnapshot(cameraType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", cameraPosition=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", supportZoomV2=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", useShaderZoom=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", supportZoom=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", supportSmooth=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", maxZoom=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", ratios=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        int iZ2 = ((((((((((((this.LIZ * 31) + this.LIZIZ) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + Float.floatToIntBits(this.LJI)) * 31;
        List<Integer> list = this.LJII;
        return iZ2 + (list == null ? 0 : list.hashCode());
    }

    public C1780540wR2(int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, float f, List<Integer> list) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = z3;
        this.LJFF = z4;
        this.LJI = f;
        this.LJII = list;
    }
}
