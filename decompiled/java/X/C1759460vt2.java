package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vt2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1759460vt2 {
    public final EnumC1759580vtE LIZ;
    public final C1759590vtF LIZIZ;
    public final Integer LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final Function0<Unit> LJFF;
    public final C0NLF LJI;

    public C1759460vt2() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1759460vt2)) {
            return false;
        }
        C1759460vt2 c1759460vt2 = (C1759460vt2) obj;
        return this.LIZ == c1759460vt2.LIZ && Intrinsics.LJFF(this.LIZIZ, c1759460vt2.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1759460vt2.LIZJ) && this.LIZLLL == c1759460vt2.LIZLLL && this.LJ == c1759460vt2.LJ && Intrinsics.LJFF(this.LJFF, c1759460vt2.LJFF) && this.LJI == c1759460vt2.LJI;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        C1759590vtF c1759590vtF = this.LIZIZ;
        int iHashCode2 = (iHashCode + (c1759590vtF == null ? 0 : c1759590vtF.hashCode())) * 31;
        Integer num = this.LIZJ;
        int iHashCode3 = (((((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31;
        Function0<Unit> function0 = this.LJFF;
        int iHashCode4 = (iHashCode3 + (function0 == null ? 0 : function0.hashCode())) * 31;
        C0NLF c0nlf = this.LJI;
        return iHashCode4 + (c0nlf != null ? c0nlf.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LynxPopupState(location=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", lynxPopupData=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", animateDirection=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", needShow=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", keepBottomContainer=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", keepContainerCallback=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", popUpType=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1759460vt2(EnumC1759580vtE enumC1759580vtE, C1759590vtF c1759590vtF, Integer num, boolean z, boolean z2, Function0 function0, C0NLF c0nlf, int i) {
        num = (i & 4) != 0 ? null : num;
        z = (i & 8) != 0 ? true : z;
        z2 = (i & 16) != 0 ? false : z2;
        function0 = (i & 32) != 0 ? null : function0;
        c0nlf = (i & 64) != 0 ? null : c0nlf;
        this.LIZ = enumC1759580vtE;
        this.LIZIZ = c1759590vtF;
        this.LIZJ = num;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = function0;
        this.LJI = c0nlf;
    }
}
