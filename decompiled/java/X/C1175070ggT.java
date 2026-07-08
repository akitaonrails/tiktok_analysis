package X;

import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.placediscovery.param.MapBounds;
import com.ss.android.ugc.aweme.poi.detail.discovery.PoiDiscoveryApi$PoiDiscoveryCardListResponse;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiDiscoveryCard;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeCategory;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeResponse;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0ggT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1175070ggT {
    public static final MapBounds LIZ(C1176580giu c1176580giu) {
        if (c1176580giu == null) {
            return null;
        }
        return new MapBounds(String.valueOf(c1176580giu.northeast.lon), String.valueOf(c1176580giu.northeast.lat), String.valueOf(c1176580giu.southwest.lon), String.valueOf(c1176580giu.southwest.lat));
    }

    public static final PoiMapModeResponse LIZIZ(PoiDiscoveryApi$PoiDiscoveryCardListResponse poiDiscoveryApi$PoiDiscoveryCardListResponse) {
        ArrayList arrayList;
        Integer bizCode = poiDiscoveryApi$PoiDiscoveryCardListResponse.getBizCode();
        String currentTabCode = poiDiscoveryApi$PoiDiscoveryCardListResponse.getCurrentTabCode();
        MapBounds dynamicMapWindow = poiDiscoveryApi$PoiDiscoveryCardListResponse.getDynamicMapWindow();
        List<PoiDiscoveryCard> poiList = poiDiscoveryApi$PoiDiscoveryCardListResponse.getPoiList();
        List<PoiMapModeCategory> poiCategoryList = poiDiscoveryApi$PoiDiscoveryCardListResponse.getPoiCategoryList();
        if (poiCategoryList != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(poiCategoryList, 10));
            for (PoiMapModeCategory poiMapModeCategory : poiCategoryList) {
                if (poiMapModeCategory == null) {
                    return null;
                }
                arrayList.add(new PoiMapModeCategory(poiMapModeCategory.getTabName(), null, null, null, poiMapModeCategory.getTabCode()));
            }
        } else {
            arrayList = null;
        }
        return new PoiMapModeResponse(currentTabCode, bizCode, null, null, dynamicMapWindow, poiList, arrayList, poiDiscoveryApi$PoiDiscoveryCardListResponse.getMapLandmarkList(), poiDiscoveryApi$PoiDiscoveryCardListResponse.getFilterLandmarkList(), null, null);
    }

    public static final C1176580giu LIZJ(MapBounds mapBounds) {
        Object c098200Yq;
        try {
            c098200Yq = new C1176580giu(new C1177960gl8(CastDoubleProtector.parseDouble(mapBounds.minLat), CastDoubleProtector.parseDouble(mapBounds.minLng)), new C1177960gl8(CastDoubleProtector.parseDouble(mapBounds.maxLat), CastDoubleProtector.parseDouble(mapBounds.maxLng)));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (C1176580giu) c098200Yq;
    }
}
