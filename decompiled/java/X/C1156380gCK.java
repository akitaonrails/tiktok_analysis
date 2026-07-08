package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gCK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1156380gCK extends AbstractC1156400gCM {
    public final C676770Qgd LIZ;
    public final Map<String, Object> LIZIZ;

    public C1156380gCK() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1156380gCK)) {
            return false;
        }
        C1156380gCK c1156380gCK = (C1156380gCK) obj;
        return Intrinsics.LJFF(this.LIZ, c1156380gCK.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1156380gCK.LIZIZ);
    }

    public final int hashCode() {
        C676770Qgd c676770Qgd = this.LIZ;
        return ((c676770Qgd == null ? 0 : c676770Qgd.hashCode()) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failure(error=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", eventMap=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1156380gCK(C676770Qgd c676770Qgd) {
        Map<String, Object> mapLJ = C2097608Jq.LJ();
        this.LIZ = c676770Qgd;
        this.LIZIZ = mapLJ;
    }
}
