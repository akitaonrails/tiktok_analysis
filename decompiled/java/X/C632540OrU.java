package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OrU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C632540OrU implements InterfaceC636340Oxc<C632540OrU, InterfaceC1891350zJl> {
    public final boolean LL;
    public final C291001Au<C633660OtI> LLILLJJLI;
    public final C291001Au<Unit> LLILLL;
    public final C291001Au<Boolean> LLILZ;
    public final List<Aweme> LLILZIL;
    public final C291001Au<Boolean> LLILZLL;
    public final C291001Au<Boolean> LLIZ;
    public final C627660Ojc<InterfaceC1891350zJl> LLIZLLLIL;

    public C632540OrU() {
        this(false, 255);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C632540OrU)) {
            return false;
        }
        C632540OrU c632540OrU = (C632540OrU) obj;
        return this.LL == c632540OrU.LL && Intrinsics.LJFF(this.LLILLJJLI, c632540OrU.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c632540OrU.LLILLL) && Intrinsics.LJFF(this.LLILZ, c632540OrU.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c632540OrU.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c632540OrU.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c632540OrU.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c632540OrU.LLIZLLLIL);
    }

    public final int hashCode() {
        return (((((((((((((C786410Ut5.Z2(this.LL) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode()) * 31) + this.LLIZLLLIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OriginMusicListState(needRefresh=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", pinEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", scrollTop=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", unHighlightSuccessEvent=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", fanSpotlightedVideos=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", showFanSpotlightGuide=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", fanSpotlightScrollFirst=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", listState=");
        sbLIZ.append(this.LLIZLLLIL);
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
        return this.LLIZLLLIL;
    }

    public C632540OrU(boolean z, int i) {
        C291001Au c291001Au;
        C291001Au c291001Au2;
        C291001Au c291001Au3;
        C13BV c13bv;
        C291001Au c291001Au4;
        C291001Au c291001Au5;
        C627660Ojc c627660Ojc;
        boolean z2 = (i & 1) != 0 ? false : z;
        if ((i & 2) != 0) {
            c291001Au = new C291001Au(null);
        } else {
            c291001Au = null;
        }
        if ((i & 4) != 0) {
            c291001Au2 = new C291001Au(null);
        } else {
            c291001Au2 = null;
        }
        if ((i & 8) != 0) {
            c291001Au3 = new C291001Au(null);
        } else {
            c291001Au3 = null;
        }
        if ((i & 16) != 0) {
            c13bv = C13BV.INSTANCE;
        } else {
            c13bv = null;
        }
        if ((i & 32) != 0) {
            c291001Au4 = new C291001Au(null);
        } else {
            c291001Au4 = null;
        }
        if ((i & 64) != 0) {
            c291001Au5 = new C291001Au(null);
        } else {
            c291001Au5 = null;
        }
        if ((i & 128) != 0) {
            c627660Ojc = new C627660Ojc(null, null, null, null, 15);
        } else {
            c627660Ojc = null;
        }
        this(z2, c291001Au, c291001Au2, c291001Au3, c13bv, c291001Au4, c291001Au5, c627660Ojc);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C632540OrU(boolean z, C291001Au<C633660OtI> c291001Au, C291001Au<Unit> c291001Au2, C291001Au<Boolean> c291001Au3, List<? extends Aweme> list, C291001Au<Boolean> c291001Au4, C291001Au<Boolean> c291001Au5, C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        this.LL = z;
        this.LLILLJJLI = c291001Au;
        this.LLILLL = c291001Au2;
        this.LLILZ = c291001Au3;
        this.LLILZIL = list;
        this.LLILZLL = c291001Au4;
        this.LLIZ = c291001Au5;
        this.LLIZLLLIL = c627660Ojc;
    }

    public static C632540OrU LIZ(C632540OrU c632540OrU, boolean z, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, List list, C291001Au c291001Au4, C291001Au c291001Au5, C627660Ojc c627660Ojc, int i) {
        C627660Ojc c627660Ojc2 = c627660Ojc;
        C291001Au c291001Au6 = c291001Au5;
        C291001Au c291001Au7 = c291001Au4;
        List list2 = list;
        C291001Au c291001Au8 = c291001Au3;
        C291001Au c291001Au9 = c291001Au2;
        C291001Au c291001Au10 = c291001Au;
        boolean z2 = z;
        if ((i & 1) != 0) {
            z2 = c632540OrU.LL;
        }
        if ((i & 2) != 0) {
            c291001Au10 = c632540OrU.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au9 = c632540OrU.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au8 = c632540OrU.LLILZ;
        }
        if ((i & 16) != 0) {
            list2 = c632540OrU.LLILZIL;
        }
        if ((i & 32) != 0) {
            c291001Au7 = c632540OrU.LLILZLL;
        }
        if ((i & 64) != 0) {
            c291001Au6 = c632540OrU.LLIZ;
        }
        if ((i & 128) != 0) {
            c627660Ojc2 = c632540OrU.LLIZLLLIL;
        }
        c632540OrU.getClass();
        return new C632540OrU(z2, c291001Au10, c291001Au9, c291001Au8, list2, c291001Au7, c291001Au6, c627660Ojc2);
    }
}
