package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00YD, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00YD {
    public final long LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00YD)) {
            return false;
        }
        C00YD c00yd = (C00YD) obj;
        return this.LIZ == c00yd.LIZ && Intrinsics.LJFF(this.LIZIZ, c00yd.LIZIZ);
    }

    public final int hashCode() {
        return (C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PendingFirstRealDisplay(displayTimeMs=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C00YD(long j, String str) {
        this.LIZ = j;
        this.LIZIZ = str;
    }
}
