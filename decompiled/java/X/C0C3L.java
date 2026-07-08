package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0C3L, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C3L {
    public final String LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0C3L)) {
            return false;
        }
        C0C3L c0c3l = (C0C3L) obj;
        return Intrinsics.LJFF(this.LIZ, c0c3l.LIZ) && this.LIZIZ == c0c3l.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PendingAsrQuery(text=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", roundId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0C3L(String str, long j) {
        this.LIZ = str;
        this.LIZIZ = j;
    }
}
