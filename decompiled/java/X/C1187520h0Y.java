package X;

import com.ss.android.ugc.aweme.poi.detail.videolist.model.PoiDetailVideoListModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0h0Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1187520h0Y implements InterfaceC636340Oxc<C1187520h0Y, InterfaceC1891350zJl> {
    public final PoiDetailVideoListModel LL;
    public final C627660Ojc<InterfaceC1891350zJl> LLILLJJLI;

    public C1187520h0Y() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1187520h0Y)) {
            return false;
        }
        C1187520h0Y c1187520h0Y = (C1187520h0Y) obj;
        return Intrinsics.LJFF(this.LL, c1187520h0Y.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1187520h0Y.LLILLJJLI);
    }

    public final int hashCode() {
        PoiDetailVideoListModel poiDetailVideoListModel = this.LL;
        return ((poiDetailVideoListModel == null ? 0 : poiDetailVideoListModel.hashCode()) * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiVideoListItemState(videoList=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", listState=");
        sbLIZ.append(this.LLILLJJLI);
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
        return this.LLILLJJLI;
    }

    public /* synthetic */ C1187520h0Y(int i) {
        this(null, new C627660Ojc(null, null, null, null, 15));
    }

    public C1187520h0Y(PoiDetailVideoListModel poiDetailVideoListModel, C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        this.LL = poiDetailVideoListModel;
        this.LLILLJJLI = c627660Ojc;
    }
}
