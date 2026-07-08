package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NUj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C594750NUj {
    public final C05P1<Boolean> LIZ;
    public final C05P1<Boolean> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C594750NUj)) {
            return false;
        }
        C594750NUj c594750NUj = (C594750NUj) obj;
        return Intrinsics.LJFF(this.LIZ, c594750NUj.LIZ) && Intrinsics.LJFF(this.LIZIZ, c594750NUj.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BatteryState(isPowerSaveModeEnable=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", allowBackgroundUsage=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C594750NUj(C05P0 c05p0, C05P0 c05p02) {
        this.LIZ = c05p0;
        this.LIZIZ = c05p02;
    }
}
