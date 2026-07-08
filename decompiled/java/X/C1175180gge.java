package X;

import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiCommonMobParams;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeDataParams;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeMobParams;

/* JADX INFO: renamed from: X.0gge, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1175180gge {
    public static void LIZ(Context context, InterfaceC665370Q7z interfaceC665370Q7z, EnumC1175380ggy enumC1175380ggy, PoiMapModeDataParams poiMapModeDataParams, PoiMapModeMobParams poiMapModeMobParams) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://poi/map_mode");
        smartRouteBuildRoute.withParam("map_mode_scene", enumC1175380ggy);
        smartRouteBuildRoute.withParam("map_mode_data_params", poiMapModeDataParams);
        smartRouteBuildRoute.withParam("map_mode_mob_params", poiMapModeMobParams);
        PoiCommonMobParams poiCommonMobParamsLJ = C1182380gsG.LJ(interfaceC665370Q7z);
        if (poiCommonMobParamsLJ != null) {
            smartRouteBuildRoute.withParam("poi_common_mob_params", poiCommonMobParamsLJ);
        }
        smartRouteBuildRoute.open();
    }
}
