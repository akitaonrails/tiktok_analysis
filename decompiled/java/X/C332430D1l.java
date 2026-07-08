package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.ConvertStyleItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D1l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C332430D1l implements InterfaceC636340Oxc<C332430D1l, C06X1> {
    public final C627660Ojc<C06X1> LL;
    public final int LLILLJJLI;
    public final boolean LLILLL;
    public final ConvertStyleItem LLILZ;

    public C332430D1l() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C332430D1l)) {
            return false;
        }
        C332430D1l c332430D1l = (C332430D1l) obj;
        return Intrinsics.LJFF(this.LL, c332430D1l.LL) && this.LLILLJJLI == c332430D1l.LLILLJJLI && this.LLILLL == c332430D1l.LLILLL && Intrinsics.LJFF(this.LLILZ, c332430D1l.LLILZ);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LL.hashCode() * 31) + this.LLILLJJLI) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31;
        ConvertStyleItem convertStyleItem = this.LLILZ;
        return iHashCode + (convertStyleItem == null ? 0 : convertStyleItem.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoAIImageConvertStyleListState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", index=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", checked=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", hasSelected=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<C06X1> getListItemState() {
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
    public final C627660Ojc<C06X1> getListState() {
        return this.LL;
    }

    public /* synthetic */ C332430D1l(int i) {
        this(new C627660Ojc(null, null, null, null, 15), -1, false, null);
    }

    public C332430D1l(C627660Ojc<C06X1> c627660Ojc, int i, boolean z, ConvertStyleItem convertStyleItem) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = i;
        this.LLILLL = z;
        this.LLILZ = convertStyleItem;
    }

    public static C332430D1l LIZ(C332430D1l c332430D1l, int i, boolean z, ConvertStyleItem convertStyleItem, int i2) {
        C627660Ojc<C06X1> c627660Ojc;
        if ((i2 & 1) != 0) {
            c627660Ojc = c332430D1l.LL;
        } else {
            c627660Ojc = null;
        }
        if ((i2 & 2) != 0) {
            i = c332430D1l.LLILLJJLI;
        }
        if ((i2 & 4) != 0) {
            z = c332430D1l.LLILLL;
        }
        if ((i2 & 8) != 0) {
            convertStyleItem = c332430D1l.LLILZ;
        }
        c332430D1l.getClass();
        return new C332430D1l(c627660Ojc, i, z, convertStyleItem);
    }
}
