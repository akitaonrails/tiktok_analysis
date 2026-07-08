package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Qgs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C676920Qgs {
    public final boolean LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final boolean LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C676920Qgs)) {
            return false;
        }
        C676920Qgs c676920Qgs = (C676920Qgs) obj;
        return this.LIZ == c676920Qgs.LIZ && Intrinsics.LJFF(this.LIZIZ, c676920Qgs.LIZIZ) && this.LIZJ == c676920Qgs.LIZJ && this.LIZLLL == c676920Qgs.LIZLLL && this.LJ == c676920Qgs.LJ && this.LJFF == c676920Qgs.LJFF && this.LJI == c676920Qgs.LJI && this.LJII == c676920Qgs.LJII;
    }

    public final int hashCode() {
        return (((((((((((((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + C786410Ut5.Z2(this.LJII);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CollapseDecision(canCollapse=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", reason=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isFromMall=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isSingleTab=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", topBarHideEnable=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", simpleTabEnable=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", followFingerEnable=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", fixEnable=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C676920Qgs(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = z2;
        this.LIZLLL = z3;
        this.LJ = z4;
        this.LJFF = z5;
        this.LJI = z6;
        this.LJII = z7;
    }
}
