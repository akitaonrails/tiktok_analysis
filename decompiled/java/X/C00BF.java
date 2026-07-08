package X;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00BF, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00BF {
    public final boolean LIZ;
    public final Set<String> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00BF)) {
            return false;
        }
        C00BF c00bf = (C00BF) obj;
        return this.LIZ == c00bf.LIZ && Intrinsics.LJFF(this.LIZIZ, c00bf.LIZIZ);
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCWorkflowInitContext(isRestore=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", firstRunNodeIds=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C00BF() {
        this(false, C08CX.INSTANCE);
    }

    public C00BF(boolean z, Set<String> set) {
        this.LIZ = z;
        this.LIZIZ = set;
    }
}
