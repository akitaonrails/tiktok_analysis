package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gCd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1156570gCd implements InterfaceC0148002o {
    public final C04FN LL;

    public C1156570gCd() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1156570gCd) && Intrinsics.LJFF(this.LL, ((C1156570gCd) obj).LL);
    }

    public final int hashCode() {
        C04FN c04fn = this.LL;
        if (c04fn == null) {
            return 0;
        }
        return c04fn.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PdpSkuPropSelectionState(goda2Node=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1156570gCd(C04FN c04fn) {
        this.LL = c04fn;
    }
}
