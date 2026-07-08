package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0r2N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1573050r2N implements InterfaceC636340Oxc<C1573050r2N, InterfaceC1891350zJl> {
    public final EnumC1574970r5T LL;
    public final Aweme LLILLJJLI;
    public final C291001Au<Boolean> LLILLL;
    public final C627660Ojc<InterfaceC1891350zJl> LLILZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C1573050r2N() {
        this(null, 0 == true ? 1 : 0, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1573050r2N)) {
            return false;
        }
        C1573050r2N c1573050r2N = (C1573050r2N) obj;
        return this.LL == c1573050r2N.LL && Intrinsics.LJFF(this.LLILLJJLI, c1573050r2N.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1573050r2N.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1573050r2N.LLILZ);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        Aweme aweme = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (aweme == null ? 0 : aweme.hashCode())) * 31;
        C291001Au<Boolean> c291001Au = this.LLILLL;
        return ((iHashCode2 + (c291001Au != null ? c291001Au.hashCode() : 0)) * 31) + this.LLILZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeaturedVideoFeaturedVideoState(loadingStatus=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", selectedFeatureVideo=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", createNewVideo=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", listState=");
        sbLIZ.append(this.LLILZ);
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
        return this.LLILZ;
    }

    public /* synthetic */ C1573050r2N(EnumC1574970r5T enumC1574970r5T, Aweme aweme, int i) {
        C627660Ojc c627660Ojc;
        enumC1574970r5T = (i & 1) != 0 ? EnumC1574970r5T.DEFAULT : enumC1574970r5T;
        aweme = (i & 2) != 0 ? null : aweme;
        if ((i & 8) != 0) {
            c627660Ojc = new C627660Ojc(null, null, null, null, 15);
        } else {
            c627660Ojc = null;
        }
        this(enumC1574970r5T, aweme, null, c627660Ojc);
    }

    public C1573050r2N(EnumC1574970r5T enumC1574970r5T, Aweme aweme, C291001Au<Boolean> c291001Au, C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        this.LL = enumC1574970r5T;
        this.LLILLJJLI = aweme;
        this.LLILLL = c291001Au;
        this.LLILZ = c627660Ojc;
    }

    public static C1573050r2N LIZ(C1573050r2N c1573050r2N, EnumC1574970r5T enumC1574970r5T, Aweme aweme, C291001Au c291001Au, C627660Ojc c627660Ojc, int i) {
        if ((i & 1) != 0) {
            enumC1574970r5T = c1573050r2N.LL;
        }
        if ((i & 2) != 0) {
            aweme = c1573050r2N.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au = c1573050r2N.LLILLL;
        }
        if ((i & 8) != 0) {
            c627660Ojc = c1573050r2N.LLILZ;
        }
        c1573050r2N.getClass();
        return new C1573050r2N(enumC1574970r5T, aweme, c291001Au, c627660Ojc);
    }
}
