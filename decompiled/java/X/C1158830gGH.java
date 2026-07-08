package X;

import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.PaidSeriesLiveListResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gGH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1158830gGH implements InterfaceC0148002o {
    public final AbstractC1623806Xk<PaidSeriesLiveListResponse> LL;
    public final String LLILLJJLI;
    public final C291001Au<CollectionDetailModel> LLILLL;

    public C1158830gGH() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1158830gGH)) {
            return false;
        }
        C1158830gGH c1158830gGH = (C1158830gGH) obj;
        return Intrinsics.LJFF(this.LL, c1158830gGH.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1158830gGH.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1158830gGH.LLILLL);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C291001Au<CollectionDetailModel> c291001Au = this.LLILLL;
        return iHashCode2 + (c291001Au != null ? c291001Au.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaidSeriesShopPanelState(livePaidSeriesResponse=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", ownerId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", openSeriesDetailEvent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1158830gGH(int i) {
        this(C491101vh.LIZ, null, null);
    }

    public C1158830gGH(AbstractC1623806Xk<PaidSeriesLiveListResponse> abstractC1623806Xk, String str, C291001Au<CollectionDetailModel> c291001Au) {
        this.LL = abstractC1623806Xk;
        this.LLILLJJLI = str;
        this.LLILLL = c291001Au;
    }

    public static C1158830gGH LIZ(C1158830gGH c1158830gGH, AbstractC1623806Xk abstractC1623806Xk, String str, C291001Au c291001Au, int i) {
        if ((i & 1) != 0) {
            abstractC1623806Xk = c1158830gGH.LL;
        }
        if ((i & 2) != 0) {
            str = c1158830gGH.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au = c1158830gGH.LLILLL;
        }
        c1158830gGH.getClass();
        return new C1158830gGH(abstractC1623806Xk, str, c291001Au);
    }
}
