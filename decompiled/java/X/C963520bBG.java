package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bBG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C963520bBG extends AbstractC963510bBF {
    public final CharSequence LJ;
    public final List<Long> LJI;
    public final Long LJII;
    public final String LIZLLL = "operation_platform";
    public final int LJFF = 1;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C963520bBG)) {
            return false;
        }
        C963520bBG c963520bBG = (C963520bBG) obj;
        return Intrinsics.LJFF(this.LIZLLL, c963520bBG.LIZLLL) && Intrinsics.LJFF(this.LJ, c963520bBG.LJ) && this.LJFF == c963520bBG.LJFF && Intrinsics.LJFF(this.LJI, c963520bBG.LJI) && Intrinsics.LJFF(this.LJII, c963520bBG.LJII);
    }

    public final int hashCode() {
        String str = this.LIZLLL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        CharSequence charSequence = this.LJ;
        int iHashCode2 = (((iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31) + this.LJFF) * 31;
        List<Long> list = this.LJI;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Long l = this.LJII;
        return iHashCode3 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakeTheStage(enterFrom=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", customWaitingPopupTitle=");
        sbLIZ.append((Object) this.LJ);
        sbLIZ.append(", triggerSource=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", performanceOrder=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", performanceDurationSec=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC963510bBF
    public final String LIZIZ() {
        return this.LIZLLL;
    }

    public C963520bBG(CharSequence charSequence, List list, Long l) {
        this.LJ = charSequence;
        this.LJI = list;
        this.LJII = l;
    }
}
