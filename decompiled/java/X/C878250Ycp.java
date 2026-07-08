package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ycp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C878250Ycp {
    public final int LIZ;
    public final C0I25 LIZIZ;
    public final String LIZJ;
    public final Map<String, String> LIZLLL;
    public final Map<String, String> LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C878250Ycp)) {
            return false;
        }
        C878250Ycp c878250Ycp = (C878250Ycp) obj;
        return this.LIZ == c878250Ycp.LIZ && Intrinsics.LJFF(this.LIZIZ, c878250Ycp.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c878250Ycp.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c878250Ycp.LIZLLL) && Intrinsics.LJFF(this.LJ, c878250Ycp.LJ);
    }

    public final int hashCode() {
        return (((((((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TaskResult(msgType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", content=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", ext=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", localExt=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C878250Ycp(int i, C0I25 c0i25, String str, Map<String, String> map, Map<String, String> map2) {
        this.LIZ = i;
        this.LIZIZ = c0i25;
        this.LIZJ = str;
        this.LIZLLL = map;
        this.LJ = map2;
    }
}
