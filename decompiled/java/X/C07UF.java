package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07UF, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07UF {
    public static final /* synthetic */ int LIZJ = 0;
    public final List<Long> LIZ;
    public final List<String> LIZIZ;

    public C07UF() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C07UF)) {
            return false;
        }
        C07UF c07uf = (C07UF) obj;
        return Intrinsics.LJFF(this.LIZ, c07uf.LIZ) && Intrinsics.LJFF(this.LIZIZ, c07uf.LIZIZ);
    }

    public final int hashCode() {
        List<Long> list = this.LIZ;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.LIZIZ;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RefreshTaskContext(touchpointIds=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", prototypeList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07UF(List<Long> list, List<String> list2) {
        this.LIZ = list;
        this.LIZIZ = list2;
    }
}
