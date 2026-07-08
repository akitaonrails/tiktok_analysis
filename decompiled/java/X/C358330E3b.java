package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0E3b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C358330E3b {
    public final C0E3W LIZ;
    public final long LIZIZ;
    public final long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C358330E3b)) {
            return false;
        }
        C358330E3b c358330E3b = (C358330E3b) obj;
        return Intrinsics.LJFF(this.LIZ, c358330E3b.LIZ) && this.LIZIZ == c358330E3b.LIZIZ && this.LIZJ == c358330E3b.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RangeData(segment=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", start=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", end=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C358330E3b(C0E3W c0e3w, long j, long j2) {
        this.LIZ = c0e3w;
        this.LIZIZ = j;
        this.LIZJ = j2;
    }
}
