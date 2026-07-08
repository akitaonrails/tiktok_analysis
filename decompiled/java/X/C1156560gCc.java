package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gCc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1156560gCc implements InterfaceC0148002o {
    public final C04FN LL;

    public C1156560gCc() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1156560gCc) && Intrinsics.LJFF(this.LL, ((C1156560gCc) obj).LL);
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
        sbLIZ.append("PdpSkuPropDropdownState(goda2Node=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1156560gCc(C04FN c04fn) {
        this.LL = c04fn;
    }
}
