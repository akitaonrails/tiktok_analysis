package X;

import com.ss.android.ugc.aweme.poi.anchor.model.PoiAnchorExtra;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiCommonMobParams;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0h0h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1187610h0h implements Serializable {
    public final String btmSourceToken;
    public PoiListApi.PoiDetailResponse cachedBasicInfoForCollect;
    public final long fragmentId;
    public C1188440h22 poiAnchorData;
    public final PoiAnchorExtra poiAnchorExtra;
    public final C1185490gxH poiAnchorMobData;
    public final PoiCommonMobParams poiCommonMobParams;
    public final C1185410gx9 poiDetailParams;
    public final PoiListApi.PoiDetailResponse poiDetailResponse;
    public C1185450gxD poiDetailSessionModel;
    public final String poiId;
    public final String poiSessionId;
    public final Integer selectedTagIndex;
    public final String sourceInstanceId;

    public C1187610h0h() {
        this(null, 0L, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1187610h0h)) {
            return false;
        }
        C1187610h0h c1187610h0h = (C1187610h0h) obj;
        return Intrinsics.LJFF(this.poiId, c1187610h0h.poiId) && this.fragmentId == c1187610h0h.fragmentId && Intrinsics.LJFF(this.poiDetailParams, c1187610h0h.poiDetailParams) && Intrinsics.LJFF(this.poiDetailResponse, c1187610h0h.poiDetailResponse) && Intrinsics.LJFF(this.poiAnchorData, c1187610h0h.poiAnchorData) && Intrinsics.LJFF(this.poiAnchorMobData, c1187610h0h.poiAnchorMobData) && Intrinsics.LJFF(this.poiAnchorExtra, c1187610h0h.poiAnchorExtra) && Intrinsics.LJFF(this.poiDetailSessionModel, c1187610h0h.poiDetailSessionModel) && Intrinsics.LJFF(this.cachedBasicInfoForCollect, c1187610h0h.cachedBasicInfoForCollect) && Intrinsics.LJFF(this.selectedTagIndex, c1187610h0h.selectedTagIndex) && Intrinsics.LJFF(this.poiCommonMobParams, c1187610h0h.poiCommonMobParams) && Intrinsics.LJFF(this.btmSourceToken, c1187610h0h.btmSourceToken) && Intrinsics.LJFF(this.poiSessionId, c1187610h0h.poiSessionId) && Intrinsics.LJFF(this.sourceInstanceId, c1187610h0h.sourceInstanceId);
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

    public C1187610h0h(String str, long j, C1185410gx9 c1185410gx9, PoiListApi.PoiDetailResponse poiDetailResponse, C1188440h22 c1188440h22, C1185490gxH c1185490gxH, PoiAnchorExtra poiAnchorExtra, C1185450gxD c1185450gxD, PoiListApi.PoiDetailResponse poiDetailResponse2, Integer num, PoiCommonMobParams poiCommonMobParams, String str2, String str3, String str4) {
        this.poiId = str;
        this.fragmentId = j;
        this.poiDetailParams = c1185410gx9;
        this.poiDetailResponse = poiDetailResponse;
        this.poiAnchorData = c1188440h22;
        this.poiAnchorMobData = c1185490gxH;
        this.poiAnchorExtra = poiAnchorExtra;
        this.poiDetailSessionModel = c1185450gxD;
        this.cachedBasicInfoForCollect = poiDetailResponse2;
        this.selectedTagIndex = num;
        this.poiCommonMobParams = poiCommonMobParams;
        this.btmSourceToken = str2;
        this.poiSessionId = str3;
        this.sourceInstanceId = str4;
    }
}
