package X;

import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiCommonMobParams;
import java.io.Serializable;

/* JADX INFO: renamed from: X.0h05, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1187230h05 implements Serializable {
    public PoiListApi.PoiDetailResponse cachedBasicInfoForCollect;
    public final long fragmentId;
    public C1188440h22 poiAnchorData;
    public final C1185490gxH poiAnchorMobData;
    public final PoiCommonMobParams poiCommonMobParams;
    public final C1185410gx9 poiDetailParams;
    public final PoiListApi.PoiDetailResponse poiDetailResponse;
    public C1185450gxD poiDetailSessionModel;
    public final String poiId;

    public C1187230h05() {
        this(null, 0L, null, null, null, null, null, null, null);
    }

    public final C1187230h05 copy(String str, long j, C1185410gx9 c1185410gx9, PoiListApi.PoiDetailResponse poiDetailResponse, C1188440h22 c1188440h22, C1185490gxH c1185490gxH, C1185450gxD c1185450gxD, PoiListApi.PoiDetailResponse poiDetailResponse2, PoiCommonMobParams poiCommonMobParams) {
        return new C1187230h05(str, j, c1185410gx9, poiDetailResponse, c1188440h22, c1185490gxH, c1185450gxD, poiDetailResponse2, poiCommonMobParams);
    }

    public final void setCachedBasicInfoForCollect(PoiListApi.PoiDetailResponse poiDetailResponse) {
        this.cachedBasicInfoForCollect = poiDetailResponse;
    }

    public final void setPoiAnchorData(C1188440h22 c1188440h22) {
        this.poiAnchorData = c1188440h22;
    }

    public final void setPoiDetailSessionModel(C1185450gxD c1185450gxD) {
        this.poiDetailSessionModel = c1185450gxD;
    }

    public C1187230h05(String str, long j, C1185410gx9 c1185410gx9, PoiListApi.PoiDetailResponse poiDetailResponse, C1188440h22 c1188440h22, C1185490gxH c1185490gxH, C1185450gxD c1185450gxD, PoiListApi.PoiDetailResponse poiDetailResponse2, PoiCommonMobParams poiCommonMobParams) {
        this.poiId = str;
        this.fragmentId = j;
        this.poiDetailParams = c1185410gx9;
        this.poiDetailResponse = poiDetailResponse;
        this.poiAnchorData = c1188440h22;
        this.poiAnchorMobData = c1185490gxH;
        this.poiDetailSessionModel = c1185450gxD;
        this.cachedBasicInfoForCollect = poiDetailResponse2;
        this.poiCommonMobParams = poiCommonMobParams;
    }
}
