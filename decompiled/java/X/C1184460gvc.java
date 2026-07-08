package X;

import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gvc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1184460gvc implements InterfaceC111300bX {
    public final String LL;
    public final PoiListApi.PoiDetailResponse LLILLJJLI;
    public final C1184480gve LLILLL;
    public final boolean LLILZ;
    public final Long LLILZIL;

    /* JADX WARN: Multi-variable type inference failed */
    public C1184460gvc() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1184460gvc)) {
            return false;
        }
        C1184460gvc c1184460gvc = (C1184460gvc) obj;
        return Intrinsics.LJFF(this.LL, c1184460gvc.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1184460gvc.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1184460gvc.LLILLL) && this.LLILZ == c1184460gvc.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1184460gvc.LLILZIL);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        PoiListApi.PoiDetailResponse poiDetailResponse = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (poiDetailResponse == null ? 0 : poiDetailResponse.hashCode())) * 31;
        C1184480gve c1184480gve = this.LLILLL;
        int iHashCode3 = (((iHashCode2 + (c1184480gve == null ? 0 : c1184480gve.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31;
        Long l = this.LLILZIL;
        return iHashCode3 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiDetailContentHeaderHierarchyDataV3(poiId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", poiDetail=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", videoListHierarchyData=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", inMapMode=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", componentCreatedTs=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1184460gvc(String str, PoiListApi.PoiDetailResponse poiDetailResponse, C1184480gve c1184480gve, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : poiDetailResponse, (i & 4) != 0 ? null : c1184480gve, false, null);
    }

    public C1184460gvc(String str, PoiListApi.PoiDetailResponse poiDetailResponse, C1184480gve c1184480gve, boolean z, Long l) {
        this.LL = str;
        this.LLILLJJLI = poiDetailResponse;
        this.LLILLL = c1184480gve;
        this.LLILZ = z;
        this.LLILZIL = l;
    }
}
