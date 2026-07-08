package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05lZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1447505lZ extends AbstractC1446905lT {
    public final List<String> LIZ;
    public final List<String> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1447505lZ)) {
            return false;
        }
        C1447505lZ c1447505lZ = (C1447505lZ) obj;
        return Intrinsics.LJFF(this.LIZ, c1447505lZ.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1447505lZ.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateTree(normalComponents=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", standardComponents=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1447505lZ(List<String> list, List<String> list2) {
        this.LIZ = list;
        this.LIZIZ = list2;
    }
}
