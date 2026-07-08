package X;

import com.ss.android.ugc.nearby.roaming.NearbyRegionListV1Response;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hNR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1201710hNR implements InterfaceC111300bX {
    public final NearbyRegionListV1Response LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1201710hNR) && Intrinsics.LJFF(this.LL, ((C1201710hNR) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NearbyRegionHierarchyData(regionListV1Response=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1201710hNR(NearbyRegionListV1Response nearbyRegionListV1Response) {
        this.LL = nearbyRegionListV1Response;
    }
}
