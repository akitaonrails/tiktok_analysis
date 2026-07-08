package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aCq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C926060aCq {
    public final AbstractC926030aCn LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C926060aCq)) {
            return false;
        }
        C926060aCq c926060aCq = (C926060aCq) obj;
        return Intrinsics.LJFF(this.LIZ, c926060aCq.LIZ) && this.LIZIZ == c926060aCq.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Result(command=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", needWaitWidget=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C926060aCq(C926120aCw c926120aCw, boolean z) {
        this.LIZ = c926120aCw;
        this.LIZIZ = z;
    }
}
