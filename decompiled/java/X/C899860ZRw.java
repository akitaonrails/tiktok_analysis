package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZRw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C899860ZRw implements InterfaceC899890ZRz {
    public final C0ZXS LL;
    public final C0IB0 LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C899860ZRw)) {
            return false;
        }
        C899860ZRw c899860ZRw = (C899860ZRw) obj;
        return Intrinsics.LJFF(this.LL, c899860ZRw.LL) && Intrinsics.LJFF(this.LLILLJJLI, c899860ZRw.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CallLogSendSkeletonLayoutPowerItem(bubbleConfig=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", skeletonLayoutData=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC899890ZRz
    public final C0ZXS LJII() {
        return this.LL;
    }

    @Override // X.InterfaceC461380I7k
    public final C0IB0 LLILII() {
        return this.LLILLJJLI;
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
        return C899870ZRx.LIZ(this, interfaceC1891350zJl);
    }

    public C899860ZRw(C0ZXS c0zxs, C0IB0 c0ib0) {
        this.LL = c0zxs;
        this.LLILLJJLI = c0ib0;
    }
}
