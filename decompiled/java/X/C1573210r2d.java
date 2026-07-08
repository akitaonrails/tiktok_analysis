package X;

import com.ss.android.ugc.aweme.series.feed.api.SeriesCenterListResponse;
import com.ss.android.ugc.aweme.series.feed.model.SeriesCenterCenterScene;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0r2d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1573210r2d implements InterfaceC636340Oxc<C1573210r2d, InterfaceC1891350zJl> {
    public final boolean LL;
    public final String LLILLJJLI;
    public final SeriesCenterCenterScene LLILLL;
    public final List<SeriesCenterCenterScene> LLILZ;
    public final SeriesCenterListResponse LLILZIL;
    public final C627660Ojc<InterfaceC1891350zJl> LLILZLL;

    public C1573210r2d() {
        this(null, null, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1573210r2d)) {
            return false;
        }
        C1573210r2d c1573210r2d = (C1573210r2d) obj;
        return this.LL == c1573210r2d.LL && Intrinsics.LJFF(this.LLILLJJLI, c1573210r2d.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1573210r2d.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1573210r2d.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1573210r2d.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1573210r2d.LLILZLL);
    }

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.LL) * 31) + this.LLILLJJLI.hashCode()) * 31;
        SeriesCenterCenterScene seriesCenterCenterScene = this.LLILLL;
        int iHashCode = (((iZ2 + (seriesCenterCenterScene == null ? 0 : seriesCenterCenterScene.hashCode())) * 31) + this.LLILZ.hashCode()) * 31;
        SeriesCenterListResponse seriesCenterListResponse = this.LLILZIL;
        return ((iHashCode + (seriesCenterListResponse != null ? seriesCenterListResponse.hashCode() : 0)) * 31) + this.LLILZLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeriesCenterSubPageState(isLoading=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", pageCategory=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", pageScene=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", scenes=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", response=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", listState=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<InterfaceC1891350zJl> getListItemState() {
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
    public final C627660Ojc<InterfaceC1891350zJl> getListState() {
        return this.LLILZLL;
    }

    public C1573210r2d(String str, SeriesCenterCenterScene seriesCenterCenterScene, int i) {
        C13BV c13bv;
        C627660Ojc c627660Ojc;
        SeriesCenterCenterScene seriesCenterCenterScene2 = seriesCenterCenterScene;
        String str2 = (i & 2) != 0 ? "" : str;
        seriesCenterCenterScene2 = (i & 4) != 0 ? null : seriesCenterCenterScene2;
        if ((i & 8) != 0) {
            c13bv = C13BV.INSTANCE;
        } else {
            c13bv = null;
        }
        if ((i & 32) != 0) {
            c627660Ojc = new C627660Ojc(null, null, null, null, 15);
        } else {
            c627660Ojc = null;
        }
        this(false, str2, seriesCenterCenterScene2, c13bv, null, c627660Ojc);
    }

    public C1573210r2d(boolean z, String str, SeriesCenterCenterScene seriesCenterCenterScene, List<SeriesCenterCenterScene> list, SeriesCenterListResponse seriesCenterListResponse, C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = seriesCenterCenterScene;
        this.LLILZ = list;
        this.LLILZIL = seriesCenterListResponse;
        this.LLILZLL = c627660Ojc;
    }

    public static C1573210r2d LIZ(C1573210r2d c1573210r2d, String str, SeriesCenterCenterScene seriesCenterCenterScene, List list, SeriesCenterListResponse seriesCenterListResponse, C627660Ojc c627660Ojc, int i) {
        boolean z;
        C627660Ojc c627660Ojc2 = c627660Ojc;
        SeriesCenterListResponse seriesCenterListResponse2 = seriesCenterListResponse;
        List list2 = list;
        SeriesCenterCenterScene seriesCenterCenterScene2 = seriesCenterCenterScene;
        String str2 = str;
        if ((i & 1) != 0) {
            z = c1573210r2d.LL;
        } else {
            z = false;
        }
        if ((i & 2) != 0) {
            str2 = c1573210r2d.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            seriesCenterCenterScene2 = c1573210r2d.LLILLL;
        }
        if ((i & 8) != 0) {
            list2 = c1573210r2d.LLILZ;
        }
        if ((i & 16) != 0) {
            seriesCenterListResponse2 = c1573210r2d.LLILZIL;
        }
        if ((i & 32) != 0) {
            c627660Ojc2 = c1573210r2d.LLILZLL;
        }
        c1573210r2d.getClass();
        return new C1573210r2d(z, str2, seriesCenterCenterScene2, list2, seriesCenterListResponse2, c627660Ojc2);
    }
}
