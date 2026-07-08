package X;

import com.ss.android.ugc.aweme.poi.detail.discovery.PoiDiscoveryApi$PoiDiscoveryCardListResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gGO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1158900gGO implements InterfaceC0148002o {
    public final AbstractC1623806Xk<PoiDiscoveryApi$PoiDiscoveryCardListResponse> LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1158900gGO) && Intrinsics.LJFF(this.LL, ((C1158900gGO) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiDetailDiscoveryMapState(response=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1158900gGO() {
        this(C491101vh.LIZ);
    }

    public C1158900gGO(AbstractC1623806Xk<PoiDiscoveryApi$PoiDiscoveryCardListResponse> abstractC1623806Xk) {
        this.LL = abstractC1623806Xk;
    }
}
