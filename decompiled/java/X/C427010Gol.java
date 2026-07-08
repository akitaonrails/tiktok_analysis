package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Gol, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C427010Gol implements InterfaceC1272104yN {
    public final C431520Gw2 LL;

    @Override // X.InterfaceC1272104yN
    public final boolean LJJIJIL() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C427010Gol) && Intrinsics.LJFF(this.LL, ((C427010Gol) obj).LL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeriesVipSubscriptionHeaderItem(header=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C427010Gol(C431520Gw2 c431520Gw2) {
        this.LL = c431520Gw2;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C427010Gol) && Intrinsics.LJFF(((C427010Gol) interfaceC1891350zJl).LL, this.LL)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return interfaceC1891350zJl instanceof C427010Gol;
    }
}
