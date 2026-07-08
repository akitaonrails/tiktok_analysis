package X;

import com.ss.android.ugc.aweme.poi.detail.container.model.PoiBookingInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gzb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1186930gzb implements InterfaceC111300bX {
    public final PoiBookingInfo LL;
    public final C1186970gzf LLILLJJLI;

    public C1186930gzb() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1186930gzb)) {
            return false;
        }
        C1186930gzb c1186930gzb = (C1186930gzb) obj;
        return Intrinsics.LJFF(this.LL, c1186930gzb.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1186930gzb.LLILLJJLI);
    }

    public final int hashCode() {
        PoiBookingInfo poiBookingInfo = this.LL;
        int iHashCode = (poiBookingInfo == null ? 0 : poiBookingInfo.hashCode()) * 31;
        C1186970gzf c1186970gzf = this.LLILLJJLI;
        return iHashCode + (c1186970gzf != null ? c1186970gzf.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiDetailReserveHierarchyData(bookingInfo=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", poiHeaderShopCtaMobData=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1186930gzb(PoiBookingInfo poiBookingInfo, C1186970gzf c1186970gzf) {
        this.LL = poiBookingInfo;
        this.LLILLJJLI = c1186970gzf;
    }
}
