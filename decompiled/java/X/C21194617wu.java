package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.region.service.IECommerceRegionService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.17wu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21194617wu {
    public final /* synthetic */ C21199517xh LIZ;

    public final void LIZ() {
        int i;
        long j;
        long j2;
        long j3;
        Map<String, Object> mapLJ;
        C21199817xk c21199817xk = this.LIZ.LLLLLILLIL;
        if (c21199817xk.LJIILJJIL()) {
            C21195617x4 c21195617x4 = c21199817xk.LJIIIIZZ;
            if (c21195617x4 != null) {
                c21195617x4.LIZIZ = System.currentTimeMillis();
            }
            AbstractC21194217wq abstractC21194217wq = c21199817xk.LIZ;
            Boolean bool = c21199817xk.LJIIIZ;
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            Map<String, String> mapLJIILIIL = c21199817xk.LJIILIIL("c7068.d5479");
            C21195617x4 c21195617x42 = c21199817xk.LJIIIIZZ;
            if (c21195617x42 != null) {
                i = c21195617x42.LIZ;
                j = c21195617x42.LIZIZ;
                j2 = c21195617x42.LIZJ;
                j3 = c21195617x42.LIZIZ - c21195617x42.LIZJ;
            } else {
                i = 1;
                j = -1;
                j2 = -1;
                j3 = -1;
            }
            PopupCardVO popupCardVO = c21199817xk.LIZ.LJJIJIIJI().LL;
            Long lValueOf = popupCardVO != null ? Long.valueOf(popupCardVO.productId) : null;
            long j4 = abstractC21194217wq.LLJL;
            long j5 = j2 - j4;
            long j6 = j - j4;
            long j7 = abstractC21194217wq.LLJLIL;
            long j8 = j7 - j4;
            long j9 = abstractC21194217wq.LLJLILLLLZIIL;
            long j10 = j9 - j7;
            long j11 = abstractC21194217wq.LLJLL - j9;
            Long lValueOf2 = abstractC21194217wq.LLJZ;
            if (lValueOf2 == null) {
                lValueOf2 = Long.valueOf(j2);
            }
            abstractC21194217wq.LLJZ = lValueOf2;
            long jLongValue = lValueOf2 != null ? lValueOf2.longValue() - abstractC21194217wq.LLJLL : -1L;
            Room room = abstractC21194217wq.LLJILLL;
            String idStr = room != null ? room.getIdStr() : null;
            String str = abstractC21194217wq.LLJJJIL;
            int i2 = 1;
            if (i != 1) {
                i2 = 2;
            } else if (!zBooleanValue) {
                i2 = 0;
            }
            Integer numValueOf = Integer.valueOf(i2);
            String strLJJIJIL = abstractC21194217wq.LJJIJIL();
            String str2 = abstractC21194217wq.LLJJIJIL;
            Map<String, String> map = abstractC21194217wq.LLJJJJ;
            Integer num = abstractC21194217wq.LLLILZLLLI;
            try {
                C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("room_id", idStr);
                jSONObject.put("user_action_type", str);
                jSONObject.put("total_duration", j5);
                jSONObject.put("before_enter_room_interface_duration", j8);
                jSONObject.put("enter_room_interface_duration", j10);
                jSONObject.put("live_process_data_duration", j11);
                jSONObject.put("ec_process_data_duration", jLongValue);
                jSONObject.put("is_prefetch", numValueOf);
                jSONObject.put("live_role", strLJJIJIL);
                jSONObject.put("is_first_enter_room", i == 1 ? 1 : 0);
                jSONObject.put("enter_from_merge", str2);
                if (map != null) {
                    for (Map.Entry entry : ((HashMap) map).entrySet()) {
                        jSONObject.put((String) entry.getKey(), entry.getValue());
                    }
                }
                jSONObject.put("card_type", num);
                jSONObject.put("card_rank", i);
                jSONObject.put("total_duration_with_animation_end", j6);
                jSONObject.put("animation_duration", j3);
                jSONObject.put("product_id", lValueOf);
                for (Map.Entry entry2 : ((HashMap) mapLJIILIIL).entrySet()) {
                    jSONObject.put((String) entry2.getKey(), entry2.getValue());
                }
                jSONObject.put("code_region", EnumC21186317vZ.GLOBAL.getValue());
                IECommerceRegionService iECommerceRegionService = (IECommerceRegionService) PluggableExtentionKt.pluggableSpi$default(IECommerceRegionService.class, false, false, false, 14, null);
                if (iECommerceRegionService != null && (mapLJ = iECommerceRegionService.LJ(Boolean.TRUE)) != null) {
                    for (Map.Entry<String, Object> entry3 : mapLJ.entrySet()) {
                        jSONObject.put(entry3.getKey(), entry3.getValue());
                    }
                }
                c1507790pL7.getClass();
                C1507790pL7.LIZLLL("rd_tiktokec_live_pop_product_show", jSONObject);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public C21194617wu(C21199517xh c21199517xh) {
        this.LIZ = c21199517xh;
    }
}
