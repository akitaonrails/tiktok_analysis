package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qdQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1557580qdQ {
    public final C1557590qdR LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1557580qdQ)) {
            return false;
        }
        C1557580qdQ c1557580qdQ = (C1557580qdQ) obj;
        return Intrinsics.LJFF(this.LIZ, c1557580qdQ.LIZ) && this.LIZIZ == c1557580qdQ.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PendingRequest(context=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", feedOpen=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1557580qdQ(C1557590qdR c1557590qdR, boolean z) {
        this.LIZ = c1557590qdR;
        this.LIZIZ = z;
    }
}
