package X;

import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.poi.PoiAllianceBaseInfo;
import com.ss.android.ugc.aweme.poi.PoiAllianceDetail;
import com.ss.android.ugc.aweme.poi.PoiData;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0hHF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1197870hHF {
    public static final C1197870hHF LIZ = new C1197870hHF();

    public static Map LIZ(PoiData poiData) {
        Object obj;
        Boolean boolValueOf;
        PoiAllianceDetail poiAllianceDetail;
        if (!C297510BlN.LIZIZ()) {
            return new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = "1";
        if (C297500BlM.LIZ()) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("ttls_user_status", obj);
        if (poiData != null && (poiAllianceDetail = poiData.getPoiAllianceDetail()) != null) {
            boolValueOf = Boolean.valueOf(poiAllianceDetail.isCommissionPoi());
        } else {
            boolValueOf = null;
        }
        if (!C1189060h32.LJIILJJIL(boolValueOf)) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_commission_poi", str);
        return linkedHashMap;
    }

    public static void LJ(EnumC1197790hH7 enumC1197790hH7) {
        JSONObject jSONObject = new JSONObject();
        C2365509Or.LIZLLL(jSONObject, "enter_from", "poi_search_page");
        C2365509Or.LIZLLL(jSONObject, "click_area", enumC1197790hH7.getValue());
        C1185040gwY.LIZ.getClass();
        C1185040gwY.LIZJ("ttls_creator_invite_banner_click", jSONObject, null);
    }

    public static void LIZLLL(PoiData poiData, String str) {
        String str2;
        String str3;
        String curUserId;
        AccountUserService accountUserServiceLJIIJ;
        PoiAllianceDetail poiAllianceDetail;
        JSONObject jSONObject = new JSONObject();
        if (poiData != null) {
            str2 = poiData.poiId;
        } else {
            str2 = null;
        }
        C2365509Or.LIZLLL(jSONObject, "poi_id", str2);
        if (poiData != null && (poiAllianceDetail = poiData.getPoiAllianceDetail()) != null && poiAllianceDetail.isCommissionPoi()) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        C2365509Or.LIZLLL(jSONObject, "is_commission", str3);
        C2365509Or.LIZLLL(jSONObject, "action", "choose_poi");
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        if (iAccountService != null && (accountUserServiceLJIIJ = iAccountService.LJIIJ()) != null) {
            curUserId = accountUserServiceLJIIJ.getCurUserId();
        } else {
            curUserId = "";
        }
        C2365509Or.LIZLLL(jSONObject, "author_id", curUserId);
        C2365509Or.LIZLLL(jSONObject, "scenario", str);
        C1185040gwY.LIZ.getClass();
        C1185040gwY.LIZJ("ttls_matchmaking_pair_generate", jSONObject, null);
    }

    public static Map LIZIZ(PoiData poiData, String str, String str2, String str3) {
        PoiAllianceBaseInfo poiAllianceBaseInfo;
        Object obj;
        Object obj2;
        Boolean boolValueOf;
        PoiAllianceDetail poiAllianceDetail;
        if (!C297510BlN.LIZIZ()) {
            return new LinkedHashMap();
        }
        String str4 = null;
        if (poiData != null && (poiAllianceDetail = poiData.getPoiAllianceDetail()) != null) {
            poiAllianceBaseInfo = poiAllianceDetail.baseInfo;
        } else {
            poiAllianceBaseInfo = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str5 = "1";
        if (C297500BlM.LIZ()) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("ttls_user_status", obj);
        if (poiAllianceBaseInfo != null && poiAllianceBaseInfo.isHasService()) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_has_service", obj2);
        if (poiAllianceBaseInfo == null || !poiAllianceBaseInfo.isCommission()) {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_commission", str5);
        C1189060h32.LJJ("poi_tag_list", str2, linkedHashMap);
        C1189060h32.LJJ("poi_tag_unshow_list", str3, linkedHashMap);
        if (poiAllianceBaseInfo != null) {
            boolValueOf = Boolean.valueOf(poiAllianceBaseInfo.isHasService());
        } else {
            boolValueOf = null;
        }
        if (C1189060h32.LJIILJJIL(boolValueOf)) {
            if (poiAllianceBaseInfo != null) {
                str4 = poiAllianceBaseInfo.score;
            }
            C1189060h32.LJJ("poi_rating", str4, linkedHashMap);
        }
        C1189060h32.LJJ("search_filter", str, linkedHashMap);
        return linkedHashMap;
    }
}
