package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiCommonMobParams;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiGeneralCommonParams;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiModuleMobCommonParams;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiPageMobCommonParams;
import com.ss.android.ugc.aweme.poi.detail.container.slash.PoiDetailSlashFragment;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0gsF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1182370gsF extends C09AY implements Function1<PoiCommonMobParams, PoiCommonMobParams> {
    public final /* synthetic */ PoiListApi.PoiDetailResponse LL;
    public final /* synthetic */ PoiDetailSlashFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1182370gsF(PoiListApi.PoiDetailResponse poiDetailResponse, PoiDetailSlashFragment poiDetailSlashFragment) {
        super(1);
        this.LL = poiDetailResponse;
        this.LLILLJJLI = poiDetailSlashFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final PoiCommonMobParams invoke(PoiCommonMobParams poiCommonMobParams) {
        String collectInfo;
        Object c098200Yq;
        String str;
        PoiGeneralCommonParams poiGeneralCommonParams;
        Map<String, String> map;
        Map<String, String> map2;
        String collectInfo2;
        String str2;
        String rdTtlsDataSource;
        String rdTtlsDataSource2;
        PoiCommonMobParams poiCommonMobParams2 = poiCommonMobParams;
        PoiPageMobCommonParams poiPageMobCommonParams = poiCommonMobParams2.getPoiPageMobCommonParams();
        String str3 = null;
        if (poiPageMobCommonParams != null) {
            PoiListApi.PoiDetailResponse poiDetailResponse = this.LL;
            if (poiDetailResponse != null) {
                rdTtlsDataSource2 = poiDetailResponse.getRdTtlsDataSource();
            } else {
                rdTtlsDataSource2 = null;
            }
            poiPageMobCommonParams.setTtlsRdDataSource(rdTtlsDataSource2);
        }
        PoiModuleMobCommonParams poiModuleMobCommonParams = poiCommonMobParams2.getPoiModuleMobCommonParams();
        if (poiModuleMobCommonParams != null) {
            PoiListApi.PoiDetailResponse poiDetailResponse2 = this.LL;
            if (poiDetailResponse2 != null) {
                rdTtlsDataSource = poiDetailResponse2.getRdTtlsDataSource();
            } else {
                rdTtlsDataSource = null;
            }
            poiModuleMobCommonParams.setTtlsRdDataSource(rdTtlsDataSource);
        }
        PoiListApi.PoiDetailResponse poiDetailResponse3 = this.LL;
        if (poiDetailResponse3 != null) {
            collectInfo = poiDetailResponse3.getCollectInfo();
        } else {
            collectInfo = null;
        }
        try {
            C1227904rF c1227904rF = C1227904rF.LIZ;
            Type type = new TypeToken<Map<String, String>>() { // from class: X.04ZG
            }.getType();
            c1227904rF.getClass();
            c098200Yq = (Map) C1227904rF.LIZJ(collectInfo, type);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Map<String, String> map3 = (Map) c098200Yq;
        C1893310zMv c1893310zMv = C1893310zMv.LIZIZ;
        if (c1893310zMv.LJIIL()) {
            PageFinder pageFinderNW = this.LLILLJJLI.nW();
            JSONObject jSONObject = new JSONObject();
            PoiListApi.PoiDetailResponse poiDetailResponse4 = this.LL;
            if (poiDetailResponse4 != null) {
                collectInfo2 = poiDetailResponse4.getCollectInfo();
            } else {
                collectInfo2 = null;
            }
            C2365509Or.LIZLLL(jSONObject, "collect_info", collectInfo2);
            if (map3 != null) {
                str2 = map3.get("has_product");
            } else {
                str2 = null;
            }
            C2365509Or.LIZLLL(jSONObject, "has_product", str2);
            if (map3 != null) {
                str3 = map3.get("local_service_key_category");
            }
            C2365509Or.LIZLLL(jSONObject, "local_service_key_category", str3);
            c1893310zMv.LJIILIIL(pageFinderNW, jSONObject, true);
        }
        PoiGeneralCommonParams poiGeneralCommonParams2 = poiCommonMobParams2.getPoiGeneralCommonParams();
        if (poiGeneralCommonParams2 != null) {
            poiGeneralCommonParams2.setCollectInfo(collectInfo);
        }
        if (!C2519809u8.LIZ) {
            PoiGeneralCommonParams poiGeneralCommonParams3 = poiCommonMobParams2.getPoiGeneralCommonParams();
            if (poiGeneralCommonParams3 != null && (map = poiGeneralCommonParams3.collectInfoMap) != null && !map.isEmpty()) {
                if (map3 != null) {
                    for (Map.Entry<String, String> entry : map3.entrySet()) {
                        PoiGeneralCommonParams poiGeneralCommonParams4 = poiCommonMobParams2.getPoiGeneralCommonParams();
                        if (poiGeneralCommonParams4 != null && (map2 = poiGeneralCommonParams4.collectInfoMap) != null) {
                            map2.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
            } else {
                PoiGeneralCommonParams poiGeneralCommonParams5 = poiCommonMobParams2.getPoiGeneralCommonParams();
                if (poiGeneralCommonParams5 != null) {
                    poiGeneralCommonParams5.setCollectInfoMap(map3);
                }
            }
        } else {
            PoiGeneralCommonParams poiGeneralCommonParams6 = poiCommonMobParams2.getPoiGeneralCommonParams();
            if (poiGeneralCommonParams6 != null) {
                poiGeneralCommonParams6.setCollectInfoMap(map3);
            }
        }
        if (map3 != null && (str = map3.get("local_service_key_category")) != null && C123100dR.LIZ(str) && (poiGeneralCommonParams = poiCommonMobParams2.getPoiGeneralCommonParams()) != null) {
            poiGeneralCommonParams.setLocalServiceKeyCateGory(str);
        }
        Map mapLIZIZ = C18JG.LIZIZ("a4257.b26943.c0.d0", PageFinder.via((Fragment) this.LLILLJJLI));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry2 : mapLIZIZ.entrySet()) {
            if (entry2.getValue() != null) {
                linkedHashMap.put(entry2.getKey(), entry2.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), String.valueOf(entry3.getValue()));
        }
        PoiPageMobCommonParams poiPageMobCommonParams2 = poiCommonMobParams2.getPoiPageMobCommonParams();
        if (poiPageMobCommonParams2 != null) {
            poiPageMobCommonParams2.setBtmReportParams(linkedHashMap2);
        }
        PoiModuleMobCommonParams poiModuleMobCommonParams2 = poiCommonMobParams2.getPoiModuleMobCommonParams();
        if (poiModuleMobCommonParams2 != null) {
            poiModuleMobCommonParams2.setBtmReportParams(linkedHashMap2);
        }
        this.LLILLJJLI.xX(poiCommonMobParams2);
        return poiCommonMobParams2;
    }
}
