package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04y7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1270504y7 {
    public final C1270404y6 LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1270504y7)) {
            return false;
        }
        C1270504y7 c1270504y7 = (C1270504y7) obj;
        return Intrinsics.LJFF(this.LIZ, c1270504y7.LIZ) && this.LIZIZ == c1270504y7.LIZIZ;
    }

    public final int hashCode() {
        C1270404y6 c1270404y6 = this.LIZ;
        return ((c1270404y6 == null ? 0 : c1270404y6.hashCode()) * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DefaultLocationCache(location=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", timestampMs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1270504y7() {
        this(null, 0L);
    }

    public C1270504y7(C1270404y6 c1270404y6, long j) {
        this.LIZ = c1270404y6;
        this.LIZIZ = j;
    }
}
