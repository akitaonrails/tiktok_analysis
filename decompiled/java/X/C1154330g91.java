package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0g91, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1154330g91 {
    public final C1784480wXO LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1154330g91)) {
            return false;
        }
        C1154330g91 c1154330g91 = (C1154330g91) obj;
        return Intrinsics.LJFF(this.LIZ, c1154330g91.LIZ) && this.LIZIZ == c1154330g91.LIZIZ;
    }

    public final int hashCode() {
        C1784480wXO c1784480wXO = this.LIZ;
        return ((c1784480wXO == null ? 0 : c1784480wXO.hashCode()) * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReadResult(item=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", coldStartLoad=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1154330g91(C1784480wXO c1784480wXO, boolean z) {
        this.LIZ = c1784480wXO;
        this.LIZIZ = z;
    }
}
