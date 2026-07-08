package X;

import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gv6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1184140gv6 implements InterfaceC111300bX {
    public final PoiListApi.PoiDetailResponse LL;
    public final C1185600gxS LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1184140gv6)) {
            return false;
        }
        C1184140gv6 c1184140gv6 = (C1184140gv6) obj;
        return Intrinsics.LJFF(this.LL, c1184140gv6.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1184140gv6.LLILLJJLI);
    }

    public final int hashCode() {
        PoiListApi.PoiDetailResponse poiDetailResponse = this.LL;
        int iHashCode = (poiDetailResponse == null ? 0 : poiDetailResponse.hashCode()) * 31;
        C1185600gxS c1185600gxS = this.LLILLJJLI;
        return iHashCode + (c1185600gxS != null ? c1185600gxS.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiDetailHeaderDynamicButtonHierarchyData(poiDetailResponse=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", poiSlashContext=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1184140gv6(PoiListApi.PoiDetailResponse poiDetailResponse, C1185600gxS c1185600gxS) {
        this.LL = poiDetailResponse;
        this.LLILLJJLI = c1185600gxS;
    }
}
