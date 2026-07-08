package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00C1, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00C1<T> {
    public final T LIZ;
    public final String LIZIZ;
    public final Map<String, Object> LIZJ;

    public C00C1() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00C1)) {
            return false;
        }
        C00C1 c00c1 = (C00C1) obj;
        return Intrinsics.LJFF(this.LIZ, c00c1.LIZ) && Intrinsics.LJFF(this.LIZIZ, c00c1.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c00c1.LIZJ);
    }

    public final int hashCode() {
        T t = this.LIZ;
        int iHashCode = (t == null ? 0 : t.hashCode()) * 31;
        String str = this.LIZIZ;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ToolResponse(value=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", gotoNode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", stateUpdates=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C00C1(Object obj) {
        Map<String, Object> mapLJ = C2097608Jq.LJ();
        this.LIZ = obj;
        this.LIZIZ = null;
        this.LIZJ = mapLJ;
    }
}
