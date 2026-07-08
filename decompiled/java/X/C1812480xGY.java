package X;

import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xGY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1812480xGY extends AbstractC1812500xGa {
    public final C1812850xH9 LIZ;
    public final ViewGroup LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1812480xGY)) {
            return false;
        }
        C1812480xGY c1812480xGY = (C1812480xGY) obj;
        return Intrinsics.LJFF(this.LIZ, c1812480xGY.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1812480xGY.LIZIZ) && this.LIZJ == c1812480xGY.LIZJ;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        ViewGroup viewGroup = this.LIZIZ;
        return ((iHashCode + (viewGroup == null ? 0 : viewGroup.hashCode())) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UseBoard(item=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", dslContainer=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isFromCapsule=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1812480xGY(C1812850xH9 c1812850xH9, ViewGroup viewGroup, boolean z) {
        this.LIZ = c1812850xH9;
        this.LIZIZ = viewGroup;
        this.LIZJ = z;
    }
}
