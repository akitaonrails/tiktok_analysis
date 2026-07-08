package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.17xW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21198417xW {
    public static final C21198417xW LIZ = new C21198417xW();

    public static void LIZ(JSONObject jSONObject, String str, Object obj) {
        if (obj != null) {
            jSONObject.put(str, obj);
        }
    }

    public static final void LIZIZ(C1743900vTw c1743900vTw, String str, String str2) {
        String strLIZJ;
        String strLIZJ2;
        String strLIZJ3;
        String strLIZJ4;
        String strLIZJ5;
        String strLIZJ6;
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        String str3 = "";
        if (c1743900vTw == null || (strLIZJ = c1743900vTw.LIZJ("author_id")) == null) {
            strLIZJ = "";
        }
        linkedHashMap.put("author_id", strLIZJ);
        if (c1743900vTw == null || (strLIZJ2 = c1743900vTw.LIZJ("room_id")) == null) {
            strLIZJ2 = "";
        }
        linkedHashMap.put("room_id", strLIZJ2);
        linkedHashMap.put("live_status", "during_live");
        linkedHashMap.put("page_name", "live");
        linkedHashMap.put("button_name", "live_helper");
        linkedHashMap.put("is_pin_product", "1");
        linkedHashMap.put("user_type", "moderator");
        if (c1743900vTw == null || (strLIZJ3 = c1743900vTw.LIZJ("product_id")) == null) {
            strLIZJ3 = "";
        }
        linkedHashMap.put("product_id", strLIZJ3);
        if (c1743900vTw == null || (strLIZJ4 = c1743900vTw.LIZJ("product_source")) == null) {
            strLIZJ4 = "";
        }
        linkedHashMap.put("product_source", strLIZJ4);
        if (c1743900vTw == null || (strLIZJ5 = c1743900vTw.LIZJ("source_from")) == null) {
            strLIZJ5 = "";
        }
        linkedHashMap.put("source_from", strLIZJ5);
        if (c1743900vTw != null && (strLIZJ6 = c1743900vTw.LIZJ("source")) != null) {
            str3 = strLIZJ6;
        }
        linkedHashMap.put("source", str3);
        linkedHashMap.put("button_type", "open");
        if (Intrinsics.LJFF("moderator", "moderator")) {
            linkedHashMap.put("moderator_id", ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID());
        }
        linkedHashMap.put("click_status", str);
        if (str2 != null) {
            linkedHashMap.put("fail_reason", str2);
        }
        c1507790pL7.getClass();
        C1507790pL7.LIZJ("livesdk_tiktokec_button_click", linkedHashMap);
    }

    public static final void LIZJ(String str, String str2, String str3, String str4) {
        try {
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("author_id", str2);
            jSONObject.put("room_id", str);
            jSONObject.put("product_id", str4);
            jSONObject.put("live_role", str3);
            c1507790pL7.getClass();
            C1507790pL7.LIZLLL("rd_tiktokec_cancel_pin_product", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static final void LJIIIZ(String str, String str2, String str3, String str4, String str5) {
        try {
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("product_id", str);
            jSONObject.put("room_id", str2);
            jSONObject.put("message_id", str3);
            jSONObject.put("author_id", str4);
            jSONObject.put("live_role", str5);
            c1507790pL7.getClass();
            C1507790pL7.LIZLLL("rd_tiktokec_pin_card_entrance_show", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJFF(java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, boolean r10, boolean r11) {
        /*
            if (r9 == 0) goto L1a
            r1 = 47
            boolean r0 = kotlin.text.a0.LJJLIIIJJIZ(r9, r1)
            if (r0 != 0) goto L1c
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = X.C2188811AlT.LIZIZ(r0)
            if (r9 != 0) goto L1c
        L1a:
            java.lang.String r9 = ""
        L1c:
            X.0pL7 r5 = X.C1507790pL7.LIZ
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.lang.String r1 = "EVENT_ORIGIN_FEATURE"
            java.lang.String r0 = "TEMAI"
            r4.put(r1, r0)
            java.lang.String r0 = "product_id"
            r4.put(r0, r6)
            java.lang.String r0 = "room_id"
            r4.put(r0, r7)
            java.lang.String r3 = "1"
            java.lang.String r2 = "0"
            if (r10 == 0) goto L5b
            r1 = r3
        L3b:
            java.lang.String r0 = "is_anchor"
            r4.put(r0, r1)
            if (r11 != 0) goto L43
            r3 = r2
        L43:
            java.lang.String r0 = "price_changed"
            r4.put(r0, r3)
            java.lang.String r0 = "trigger"
            r4.put(r0, r8)
            java.lang.String r0 = "path"
            r4.put(r0, r9)
            r5.getClass()
            java.lang.String r0 = "rd_tiktokec_refresh_live_pin_card_data"
            X.C1507790pL7.LIZLLL(r0, r4)
            return
        L5b:
            r1 = r2
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21198417xW.LJFF(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void");
    }

    public static final void LJI(boolean z, String str, String str2, String str3, String str4, String str5, boolean z2, boolean z3) {
        int i;
        int i2;
        try {
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("product_id", str);
            jSONObject.put("room_id", str2);
            jSONObject.put("author_id", str3);
            int i3 = 1;
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("has_ec_perm", i);
            if (z2) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            jSONObject.put("is_anchor", i2);
            jSONObject.put("quit_step", str4);
            jSONObject.put("live_role", str5);
            if (!z3) {
                i3 = 0;
            }
            jSONObject.put("is_page_visible", i3);
            c1507790pL7.getClass();
            C1507790pL7.LIZLLL("rd_tiktokec_live_pop_product_quit", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static final void LJII(String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, boolean z3, boolean z4) {
        int i;
        int i2;
        int i3;
        try {
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("product_id", str2);
            jSONObject.put("room_id", str3);
            jSONObject.put("page_name", "live");
            jSONObject.put("author_id", str4);
            jSONObject.put("source", str);
            jSONObject.put("is_first", str5);
            jSONObject.put("live_role", str6);
            int i4 = 1;
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("is_app_background", i);
            if (z2) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            jSONObject.put("is_page_visible", i2);
            if (z3) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            jSONObject.put("has_ec_perm", i3);
            if (!z4) {
                i4 = 0;
            }
            jSONObject.put("is_anchor", i4);
            c1507790pL7.getClass();
            C1507790pL7.LIZLLL("rd_ec_data_ready", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static final void LIZLLL(String str, String str2, boolean z, long j, int i, String str3, boolean z2, String str4, boolean z3, boolean z4, String str5, boolean z5, Map<String, String> map, Integer num) {
        int i2;
        String str6;
        int i3;
        int i4;
        try {
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            JSONObject jSONObject = new JSONObject();
            int i5 = 1;
            if (z) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            jSONObject.put("is_success", i2);
            jSONObject.put("anchor_id", str);
            jSONObject.put("room_id", str2);
            jSONObject.put("cost", j);
            jSONObject.put("error_msg", str3);
            jSONObject.put("ec_code", String.valueOf(i));
            if (z2) {
                str6 = "1";
            } else {
                str6 = CardStruct.IStatusCode.DEFAULT;
            }
            jSONObject.put("is_from_message", str6);
            jSONObject.put("live_role", str4);
            if (z3) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            jSONObject.put("is_prefetch", i3);
            if (z4) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            jSONObject.put("is_dirty", i4);
            jSONObject.put("source", str5);
            if (!z5) {
                i5 = 0;
            }
            jSONObject.put("is_first", i5);
            jSONObject.put("card_type", num);
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            }
            c1507790pL7.getClass();
            C1507790pL7.LIZLLL("rd_tiktokec_get_introduce_products", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static final void LJIIIIZZ(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Map<String, String> map, String str15) {
        try {
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("EVENT_ORIGIN_FEATURE", "TEMAI");
            jSONObject.put("author_id", str2);
            jSONObject.put("product_id", str3);
            jSONObject.put("room_id", str4);
            String str16 = "";
            if (str5 == null) {
                str5 = "";
            }
            jSONObject.put("enter_from_merge", str5);
            if (str6 == null) {
                str6 = "";
            }
            jSONObject.put("enter_method", str6);
            if (str7 == null) {
                str7 = "";
            }
            jSONObject.put("action_type", str7);
            if (str8 == null) {
                str8 = "";
            }
            jSONObject.put("product_source", str8);
            if (str9 == null) {
                str9 = "";
            }
            jSONObject.put("track_id", str9);
            jSONObject.put("source_page_type", "live");
            if (str10 == null) {
                str10 = "";
            }
            jSONObject.put("item_order", str10);
            jSONObject.put("entrance_form", "live_popup_card");
            if (str11 == null) {
                str11 = "";
            }
            jSONObject.put("follow_status", str11);
            if (str12 != null) {
                str16 = str12;
            }
            jSONObject.put("is_ad", str16);
            LIZ.getClass();
            LIZ(jSONObject, "request_id", str13);
            jSONObject.put("page_name", str14);
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            }
            LIZ.getClass();
            LIZ(jSONObject, "live_role", str15);
            c1507790pL7.getClass();
            C1507790pL7.LIZLLL(str, jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
