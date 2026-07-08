package X;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00A6, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00A6 {
    public final String LIZ;
    public final String LIZIZ;
    public final List<C00A7> LIZJ;
    public final String LIZLLL;
    public final boolean LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00A6)) {
            return false;
        }
        C00A6 c00a6 = (C00A6) obj;
        return Intrinsics.LJFF(this.LIZ, c00a6.LIZ) && Intrinsics.LJFF(this.LIZIZ, c00a6.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c00a6.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c00a6.LIZLLL) && this.LJ == c00a6.LJ;
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        String str = this.LIZLLL;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ClusterPipelineTrace(clusterId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", strategyName=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", stages=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", llmThemeName=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", llmSuccess=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final C00A7 LIZ(String str) {
        C00A7 next;
        Iterator<C00A7> it2 = this.LIZJ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.LIZ, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }

    public C00A6(String str, String str2, boolean z, String str3, List list) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = list;
        this.LIZLLL = str3;
        this.LJ = z;
    }
}
