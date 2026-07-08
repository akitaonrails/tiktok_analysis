package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DBF, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DBF extends C0DBM {
    public final Map<String, String> LIZ;
    public final C0DBL LIZIZ;
    public final String LIZJ = "\n";
    public final C0DBM LIZLLL = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0DBF)) {
            return false;
        }
        C0DBF c0dbf = (C0DBF) obj;
        return Intrinsics.LJFF(this.LIZ, c0dbf.LIZ) && this.LIZIZ == c0dbf.LIZIZ && Intrinsics.LJFF(this.LIZJ, c0dbf.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0dbf.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        C0DBM c0dbm = this.LIZLLL;
        return iHashCode + (c0dbm == null ? 0 : c0dbm.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CodeMappedJoined(mappings=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", outputMode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", separator=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", fallback=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0DBF(Map map, C0DBL c0dbl) {
        this.LIZ = map;
        this.LIZIZ = c0dbl;
    }
}
