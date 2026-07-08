package X;

import com.ss.android.ugc.aweme.poi.detail.nearbyv2.model.PoiNearbyV2Tab;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiGeneralCard;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gi6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1176080gi6 implements InterfaceC0148002o {
    public final PoiNearbyV2Tab LL;
    public final Map<Integer, PoiGeneralCard> LLILLJJLI;
    public final C1176090gi7 LLILLL;

    public C1176080gi6() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1176080gi6)) {
            return false;
        }
        C1176080gi6 c1176080gi6 = (C1176080gi6) obj;
        return Intrinsics.LJFF(this.LL, c1176080gi6.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1176080gi6.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1176080gi6.LLILLL);
    }

    public final int hashCode() {
        PoiNearbyV2Tab poiNearbyV2Tab = this.LL;
        int iHashCode = (poiNearbyV2Tab == null ? 0 : poiNearbyV2Tab.hashCode()) * 31;
        Map<Integer, PoiGeneralCard> map = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        C1176090gi7 c1176090gi7 = this.LLILLL;
        return iHashCode2 + (c1176090gi7 != null ? c1176090gi7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiDetailNearbyV2State(currentTab=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", filterPoiList=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", centerPoiData=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1176080gi6(PoiNearbyV2Tab poiNearbyV2Tab, Map<Integer, PoiGeneralCard> map, C1176090gi7 c1176090gi7) {
        this.LL = poiNearbyV2Tab;
        this.LLILLJJLI = map;
        this.LLILLL = c1176090gi7;
    }
}
