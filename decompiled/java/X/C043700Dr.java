package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00Dr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C043700Dr<T> {
    public final List<T> LIZ;
    public final List<T> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C043700Dr)) {
            return false;
        }
        C043700Dr c043700Dr = (C043700Dr) obj;
        return Intrinsics.LJFF(this.LIZ, c043700Dr.LIZ) && Intrinsics.LJFF(this.LIZIZ, c043700Dr.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BatchOperationResult(successes=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", failures=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C043700Dr(List<? extends T> list, List<? extends T> list2) {
        this.LIZ = list;
        this.LIZIZ = list2;
    }
}
