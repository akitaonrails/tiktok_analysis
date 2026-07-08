package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uSR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1704530uSR implements InterfaceC1704540uSS {
    public final C553310Lmz LIZ;
    public final C05XL<Unit> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1704530uSR)) {
            return false;
        }
        C1704530uSR c1704530uSR = (C1704530uSR) obj;
        return Intrinsics.LJFF(this.LIZ, c1704530uSR.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1704530uSR.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ObserverStart(policy=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", ready=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1704530uSR(C553310Lmz c553310Lmz, C099F c099f) {
        this.LIZ = c553310Lmz;
        this.LIZIZ = c099f;
    }
}
