package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wRu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1781080wRu {
    public final C1785460wYy LIZ;
    public final List<InterfaceC1785530wZ5> LIZIZ;
    public final C861890XrX LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1781080wRu)) {
            return false;
        }
        C1781080wRu c1781080wRu = (C1781080wRu) obj;
        return Intrinsics.LJFF(this.LIZ, c1781080wRu.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1781080wRu.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1781080wRu.LIZJ) && this.LIZLLL == c1781080wRu.LIZLLL;
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        C861890XrX c861890XrX = this.LIZJ;
        return ((iHashCode + (c861890XrX == null ? 0 : c861890XrX.hashCode())) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReduceResult(state=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", effects=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", pendingSwitchKey=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", consumedTargetCreatorId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1781080wRu(C1785460wYy c1785460wYy, List<? extends InterfaceC1785530wZ5> list, C861890XrX c861890XrX, boolean z) {
        this.LIZ = c1785460wYy;
        this.LIZIZ = list;
        this.LIZJ = c861890XrX;
        this.LIZLLL = z;
    }
}
