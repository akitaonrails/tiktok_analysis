package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Gsg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C429440Gsg implements InterfaceC1891350zJl {
    public final InterfaceC1021730ch9 LL;
    public final String LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C429440Gsg)) {
            return false;
        }
        C429440Gsg c429440Gsg = (C429440Gsg) obj;
        return Intrinsics.LJFF(this.LL, c429440Gsg.LL) && Intrinsics.LJFF(this.LLILLJJLI, c429440Gsg.LLILLJJLI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        String str = this.LLILLJJLI;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TileItem(sizeAdapter=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", picUri=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C429440Gsg(InterfaceC1021730ch9 interfaceC1021730ch9, String str) {
        this.LL = interfaceC1021730ch9;
        this.LLILLJJLI = str;
    }
}
