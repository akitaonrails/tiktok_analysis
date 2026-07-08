package X;

import android.view.View;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService;
import com.ss.android.ugc.aweme.search.common.utils.SearchLocationCacheData;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.placesearch.core.model.SearchPlaceResponse;
import com.ss.android.ugc.aweme.search.pages.result.placesearch.core.ui.DynamicSearchPlaceFragment;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0PZF, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PZF extends C09AY implements Function1<n, Unit> {
    public final /* synthetic */ DynamicSearchPlaceFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0PZF(DynamicSearchPlaceFragment dynamicSearchPlaceFragment) {
        super(1);
        this.LL = dynamicSearchPlaceFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(n nVar) {
        SparkContext sparkContext;
        DynamicPatch dynamicPatch;
        DynamicPatch dynamicPatch2;
        boolean z;
        List<n> list;
        int size;
        C649290PdP c649290PdP;
        List<n> list2;
        C646940PZc c646940PZc;
        View viewLIZIZ;
        n nVar2 = nVar;
        try {
            boolean z2 = C0PYW.LIZ;
            C0PYW.LIZ(this.LL.LLJILLL);
            C0PZI c0pzi = this.LL.LLLFZ;
            if (c0pzi != null && (viewLIZIZ = c0pzi.LIZIZ()) != null && (viewLIZIZ instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB)) {
                sparkContext = ((SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) viewLIZIZ).getSparkContext();
            } else {
                sparkContext = null;
            }
            SearchPlaceResponse searchPlaceResponse = (SearchPlaceResponse) this.LL.LLLIL.LJII(nVar2.toString(), SearchPlaceResponse.class);
            SearchPlaceResponse.SearchPOIInfo searchPOIInfo = searchPlaceResponse.poiInfo;
            if (searchPOIInfo == null || (dynamicPatch = searchPOIInfo.dynamicPatch) == null) {
                dynamicPatch = new DynamicPatch();
            }
            SearchPlaceResponse.SearchPOIInfo searchPOIInfo2 = searchPlaceResponse.poiInfo;
            if (searchPOIInfo2 == null || (dynamicPatch2 = searchPOIInfo2.nearbyAuth) == null) {
                dynamicPatch2 = new DynamicPatch();
            }
            dynamicPatch.setNearByAuth(dynamicPatch2.getNearByAuth());
            DynamicSearchPlaceFragment dynamicSearchPlaceFragment = this.LL;
            SearchResultParam searchResultParam = dynamicSearchPlaceFragment.LLJI;
            if (searchResultParam != null) {
                BtmSDK.INSTANCE.updateBtmPage(dynamicSearchPlaceFragment, searchResultParam.getBtmUpdateBtmToken());
            }
            int i = 1;
            int size2 = 0;
            if (sparkContext == null || (c646940PZc = (C646940PZc) sparkContext.LJFF(C646940PZc.class)) == null || !c646940PZc.LIZ) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                DynamicSearchPlaceFragment dynamicSearchPlaceFragment2 = this.LL;
                SearchPlaceResponse.SearchPOIInfo searchPOIInfo3 = searchPlaceResponse.poiInfo;
                if (searchPOIInfo3 != null && (list2 = searchPOIInfo3.poiInfo) != null) {
                    size = list2.size();
                } else {
                    size = 0;
                }
                dynamicSearchPlaceFragment2.ES(size, searchPlaceResponse);
                dynamicPatch.setRawData(nVar2.toString());
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (!Intrinsics.LJFF((Boolean) ComplianceServiceProvider.LJI().LJJJJZI().getValue(), Boolean.TRUE)) {
                    linkedHashMap.put("is_non_personalized_search", 0);
                } else {
                    linkedHashMap.put("is_non_personalized_search", 1);
                }
                if (!C666750QDh.LIZ()) {
                    i = 0;
                }
                linkedHashMap.put("is_hide_engagement_data", Integer.valueOf(i));
                JSONObject jSONObject = new JSONObject();
                C0PZI c0pzi2 = this.LL.LLLFZ;
                if ((c0pzi2 instanceof C649290PdP) && (c649290PdP = (C649290PdP) c0pzi2) != null) {
                    for (Map.Entry entry : ((LinkedHashMap) c649290PdP.LJIIJ()).entrySet()) {
                        jSONObject.put((String) entry.getKey(), ((Number) entry.getValue()).longValue());
                    }
                }
                boolean z3 = C0PYW.LIZ;
                for (Map.Entry entry2 : ((LinkedHashMap) C0PYW.LIZJ(this.LL.LLJILLL)).entrySet()) {
                    jSONObject.put((String) entry2.getKey(), ((Number) entry2.getValue()).longValue());
                }
                linkedHashMap.put("stageTimings", jSONObject);
                SearchLocationCacheData.LIZ.getClass();
                String strLIZJ = SearchLocationCacheData.LIZJ();
                if (strLIZJ != null) {
                    linkedHashMap.put("encrypt_location", strLIZJ);
                }
                C647380PaK.LJIIIIZZ.getClass();
                TemplateData templateDataLIZLLL = C647380PaK.LIZLLL(dynamicPatch, linkedHashMap, sparkContext);
                C0PZI c0pzi3 = this.LL.LLLFZ;
                if (c0pzi3 != null) {
                    c0pzi3.LIZLLL(templateDataLIZLLL);
                }
            } else {
                dynamicPatch.setRawData(this.LL.NS(nVar2));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("network_error_code", Integer.valueOf(((INetworkStandardUIService) ServiceManager.get().getService(INetworkStandardUIService.class)).getStatusViewNeedShowForSearch(EnumC1609900rzo.SEARCH, null)));
                SearchLocationCacheData.LIZ.getClass();
                String strLIZJ2 = SearchLocationCacheData.LIZJ();
                if (strLIZJ2 != null) {
                    linkedHashMap2.put("encrypt_location", strLIZJ2);
                }
                C647380PaK.LJIIIIZZ.getClass();
                TemplateData templateDataLIZIZ = C647380PaK.LIZIZ(dynamicPatch, linkedHashMap2, sparkContext);
                C0PZI c0pzi4 = this.LL.LLLFZ;
                if (c0pzi4 != null) {
                    c0pzi4.LIZLLL(templateDataLIZIZ);
                }
                DynamicSearchPlaceFragment dynamicSearchPlaceFragment3 = this.LL;
                SearchPlaceResponse.SearchPOIInfo searchPOIInfo4 = searchPlaceResponse.poiInfo;
                if (searchPOIInfo4 != null && (list = searchPOIInfo4.poiInfo) != null) {
                    size2 = list.size();
                }
                dynamicSearchPlaceFragment3.ES(size2, searchPlaceResponse);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return Unit.LIZ;
    }
}
