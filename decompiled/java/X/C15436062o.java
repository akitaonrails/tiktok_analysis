package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.062o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15436062o<T> {
    public final AnonymousClass0957<C189200o6<T>> LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15436062o)) {
            return false;
        }
        C15436062o c15436062o = (C15436062o) obj;
        return Intrinsics.LJFF(this.LIZ, c15436062o.LIZ) && this.LIZIZ == c15436062o.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InFlightEntry(deferred=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", timestamp=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C15436062o(long j, C099F c099f) {
        this.LIZ = c099f;
        this.LIZIZ = j;
    }
}
