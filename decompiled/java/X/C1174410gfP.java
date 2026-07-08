package X;

import com.ss.android.ugc.aweme.poi.mapmode.model.PoiDiscoveryCard;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gfP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1174410gfP implements InterfaceC1891350zJl {
    public final PoiDiscoveryCard LL;
    public final boolean LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1174410gfP)) {
            return false;
        }
        C1174410gfP c1174410gfP = (C1174410gfP) obj;
        return Intrinsics.LJFF(this.LL, c1174410gfP.LL) && this.LLILLJJLI == c1174410gfP.LLILLJJLI;
    }

    public final int hashCode() {
        PoiDiscoveryCard poiDiscoveryCard = this.LL;
        return ((poiDiscoveryCard == null ? 0 : poiDiscoveryCard.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiMapModeVerticalListItem(data=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", showSkeleton=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1174410gfP c1174410gfP;
        Boolean boolIsCollected;
        PoiDiscoveryCard poiDiscoveryCard;
        boolean z = interfaceC1891350zJl instanceof C1174410gfP;
        Boolean boolIsCollected2 = null;
        if (z) {
            c1174410gfP = (C1174410gfP) interfaceC1891350zJl;
        } else {
            c1174410gfP = null;
        }
        if (areItemTheSame(interfaceC1891350zJl) && z) {
            PoiDiscoveryCard poiDiscoveryCard2 = this.LL;
            if (poiDiscoveryCard2 != null) {
                boolIsCollected = poiDiscoveryCard2.isCollected();
            } else {
                boolIsCollected = null;
            }
            if (c1174410gfP != null && (poiDiscoveryCard = c1174410gfP.LL) != null) {
                boolIsCollected2 = poiDiscoveryCard.isCollected();
            }
            return Intrinsics.LJFF(boolIsCollected, boolIsCollected2);
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1174410gfP c1174410gfP;
        String str;
        PoiDiscoveryCard poiDiscoveryCard;
        String str2 = null;
        if (interfaceC1891350zJl instanceof C1174410gfP) {
            c1174410gfP = (C1174410gfP) interfaceC1891350zJl;
        } else {
            c1174410gfP = null;
        }
        PoiDiscoveryCard poiDiscoveryCard2 = this.LL;
        if (poiDiscoveryCard2 != null && (str = poiDiscoveryCard2.poiId) != null && C123100dR.LIZ(str)) {
            String str3 = this.LL.poiId;
            if (c1174410gfP != null && (poiDiscoveryCard = c1174410gfP.LL) != null) {
                str2 = poiDiscoveryCard.poiId;
            }
            if (Intrinsics.LJFF(str3, str2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        Boolean boolIsCollected;
        Object obj = null;
        if (!(interfaceC1891350zJl instanceof C1174410gfP)) {
            return null;
        }
        if (!areContentsTheSame(interfaceC1891350zJl)) {
            PoiDiscoveryCard poiDiscoveryCard = ((C1174410gfP) interfaceC1891350zJl).LL;
            if (poiDiscoveryCard != null && (boolIsCollected = poiDiscoveryCard.isCollected()) != null) {
                boolIsCollected.booleanValue();
            }
            obj = new Object() { // from class: X.0gfQ
            };
        }
        return obj;
    }

    public C1174410gfP(PoiDiscoveryCard poiDiscoveryCard, boolean z) {
        this.LL = poiDiscoveryCard;
        this.LLILLJJLI = z;
    }
}
