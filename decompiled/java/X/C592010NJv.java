package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NJv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C592010NJv {
    public final C595260NWi LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C592010NJv)) {
            return false;
        }
        C592010NJv c592010NJv = (C592010NJv) obj;
        return Intrinsics.LJFF(this.LIZ, c592010NJv.LIZ) && this.LIZIZ == c592010NJv.LIZIZ;
    }

    public final int hashCode() {
        C595260NWi c595260NWi = this.LIZ;
        return ((c595260NWi == null ? 0 : c595260NWi.hashCode()) * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FetchResult(response=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", fetchAsReport=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C592010NJv(C595260NWi c595260NWi, boolean z) {
        this.LIZ = c595260NWi;
        this.LIZIZ = z;
    }
}
