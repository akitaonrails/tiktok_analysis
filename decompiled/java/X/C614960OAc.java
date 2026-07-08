package X;

import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OAc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C614960OAc implements InterfaceC636340Oxc<C614960OAc, C615070OAn> {
    public final C627660Ojc<C615070OAn> LL;
    public final C189200o6<AddYoursTopic> LLILLJJLI;
    public final C189200o6<C615190OAz> LLILLL;

    public C614960OAc() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C614960OAc)) {
            return false;
        }
        C614960OAc c614960OAc = (C614960OAc) obj;
        return Intrinsics.LJFF(this.LL, c614960OAc.LL) && Intrinsics.LJFF(this.LLILLJJLI, c614960OAc.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c614960OAc.LLILLL);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C189200o6<AddYoursTopic> c189200o6 = this.LLILLJJLI;
        int iM6hashCodeimpl = (iHashCode + (c189200o6 == null ? 0 : C189200o6.m6hashCodeimpl(c189200o6.m10unboximpl()))) * 31;
        C189200o6<C615190OAz> c189200o62 = this.LLILLL;
        return iM6hashCodeimpl + (c189200o62 != null ? C189200o6.m6hashCodeimpl(c189200o62.m10unboximpl()) : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddYoursCollectionListState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", unCollectTopicResult=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", translationResult=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<C615070OAn> getListItemState() {
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
    public final C627660Ojc<C615070OAn> getListState() {
        return this.LL;
    }

    public /* synthetic */ C614960OAc(int i) {
        this(new C627660Ojc(null, null, null, null, 15), null, null);
    }

    public C614960OAc(C627660Ojc<C615070OAn> c627660Ojc, C189200o6<AddYoursTopic> c189200o6, C189200o6<C615190OAz> c189200o62) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = c189200o6;
        this.LLILLL = c189200o62;
    }

    public static C614960OAc LIZ(C614960OAc c614960OAc, C627660Ojc c627660Ojc, C189200o6 c189200o6, C189200o6 c189200o62, int i) {
        if ((i & 1) != 0) {
            c627660Ojc = c614960OAc.LL;
        }
        if ((i & 2) != 0) {
            c189200o6 = c614960OAc.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c189200o62 = c614960OAc.LLILLL;
        }
        c614960OAc.getClass();
        return new C614960OAc(c627660Ojc, c189200o6, c189200o62);
    }
}
