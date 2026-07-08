package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03HA, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03HA implements InterfaceC1891350zJl {
    public final String LL;
    public final String LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C03HA)) {
            return false;
        }
        C03HA c03ha = (C03HA) obj;
        return Intrinsics.LJFF(this.LL, c03ha.LL) && Intrinsics.LJFF(this.LLILLJJLI, c03ha.LLILLJJLI);
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
        sbLIZ.append("SaveCardPCIItem(content=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", icon=");
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

    public C03HA(String str, String str2) {
        this.LL = str;
        this.LLILLJJLI = str2;
    }
}
