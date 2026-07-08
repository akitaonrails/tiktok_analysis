package X;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04mm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1200204mm {
    public final C1170104hv LIZ;
    public final List<String> LIZIZ;
    public final Map<String, String> LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1200204mm)) {
            return false;
        }
        C1200204mm c1200204mm = (C1200204mm) obj;
        return Intrinsics.LJFF(this.LIZ, c1200204mm.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1200204mm.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1200204mm.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1200204mm.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommitDiagnostics(result=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", conflictSlotIds=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", acceptedParentBySlot=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", treeDebugString=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1200204mm(C1170104hv c1170104hv, List<String> list, Map<String, String> map, String str) {
        this.LIZ = c1170104hv;
        this.LIZIZ = list;
        this.LIZJ = map;
        this.LIZLLL = str;
    }
}
