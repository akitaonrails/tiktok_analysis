package X;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00AF, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00AF {
    public final String LIZ;
    public final List<C00AM> LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final boolean LJ;
    public final Set<C00AG> LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00AF)) {
            return false;
        }
        C00AF c00af = (C00AF) obj;
        return Intrinsics.LJFF(this.LIZ, c00af.LIZ) && Intrinsics.LJFF(this.LIZIZ, c00af.LIZIZ) && Float.compare(this.LIZJ, c00af.LIZJ) == 0 && Float.compare(this.LIZLLL, c00af.LIZLLL) == 0 && this.LJ == c00af.LJ && Intrinsics.LJFF(this.LJFF, c00af.LJFF);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ScanResultData(assetId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", tags=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", qualityScore=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", sharpnessScore=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isPorn=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", modelsScanned=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C00AF() {
        this("", C13BV.INSTANCE, 0.0f, 0.0f, false, C08CX.INSTANCE);
    }

    public final int hashCode() {
        return (((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + Float.floatToIntBits(this.LIZJ)) * 31) + Float.floatToIntBits(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + this.LJFF.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C00AF(String str, List<C00AM> list, float f, float f2, boolean z, Set<? extends C00AG> set) {
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = f;
        this.LIZLLL = f2;
        this.LJ = z;
        this.LJFF = set;
    }
}
