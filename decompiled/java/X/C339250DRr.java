package X;

import com.ss.android.ugc.profile.business.ur.following.ui.managefollow.ManageFollowItem;
import com.ss.android.ugc.profile.business.ur.following.ui.managefollow.SimpleUser;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DRr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C339250DRr implements InterfaceC636340Oxc<C339250DRr, ManageFollowItem> {
    public final C291001Au<Set<SimpleUser>> LL;
    public final C627660Ojc<ManageFollowItem> LLILLJJLI;

    public C339250DRr() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C339250DRr)) {
            return false;
        }
        C339250DRr c339250DRr = (C339250DRr) obj;
        return Intrinsics.LJFF(this.LL, c339250DRr.LL) && Intrinsics.LJFF(this.LLILLJJLI, c339250DRr.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ManageFollowState(selectedAuthorListEvent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", listState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<ManageFollowItem> getListItemState() {
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
    public final C627660Ojc<ManageFollowItem> getListState() {
        return this.LLILLJJLI;
    }

    public /* synthetic */ C339250DRr(int i) {
        this(new C291001Au(new LinkedHashSet()), new C627660Ojc(null, null, null, null, 15));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C339250DRr(C291001Au<? extends Set<SimpleUser>> c291001Au, C627660Ojc<ManageFollowItem> c627660Ojc) {
        this.LL = c291001Au;
        this.LLILLJJLI = c627660Ojc;
    }

    public static C339250DRr LIZ(C339250DRr c339250DRr, C291001Au c291001Au, C627660Ojc c627660Ojc, int i) {
        if ((i & 1) != 0) {
            c291001Au = c339250DRr.LL;
        }
        if ((i & 2) != 0) {
            c627660Ojc = c339250DRr.LLILLJJLI;
        }
        c339250DRr.getClass();
        return new C339250DRr(c291001Au, c627660Ojc);
    }
}
