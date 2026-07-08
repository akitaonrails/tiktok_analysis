package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sRP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1627010sRP extends AbstractC1626950sRJ {
    public final List<InterfaceC1626470sQX> LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1627010sRP)) {
            return false;
        }
        C1627010sRP c1627010sRP = (C1627010sRP) obj;
        return Intrinsics.LJFF(this.LIZ, c1627010sRP.LIZ) && this.LIZIZ == c1627010sRP.LIZIZ && this.LIZJ == c1627010sRP.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EffectList(list=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", defaultPosition=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", fromCache=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1627010sRP(List<? extends InterfaceC1626470sQX> list, int i, boolean z) {
        this.LIZ = list;
        this.LIZIZ = i;
        this.LIZJ = z;
    }
}
