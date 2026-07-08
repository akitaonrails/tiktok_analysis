package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ggC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1174900ggC {
    public final String LIZ;
    public final String LIZIZ;
    public final Map<String, String> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1174900ggC)) {
            return false;
        }
        C1174900ggC c1174900ggC = (C1174900ggC) obj;
        return Intrinsics.LJFF(this.LIZ, c1174900ggC.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1174900ggC.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1174900ggC.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        Map<String, String> map = this.LIZJ;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LsStandardUiShowTrackParams(currentPage=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", currentScene=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", extraParams=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1174900ggC(String str, String str2, Map<String, String> map) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = map;
    }
}
