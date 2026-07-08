package X;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Wxo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C840300Wxo extends AbstractC840310Wxp {
    public final String LIZ;
    public final Map<String, List<String>> LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final C0WSC LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C840300Wxo)) {
            return false;
        }
        C840300Wxo c840300Wxo = (C840300Wxo) obj;
        return Intrinsics.LJFF(this.LIZ, c840300Wxo.LIZ) && Intrinsics.LJFF(this.LIZIZ, c840300Wxo.LIZIZ) && this.LIZJ == c840300Wxo.LIZJ && Intrinsics.LJFF(this.LIZLLL, c840300Wxo.LIZLLL) && Intrinsics.LJFF(this.LJ, c840300Wxo.LJ) && Intrinsics.LJFF(this.LJFF, c840300Wxo.LJFF);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map<String, List<String>> map = this.LIZIZ;
        int iHashCode2 = (((iHashCode + (map == null ? 0 : map.hashCode())) * 31) + this.LIZJ) * 31;
        String str2 = this.LIZLLL;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJ;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        C0WSC c0wsc = this.LJFF;
        return iHashCode4 + (c0wsc != null ? c0wsc.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Response(url=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", responseHeaders=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", code=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", traceTaskId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", resolvedEventId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", performanceNode=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C840300Wxo(String str, Map<String, ? extends List<String>> map, int i, String str2, String str3, C0WSC c0wsc) {
        this.LIZ = str;
        this.LIZIZ = map;
        this.LIZJ = i;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = c0wsc;
    }
}
