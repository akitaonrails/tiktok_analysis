package X;

import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gzI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1186740gzI implements InterfaceC111300bX {
    public final PoiListApi.PoiMergedListResponse LL;
    public final PoiListApi.PoiDetailResponse LLILLJJLI;
    public final C1185600gxS LLILLL;

    public C1186740gzI() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1186740gzI)) {
            return false;
        }
        C1186740gzI c1186740gzI = (C1186740gzI) obj;
        return Intrinsics.LJFF(this.LL, c1186740gzI.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1186740gzI.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1186740gzI.LLILLL);
    }

    public final int hashCode() {
        PoiListApi.PoiMergedListResponse poiMergedListResponse = this.LL;
        int iHashCode = (poiMergedListResponse == null ? 0 : poiMergedListResponse.hashCode()) * 31;
        PoiListApi.PoiDetailResponse poiDetailResponse = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (poiDetailResponse == null ? 0 : poiDetailResponse.hashCode())) * 31;
        C1185600gxS c1185600gxS = this.LLILLL;
        return iHashCode2 + (c1185600gxS != null ? c1185600gxS.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiLimitedPostHierarchyData(item=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", poiDetailResponse=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", poiSlashContext=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1186740gzI(PoiListApi.PoiMergedListResponse poiMergedListResponse, PoiListApi.PoiDetailResponse poiDetailResponse, C1185600gxS c1185600gxS) {
        this.LL = poiMergedListResponse;
        this.LLILLJJLI = poiDetailResponse;
        this.LLILLL = c1185600gxS;
    }
}
