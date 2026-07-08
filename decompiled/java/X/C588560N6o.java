package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0N6o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C588560N6o extends AbstractC588570N6p {
    public final List<InterfaceC648350Pbt> LIZ;
    public final boolean LIZIZ;
    public final C587060N0u LIZJ;

    public C588560N6o() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C588560N6o)) {
            return false;
        }
        C588560N6o c588560N6o = (C588560N6o) obj;
        return Intrinsics.LJFF(this.LIZ, c588560N6o.LIZ) && this.LIZIZ == c588560N6o.LIZIZ && Intrinsics.LJFF(this.LIZJ, c588560N6o.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31;
        C587060N0u c587060N0u = this.LIZJ;
        return iHashCode + (c587060N0u == null ? 0 : c587060N0u.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DataIntent(playableList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", ignoreStateCheck=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", playExtraState=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C588560N6o(List list, boolean z, C587060N0u c587060N0u, int i) {
        z = (i & 2) != 0 ? false : z;
        c587060N0u = (i & 4) != 0 ? C587060N0u.LIZJ : c587060N0u;
        this.LIZ = list;
        this.LIZIZ = z;
        this.LIZJ = c587060N0u;
    }
}
