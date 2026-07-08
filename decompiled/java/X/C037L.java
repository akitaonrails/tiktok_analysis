package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.037L, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C037L<T> {
    public final C05XL<T> LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C037L)) {
            return false;
        }
        C037L c037l = (C037L) obj;
        return Intrinsics.LJFF(this.LIZ, c037l.LIZ) && this.LIZIZ == c037l.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InFlightRequest(deferred=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", startTimeMs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C037L(long j, C099F c099f) {
        this.LIZ = c099f;
        this.LIZIZ = j;
    }
}
