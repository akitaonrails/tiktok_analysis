package X;

import com.ss.android.ugc.aweme.poi.detail.amusement.model.PoiAmusementDataModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0O1l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C612710O1l implements InterfaceC636340Oxc<C612710O1l, InterfaceC1891350zJl> {
    public final PoiAmusementDataModel LL;
    public final C627660Ojc<InterfaceC1891350zJl> LLILLJJLI;

    public C612710O1l() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C612710O1l)) {
            return false;
        }
        C612710O1l c612710O1l = (C612710O1l) obj;
        return Intrinsics.LJFF(this.LL, c612710O1l.LL) && Intrinsics.LJFF(this.LLILLJJLI, c612710O1l.LLILLJJLI);
    }

    public final int hashCode() {
        PoiAmusementDataModel poiAmusementDataModel = this.LL;
        return ((poiAmusementDataModel == null ? 0 : poiAmusementDataModel.hashCode()) * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiAmusementListItemState(amusementModel=");
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

    public /* synthetic */ C612710O1l(int i) {
        this(null, new C627660Ojc(null, null, null, null, 15));
    }

    public C612710O1l(PoiAmusementDataModel poiAmusementDataModel, C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        this.LL = poiAmusementDataModel;
        this.LLILLJJLI = c627660Ojc;
    }
}
