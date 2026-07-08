package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZUX, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZUX implements InterfaceC900500ZUi {
    public final C0ZUZ LL;
    public final C462620ICe LLILLJJLI;
    public final C0IB0 LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZUX)) {
            return false;
        }
        C0ZUX c0zux = (C0ZUX) obj;
        return Intrinsics.LJFF(this.LL, c0zux.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0zux.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0zux.LLILLL);
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShareLiveEventReceiveSkeletonLayoutPowerItem(content=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", backgroundConfig=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", skeletonLayoutData=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC900500ZUi
    public final C462620ICe LIZJ() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC461380I7k
    public final C0IB0 LLILII() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC900500ZUi
    public final C0ZUZ getContent() {
        return this.LL;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C461450I7r.LIZ(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C900490ZUh.LIZ(this, interfaceC1891350zJl);
    }

    public C0ZUX(C0ZUZ c0zuz, C462620ICe c462620ICe, C0IB0 c0ib0) {
        this.LL = c0zuz;
        this.LLILLJJLI = c462620ICe;
        this.LLILLL = c0ib0;
    }
}
