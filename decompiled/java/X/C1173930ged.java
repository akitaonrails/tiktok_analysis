package X;

import com.ss.android.ugc.aweme.poi.mapmode.model.PoiDiscoveryCard;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ged, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1173930ged implements InterfaceC1891350zJl {
    public final PoiDiscoveryCard LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1173930ged) && Intrinsics.LJFF(this.LL, ((C1173930ged) obj).LL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        PoiDiscoveryCard poiDiscoveryCard = this.LL;
        if (poiDiscoveryCard == null) {
            return 0;
        }
        return poiDiscoveryCard.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiNearbyCardItem(data=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1173930ged(PoiDiscoveryCard poiDiscoveryCard) {
        this.LL = poiDiscoveryCard;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1173930ged c1173930ged;
        String str;
        PoiDiscoveryCard poiDiscoveryCard;
        String str2 = null;
        if (interfaceC1891350zJl instanceof C1173930ged) {
            c1173930ged = (C1173930ged) interfaceC1891350zJl;
        } else {
            c1173930ged = null;
        }
        PoiDiscoveryCard poiDiscoveryCard2 = this.LL;
        if (poiDiscoveryCard2 != null && (str = poiDiscoveryCard2.poiId) != null && C123100dR.LIZ(str)) {
            String str3 = this.LL.poiId;
            if (c1173930ged != null && (poiDiscoveryCard = c1173930ged.LL) != null) {
                str2 = poiDiscoveryCard.poiId;
            }
            if (Intrinsics.LJFF(str3, str2)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
