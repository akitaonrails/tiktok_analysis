package X;

import com.ss.android.ugc.aweme.poi.detail.container.model.PoiShopBookingInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.062U, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C062U implements InterfaceC111300bX {
    public final PoiShopBookingInfo LL;
    public final C1186970gzf LLILLJJLI;
    public final boolean LLILLL;

    /* JADX WARN: Multi-variable type inference failed */
    public C062U() {
        this((PoiShopBookingInfo) null, (C1186970gzf) (0 == true ? 1 : 0), 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C062U)) {
            return false;
        }
        C062U c062u = (C062U) obj;
        return Intrinsics.LJFF(this.LL, c062u.LL) && Intrinsics.LJFF(this.LLILLJJLI, c062u.LLILLJJLI) && this.LLILLL == c062u.LLILLL;
    }

    public final int hashCode() {
        PoiShopBookingInfo poiShopBookingInfo = this.LL;
        int iHashCode = (poiShopBookingInfo == null ? 0 : poiShopBookingInfo.hashCode()) * 31;
        C1186970gzf c1186970gzf = this.LLILLJJLI;
        return ((iHashCode + (c1186970gzf != null ? c1186970gzf.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLILLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiDetailHeaderShopCtaHierarchyData(bookingInfo=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", poiHeaderShopCtaMobData=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", shouldShowIcon=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C062U(PoiShopBookingInfo poiShopBookingInfo, C1186970gzf c1186970gzf, int i) {
        boolean z;
        poiShopBookingInfo = (i & 1) != 0 ? null : poiShopBookingInfo;
        c1186970gzf = (i & 2) != 0 ? null : c1186970gzf;
        if ((i & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        this(poiShopBookingInfo, c1186970gzf, z);
    }

    public C062U(PoiShopBookingInfo poiShopBookingInfo, C1186970gzf c1186970gzf, boolean z) {
        this.LL = poiShopBookingInfo;
        this.LLILLJJLI = c1186970gzf;
        this.LLILLL = z;
    }
}
