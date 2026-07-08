package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EtB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C378790EtB {
    public final Function0<Unit> LIZ;
    public final Function0<Unit> LIZIZ;
    public final Function0<Unit> LIZJ;
    public final Function0<Unit> LIZLLL;
    public final Function0<Unit> LJ;
    public final Function1<Boolean, Unit> LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C378790EtB)) {
            return false;
        }
        C378790EtB c378790EtB = (C378790EtB) obj;
        return Intrinsics.LJFF(this.LIZ, c378790EtB.LIZ) && Intrinsics.LJFF(this.LIZIZ, c378790EtB.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c378790EtB.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c378790EtB.LIZLLL) && Intrinsics.LJFF(this.LJ, c378790EtB.LJ) && Intrinsics.LJFF(this.LJFF, c378790EtB.LJFF);
    }

    public final int hashCode() {
        return (((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CaptionFormatActions(onPanelClose=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", onDefaultSelected=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", onAllUpperSelected=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", onAllLowerSelected=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", onCapitalizeSelected=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", onPuncStateChanged=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C378790EtB(C378750Et7 c378750Et7, C378810EtD c378810EtD, C378820EtE c378820EtE, C378830EtF c378830EtF, C378840EtG c378840EtG, C378770Et9 c378770Et9) {
        this.LIZ = c378750Et7;
        this.LIZIZ = c378810EtD;
        this.LIZJ = c378820EtE;
        this.LIZLLL = c378830EtF;
        this.LJ = c378840EtG;
        this.LJFF = c378770Et9;
    }
}
