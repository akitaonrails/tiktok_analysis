package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04jD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1178104jD {
    public final List<String> LIZ;
    public final List<String> LIZIZ;
    public final AbstractC1443905kz LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1178104jD)) {
            return false;
        }
        C1178104jD c1178104jD = (C1178104jD) obj;
        return Intrinsics.LJFF(this.LIZ, c1178104jD.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1178104jD.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1178104jD.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FcpEngineResult(inputs=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", winners=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", behavior=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1178104jD(List<String> list, List<String> list2, AbstractC1443905kz abstractC1443905kz) {
        this.LIZ = list;
        this.LIZIZ = list2;
        this.LIZJ = abstractC1443905kz;
    }
}
