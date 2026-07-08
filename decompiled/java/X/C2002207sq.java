package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07sq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2002207sq implements InterfaceC0148002o {
    public final C1175020ggO LL;

    public C2002207sq() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2002207sq) && Intrinsics.LJFF(this.LL, ((C2002207sq) obj).LL);
    }

    public final int hashCode() {
        C1175020ggO c1175020ggO = this.LL;
        if (c1175020ggO == null) {
            return 0;
        }
        return c1175020ggO.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiMapModeMapState(targetPoiData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2002207sq(C1175020ggO c1175020ggO) {
        this.LL = c1175020ggO;
    }
}
