package X;

import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.navbar.dynamic.PoiDynamicNavBarModule;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gvB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1184190gvB implements InterfaceC111300bX {
    public final PoiDynamicNavBarModule LL;
    public final PoiListApi.PoiDetailResponse LLILLJJLI;
    public final C1185600gxS LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1184190gvB)) {
            return false;
        }
        C1184190gvB c1184190gvB = (C1184190gvB) obj;
        return Intrinsics.LJFF(this.LL, c1184190gvB.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1184190gvB.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1184190gvB.LLILLL);
    }

    public final int hashCode() {
        PoiDynamicNavBarModule poiDynamicNavBarModule = this.LL;
        int iHashCode = (poiDynamicNavBarModule == null ? 0 : poiDynamicNavBarModule.hashCode()) * 31;
        PoiListApi.PoiDetailResponse poiDetailResponse = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (poiDetailResponse == null ? 0 : poiDetailResponse.hashCode())) * 31;
        C1185600gxS c1185600gxS = this.LLILLL;
        return iHashCode2 + (c1185600gxS != null ? c1185600gxS.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiDynamicNavBarHierarchyData(data=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", poiDetailResponse=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", poiSlashContext=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1184190gvB(PoiDynamicNavBarModule poiDynamicNavBarModule, PoiListApi.PoiDetailResponse poiDetailResponse, C1185600gxS c1185600gxS) {
        this.LL = poiDynamicNavBarModule;
        this.LLILLJJLI = poiDetailResponse;
        this.LLILLL = c1185600gxS;
    }
}
