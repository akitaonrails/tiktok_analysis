package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.poi.anchor.model.PoiAnchorExtra;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;

/* JADX INFO: renamed from: X.0h0W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1187500h0W {
    public static void LIZ(Fragment fragment, Integer num, PoiListApi.PoiDetailResponse poiDetailResponse, C1185600gxS c1185600gxS, C1185450gxD c1185450gxD, String str, String str2, String str3) {
        Context context;
        String str4;
        Long lValueOf;
        C1185410gx9 c1185410gx9;
        C1188440h22 c1188440h22;
        C1185490gxH c1185490gxH;
        PoiAnchorExtra poiAnchorExtra;
        PoiListApi.PoiDetailResponse poiDetailResponse2;
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = null;
        if (fragment != null) {
            context = fragment.getContext();
        } else {
            context = null;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//poi/post");
        if (c1185600gxS == null || (str4 = c1185600gxS.LIZ) == null) {
            str4 = "";
        }
        if (c1185600gxS != null) {
            lValueOf = Long.valueOf(c1185600gxS.LJIIJ);
        } else {
            lValueOf = null;
        }
        long jLIZLLL = C1175120ggY.LIZLLL(lValueOf);
        if (c1185600gxS != null) {
            c1185410gx9 = c1185600gxS.LJFF;
            c1188440h22 = c1185600gxS.LJ;
            c1185490gxH = c1185600gxS.LJI;
            poiAnchorExtra = c1185600gxS.LJII;
            poiDetailResponse2 = c1185600gxS.LJIIIZ;
        } else {
            c1185410gx9 = null;
            c1188440h22 = null;
            c1185490gxH = null;
            poiAnchorExtra = null;
            poiDetailResponse2 = null;
        }
        if (fragment != null) {
            interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragment, null);
        }
        smartRouteBuildRoute.withParam("data_params", new C1187610h0h(str4, jLIZLLL, c1185410gx9, poiDetailResponse, c1188440h22, c1185490gxH, poiAnchorExtra, c1185450gxD, poiDetailResponse2, num, C1182380gsG.LJ(interfaceC665370Q7zLJFF), str, str2, str3));
        smartRouteBuildRoute.open();
    }
}
