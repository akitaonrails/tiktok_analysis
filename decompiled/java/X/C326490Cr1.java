package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Cr1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C326490Cr1 implements InterfaceC636340Oxc<C326490Cr1, C209300rL> {
    public final C627660Ojc<C209300rL> LL;
    public final boolean LLILLJJLI;
    public final String LLILLL;

    public C326490Cr1() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C326490Cr1)) {
            return false;
        }
        C326490Cr1 c326490Cr1 = (C326490Cr1) obj;
        return Intrinsics.LJFF(this.LL, c326490Cr1.LL) && this.LLILLJJLI == c326490Cr1.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c326490Cr1.LLILLL);
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoAIVideoFeedListState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", sessionId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<C209300rL> getListItemState() {
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
    public final C627660Ojc<C209300rL> getListState() {
        return this.LL;
    }

    public /* synthetic */ C326490Cr1(int i) {
        this(new C627660Ojc(null, null, null, null, 15), true, CardStruct.IStatusCode.DEFAULT);
    }

    public C326490Cr1(C627660Ojc<C209300rL> c627660Ojc, boolean z, String str) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = z;
        this.LLILLL = str;
    }
}
