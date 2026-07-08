package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mapapi.IPoiMapService;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.map.model.DynamicMapParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gh0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1175400gh0 {
    public static final boolean LIZ(PoiListApi.PoiDetailResponse poiDetailResponse) {
        DynamicMapParams dynamicMapParams;
        if (!((IPoiMapService) ServiceManager.get().getService(IPoiMapService.class)).LJFF()) {
            return false;
        }
        if (poiDetailResponse != null && (dynamicMapParams = poiDetailResponse.getDynamicMapParams()) != null && Intrinsics.LJFF(dynamicMapParams.enableDynamicMap, Boolean.FALSE)) {
            return false;
        }
        return true;
    }
}
