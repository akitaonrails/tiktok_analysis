package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gRQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1165740gRQ implements InterfaceC636340Oxc<C1165740gRQ, C1165730gRP> {
    public final C627660Ojc<C1165730gRP> LL;
    public final AbstractC1623806Xk<C626160OhC> LLILLJJLI;
    public final AbstractC1623806Xk<C626160OhC> LLILLL;
    public final AbstractC1623806Xk<C626160OhC> LLILZ;

    public C1165740gRQ() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1165740gRQ)) {
            return false;
        }
        C1165740gRQ c1165740gRQ = (C1165740gRQ) obj;
        return Intrinsics.LJFF(this.LL, c1165740gRQ.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1165740gRQ.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1165740gRQ.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1165740gRQ.LLILZ);
    }

    public final int hashCode() {
        return (((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DramaGuestLandingState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", loadMoreState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", loadLatestState=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", refreshState=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<C1165730gRP> getListItemState() {
        return C627260Oiy.LIZ(this);
    }

    @Override // X.InterfaceC627270Oiz
    public final C627660Ojc<C1165730gRP> getListState() {
        return this.LL;
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getLoadLatestState() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getLoadMoreState() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getRefreshState() {
        return this.LLILZ;
    }

    public /* synthetic */ C1165740gRQ(int i) {
        C627660Ojc c627660Ojc = new C627660Ojc(null, null, null, null, 15);
        C491101vh c491101vh = C491101vh.LIZ;
        this(c627660Ojc, c491101vh, c491101vh, c491101vh);
    }

    public C1165740gRQ(C627660Ojc<C1165730gRP> c627660Ojc, AbstractC1623806Xk<C626160OhC> abstractC1623806Xk, AbstractC1623806Xk<C626160OhC> abstractC1623806Xk2, AbstractC1623806Xk<C626160OhC> abstractC1623806Xk3) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = abstractC1623806Xk;
        this.LLILLL = abstractC1623806Xk2;
        this.LLILZ = abstractC1623806Xk3;
    }
}
