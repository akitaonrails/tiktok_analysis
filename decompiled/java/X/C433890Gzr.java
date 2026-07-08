package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Gzr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C433890Gzr {
    public final boolean LIZ;
    public final C384050F3z LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C433890Gzr)) {
            return false;
        }
        C433890Gzr c433890Gzr = (C433890Gzr) obj;
        return this.LIZ == c433890Gzr.LIZ && Intrinsics.LJFF(this.LIZIZ, c433890Gzr.LIZIZ);
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlaceholderUiState(visible=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", tuxShape=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C433890Gzr(boolean z, C384050F3z c384050F3z) {
        this.LIZ = z;
        this.LIZIZ = c384050F3z;
    }
}
