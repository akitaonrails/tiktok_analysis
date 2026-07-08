package X;

import com.ss.android.ugc.aweme.poi.mapmode.model.PoiDiscoveryCard;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gfR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1174430gfR implements InterfaceC1891350zJl {
    public final PoiDiscoveryCard LL;
    public final boolean LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1174430gfR)) {
            return false;
        }
        C1174430gfR c1174430gfR = (C1174430gfR) obj;
        return Intrinsics.LJFF(this.LL, c1174430gfR.LL) && this.LLILLJJLI == c1174430gfR.LLILLJJLI;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        PoiDiscoveryCard poiDiscoveryCard = this.LL;
        return ((poiDiscoveryCard == null ? 0 : poiDiscoveryCard.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiMapModeHorizontalCardItem(data=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", showSkeleton=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1174430gfR c1174430gfR;
        String str;
        PoiDiscoveryCard poiDiscoveryCard;
        String str2 = null;
        if (interfaceC1891350zJl instanceof C1174430gfR) {
            c1174430gfR = (C1174430gfR) interfaceC1891350zJl;
        } else {
            c1174430gfR = null;
        }
        PoiDiscoveryCard poiDiscoveryCard2 = this.LL;
        if (poiDiscoveryCard2 != null && (str = poiDiscoveryCard2.poiId) != null && C123100dR.LIZ(str)) {
            String str3 = this.LL.poiId;
            if (c1174430gfR != null && (poiDiscoveryCard = c1174430gfR.LL) != null) {
                str2 = poiDiscoveryCard.poiId;
            }
            if (Intrinsics.LJFF(str3, str2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C1174430gfR(PoiDiscoveryCard poiDiscoveryCard, boolean z) {
        this.LL = poiDiscoveryCard;
        this.LLILLJJLI = z;
    }
}
