package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gCz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1156790gCz {
    public final String LIZ;
    public final long LIZIZ;
    public final long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1156790gCz)) {
            return false;
        }
        C1156790gCz c1156790gCz = (C1156790gCz) obj;
        return Intrinsics.LJFF(this.LIZ, c1156790gCz.LIZ) && this.LIZIZ == c1156790gCz.LIZIZ && this.LIZJ == c1156790gCz.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExternalSegment(path=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", firstSegOffset=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", mediaSize=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1156790gCz(String str, long j, long j2) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = j2;
    }
}
