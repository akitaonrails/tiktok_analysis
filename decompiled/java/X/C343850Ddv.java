package X;

import com.ss.android.ugc.aweme.addyours.model.UserInvitee;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ddv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C343850Ddv implements InterfaceC636340Oxc<C343850Ddv, C317650Ccl> {
    public final C627660Ojc<C317650Ccl> LL;
    public final List<UserInvitee> LLILLJJLI;

    public C343850Ddv() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C343850Ddv)) {
            return false;
        }
        C343850Ddv c343850Ddv = (C343850Ddv) obj;
        return Intrinsics.LJFF(this.LL, c343850Ddv.LL) && Intrinsics.LJFF(this.LLILLJJLI, c343850Ddv.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserRecommendState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", insertUser=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<C317650Ccl> getListItemState() {
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
    public final C627660Ojc<C317650Ccl> getListState() {
        return this.LL;
    }

    public C343850Ddv(int i) {
        this(new C627660Ojc(null, null, null, null, 15), C13BV.INSTANCE);
    }

    public C343850Ddv(C627660Ojc<C317650Ccl> c627660Ojc, List<UserInvitee> list) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = list;
    }

    public static C343850Ddv LIZ(C343850Ddv c343850Ddv, C627660Ojc c627660Ojc, List list, int i) {
        if ((i & 1) != 0) {
            c627660Ojc = c343850Ddv.LL;
        }
        if ((i & 2) != 0) {
            list = c343850Ddv.LLILLJJLI;
        }
        c343850Ddv.getClass();
        return new C343850Ddv(c627660Ojc, list);
    }
}
