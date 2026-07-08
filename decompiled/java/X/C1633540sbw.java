package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sbw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1633540sbw implements InterfaceC1633610sc3 {
    public final long LIZ;
    public final C1633600sc2 LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1633540sbw)) {
            return false;
        }
        C1633540sbw c1633540sbw = (C1633540sbw) obj;
        return C19990113Jj.LJII(this.LIZ, c1633540sbw.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1633540sbw.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Completed(totalTime=");
        sbLIZ.append((Object) C19990113Jj.LJIJJ(this.LIZ));
        sbLIZ.append(", metricsReport=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode();
    }

    public C1633540sbw(long j, C1633600sc2 c1633600sc2) {
        this.LIZ = j;
        this.LIZIZ = c1633600sc2;
    }
}
