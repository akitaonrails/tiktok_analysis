package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06ub, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1758306ub implements InterfaceC904740ZeS {
    public final List<C869590Y9l> LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final Long LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1758306ub)) {
            return false;
        }
        C1758306ub c1758306ub = (C1758306ub) obj;
        return Intrinsics.LJFF(this.LIZ, c1758306ub.LIZ) && this.LIZIZ == c1758306ub.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1758306ub.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1758306ub.LIZLLL);
    }

    @Override // X.InterfaceC904740ZeS
    public final String getName() {
        return "OnQueryMessageEvent";
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31;
        String str = this.LIZJ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.LIZLLL;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnQueryMessageEvent(list=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", direction=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", from=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", startIndex=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1758306ub(int i, String str, List list, Long l) {
        this.LIZ = list;
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LIZLLL = l;
    }
}
