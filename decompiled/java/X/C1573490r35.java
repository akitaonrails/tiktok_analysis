package X;

import com.ss.android.ugc.aweme.series.feed.api.MyListResponse;
import com.ss.android.ugc.aweme.series.feed.model.MyListSceneEnum;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0r35, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1573490r35 implements InterfaceC636340Oxc<C1573490r35, C1573160r2Y> {
    public final boolean LL;
    public final MyListSceneEnum LLILLJJLI;
    public final MyListResponse LLILLL;
    public final C627660Ojc<C1573160r2Y> LLILZ;

    public C1573490r35() {
        this(null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1573490r35)) {
            return false;
        }
        C1573490r35 c1573490r35 = (C1573490r35) obj;
        return this.LL == c1573490r35.LL && this.LLILLJJLI == c1573490r35.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1573490r35.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1573490r35.LLILZ);
    }

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.LL) * 31) + this.LLILLJJLI.hashCode()) * 31;
        MyListResponse myListResponse = this.LLILLL;
        return ((iZ2 + (myListResponse == null ? 0 : myListResponse.hashCode())) * 31) + this.LLILZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeriesHistorySubPageState(isLoading=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", pageScene=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", response=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", listState=");
        sbLIZ.append(this.LLILZ);
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
        return this.LLILZ;
    }

    public /* synthetic */ C1573490r35(MyListSceneEnum myListSceneEnum, int i) {
        C627660Ojc c627660Ojc;
        myListSceneEnum = (i & 2) != 0 ? MyListSceneEnum.MY_LIST_SCENE_COLLECTION_HISTORY : myListSceneEnum;
        if ((i & 8) != 0) {
            c627660Ojc = new C627660Ojc(null, null, null, null, 15);
        } else {
            c627660Ojc = null;
        }
        this(false, myListSceneEnum, null, c627660Ojc);
    }

    public C1573490r35(boolean z, MyListSceneEnum myListSceneEnum, MyListResponse myListResponse, C627660Ojc<C1573160r2Y> c627660Ojc) {
        this.LL = z;
        this.LLILLJJLI = myListSceneEnum;
        this.LLILLL = myListResponse;
        this.LLILZ = c627660Ojc;
    }

    public static C1573490r35 LIZ(C1573490r35 c1573490r35, MyListSceneEnum myListSceneEnum, MyListResponse myListResponse, C627660Ojc c627660Ojc, int i) {
        boolean z;
        if ((i & 1) != 0) {
            z = c1573490r35.LL;
        } else {
            z = false;
        }
        if ((i & 2) != 0) {
            myListSceneEnum = c1573490r35.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            myListResponse = c1573490r35.LLILLL;
        }
        if ((i & 8) != 0) {
            c627660Ojc = c1573490r35.LLILZ;
        }
        c1573490r35.getClass();
        return new C1573490r35(z, myListSceneEnum, myListResponse, c627660Ojc);
    }
}
