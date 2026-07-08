package X;

import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.17xF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21196717xF extends AbstractC21191617wQ {
    public static final List<String> LJI = C1697810uHb.LJIIJJI("author_id", "room_id", "enter_from_merge", "enter_method", "action_type", "follow_status", "click_enter_room_time", "slot_created_time", "is_ad", "ad_id", "effect_ad_extra", "track_id", "source_module", "search_id", "search_result_id", "search_entrance", "rec_content_id", "request_id", "traffic_source", "live_role", "EVENT_ORIGIN_FEATURE", "carrier_type", "page_type", "anchor_show_type", "item_order", "follow_status", "page_name", "source_page_type", "ecom_live_rcmd_info", "traffic_source_list", "list_item_id", "guidance_text_type", "creative_id", "shopping_mode");
    public final AbstractC21196817xG LJ;
    public final C1743900vTw LJFF;

    @Override // X.AbstractC21191617wQ
    public final Map<String, Object> LIZIZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("page_params", C1741890vQh.LJIIIIZZ(this.LIZIZ));
        linkedHashMap.put("track_params", C1741890vQh.LJIIIIZZ(LIZLLL()));
        return linkedHashMap;
    }

    @Override // X.AbstractC21191617wQ
    public final Map<String, Object> LIZLLL() {
        HashMap map;
        String strLIZJ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C21206617yq.LIZ.getClass();
        linkedHashMap.putAll(C21206617yq.LIZLLL());
        C1743900vTw c1743900vTw = this.LJFF;
        if (c1743900vTw != null) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            C21206617yq.LIZJ(c2344009Gk, c1743900vTw);
            C21206617yq.LIZIZ(c2344009Gk, c1743900vTw);
            C21206617yq.LIZ(c2344009Gk);
            linkedHashMap.putAll(c2344009Gk.LIZ);
            Map map2 = (Map) c1743900vTw.LIZIZ();
            if (map2 != null) {
                linkedHashMap.putAll(map2);
            }
        }
        for (String str : LJI) {
            if (Intrinsics.LJFF(str, "traffic_source_list")) {
                int i = C1742080vR0.LIZ;
                C1743900vTw c1743900vTw2 = this.LJFF;
                linkedHashMap.put("traffic_source_list", C1742080vR0.LIZJ(1, (c1743900vTw2 == null || (map = (HashMap) c1743900vTw2.LIZIZ()) == null) ? null : (String) map.get("traffic_source_list")));
            } else if (Intrinsics.LJFF(str, "effect_ad_extra")) {
                Map<String, String> map3 = this.LJ.LIZ.LLJJIJI;
                if (map3 != null) {
                    linkedHashMap.putAll(map3);
                    linkedHashMap.put("effect_ad_extra", C1741890vQh.LJIIIIZZ(map3));
                }
                Map<String, String> map4 = this.LJ.LIZ.LLJJIJIIJIL;
                if (map4 != null) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.putAll(map4);
                    linkedHashMap2.put("refer", "product_detail");
                    linkedHashMap2.put("label", "user_othershow");
                    linkedHashMap.putAll(linkedHashMap2);
                    linkedHashMap.put("ad_extra", C1741890vQh.LJIIIIZZ(linkedHashMap2));
                }
            } else {
                C1743900vTw c1743900vTw3 = this.LJFF;
                if (c1743900vTw3 == null || (strLIZJ = c1743900vTw3.LIZJ(str)) == null) {
                    strLIZJ = "";
                }
                linkedHashMap.put(str, strLIZJ);
            }
        }
        return linkedHashMap;
    }

    @Override // X.AbstractC21191617wQ
    public final Map<String, Object> LIZJ() {
        return super.LIZJ();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C21196717xF(AbstractC21196817xG abstractC21196817xG, C1743900vTw c1743900vTw, Map<String, Object> map) {
        String lynxCardData;
        UsPopupCardVO usPopupCardVO = abstractC21196817xG.LIZ.LJJIJIIJI().LL;
        if (usPopupCardVO != null) {
            lynxCardData = usPopupCardVO.getLynxCardData();
        } else {
            lynxCardData = null;
        }
        super(lynxCardData, map);
        this.LJ = abstractC21196817xG;
        this.LJFF = c1743900vTw;
    }
}
