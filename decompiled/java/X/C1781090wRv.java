package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wRv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1781090wRv implements InterfaceC1781110wRx {
    public final C1785460wYy LIZ;
    public final List<InterfaceC1785530wZ5> LIZIZ;
    public final C1778060wN2 LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1781090wRv)) {
            return false;
        }
        C1781090wRv c1781090wRv = (C1781090wRv) obj;
        return Intrinsics.LJFF(this.LIZ, c1781090wRv.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1781090wRv.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1781090wRv.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        C1778060wN2 c1778060wN2 = this.LIZJ;
        return iHashCode + (c1778060wN2 == null ? 0 : c1778060wN2.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ApplyState(state=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", effects=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", commandRequest=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1781090wRv(C1785460wYy c1785460wYy, List<? extends InterfaceC1785530wZ5> list, C1778060wN2 c1778060wN2) {
        this.LIZ = c1785460wYy;
        this.LIZIZ = list;
        this.LIZJ = c1778060wN2;
    }
}
