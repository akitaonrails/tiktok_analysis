package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0g8f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1154110g8f {
    public final String LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1154110g8f)) {
            return false;
        }
        C1154110g8f c1154110g8f = (C1154110g8f) obj;
        return Intrinsics.LJFF(this.LIZ, c1154110g8f.LIZ) && this.LIZIZ == c1154110g8f.LIZIZ;
    }

    public final int hashCode() {
        String str = this.LIZ;
        return ((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FECashierPreloadInput(schema=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isRetry=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1154110g8f(String str, boolean z) {
        this.LIZ = str;
        this.LIZIZ = z;
    }
}
