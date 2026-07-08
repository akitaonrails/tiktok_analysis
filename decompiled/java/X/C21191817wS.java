package X;

import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.region.ab.ECRegionSyncSettings;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.region.service.IECommerceRegionService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.17wS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21191817wS {
    public static final C21191817wS LIZ = new C21191817wS();

    public static void LIZ(String str, String str2, String str3, String str4) {
        IECommerceRegionService iECommerceRegionService;
        boolean z;
        ECRegionSyncSettings.EcomRegionConfig ecomRegionConfig = ECRegionSyncSettings.LIZ;
        if (ecomRegionConfig.regionUpdateType < 0 || (iECommerceRegionService = (IECommerceRegionService) PluggableExtentionKt.pluggableSpi$default(IECommerceRegionService.class, false, false, false, 14, null)) == null) {
            return;
        }
        try {
            if (Intrinsics.LJFF(str, EnumC21179517uT.FYP_PRODUCT_CARD.getValue())) {
                z = false;
            } else {
                z = true;
            }
            C21192317wX c21192317wXLIZ = iECommerceRegionService.LIZ(Boolean.valueOf(z));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Scene.SCENE_SERVICE, str);
            jSONObject.put("code_region", str2);
            jSONObject.put("room_id", str3);
            jSONObject.put("request_id", str4);
            String str5 = c21192317wXLIZ.LJ;
            String str6 = "";
            if (str5 == null) {
                str5 = "";
            }
            jSONObject.put("region_from", str5);
            String str7 = c21192317wXLIZ.LIZ;
            if (str7 == null) {
                str7 = "";
            }
            jSONObject.put("local_code_region", str7);
            String str8 = c21192317wXLIZ.LIZIZ;
            if (str8 == null) {
                str8 = "";
            }
            jSONObject.put("manager_code_region", str8);
            String str9 = c21192317wXLIZ.LIZJ;
            if (str9 == null) {
                str9 = "";
            }
            jSONObject.put("api_route_region", str9);
            String str10 = c21192317wXLIZ.LIZLLL;
            if (str10 != null) {
                str6 = str10;
            }
            jSONObject.put("api_code_region", str6);
            jSONObject.put("region_update_type", ecomRegionConfig.regionUpdateType);
            C1507790pL7.LIZ.getClass();
            C1507790pL7.LIZLLL("rd_tiktokec_region_check", jSONObject);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static void LIZIZ(C21191817wS c21191817wS, EnumC21192017wU enumC21192017wU, String str, Integer num, String str2, int i) {
        Object obj;
        IECommerceRegionService iECommerceRegionService;
        String str3 = "";
        if ((i & 2) != 0) {
            obj = "";
        } else {
            obj = null;
        }
        if ((i & 4) != 0) {
            str = "";
        }
        boolean z = false;
        if ((i & 8) != 0) {
            num = 0;
        }
        if ((i & 16) != 0) {
            str2 = "";
        }
        c21191817wS.getClass();
        ECRegionSyncSettings.EcomRegionConfig ecomRegionConfig = ECRegionSyncSettings.LIZ;
        if (ecomRegionConfig.regionUpdateType >= 0 && (iECommerceRegionService = (IECommerceRegionService) PluggableExtentionKt.pluggableSpi$default(IECommerceRegionService.class, false, false, false, 14, null)) != null) {
            try {
                if (enumC21192017wU == EnumC21192017wU.ROOM || enumC21192017wU == EnumC21192017wU.ECOM_API) {
                    z = true;
                }
                C21192317wX c21192317wXLIZ = iECommerceRegionService.LIZ(Boolean.valueOf(z));
                String strLIZJ = iECommerceRegionService.LIZJ(Boolean.valueOf(z));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(Scene.SCENE_SERVICE, EnumC21179517uT.CHECK_ERROR.getValue());
                jSONObject.put("error_code", num);
                jSONObject.put("error_message", str2);
                jSONObject.put("code_region", strLIZJ);
                jSONObject.put("room_id", obj);
                jSONObject.put("request_id", str);
                String str4 = c21192317wXLIZ.LJ;
                if (str4 == null) {
                    str4 = "";
                }
                jSONObject.put("region_from", str4);
                String str5 = c21192317wXLIZ.LIZ;
                if (str5 == null) {
                    str5 = "";
                }
                jSONObject.put("local_code_region", str5);
                String str6 = c21192317wXLIZ.LIZIZ;
                if (str6 == null) {
                    str6 = "";
                }
                jSONObject.put("manager_code_region", str6);
                String str7 = c21192317wXLIZ.LIZJ;
                if (str7 == null) {
                    str7 = "";
                }
                jSONObject.put("api_route_region", str7);
                String str8 = c21192317wXLIZ.LIZLLL;
                if (str8 != null) {
                    str3 = str8;
                }
                jSONObject.put("api_code_region", str3);
                jSONObject.put("region_update_type", ecomRegionConfig.regionUpdateType);
                C1507790pL7.LIZ.getClass();
                C1507790pL7.LIZLLL("rd_tiktokec_region_check", jSONObject);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }
}
