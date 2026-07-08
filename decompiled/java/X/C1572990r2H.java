package X;

import com.ss.android.ugc.aweme.series.feed.profile.model.SeriesProfileTabResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0r2H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1572990r2H implements InterfaceC636340Oxc<C1572990r2H, C1572840r22> {
    public final long LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public final SeriesProfileTabResponse LLILZIL;
    public final C627660Ojc<C1572840r22> LLILZLL;

    public C1572990r2H() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1572990r2H)) {
            return false;
        }
        C1572990r2H c1572990r2H = (C1572990r2H) obj;
        return this.LL == c1572990r2H.LL && this.LLILLJJLI == c1572990r2H.LLILLJJLI && this.LLILLL == c1572990r2H.LLILLL && this.LLILZ == c1572990r2H.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1572990r2H.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1572990r2H.LLILZLL);
    }

    public final int hashCode() {
        int iY2 = ((((((C786410Ut5.Y2(this.LL) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31;
        SeriesProfileTabResponse seriesProfileTabResponse = this.LLILZIL;
        return ((iY2 + (seriesProfileTabResponse == null ? 0 : seriesProfileTabResponse.hashCode())) * 31) + this.LLILZLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeriesProfileTabState(creatorUid=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isBlock=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isMyProfile=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isFromMainState=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", response=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", listState=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<C1572840r22> getListItemState() {
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
    public final C627660Ojc<C1572840r22> getListState() {
        return this.LLILZLL;
    }

    public /* synthetic */ C1572990r2H(int i) {
        this(0L, false, false, false, null, new C627660Ojc(null, null, null, null, 15));
    }

    public C1572990r2H(long j, boolean z, boolean z2, boolean z3, SeriesProfileTabResponse seriesProfileTabResponse, C627660Ojc<C1572840r22> c627660Ojc) {
        this.LL = j;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = z3;
        this.LLILZIL = seriesProfileTabResponse;
        this.LLILZLL = c627660Ojc;
    }

    public static C1572990r2H LIZ(C1572990r2H c1572990r2H, long j, boolean z, boolean z2, boolean z3, SeriesProfileTabResponse seriesProfileTabResponse, C627660Ojc c627660Ojc, int i) {
        C627660Ojc c627660Ojc2 = c627660Ojc;
        boolean z4 = z3;
        boolean z5 = z2;
        boolean z6 = z;
        SeriesProfileTabResponse seriesProfileTabResponse2 = seriesProfileTabResponse;
        long j2 = j;
        if ((i & 1) != 0) {
            j2 = c1572990r2H.LL;
        }
        if ((i & 2) != 0) {
            z6 = c1572990r2H.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            z5 = c1572990r2H.LLILLL;
        }
        if ((i & 8) != 0) {
            z4 = c1572990r2H.LLILZ;
        }
        if ((i & 16) != 0) {
            seriesProfileTabResponse2 = c1572990r2H.LLILZIL;
        }
        if ((i & 32) != 0) {
            c627660Ojc2 = c1572990r2H.LLILZLL;
        }
        c1572990r2H.getClass();
        return new C1572990r2H(j2, z6, z5, z4, seriesProfileTabResponse2, c627660Ojc2);
    }
}
