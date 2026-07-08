package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.MultiGuestLayoutExtra;

/* JADX INFO: renamed from: X.0axg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C955100axg extends AbstractC955360ay6 {
    public final C955320ay2 LIZ;
    public final List<C957030b0n> LIZIZ;
    public final MultiGuestLayoutExtra LIZJ;
    public final C955230axt LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C955100axg)) {
            return false;
        }
        C955100axg c955100axg = (C955100axg) obj;
        return Intrinsics.LJFF(this.LIZ, c955100axg.LIZ) && Intrinsics.LJFF(this.LIZIZ, c955100axg.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c955100axg.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c955100axg.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        MultiGuestLayoutExtra multiGuestLayoutExtra = this.LIZJ;
        return ((iHashCode + (multiGuestLayoutExtra == null ? 0 : multiGuestLayoutExtra.hashCode())) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LayoutInfoUpdated(layoutState=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", spotList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", multiGuestLayoutExtra=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", source=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C955100axg(C955320ay2 c955320ay2, List<C957030b0n> list, MultiGuestLayoutExtra multiGuestLayoutExtra, C955230axt c955230axt) {
        this.LIZ = c955320ay2;
        this.LIZIZ = list;
        this.LIZJ = multiGuestLayoutExtra;
        this.LIZLLL = c955230axt;
    }
}
