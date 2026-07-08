package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00Xc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C094200Xc {
    public final List<C00AG> LIZ;
    public final EnumC094300Xd LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C094200Xc)) {
            return false;
        }
        C094200Xc c094200Xc = (C094200Xc) obj;
        return Intrinsics.LJFF(this.LIZ, c094200Xc.LIZ) && this.LIZIZ == c094200Xc.LIZIZ && this.LIZJ == c094200Xc.LIZJ && this.LIZLLL == c094200Xc.LIZLLL && this.LJ == c094200Xc.LJ && this.LJFF == c094200Xc.LJFF;
    }

    public final int hashCode() {
        return (((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ScanParams(modelTypes=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", priority=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", saveDb=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", influencedByStrategy=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", parseAssetLocation=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", skipScanAsset=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C094200Xc() {
        this(C13BV.INSTANCE, EnumC094300Xd.NORMAL, true, true, false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C094200Xc(List<? extends C00AG> list, EnumC094300Xd enumC094300Xd, boolean z, boolean z2, boolean z3, boolean z4) {
        this.LIZ = list;
        this.LIZIZ = enumC094300Xd;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = z3;
        this.LJFF = z4;
    }
}
