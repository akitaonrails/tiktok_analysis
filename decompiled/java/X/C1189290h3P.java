package X;

import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0h3P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1189290h3P implements InterfaceC1891350zJl {
    public final PoiListApi.PoiReviewCardModel LL;
    public final String LLILLJJLI;
    public final String LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1189290h3P)) {
            return false;
        }
        C1189290h3P c1189290h3P = (C1189290h3P) obj;
        return Intrinsics.LJFF(this.LL, c1189290h3P.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1189290h3P.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1189290h3P.LLILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILLL;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiMergedListReviewItem(data=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", logId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", collectInfo=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1189290h3P c1189290h3P;
        PoiListApi.PoiReviewCardModel poiReviewCardModel;
        String str = this.LL.reviewId;
        String str2 = null;
        if ((interfaceC1891350zJl instanceof C1189290h3P) && (c1189290h3P = (C1189290h3P) interfaceC1891350zJl) != null && (poiReviewCardModel = c1189290h3P.LL) != null) {
            str2 = poiReviewCardModel.reviewId;
        }
        return Intrinsics.LJFF(str, str2);
    }

    public C1189290h3P(PoiListApi.PoiReviewCardModel poiReviewCardModel, String str, String str2) {
        this.LL = poiReviewCardModel;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }
}
