package X;

import android.app.Dialog;
import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0lkf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1369870lkf {
    public static long LIZJ;
    public static long LIZLLL;
    public static String LJ;
    public static String LJFF;
    public static String LJI;
    public static String LJII;
    public static String LJIIIIZZ;
    public static String LJIIIZ;
    public static String LJIIJ;
    public static String LJIIJJI;
    public static String LJIIL;
    public static String LJIILIIL;
    public static String LJIILJJIL;
    public static String LJIILL;
    public static String LJIILLIIL;
    public static String LJIIZILJ;
    public static Boolean LJIJ;
    public static Boolean LJIJJ;
    public static boolean LJIL;
    public static String LJJ;
    public static String LJJI;
    public static String LJJII;
    public static String LJJIII;
    public static int LJJIIZ;
    public static long LJJIJIL;
    public static String LJJIL;
    public static String LJJIZ;
    public static String LJJJ;
    public static Integer LJJJI;
    public static Integer LJJJIL;
    public static Integer LJJJJ;
    public static final ArrayList<JSONObject> LIZ = new ArrayList<>();
    public static final ArrayList<JSONObject> LIZIZ = new ArrayList<>();
    public static int LJIJI = -1;
    public static int LJIJJLI = -1;
    public static int LJJIFFI = 1;
    public static String LJJIIJ = "";
    public static String LJJIIJZLJL = "";
    public static String LJJIIZI = "";
    public static final int LJJIJ = 1;
    public static int LJJIJIIJI = 1;
    public static String LJJIJIIJIL = "";
    public static final List<String> LJJIJL = C1697810uHb.LJIILJJIL("search_id", "search_result_id", "search_keyword", "search_type");
    public static final HashMap<String, String> LJJIJLIJ = new HashMap<>();
    public static String LJJJJI = "";

    public static void LIZ(InterfaceC1370310llN interfaceC1370310llN) {
        String strKey;
        JSONObject jSONObject = new JSONObject();
        Integer numValueOf = null;
        if (interfaceC1370310llN != null) {
            strKey = interfaceC1370310llN.key();
        } else {
            strKey = null;
        }
        jSONObject.put("action_id", strKey);
        jSONObject.put("expose_time", System.currentTimeMillis());
        if (interfaceC1370310llN != null) {
            numValueOf = Integer.valueOf(interfaceC1370310llN.enable() ? 1 : 0);
        }
        jSONObject.put("enabled", numValueOf);
        LIZIZ.add(jSONObject);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZIZ(InterfaceC1369790lkX interfaceC1369790lkX) {
        String strKey;
        boolean zLIZJ;
        JSONObject jSONObject = new JSONObject();
        if (interfaceC1369790lkX != null) {
            strKey = interfaceC1369790lkX.key();
        } else {
            strKey = null;
        }
        jSONObject.put("platform", strKey);
        jSONObject.put("expose_time", System.currentTimeMillis());
        if (interfaceC1369790lkX != null) {
            zLIZJ = interfaceC1369790lkX.LIZJ();
        } else {
            zLIZJ = 0;
        }
        jSONObject.put("enabled", !zLIZJ);
        LIZ.add(jSONObject);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJI(com.ss.android.ugc.aweme.share.base.model.BaseSharePackage r3) {
        /*
            X.0ll3 r2 = X.C1370370llT.LIZ
            r1 = 1
            r0 = 0
            if (r2 == 0) goto L21
            if (r3 == 0) goto La
            java.lang.String r0 = r3.itemType
        La:
            boolean r0 = r2.LJIILJJIL(r0)
            if (r0 != r1) goto L21
            if (r3 == 0) goto L1e
            android.os.Bundle r1 = r3.extras
            if (r1 == 0) goto L1e
            java.lang.String r0 = "aid"
            java.lang.String r0 = r1.getString(r0)
            if (r0 != 0) goto L20
        L1e:
            java.lang.String r0 = ""
        L20:
            return r0
        L21:
            java.lang.String r1 = "item_id"
            if (r3 == 0) goto L1e
            android.os.Bundle r0 = r3.extras
            if (r0 == 0) goto L44
            java.lang.String r0 = r0.getString(r1)
            if (r0 == 0) goto L42
            int r0 = r0.length()
            if (r0 == 0) goto L42
            if (r3 == 0) goto L1e
            android.os.Bundle r0 = r3.extras
            if (r0 == 0) goto L1e
            java.lang.String r0 = r0.getString(r1)
            if (r0 != 0) goto L20
            goto L1e
        L42:
            if (r3 == 0) goto L1e
        L44:
            java.lang.String r0 = r3.identifier
            if (r0 != 0) goto L20
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1369870lkf.LJI(com.ss.android.ugc.aweme.share.base.model.BaseSharePackage):java.lang.String");
    }

    public static void LJII(boolean z) {
        LIZ.clear();
        LIZIZ.clear();
        LIZLLL = 0L;
        LJ = null;
        LJI = null;
        LJII = null;
        LJIIIIZZ = null;
        LJIIIZ = null;
        LJIIJ = null;
        LJIIJJI = null;
        LJIIL = null;
        LJIILJJIL = null;
        LJIILL = null;
        LJIILLIIL = null;
        LJIIZILJ = null;
        LJIJ = null;
        LJIJI = -1;
        LJIJJ = null;
        LJIJJLI = -1;
        LJIL = z;
        LJJ = null;
        LJJIIJ = "";
        LJJIIJZLJL = "";
        LJJIIZ = 0;
        LJJIIZI = "";
        LJJIJIIJIL = UUID.randomUUID().toString();
    }

    public static void LJIIIIZZ(int i) {
        Integer numValueOf;
        if (!LJIL) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("aweme_type", LJJIL);
        linkedHashMap.put("from_page", LJFF);
        linkedHashMap.put("enter_from", LJ);
        linkedHashMap.put("panel_source", LJII);
        linkedHashMap.put("item_type", LJIIIIZZ);
        linkedHashMap.put("item_id", LJIIIZ);
        linkedHashMap.put("unique_id", LJIILJJIL);
        linkedHashMap.put("action_id", LJIIZILJ);
        Boolean bool = LJIJJ;
        if (bool != null) {
            numValueOf = Integer.valueOf(bool.booleanValue() ? 1 : 0);
        } else {
            numValueOf = null;
        }
        linkedHashMap.put("enabled", numValueOf);
        linkedHashMap.put("scenario_status", Integer.valueOf(LJIJJLI));
        linkedHashMap.put("detail_tab_name", LJJIIZI);
        linkedHashMap.put("panel_id", LJJIJIIJIL);
        linkedHashMap.put("author_id", LJJ);
        if (i != -1) {
            linkedHashMap.put("icon_position", Integer.valueOf(i));
        }
        Integer num = LJJJI;
        if (num != null) {
            linkedHashMap.put("live_pic_cnt", num);
            linkedHashMap.put("loop_livephoto_show_cnt", LJJJIL);
            linkedHashMap.put("live_livephoto_show_cnt", LJJJJ);
        }
        InterfaceC1367490lgp interfaceC1367490lgp = C1370370llT.LIZIZ;
        if (interfaceC1367490lgp != null) {
            interfaceC1367490lgp.LIZ("action_clicked_start", linkedHashMap);
        }
    }

    public static void LJIILJJIL(C1371590lnR c1371590lnR) {
        BaseSharePackage baseSharePackage;
        List<InterfaceC1369790lkX> list;
        Bundle bundle;
        String string;
        if (c1371590lnR != null) {
            baseSharePackage = c1371590lnR.LJIJJ;
        } else {
            baseSharePackage = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", LJ);
        linkedHashMap.put("enter_method", LJI);
        linkedHashMap.put("panel_source", LJII);
        linkedHashMap.put("item_type", LJIIIIZZ);
        if (baseSharePackage != null && (bundle = baseSharePackage.extras) != null && (string = bundle.getString("item_author_type")) != null) {
            linkedHashMap.put("item_author_type", string);
        }
        if (c1371590lnR != null && (list = c1371590lnR.LIZ) != null) {
            int i = 0;
            for (InterfaceC1369790lkX interfaceC1369790lkX : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    linkedHashMap.put(interfaceC1369790lkX.key(), Integer.valueOf(i));
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        InterfaceC1367490lgp interfaceC1367490lgp = C1370370llT.LIZIZ;
        if (interfaceC1367490lgp != null) {
            interfaceC1367490lgp.LIZ("share_platform_sort_result", linkedHashMap);
        }
    }

    public static void LJIILL(C1371590lnR c1371590lnR) {
        BaseSharePackage baseSharePackage;
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        Bundle bundle;
        String string8;
        Bundle bundle2;
        String string9;
        String string10;
        Bundle bundle3;
        String string11;
        Bundle bundle4;
        InterfaceC1371680lna interfaceC1371680lna = C1370370llT.LIZJ;
        if (interfaceC1371680lna != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("open share panel cost: ");
            sbLIZ.append(LIZLLL - LIZJ);
            interfaceC1371680lna.i("SharePanelExposure", C2188811AlT.LIZIZ(sbLIZ));
        }
        String string12 = null;
        if (c1371590lnR != null) {
            baseSharePackage = c1371590lnR.LJIJJ;
        } else {
            baseSharePackage = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (baseSharePackage != null && (bundle4 = baseSharePackage.extras) != null) {
            string = bundle4.getString("previous_page");
        } else {
            string = null;
        }
        if (Intrinsics.LJFF(string, "chat_settings")) {
            linkedHashMap.put("enter_from", baseSharePackage.extras.getString("previous_page"));
        } else {
            linkedHashMap.put("enter_from", LJ);
        }
        linkedHashMap.put("enter_method", LJI);
        linkedHashMap.put("panel_source", LJII);
        if (baseSharePackage == null || (bundle3 = baseSharePackage.extras) == null || (string11 = bundle3.getString("panel_source_v2")) == null || (string2 = a0.LJLIIIL(string11).toString()) == null || string2.length() <= 0) {
            string2 = "share_panel";
        }
        linkedHashMap.put("panel_source_v2", string2);
        if (baseSharePackage != null) {
            Bundle bundle5 = baseSharePackage.extras;
            if (bundle5 != null && (string10 = bundle5.getString("series_category")) != null && string10.length() > 0) {
                linkedHashMap.put("series_category", string10);
            }
            Bundle bundle6 = baseSharePackage.extras;
            if (bundle6 != null && (string9 = bundle6.getString("item_author_type")) != null) {
                linkedHashMap.put("item_author_type", string9);
            }
        }
        linkedHashMap.put("item_type", LJIIIIZZ);
        linkedHashMap.put("item_id", LJIIIZ);
        linkedHashMap.put("show_performance_duration", Long.valueOf(LIZLLL - LIZJ));
        linkedHashMap.put("group_id", LJIIJ);
        linkedHashMap.put("function_show", LJIIJJI);
        if (C1367830lhN.LIZ(c1371590lnR)) {
            linkedHashMap.put("full_channel_list", LJIIL);
            linkedHashMap.put("filter_channel_list", LJIILIIL);
        }
        linkedHashMap.put("from_page", LJFF);
        linkedHashMap.put("is_new_panel", Integer.valueOf(LJIL ? 1 : 0));
        linkedHashMap.put("author_id", LJJ);
        linkedHashMap.put("now_type", LJJI);
        if (baseSharePackage != null && (bundle2 = baseSharePackage.extras) != null) {
            string12 = bundle2.getString("share_campaign_id");
        }
        String str = "";
        if (string12 == null) {
            string12 = "";
        }
        linkedHashMap.put("holiday_id", string12);
        linkedHashMap.put("is_today", Integer.valueOf(LJJIFFI));
        linkedHashMap.put("is_self", LJJIIJ);
        linkedHashMap.put("privacy_setting", LJJIIJZLJL);
        linkedHashMap.put("detail_tab_name", LJJIIZI);
        linkedHashMap.put("is_first_show_after_cold_launch", Integer.valueOf(LJJIJ));
        linkedHashMap.put("panel_type", LJJJJI);
        if (baseSharePackage != null && (bundle = baseSharePackage.extras) != null && (string8 = bundle.getString("l8_user_edit_status")) != null) {
            str = string8;
        }
        linkedHashMap.put("l8_user_edit_status", str);
        if (baseSharePackage != null) {
            Bundle bundle7 = baseSharePackage.extras;
            if (bundle7 != null && (string7 = bundle7.getString("is_referral")) != null) {
                linkedHashMap.put("is_referral", string7);
            }
            Bundle bundle8 = baseSharePackage.extras;
            if (bundle8 != null && (string6 = bundle8.getString("is_holiday_limit")) != null) {
                linkedHashMap.put("is_holiday_limit", string6);
            }
            Bundle bundle9 = baseSharePackage.extras;
            if (bundle9 != null && (string5 = bundle9.getString("incentive_operation_type")) != null) {
                linkedHashMap.put("incentive_operation_type", string5);
            }
        }
        LIZJ(baseSharePackage, linkedHashMap);
        linkedHashMap.put("aweme_type", LJJIL);
        linkedHashMap.put("visual_search_long_press_timestamp", LJJIZ);
        linkedHashMap.put("visual_search_long_press_index", LJJJ);
        linkedHashMap.put("panel_id", LJJIJIIJIL);
        HashMap<String, String> map = LJJIJLIJ;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (baseSharePackage != null) {
            Bundle bundle10 = baseSharePackage.extras;
            if (bundle10 != null && (string4 = bundle10.getString("conversation_id")) != null) {
                linkedHashMap.put("conversation_id", string4);
            }
            Bundle bundle11 = baseSharePackage.extras;
            if (bundle11 != null && (string3 = bundle11.getString("chat_type")) != null) {
                linkedHashMap.put("chat_type", string3);
            }
        }
        LIZLLL(baseSharePackage, linkedHashMap);
        InterfaceC1367490lgp interfaceC1367490lgp = C1370370llT.LIZIZ;
        if (interfaceC1367490lgp != null) {
            interfaceC1367490lgp.LIZ("show_panel_function", linkedHashMap);
        }
        LIZLLL = 0L;
        LIZJ = 0L;
    }

    public static String LJIILLIIL(BaseSharePackage baseSharePackage) {
        InterfaceC1370110ll3 interfaceC1370110ll3;
        String strLJIILL;
        Bundle bundle;
        String string;
        if ((baseSharePackage != null && (bundle = baseSharePackage.extras) != null && (string = bundle.getString("share_item_type")) != null && (strLJIILL = a0.LJLIIIL(string).toString()) != null && strLJIILL.length() > 0) || ((interfaceC1370110ll3 = C1370370llT.LIZ) != null && (strLJIILL = interfaceC1370110ll3.LJIILL(baseSharePackage)) != null)) {
            return strLJIILL;
        }
        return "";
    }

    public static void LJIIZILJ(InterfaceC1370310llN interfaceC1370310llN) {
        String strKey;
        Boolean boolValueOf;
        int iLJIIJJI;
        LJIILJJIL = UUID.randomUUID().toString();
        if (interfaceC1370310llN == null || (strKey = interfaceC1370310llN.key()) == null) {
            strKey = "";
        }
        LJIIZILJ = strKey;
        if (interfaceC1370310llN != null) {
            boolValueOf = Boolean.valueOf(interfaceC1370310llN.enable());
        } else {
            boolValueOf = Boolean.FALSE;
        }
        LJIJJ = boolValueOf;
        if (interfaceC1370310llN != null) {
            iLJIIJJI = interfaceC1370310llN.LJIIJJI();
        } else {
            iLJIIJJI = -1;
        }
        LJIJJLI = iLJIIJJI;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIJ(X.C1371590lnR r9) {
        /*
            Method dump skipped, instruction units count: 830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1369870lkf.LJIJ(X.0lnR):void");
    }

    public static void LJIJI(TuxSheet tuxSheet) {
        if (LIZJ == 0) {
            LIZJ = System.currentTimeMillis();
        }
        InterfaceC1369830lkb interfaceC1369830lkb = C1370370llT.LJIIJ;
        if (interfaceC1369830lkb != null && interfaceC1369830lkb.LIZJ() != null) {
            C1369900lki.LIZJ(tuxSheet);
        }
    }

    public static void LIZJ(BaseSharePackage baseSharePackage, Map map) {
        Bundle bundle;
        String string;
        if (baseSharePackage != null && (bundle = baseSharePackage.extras) != null && (string = bundle.getString("channel_id")) != null) {
            int i = bundle.getInt("is_author");
            int i2 = bundle.getInt("is_subscribed");
            map.put("channel_id", string);
            map.put("is_author", Integer.valueOf(i));
            if (i == 0 && i2 != -1) {
                map.put("is_subscribed", Integer.valueOf(i2));
            }
        }
    }

    public static void LIZLLL(BaseSharePackage baseSharePackage, Map map) {
        String string;
        String string2;
        if (baseSharePackage != null) {
            Bundle bundle = baseSharePackage.extras;
            if (bundle != null && (string2 = bundle.getString("bizTrackParams")) != null) {
                map.put("biz_track_params", string2);
            }
            Bundle bundle2 = baseSharePackage.extras;
            if (bundle2 != null && (string = bundle2.getString("bizTag")) != null) {
                map.put("biz_tag", string);
            }
        }
    }

    public static void LJ(TuxSheet tuxSheet, C1371590lnR c1371590lnR) {
        BaseSharePackage baseSharePackage;
        String string;
        BaseSharePackage baseSharePackage2;
        Bundle bundle;
        Bundle bundle2;
        String string2;
        Dialog dialog;
        InterfaceC1369830lkb interfaceC1369830lkb = C1370370llT.LJIIJ;
        BaseSharePackage baseSharePackage3 = null;
        if (interfaceC1369830lkb != null && interfaceC1369830lkb.LIZJ() != null) {
            if (tuxSheet != null) {
                dialog = tuxSheet.getDialog();
            } else {
                dialog = null;
            }
            C1369900lki.LIZ(dialog);
        }
        LJIL = false;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", LJ);
        linkedHashMap.put("panel_source", LJII);
        linkedHashMap.put("item_type", LJIIIIZZ);
        linkedHashMap.put("item_id", LJIIIZ);
        linkedHashMap.put("exposed_channel_list", LIZ.toString());
        if (C1367830lhN.LIZ(c1371590lnR)) {
            linkedHashMap.put("full_channel_list", LJIIL);
        }
        linkedHashMap.put("detail_tab_name", LJJIIZI);
        linkedHashMap.put("is_expand", Integer.valueOf(LJJIIZ));
        if (c1371590lnR != null) {
            BaseSharePackage baseSharePackage4 = c1371590lnR.LJIJJ;
            if (baseSharePackage4 != null && (bundle2 = baseSharePackage4.extras) != null && (string2 = bundle2.getString("is_referral")) != null) {
                linkedHashMap.put("is_referral", string2);
            }
            baseSharePackage = c1371590lnR.LJIJJ;
        } else {
            baseSharePackage = null;
        }
        LIZLLL(baseSharePackage, linkedHashMap);
        InterfaceC1367490lgp interfaceC1367490lgp = C1370370llT.LIZIZ;
        if (interfaceC1367490lgp != null) {
            interfaceC1367490lgp.LIZ("exposed_share_panel_channels", linkedHashMap);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("enter_from", LJ);
        linkedHashMap2.put("panel_source", LJII);
        linkedHashMap2.put("item_type", LJIIIIZZ);
        linkedHashMap2.put("item_id", LJIIIZ);
        linkedHashMap2.put("exposed_action_list", LIZIZ.toString());
        linkedHashMap2.put("function_show", LJIIJJI);
        linkedHashMap2.put("detail_tab_name", LJJIIZI);
        String str = "";
        if (Intrinsics.LJFF("prop_page", LJ) || Intrinsics.LJFF("single_song", LJ)) {
            if (c1371590lnR == null || (baseSharePackage2 = c1371590lnR.LJIJJ) == null || (bundle = baseSharePackage2.extras) == null || (string = bundle.getString("page_name")) == null) {
                string = "";
            }
            linkedHashMap2.put("page_name", string);
        }
        if (c1371590lnR != null) {
            baseSharePackage3 = c1371590lnR.LJIJJ;
        }
        LIZLLL(baseSharePackage3, linkedHashMap2);
        InterfaceC1367490lgp interfaceC1367490lgp2 = C1370370llT.LIZIZ;
        if (interfaceC1367490lgp2 != null) {
            interfaceC1367490lgp2.LIZ("exposed_share_panel_actions", linkedHashMap2);
        }
        int i = LJJIJIIJI;
        LJJIJIIJI = 0;
        Pair[] pairArr = new Pair[7];
        String str2 = LJIIIIZZ;
        if (str2 == null) {
            str2 = "";
        }
        pairArr[0] = new Pair("item_type", str2);
        String str3 = LJII;
        if (str3 == null) {
            str3 = "";
        }
        pairArr[1] = new Pair("panel_source", str3);
        String str4 = LJ;
        if (str4 == null) {
            str4 = "";
        }
        pairArr[2] = new Pair("enter_from", str4);
        String str5 = LJIIIZ;
        if (str5 == null) {
            str5 = "";
        }
        pairArr[3] = new Pair("item_id", str5);
        String str6 = LJIIJJI;
        if (str6 == null) {
            str6 = "";
        }
        pairArr[4] = new Pair("function_show", str6);
        String str7 = LJIIL;
        if (str7 != null) {
            str = str7;
        }
        pairArr[5] = new Pair("full_channel_list", str);
        pairArr[6] = new Pair("is_first_show", Integer.valueOf(i));
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        for (Map.Entry<String, C1364460lbw> entry : C1361760lXa.LIZ.entrySet()) {
            C1364460lbw value = entry.getValue();
            long j = value.LIZ;
            if (j != 0) {
                long j2 = value.LIZIZ;
                if (j2 != 0 && j <= j2) {
                    mapLJIIJ.put(entry.getKey(), Long.valueOf(entry.getValue().LIZIZ - entry.getValue().LIZ));
                }
            }
        }
        InterfaceC1367490lgp interfaceC1367490lgp3 = C1370370llT.LIZIZ;
        if (interfaceC1367490lgp3 != null) {
            interfaceC1367490lgp3.LIZ("share_panel_load_perf", mapLJIIJ);
        }
    }

    public static Integer LJFF(Bundle bundle, String str) {
        if (bundle.containsKey(str)) {
            return Integer.valueOf(bundle.getInt(str));
        }
        return null;
    }

    public static final void LJIILIIL(AbstractC343940De4 abstractC343940De4, BaseSharePackage baseSharePackage) {
        String str;
        Boolean boolValueOf;
        Bundle bundle;
        if (abstractC343940De4 instanceof C572630Md3) {
            str = "click_function";
        } else if (abstractC343940De4 instanceof C572640Md4) {
            str = "share_video_out";
        } else if (abstractC343940De4 instanceof C1366410lf5) {
            str = "share_video";
        } else if (abstractC343940De4 instanceof C1367950lhZ) {
            str = "click_outside";
        } else if (abstractC343940De4 instanceof C1367520lgs) {
            str = "ai_avatar_share_icon";
        } else if (abstractC343940De4 instanceof C1366420lf6) {
            str = "recommend";
        } else {
            str = "slide_down";
        }
        if (baseSharePackage != null && (bundle = baseSharePackage.extras) != null) {
            boolValueOf = Boolean.valueOf(bundle.getBoolean("lpp_im_clicked"));
        } else {
            boolValueOf = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", LJ);
        linkedHashMap.put("from_page", LJFF);
        linkedHashMap.put("panel_source", LJII);
        linkedHashMap.put("group_id", LJIIJ);
        linkedHashMap.put("enter_method", str);
        linkedHashMap.put("panel_type", LJJJJI);
        linkedHashMap.put("is_used_function", Integer.valueOf(Intrinsics.LJFF("click_function", str) ? 1 : 0));
        int i = 0;
        if (Intrinsics.LJFF(str, "share_video_out") || Intrinsics.LJFF(str, "share_video") || Intrinsics.LJFF(str, "recommend") || Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            i = 1;
        }
        linkedHashMap.put("is_share_video", Integer.valueOf(i));
        if (baseSharePackage != null) {
            Bundle bundle2 = baseSharePackage.extras;
            if (bundle2.containsKey("longPressDownX")) {
                linkedHashMap.put("x", Integer.valueOf(bundle2.getInt("longPressDownX")));
            }
            if (bundle2.containsKey("longPressDownY")) {
                linkedHashMap.put("y", Integer.valueOf(bundle2.getInt("longPressDownY")));
            }
            LIZJ(baseSharePackage, linkedHashMap);
        }
        LIZLLL(baseSharePackage, linkedHashMap);
        InterfaceC1367490lgp interfaceC1367490lgp = C1370370llT.LIZIZ;
        if (interfaceC1367490lgp != null) {
            interfaceC1367490lgp.LIZ("close_panel", linkedHashMap);
        }
    }

    public static void LJIIIZ(boolean z, BaseSharePackage baseSharePackage, int i) {
        String string;
        String string2;
        String string3;
        String string4;
        Integer numValueOf;
        String string5;
        String string6;
        long j;
        long j2;
        Integer numValueOf2;
        Bundle bundle;
        String string7;
        Bundle bundle2;
        String string8;
        String string9;
        String string10;
        Bundle bundle3;
        Bundle bundle4;
        String string11;
        Bundle bundle5;
        Integer numLJFF;
        Bundle bundle6;
        Bundle bundle7;
        Bundle bundle8;
        Bundle bundle9;
        Bundle bundle10;
        Bundle bundle11;
        Bundle bundle12;
        Bundle bundle13;
        Bundle bundle14;
        if (baseSharePackage != null && (bundle14 = baseSharePackage.extras) != null) {
            string = bundle14.getString("share_template_id");
        } else {
            string = null;
        }
        String str = "";
        if (string == null) {
            string = "";
        }
        if (baseSharePackage == null || (bundle13 = baseSharePackage.extras) == null || (string2 = bundle13.getString("enter_from")) == null) {
            string2 = "";
        }
        if (baseSharePackage == null || (bundle12 = baseSharePackage.extras) == null || (string3 = bundle12.getString("panel_source")) == null) {
            string3 = "";
        }
        String strLJIILLIIL = LJIILLIIL(baseSharePackage);
        if (baseSharePackage == null || (bundle11 = baseSharePackage.extras) == null || (string4 = bundle11.getString("channel_enter_type")) == null) {
            string4 = "";
        }
        if (baseSharePackage != null && (bundle10 = baseSharePackage.extras) != null) {
            numValueOf = Integer.valueOf(bundle10.getInt("is_preload", 0));
        } else {
            numValueOf = null;
        }
        if (baseSharePackage == null || (bundle9 = baseSharePackage.extras) == null || (string5 = bundle9.getString("pre_load_crowd_name")) == null) {
            string5 = "";
        }
        if (baseSharePackage == null || (bundle8 = baseSharePackage.extras) == null || (string6 = bundle8.getString("share_crowds")) == null) {
            string6 = "";
        }
        if (baseSharePackage != null && (bundle7 = baseSharePackage.extras) != null) {
            j = bundle7.getLong("link_duration", 0L);
        } else {
            j = 0;
        }
        if (baseSharePackage != null && (bundle6 = baseSharePackage.extras) != null) {
            j2 = bundle6.getLong("download_duration", 0L);
        } else {
            j2 = 0;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", string2);
        linkedHashMap.put("panel_source", string3);
        linkedHashMap.put("item_type", strLJIILLIIL);
        linkedHashMap.put("item_id", LJI(baseSharePackage));
        linkedHashMap.put("unique_id", LJIILL);
        if (string.length() > 0) {
            linkedHashMap.put("cover_template_id", string);
        }
        linkedHashMap.put("platform", LJIILLIIL);
        Boolean bool = LJIJ;
        if (bool != null) {
            numValueOf2 = Integer.valueOf(bool.booleanValue() ? 1 : 0);
        } else {
            numValueOf2 = null;
        }
        linkedHashMap.put("enabled", numValueOf2);
        linkedHashMap.put("scenario_status", Integer.valueOf(LJIJI));
        linkedHashMap.put("is_new_panel", Integer.valueOf(z ? 1 : 0));
        linkedHashMap.put("detail_tab_name", LJJIIZI);
        linkedHashMap.put("is_expand", Integer.valueOf(LJJIIZ));
        linkedHashMap.put("duration", Long.valueOf(System.currentTimeMillis() - LJJIJIL));
        if (j > 0) {
            linkedHashMap.put("link_duration", Long.valueOf(j));
        }
        if (j2 > 0) {
            linkedHashMap.put("download_duration", Long.valueOf(j2));
        }
        linkedHashMap.put("is_preload", numValueOf);
        if (string5.length() > 0) {
            linkedHashMap.put("pre_load_crowd_name", string5);
        }
        if (string6.length() > 0) {
            linkedHashMap.put("share_crowds", string6);
        }
        if (baseSharePackage != null && (bundle5 = baseSharePackage.extras) != null && (numLJFF = LJFF(bundle5, "link_form")) != null) {
            linkedHashMap.put("link_form", Integer.valueOf(numLJFF.intValue()));
        }
        if (baseSharePackage != null && (bundle4 = baseSharePackage.extras) != null && (string11 = bundle4.getString("share_campaign_id")) != null) {
            str = string11;
        }
        if (str.length() > 0) {
            if (baseSharePackage != null && (bundle3 = baseSharePackage.extras) != null) {
                string9 = bundle3.getString("share_campaign_id");
            } else {
                string9 = null;
            }
            linkedHashMap.put("holiday_id", string9);
            if (baseSharePackage != null) {
                Bundle bundle15 = baseSharePackage.extras;
                if (bundle15 != null && (string10 = bundle15.getString("is_holiday_limit")) != null) {
                    linkedHashMap.put("is_holiday_limit", string10);
                }
                bundle2 = baseSharePackage.extras;
                if (bundle2 != null && (string8 = bundle2.getString("is_referral")) != null) {
                    linkedHashMap.put("is_referral", string8);
                }
            }
        } else if (baseSharePackage != null) {
            bundle2 = baseSharePackage.extras;
            if (bundle2 != null) {
                linkedHashMap.put("is_referral", string8);
            }
        }
        if (string4.length() > 0) {
            linkedHashMap.put("channel_enter_type", string4);
        }
        if (i != -1) {
            linkedHashMap.put("icon_position", Integer.valueOf(i));
        }
        if (baseSharePackage != null && (bundle = baseSharePackage.extras) != null && (string7 = bundle.getString("item_author_type")) != null) {
            linkedHashMap.put("item_author_type", string7);
        }
        LIZLLL(baseSharePackage, linkedHashMap);
        InterfaceC1367490lgp interfaceC1367490lgp = C1370370llT.LIZIZ;
        if (interfaceC1367490lgp != null) {
            interfaceC1367490lgp.LIZ("channel_clicked_end", linkedHashMap);
        }
    }

    public static void LJIIJ(BaseSharePackage baseSharePackage, InterfaceC1369790lkX interfaceC1369790lkX, int i, boolean z) {
        String strKey;
        boolean zLIZJ;
        int iLJIIJJI;
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        Integer numValueOf;
        String string6;
        String string7;
        Bundle bundle;
        String string8;
        Bundle bundle2;
        Bundle bundle3;
        String string9;
        Bundle bundle4;
        Bundle bundle5;
        Bundle bundle6;
        Bundle bundle7;
        Bundle bundle8;
        C1440005kM.LIZ(new C608750NuD(interfaceC1369790lkX, LJI(baseSharePackage)));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C1364460lbw c1364460lbw = C1361760lXa.LIZ.get("click_to_platform_click_duration");
        if (c1364460lbw != null) {
            c1364460lbw.LIZIZ = jElapsedRealtime;
        }
        LJJIJIL = System.currentTimeMillis();
        LJIILL = UUID.randomUUID().toString();
        String string10 = null;
        if (interfaceC1369790lkX != null) {
            strKey = interfaceC1369790lkX.key();
        } else {
            strKey = null;
        }
        String str = "";
        if (strKey == null) {
            strKey = "";
        }
        LJIILLIIL = strKey;
        if (interfaceC1369790lkX != null) {
            zLIZJ = interfaceC1369790lkX.LIZJ();
        } else {
            zLIZJ = true;
        }
        LJIJ = Boolean.valueOf(!zLIZJ);
        if (interfaceC1369790lkX != null) {
            iLJIIJJI = interfaceC1369790lkX.LJIIJJI();
        } else {
            iLJIIJJI = LJIJI;
        }
        LJIJI = iLJIIJJI;
        if (baseSharePackage == null || (bundle8 = baseSharePackage.extras) == null || (string = bundle8.getString("share_template_id")) == null) {
            string = "";
        }
        if (baseSharePackage == null || (bundle7 = baseSharePackage.extras) == null || (string2 = bundle7.getString("enter_from")) == null) {
            string2 = "";
        }
        if (baseSharePackage == null || (bundle6 = baseSharePackage.extras) == null || (string3 = bundle6.getString("enter_method")) == null) {
            string3 = "";
        }
        if (baseSharePackage == null || (bundle5 = baseSharePackage.extras) == null || (string4 = bundle5.getString("panel_source")) == null) {
            string4 = "";
        }
        String strLJIILLIIL = LJIILLIIL(baseSharePackage);
        if (baseSharePackage == null || (bundle4 = baseSharePackage.extras) == null || (string5 = bundle4.getString("channel_enter_type")) == null) {
            string5 = "";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", string2);
        linkedHashMap.put("enter_method", string3);
        linkedHashMap.put("panel_source", string4);
        linkedHashMap.put("item_type", strLJIILLIIL);
        linkedHashMap.put("item_id", LJI(baseSharePackage));
        linkedHashMap.put("unique_id", LJIILL);
        linkedHashMap.put("platform", LJIILLIIL);
        Boolean bool = LJIJ;
        if (bool != null) {
            numValueOf = Integer.valueOf(bool.booleanValue() ? 1 : 0);
        } else {
            numValueOf = null;
        }
        linkedHashMap.put("enabled", numValueOf);
        linkedHashMap.put("scenario_status", Integer.valueOf(LJIJI));
        linkedHashMap.put("is_new_panel", Integer.valueOf(z ? 1 : 0));
        linkedHashMap.put("OG_type", LJJII);
        if (string.length() > 0) {
            linkedHashMap.put("cover_template_id", string);
        }
        linkedHashMap.put("position", LJJIII);
        linkedHashMap.put("is_today", Integer.valueOf(LJJIFFI));
        linkedHashMap.put("is_self", LJJIIJ);
        linkedHashMap.put("privacy_setting", LJJIIJZLJL);
        linkedHashMap.put("is_expand", Integer.valueOf(LJJIIZ));
        linkedHashMap.put("detail_tab_name", LJJIIZI);
        if (baseSharePackage != null && (bundle3 = baseSharePackage.extras) != null && (string9 = bundle3.getString("share_campaign_id")) != null) {
            str = string9;
        }
        if (str.length() > 0) {
            if (baseSharePackage != null && (bundle2 = baseSharePackage.extras) != null) {
                string10 = bundle2.getString("share_campaign_id");
            }
            linkedHashMap.put("holiday_id", string10);
            if (baseSharePackage != null && (bundle = baseSharePackage.extras) != null && (string8 = bundle.getString("is_holiday_limit")) != null) {
                linkedHashMap.put("is_holiday_limit", string8);
            }
        }
        if (string5.length() > 0) {
            linkedHashMap.put("channel_enter_type", string5);
        }
        if (i != -1) {
            linkedHashMap.put("icon_position", Integer.valueOf(i));
        }
        if (baseSharePackage != null) {
            Bundle bundle9 = baseSharePackage.extras;
            if (bundle9 != null && (string7 = bundle9.getString("is_referral")) != null) {
                linkedHashMap.put("is_referral", string7);
            }
            Bundle bundle10 = baseSharePackage.extras;
            if (bundle10 != null && (string6 = bundle10.getString("item_author_type")) != null) {
                linkedHashMap.put("item_author_type", string6);
            }
        }
        LIZLLL(baseSharePackage, linkedHashMap);
        InterfaceC1367490lgp interfaceC1367490lgp = C1370370llT.LIZIZ;
        if (interfaceC1367490lgp != null) {
            interfaceC1367490lgp.LIZ("channel_clicked_start", linkedHashMap);
        }
    }

    public static void LJIIL(String str, String str2, String str3, String str4) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", str);
        linkedHashMap.put("enter_method", str2);
        linkedHashMap.put("group_id", str3);
        linkedHashMap.put("action_type", str4);
        InterfaceC1367490lgp interfaceC1367490lgp = C1370370llT.LIZIZ;
        if (interfaceC1367490lgp != null) {
            interfaceC1367490lgp.LIZ("long_press_redesign_toast", linkedHashMap);
        }
    }
}
