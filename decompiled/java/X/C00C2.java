package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00C2, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00C2 {
    public final String LIZ;
    public final Object LIZIZ;
    public final String LIZJ;
    public final Map<String, Object> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00C2)) {
            return false;
        }
        C00C2 c00c2 = (C00C2) obj;
        return Intrinsics.LJFF(this.LIZ, c00c2.LIZ) && Intrinsics.LJFF(this.LIZIZ, c00c2.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c00c2.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c00c2.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Object obj = this.LIZIZ;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        String str = this.LIZJ;
        return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ToolExecutionResult(toolName=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", output=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", gotoNode=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", stateUpdates=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C00C2(String str, Map map, String str2, Object obj) {
        this.LIZ = str;
        this.LIZIZ = obj;
        this.LIZJ = str2;
        this.LIZLLL = map;
    }
}
