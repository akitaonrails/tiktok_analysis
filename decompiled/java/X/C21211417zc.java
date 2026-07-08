package X;

import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.api.data.BubbleClickAction;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.api.data.HighlightData;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.api.data.PromotionBubble;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.settings.EcLivePromotionBubbleFeDaSetting;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.VoucherInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS223S0000000_32;

/* JADX INFO: renamed from: X.17zc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21211417zc implements InterfaceC1115950f97 {
    public static final C01GW<C21211417zc> LIZ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(337));

    @Override // X.InterfaceC1115950f97
    public final void isActive() {
    }

    @Override // X.InterfaceC1115950f97
    public final AbstractC1115900f92 LIZ(final C1115920f94 c1115920f94) {
        return new AbstractC1115900f92(c1115920f94) { // from class: X.17zb
            public final C1743900vTw LIZIZ;
            public boolean LIZJ;
            public boolean LIZLLL;
            public final String LJ;
            public boolean LJFF;
            public final EnumC1115870f8z LJI;

            @Override // X.AbstractC1115900f92
            public final void LIZIZ() {
                this.LIZJ = true;
                LJII();
            }

            @Override // X.AbstractC1115900f92
            public final void LIZJ() {
                this.LIZLLL = true;
                LJII();
            }

            @Override // X.AbstractC1115900f92
            public final void LJ() {
                this.LIZJ = false;
            }

            @Override // X.AbstractC1115900f92
            public final void LJFF() {
            }

            @Override // X.AbstractC1115900f92
            public final void LIZLLL() {
                Map map;
                String string;
                Integer num;
                Object objPut;
                Map map2;
                Unit unit;
                BubbleClickAction bubbleClickAction;
                Map map3;
                String str;
                VoucherInfo voucherInfo;
                HighlightData highlightDataLIZJ = C20340514iR.LIZJ(this.LIZ.LIZJ.getIdStr());
                Unit unit2 = null;
                Object obj = ((LinkedHashMap) C1010603xI.LIZ((highlightDataLIZJ == null || (voucherInfo = highlightDataLIZJ.voucher) == null) ? null : voucherInfo.daInfo)).get("coupon_label_type");
                String strLIZJ = this.LIZIZ.LIZJ("room_id");
                if (strLIZJ == null) {
                    strLIZJ = "";
                }
                HashMap map4 = new HashMap();
                if (highlightDataLIZJ != null && (num = highlightDataLIZJ.resourceType) != null) {
                    int iIntValue = num.intValue();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("promotion_activity_type", Integer.valueOf(iIntValue));
                    VoucherInfo voucherInfo2 = highlightDataLIZJ.voucher;
                    if (voucherInfo2 != null && (str = voucherInfo2.voucherTypeId) != null) {
                        linkedHashMap.put("voucher_type_ids", new String[]{str});
                    }
                    try {
                        PromotionBubble promotionBubble = highlightDataLIZJ.promotionBubble;
                        if (promotionBubble == null || (bubbleClickAction = promotionBubble.bubbleClickAction) == null || (map3 = (Map) bubbleClickAction.LIZ.getValue()) == null) {
                            unit = null;
                        } else {
                            for (Map.Entry entry : map3.entrySet()) {
                                Object key = entry.getKey();
                                Object value = entry.getValue();
                                if (value == null) {
                                    value = "";
                                }
                                linkedHashMap.put(key, value);
                            }
                            unit = Unit.LIZ;
                        }
                        C189200o6.m2constructorimpl(unit);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                    map4.put("content_params", linkedHashMap);
                    try {
                        PromotionBubble promotionBubble2 = highlightDataLIZJ.promotionBubble;
                        if (promotionBubble2 == null || (map2 = (Map) promotionBubble2.LIZ.getValue()) == null) {
                            objPut = null;
                        } else {
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            for (String str2 : EcLivePromotionBubbleFeDaSetting.INSTANCE.getValue()) {
                                if (map2.containsKey(str2)) {
                                    linkedHashMap2.put(str2, map2.get(str2));
                                }
                            }
                            objPut = map4.put("track_params", linkedHashMap2);
                        }
                        C189200o6.m2constructorimpl(objPut);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        C189200o6.m2constructorimpl(new C098200Yq(th2));
                    }
                }
                C1440005kM.LIZ(new C037D(strLIZJ, null, "live_promotion_container", map4));
                C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                HighlightData highlightDataLIZJ2 = C20340514iR.LIZJ(this.LIZ.LIZJ.getIdStr());
                if (highlightDataLIZJ2 != null) {
                    this.LIZIZ.LJIIIIZZ("promotion_container_type", C20437214y2.LIZ(highlightDataLIZJ2), true);
                }
                for (Map.Entry entry2 : ((LinkedHashMap) this.LIZIZ.LJ()).entrySet()) {
                    linkedHashMap3.put(entry2.getKey(), entry2.getValue().toString());
                }
                linkedHashMap3.put("entrance_form", "live_promotion_container");
                if (obj != null) {
                    linkedHashMap3.put("coupon_label_type", obj.toString());
                }
                if (highlightDataLIZJ2 != null) {
                    try {
                        PromotionBubble promotionBubble3 = highlightDataLIZJ2.promotionBubble;
                        if (promotionBubble3 != null && (map = (Map) promotionBubble3.LIZ.getValue()) != null) {
                            for (Map.Entry entry3 : map.entrySet()) {
                                Object key2 = entry3.getKey();
                                Object value2 = entry3.getValue();
                                if (value2 == null || (string = value2.toString()) == null) {
                                    string = "";
                                }
                                linkedHashMap3.put(key2, string);
                            }
                            unit2 = Unit.LIZ;
                        }
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                        C189200o6.m2constructorimpl(new C098200Yq(th3));
                    }
                }
                C189200o6.m2constructorimpl(unit2);
                String str3 = this.LJ;
                PageFinder pageFinderLIZ = C520170Kad.LIZ(this.LIZ.LIZ);
                c1507790pL7.getClass();
                C1507790pL7.LIZIZ(pageFinderLIZ, "livesdk_tiktokec_product_entrance_click", str3, linkedHashMap3);
            }

            public final void LJII() {
                Map map;
                String string;
                VoucherInfo voucherInfo;
                if (this.LIZLLL && this.LIZJ && !this.LJFF) {
                    this.LJFF = true;
                    this.LIZIZ.LJIIIIZZ("entrance_form", "live_promotion_container", false);
                    HighlightData highlightDataLIZJ = C20340514iR.LIZJ(this.LIZ.LIZJ.getIdStr());
                    if (highlightDataLIZJ != null) {
                        this.LIZIZ.LJIIIIZZ("promotion_container_type", C20437214y2.LIZ(highlightDataLIZJ), true);
                    }
                    HighlightData highlightDataLIZJ2 = C20340514iR.LIZJ(this.LIZ.LIZJ.getIdStr());
                    Unit unit = null;
                    Object obj = ((LinkedHashMap) C1010603xI.LIZ((highlightDataLIZJ2 == null || (voucherInfo = highlightDataLIZJ2.voucher) == null) ? null : voucherInfo.daInfo)).get("coupon_label_type");
                    C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : ((LinkedHashMap) this.LIZIZ.LJ()).entrySet()) {
                        linkedHashMap.put(entry.getKey(), entry.getValue().toString());
                    }
                    if (obj != null) {
                        linkedHashMap.put("coupon_label_type", obj.toString());
                    }
                    if (highlightDataLIZJ != null) {
                        try {
                            PromotionBubble promotionBubble = highlightDataLIZJ.promotionBubble;
                            if (promotionBubble != null && (map = (Map) promotionBubble.LIZ.getValue()) != null) {
                                for (Map.Entry entry2 : map.entrySet()) {
                                    Object key = entry2.getKey();
                                    Object value = entry2.getValue();
                                    if (value == null || (string = value.toString()) == null) {
                                        string = "";
                                    }
                                    linkedHashMap.put(key, string);
                                }
                                unit = Unit.LIZ;
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C189200o6.m2constructorimpl(new C098200Yq(th));
                        }
                    }
                    C189200o6.m2constructorimpl(unit);
                    String str = this.LJ;
                    PageFinder pageFinderLIZ = C520170Kad.LIZ(this.LIZ.LIZ);
                    c1507790pL7.getClass();
                    C1507790pL7.LIZIZ(pageFinderLIZ, "livesdk_tiktokec_product_entrance_show", str, linkedHashMap);
                }
            }

            @Override // X.AbstractC1115900f92
            public final EnumC1115870f8z LIZ() {
                return this.LJI;
            }

            {
                String str;
                super(c1115920f94);
                C1743900vTw c1743900vTw = new C1743900vTw();
                this.LIZIZ = c1743900vTw;
                this.LJ = "a2270.b4180.c25278.d0";
                Room room = c1115920f94.LIZJ;
                c1743900vTw.LJIIIIZZ("EVENT_ORIGIN_FEATURE", "TEMAI", false);
                c1743900vTw.LJIIIIZZ("room_id", String.valueOf(room.getId()), false);
                c1743900vTw.LJIIIIZZ("author_id", String.valueOf(room.getOwnerUserId()), false);
                c1743900vTw.LJIIIIZZ("follow_status", room.getOwner().followStatus.toString(), false);
                c1743900vTw.LJIIIIZZ("page_type", "live", false);
                c1743900vTw.LJIIIIZZ("page_name", "live", false);
                c1743900vTw.LJIIIIZZ("source_page_type", "live", false);
                c1743900vTw.LJIIIIZZ("request_id", room.getRequestId(), true);
                String requestId = room.getRequestId();
                c1743900vTw.LJIIIIZZ("track_id", C03RE.LIZ(requestId == null ? "" : requestId, String.valueOf(room.getId()), ""), false);
                C21211517zd c21211517zd = c1115920f94.LIZLLL;
                c1743900vTw.LJIIIIZZ("enter_from_merge", c21211517zd.LIZ, true);
                c1743900vTw.LJIIIIZZ("enter_method", c21211517zd.LIZIZ, false);
                c1743900vTw.LJIIIIZZ("action_type", c21211517zd.LIZJ, false);
                c1743900vTw.LJIIIIZZ("rec_content_id", c21211517zd.LJ, false);
                c1743900vTw.LJIIIIZZ("rec_content_type", c21211517zd.LJFF, false);
                c1743900vTw.LJIIIIZZ("search_id", c21211517zd.LJI, true);
                c1743900vTw.LJIIIIZZ("search_result_id", c21211517zd.LJII, false);
                c1743900vTw.LJIIIIZZ("param_live_begin_time", String.valueOf(c21211517zd.LJIIIIZZ), false);
                c1743900vTw.LJIIIIZZ("param_live_begin_time_real", String.valueOf(c21211517zd.LJIIIZ), false);
                if (c21211517zd.LIZLLL) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                c1743900vTw.LJIIIIZZ("is_ad", str, false);
                this.LJI = EnumC1115870f8z.ECOMMERCE;
            }

            @Override // X.AbstractC1115900f92
            public final void LJI(EnumC1115840f8w enumC1115840f8w) {
                this.LIZLLL = false;
                this.LJFF = false;
                C20340614iS c20340614iS = (C20340614iS) C20340514iR.LIZIZ().get(this.LIZ.LIZJ.getIdStr());
                if (c20340614iS != null) {
                    c20340614iS.LIZ = null;
                }
            }
        };
    }
}
