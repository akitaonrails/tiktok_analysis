package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YQf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C873950YQf {
    public final AbstractC874080YQs LIZ;
    public final List<C869450Y8x> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C873950YQf)) {
            return false;
        }
        C873950YQf c873950YQf = (C873950YQf) obj;
        return Intrinsics.LJFF(this.LIZ, c873950YQf.LIZ) && Intrinsics.LJFF(this.LIZIZ, c873950YQf.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        List<C869450Y8x> list = this.LIZIZ;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("KvTableQueryInfo(query=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", order=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C873950YQf(AbstractC874080YQs abstractC874080YQs, List<C869450Y8x> list) {
        this.LIZ = abstractC874080YQs;
        this.LIZIZ = list;
    }
}
