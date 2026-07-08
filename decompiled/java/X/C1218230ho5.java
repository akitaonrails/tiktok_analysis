package X;

import com.ss.android.ugc.aweme.account.login.twostep.AuthDeviceResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ho5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1218230ho5 implements InterfaceC636340Oxc<C1218230ho5, C1218200ho2> {
    public final C627660Ojc<C1218200ho2> LL;
    public final AbstractC1623806Xk<AuthDeviceResponse> LLILLJJLI;
    public final AbstractC1623806Xk<AuthDeviceResponse> LLILLL;

    public C1218230ho5() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1218230ho5)) {
            return false;
        }
        C1218230ho5 c1218230ho5 = (C1218230ho5) obj;
        return Intrinsics.LJFF(this.LL, c1218230ho5.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1218230ho5.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1218230ho5.LLILLL);
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TrustedDeviceVMState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", loadingPageData=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", actionResponse=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<C1218200ho2> getListItemState() {
        return C627260Oiy.LIZ(this);
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getLoadLatestState() {
        return C627260Oiy.LIZIZ(this);
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getLoadMoreState() {
        return C627260Oiy.LIZJ(this);
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getRefreshState() {
        return C627260Oiy.LIZLLL(this);
    }

    @Override // X.InterfaceC627270Oiz
    public final C627660Ojc<C1218200ho2> getListState() {
        return this.LL;
    }

    public /* synthetic */ C1218230ho5(int i) {
        C627660Ojc c627660Ojc = new C627660Ojc(null, null, null, null, 15);
        C491101vh c491101vh = C491101vh.LIZ;
        this(c627660Ojc, c491101vh, c491101vh);
    }

    public C1218230ho5(C627660Ojc<C1218200ho2> c627660Ojc, AbstractC1623806Xk<AuthDeviceResponse> abstractC1623806Xk, AbstractC1623806Xk<AuthDeviceResponse> abstractC1623806Xk2) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = abstractC1623806Xk;
        this.LLILLL = abstractC1623806Xk2;
    }

    public static C1218230ho5 LIZ(C1218230ho5 c1218230ho5, C627660Ojc c627660Ojc, AbstractC1623806Xk abstractC1623806Xk, AbstractC1623806Xk abstractC1623806Xk2, int i) {
        if ((i & 1) != 0) {
            c627660Ojc = c1218230ho5.LL;
        }
        if ((i & 2) != 0) {
            abstractC1623806Xk = c1218230ho5.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            abstractC1623806Xk2 = c1218230ho5.LLILLL;
        }
        c1218230ho5.getClass();
        return new C1218230ho5(c627660Ojc, abstractC1623806Xk, abstractC1623806Xk2);
    }
}
