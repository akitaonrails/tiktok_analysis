package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gBC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1155680gBC implements InterfaceC0148002o {
    public final C1177630gkb LL;

    public C1155680gBC() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1155680gBC) && Intrinsics.LJFF(this.LL, ((C1155680gBC) obj).LL);
    }

    public final int hashCode() {
        C1177630gkb c1177630gkb = this.LL;
        if (c1177630gkb == null) {
            return 0;
        }
        return c1177630gkb.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiRevisitMapState(highLightPoiData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1155680gBC(C1177630gkb c1177630gkb) {
        this.LL = c1177630gkb;
    }
}
