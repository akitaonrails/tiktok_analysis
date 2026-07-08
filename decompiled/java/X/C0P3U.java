package X;

import com.ss.android.ugc.aweme.vibefeed.viewmodel.VibeFeedUser;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0P3U, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0P3U implements InterfaceC636340Oxc<C0P3U, C607780Nse> {
    public final C291001Au<String> LL;
    public final boolean LLILLJJLI;
    public final List<String> LLILLL;
    public final List<VibeFeedUser> LLILZ;
    public final C627660Ojc<C607780Nse> LLILZIL;

    public C0P3U() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0P3U)) {
            return false;
        }
        C0P3U c0p3u = (C0P3U) obj;
        return Intrinsics.LJFF(this.LL, c0p3u.LL) && this.LLILLJJLI == c0p3u.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c0p3u.LLILLL) && Intrinsics.LJFF(this.LLILZ, c0p3u.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c0p3u.LLILZIL);
    }

    public final int hashCode() {
        C291001Au<String> c291001Au = this.LL;
        int iHashCode = (((c291001Au == null ? 0 : c291001Au.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31;
        List<String> list = this.LLILLL;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<VibeFeedUser> list2 = this.LLILZ;
        return ((iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31) + this.LLILZIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VibeDetailListState(feedIdChanged=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", permissionFailed=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", joinedFeedUids=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", finishedUsers=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", listState=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<C607780Nse> getListItemState() {
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
    public final C627660Ojc<C607780Nse> getListState() {
        return this.LLILZIL;
    }

    public /* synthetic */ C0P3U(int i) {
        this(null, false, null, null, new C627660Ojc(null, null, null, null, 15));
    }

    public C0P3U(C291001Au<String> c291001Au, boolean z, List<String> list, List<VibeFeedUser> list2, C627660Ojc<C607780Nse> c627660Ojc) {
        this.LL = c291001Au;
        this.LLILLJJLI = z;
        this.LLILLL = list;
        this.LLILZ = list2;
        this.LLILZIL = c627660Ojc;
    }

    public static C0P3U LIZ(C0P3U c0p3u, C291001Au c291001Au, boolean z, List list, List list2, C627660Ojc c627660Ojc, int i) {
        C627660Ojc c627660Ojc2 = c627660Ojc;
        List list3 = list2;
        List list4 = list;
        boolean z2 = z;
        C291001Au c291001Au2 = c291001Au;
        if ((i & 1) != 0) {
            c291001Au2 = c0p3u.LL;
        }
        if ((i & 2) != 0) {
            z2 = c0p3u.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            list4 = c0p3u.LLILLL;
        }
        if ((i & 8) != 0) {
            list3 = c0p3u.LLILZ;
        }
        if ((i & 16) != 0) {
            c627660Ojc2 = c0p3u.LLILZIL;
        }
        c0p3u.getClass();
        return new C0P3U(c291001Au2, z2, list4, list3, c627660Ojc2);
    }
}
