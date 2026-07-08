package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.050g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12828050g implements InterfaceC1891350zJl {
    public final boolean LL;
    public final boolean LLILLJJLI;

    public C12828050g() {
        this(false, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12828050g)) {
            return false;
        }
        C12828050g c12828050g = (C12828050g) obj;
        return this.LL == c12828050g.LL && this.LLILLJJLI == c12828050g.LLILLJJLI;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LL) * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FanGroupCreateItem(reachLimit=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", showDivider=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(this, interfaceC1891350zJl);
    }

    public C12828050g(boolean z, boolean z2) {
        this.LL = z;
        this.LLILLJJLI = z2;
    }
}
