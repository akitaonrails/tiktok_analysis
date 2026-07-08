package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HNR, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HNR implements InterfaceC1891350zJl {
    public final C0H6M LL;
    public final C0HNS LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0HNR)) {
            return false;
        }
        C0HNR c0hnr = (C0HNR) obj;
        return Intrinsics.LJFF(this.LL, c0hnr.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0hnr.LLILLJJLI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ElementItem(element=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", viewConfig=");
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

    public C0HNR(C0H6M c0h6m, C0HNS c0hns) {
        this.LL = c0h6m;
        this.LLILLJJLI = c0hns;
    }
}
