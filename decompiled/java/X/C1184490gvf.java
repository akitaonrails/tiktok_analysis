package X;

import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gvf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1184490gvf implements Serializable {
    public final C1188440h22 poiAnchorData;
    public final C1185490gxH poiAnchorMobData;
    public final C1185410gx9 poiDetailParams;
    public final PoiListApi.PoiDetailResponse poiDetailResponse;

    public C1184490gvf() {
        this(null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1184490gvf)) {
            return false;
        }
        C1184490gvf c1184490gvf = (C1184490gvf) obj;
        return Intrinsics.LJFF(this.poiDetailResponse, c1184490gvf.poiDetailResponse) && Intrinsics.LJFF(this.poiDetailParams, c1184490gvf.poiDetailParams) && Intrinsics.LJFF(this.poiAnchorData, c1184490gvf.poiAnchorData) && Intrinsics.LJFF(this.poiAnchorMobData, c1184490gvf.poiAnchorMobData);
    }

    public int hashCode() {
        PoiListApi.PoiDetailResponse poiDetailResponse = this.poiDetailResponse;
        int iHashCode = (poiDetailResponse == null ? 0 : poiDetailResponse.hashCode()) * 31;
        C1185410gx9 c1185410gx9 = this.poiDetailParams;
        int iHashCode2 = (iHashCode + (c1185410gx9 == null ? 0 : c1185410gx9.hashCode())) * 31;
        C1188440h22 c1188440h22 = this.poiAnchorData;
        int iHashCode3 = (iHashCode2 + (c1188440h22 == null ? 0 : c1188440h22.hashCode())) * 31;
        C1185490gxH c1185490gxH = this.poiAnchorMobData;
        return iHashCode3 + (c1185490gxH != null ? c1185490gxH.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiCategoryFeatureShareParams(poiDetailResponse=");
        sbLIZ.append(this.poiDetailResponse);
        sbLIZ.append(", poiDetailParams=");
        sbLIZ.append(this.poiDetailParams);
        sbLIZ.append(", poiAnchorData=");
        sbLIZ.append(this.poiAnchorData);
        sbLIZ.append(", poiAnchorMobData=");
        sbLIZ.append(this.poiAnchorMobData);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1184490gvf(PoiListApi.PoiDetailResponse poiDetailResponse, C1185410gx9 c1185410gx9, C1188440h22 c1188440h22, C1185490gxH c1185490gxH) {
        this.poiDetailResponse = poiDetailResponse;
        this.poiDetailParams = c1185410gx9;
        this.poiAnchorData = c1188440h22;
        this.poiAnchorMobData = c1185490gxH;
    }
}
