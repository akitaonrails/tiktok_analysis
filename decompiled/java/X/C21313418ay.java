package X;

import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughKeyNeedMergedSettings;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18ay, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21313418ay {
    public static final void LIZ(BcmParams bcmParams, PageFinder pageFinder, JSONObject jSONObject, boolean z) {
        try {
            C21313718b1.LIZ.getClass();
            JSONObject jSONObjectLIZJ = C21313718b1.LIZJ(jSONObject);
            BtmSDK btmSDK = BtmSDK.INSTANCE;
            C21244318Bt c21244318Bt = new C21244318Bt();
            c21244318Bt.LIZIZ = pageFinder;
            C18C6 bcmChainByBtmModel = btmSDK.getBcmChainByBtmModel(c21244318Bt, 20, false);
            if (bcmChainByBtmModel.LIZ.isEmpty()) {
                bcmParams.put("local_service_pass_through_params", jSONObjectLIZJ);
                return;
            }
            C21313518az c21313518az = C21313518az.LIZ;
            List<C1766940w56> list = bcmChainByBtmModel.LIZ;
            c21313518az.getClass();
            Set<String> setLJI = C21313518az.LJI(list, jSONObjectLIZJ, z);
            Object obj = BtmSDK.createReportParams$default(btmSDK, "", pageFinder, null, 4, null).get("btm_page_params");
            if (obj == null) {
                C21314018b4.LIZ.getClass();
                C21314018b4.LIZJ("", "empty_btm_page_params");
            }
            JSONObject jSONObjectLJIJI = C21313518az.LJIJI(obj);
            if (!setLJI.isEmpty()) {
                JSONObject jSONObjectLJIJI2 = C21313518az.LJIJI(jSONObjectLJIJI.opt("local_service_pass_through_params"));
                for (String str : setLJI) {
                    if (!LSPassThroughKeyNeedMergedSettings.INSTANCE.needMerge(str)) {
                        C2365509Or.LIZLLL(jSONObjectLJIJI2, str, jSONObjectLIZJ.opt(str));
                    } else {
                        C21313518az c21313518az2 = C21313518az.LIZ;
                        Object objOpt = jSONObjectLJIJI2.opt(str);
                        Object objOpt2 = jSONObjectLIZJ.opt(str);
                        c21313518az2.getClass();
                        C2365509Or.LIZLLL(jSONObjectLJIJI2, str, C21313518az.LJIJ(objOpt, objOpt2));
                    }
                }
                bcmParams.put("local_service_pass_through_params", jSONObjectLJIJI2);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C21314018b4.LIZ(C21314018b4.LIZ, EnumC21315318bH.PT_ONEVENT_APPEND_ERROR, e);
        }
    }
}
