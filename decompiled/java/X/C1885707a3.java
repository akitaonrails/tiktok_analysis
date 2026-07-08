package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07a3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1885707a3 {
    public final boolean LIZ;
    public final List<Long> LIZIZ;
    public final boolean LIZJ;

    public C1885707a3() {
        this(false, (List) null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1885707a3)) {
            return false;
        }
        C1885707a3 c1885707a3 = (C1885707a3) obj;
        return this.LIZ == c1885707a3.LIZ && Intrinsics.LJFF(this.LIZIZ, c1885707a3.LIZIZ) && this.LIZJ == c1885707a3.LIZJ;
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LIZ) * 31;
        List<Long> list = this.LIZIZ;
        return ((iZ2 + (list == null ? 0 : list.hashCode())) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LegacyInsertParams(isViewerWishesMode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", viewerWishesGiftIds=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isPadLandscape=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1885707a3(boolean z, List list, int i) {
        this((i & 1) != 0 ? false : z, (List<Long>) ((i & 2) != 0 ? null : list), false);
    }

    public C1885707a3(boolean z, List<Long> list, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = list;
        this.LIZJ = z2;
    }
}
