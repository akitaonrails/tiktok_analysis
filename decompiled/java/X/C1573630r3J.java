package X;

import com.ss.android.ugc.aweme.minidrama.common.component.model.MyListBanner;
import com.ss.android.ugc.aweme.series.feed.api.MyListResponse;
import com.ss.android.ugc.aweme.series.feed.model.MyListSceneEnum;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0r3J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1573630r3J implements InterfaceC636340Oxc<C1573630r3J, C1573160r2Y> {
    public final MyListSceneEnum LL;
    public final int LLILLJJLI;
    public final MyListResponse LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL;
    public final MyListBanner LLILZLL;
    public final boolean LLIZ;
    public final C627660Ojc<C1573160r2Y> LLIZLLLIL;

    public C1573630r3J() {
        this(null, 255);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1573630r3J)) {
            return false;
        }
        C1573630r3J c1573630r3J = (C1573630r3J) obj;
        return this.LL == c1573630r3J.LL && this.LLILLJJLI == c1573630r3J.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1573630r3J.LLILLL) && this.LLILZ == c1573630r3J.LLILZ && this.LLILZIL == c1573630r3J.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c1573630r3J.LLILZLL) && this.LLIZ == c1573630r3J.LLIZ && Intrinsics.LJFF(this.LLIZLLLIL, c1573630r3J.LLIZLLLIL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI) * 31;
        MyListResponse myListResponse = this.LLILLL;
        int iHashCode2 = (((((iHashCode + (myListResponse == null ? 0 : myListResponse.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31;
        MyListBanner myListBanner = this.LLILZLL;
        return ((((iHashCode2 + (myListBanner != null ? myListBanner.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLIZ)) * 31) + this.LLIZLLLIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeriesHistoryMainPageState(selectedScene=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", pageIndex=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", response=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", bannerShowReported=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", bannerClosed=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", cachedBanner=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", bannerApproved=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", listState=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<C1573160r2Y> getListItemState() {
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
    public final C627660Ojc<C1573160r2Y> getListState() {
        return this.LLIZLLLIL;
    }

    public /* synthetic */ C1573630r3J(MyListSceneEnum myListSceneEnum, int i) {
        int i2;
        C627660Ojc c627660Ojc;
        MyListSceneEnum myListSceneEnum2 = (i & 1) != 0 ? MyListSceneEnum.MY_LIST_SCENE_COLLECTION_HISTORY : myListSceneEnum;
        if ((i & 2) != 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        if ((i & 128) != 0) {
            c627660Ojc = new C627660Ojc(null, null, null, null, 15);
        } else {
            c627660Ojc = null;
        }
        this(myListSceneEnum2, i2, null, false, false, null, false, c627660Ojc);
    }

    public C1573630r3J(MyListSceneEnum myListSceneEnum, int i, MyListResponse myListResponse, boolean z, boolean z2, MyListBanner myListBanner, boolean z3, C627660Ojc<C1573160r2Y> c627660Ojc) {
        this.LL = myListSceneEnum;
        this.LLILLJJLI = i;
        this.LLILLL = myListResponse;
        this.LLILZ = z;
        this.LLILZIL = z2;
        this.LLILZLL = myListBanner;
        this.LLIZ = z3;
        this.LLIZLLLIL = c627660Ojc;
    }

    public static C1573630r3J LIZ(C1573630r3J c1573630r3J, MyListSceneEnum myListSceneEnum, int i, boolean z, boolean z2, MyListBanner myListBanner, boolean z3, int i2) {
        MyListResponse myListResponse;
        boolean z4 = z3;
        MyListBanner myListBanner2 = myListBanner;
        boolean z5 = z2;
        int i3 = i;
        boolean z6 = z;
        MyListSceneEnum myListSceneEnum2 = myListSceneEnum;
        if ((i2 & 1) != 0) {
            myListSceneEnum2 = c1573630r3J.LL;
        }
        if ((i2 & 2) != 0) {
            i3 = c1573630r3J.LLILLJJLI;
        }
        C627660Ojc<C1573160r2Y> c627660Ojc = null;
        if ((i2 & 4) != 0) {
            myListResponse = c1573630r3J.LLILLL;
        } else {
            myListResponse = null;
        }
        if ((i2 & 8) != 0) {
            z6 = c1573630r3J.LLILZ;
        }
        if ((i2 & 16) != 0) {
            z5 = c1573630r3J.LLILZIL;
        }
        if ((i2 & 32) != 0) {
            myListBanner2 = c1573630r3J.LLILZLL;
        }
        if ((i2 & 64) != 0) {
            z4 = c1573630r3J.LLIZ;
        }
        if ((i2 & 128) != 0) {
            c627660Ojc = c1573630r3J.LLIZLLLIL;
        }
        c1573630r3J.getClass();
        return new C1573630r3J(myListSceneEnum2, i3, myListResponse, z6, z5, myListBanner2, z4, c627660Ojc);
    }
}
