package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04C1, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04C1 {
    public final C04C0 LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C04C1)) {
            return false;
        }
        C04C1 c04c1 = (C04C1) obj;
        return Intrinsics.LJFF(this.LIZ, c04c1.LIZ) && this.LIZIZ == c04c1.LIZIZ;
    }

    public final int hashCode() {
        C04C0 c04c0 = this.LIZ;
        return ((c04c0 == null ? 0 : c04c0.hashCode()) * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaPdpBottomBarData(bottomBarVO=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", shouldFallback=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C04C1(C04C0 c04c0, boolean z) {
        this.LIZ = c04c0;
        this.LIZIZ = z;
    }
}
