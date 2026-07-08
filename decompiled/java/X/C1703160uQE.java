package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uQE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1703160uQE implements InterfaceC1703170uQF {
    public final C1703590uQv LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1703160uQE)) {
            return false;
        }
        C1703160uQE c1703160uQE = (C1703160uQE) obj;
        return Intrinsics.LJFF(this.LIZ, c1703160uQE.LIZ) && this.LIZIZ == c1703160uQE.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Running(context=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", startedAt=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1703160uQE(C1703590uQv c1703590uQv, long j) {
        this.LIZ = c1703590uQv;
        this.LIZIZ = j;
    }
}
