package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.poi.PoiReTagInfo;
import com.ss.android.ugc.aweme.poi.RecPoiItemModel;
import com.ss.android.ugc.aweme.port.in.IAVSettingService;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0hMM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1201040hMM implements InterfaceC149400hg {
    public static String LJLZ(PoiReTagInfo poiReTagInfo) {
        List<RecPoiItemModel> poiReTagRecPoiList;
        RecPoiItemModel recPoiItemModel;
        String appLanguage;
        String appLanguage2 = null;
        if (poiReTagInfo == null || (poiReTagRecPoiList = poiReTagInfo.getPoiReTagRecPoiList()) == null || (recPoiItemModel = (RecPoiItemModel) C13LP.LJJJLL(poiReTagRecPoiList)) == null) {
            return null;
        }
        String poiInfoSource = recPoiItemModel.getPoiInfoSource();
        if (poiInfoSource == null || poiInfoSource.length() <= 0) {
            poiInfoSource = "google";
        }
        JSONObject jSONObject = new JSONObject();
        C2365509Or.LIZLLL(jSONObject, "third_id", recPoiItemModel.getPoiId());
        C2365509Or.LIZLLL(jSONObject, "poi_id", recPoiItemModel.getPoiId());
        C2365509Or.LIZLLL(jSONObject, "fallback_location", recPoiItemModel.getPoiName());
        IAVSettingService iAVSettingService = (IAVSettingService) PluggableExtentionKt.pluggableSpi$default(IAVSettingService.class, false, false, false, 14, null);
        if (iAVSettingService != null) {
            appLanguage = iAVSettingService.getAppLanguage();
        } else {
            appLanguage = null;
        }
        C2365509Or.LIZLLL(jSONObject, "fallback_lang", appLanguage);
        C2365509Or.LIZLLL(jSONObject, "fallback_address", recPoiItemModel.getFormattedAddress());
        C2365509Or.LIZLLL(jSONObject, "city_code", recPoiItemModel.getCityCode());
        C2365509Or.LIZLLL(jSONObject, "region_code", recPoiItemModel.getCountryCode());
        C2365509Or.LIZLLL(jSONObject, "city_name", recPoiItemModel.getCityName());
        C2365509Or.LIZLLL(jSONObject, "poi_info_source", poiInfoSource);
        JSONObject jSONObject2 = new JSONObject();
        C2365509Or.LIZLLL(jSONObject2, "content", C786410Ut5.J3(jSONObject));
        C2365509Or.LIZLLL(jSONObject2, "keyword", recPoiItemModel.getPoiName());
        C2365509Or.LIZLLL(jSONObject2, "type", 45);
        IAVSettingService iAVSettingService2 = (IAVSettingService) PluggableExtentionKt.pluggableSpi$default(IAVSettingService.class, false, false, false, 14, null);
        if (iAVSettingService2 != null) {
            appLanguage2 = iAVSettingService2.getAppLanguage();
        }
        C2365509Or.LIZLLL(jSONObject2, "language", appLanguage2);
        return C786410Ut5.J3(jSONObject2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LLJLILLLLZIIL(java.lang.String r8, com.ss.android.ugc.aweme.poi.PoiReTagInfo r9, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.poi.api.PoiSearchApi.PoiReTagResponse> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof X.C1201070hMP
            if (r0 == 0) goto L21
            r4 = r10
            X.0hMP r4 = (X.C1201070hMP) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r6 = 0
            r3 = 1
            if (r0 == 0) goto L2f
            if (r0 != r3) goto L27
            goto L7d
        L21:
            X.0hMP r4 = new X.0hMP
            r4.<init>(r7, r10)
            goto L12
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2f:
            X.C155000ia.LIZIZ(r1)
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()     // Catch: java.lang.Exception -> L83
            java.lang.Class<com.bytedance.ies.ugc.aweme.network.IRetrofitFactory> r0 = com.bytedance.ies.ugc.aweme.network.IRetrofitFactory.class
            java.lang.Object r1 = r1.getService(r0)     // Catch: java.lang.Exception -> L83
            com.bytedance.ies.ugc.aweme.network.IRetrofitFactory r1 = (com.bytedance.ies.ugc.aweme.network.IRetrofitFactory) r1     // Catch: java.lang.Exception -> L83
            java.lang.String r0 = com.ss.android.ugc.aweme.app.api.Api.LIZ     // Catch: java.lang.Exception -> L83
            X.0p8J r1 = r1.createBuilder(r0)     // Catch: java.lang.Exception -> L83
            com.ss.android.ugc.aweme.net.LocationNetRequestInfoCommonInterceptor r0 = new com.ss.android.ugc.aweme.net.LocationNetRequestInfoCommonInterceptor     // Catch: java.lang.Exception -> L83
            r0.<init>()     // Catch: java.lang.Exception -> L83
            r1.LIZ(r0)     // Catch: java.lang.Exception -> L83
            com.ss.android.ugc.aweme.image.LsResBystander r0 = com.ss.android.ugc.aweme.image.LsResBystander.LIZ     // Catch: java.lang.Exception -> L83
            r1.LIZIZ(r0)     // Catch: java.lang.Exception -> L83
            com.ss.android.ugc.aweme.net.LsPreloadCheckerBystander r0 = com.ss.android.ugc.aweme.net.LsPreloadCheckerBystander.LIZ     // Catch: java.lang.Exception -> L83
            r1.LIZIZ(r0)     // Catch: java.lang.Exception -> L83
            r0 = 0
            r1.LJIIIZ = r0     // Catch: java.lang.Exception -> L83
            com.bytedance.ies.ugc.aweme.network.TTRetrofit r0 = r1.build()     // Catch: java.lang.Exception -> L83
            java.lang.Class<com.ss.android.ugc.aweme.poi.api.PoiSearchApi> r1 = com.ss.android.ugc.aweme.poi.api.PoiSearchApi.class
            com.bytedance.retrofit2.Retrofit r0 = r0.retrofit     // Catch: java.lang.Exception -> L83
            java.lang.Object r2 = r0.LIZ(r1)     // Catch: java.lang.Exception -> L83
            com.ss.android.ugc.aweme.poi.api.PoiSearchApi r2 = (com.ss.android.ugc.aweme.poi.api.PoiSearchApi) r2     // Catch: java.lang.Exception -> L83
            if (r9 == 0) goto L7a
            java.lang.String r1 = r9.getFirstPoiId()     // Catch: java.lang.Exception -> L83
        L6d:
            java.lang.String r0 = LJLZ(r9)     // Catch: java.lang.Exception -> L83
            r4.LLILLL = r3     // Catch: java.lang.Exception -> L83
            java.lang.Object r1 = r2.LIZJ(r8, r1, r0, r4)     // Catch: java.lang.Exception -> L83
            if (r1 != r5) goto L80
            goto L7c
        L7a:
            r1 = r6
            goto L6d
        L7c:
            return r5
        L7d:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L83
        L80:
            com.ss.android.ugc.aweme.poi.api.PoiSearchApi$PoiReTagResponse r1 = (com.ss.android.ugc.aweme.poi.api.PoiSearchApi.PoiReTagResponse) r1     // Catch: java.lang.Exception -> L83
            return r1
        L83:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "requestReTag error: "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1201040hMM.LLJLILLLLZIIL(java.lang.String, com.ss.android.ugc.aweme.poi.PoiReTagInfo, X.05Vn):java.lang.Object");
    }
}
