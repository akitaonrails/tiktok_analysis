package X;

import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OCb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C615470OCb implements InterfaceC636340Oxc<C615470OCb, C0O2K> {
    public final List<C615560OCk> LL;
    public final User LLILLJJLI;
    public final C627660Ojc<C0O2K> LLILLL;

    public C615470OCb() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C615470OCb)) {
            return false;
        }
        C615470OCb c615470OCb = (C615470OCb) obj;
        return Intrinsics.LJFF(this.LL, c615470OCb.LL) && Intrinsics.LJFF(this.LLILLJJLI, c615470OCb.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c615470OCb.LLILLL);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        User user = this.LLILLJJLI;
        return ((iHashCode + (user == null ? 0 : user.hashCode())) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HubListVMState(tabTopicCountInfoList=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", viewedUser=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", listState=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<C0O2K> getListItemState() {
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
    public final C627660Ojc<C0O2K> getListState() {
        return this.LLILLL;
    }

    public C615470OCb(int i) {
        this(C13BV.INSTANCE, null, new C627660Ojc(null, null, null, null, 15));
    }

    public C615470OCb(List<C615560OCk> list, User user, C627660Ojc<C0O2K> c627660Ojc) {
        this.LL = list;
        this.LLILLJJLI = user;
        this.LLILLL = c627660Ojc;
    }

    public static C615470OCb LIZ(C615470OCb c615470OCb, List list, User user, C627660Ojc c627660Ojc, int i) {
        if ((i & 1) != 0) {
            list = c615470OCb.LL;
        }
        if ((i & 2) != 0) {
            user = c615470OCb.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c627660Ojc = c615470OCb.LLILLL;
        }
        c615470OCb.getClass();
        return new C615470OCb(list, user, c627660Ojc);
    }
}
