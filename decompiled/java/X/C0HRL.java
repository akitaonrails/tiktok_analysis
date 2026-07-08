package X;

import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HRL, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HRL {
    public final Set<Pair<Integer, String>> LIZ;
    public final List<C0HQC> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0HRL)) {
            return false;
        }
        C0HRL c0hrl = (C0HRL) obj;
        return Intrinsics.LJFF(this.LIZ, c0hrl.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0hrl.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixStudioIdDropdownData(selectedIds=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", idConfigurations=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0HRL(List list, Set set) {
        this.LIZ = set;
        this.LIZIZ = list;
    }
}
