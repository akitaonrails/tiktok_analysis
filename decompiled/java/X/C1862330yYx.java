package X;

import android.util.ArrayMap;
import com.bytedance.scene.Scene;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.tako.ccl.net.TakoLanguageStyleSetting;
import com.ss.android.ugc.aweme.tako.experiment.TakoInfoModel;
import com.ss.android.ugc.aweme.tako.mob.ITakoMob;
import com.ss.android.ugc.aweme.tako.model.FeedEnterAwemeInfo;
import com.ss.android.ugc.aweme.tako.model.FeedIconBubbleInfo;
import com.ss.android.ugc.aweme.tako.model.SmartSearchItem;
import com.ss.android.ugc.aweme.tako.model.SuggestionWordInfo;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.router.model.TakoBehaviorCollectData;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0yYx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1862330yYx implements ITakoMob {
    public static String LIZJ;
    public static final Map<String, Set<String>> LJFF;
    public static final Map<String, Set<String>> LJI;
    public static long LJII;
    public static final Map<Long, Set<String>> LJIIIIZZ;
    public static final Map<String, Set<String>> LJIIIZ;
    public static final Map<String, Set<String>> LJIIJ;
    public static final Map<String, Set<String>> LJIIJJI;
    public static final C1862330yYx LIZ = new C1862330yYx();
    public static final Map<Integer, Set<String>> LIZIZ = new LinkedHashMap();
    public static final C20235014Fo LIZLLL = C597050NbL.LIZ();
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(537));

    static {
        new LinkedHashMap();
        LJFF = new LinkedHashMap();
        LJI = new LinkedHashMap();
        LJIIIIZZ = new LinkedHashMap();
        LJIIIZ = new LinkedHashMap();
        LJIIJ = new LinkedHashMap();
        LJIIJJI = new LinkedHashMap();
    }

    public static void LJIILJJIL(Map map) throws JSONException {
        C20235014Fo c20235014Fo = LIZLLL;
        JSONObject jSONObject = new JSONObject();
        LIZ.getClass();
        LLII(jSONObject, map);
        c20235014Fo.LIZIZ("tikbot_image_delete", jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.tako.mob.ITakoMob
    public final void mobMediaCardClick(Map<String, String> map) {
        Long lLJIILIIL;
        Integer numLJIIJJI;
        Integer numLJIIJJI2;
        String str = map.get("enter_from");
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = map.get("enter_method");
        if (str3 == null) {
            str3 = "";
        }
        String str4 = map.get("message_id");
        if (str4 == null) {
            str4 = "";
        }
        String str5 = map.get("process_id");
        if (str5 == null) {
            str5 = "";
        }
        String str6 = map.get("tako_session_id");
        if (str6 == null) {
            str6 = "";
        }
        String str7 = map.get("tako_chat_id");
        if (str7 == null) {
            str7 = "";
        }
        String str8 = map.get("bot_id");
        String str9 = map.get("action_item_id");
        Integer numLJIIJJI3 = null;
        if (str9 != null) {
            lLJIILIIL = C2095008Iq.LJIILIIL(str9);
        } else {
            lLJIILIIL = null;
        }
        String str10 = map.get("sub_process_id");
        String str11 = map.get("search_id");
        String str12 = map.get("card_type");
        if (str12 == null) {
            str12 = "";
        }
        String str13 = map.get("card_content_id");
        if (str13 == null) {
            str13 = "";
        }
        String str14 = map.get("card_extra_content");
        String str15 = map.get("is_nimble");
        String str16 = map.get("is_mixed_layout");
        if (str16 != null) {
            str2 = str16;
        }
        String str17 = map.get("picture_source");
        String str18 = map.get("situation");
        String str19 = map.get("card_rank");
        String str20 = map.get("response_type");
        String str21 = map.get("response_rank");
        if (str21 != null) {
            numLJIIJJI = C2095008Iq.LJIIJJI(str21);
        } else {
            numLJIIJJI = null;
        }
        String str22 = map.get("page");
        String str23 = map.get("aweme_type");
        if (str23 != null) {
            numLJIIJJI2 = C2095008Iq.LJIIJJI(str23);
        } else {
            numLJIIJJI2 = null;
        }
        String str24 = map.get("item_unique_id");
        String str25 = map.get("mix_position");
        if (str25 != null) {
            numLJIIJJI3 = C2095008Iq.LJIIJJI(str25);
        }
        LJJJJIZL(this, str, str3, str4, str5, str6, str7, str8, lLJIILIIL, str10, str11, str12, str13, str15, str2, str14, str17, str18, str19, str20, numLJIIJJI, null, null, null, str22, numLJIIJJI2, str24, numLJIIJJI3, map.get("tikbot_trace_id"), C2097608Jq.LJ(), 14745600);
    }

    @Override // com.ss.android.ugc.aweme.tako.mob.ITakoMob
    public final void mobMediaCardShow(Map<String, String> map) {
        Long lLJIILIIL;
        Integer numLJIIJJI;
        Integer numLJIIJJI2;
        String str = map.get("enter_from");
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = map.get("enter_method");
        if (str3 == null) {
            str3 = "";
        }
        String str4 = map.get("message_id");
        if (str4 == null) {
            str4 = "";
        }
        String str5 = map.get("process_id");
        if (str5 == null) {
            str5 = "";
        }
        String str6 = map.get("bot_id");
        String str7 = map.get("action_item_id");
        Integer numLJIIJJI3 = null;
        if (str7 != null) {
            lLJIILIIL = C2095008Iq.LJIILIIL(str7);
        } else {
            lLJIILIIL = null;
        }
        String str8 = map.get("sub_process_id");
        String str9 = map.get("search_id");
        String str10 = map.get("card_type");
        if (str10 == null) {
            str10 = "";
        }
        String str11 = map.get("card_content_id");
        if (str11 == null) {
            str11 = "";
        }
        String str12 = map.get("card_extra_content");
        String str13 = map.get("is_nimble");
        String str14 = map.get("is_mixed_layout");
        if (str14 == null) {
            str14 = "";
        }
        String str15 = map.get("picture_source");
        String str16 = map.get("situation");
        String str17 = map.get("card_rank");
        String str18 = map.get("response_type");
        String str19 = map.get("response_rank");
        if (str19 != null) {
            numLJIIJJI = C2095008Iq.LJIIJJI(str19);
        } else {
            numLJIIJJI = null;
        }
        String str20 = map.get("page");
        String str21 = map.get("aweme_type");
        if (str21 != null) {
            numLJIIJJI2 = C2095008Iq.LJIIJJI(str21);
        } else {
            numLJIIJJI2 = null;
        }
        String str22 = map.get("item_unique_id");
        String str23 = map.get("mix_position");
        if (str23 != null) {
            numLJIIJJI3 = C2095008Iq.LJIIJJI(str23);
        }
        String str24 = map.get("tikbot_trace_id");
        Map mapLJ = C2097608Jq.LJ();
        String str25 = map.get("tako_session_id");
        if (str25 != null) {
            str2 = str25;
        }
        LJJJJJ(this, str, str3, str4, str5, str2, map.get("tako_chat_id"), str6, lLJIILIIL, str8, str9, str10, str11, str13, str14, str12, str15, str16, str17, str18, numLJIIJJI, null, null, null, str20, numLJIIJJI2, str22, numLJIIJJI3, str24, mapLJ, false, 14745600);
    }

    public static void LIZIZ(C1862330yYx c1862330yYx, String str) {
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        c20235014FoLIZ.LIZ("tikbot_perf_db_storage", C2097908Jt.LIZJ(new Pair("error_reason", str)));
    }

    public static void LJFF(String str, Map map) {
        try {
            C20235014Fo c20235014Fo = LIZLLL;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("query", str);
            LLII(jSONObject, map);
            c20235014Fo.LIZIZ("tikbot_auto_send_message_check", jSONObject);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static void LJIILIIL(Map map, Map map2) throws JSONException {
        C20235014Fo c20235014Fo = LIZLLL;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("time_stamp", System.currentTimeMillis());
        LIZ.getClass();
        LLII(jSONObject, map2);
        LLII(jSONObject, map);
        c20235014Fo.LIZIZ("tikbot_first_round_sug_actual_exposure", jSONObject);
    }

    public static void LJIILL(int i, Map map) {
        Object objLIZIZ;
        if (map != null && (objLIZIZ = C1856050yOp.LIZIZ("process_id", map)) != null) {
            LIZ.getClass();
            C01GW c01gw = LJ;
            if (!((Set) c01gw.getValue()).contains(objLIZIZ)) {
                ((Set) c01gw.getValue()).add(objLIZIZ);
                C20235014Fo c20235014Fo = LIZLLL;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("time_stamp", System.currentTimeMillis());
                jSONObject.put("interrupt_type", i);
                jSONObject.put("tako_session_id", map.get("tako_session_id"));
                jSONObject.put("tako_chat_id", map.get("tako_chat_id"));
                LLII(jSONObject, map);
                c20235014Fo.LIZIZ("tikbot_interrupt_first_round_sug", jSONObject);
            }
        }
    }

    public static void LJIJ(Long l, Map map) throws JSONException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C20235014Fo c20235014Fo = LIZLLL;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("time_stamp", jCurrentTimeMillis);
        if (l != null) {
            jSONObject.put("first_sug_cost", jCurrentTimeMillis - l.longValue());
        }
        LIZ.getClass();
        LLII(jSONObject, map);
        c20235014Fo.LIZIZ("tikbot_receive_first_round_sug", jSONObject);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJJIJ(C1862330yYx c1862330yYx, Map map) {
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("process_id", map.get("process_id")), new Pair("enter_from", map.get("enter_from")), new Pair("enter_method", map.get("enter_method")), new Pair("tako_session_id", map.get("tako_session_id")), new Pair("tako_chat_id", map.get("tako_chat_id")));
        Object obj = map.get("search_id");
        if (C123100dR.LIZ((String) obj) && obj != null) {
            mapLJIIJ.put("search_id", obj);
        }
        c20235014FoLIZ.LIZ("tikbot_click_about_button", mapLJIIJ);
    }

    public static void LJJIJIIJIL(C1862330yYx c1862330yYx, Map map) {
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        if (c20235014FoLIZ != null) {
            c20235014FoLIZ.LIZ("tikbot_click_feedback", map);
        }
    }

    public static void LJJIJIL(String str, Map map) {
        try {
            C20235014Fo c20235014Fo = LIZLLL;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("button_type", str);
            LLII(jSONObject, map);
            c20235014Fo.LIZIZ("tikbot_click_image_upload_button", jSONObject);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static void LJJIJL(C1862330yYx c1862330yYx, Map map) {
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        if (c20235014FoLIZ != null) {
            c20235014FoLIZ.LIZ("tikbot_click_settings", map);
        }
    }

    public static void LJJJJI(C1862330yYx c1862330yYx, Map map) {
        boolean z;
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        Object obj = map.get("enter_from");
        Object obj2 = map.get("enter_method");
        Object obj3 = map.get("process_id");
        String str = (String) map.get("tako_session_id");
        if (str == null) {
            str = "";
        }
        String str2 = (String) map.get("tako_chat_id");
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("enter_from", obj), new Pair("enter_method", obj2), new Pair("process_id", obj3));
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mapLJIIJ.put("tako_session_id", str);
        }
        if (str2 != null && str2.length() > 0) {
            mapLJIIJ.put("tako_chat_id", str2);
        }
        c20235014FoLIZ.LIZ("loading_toast_show", mapLJIIJ);
    }

    public static void LJJJLZIJ(C1862330yYx c1862330yYx, Map map) {
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        c20235014FoLIZ.LIZ("tikbot_create_image_button_click", C2097608Jq.LJIIJ(new Pair("enter_from", map.get("enter_from")), new Pair("enter_method", map.get("enter_method")), new Pair("process_id", map.get("process_id")), new Pair("tako_session_id", map.get("tako_session_id")), new Pair("tako_chat_id", map.get("tako_chat_id")), new Pair("screen_type", map.get("screen_type"))));
    }

    public static void LJJL(C1862330yYx c1862330yYx, Map map) {
        boolean z;
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        Object obj = map.get("enter_from");
        Object obj2 = map.get("enter_method");
        Object obj3 = map.get("process_id");
        String str = (String) map.get("tako_session_id");
        if (str == null) {
            str = "";
        }
        String str2 = (String) map.get("tako_chat_id");
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("enter_from", obj), new Pair("enter_method", obj2), new Pair("process_id", obj3));
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mapLJIIJ.put("tako_session_id", str);
        }
        if (str2 != null && str2.length() > 0) {
            mapLJIIJ.put("tako_chat_id", str2);
        }
        c20235014FoLIZ.LIZ("tikbot_disclaimer_show", mapLJIIJ);
    }

    public static void LJLJJI(C1862330yYx c1862330yYx, Map map) {
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        c20235014FoLIZ.LIZ("tikbot_plus_button_show", C2097608Jq.LJIIJ(new Pair("enter_from", map.get("enter_from")), new Pair("enter_method", map.get("enter_method")), new Pair("process_id", map.get("process_id")), new Pair("tako_session_id", map.get("tako_session_id")), new Pair("tako_chat_id", map.get("tako_chat_id")), new Pair("screen_type", map.get("screen_type"))));
    }

    public static void LJLJL(C1862330yYx c1862330yYx, Map map) {
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        c20235014FoLIZ.LIZ("tikbot_publish_button_click", map);
    }

    public static void LJLJLJ(C1862330yYx c1862330yYx, Map map) {
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        c20235014FoLIZ.LIZ("tikbot_publish_button_show", map);
    }

    public static final void LLIFFJFJJ(Map<String, String> map, Map<String, String> map2) {
        if (map2 != null) {
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (key.length() > 0 && value.length() > 0) {
                    map.put(key, value);
                }
            }
        }
    }

    public static void LLII(JSONObject jSONObject, Map map) throws JSONException {
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (C123100dR.LIZ((String) entry.getValue())) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.mob.ITakoMob
    public final void mobTikbotEntranceTouchDown(String str, String str2) throws JSONException {
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("enter_from", str);
        jSONObject.put("entrance_type", str2);
        jSONObject.put("touch_result", "down");
        c20235014FoLIZ.LIZIZ("tikbot_entrance_touch", jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.tako.mob.ITakoMob
    public final void mobTikbotQuickInteractionShow(Map<String, String> map, Map<String, String> map2) throws JSONException {
        C20235014Fo c20235014Fo = LIZLLL;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("time_stamp", System.currentTimeMillis());
        LIZ.getClass();
        LLII(jSONObject, map2);
        LLII(jSONObject, map);
        c20235014Fo.LIZIZ("tikbot_quick_interaction_show", jSONObject);
    }

    public static String LIZ(String str, String str2, String str3) {
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0 && str3 != null && str3.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(',');
            sbLIZ.append(str2);
            sbLIZ.append(',');
            sbLIZ.append(str3);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return null;
    }

    public static void LIZJ(String str, String str2, String str3) throws JSONException {
        C20235014Fo c20235014Fo = LIZLLL;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("enter_from", str);
        jSONObject.put("group_id", str2);
        jSONObject.put("button_type", str3);
        c20235014Fo.LIZIZ("tikbot_screenshot_popup_click", jSONObject);
    }

    public static void LIZLLL(String str, Map map, boolean z) {
        String str2;
        String str3;
        try {
            C20235014Fo c20235014Fo = LIZLLL;
            JSONObject jSONObject = new JSONObject();
            if (z) {
                str2 = "on";
            } else {
                str2 = "off";
            }
            jSONObject.put("button_type", str2);
            String str4 = null;
            if (map == null) {
                str3 = null;
            } else {
                str3 = (String) map.get("tako_session_id");
            }
            jSONObject.put("tako_session_id", str3);
            if (map != null) {
                str4 = (String) map.get("tako_chat_id");
            }
            jSONObject.put("tako_chat_id", str4);
            LLII(jSONObject, map);
            c20235014Fo.LIZIZ(str, jSONObject);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static void LJIIIZ(String str, String str2, boolean z) throws JSONException {
        C20235014Fo c20235014Fo = LIZLLL;
        JSONObject jSONObject = new JSONObject();
        if (str == null) {
            str = "";
        }
        jSONObject.put("enter_from", str);
        if (str2 == null) {
            str2 = "";
        }
        jSONObject.put("enter_method", str2);
        if (((Boolean) C0AZ9.LIZ.getValue()).booleanValue()) {
            C14FR.LIZ.getClass();
            C14TO.LIZ.getClass();
            int i = 1;
            if (!((Boolean) C14TO.LJFF.getValue()).booleanValue()) {
                String strLJJLIIIJLLLLLLLZ = C14TF.LIZIZ.LJJLIIIJLLLLLLLZ();
                if (strLJJLIIIJLLLLLLLZ != null && strLJJLIIIJLLLLLLLZ.length() != 0) {
                    if (!C07G5.LIZ()) {
                        i = 5;
                    } else if (!C07J7.LIZ()) {
                        i = 6;
                    } else if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                        i = 7;
                    } else if (((AccountUserService) C0XQ7.LJFF()).LIZ()) {
                        i = 8;
                    } else {
                        TakoInfoModel takoInfoModel = C1852920yJm.LIZ;
                        String str3 = takoInfoModel.botId;
                        if (str3 != null && str3.length() != 0) {
                            String str4 = takoInfoModel.botName;
                            if (str4 != null && str4.length() != 0) {
                                if (!C1843207Ju.LIZ()) {
                                    i = 9;
                                } else {
                                    IFamilyPairingService iFamilyPairingServiceLJIIL = ComplianceServiceProvider.LJIIL();
                                    if (iFamilyPairingServiceLJIIL != null && iFamilyPairingServiceLJIIL.LJIIIZ()) {
                                        i = 10;
                                    } else {
                                        i = 0;
                                    }
                                }
                            } else if (z) {
                                i = 14;
                            } else {
                                i = 12;
                            }
                        } else if (z) {
                            i = 13;
                        } else {
                            i = 11;
                        }
                    }
                } else {
                    i = 4;
                }
            }
            jSONObject.put("error_code", i);
        }
        c20235014Fo.LIZIZ("tikbot_enter_chat_failure", jSONObject);
    }

    public static void LJJIL(C1862330yYx c1862330yYx, Map map, boolean z) {
        int i;
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        try {
            JSONObject jSONObject = new JSONObject();
            LIZ.getClass();
            LLII(jSONObject, map);
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("is_success", i);
            c20235014FoLIZ.LIZIZ("tikbot_download_picture", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LJJJI(C1862330yYx c1862330yYx, Map map, boolean z) {
        int i;
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("process_id", map.get("process_id"));
            jSONObject.put("tako_session_id", map.get("tako_session_id"));
            jSONObject.put("tako_chat_id", map.get("tako_chat_id"));
            jSONObject.put("enter_from", map.get("enter_from"));
            jSONObject.put("enter_method", map.get("enter_method"));
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("is_auto", i);
            String str = (String) map.get("inspiration_session_id");
            if (str != null) {
                C1862330yYx c1862330yYx2 = LIZ;
                Map mapLIZ = C1862870yZp.LIZ(str);
                c1862330yYx2.getClass();
                LLII(jSONObject, mapLIZ);
            }
            c20235014FoLIZ.LIZIZ("tikbot_click_inputbox", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LJJJJ(C1862330yYx c1862330yYx, long j, Map map) {
        Map mapLJ;
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        if (j > 0 && j == LJII) {
            return;
        }
        LJII = j;
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("process_id", map.get("process_id")), new Pair("enter_from", map.get("enter_from")), new Pair("enter_method", map.get("enter_method")));
        String str = (String) map.get("tako_session_id");
        if (str != null && str.length() > 0) {
            mapLJIIJ.put("tako_session_id", str);
        }
        String str2 = (String) map.get("tako_chat_id");
        if (str2 != null && str2.length() > 0) {
            mapLJIIJ.put("tako_chat_id", str2);
        }
        String str3 = (String) map.get("inspiration_session_id");
        if (str3 != null) {
            mapLJ = C1862870yZp.LIZ(str3);
        } else {
            mapLJ = C2097608Jq.LJ();
        }
        c20235014FoLIZ.LIZ("tikbot_input_started", C2097608Jq.LJIIL(mapLJIIJ, mapLJ));
    }

    public static void LJJJZ(C1862330yYx c1862330yYx, Map map, String str) throws JSONException {
        boolean z;
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        Object obj = map.get("enter_from");
        Object obj2 = map.get("enter_method");
        Object obj3 = map.get("process_id");
        String str2 = (String) map.get("tako_session_id");
        if (str2 == null) {
            str2 = "";
        }
        String str3 = (String) map.get("tako_chat_id");
        C2097608Jq.LJIIIIZZ(new Pair("enter_from", obj), new Pair("enter_method", obj2), new Pair("process_id", obj3), new Pair("action", str));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("enter_from", obj);
        jSONObject.put("enter_method", obj2);
        jSONObject.put("process_id", obj3);
        jSONObject.put("action", str);
        jSONObject.put("is_fullscreen", 1);
        if (str2.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            jSONObject.put("tako_session_id", str2);
        }
        if (str3 != null && str3.length() > 0) {
            jSONObject.put("tako_chat_id", str3);
        }
        c20235014FoLIZ.LIZIZ("tikbot_disclaimer_response", jSONObject);
    }

    public static void LJJLIIIJLJLI(String str, String str2, Map map) {
        Long lLJIILIIL;
        Object obj = map.get("process_id");
        String str3 = (String) map.get("sub_process_id");
        String str4 = (String) map.get("action_item_id");
        Object obj2 = map.get("enter_from");
        Object obj3 = map.get("enter_method");
        Object obj4 = map.get("screen_type");
        String str5 = (String) map.get("tako_session_id");
        if (str5 == null) {
            str5 = "";
        }
        String str6 = (String) map.get("tako_chat_id");
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("enter_from", obj2), new Pair("enter_method", obj3), new Pair("process_id", obj), new Pair("button_type", str), new Pair("screen_type", obj4));
        if (str4 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str4)) != null && lLJIILIIL.longValue() > 0) {
            lLJIILIIL.longValue();
            mapLJIIJ.put("action_item_id", str4);
        }
        if (str3 != null && C123100dR.LIZ(str3)) {
            mapLJIIJ.put("sub_process_id", str3);
        }
        if (str2 != null && C123100dR.LIZ(str2)) {
            mapLJIIJ.put("action_type", str2);
        }
        if (str5.length() > 0) {
            mapLJIIJ.put("tako_session_id", str5);
        }
        if (str6 != null && str6.length() > 0) {
            mapLJIIJ.put("tako_chat_id", str6);
        }
        c20235014FoLIZ.LIZ("tikbot_input_button_click", mapLJIIJ);
    }

    public static void LJLLI(Map map, Map map2, Map map3) throws JSONException {
        LinkedHashMap linkedHashMap;
        long jLongValue;
        Integer numLJIIJJI;
        Long lLJIILIIL;
        Object obj = map.get("process_id");
        if (obj != null) {
            ConcurrentHashMap<String, AtomicInteger> concurrentHashMap = C1701530uNb.LIZLLL;
            AtomicInteger atomicInteger = concurrentHashMap.get(obj);
            if (atomicInteger == null) {
                atomicInteger = new AtomicInteger(0);
                AtomicInteger atomicIntegerPutIfAbsent = concurrentHashMap.putIfAbsent((String) obj, atomicInteger);
                if (atomicIntegerPutIfAbsent != null) {
                    atomicInteger = atomicIntegerPutIfAbsent;
                }
            }
            atomicInteger.incrementAndGet();
        }
        Object obj2 = map.get("process_id");
        if (obj2 != null) {
            C1861390yXR.LJFF.put((String) obj2, Boolean.TRUE);
        }
        String str = (String) map.get("screen_type");
        String str2 = (String) map2.get("ratio");
        if (map3 == null && ((str == null || str.length() == 0) && (str2 == null || str2.length() == 0))) {
            linkedHashMap = null;
        } else {
            linkedHashMap = new LinkedHashMap();
            if (map3 != null) {
                linkedHashMap.putAll(map3);
            }
            if (str != null && str.length() > 0) {
                linkedHashMap.put("screen_type", str);
            }
            if (str2 != null && str2.length() > 0) {
                linkedHashMap.put("ratio", str2);
            }
        }
        Object obj3 = map.get("enter_from");
        Object obj4 = map.get("enter_method");
        String str3 = (String) map.get("process_id");
        String str4 = (String) map.get("tako_session_id");
        if (str4 == null && (str4 = (String) map2.get("tako_session_id")) == null) {
            str4 = "";
        }
        String str5 = (String) map.get("tako_chat_id");
        if (str5 == null && (str5 = (String) map2.get("tako_chat_id")) == null) {
            str5 = "";
        }
        Object obj5 = map.get("search_id");
        String str6 = (String) map.get("sub_process_id");
        String str7 = (String) map.get("sub_enter_method");
        String str8 = (String) map.get("action_item_id");
        Object obj6 = map.get("bot_id");
        Object obj7 = map2.get("message_id");
        Object obj8 = map2.get("message_content");
        Object obj9 = map2.get("is_resend");
        Object obj10 = map2.get("is_edit");
        Object obj11 = map2.get("original_message_id");
        Object obj12 = map2.get("is_previous_message_complete");
        if (obj12 == null) {
            obj12 = "-1";
        }
        Object obj13 = map2.get("interaction_type");
        String str9 = (String) map2.get("voice_input_type");
        Object obj14 = map2.get("share_message_type");
        String str10 = (String) map2.get("asr_request_id");
        String str11 = (String) map2.get("input_duration");
        String str12 = (String) map2.get("message_type");
        String str13 = (String) map2.get("image_info");
        String str14 = (String) map2.get("image_count");
        int iLIZ = C1701530uNb.LIZ((String) map.get("process_id"));
        String str15 = (String) map.get("process_id");
        String str16 = (String) map.get("tako_session_id");
        if (str16 == null) {
            str16 = (String) map2.get("tako_session_id");
        }
        long jLIZIZ = C1701530uNb.LIZIZ(C1701530uNb.LIZLLL(str15, str16), true);
        String str17 = (String) map.get("process_id");
        String str18 = (String) map.get("tako_session_id");
        if (str18 == null) {
            str18 = (String) map2.get("tako_session_id");
        }
        String strLIZLLL = C1701530uNb.LIZLLL(str17, str18);
        if (strLIZLLL != null) {
            synchronized (C1701530uNb.LJ) {
                try {
                    ConcurrentHashMap<String, Long> concurrentHashMap2 = C1701530uNb.LIZJ;
                    Long l = concurrentHashMap2.get(strLIZLLL);
                    if (l == null) {
                        l = C1701530uNb.LIZ.get(strLIZLLL);
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (l != null) {
                        jLongValue = jCurrentTimeMillis - l.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    concurrentHashMap2.put(strLIZLLL, Long.valueOf(jCurrentTimeMillis));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        } else {
            jLongValue = -1;
        }
        String str19 = (String) map.get("icon_state");
        String str20 = (String) map.get("mode");
        if (str20 == null || str20.length() == 0) {
            str20 = "default";
        }
        String str21 = (String) map2.get("word_id");
        String str22 = (String) map2.get("impr_id");
        String str23 = (String) map2.get("bubble_impr_id");
        Object obj15 = map2.get("recall_info");
        Object obj16 = map2.get("search_intent");
        Object obj17 = map2.get("tako_intent");
        String str24 = (String) map2.get("panel_impr_id");
        String str25 = (String) map2.get("is_photo");
        String str26 = (String) map2.get("universal_rank");
        String str27 = (String) map2.get("is_regenerate");
        String str28 = (String) map2.get("regenerate_type");
        String str29 = (String) map2.get("regenerate_round");
        String str30 = (String) map.get("sub_mode");
        if (str30 == null || str30.length() == 0) {
            str30 = "default";
        }
        String str31 = (String) map2.get("mode_source");
        String str32 = (String) map2.get("template_id");
        String str33 = (String) map2.get("tab_id");
        String str34 = (String) map2.get("template_tab");
        String str35 = (String) map2.get("style_name");
        String str36 = (String) map2.get("is_memory");
        String str37 = (String) map2.get("list_result_type");
        String str38 = (String) map2.get("paste_type");
        if (str38 != null) {
            numLJIIJJI = C2095008Iq.LJIIJJI(str38);
        } else {
            numLJIIJJI = null;
        }
        String str39 = (String) map2.get("paste_content");
        String str40 = (String) map2.get("generate_type");
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        String str41 = (String) map2.get("skill_mode");
        if (str41 == null) {
            str41 = "default";
        }
        String str42 = (String) map2.get("ratio");
        if (str42 == null) {
            str42 = CardStruct.IStatusCode.DEFAULT;
        }
        Object obj18 = map.get("abase_id");
        if (obj18 == null) {
            obj18 = map2.get("abase_id");
        }
        String str43 = (String) map2.get("session_source");
        String str44 = (String) map2.get("word_page_source");
        String str45 = (String) map2.get("guide_type");
        String str46 = (String) map2.get("followup_info");
        String str47 = (String) map2.get("skill_info");
        String str48 = (String) map2.get("template_info");
        Pair[] pairArr = new Pair[16];
        pairArr[0] = new Pair("enter_from", obj3);
        pairArr[1] = new Pair("enter_method", obj4);
        pairArr[2] = new Pair("process_id", str3);
        pairArr[3] = new Pair("message_id", obj7);
        pairArr[4] = new Pair("message_content", obj8);
        pairArr[5] = new Pair("is_resend", obj9);
        pairArr[6] = new Pair("is_edit", obj10);
        pairArr[7] = new Pair("bot_id", obj6);
        pairArr[8] = new Pair("original_message_id", obj11);
        pairArr[9] = new Pair("is_previous_message_complete", obj12);
        pairArr[10] = new Pair("interaction_type", obj13);
        pairArr[11] = new Pair("search_id", obj5);
        C1860520yW2.LIZ.getClass();
        pairArr[12] = new Pair("pre_process_id", C1860520yW2.LJIILIIL());
        pairArr[13] = new Pair("share_message_type", obj14);
        if (str20.length() == 0) {
            str20 = "default";
        }
        pairArr[14] = new Pair("mode", str20);
        if (str27 == null || str27.length() == 0) {
            str27 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[15] = new Pair("is_regenerate", str27);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (str28 != null && str28.length() > 0) {
            mapLJIIJ.put("regenerate_type", str28);
        }
        if (str29 != null && str29.length() > 0) {
            mapLJIIJ.put("regenerate_round", str29);
        }
        if (str8 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str8)) != null && lLJIILIIL.longValue() > 0) {
            lLJIILIIL.longValue();
            mapLJIIJ.put("action_item_id", str8);
        }
        if (str6 != null && C123100dR.LIZ(str6)) {
            mapLJIIJ.put("sub_process_id", str6);
        }
        if (str7 != null && C123100dR.LIZ(str7)) {
            mapLJIIJ.put("sub_enter_method", str7);
        }
        if (str9 != null && (!a0.LJJJIL(str9))) {
            mapLJIIJ.put("voice_input_type", str9);
        }
        if (str10 != null && (!a0.LJJJIL(str10))) {
            mapLJIIJ.put("asr_request_id", str10);
        }
        if (str11 != null && (!a0.LJJJIL(str11))) {
            mapLJIIJ.put("input_duration", str11);
        }
        C20235214Fq.LIZ.getClass();
        String strLIZJ = C20235214Fq.LIZJ(str3);
        if (strLIZJ != null && (!a0.LJJJIL(strLIZJ))) {
            mapLJIIJ.put("group_id", strLIZJ);
        }
        String strLIZLLL2 = C20235214Fq.LIZLLL(str3);
        if (strLIZLLL2 != null && (!a0.LJJJIL(strLIZLLL2))) {
            mapLJIIJ.put("last_feed_group_id", strLIZLLL2);
        }
        if (str12 != null && (!a0.LJJJIL(str12))) {
            mapLJIIJ.put("message_type", str12);
        }
        if (str13 != null && (!a0.LJJJIL(str13))) {
            mapLJIIJ.put("image_info", str13);
        }
        if (str14 != null && (!a0.LJJJIL(str14))) {
            mapLJIIJ.put("image_count", str14);
        }
        if (str19 != null && (!a0.LJJJIL(str19))) {
            mapLJIIJ.put("icon_state", str19);
        }
        if (str21 != null && (!a0.LJJJIL(str21))) {
            mapLJIIJ.put("word_id", str21);
        }
        if (str22 != null && (!a0.LJJJIL(str22))) {
            mapLJIIJ.put("impr_id", str22);
        }
        if (str23 != null && str23.length() > 0) {
            mapLJIIJ.put("bubble_impr_id", str23);
        }
        if (obj15 != null) {
            mapLJIIJ.put("recall_info", obj15);
        }
        if (obj16 != null) {
            mapLJIIJ.put("search_intent", obj16);
        }
        if (obj17 != null) {
            mapLJIIJ.put("tako_intent", obj17);
        }
        if (str24 != null && str24.length() > 0) {
            mapLJIIJ.put("panel_impr_id", str24);
        }
        if (str25 != null && str25.length() > 0) {
            mapLJIIJ.put("is_photo", str25);
        }
        if (str26 != null && str26.length() > 0) {
            mapLJIIJ.put("universal_rank", str26);
        }
        if (str30.length() > 0) {
            mapLJIIJ.put("sub_mode", str30);
        }
        if (str31 != null && str31.length() > 0) {
            mapLJIIJ.put("mode_source", str31);
        }
        if (str32 != null && str32.length() > 0) {
            mapLJIIJ.put("template_id", str32);
        }
        if (str33 != null && str33.length() > 0) {
            mapLJIIJ.put("tab_id", str33);
        }
        if (str34 != null && str34.length() > 0) {
            mapLJIIJ.put("template_tab", str34);
        }
        if (str40 != null && str40.length() > 0) {
            mapLJIIJ.put("generate_type", str40);
        }
        if (str35 != null && str35.length() > 0) {
            mapLJIIJ.put("style_name", str35);
        }
        if (str41.length() > 0) {
            mapLJIIJ.put("skill_mode", str41);
        }
        if (str42.length() > 0) {
            mapLJIIJ.put("ratio", str42);
        }
        if (str36 != null && str36.length() > 0) {
            mapLJIIJ.put("is_memory", str36);
        }
        if (str37 != null && str37.length() > 0) {
            mapLJIIJ.put("list_result_type", str37);
        }
        C201992141u.LIZ.getClass();
        TakoLanguageStyleSetting takoLanguageStyleSetting = C201992141u.LJFF;
        if (takoLanguageStyleSetting != null) {
            mapLJIIJ.put("language_style", String.valueOf(takoLanguageStyleSetting.selectedLanguageStyle));
        }
        if (obj18 != null) {
            mapLJIIJ.put("abase_id", obj18);
        }
        if (str4.length() > 0) {
            mapLJIIJ.put("tako_session_id", str4);
        }
        if (str5.length() > 0) {
            mapLJIIJ.put("tako_chat_id", str5);
        }
        if (str43 != null && str43.length() > 0) {
            mapLJIIJ.put("session_source", str43);
        }
        if (str44 != null && str44.length() > 0) {
            mapLJIIJ.put("word_page_source", str44);
        }
        if (str45 != null && str45.length() > 0) {
            mapLJIIJ.put("guide_type", str45);
        }
        if (str46 != null && str46.length() > 0) {
            mapLJIIJ.put("followup_info", str46);
        }
        LLIFFJFJJ(mapLJIIJ, linkedHashMap);
        JSONObject jSONObject = new JSONObject(mapLJIIJ);
        jSONObject.put("message_rank", iLIZ);
        jSONObject.put("stay_duration", jLIZIZ);
        jSONObject.put("message_sent_interval", jLongValue);
        if (numLJIIJJI != null) {
            jSONObject.put("paste_type", numLJIIJJI.intValue());
        }
        if (str39 != null && str39.length() > 0) {
            jSONObject.put("paste_content", str39);
        }
        LJJIII(LIZ, jSONObject, str48, str32, str40, str47);
        c20235014FoLIZ.LIZIZ("tikbot_send_message", jSONObject);
    }

    public static void LLFFF(String str, String str2, Map map) {
        Long lLJIILIIL;
        Object obj = map.get("process_id");
        String str3 = (String) map.get("sub_process_id");
        String str4 = (String) map.get("action_item_id");
        Object obj2 = map.get("enter_from");
        Object obj3 = map.get("enter_method");
        Object obj4 = map.get("screen_type");
        String str5 = (String) map.get("tako_session_id");
        if (str5 == null) {
            str5 = "";
        }
        String str6 = (String) map.get("tako_chat_id");
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("enter_from", obj2), new Pair("enter_method", obj3), new Pair("process_id", obj), new Pair("cancel_method", str), new Pair("screen_type", obj4));
        if (str4 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str4)) != null && lLJIILIIL.longValue() > 0) {
            lLJIILIIL.longValue();
            mapLJIIJ.put("action_item_id", str4);
        }
        if (str3 != null && C123100dR.LIZ(str3)) {
            mapLJIIJ.put("sub_process_id", str3);
        }
        if (C123100dR.LIZ(str2) && str2 != null) {
            mapLJIIJ.put("action_type", str2);
        }
        if (str5.length() > 0) {
            mapLJIIJ.put("tako_session_id", str5);
        }
        if (str6 != null && str6.length() > 0) {
            mapLJIIJ.put("tako_chat_id", str6);
        }
        c20235014FoLIZ.LIZ("tikbot_voice_input_cancel", mapLJIIJ);
    }

    public static void LLFII(C1862330yYx c1862330yYx, Map map, String str) {
        Long lLJIILIIL;
        c1862330yYx.getClass();
        Object obj = map.get("process_id");
        String str2 = (String) map.get("sub_process_id");
        String str3 = (String) map.get("action_item_id");
        Object obj2 = map.get("enter_from");
        Object obj3 = map.get("enter_method");
        String str4 = (String) map.get("tako_session_id");
        if (str4 == null) {
            str4 = "";
        }
        String str5 = (String) map.get("tako_chat_id");
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("enter_from", obj2), new Pair("enter_method", obj3), new Pair("process_id", obj), new Pair("reason", str));
        if (str3 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str3)) != null && lLJIILIIL.longValue() > 0) {
            lLJIILIIL.longValue();
            mapLJIIJ.put("action_item_id", str3);
        }
        if (str2 != null && C123100dR.LIZ(str2)) {
            mapLJIIJ.put("sub_process_id", str2);
        }
        if (str4.length() > 0) {
            mapLJIIJ.put("tako_session_id", str4);
        }
        if (str5 != null && str5.length() > 0) {
            mapLJIIJ.put("tako_chat_id", str5);
        }
        c20235014FoLIZ.LIZ("tikbot_voice_toast_show", mapLJIIJ);
    }

    @Override // com.ss.android.ugc.aweme.tako.mob.ITakoMob
    public final void mobTikbotQuickInteractionClick(Map<String, String> map, Map<String, String> map2, Long l) throws JSONException {
        C20235014Fo c20235014Fo = LIZLLL;
        JSONObject jSONObject = new JSONObject();
        LIZ.getClass();
        LLII(jSONObject, map2);
        LLII(jSONObject, map);
        if (l != null) {
            jSONObject.put("duration", l.longValue());
        }
        c20235014Fo.LIZIZ("tikbot_quick_interaction_click", jSONObject);
    }

    public static void LJ(C1862330yYx c1862330yYx, String str, String str2, String str3) {
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("enter_from", str);
        arrayMap.put("enter_method", str2);
        arrayMap.put(Scene.SCENE_SERVICE, str3);
        c20235014FoLIZ.LIZ("tikbot_aivideo_plugin_not_ready", arrayMap);
    }

    public static void LJII(C1862330yYx c1862330yYx, TakoEnterParams takoEnterParams, String str, String str2) throws JSONException {
        String str3;
        int i;
        String str4;
        String str5;
        Map<String, String> map;
        Map<String, String> map2;
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("process_id", takoEnterParams.processId);
        jSONObject.put("enter_from", takoEnterParams.enterFrom);
        jSONObject.put("enter_method", takoEnterParams.enterMethod);
        if (C1862280yYs.LIZLLL(takoEnterParams)) {
            str3 = "passive_entrance";
        } else {
            str3 = "active_entrance";
        }
        jSONObject.put("entrance_type", str3);
        C2027407wu c2027407wu = C2027407wu.LIZ;
        EnumC1862310yYv enumC1862310yYvLIZIZ = C1862280yYs.LIZIZ(takoEnterParams);
        c2027407wu.getClass();
        if (enumC1862310yYvLIZIZ == null) {
            i = -1;
        } else {
            i = C1862320yYw.LIZ[enumC1862310yYvLIZIZ.ordinal()];
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    str4 = "";
                } else {
                    str4 = "page";
                }
            } else {
                str4 = "panel";
            }
        } else {
            str4 = "hint";
        }
        jSONObject.put("display_style", str4);
        jSONObject.put("trigger_timing", C202131147d.LIZJ.getValue());
        jSONObject.put("search_id", takoEnterParams.getEnterSearchId());
        TakoBehaviorCollectData takoBehaviorCollectData = takoEnterParams.behaviorCollectData;
        if (takoBehaviorCollectData == null || (map2 = takoBehaviorCollectData.sendMessageMobParams) == null || (str5 = map2.get("abase_id")) == null) {
            TakoBehaviorCollectData takoBehaviorCollectData2 = takoEnterParams.behaviorCollectData;
            if (takoBehaviorCollectData2 != null && (map = takoBehaviorCollectData2.chatMobParams) != null) {
                str5 = map.get("abase_id");
            } else {
                str5 = null;
            }
        }
        jSONObject.put("abase_id", str5);
        if (str.length() > 0) {
            jSONObject.put("tako_session_id", str);
        }
        if (str2 != null && str2.length() > 0) {
            jSONObject.put("tako_chat_id", str2);
        }
        c20235014FoLIZ.LIZIZ("tikbot_disclaimer_panel_show", jSONObject);
    }

    public static void LJJLIIIJLLLLLLLZ(C1862330yYx c1862330yYx, String str, String str2, long j) {
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("enter_from", str);
        arrayMap.put("enter_method", str2);
        arrayMap.put("duration", String.valueOf(j));
        c20235014FoLIZ.LIZ("tikbot_loading_toast_close", arrayMap);
    }

    public static void LJJLIIJ(C1862330yYx c1862330yYx, String str, String str2, long j) {
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("enter_from", str);
        arrayMap.put("enter_method", str2);
        arrayMap.put("duration", String.valueOf(j));
        c20235014FoLIZ.LIZ("tikbot_loading_toast_fail", arrayMap);
    }

    @Override // com.ss.android.ugc.aweme.tako.mob.ITakoMob
    public final void mobTikbotEntranceMisTouch(String str, String str2, String str3, long j) throws JSONException {
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("enter_from", str);
        jSONObject.put("entrance_type", str2);
        jSONObject.put("is_mis_touch", 1);
        jSONObject.put("touch_result", str3);
        jSONObject.put("press_duration", j);
        c20235014FoLIZ.LIZIZ("tikbot_entrance_touch", jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.tako.mob.ITakoMob
    public final void mobTikbotInfoSeeMoreClick(String str, String str2, String str3, String str4) {
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("enter_from", str), new Pair("enter_method", str2));
        if (str3 != null && str3.length() > 0) {
            mapLJIIJ.put("panel_impr_id", str3);
        }
        if (str4 != null && str4.length() > 0) {
            mapLJIIJ.put("search_id", str4);
        }
        C597050NbL.LIZ().LIZ("tikbot_info_see_more_click", mapLJIIJ);
    }

    public static void LJI(C1862330yYx c1862330yYx, TakoEnterParams takoEnterParams, String str, String str2, String str3) throws JSONException {
        String str4;
        boolean z;
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("process_id", takoEnterParams.processId);
        jSONObject.put("enter_from", takoEnterParams.enterFrom);
        jSONObject.put("enter_method", takoEnterParams.enterMethod);
        if (C1862280yYs.LIZLLL(takoEnterParams)) {
            str4 = "passive_entrance";
        } else {
            str4 = "active_entrance";
        }
        jSONObject.put("entrance_type", str4);
        jSONObject.put("action", str);
        if (str2.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            jSONObject.put("tako_session_id", str2);
        }
        if (str3.length() > 0) {
            jSONObject.put("tako_chat_id", str3);
        }
        c20235014FoLIZ.LIZIZ("tikbot_disclaimer_panel_response", jSONObject);
    }

    public static void LJJIIJZLJL(C1862330yYx c1862330yYx, Map map, String str, String str2, int i) {
        C20235014Fo c20235014FoLIZ = null;
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = "photos_disclaimer";
        }
        if ((i & 8) != 0) {
            c20235014FoLIZ = C597050NbL.LIZ();
        }
        c1862330yYx.getClass();
        c20235014FoLIZ.LIZ("tako_disclaimer_request", C2097608Jq.LJIIJ(new Pair("enter_from", map.get("enter_from")), new Pair("enter_method", map.get("enter_method")), new Pair("process_id", map.get("process_id")), new Pair("tako_session_id", map.get("tako_session_id")), new Pair("tako_chat_id", map.get("tako_chat_id")), new Pair("source", str2), new Pair("disclaimer_type", str)));
    }

    public static void LJJIIZ(C1862330yYx c1862330yYx, Map map, String str, String str2, int i) {
        C20235014Fo c20235014FoLIZ = null;
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = "photos_disclaimer";
        }
        if ((i & 8) != 0) {
            c20235014FoLIZ = C597050NbL.LIZ();
        }
        c1862330yYx.getClass();
        c20235014FoLIZ.LIZ("tako_disclaimer_response", C2097608Jq.LJIIJ(new Pair("enter_from", map.get("enter_from")), new Pair("enter_method", map.get("enter_method")), new Pair("process_id", map.get("process_id")), new Pair("tako_session_id", map.get("tako_session_id")), new Pair("tako_chat_id", map.get("tako_chat_id")), new Pair("source", str2), new Pair("action_type", str)));
    }

    public static void LJJJLIIL(C1862330yYx c1862330yYx, String str, String str2, String str3, Map map) {
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        c20235014FoLIZ.LIZ("tikbot_easter_egg_show", C2097608Jq.LJIIJ(new Pair("enter_from", map.get("enter_from")), new Pair("enter_method", map.get("enter_method")), new Pair("process_id", map.get("process_id")), new Pair("bot_id", map.get("bot_id")), new Pair("search_id", map.get("search_id")), new Pair("sub_process_id", map.get("sub_process_id")), new Pair("action_item_id", map.get("action_item_id")), new Pair("message_id", str3), new Pair(Scene.SCENE_SERVICE, str), new Pair("keyword", str2)));
    }

    public static void LJJJLL(C1862330yYx c1862330yYx, String str, String str2, String str3, String str4) {
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        c20235014FoLIZ.LIZ("tikbot_comment_avoid", C2097608Jq.LJIIIIZZ(new Pair("enter_from", str), new Pair("entrance_type", "comment_related_word"), new Pair("group_id", str2), new Pair("reason", str3), new Pair("sub_reason", str4)));
    }

    public static void LJJLIIIJL(C1862330yYx c1862330yYx, String str, String str2, String str3, Map map) {
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        c20235014FoLIZ.LIZ("tikbot_image_to_video", C2097608Jq.LJIIIIZZ(new Pair("enter_from", map.get("enter_from")), new Pair("enter_method", map.get("enter_method")), new Pair("process_id", map.get("process_id")), new Pair("tako_session_id", map.get("tako_session_id")), new Pair("tako_chat_id", map.get("tako_chat_id")), new Pair("message_id", str), new Pair("source", str2), new Pair("url", str3)));
    }

    public static void LL(C1862330yYx c1862330yYx, int i, int i2, String str, Long l) {
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("error_code", String.valueOf(i)), new Pair("player_error_code", String.valueOf(i2)));
        if (C123100dR.LIZ(str)) {
            mapLJIIJ.put("video_url", str);
        }
        if (l != null) {
            mapLJIIJ.put("start_time", l.toString());
        }
        c20235014FoLIZ.LIZ("tikbot_video_play_result", mapLJIIJ);
    }

    public static void LJIILLIIL(C1862330yYx c1862330yYx, String str, String str2, String str3, String str4, String str5) {
        boolean z;
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", str);
        linkedHashMap.put("enter_method", str2);
        linkedHashMap.put("process_id", str3);
        linkedHashMap.put("button_type", "resend");
        if (str4.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            linkedHashMap.put("tako_session_id", str4);
        }
        if (str5.length() > 0) {
            linkedHashMap.put("tako_chat_id", str5);
        }
        c20235014FoLIZ.LIZ("tikbot_notice_click", linkedHashMap);
    }

    public static void LJJIII(C1862330yYx c1862330yYx, JSONObject jSONObject, String str, String str2, String str3, String str4) throws JSONException {
        c1862330yYx.getClass();
        if (str != null && str.length() != 0) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                if (jSONArray.length() > 0) {
                    jSONObject.put("template_info", jSONArray);
                    return;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        LJJIIJ(jSONObject, str2, str3, str4, null, null, null, null);
    }

    public static void LJJZZIII(C1862330yYx c1862330yYx, Map map, String str, String str2, Integer num, int i) {
        C20235014Fo c20235014FoLIZ = null;
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        if ((i & 32) != 0) {
            c20235014FoLIZ = C597050NbL.LIZ();
        }
        c1862330yYx.getClass();
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("process_id", map.get("process_id")), new Pair("enter_from", map.get("enter_from")), new Pair("enter_method", map.get("enter_method")), new Pair("tako_session_id", map.get("tako_session_id")), new Pair("tako_chat_id", map.get("tako_chat_id")), new Pair("action_type", str), new Pair("screen_type", map.get("screen_type")));
        if (str2 != null && str2.length() > 0) {
            mapLJIIJ.put("mode_type", str2);
        }
        if (num != null && num.intValue() >= 0) {
            mapLJIIJ.put("button_pos", String.valueOf(num.intValue()));
        }
        c20235014FoLIZ.LIZ("tikbot_mode_panel_click", mapLJIIJ);
    }

    public static void LJLIIL(C1862330yYx c1862330yYx, String str, String str2, String str3, String str4, String str5) {
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        c20235014FoLIZ.LIZ("tikbot_new_chat_button_show", C2097608Jq.LJIIJ(new Pair("enter_from", str), new Pair("enter_method", str2), new Pair("process_id", str3), new Pair("tako_session_id", str4), new Pair("tako_chat_id", str5)));
    }

    public static void LJLIL(C1862330yYx c1862330yYx, String str, String str2, String str3, String str4, String str5) {
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        c20235014FoLIZ.LIZ("tikbot_new_chat_feedback", C2097608Jq.LJIIJ(new Pair("enter_from", str), new Pair("enter_method", str2), new Pair("process_id", str3), new Pair("tako_session_id", str4), new Pair("tako_chat_id", str5), new Pair("failed_reason", "user_onboarding")));
    }

    public static void LJLJJLL(int i, C1862330yYx c1862330yYx, String str, String str2, String str3, Map map) {
        C20235014Fo c20235014FoLIZ;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        String str4;
        String str5 = null;
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            c20235014FoLIZ = C597050NbL.LIZ();
        } else {
            c20235014FoLIZ = null;
        }
        c1862330yYx.getClass();
        Pair[] pairArr = new Pair[7];
        if (map != null) {
            obj = map.get("enter_from");
        } else {
            obj = null;
        }
        pairArr[0] = new Pair("enter_from", obj);
        if (map != null) {
            obj2 = map.get("enter_method");
        } else {
            obj2 = null;
        }
        pairArr[1] = new Pair("enter_method", obj2);
        if (map != null) {
            obj3 = map.get("process_id");
        } else {
            obj3 = null;
        }
        pairArr[2] = new Pair("process_id", obj3);
        if (map != null) {
            obj4 = map.get("tako_session_id");
        } else {
            obj4 = null;
        }
        pairArr[3] = new Pair("tako_session_id", obj4);
        if (map != null) {
            obj5 = map.get("tako_chat_id");
        } else {
            obj5 = null;
        }
        pairArr[4] = new Pair("tako_chat_id", obj5);
        if (map != null) {
            obj6 = map.get("sub_process_id");
        } else {
            obj6 = null;
        }
        pairArr[5] = new Pair("sub_process_id", obj6);
        if (map != null) {
            obj7 = map.get("bot_id");
        } else {
            obj7 = null;
        }
        pairArr[6] = new Pair("bot_id", obj7);
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (str != null) {
            mapLJIIJ.put("situation", str);
        }
        if (str2 != null) {
            mapLJIIJ.put("panel_source", str2);
        }
        if (str3 != null) {
            mapLJIIJ.put("message_id", str3);
        }
        if (map != null && (str4 = (String) map.get("panel_impr_id")) != null && str4.length() > 0) {
            mapLJIIJ.put("panel_impr_id", str4);
        }
        if (map != null) {
            str5 = (String) map.get("inspiration_session_id");
        }
        mapLJIIJ.putAll(C1862870yZp.LIZ(str5));
        c20235014FoLIZ.LIZ("tikbot_post_panel_show", mapLJIIJ);
    }

    public static void LJLLLL(C1862330yYx c1862330yYx, String str, String str2, String str3, String str4, String str5) {
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        c20235014FoLIZ.LIZ("tikbot_sidebar_button_click", C2097608Jq.LJIIJ(new Pair("enter_from", str), new Pair("enter_method", str2), new Pair("process_id", str3), new Pair("tako_session_id", str4), new Pair("tako_chat_id", str5)));
    }

    public static void LJLLLLLL(C1862330yYx c1862330yYx, String str, String str2, String str3, String str4, String str5) {
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        c20235014FoLIZ.LIZ("tikbot_sidebar_button_show", C2097608Jq.LJIIJ(new Pair("enter_from", str), new Pair("enter_method", str2), new Pair("process_id", str3), new Pair("tako_session_id", str4), new Pair("tako_chat_id", str5)));
    }

    public static void LJJIFFI(C1862330yYx c1862330yYx, String str, String str2, String str3, String str4, String str5, String str6) {
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("enter_from", str);
        arrayMap.put("enter_method", str2);
        arrayMap.put("process_id", str3);
        if (str4 != null && str4.length() > 0) {
            arrayMap.put("tako_session_id", str4);
        }
        if (str5 != null && str5.length() > 0) {
            arrayMap.put("screen_type", str5);
        }
        arrayMap.put("tab_name", str6);
        arrayMap.put("tab_type", "off");
        c20235014FoLIZ.LIZ("tikbot_tab_click", arrayMap);
    }

    public static void LJJIZ(C1862330yYx c1862330yYx, String str, String str2, String str3, String str4, String str5, String str6) {
        boolean z;
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("process_id", str3), new Pair("enter_from", str), new Pair("enter_method", str2), new Pair("panel_impr_id", str4));
        if (str5.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mapLJIIJ.put("tako_session_id", str5);
        }
        if (str6 != null && str6.length() > 0) {
            mapLJIIJ.put("tako_chat_id", str6);
        }
        c20235014FoLIZ.LIZ("tikbot_enter_fullscreen_click", mapLJIIJ);
    }

    public static void LJJJJLL(C1862330yYx c1862330yYx, String str, String str2, String str3, String str4, String str5, String str6) {
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        c20235014FoLIZ.LIZ("tikbot_nimble_card_match", C2097608Jq.LJIIIIZZ(new Pair("message_id", str), new Pair("card_type", str2), new Pair("template_version", str3), new Pair("template_name", str4), new Pair("match_success", str5), new Pair("failure_info", str6)));
    }

    public static void LJLLL(C1862330yYx c1862330yYx, String str, String str2, String str3, String str4, String str5, String str6) throws JSONException {
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("process_id", str);
        jSONObject.put("tako_session_id", str2);
        if (str3 != null && str3.length() > 0) {
            jSONObject.put("tako_chat_id", str3);
        }
        jSONObject.put("enter_from", str4);
        jSONObject.put("enter_method", str5);
        jSONObject.put("type", str6);
        c20235014FoLIZ.LIZIZ("tikbot_widget_show", jSONObject);
    }

    public static void LJIIJJI(C1862330yYx c1862330yYx, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("enter_from", str);
        arrayMap.put("enter_method", str2);
        if (str3 != null && str3.length() > 0) {
            arrayMap.put("process_id", str3);
        }
        arrayMap.put("failed_reason", "voice_call");
        if (str4 != null && str4.length() > 0) {
            arrayMap.put("tako_session_id", str4);
        }
        if (str5 != null && str5.length() > 0) {
            arrayMap.put("session_source", str5);
        }
        if (str6 != null && str6.length() > 0) {
            arrayMap.put("screen_type", str6);
        }
        if (str7 != null && str7.length() > 0) {
            arrayMap.put("video_session_id", str7);
        }
        c20235014FoLIZ.LIZ("tikbot_enter_video_failure", arrayMap);
    }

    public static void LJJII(C1862330yYx c1862330yYx, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("enter_from", str);
        arrayMap.put("enter_method", str2);
        arrayMap.put("process_id", str3);
        if (str4 != null && str4.length() > 0) {
            arrayMap.put("tako_session_id", str4);
        }
        if (str5 != null && str5.length() > 0) {
            arrayMap.put("screen_type", str5);
        }
        arrayMap.put("tab_name", str6);
        arrayMap.put("tab_type", str7);
        c20235014FoLIZ.LIZ("tikbot_tab_show", arrayMap);
    }

    public static void LJJIIJ(JSONObject jSONObject, String str, String str2, String str3, String str4, String str5, String str6, Integer num) throws JSONException {
        if (str != null && str.length() != 0) {
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("template_id", str);
            if (str4 != null && str4.length() > 0) {
                jSONObject2.put("mode", str4);
            }
            if (str5 != null && str5.length() > 0) {
                jSONObject2.put("template_type", str5);
            }
            if (str2 != null && str2.length() > 0) {
                jSONObject2.put("generate_type", str2);
            }
            if (str6 != null && str6.length() > 0) {
                jSONObject2.put("process_type", str6);
            }
            if (num != null) {
                jSONObject2.put("rank", String.valueOf(num.intValue()));
            }
            if (str3 != null && str3.length() > 0) {
                jSONObject2.put("skill_info", str3);
            }
            jSONArray.put(jSONObject2);
            jSONObject.put("template_info", jSONArray);
        }
    }

    public static void LJJIJLIJ(C1862330yYx c1862330yYx, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        boolean z;
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("process_id", str3), new Pair("enter_from", str), new Pair("enter_method", str2), new Pair("panel_impr_id", str4), new Pair("screen_type", str5));
        if (str6.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mapLJIIJ.put("tako_session_id", str6);
        }
        if (str7 != null && str7.length() > 0) {
            mapLJIIJ.put("tako_chat_id", str7);
        }
        c20235014FoLIZ.LIZ("tikbot_close_chat", mapLJIIJ);
    }

    public static void LJJJ(int i, Long l, Long l2, String str, String str2, String str3, String str4, String str5) {
        try {
            C20235014Fo c20235014Fo = LIZLLL;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("message_id", str);
            if (str2 != null) {
                jSONObject.put("image_uri", str2);
            }
            jSONObject.put("image_index", i);
            if (l != null && str3 != null) {
                jSONObject.put("error_code", l.toString());
                jSONObject.put("error_message", str3);
            }
            if (l2 != null) {
                jSONObject.put("upload_cost_time", l2.longValue());
            }
            if (str4 != null) {
                jSONObject.put("image_info", str4);
            }
            if (str5 != null) {
                jSONObject.put("intent", str5);
            }
            c20235014Fo.LIZIZ("tikbot_image_upload_result", jSONObject);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static void LJJJIL(C1862330yYx c1862330yYx, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        c20235014FoLIZ.LIZ("tikbot_input_paste", C2097608Jq.LJIIJ(new Pair("enter_from", str), new Pair("enter_method", str2), new Pair("process_id", str3), new Pair("tako_session_id", str4), new Pair("tako_chat_id", str5), new Pair("last_message_id", str6), new Pair("paste_content", str7)));
    }

    public static void LJJLIIIJ(C1862330yYx c1862330yYx, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("enter_from", str), new Pair("enter_method", str2), new Pair("process_id", str3), new Pair("hint_source", str4), new Pair("hint_name", str5));
        if (C123100dR.LIZ(str6) && str6 != null) {
            mapLJIIJ.put("tako_session_id", str6);
        }
        if (C123100dR.LIZ(str7) && str7 != null) {
            mapLJIIJ.put("tako_chat_id", str7);
        }
        c20235014FoLIZ.LIZ("tikbot_hint_click", mapLJIIJ);
    }

    public static void LJJLIIIJJI(C1862330yYx c1862330yYx, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        boolean z;
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("enter_from", str), new Pair("enter_method", str2), new Pair("process_id", str3), new Pair("hint_source", str4), new Pair("hint_name", str5));
        if (str6.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mapLJIIJ.put("tako_session_id", str6);
        }
        if (str7.length() > 0) {
            mapLJIIJ.put("tako_chat_id", str7);
        }
        c20235014FoLIZ.LIZ("tikbot_hint_show", mapLJIIJ);
    }

    public static void LJJLIL(C1862330yYx c1862330yYx, String str, String str2, long j, boolean z, long j2, String str3, int i) {
        String str4;
        C20235014Fo c20235014FoLIZ = null;
        if ((i & 32) != 0) {
            str3 = null;
        }
        if ((i & 64) != 0) {
            c20235014FoLIZ = C597050NbL.LIZ();
        }
        c1862330yYx.getClass();
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("enter_from", str);
        arrayMap.put("enter_method", str2);
        arrayMap.put("duration", String.valueOf(j));
        if (z) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        arrayMap.put("is_show", str4);
        arrayMap.put("init_duration", String.valueOf(j2));
        if (str3 != null) {
            arrayMap.put("reason", str3);
        }
        c20235014FoLIZ.LIZ("tikbot_loading_toast_show", arrayMap);
    }

    public static void LJLJJL(C1862330yYx c1862330yYx, Map map, String str, String str2, String str3, String str4, Integer num, int i) {
        C20235014Fo c20235014FoLIZ;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        String str5;
        String str6 = null;
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        if ((i & 32) != 0) {
            num = null;
        }
        if ((i & 64) != 0) {
            c20235014FoLIZ = C597050NbL.LIZ();
        } else {
            c20235014FoLIZ = null;
        }
        c1862330yYx.getClass();
        Pair[] pairArr = new Pair[8];
        if (map != null) {
            obj = map.get("enter_from");
        } else {
            obj = null;
        }
        pairArr[0] = new Pair("enter_from", obj);
        if (map != null) {
            obj2 = map.get("enter_method");
        } else {
            obj2 = null;
        }
        pairArr[1] = new Pair("enter_method", obj2);
        if (map != null) {
            obj3 = map.get("process_id");
        } else {
            obj3 = null;
        }
        pairArr[2] = new Pair("process_id", obj3);
        if (map != null) {
            obj4 = map.get("tako_session_id");
        } else {
            obj4 = null;
        }
        pairArr[3] = new Pair("tako_session_id", obj4);
        if (map != null) {
            obj5 = map.get("tako_chat_id");
        } else {
            obj5 = null;
        }
        pairArr[4] = new Pair("tako_chat_id", obj5);
        if (map != null) {
            obj6 = map.get("sub_process_id");
        } else {
            obj6 = null;
        }
        pairArr[5] = new Pair("sub_process_id", obj6);
        if (map != null) {
            obj7 = map.get("bot_id");
        } else {
            obj7 = null;
        }
        pairArr[6] = new Pair("bot_id", obj7);
        pairArr[7] = new Pair("button_type", str);
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (str2 != null) {
            mapLJIIJ.put("situation", str2);
        }
        if (str3 != null) {
            mapLJIIJ.put("panel_source", str3);
        }
        if (str4 != null) {
            mapLJIIJ.put("message_id", str4);
        }
        if (num != null) {
            mapLJIIJ.put("image_index", String.valueOf(num.intValue()));
        }
        if (map != null && (str5 = (String) map.get("panel_impr_id")) != null && str5.length() > 0) {
            mapLJIIJ.put("panel_impr_id", str5);
        }
        if (map != null) {
            str6 = (String) map.get("inspiration_session_id");
        }
        mapLJIIJ.putAll(C1862870yZp.LIZ(str6));
        c20235014FoLIZ.LIZ("tikbot_post_panel_click", mapLJIIJ);
    }

    public static void LJLL(C1862330yYx c1862330yYx, String str, String str2, String str3, Boolean bool, Long l, String str4, String str5) throws JSONException {
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("process_id", str3);
        jSONObject.put("enter_from", str);
        jSONObject.put("enter_method", str2);
        jSONObject.put("is_mis_touch", bool);
        jSONObject.put("duration", l);
        jSONObject.put("tako_session_id", str4);
        if (str5 != null && str5.length() > 0) {
            jSONObject.put("tako_chat_id", str5);
        }
        c20235014FoLIZ.LIZIZ("tikbot_send_button_touch_down", jSONObject);
    }

    public static void LJLLJ(C1862330yYx c1862330yYx, String str, String str2, String str3, String str4, String str5, String str6, String str7) throws JSONException {
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("process_id", str);
        jSONObject.put("enter_from", str2);
        jSONObject.put("enter_method", str3);
        jSONObject.put("tako_session_id", str4);
        if (str5 != null && str5.length() > 0) {
            jSONObject.put("tako_chat_id", str5);
        }
        jSONObject.put("type", str6);
        jSONObject.put("button_type", str7);
        c20235014FoLIZ.LIZIZ("tikbot_widget_click", jSONObject);
    }

    public static void LJJIIZI(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, InterfaceC20234814Fm interfaceC20234814Fm) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("enter_from", str2);
        jSONObject.put("enter_method", str3);
        jSONObject.put("process_id", str4);
        jSONObject.put("message_id", str5);
        jSONObject.put("group_id", str6);
        jSONObject.put("tako_session_id", str7);
        if (str8 != null && str8.length() > 0) {
            jSONObject.put("tako_chat_id", str8);
        }
        interfaceC20234814Fm.LIZIZ(str, jSONObject);
    }

    public static void LJJLIIIJILLIZJL(C1862330yYx c1862330yYx, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        boolean z;
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("process_id", str3), new Pair("enter_from", str), new Pair("enter_method", str2), new Pair("message_id", str4), new Pair("hint_source", str5), new Pair("hint_name", str6));
        if (str7.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mapLJIIJ.put("tako_session_id", str7);
        }
        if (str8.length() > 0) {
            mapLJIIJ.put("tako_chat_id", str8);
        }
        c20235014FoLIZ.LIZ("tikbot_hint_click", mapLJIIJ);
    }

    public static void LJJLIIIJJIZ(C1862330yYx c1862330yYx, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        boolean z;
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("process_id", str3), new Pair("enter_from", str), new Pair("enter_method", str2), new Pair("message_id", str4), new Pair("hint_source", str5), new Pair("hint_name", str6));
        if (str7.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mapLJIIJ.put("tako_session_id", str7);
        }
        if (str8.length() > 0) {
            mapLJIIJ.put("tako_chat_id", str8);
        }
        c20235014FoLIZ.LIZ("tikbot_hint_show", mapLJIIJ);
    }

    public static void LJLILLLLZI(C1862330yYx c1862330yYx, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        boolean z;
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("process_id", str3), new Pair("enter_from", str), new Pair("enter_method", str2), new Pair("message_id", str4), new Pair("panel_source", str5), new Pair("word_content", str6));
        if (str7.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mapLJIIJ.put("tako_session_id", str7);
        }
        if (str8 != null && str8.length() > 0) {
            mapLJIIJ.put("tako_chat_id", str8);
        }
        c20235014FoLIZ.LIZ("tikbot_panel_report_show", mapLJIIJ);
    }

    public static void LJZL(C1862330yYx c1862330yYx, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        Pair[] pairArr = new Pair[8];
        if (str == null) {
            str = "";
        }
        pairArr[0] = new Pair("enter_from", str);
        if (str2 == null) {
            str2 = "";
        }
        pairArr[1] = new Pair("enter_method", str2);
        pairArr[2] = new Pair("message_id", str3);
        if (str4 == null) {
            str4 = "";
        }
        pairArr[3] = new Pair("process_id", str4);
        pairArr[4] = new Pair("tako_session_id", str5);
        pairArr[5] = new Pair("tako_chat_id", str6);
        pairArr[6] = new Pair("source", str7);
        pairArr[7] = new Pair("screen_type", str8);
        c20235014FoLIZ.LIZ("tikbot_switch_response_show", C2097608Jq.LJIIJ(pairArr));
    }

    public static void LJJJJZI(C1862330yYx c1862330yYx, String str, String str2, String str3, long j, long j2, String str4, String str5, String str6, String str7) {
        boolean z;
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        Map<Long, Set<String>> map = LJIIIIZZ;
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        Set set = (Set) linkedHashMap.get(Long.valueOf(j));
        if (set != null && set.contains(str5)) {
            return;
        }
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("process_id", str), new Pair("enter_from", str2), new Pair("enter_method", str3), new Pair("tako_session_id", str6), new Pair("tako_chat_id", str7));
        Long lValueOf = Long.valueOf(j);
        if (lValueOf.longValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            lValueOf.longValue();
            mapLJIIJ.put("bot_id", String.valueOf(j));
        }
        Long lValueOf2 = Long.valueOf(j2);
        if (lValueOf2.longValue() > 0) {
            lValueOf2.longValue();
            mapLJIIJ.put("action_item_id", String.valueOf(j2));
        }
        if (C123100dR.LIZ(str4) && str4 != null) {
            mapLJIIJ.put("sub_enter_method", str4);
        }
        if (C123100dR.LIZ(str5) && str5 != null) {
            mapLJIIJ.put("sub_process_id", str5);
        }
        Set set2 = (Set) linkedHashMap.get(Long.valueOf(j));
        if (set2 != null) {
            set2.add(str5);
        } else {
            map.put(Long.valueOf(j), C093Y.LJ(str5));
        }
        c20235014FoLIZ.LIZ("tikbot_enter_sub_chat", mapLJIIJ);
    }

    public static void LJLZ(C1862330yYx c1862330yYx, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        c20235014FoLIZ.LIZ("tikbot_subbot_icon_click", C2097608Jq.LJIIJ(new Pair("process_id", str3), new Pair("enter_from", str), new Pair("enter_method", str2), new Pair("bot_name", str4), new Pair("bot_id", str5), new Pair("bot_position", str6), new Pair("bot_tab", str7), new Pair("tako_session_id", str8), new Pair("tako_chat_id", str9)));
    }

    public static void LJZ(C1862330yYx c1862330yYx, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        c20235014FoLIZ.LIZ("tikbot_subbot_icon_show", C2097608Jq.LJIIJ(new Pair("process_id", str3), new Pair("enter_from", str), new Pair("enter_method", str2), new Pair("bot_id", str4), new Pair("bot_name", str5), new Pair("bot_position", str6), new Pair("bot_tab", str7), new Pair("tako_session_id", str8), new Pair("tako_chat_id", str9)));
    }

    public static void LJZI(C1862330yYx c1862330yYx, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        Pair[] pairArr = new Pair[9];
        if (str == null) {
            str = "";
        }
        pairArr[0] = new Pair("enter_from", str);
        if (str2 == null) {
            str2 = "";
        }
        pairArr[1] = new Pair("enter_method", str2);
        pairArr[2] = new Pair("message_id", str3);
        if (str4 == null) {
            str4 = "";
        }
        pairArr[3] = new Pair("process_id", str4);
        pairArr[4] = new Pair("tako_session_id", str5);
        pairArr[5] = new Pair("tako_chat_id", str6);
        pairArr[6] = new Pair("source", str7);
        pairArr[7] = new Pair("action_type", str8);
        pairArr[8] = new Pair("screen_type", str9);
        c20235014FoLIZ.LIZ("tikbot_switch_response_click", C2097608Jq.LJIIJ(pairArr));
    }

    public static void LJJJJLI(C1862330yYx c1862330yYx, String str, String str2, String str3, String str4, Integer num, int i, int i2, String str5, String str6, String str7) throws JSONException {
        boolean z;
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        JSONObject jSONObject = new JSONObject();
        if (str2 != null) {
            jSONObject.put("enter_from", str2);
        }
        if (str3 != null) {
            jSONObject.put("enter_method", str3);
        }
        if (str != null) {
            jSONObject.put("process_id", str);
        }
        if (str4 != null) {
            jSONObject.put("message_id", str4);
        }
        if (num != null) {
            jSONObject.put("message_status", num.intValue());
        }
        jSONObject.put("exposed_words", i);
        jSONObject.put("total_words", i2);
        if (str5 != null) {
            jSONObject.put("screen_type", str5);
        }
        if (str6.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            jSONObject.put("tako_session_id", str6);
        }
        if (str7 != null && str7.length() > 0) {
            jSONObject.put("tako_chat_id", str7);
        }
        c20235014FoLIZ.LIZIZ("tikbot_message_exposure_word_count", jSONObject);
    }

    public static void LJJZZI(int i, C1862330yYx c1862330yYx, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        C20235014Fo c20235014FoLIZ;
        if ((i & 256) != 0) {
            c20235014FoLIZ = C597050NbL.LIZ();
        } else {
            c20235014FoLIZ = null;
        }
        if ((i & 512) != 0) {
            str9 = null;
        }
        c1862330yYx.getClass();
        C20235214Fq.LIZ.getClass();
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("enter_from", str), new Pair("enter_method", str2), new Pair("process_id", str3), new Pair("tako_session_id", str4), new Pair("tako_chat_id", str5), new Pair("group_id", str7), new Pair("page_type", str6), new Pair("last_feed_group_id", C20235214Fq.LIZIZ()), new Pair("session_source", str8));
        if (str9 != null) {
            mapLJIIJ.put("onboarding_style", str9);
        }
        c20235014FoLIZ.LIZ("tikbot_middle_page_show", mapLJIIJ);
    }

    public static void LJL(int i, long j, C1862330yYx c1862330yYx, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        C20235014Fo c20235014FoLIZ = null;
        if ((i & 32) != 0) {
            str5 = null;
        }
        if ((i & 64) != 0) {
            str6 = null;
        }
        if ((i & 512) != 0) {
            c20235014FoLIZ = C597050NbL.LIZ();
        }
        c1862330yYx.getClass();
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("process_id", str3), new Pair("enter_from", str), new Pair("enter_method", str2), new Pair("mode_type", str4), new Pair("duration", String.valueOf(j)), new Pair("sub_mode_type", str5), new Pair("mode_source", str6));
        if (str7.length() > 0) {
            mapLJIIJ.put("tako_session_id", str7);
        }
        if (str8 != null && str8.length() > 0) {
            mapLJIIJ.put("tako_chat_id", str8);
        }
        c20235014FoLIZ.LIZ("tikbot_mode_stay_time", mapLJIIJ);
    }

    public static void LJLJLLL(C1862330yYx c1862330yYx, String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, String str8, long j) {
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        Pair[] pairArr = new Pair[9];
        if (str == null) {
            str = "";
        }
        pairArr[0] = new Pair("enter_from", str);
        if (str2 == null) {
            str2 = "";
        }
        pairArr[1] = new Pair("enter_method", str2);
        if (str3 == null) {
            str3 = "";
        }
        pairArr[2] = new Pair("message_id", str3);
        if (str4 == null) {
            str4 = "";
        }
        pairArr[3] = new Pair("process_id", str4);
        pairArr[4] = new Pair("tako_session_id", str5);
        pairArr[5] = new Pair("tako_chat_id", str6);
        pairArr[6] = new Pair("source", str7);
        pairArr[7] = new Pair("screen_type", str8);
        pairArr[8] = new Pair("duration", String.valueOf(j));
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (num != null) {
            mapLJIIJ.put("response_rank", String.valueOf(num.intValue()));
        }
        c20235014FoLIZ.LIZ("tikbot_response_duration", mapLJIIJ);
    }

    public static void LJJI(C1862330yYx c1862330yYx, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Map map, int i) throws JSONException {
        C20235014Fo c20235014FoLIZ;
        if ((i & 64) != 0) {
            str7 = null;
        }
        if ((i & 128) != 0) {
            str8 = null;
        }
        if ((i & 256) != 0) {
            str9 = null;
        }
        if ((i & 512) != 0) {
            c20235014FoLIZ = C597050NbL.LIZ();
        } else {
            c20235014FoLIZ = null;
        }
        if ((i & 1024) != 0) {
            map = null;
        }
        c1862330yYx.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("process_id", str3);
        jSONObject.put("enter_from", str);
        jSONObject.put("enter_method", str2);
        jSONObject.put("page_source", str6);
        if (str7 != null) {
            jSONObject.put("language_style", str7);
        }
        if (str8 != null) {
            jSONObject.put("mode", str8);
        }
        if (str9 != null) {
            jSONObject.put("mode_source", str9);
        }
        if (str4.length() > 0) {
            jSONObject.put("tako_session_id", str4);
        }
        if (str5 != null && str5.length() > 0) {
            jSONObject.put("tako_chat_id", str5);
        }
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (((CharSequence) entry.getKey()).length() > 0 && entry.getValue() != null) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
            }
        }
        c20235014FoLIZ.LIZIZ("tikbot_sub_page_show", jSONObject);
    }

    public static void LJJIJIIJI(int i, long j, long j2, C1862330yYx c1862330yYx, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        String str9 = str6;
        C20235014Fo c20235014FoLIZ = null;
        if ((i & 128) != 0) {
            str9 = null;
        }
        if ((i & 1024) != 0) {
            c20235014FoLIZ = C597050NbL.LIZ();
        }
        c1862330yYx.getClass();
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("process_id", str), new Pair("enter_from", str2), new Pair("enter_method", str3), new Pair("rank", String.valueOf(str4)), new Pair("button_type", str5));
        if (j > 0) {
            mapLJIIJ.put("bot_id", String.valueOf(j));
        }
        if (j2 > 0) {
            mapLJIIJ.put("action_item_id", String.valueOf(j2));
        }
        if (str9 != null && C123100dR.LIZ(str9)) {
            mapLJIIJ.put("sub_enter_method", str9);
        }
        if (str7.length() > 0) {
            mapLJIIJ.put("tako_session_id", str7);
        }
        if (str8 != null && str8.length() > 0) {
            mapLJIIJ.put("tako_chat_id", str8);
        }
        c20235014FoLIZ.LIZ("tikbot_action_item_click", mapLJIIJ);
    }

    public static void LJJZ(int i, C1862330yYx c1862330yYx, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        C20235014Fo c20235014FoLIZ;
        if ((i & 512) != 0) {
            c20235014FoLIZ = C597050NbL.LIZ();
        } else {
            c20235014FoLIZ = null;
        }
        if ((i & 1024) != 0) {
            str10 = null;
        }
        c1862330yYx.getClass();
        C20235214Fq.LIZ.getClass();
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("enter_from", str), new Pair("enter_method", str2), new Pair("process_id", str3), new Pair("tako_session_id", str4), new Pair("tako_chat_id", str5), new Pair("group_id", str7), new Pair("page_type", str6), new Pair("last_feed_group_id", C20235214Fq.LIZIZ()), new Pair("session_source", str8), new Pair("action_type", str9));
        if (str10 != null) {
            mapLJIIJ.put("onboarding_style", str10);
        }
        c20235014FoLIZ.LIZ("tikbot_middle_page_click", mapLJIIJ);
    }

    public static void LJLIIIL(C1862330yYx c1862330yYx, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i) {
        C20235014Fo c20235014FoLIZ = null;
        if ((i & 128) != 0) {
            str8 = null;
        }
        if ((i & 256) != 0) {
            str9 = null;
        }
        if ((i & 512) != 0) {
            str10 = null;
        }
        if ((i & 1024) != 0) {
            str11 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            c20235014FoLIZ = C597050NbL.LIZ();
        }
        c1862330yYx.getClass();
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("process_id", str3), new Pair("enter_from", str), new Pair("enter_method", str2), new Pair("button_type", str6), new Pair("mode_type", str7), new Pair("sub_mode_type", str8), new Pair("mode_source", str10), new Pair("source", str9), new Pair("page", str11));
        if (str4.length() > 0) {
            mapLJIIJ.put("tako_session_id", str4);
        }
        if (str5 != null && str5.length() > 0) {
            mapLJIIJ.put("tako_chat_id", str5);
        }
        c20235014FoLIZ.LIZ("tikbot_mode_switch_show", mapLJIIJ);
    }

    public static void LJJJJJL(C1862330yYx c1862330yYx, String str, String str2, String str3, String str4, String str5, String str6, long j, String str7, C1862900yZs c1862900yZs, String str8, String str9, String str10, String str11) throws JSONException {
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        JSONObject jSONObject = new JSONObject();
        if (str2 != null) {
            jSONObject.put("enter_from", str2);
        }
        if (str3 != null) {
            jSONObject.put("enter_method", str3);
        }
        if (str4 != null) {
            jSONObject.put("bot_id", str4);
        }
        if (str5 != null) {
            jSONObject.put("message_id", str5);
        }
        if (str6 != null) {
            jSONObject.put("search_id", str6);
        }
        if (str != null) {
            jSONObject.put("process_id", str);
        }
        if (str7 != null) {
            jSONObject.put("is_nimble", str7);
        }
        if (str9 != null && str9.length() > 0) {
            jSONObject.put("response_type", str9);
        }
        jSONObject.put("duration", j);
        if (c1862900yZs != null && C123100dR.LIZ(c1862900yZs.LIZIZ)) {
            jSONObject.put("sub_process_id", c1862900yZs.LIZ);
            jSONObject.put("sub_enter_method", c1862900yZs.LIZIZ);
        }
        if (str8 == null || str8.length() == 0) {
            str8 = "default";
        }
        jSONObject.put("mode", str8);
        if (str10.length() > 0) {
            jSONObject.put("tako_session_id", str10);
        }
        if (str11 != null && str11.length() > 0) {
            jSONObject.put("tako_chat_id", str11);
        }
        c20235014FoLIZ.LIZIZ("tikbot_message_content_exposure", jSONObject);
    }

    public static void LJLI(C1862330yYx c1862330yYx, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i) {
        C20235014Fo c20235014FoLIZ = null;
        if ((i & 128) != 0) {
            str8 = null;
        }
        if ((i & 256) != 0) {
            str9 = null;
        }
        if ((i & 512) != 0) {
            str10 = null;
        }
        if ((i & 1024) != 0) {
            str11 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str12 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            c20235014FoLIZ = C597050NbL.LIZ();
        }
        c1862330yYx.getClass();
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("process_id", str3), new Pair("enter_from", str), new Pair("enter_method", str2), new Pair("button_type", str6), new Pair("mode_type", str7), new Pair("sub_mode_type", str8), new Pair("action_type", str9), new Pair("source", str10), new Pair("mode_source", str11), new Pair("page", str12));
        if (str4.length() > 0) {
            mapLJIIJ.put("tako_session_id", str4);
        }
        if (str5 != null && str5.length() > 0) {
            mapLJIIJ.put("tako_chat_id", str5);
        }
        c20235014FoLIZ.LIZ("tikbot_mode_switch_click", mapLJIIJ);
    }

    public static void LLF(C1862330yYx c1862330yYx, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, int i) {
        C20235014Fo c20235014FoLIZ = null;
        if ((i & 16) != 0) {
            str5 = null;
        }
        if ((i & 32) != 0) {
            str6 = null;
        }
        if ((i & 64) != 0) {
            str7 = null;
        }
        if ((i & 512) != 0) {
            str10 = null;
        }
        if ((i & 1024) != 0) {
            str11 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            num = null;
        }
        if ((i & 8192) != 0) {
            c20235014FoLIZ = C597050NbL.LIZ();
        }
        c1862330yYx.getClass();
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("enter_from", str), new Pair("enter_method", str2), new Pair("process_id", str3), new Pair("tako_chat_id", str5), new Pair("message_id", str6), new Pair("template_id", str7), new Pair("source", str8), new Pair("action_type", str9));
        if (str4 != null && str4.length() > 0) {
            mapLJIIJ.put("tako_session_id", str4);
        }
        if (str10 != null && str10.length() > 0) {
            mapLJIIJ.put("group_id", str10);
        }
        if (str11 != null && str11.length() > 0) {
            mapLJIIJ.put("video_session_id", str11);
        }
        if (num != null) {
            mapLJIIJ.put("video_rank", String.valueOf(num.intValue()));
        }
        c20235014FoLIZ.LIZ("tikbot_voice_button_click", mapLJIIJ);
    }

    public static void LLFF(C1862330yYx c1862330yYx, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, int i) {
        C20235014Fo c20235014FoLIZ = null;
        if ((i & 16) != 0) {
            str5 = null;
        }
        if ((i & 32) != 0) {
            str6 = null;
        }
        if ((i & 64) != 0) {
            str7 = null;
        }
        if ((i & 512) != 0) {
            str10 = null;
        }
        if ((i & 1024) != 0) {
            str11 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            num = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            c20235014FoLIZ = C597050NbL.LIZ();
        }
        c1862330yYx.getClass();
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("enter_from", str), new Pair("enter_method", str2), new Pair("process_id", str3), new Pair("tako_chat_id", str5), new Pair("message_id", str6), new Pair("template_id", str7), new Pair("source", str8), new Pair("button_type", str9));
        if (str4 != null && str4.length() > 0) {
            mapLJIIJ.put("tako_session_id", str4);
        }
        if (str10 != null && str10.length() > 0) {
            mapLJIIJ.put("group_id", str10);
        }
        if (str11 != null && str11.length() > 0) {
            mapLJIIJ.put("video_session_id", str11);
        }
        if (num != null) {
            mapLJIIJ.put("video_rank", String.valueOf(num.intValue()));
        }
        c20235014FoLIZ.LIZ("tikbot_voice_button_show", mapLJIIJ);
    }

    public static void LJIIZILJ(C1862330yYx c1862330yYx, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i) throws JSONException {
        C20235014Fo c20235014FoLIZ = null;
        if ((i & 32) != 0) {
            str6 = null;
        }
        if ((i & 64) != 0) {
            str7 = null;
        }
        if ((i & 128) != 0) {
            str8 = null;
        }
        if ((i & 256) != 0) {
            str9 = null;
        }
        if ((i & 512) != 0) {
            str10 = null;
        }
        if ((i & 1024) != 0) {
            str11 = null;
        }
        if ((i & 8192) != 0) {
            c20235014FoLIZ = C597050NbL.LIZ();
        }
        c1862330yYx.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("process_id", str3);
        jSONObject.put("enter_from", str);
        jSONObject.put("enter_method", str2);
        jSONObject.put("panel_source", str4);
        jSONObject.put("action_type", str5);
        if (str6 != null) {
            jSONObject.put("style_name", str6);
        }
        if (str7 != null) {
            jSONObject.put("mode", str7);
        }
        if (str8 != null) {
            jSONObject.put("mode_source", str8);
        }
        if (str9 != null) {
            jSONObject.put("skill_mode", str9);
        }
        if (str10 != null) {
            jSONObject.put("generate_type", str10);
        }
        if (str11 != null) {
            jSONObject.put("ratio", str11);
        }
        if (str12.length() > 0) {
            jSONObject.put("tako_session_id", str12);
        }
        if (str13 != null && str13.length() > 0) {
            jSONObject.put("tako_chat_id", str13);
        }
        c20235014FoLIZ.LIZIZ("tikbot_panel_response", jSONObject);
    }

    public static void LJJLIIIIJ(C1862330yYx c1862330yYx, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, String str11, String str12, String str13) {
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("enter_from", str), new Pair("enter_method", str2), new Pair("process_id", str3), new Pair("group_id", str4), new Pair("last_feed_group_id", str5), new Pair("survey_id", str8), new Pair("pos_last_message_id", str9), new Pair("pos_last_bot_message_id", str10), new Pair("pos_last_message_rank", String.valueOf(i)), new Pair("survey_name", str11), new Pair("tako_session_id", str12), new Pair("tako_chat_id", str13));
        if (C123100dR.LIZ(str6)) {
            mapLJIIJ.put("search_id", str6);
        }
        if (C123100dR.LIZ(str7)) {
            mapLJIIJ.put("query", str7);
        }
        c20235014FoLIZ.LIZ("tikbot_feedback_survey_show", mapLJIIJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007c A[PHI: r11
      0x007c: PHI (r11v1 java.lang.String) = (r11v0 java.lang.String), (r11v2 java.lang.String) binds: [B:29:0x006f, B:31:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LLD(X.C1862330yYx r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.Integer r12, java.lang.Integer r13, java.lang.String r14, java.lang.String r15, int r16) throws org.json.JSONException {
        /*
            r0 = 131072(0x20000, float:1.83671E-40)
            r0 = r16 & r0
            r1 = 0
            if (r0 == 0) goto L8
            r15 = r1
        L8:
            r0 = 262144(0x40000, float:3.67342E-40)
            r16 = r16 & r0
            if (r16 == 0) goto L12
            X.14Fo r1 = X.C597050NbL.LIZ()
        L12:
            r2.getClass()
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r0 = "enter_from"
            r2.put(r0, r3)
            java.lang.String r0 = "enter_method"
            r2.put(r0, r4)
            java.lang.String r0 = "process_id"
            r2.put(r0, r5)
            if (r6 == 0) goto L36
            int r0 = r6.length()
            if (r0 <= 0) goto L36
            java.lang.String r0 = "tako_session_id"
            r2.put(r0, r6)
        L36:
            if (r7 == 0) goto L43
            int r0 = r7.length()
            if (r0 <= 0) goto L43
            java.lang.String r0 = "video_session_id"
            r2.put(r0, r7)
        L43:
            if (r8 == 0) goto L50
            int r0 = r8.length()
            if (r0 <= 0) goto L50
            java.lang.String r0 = "message_id"
            r2.put(r0, r8)
        L50:
            java.lang.String r3 = "text"
            java.lang.String r0 = "message_type"
            r2.put(r0, r3)
            if (r9 == 0) goto L64
            int r0 = r9.length()
            if (r0 <= 0) goto L64
            java.lang.String r0 = "message_content"
            r2.put(r0, r9)
        L64:
            int r0 = r10.length()
            if (r0 <= 0) goto L6f
            java.lang.String r0 = "interaction_type"
            r2.put(r0, r10)
        L6f:
            if (r11 != 0) goto L7c
            X.14Fq r0 = X.C20235214Fq.LIZ
            r0.getClass()
            java.lang.String r11 = X.C20235214Fq.LIZJ(r5)
            if (r11 == 0) goto L87
        L7c:
            int r0 = r11.length()
            if (r0 <= 0) goto L87
            java.lang.String r0 = "group_id"
            r2.put(r0, r11)
        L87:
            if (r12 == 0) goto L92
            int r3 = r12.intValue()
            java.lang.String r0 = "video_rank"
            r2.put(r0, r3)
        L92:
            if (r13 == 0) goto L9d
            int r3 = r13.intValue()
            java.lang.String r0 = "message_rank"
            r2.put(r0, r3)
        L9d:
            if (r14 == 0) goto Laa
            int r0 = r14.length()
            if (r0 <= 0) goto Laa
            java.lang.String r0 = "screen_type"
            r2.put(r0, r14)
        Laa:
            if (r15 == 0) goto Lb7
            int r0 = r15.length()
            if (r0 <= 0) goto Lb7
            java.lang.String r0 = "language"
            r2.put(r0, r15)
        Lb7:
            java.lang.String r0 = "tikbot_video_send_message"
            r1.LIZIZ(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1862330yYx.LLD(X.0yYx, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, int):void");
    }

    public static void LJJJJL(C1862330yYx c1862330yYx, String str, String str2, String str3, String str4, String str5, String str6, long j, String str7, String str8, String str9, String str10, String str11, C1862900yZs c1862900yZs, String str12, String str13) {
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("enter_from", str2), new Pair("enter_method", str3), new Pair("bot_id", str4), new Pair("message_id", str5), new Pair("search_id", str6), new Pair("duration", String.valueOf(j)), new Pair("process_id", str), new Pair("is_nimble", str7), new Pair("response_type", str10), new Pair("response_rank", str11));
        if (C123100dR.LIZ(c1862900yZs.LIZIZ)) {
            mapLJIIJ.put("sub_process_id", c1862900yZs.LIZ);
            mapLJIIJ.put("sub_enter_method", c1862900yZs.LIZIZ);
        }
        if (str8.length() == 0) {
            str8 = "default";
        }
        mapLJIIJ.put("mode", str8);
        if (str9 != null && C123100dR.LIZ(str9)) {
            mapLJIIJ.put("sub_mode", str9);
        }
        if (str12.length() > 0) {
            mapLJIIJ.put("tako_session_id", str12);
        }
        if (str13.length() > 0) {
            mapLJIIJ.put("tako_chat_id", str13);
        }
        c20235014FoLIZ.LIZ("tikbot_message_end_exposure", mapLJIIJ);
    }

    public static void LJJJJZ(C1862330yYx c1862330yYx, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, boolean z, Integer num2, boolean z2, float f, String str9, String str10) {
        int iIntValue;
        String str11;
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("process_id", str);
            jSONObject.put("enter_from", str2);
            jSONObject.put("enter_method", str3);
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else if (z) {
                iIntValue = 1;
            } else {
                iIntValue = 0;
            }
            jSONObject.put("is_auto", iIntValue);
            if (z2) {
                str11 = "up";
            } else {
                str11 = "down";
            }
            jSONObject.put("direction", str11);
            jSONObject.put("distance", Float.valueOf(f));
            C20235214Fq.LIZ.getClass();
            String strLIZJ = C20235214Fq.LIZJ(str);
            String str12 = "";
            if (strLIZJ == null) {
                strLIZJ = "";
            }
            jSONObject.put("group_id", strLIZJ);
            String strLIZLLL = C20235214Fq.LIZLLL(str);
            if (strLIZLLL == null) {
                strLIZLLL = "";
            }
            jSONObject.put("last_feed_group_id", strLIZLLL);
            if (str4 == null) {
                str4 = "";
            }
            jSONObject.put("word_id", str4);
            if (str5 == null) {
                str5 = "";
            }
            jSONObject.put("impr_id", str5);
            if (str6 == null) {
                str6 = "";
            }
            jSONObject.put("words_content", str6);
            if (str7 != null) {
                str12 = str7;
            }
            jSONObject.put("message_id", str12);
            if (str8 != null && str8.length() > 0) {
                jSONObject.put("response_type", str8);
            }
            if (num != null) {
                jSONObject.put("response_rank", num.intValue());
            }
            if (str9.length() > 0) {
                jSONObject.put("tako_session_id", str9);
            }
            if (str10 != null && str10.length() > 0) {
                jSONObject.put("tako_chat_id", str10);
            }
            c20235014FoLIZ.LIZIZ("tikbot_page_slide", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LJJLL(C1862330yYx c1862330yYx, Map map, String str, String str2, Long l, Long l2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, C1862940yZw c1862940yZw, int i) {
        C20235014Fo c20235014FoLIZ;
        String str10 = str9;
        String str11 = str8;
        String str12 = str3;
        String str13 = str7;
        if ((i & 1024) != 0) {
            str13 = "tako";
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str11 = "full_screen";
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str10 = "long_press";
        }
        if ((i & 16384) != 0) {
            c20235014FoLIZ = C597050NbL.LIZ();
        } else {
            c20235014FoLIZ = null;
        }
        c1862330yYx.getClass();
        Object obj = map.get("enter_from");
        Object obj2 = map.get("enter_method");
        Object obj3 = map.get("process_id");
        Object obj4 = map.get("search_id");
        String str14 = (String) map.get("tako_session_id");
        if (str14 == null) {
            str14 = "";
        }
        String str15 = (String) map.get("tako_chat_id");
        Pair[] pairArr = new Pair[10];
        pairArr[0] = new Pair("enter_from", obj);
        pairArr[1] = new Pair("enter_method", obj2);
        pairArr[2] = new Pair("process_id", obj3);
        pairArr[3] = new Pair("message_id", str);
        pairArr[4] = new Pair("search_id", obj4);
        pairArr[5] = new Pair("message_type", str5);
        pairArr[6] = new Pair("page", str13);
        if (str12.length() == 0) {
            str12 = "default";
        }
        pairArr[7] = new Pair("mode", str12);
        pairArr[8] = new Pair("source", str10);
        pairArr[9] = new Pair("screen_type", str11);
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (l != null && l.longValue() > 0) {
            l.longValue();
            mapLJIIJ.put("action_item_id", l.toString());
        }
        if (str2 != null && C123100dR.LIZ(str2)) {
            mapLJIIJ.put("sub_process_id", str2);
        }
        if (l2 != null && l2.longValue() > 0) {
            mapLJIIJ.put("bot_id", String.valueOf(l2.longValue()));
        }
        if (str4 != null && str4.length() > 0) {
            mapLJIIJ.put("sub_mode", str4);
        }
        if (str6.length() > 0) {
            mapLJIIJ.put("response_type", str6);
        }
        if (num != null) {
            mapLJIIJ.put("response_rank", String.valueOf(num.intValue()));
        }
        if (C07IM.LIZ()) {
            C20235214Fq.LIZ.getClass();
            String strLIZ = C20235214Fq.LIZ();
            if (C123100dR.LIZ(strLIZ) && strLIZ != null) {
                mapLJIIJ.put("group_id", strLIZ);
            }
            String strLIZIZ = C20235214Fq.LIZIZ();
            if (C123100dR.LIZ(strLIZIZ) && strLIZIZ != null) {
                mapLJIIJ.put("last_feed_group_id", strLIZIZ);
            }
        }
        if (c1862940yZw != null) {
            mapLJIIJ.put("word_id", c1862940yZw.LIZ);
            mapLJIIJ.put("words_content", c1862940yZw.LIZIZ);
            mapLJIIJ.put("impr_id", c1862940yZw.LIZJ);
        }
        if (str14.length() > 0) {
            mapLJIIJ.put("tako_session_id", str14);
        }
        if (str15 != null && str15.length() > 0) {
            mapLJIIJ.put("tako_chat_id", str15);
        }
        c20235014FoLIZ.LIZ("tikbot_message_long_press", mapLJIIJ);
    }

    public static void LLFZ(C1862330yYx c1862330yYx, String str, String str2, String str3, String str4, Long l, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i) {
        C20235014Fo c20235014FoLIZ = null;
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str11 = null;
        }
        if ((i & 16384) != 0) {
            c20235014FoLIZ = C597050NbL.LIZ();
        }
        c1862330yYx.getClass();
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("enter_from", str);
        arrayMap.put("enter_method", str2);
        arrayMap.put("process_id", str3);
        arrayMap.put("message_id", str6);
        arrayMap.put("link_name", str7);
        arrayMap.put("link_url", str8);
        arrayMap.put("rank", str9);
        arrayMap.put("bot_id", str5);
        arrayMap.put("search_id", str10);
        if (l != null && l.longValue() > 0) {
            l.longValue();
            arrayMap.put("action_item_id", l.toString());
        }
        if (C123100dR.LIZ(str4) && str4 != null) {
            arrayMap.put("sub_process_id", str4);
        }
        if (str11 != null && C123100dR.LIZ(str11)) {
            arrayMap.put("push_id", str11);
            arrayMap.put("situation", "inbox_push_ai_image");
        }
        if (C123100dR.LIZ(str12) && str12 != null) {
            arrayMap.put("tako_session_id", str12);
        }
        if (str13 != null && C123100dR.LIZ(str13)) {
            arrayMap.put("tako_chat_id", str13);
        }
        c20235014FoLIZ.LIZ("tikbot_webpage_link_click", arrayMap);
    }

    public static void LJJ(C1862330yYx c1862330yYx, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, String str9, String str10, String str11, String str12, String str13, Map map, int i) {
        C20235014Fo c20235014FoLIZ;
        String str14;
        Map map2 = map;
        String str15 = str13;
        String str16 = str12;
        String str17 = str11;
        String str18 = str10;
        String str19 = str9;
        Integer num2 = num;
        String str20 = str8;
        LinkedHashMap linkedHashMap = null;
        if ((i & 128) != 0) {
            str20 = null;
        }
        if ((i & 256) != 0) {
            num2 = null;
        }
        if ((i & 512) != 0) {
            str19 = null;
        }
        if ((i & 1024) != 0) {
            str18 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str17 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str16 = null;
        }
        if ((i & 8192) != 0) {
            str15 = null;
        }
        if ((i & 16384) != 0) {
            map2 = null;
        }
        if ((i & 32768) != 0) {
            c20235014FoLIZ = C597050NbL.LIZ();
        } else {
            c20235014FoLIZ = null;
        }
        c1862330yYx.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("process_id", str3);
        jSONObject.put("enter_from", str);
        jSONObject.put("enter_method", str2);
        jSONObject.put("page_source", str6);
        jSONObject.put("action_type", str7);
        if (str20 != null) {
            jSONObject.put("template_id", str20);
        }
        if (num2 != null) {
            jSONObject.put("rank", String.valueOf(num2.intValue()));
        }
        if (str19 != null) {
            jSONObject.put("mode", str19);
        }
        if (str18 != null) {
            jSONObject.put("mode_source", str18);
        }
        if (str17 != null) {
            jSONObject.put("generate_type", str17);
        }
        if (str16 != null && str16.length() > 0) {
            jSONObject.put("process_type", str16);
        }
        if (str15 != null && str15.length() > 0) {
            jSONObject.put("template_type", str15);
        }
        if (str4.length() > 0) {
            jSONObject.put("tako_session_id", str4);
        }
        if (str5 != null && str5.length() > 0) {
            jSONObject.put("tako_chat_id", str5);
        }
        if (map2 != null) {
            str14 = (String) map2.get("skill_info");
        } else {
            str14 = null;
        }
        C1862330yYx c1862330yYx2 = LIZ;
        if (map2 != null) {
            linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map2.entrySet()) {
                if (!Intrinsics.LJFF(entry.getKey(), "skill_info")) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        }
        c1862330yYx2.getClass();
        LLII(jSONObject, linkedHashMap);
        LIZ.getClass();
        LJJIIJ(jSONObject, str20, str17, str14, str19, str15, str16, num2);
        c20235014FoLIZ.LIZIZ("tikbot_sub_page_response", jSONObject);
    }

    public static void LJLJI(C1862330yYx c1862330yYx, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i) throws JSONException {
        String str16 = str5;
        String str17 = str6;
        String str18 = str7;
        String str19 = str8;
        String str20 = str9;
        String str21 = str10;
        String str22 = str11;
        String str23 = str12;
        String str24 = str13;
        C20235014Fo c20235014FoLIZ = null;
        if ((i & 16) != 0) {
            str16 = null;
        }
        if ((i & 32) != 0) {
            str17 = null;
        }
        if ((i & 64) != 0) {
            str18 = null;
        }
        if ((i & 128) != 0) {
            str19 = null;
        }
        if ((i & 256) != 0) {
            str20 = null;
        }
        if ((i & 512) != 0) {
            str21 = null;
        }
        if ((i & 1024) != 0) {
            str22 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str23 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str24 = null;
        }
        if ((i & 32768) != 0) {
            c20235014FoLIZ = C597050NbL.LIZ();
        }
        c1862330yYx.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("process_id", str3);
        jSONObject.put("enter_from", str);
        jSONObject.put("enter_method", str2);
        jSONObject.put("panel_source", str4);
        if (str16 != null && str16.length() > 0) {
            jSONObject.put("message_id", str16);
        }
        if (str17 != null && str17.length() > 0) {
            jSONObject.put("word_content", str17);
        }
        if (str18 != null && str18.length() > 0) {
            jSONObject.put("word_detail_content", str18);
        }
        if (str19 != null && str19.length() > 0) {
            jSONObject.put("bot_message_id", str19);
        }
        if (str20 != null && str20.length() > 0) {
            jSONObject.put("mode", str20);
        }
        if (str21 != null && str21.length() > 0) {
            jSONObject.put("mode_source", str21);
        }
        if (str22 != null) {
            jSONObject.put("skill_mode", str22);
        }
        if (str23 != null) {
            jSONObject.put("generate_type", str23);
        }
        if (str24 != null) {
            jSONObject.put("word_content", str24);
        }
        if (str14.length() > 0) {
            jSONObject.put("tako_session_id", str14);
        }
        if (str15 != null && str15.length() > 0) {
            jSONObject.put("tako_chat_id", str15);
        }
        c20235014FoLIZ.LIZIZ("tikbot_panel_show", jSONObject);
    }

    public static void LLI(C1862330yYx c1862330yYx, String str, String str2, String str3, String str4, Long l, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i) {
        C20235014Fo c20235014FoLIZ = null;
        if ((i & 1024) != 0) {
            str10 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str11 = "";
        }
        if ((i & 32768) != 0) {
            c20235014FoLIZ = C597050NbL.LIZ();
        }
        c1862330yYx.getClass();
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("enter_from", str);
        arrayMap.put("enter_method", str2);
        arrayMap.put("process_id", str3);
        arrayMap.put("message_id", str6);
        arrayMap.put("link_name", str7);
        arrayMap.put("link_url", str8);
        arrayMap.put("rank", str9);
        arrayMap.put("is_hidden", str11);
        arrayMap.put("bot_id", str5);
        arrayMap.put("search_id", str12);
        if (l != null && l.longValue() > 0) {
            l.longValue();
            arrayMap.put("action_item_id", l.toString());
        }
        if (str10 != null && C123100dR.LIZ(str10)) {
            arrayMap.put("push_id", str10);
            arrayMap.put("situation", "inbox_push_ai_image");
        }
        if (C123100dR.LIZ(str4) && str4 != null) {
            arrayMap.put("sub_process_id", str4);
        }
        if (C123100dR.LIZ(str13) && str13 != null) {
            arrayMap.put("tako_session_id", str13);
        }
        if (str14 != null && C123100dR.LIZ(str14)) {
            arrayMap.put("tako_chat_id", str14);
        }
        c20235014FoLIZ.LIZ("tikbot_webpage_link_show", arrayMap);
    }

    public static void LJIL(C1862330yYx c1862330yYx, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17) {
        String str18 = str15;
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        Pair[] pairArr = new Pair[14];
        pairArr[0] = new Pair("enter_from", str);
        pairArr[1] = new Pair("enter_method", str2);
        pairArr[2] = new Pair("process_id", str3);
        pairArr[3] = new Pair("message_id", str7);
        pairArr[4] = new Pair("server_message_id", str8);
        pairArr[5] = new Pair("log_id", str9);
        pairArr[6] = new Pair("bot_id", str6);
        pairArr[7] = new Pair("enter_method", str2);
        pairArr[8] = new Pair("process_id", str3);
        pairArr[9] = new Pair("message_id", str7);
        pairArr[10] = new Pair("status_code", str10);
        pairArr[11] = new Pair("search_id", str11);
        pairArr[12] = new Pair("message_type", str12);
        if (str18.length() == 0) {
            str18 = "default";
        }
        pairArr[13] = new Pair("mode", str18);
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (C123100dR.LIZ(str5) && str5 != null) {
            mapLJIIJ.put("action_item_id", str5);
        }
        if (C123100dR.LIZ(str4) && str4 != null) {
            mapLJIIJ.put("sub_process_id", str4);
        }
        if (C123100dR.LIZ(str14) && str14 != null) {
            mapLJIIJ.put("sub_enter_method", str14);
        }
        if (C123100dR.LIZ(str13) && str13 != null) {
            mapLJIIJ.put("image_info", str13);
        }
        if (str16.length() > 0) {
            mapLJIIJ.put("tako_session_id", str16);
        }
        if (str17.length() > 0) {
            mapLJIIJ.put("tako_chat_id", str17);
        }
        c20235014FoLIZ.LIZ("tikbot_send_message_response_background", mapLJIIJ);
    }

    public static void LJJLJ(C1862330yYx c1862330yYx, Map map, String str, String str2, Long l, Long l2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Integer num, String str11, C1862940yZw c1862940yZw, int i) {
        String str12 = str10;
        String str13 = str4;
        String str14 = str11;
        String str15 = str9;
        Integer num2 = num;
        String str16 = str8;
        String str17 = str7;
        String str18 = str5;
        if ((i & 128) != 0) {
            str18 = "long_press";
        }
        C20235014Fo c20235014FoLIZ = null;
        if ((i & 512) != 0) {
            str17 = null;
        }
        if ((i & 1024) != 0) {
            str16 = "tako";
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str15 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str12 = null;
        }
        if ((i & 8192) != 0) {
            num2 = null;
        }
        if ((i & 16384) != 0) {
            str14 = "full_screen";
        }
        if ((i & 65536) != 0) {
            c20235014FoLIZ = C597050NbL.LIZ();
        }
        c1862330yYx.getClass();
        String str19 = (String) map.get("process_id");
        String str20 = "";
        if (str19 == null) {
            str19 = "";
        }
        C1862420yZ6.LIZ.getClass();
        if (Intrinsics.LJFF(str3, EnumC1858730yT9.COPY.getType()) || Intrinsics.LJFF(str3, EnumC1858730yT9.SELECT_TEXT.getType()) || Intrinsics.LJFF(str3, EnumC1858730yT9.REPORT.getType()) || Intrinsics.LJFF(str3, EnumC1858730yT9.SHARE.getType())) {
            C1862420yZ6.LIZ(str19, str, str3);
        }
        String str21 = (String) map.get("enter_from");
        String str22 = (String) map.get("enter_method");
        String str23 = (String) map.get("search_id");
        if (str13 == null) {
            str13 = "default";
        }
        String str24 = (String) map.get("tako_session_id");
        if (str24 != null) {
            str20 = str24;
        }
        LJJLJLI(str19, str2, l, str, str21, str22, l2, str3, str23, str18, str13, str6, str17, str16, str15, str12, num2, str14, c1862940yZw, str20, (String) map.get("tako_chat_id"), c20235014FoLIZ);
    }

    public static void LJIJJLI(C1862330yYx c1862330yYx, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, C1862900yZs c1862900yZs, String str14, Map map, String str15, String str16, int i) {
        C20235014Fo c20235014FoLIZ;
        String str17 = str4;
        String str18 = str14;
        Map map2 = map;
        C1862900yZs c1862900yZs2 = c1862900yZs;
        if ((i & 8192) != 0) {
            c1862900yZs2 = null;
        }
        if ((32768 & i) != 0) {
            map2 = null;
        }
        if ((i & 262144) != 0) {
            c20235014FoLIZ = C597050NbL.LIZ();
        } else {
            c20235014FoLIZ = null;
        }
        c1862330yYx.getClass();
        Pair[] pairArr = new Pair[14];
        pairArr[0] = new Pair("enter_from", str);
        pairArr[1] = new Pair("enter_method", str2);
        pairArr[2] = new Pair("process_id", str3);
        pairArr[3] = new Pair("message_id", str7);
        pairArr[4] = new Pair("server_message_id", str8);
        pairArr[5] = new Pair("log_id", str9);
        pairArr[6] = new Pair("bot_id", str6);
        pairArr[7] = new Pair("enter_method", str2);
        pairArr[8] = new Pair("process_id", str3);
        pairArr[9] = new Pair("message_id", str7);
        pairArr[10] = new Pair("status_code", str10);
        pairArr[11] = new Pair("search_id", str11);
        pairArr[12] = new Pair("message_type", str12);
        if (str18.length() == 0) {
            str18 = "default";
        }
        pairArr[13] = new Pair("mode", str18);
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (C123100dR.LIZ(str5) && str5 != null) {
            mapLJIIJ.put("action_item_id", str5);
        }
        if (!C123100dR.LIZ(str17)) {
            str17 = null;
        }
        if (str17 != null) {
            mapLJIIJ.put("sub_process_id", str17);
        }
        if (C123100dR.LIZ(str13) && str13 != null) {
            mapLJIIJ.put("image_info", str13);
        }
        if (c1862900yZs2 != null) {
            mapLJIIJ.put("sub_process_id", c1862900yZs2.LIZ);
            mapLJIIJ.put("sub_enter_method", c1862900yZs2.LIZIZ);
        }
        if (str15.length() > 0) {
            mapLJIIJ.put("tako_session_id", str15);
        }
        if (str16.length() > 0) {
            mapLJIIJ.put("tako_chat_id", str16);
        }
        LLIFFJFJJ(mapLJIIJ, map2);
        c20235014FoLIZ.LIZ("tikbot_send_message_response", mapLJIIJ);
    }

    public static void LJIIL(C1862330yYx c1862330yYx, String str, String str2, String str3, String str4, long j, String str5, String str6, String str7, String str8, String str9, int i, long j2, C1862900yZs c1862900yZs, SuggestionWordInfo suggestionWordInfo, boolean z, String str10, Map map, String str11, String str12, String str13, String str14) {
        String str15;
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        Pair[] pairArr = new Pair[13];
        pairArr[0] = new Pair("bot_id", str);
        pairArr[1] = new Pair("process_id", str2);
        pairArr[2] = new Pair("message_id", str3);
        pairArr[3] = new Pair("msg_status", str4);
        pairArr[4] = new Pair("time_stamp", String.valueOf(j));
        pairArr[5] = new Pair("enter_from", str5);
        pairArr[6] = new Pair("enter_method", str6);
        pairArr[7] = new Pair("message_type", str7);
        pairArr[8] = new Pair("is_self", str8);
        pairArr[9] = new Pair("inputbox_content", str9);
        pairArr[10] = new Pair("chat_message_cnt", String.valueOf(i));
        pairArr[11] = new Pair("chat_stay_duration", String.valueOf(j2));
        if (z) {
            str15 = "1";
        } else {
            str15 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[12] = new Pair("is_agree_disclaimer", str15);
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (c1862900yZs != null && C123100dR.LIZ(c1862900yZs.LIZIZ)) {
            mapLJIIJ.put("sub_process_id", c1862900yZs.LIZ);
            mapLJIIJ.put("sub_enter_method", c1862900yZs.LIZIZ);
        }
        if (suggestionWordInfo != null) {
            mapLJIIJ.put("word_id", suggestionWordInfo.wordId);
            mapLJIIJ.put("impr_id", suggestionWordInfo.imprId);
            mapLJIIJ.put("words_content", suggestionWordInfo.wordsContent);
            String str16 = suggestionWordInfo.recallInfo;
            if (str16 != null) {
                mapLJIIJ.put("recall_info", str16);
            }
            String str17 = suggestionWordInfo.searchIntent;
            if (str17 != null) {
                mapLJIIJ.put("search_intent", str17);
            }
            String str18 = suggestionWordInfo.takoIntent;
            if (str18 != null) {
                mapLJIIJ.put("tako_intent", str18);
            }
        }
        C20235214Fq.LIZ.getClass();
        String strLIZJ = C20235214Fq.LIZJ(str2);
        if (strLIZJ != null && (!a0.LJJJIL(strLIZJ))) {
            mapLJIIJ.put("group_id", strLIZJ);
        }
        String strLIZLLL = C20235214Fq.LIZLLL(str2);
        if (strLIZLLL != null && (!a0.LJJJIL(strLIZLLL))) {
            mapLJIIJ.put("last_feed_group_id", strLIZLLL);
        }
        if (str10 != null) {
            mapLJIIJ.put("is_memory", str10);
        }
        if (str11 != null) {
            mapLJIIJ.put("action_type", str11);
        }
        if (str12.length() > 0) {
            mapLJIIJ.put("tako_session_id", str12);
        }
        if (str13.length() > 0) {
            mapLJIIJ.put("tako_chat_id", str13);
        }
        if (str14 != null && str14.length() > 0) {
            mapLJIIJ.put("session_source", str14);
        }
        LLIFFJFJJ(mapLJIIJ, map);
        c20235014FoLIZ.LIZ("tikbot_exit_chat", mapLJIIJ);
    }

    public static void LJJLI(C1862330yYx c1862330yYx, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, String str13, String str14, int i2, String str15, String str16, String str17, String str18, String str19) {
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("enter_from", str), new Pair("enter_method", str2), new Pair("process_id", str3), new Pair("tako_session_id", str4), new Pair("tako_chat_id", str5), new Pair("group_id", str6), new Pair("last_feed_group_id", str7), new Pair("survey_id", str10), new Pair("pos_last_message_id", str11), new Pair("pos_last_bot_message_id", str12), new Pair("pos_last_message_rank", String.valueOf(i)), new Pair("time_last_message_id", str13), new Pair("time_last_bot_message_id", str14), new Pair("time_last_message_rank", String.valueOf(i2)), new Pair("survey_name", str15), new Pair("action_type", str16));
        if (C123100dR.LIZ(str8)) {
            mapLJIIJ.put("search_id", str8);
        }
        if (C123100dR.LIZ(str9)) {
            mapLJIIJ.put("query", str9);
        }
        if (C123100dR.LIZ(str17)) {
            mapLJIIJ.put("star_level", str17);
        }
        if (C123100dR.LIZ(str18)) {
            mapLJIIJ.put("option", str18);
        }
        if (C123100dR.LIZ(str19)) {
            mapLJIIJ.put("input_content", str19);
        }
        c20235014FoLIZ.LIZ("tikbot_feedback_survey_response", mapLJIIJ);
    }

    public static void LJJLJLI(String str, String str2, Long l, String str3, String str4, String str5, Long l2, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Integer num, String str15, C1862940yZw c1862940yZw, String str16, String str17, InterfaceC1862890yZr interfaceC1862890yZr) {
        String str18 = str9;
        Pair[] pairArr = new Pair[9];
        pairArr[0] = new Pair("enter_from", str4);
        pairArr[1] = new Pair("enter_method", str5);
        pairArr[2] = new Pair("process_id", str);
        pairArr[3] = new Pair("message_id", str3);
        pairArr[4] = new Pair("target", str6);
        pairArr[5] = new Pair("source", str8);
        if (str18.length() == 0) {
            str18 = "default";
        }
        pairArr[6] = new Pair("mode", str18);
        pairArr[7] = new Pair("page", str12);
        pairArr[8] = new Pair("screen_type", str15);
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (l != null && l.longValue() > 0) {
            l.longValue();
            mapLJIIJ.put("action_item_id", l.toString());
        }
        if (str2 != null && C123100dR.LIZ(str2)) {
            mapLJIIJ.put("sub_process_id", str2);
        }
        if (str7 != null && C123100dR.LIZ(str7)) {
            mapLJIIJ.put("search_id", str7);
        }
        if (l2 != null && l2.longValue() > 0) {
            mapLJIIJ.put("bot_id", String.valueOf(l2.longValue()));
        }
        if (str11 != null) {
            mapLJIIJ.put("message_type", str11);
        }
        if (str13 != null) {
            mapLJIIJ.put("message_content", str13);
        }
        if (str10 != null && str10.length() > 0) {
            mapLJIIJ.put("sub_mode", str10);
        }
        if (str14 != null && str14.length() > 0) {
            mapLJIIJ.put("response_type", str14);
        }
        if (num != null) {
            mapLJIIJ.put("response_rank", String.valueOf(num.intValue()));
        }
        if (C07IM.LIZ()) {
            C20235214Fq.LIZ.getClass();
            String strLIZ = C20235214Fq.LIZ();
            if (C123100dR.LIZ(strLIZ) && strLIZ != null) {
                mapLJIIJ.put("group_id", strLIZ);
            }
            String strLIZIZ = C20235214Fq.LIZIZ();
            if (C123100dR.LIZ(strLIZIZ) && strLIZIZ != null) {
                mapLJIIJ.put("last_feed_group_id", strLIZIZ);
            }
        }
        if (c1862940yZw != null) {
            mapLJIIJ.put("word_id", c1862940yZw.LIZ);
            mapLJIIJ.put("words_content", c1862940yZw.LIZIZ);
            mapLJIIJ.put("impr_id", c1862940yZw.LIZJ);
        }
        if (str16.length() > 0) {
            mapLJIIJ.put("tako_session_id", str16);
        }
        if (str17 != null && str17.length() > 0) {
            mapLJIIJ.put("tako_chat_id", str17);
        }
        interfaceC1862890yZr.LIZ("tikbot_long_press_feedback", mapLJIIJ);
    }

    @Override // com.ss.android.ugc.aweme.tako.mob.ITakoMob
    public final void mobTikbotEntranceShow(String str, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, SuggestionWordInfo suggestionWordInfo, FeedEnterAwemeInfo feedEnterAwemeInfo, String str13, String str14, String str15, Integer num, String str16, String str17, Map<String, ? extends Object> map, boolean z2) throws JSONException {
        String str18;
        String str19;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("enter_from", str);
        jSONObject.put("entrance_type", str2);
        if (str3 == null) {
            C20235214Fq.LIZ.getClass();
            str3 = C20235214Fq.LIZ();
        }
        jSONObject.put("group_id", str3);
        C20235214Fq.LIZ.getClass();
        jSONObject.put("last_feed_group_id", C20235214Fq.LIZIZ());
        jSONObject.put("search_id", str4);
        jSONObject.put("token_type", str7);
        if (z) {
            str18 = "1";
        } else {
            str18 = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject.put("is_dynamic_icon", str18);
        if (str5 != null) {
            jSONObject.put("unread_cnt", str5);
            LIZJ = str5;
        }
        if (C123100dR.LIZ(str6)) {
            jSONObject.put("search_card_type", str6);
        }
        if (str13 != null && str13.length() > 0) {
            jSONObject.put("panel_impr_id", str13);
        }
        if (str14 != null && str14.length() > 0) {
            jSONObject.put("info_title", str14);
        }
        if (str15 != null && str15.length() > 0) {
            jSONObject.put("info_content", str15);
        }
        if (num != null) {
            jSONObject.put("is_photo", String.valueOf(num.intValue()));
        }
        if (str16 != null && str16.length() > 0) {
            jSONObject.put("enter_action", str16);
        }
        if (str9 != null) {
            jSONObject.put("bubble_impr_id", str9);
        }
        if (str8 != null) {
            jSONObject.put("words_content", str8);
        }
        if (str10 != null && C123100dR.LIZ(str10)) {
            jSONObject.put("extra_flag", str10);
        }
        if (str11 != null) {
            jSONObject.put("standard_ui", str11);
        }
        if (str12 != null) {
            jSONObject.put("customized_info", str12);
        }
        if (suggestionWordInfo != null) {
            jSONObject.put("word_id", suggestionWordInfo.wordId);
            jSONObject.put("impr_id", suggestionWordInfo.imprId);
            String str20 = suggestionWordInfo.recallInfo;
            if (str20 != null) {
                jSONObject.put("recall_info", str20);
            }
            String str21 = suggestionWordInfo.searchIntent;
            if (str21 != null) {
                jSONObject.put("search_intent", str21);
            }
            String str22 = suggestionWordInfo.takoIntent;
            if (str22 != null) {
                jSONObject.put("tako_intent", str22);
            }
        }
        if (feedEnterAwemeInfo != null && (str19 = feedEnterAwemeInfo.awemeType) != null) {
            jSONObject.put("aweme_type", str19);
        }
        if (str17 != null && str17.length() > 0) {
            jSONObject.put("universal_rank", str17);
        }
        if (map != null) {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                if (entry.getKey().length() > 0 && entry.getValue() != null) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            }
        }
        if (z2) {
            AppLogNewUtils.onEventV3("tikbot_entrance_show", jSONObject);
        } else {
            C597050NbL.LIZ().LIZIZ("tikbot_entrance_show", jSONObject);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void LJIIIIZZ(String str, String str2, String str3, String str4, String str5, String str6, String str7, Long l, boolean z, String str8, String str9, String str10, String str11, C1862900yZs c1862900yZs, FeedIconBubbleInfo feedIconBubbleInfo, SuggestionWordInfo suggestionWordInfo, FeedEnterAwemeInfo feedEnterAwemeInfo, String str12, String str13, SmartSearchItem smartSearchItem, String str14, String str15, Map map, Integer num, String str16, String str17, String str18) throws JSONException {
        String str19;
        String str20;
        if (l == null || l.longValue() <= 0) {
            C1864020ybg.LIZ.getClass();
            Long l2 = (Long) ((LinkedHashMap) C1864020ybg.LIZJ).get(str5);
            if (l2 != null) {
                l = Long.valueOf(l2.longValue());
            } else {
                l = null;
            }
        }
        C20235014Fo c20235014Fo = LIZLLL;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("enter_from", str);
        jSONObject.put("enter_method", str2);
        jSONObject.put("search_id", str6);
        jSONObject.put("bot_id", str4);
        jSONObject.put("process_id", str3);
        if (z) {
            str19 = "1";
        } else {
            str19 = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject.put("is_dynamic_icon", str19);
        jSONObject.put("time_stamp", System.currentTimeMillis());
        C1860520yW2.LIZ.getClass();
        jSONObject.put("pre_process_id", C1860520yW2.LJIILIIL());
        jSONObject.put("net_status", TTNetInit.getEffectiveConnectionType());
        if (C123100dR.LIZ(str7)) {
            jSONObject.put("search_type", str7);
        }
        if (!Intrinsics.LJFF(str, C14TF.LIZIZ.LJJIIZ())) {
            if (l != null && l.longValue() > 0) {
                jSONObject.put("last_feed_duration", l.longValue());
            }
        } else {
            jSONObject.put("unread_cnt", LIZJ);
        }
        if (C123100dR.LIZ(str8)) {
            jSONObject.put("search_card_type", str8);
        }
        if (str9 != null) {
            jSONObject.put("token_type", str9);
        }
        C20235214Fq.LIZ.getClass();
        String strLIZJ = C20235214Fq.LIZJ(str3);
        if (strLIZJ != null && (!a0.LJJJIL(strLIZJ))) {
            jSONObject.put("group_id", strLIZJ);
        }
        String strLIZLLL = C20235214Fq.LIZLLL(str3);
        if (strLIZLLL != null && (!a0.LJJJIL(strLIZLLL))) {
            jSONObject.put("last_feed_group_id", strLIZLLL);
        }
        if (suggestionWordInfo != null) {
            String str21 = suggestionWordInfo.wordsSource;
            if (str21 != null) {
                jSONObject.put("words_source", str21);
            }
            String str22 = suggestionWordInfo.wordsContent;
            if (str22 != null) {
                jSONObject.put("words_content", str22);
            }
            String str23 = suggestionWordInfo.wordsContentDetail;
            if (str23 != null) {
                jSONObject.put("words_content_detail", str23);
            }
            String str24 = suggestionWordInfo.rawQuery;
            if (str24 != null) {
                jSONObject.put("raw_query", str24);
            }
            String str25 = suggestionWordInfo.wordId;
            if (str25 != null) {
                jSONObject.put("word_id", str25);
            }
            String str26 = suggestionWordInfo.imprId;
            if (str26 != null) {
                jSONObject.put("impr_id", str26);
            }
            String str27 = suggestionWordInfo.recallInfo;
            if (str27 != null) {
                jSONObject.put("recall_info", str27);
            }
            String str28 = suggestionWordInfo.searchIntent;
            if (str28 != null) {
                jSONObject.put("search_intent", str28);
            }
            String str29 = suggestionWordInfo.takoIntent;
            if (str29 != null) {
                jSONObject.put("tako_intent", str29);
            }
        }
        if (feedEnterAwemeInfo != null && (str20 = feedEnterAwemeInfo.awemeType) != null) {
            jSONObject.put("aweme_type", str20);
        }
        if (str10 != null) {
            jSONObject.put("extra_flag", str10);
        }
        if (str11 != null) {
            jSONObject.put("query", str11);
        }
        if (str12 != null && str12.length() > 0) {
            jSONObject.put("icon_state", str12);
        }
        if (str13 != null) {
            jSONObject.put("enter_from_last_page", str13);
        }
        if (c1862900yZs != null) {
            jSONObject.put("sub_process_id", c1862900yZs.LIZ);
            jSONObject.put("sub_enter_method", c1862900yZs.LIZIZ);
        }
        if (smartSearchItem != null) {
            String str30 = smartSearchItem.panelImplId;
            if (str30 != null && str30.length() > 0) {
                jSONObject.put("panel_impr_id", str30);
            }
            String str31 = smartSearchItem.infoTitle;
            if (str31 != null && str31.length() > 0) {
                jSONObject.put("info_title", str31);
            }
            String str32 = smartSearchItem.infoContent;
            if (str32 != null && str32.length() > 0) {
                jSONObject.put("info_content", str32);
            }
            String str33 = smartSearchItem.wordId;
            if (str33 != null && str33.length() > 0) {
                jSONObject.put("word_id", str33);
            }
            String str34 = smartSearchItem.wordContent;
            if (str34 != null && str34.length() > 0) {
                jSONObject.put("words_content", str34);
            }
            Integer numIsPhoto = smartSearchItem.isPhoto();
            if (numIsPhoto != null) {
                jSONObject.put("is_photo", numIsPhoto.intValue());
            }
        }
        if (str14 != null && str14.length() > 0) {
            jSONObject.put("universal_rank", str14);
        }
        if (str15 != null && str15.length() > 0) {
            jSONObject.put("list_result_type", str15);
        }
        if (feedIconBubbleInfo != null) {
            String str35 = feedIconBubbleInfo.bubbleContent;
            if (str35 != null) {
                jSONObject.put("bubble_content", str35);
            }
            String str36 = feedIconBubbleInfo.wordsContent;
            if (str36 != null) {
                jSONObject.put("words_content", str36);
            }
            String str37 = feedIconBubbleInfo.bubbleImprId;
            if (str37 != null) {
                jSONObject.put("bubble_impr_id", str37);
            }
        }
        if (num != null) {
            jSONObject.put("is_msg_send", num.intValue());
        }
        if (str16.length() > 0) {
            jSONObject.put("tako_session_id", str16);
        }
        if (str17 != null && str17.length() > 0) {
            jSONObject.put("tako_chat_id", str17);
        }
        if (str18.length() > 0) {
            jSONObject.put("session_source", str18);
        }
        LIZ.getClass();
        LLII(jSONObject, map);
        c20235014Fo.LIZIZ("tikbot_enter_chat", jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.tako.mob.ITakoMob
    public final void mobTikbotEntranceClick(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Map<String, ? extends Object> map, String str14, String str15, String str16, String str17, SuggestionWordInfo suggestionWordInfo, FeedEnterAwemeInfo feedEnterAwemeInfo, String str18, String str19, String str20, Integer num, String str21, String str22, String str23) throws JSONException {
        String str24;
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("enter_from", str);
        jSONObject.put("entrance_type", str2);
        if (str3 == null) {
            C20235214Fq.LIZ.getClass();
            str3 = C20235214Fq.LIZ();
        }
        jSONObject.put("group_id", str3);
        C20235214Fq.LIZ.getClass();
        jSONObject.put("last_feed_group_id", C20235214Fq.LIZIZ());
        jSONObject.put("search_id", str14);
        jSONObject.put("token_type", str16);
        if (str23 != null) {
            jSONObject.put("unread_cnt", str23);
            LIZJ = str23;
        }
        if (C123100dR.LIZ(str15)) {
            jSONObject.put("search_card_type", str15);
        }
        if (str18 != null && str18.length() > 0) {
            jSONObject.put("panel_impr_id", str18);
        }
        if (str19 != null && str19.length() > 0) {
            jSONObject.put("info_title", str19);
        }
        if (str20 != null && str20.length() > 0) {
            jSONObject.put("info_content", str20);
        }
        if (num != null) {
            jSONObject.put("is_photo", String.valueOf(num.intValue()));
        }
        if (str21 != null && str21.length() > 0) {
            jSONObject.put("enter_action", str21);
        }
        if (str17 != null) {
            jSONObject.put("bubble_impr_id", str17);
        }
        if (str7 != null) {
            jSONObject.put("words_content", str7);
        }
        if (str11 != null && C123100dR.LIZ(str11)) {
            jSONObject.put("extra_flag", str11);
        }
        if (str13 != null) {
            jSONObject.put("standard_ui", str13);
        }
        if (str12 != null) {
            jSONObject.put("customized_info", str12);
        }
        if (suggestionWordInfo != null) {
            jSONObject.put("word_id", suggestionWordInfo.wordId);
            jSONObject.put("impr_id", suggestionWordInfo.imprId);
            String str25 = suggestionWordInfo.recallInfo;
            if (str25 != null) {
                jSONObject.put("recall_info", str25);
            }
            String str26 = suggestionWordInfo.searchIntent;
            if (str26 != null) {
                jSONObject.put("search_intent", str26);
            }
            String str27 = suggestionWordInfo.takoIntent;
            if (str27 != null) {
                jSONObject.put("tako_intent", str27);
            }
        }
        if (feedEnterAwemeInfo != null && (str24 = feedEnterAwemeInfo.awemeType) != null) {
            jSONObject.put("aweme_type", str24);
        }
        if (str22 != null && str22.length() > 0) {
            jSONObject.put("universal_rank", str22);
        }
        if (str4 != null) {
            jSONObject.put("aweme_type", str4);
        }
        if (str5 != null) {
            jSONObject.put("word_id", str5);
        }
        if (str6 != null) {
            jSONObject.put("impr_id", str6);
        }
        if (str8 != null) {
            jSONObject.put("recall_info", str8);
        }
        if (str9 != null) {
            jSONObject.put("search_intent", str9);
        }
        if (str10 != null) {
            jSONObject.put("tako_intent", str10);
        }
        if (map != null) {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                if (entry.getKey().length() > 0 && entry.getValue() != null) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            }
        }
        c20235014FoLIZ.LIZIZ("tikbot_entrance_click", jSONObject);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJJJJIZL(C1862330yYx c1862330yYx, String str, String str2, String str3, String str4, String str5, String str6, String str7, Long l, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, Integer num, Integer num2, Integer num3, Integer num4, String str19, Integer num5, String str20, Integer num6, String str21, Map map, int i) {
        C20235014Fo c20235014FoLIZ;
        String str22 = str19;
        String str23 = str18;
        Map map2 = map;
        String str24 = str17;
        String str25 = str21;
        String str26 = str16;
        String str27 = str15;
        String str28 = str20;
        String str29 = str14;
        if ((i & 16384) != 0) {
            str29 = null;
        }
        if ((32768 & i) != 0) {
            str27 = null;
        }
        if ((65536 & i) != 0) {
            c20235014FoLIZ = C597050NbL.LIZ();
        } else {
            c20235014FoLIZ = 0;
        }
        if ((131072 & i) != 0) {
            str26 = null;
        }
        if ((262144 & i) != 0) {
            str24 = null;
        }
        if ((524288 & i) != 0) {
            str23 = null;
        }
        if ((1048576 & i) != 0) {
            num = null;
        }
        if ((2097152 & i) != 0) {
            num2 = null;
        }
        if ((4194304 & i) != 0) {
            num3 = null;
        }
        if ((8388608 & i) != 0) {
            num4 = null;
        }
        if ((16777216 & i) != 0) {
            str22 = null;
        }
        if ((33554432 & i) != 0) {
            num5 = null;
        }
        if ((67108864 & i) != 0) {
            str28 = null;
        }
        if ((134217728 & i) != 0) {
            num6 = null;
        }
        if ((268435456 & i) != 0) {
            str25 = null;
        }
        if ((i & 536870912) != 0) {
            map2 = null;
        }
        c1862330yYx.getClass();
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("process_id", str4), new Pair("enter_from", str), new Pair("enter_method", str2), new Pair("message_id", str3), new Pair("bot_id", str7), new Pair("search_id", str9), new Pair("card_type", str10), new Pair("card_content_id", str11), new Pair("is_nimble", str12), new Pair("is_mixed_layout", str13));
        if (l != null && l.longValue() > 0) {
            mapLJIIJ.put("action_item_id", String.valueOf(l.longValue()));
        }
        if (str8 != null && C123100dR.LIZ(str8)) {
            mapLJIIJ.put("sub_process_id", str8);
        }
        if (str29 != null && C123100dR.LIZ(str29)) {
            mapLJIIJ.put("card_extra_content", str29);
        }
        if (str27 != null && C123100dR.LIZ(str27)) {
            mapLJIIJ.put("picture_source", str27);
        }
        if (str26 != null && C123100dR.LIZ(str26)) {
            mapLJIIJ.put("situation", str26);
        }
        if (str24 != null && C123100dR.LIZ(str24)) {
            mapLJIIJ.put("card_rank", str24);
        }
        if (str23 != null && str23.length() > 0) {
            mapLJIIJ.put("response_type", str23);
        }
        if (num != null) {
            mapLJIIJ.put("response_rank", String.valueOf(num.intValue()));
        }
        if (str22 != null && C123100dR.LIZ(str22)) {
            mapLJIIJ.put("page", str22);
        }
        if (map2 != null) {
            mapLJIIJ.putAll(map2);
        }
        if (num5 != null) {
            mapLJIIJ.put("aweme_type", String.valueOf(num5.intValue()));
        }
        if (str28 != null && str28.length() > 0) {
            mapLJIIJ.put("item_unique_id", str28);
        }
        if (str5.length() > 0) {
            mapLJIIJ.put("tako_session_id", str5);
        }
        if (str6 != null && str6.length() > 0) {
            mapLJIIJ.put("tako_chat_id", str6);
        }
        if (num2 != null) {
            mapLJIIJ.put("rank", String.valueOf(num2.intValue()));
        }
        if (num3 != null) {
            mapLJIIJ.put("index", String.valueOf(num3.intValue()));
        }
        if (num4 != null) {
            mapLJIIJ.put("words_pos", String.valueOf(num4.intValue()));
        }
        if (num6 != null) {
            mapLJIIJ.put("mix_position", String.valueOf(num6.intValue()));
        }
        if (str25 != null && str25.length() > 0) {
            mapLJIIJ.put("tikbot_trace_id", str25);
        }
        c20235014FoLIZ.LIZ("tikbot_media_card_click", mapLJIIJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJJJJJ(C1862330yYx c1862330yYx, String str, String str2, String str3, String str4, String str5, String str6, String str7, Long l, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, Integer num, Integer num2, Integer num3, Integer num4, String str19, Integer num5, String str20, Integer num6, String str21, Map map, boolean z, int i) {
        C20235014Fo c20235014FoLIZ;
        Set set;
        String str22 = str19;
        String str23 = str18;
        Map map2 = map;
        String str24 = str17;
        String str25 = str21;
        String str26 = str16;
        String str27 = str15;
        String str28 = str20;
        String str29 = str14;
        if ((i & 16384) != 0) {
            str29 = null;
        }
        if ((32768 & i) != 0) {
            str27 = null;
        }
        if ((65536 & i) != 0) {
            c20235014FoLIZ = C597050NbL.LIZ();
        } else {
            c20235014FoLIZ = 0;
        }
        if ((131072 & i) != 0) {
            str26 = null;
        }
        if ((262144 & i) != 0) {
            str24 = null;
        }
        if ((524288 & i) != 0) {
            str23 = null;
        }
        if ((1048576 & i) != 0) {
            num = null;
        }
        if ((2097152 & i) != 0) {
            num2 = null;
        }
        if ((4194304 & i) != 0) {
            num3 = null;
        }
        if ((8388608 & i) != 0) {
            num4 = null;
        }
        if ((16777216 & i) != 0) {
            str22 = null;
        }
        if ((33554432 & i) != 0) {
            num5 = null;
        }
        if ((67108864 & i) != 0) {
            str28 = null;
        }
        if ((134217728 & i) != 0) {
            num6 = null;
        }
        if ((268435456 & i) != 0) {
            str25 = null;
        }
        if ((536870912 & i) != 0) {
            map2 = null;
        }
        if ((i & 1073741824) != 0) {
            z = true;
        }
        c1862330yYx.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str3);
        sbLIZ.append('_');
        sbLIZ.append(str11);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (!Intrinsics.LJFF(str10, "video") && z && C123100dR.LIZ(str11) && (set = (Set) ((LinkedHashMap) LJFF).get(str4)) != null && set.contains(strLIZIZ)) {
            return;
        }
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("process_id", str4), new Pair("enter_from", str), new Pair("enter_method", str2), new Pair("message_id", str3), new Pair("bot_id", str7), new Pair("search_id", str9), new Pair("card_type", str10), new Pair("card_content_id", str11), new Pair("is_nimble", str12), new Pair("is_mixed_layout", str13));
        if (l != null && l.longValue() > 0) {
            mapLJIIJ.put("action_item_id", String.valueOf(l.longValue()));
        }
        if (str8 != null && C123100dR.LIZ(str8)) {
            mapLJIIJ.put("sub_process_id", str8);
        }
        if (str29 != null && C123100dR.LIZ(str29)) {
            mapLJIIJ.put("card_extra_content", str29);
        }
        if (str27 != null && C123100dR.LIZ(str27)) {
            mapLJIIJ.put("picture_source", str27);
        }
        if (str26 != null && C123100dR.LIZ(str26)) {
            mapLJIIJ.put("situation", str26);
        }
        if (str24 != null && C123100dR.LIZ(str24)) {
            mapLJIIJ.put("card_rank", str24);
        }
        if (str23 != null && str23.length() > 0) {
            mapLJIIJ.put("response_type", str23);
        }
        if (num != null) {
            mapLJIIJ.put("response_rank", String.valueOf(num.intValue()));
        }
        if (map2 != null) {
            mapLJIIJ.putAll(map2);
        }
        if (str22 != null && C123100dR.LIZ(str22)) {
            mapLJIIJ.put("page", str22);
        }
        if (num5 != null) {
            mapLJIIJ.put("aweme_type", String.valueOf(num5.intValue()));
        }
        if (str28 != null && str28.length() > 0) {
            mapLJIIJ.put("item_unique_id", str28);
        }
        if (str5.length() > 0) {
            mapLJIIJ.put("tako_session_id", str5);
        }
        if (str6 != null && str6.length() > 0) {
            mapLJIIJ.put("tako_chat_id", str6);
        }
        if (num2 != null) {
            mapLJIIJ.put("rank", String.valueOf(num2.intValue()));
        }
        if (num3 != null) {
            mapLJIIJ.put("index", String.valueOf(num3.intValue()));
        }
        if (num4 != null) {
            mapLJIIJ.put("words_pos", String.valueOf(num4.intValue()));
        }
        if (num6 != null) {
            mapLJIIJ.put("mix_position", String.valueOf(num6.intValue()));
        }
        if (str25 != null && str25.length() > 0) {
            mapLJIIJ.put("tikbot_trace_id", str25);
        }
        if (!Intrinsics.LJFF(str10, "video") && C123100dR.LIZ(str11)) {
            Map<String, Set<String>> map3 = LJFF;
            Set set2 = (Set) ((LinkedHashMap) map3).get(str4);
            if (set2 != null) {
                set2.add(strLIZIZ);
            } else {
                map3.put(str4, C093Y.LJ(strLIZIZ));
            }
        }
        c20235014FoLIZ.LIZ("tikbot_media_card_show", mapLJIIJ);
    }

    public static void LJIJJ(C1862330yYx c1862330yYx, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i2, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i3, String str15, String str16, Long l, String str17, String str18, long j, String str19, Integer num, Map map, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, Integer num2, String str28, String str29, Integer num3, String str30, String str31, String str32, String str33, Integer num4, Integer num5, Integer num6, String str34, Integer num7, String str35, String str36, String str37, int i4) throws JSONException {
        int iIntValue;
        String str38 = str37;
        String str39 = str20;
        String str40 = str29;
        String str41 = str35;
        String str42 = str34;
        String str43 = str36;
        String str44 = str15;
        String str45 = str30;
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        if ((i4 & 16) != 0) {
            num2 = null;
        }
        if ((i4 & 64) != 0) {
            str40 = null;
        }
        if ((i4 & 128) != 0) {
            num3 = null;
        }
        if ((i4 & 256) != 0) {
            str45 = null;
        }
        if ((i4 & 8192) != 0) {
            num4 = null;
        }
        if ((i4 & 16384) != 0) {
            num5 = null;
        }
        if ((32768 & i4) != 0) {
            num6 = null;
        }
        if ((65536 & i4) != 0) {
            str42 = null;
        }
        if ((131072 & i4) != 0) {
            num7 = null;
        }
        if ((262144 & i4) != 0) {
            str41 = null;
        }
        if ((524288 & i4) != 0) {
            str43 = null;
        }
        if ((i4 & 2097152) != 0) {
            str38 = null;
        }
        c1862330yYx.getClass();
        Pair[] pairArr = new Pair[20];
        pairArr[0] = new Pair("enter_method", str2);
        pairArr[1] = new Pair("bot_id", str4);
        pairArr[2] = new Pair("enter_from", str);
        pairArr[3] = new Pair("server_message_id", str12);
        pairArr[4] = new Pair("process_id", str3);
        pairArr[5] = new Pair("search_id", str14);
        pairArr[6] = new Pair("message_content", str6);
        pairArr[7] = new Pair("log_id", str11);
        pairArr[8] = new Pair("message_type", str8);
        pairArr[9] = new Pair("engine_message_type", str9);
        pairArr[10] = new Pair("message_id", str5);
        pairArr[11] = new Pair("id_list", str7);
        pairArr[12] = new Pair("is_quote_product", String.valueOf(i2));
        pairArr[13] = new Pair("is_quote_video", String.valueOf(i));
        pairArr[14] = new Pair("status_code", str10);
        pairArr[15] = new Pair("relative_rank", String.valueOf(i3));
        pairArr[16] = new Pair("query_message_id", str13);
        pairArr[17] = new Pair("is_mixed_layout", str19);
        if (str39.length() == 0) {
            str39 = "default";
        }
        pairArr[18] = new Pair("mode", str39);
        pairArr[19] = new Pair("message_think_content", str26);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (str44 == null) {
            str44 = "";
        }
        mapLJIIJ.put("plugin_type", str44);
        if (C123100dR.LIZ(str16)) {
            mapLJIIJ.put("auto_send_message_type", str16);
        }
        if (l != null) {
            mapLJIIJ.put("sequence", String.valueOf(l.longValue()));
        }
        if (num != null) {
            mapLJIIJ.put("is_mixed_component", String.valueOf(num.intValue()));
        }
        Long lValueOf = Long.valueOf(j);
        if (lValueOf.longValue() > 0) {
            lValueOf.longValue();
            mapLJIIJ.put("action_item_id", String.valueOf(j));
        }
        if (C123100dR.LIZ(str17) && str17 != null) {
            mapLJIIJ.put("sub_process_id", str17);
        }
        if (C123100dR.LIZ(str18) && str18 != null) {
            mapLJIIJ.put("sub_enter_method", str18);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (C123100dR.LIZ((String) entry.getValue())) {
                mapLJIIJ.put(entry.getKey(), entry.getValue());
            }
        }
        if (str21 != null && str21.length() > 0) {
            mapLJIIJ.put("mode_source", str21);
        }
        if (str23 != null && str23.length() > 0) {
            mapLJIIJ.put("tab_id", str23);
        }
        if (str24.length() > 0) {
            mapLJIIJ.put("template_tab", str24);
        }
        if (str22 != null && str22.length() > 0) {
            mapLJIIJ.put("template_id", str22);
        }
        if (str28 != null && str28.length() > 0) {
            mapLJIIJ.put("generate_type", str28);
        }
        if (str40 != null && str40.length() > 0) {
            mapLJIIJ.put("response_type", str40);
        }
        if (num3 != null) {
            mapLJIIJ.put("response_rank", String.valueOf(num3.intValue()));
        }
        if (str45 != null && str45.length() > 0) {
            mapLJIIJ.put("strategy_info", str45);
        }
        if (str25 != null && str25.length() > 0) {
            mapLJIIJ.put("style_name", str25);
        }
        if (str27.length() > 0) {
            mapLJIIJ.put("image_info", str27);
        }
        if (num2 != null) {
            mapLJIIJ.put("pic_cnt", String.valueOf(num2.intValue()));
        }
        if (C123100dR.LIZ(str31) && str31 != null) {
            mapLJIIJ.put("inline_content", str31);
        }
        if (str32.length() > 0) {
            mapLJIIJ.put("tako_session_id", str32);
        }
        if (str33.length() > 0) {
            mapLJIIJ.put("tako_chat_id", str33);
        }
        if (num4 != null) {
            mapLJIIJ.put("product_card_count", String.valueOf(num4.intValue()));
        }
        if (num5 != null) {
            mapLJIIJ.put("video_card_count", String.valueOf(num5.intValue()));
        }
        if (num6 != null) {
            iIntValue = num6.intValue();
        } else {
            iIntValue = 0;
        }
        mapLJIIJ.put("is_regenerate", String.valueOf(iIntValue));
        if (str42 != null && str42.length() > 0) {
            mapLJIIJ.put("regenerate_type", str42);
        }
        if (num7 != null) {
            mapLJIIJ.put("regenerate_round", String.valueOf(num7.intValue()));
        }
        if (str41 != null && str41.length() > 0) {
            mapLJIIJ.put("original_message_id", str41);
        }
        if (str43 != null && str43.length() > 0) {
            mapLJIIJ.put("original_content", str43);
        }
        JSONObject jSONObject = new JSONObject(mapLJIIJ);
        LJJIII(LIZ, jSONObject, str38, str22, str28, null);
        c20235014FoLIZ.LIZIZ("tikbot_receive_message_background", jSONObject);
    }

    public static void LJIJI(C1862330yYx c1862330yYx, String str, String str2, String str3, String str4, long j, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, int i2, String str12, String str13, boolean z, Long l, String str14, String str15, int i3, String str16, Long l2, C1862900yZs c1862900yZs, String str17, Integer num, Map map, String str18, String str19, String str20, String str21, Integer num2, String str22, String str23, String str24, String str25, Integer num3, String str26, C1862650yZT c1862650yZT, String str27, String str28, String str29, String str30, String str31, String str32, String str33, Integer num4, String str34, String str35, String str36, String str37, Integer num5, Integer num6, String str38, int i4) throws JSONException {
        String str39 = str4;
        String str40 = str38;
        String str41 = str22;
        String str42 = str16;
        String str43 = str33;
        String str44 = str34;
        String str45 = str26;
        String str46 = str18;
        C1862650yZT c1862650yZT2 = c1862650yZT;
        String str47 = str23;
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        if ((i4 & 4) != 0) {
            str47 = null;
        }
        if ((i4 & 64) != 0) {
            str45 = null;
        }
        if ((i4 & 128) != 0) {
            c1862650yZT2 = null;
        }
        if ((i4 & 16384) != 0) {
            str43 = null;
        }
        if ((32768 & i4) != 0) {
            num4 = null;
        }
        if ((65536 & i4) != 0) {
            str44 = null;
        }
        if ((2097152 & i4) != 0) {
            num5 = null;
        }
        if ((4194304 & i4) != 0) {
            num6 = null;
        }
        if ((i4 & 16777216) != 0) {
            str40 = null;
        }
        c1862330yYx.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("enter_from", str);
        jSONObject.put("enter_method", str2);
        jSONObject.put("process_id", str3);
        jSONObject.put("query_message_id", str6);
        jSONObject.put("message_id", str7);
        jSONObject.put("message_content", str8);
        jSONObject.put("message_type", str9);
        jSONObject.put("engine_message_type", str10);
        jSONObject.put("id_list", str11);
        jSONObject.put("is_quote_video", i);
        jSONObject.put("is_quote_product", i2);
        jSONObject.put("status_code", str12);
        jSONObject.put("bot_id", str5);
        jSONObject.put("search_id", str15);
        jSONObject.put("relative_rank", i3);
        jSONObject.put("is_mixed_layout", str17);
        if (str46.length() == 0) {
            str46 = "default";
        }
        jSONObject.put("mode", str46);
        jSONObject.put("message_think_content", str19);
        if (C123100dR.LIZ(str14)) {
            jSONObject.put("auto_send_message_type", str14);
        }
        if (z && a0.LJJJIL(str6)) {
            jSONObject.put("query_message_id", "none");
        }
        if (str42 == null) {
            str42 = "";
        }
        jSONObject.put("plugin_type", str42);
        if (C123100dR.LIZ(str13)) {
            jSONObject.put("log_id", str13);
        }
        if (l != null) {
            jSONObject.put("sequence", String.valueOf(l.longValue()));
        }
        Long lValueOf = Long.valueOf(j);
        if (lValueOf.longValue() > 0) {
            lValueOf.longValue();
            jSONObject.put("action_item_id", String.valueOf(j));
        }
        if (!C123100dR.LIZ(str39)) {
            str39 = null;
        }
        if (str39 != null) {
            jSONObject.put("sub_process_id", str39);
        }
        if (l2 != null) {
            jSONObject.put("show_time_stamp", String.valueOf(l2.longValue()));
        }
        if (c1862900yZs != null) {
            jSONObject.put("sub_process_id", c1862900yZs.LIZ);
            jSONObject.put("sub_enter_method", c1862900yZs.LIZIZ);
        }
        if (num2 != null) {
            jSONObject.put("regenerate_round", String.valueOf(num2.intValue()));
        }
        if (str41 == null || str41.length() <= 0) {
            str41 = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject.put("is_regenerate", str41);
        if (str47 != null && str47.length() > 0) {
            jSONObject.put("regenerate_type", str47);
        }
        if (str20 != null && str20.length() > 0) {
            jSONObject.put("original_message_id", str20);
        }
        if (str21 != null && str21.length() > 0) {
            jSONObject.put("original_content", str21);
        }
        if (str24 != null && str24.length() > 0) {
            jSONObject.put("sub_mode", str24);
        }
        if (num != null) {
            jSONObject.put("is_mixed_component", String.valueOf(num.intValue()));
        }
        if (str27 != null && str27.length() > 0) {
            jSONObject.put("mode_source", str27);
        }
        if (str28 != null && str28.length() > 0) {
            jSONObject.put("template_id", str28);
        }
        if (str29 != null && str29.length() > 0) {
            jSONObject.put("tab_id", str29);
        }
        if (str30 != null && str30.length() > 0) {
            jSONObject.put("template_tab", str30);
        }
        if (str32 != null && str32.length() > 0) {
            jSONObject.put("generate_type", str32);
        }
        if (str43 != null && str43.length() > 0) {
            jSONObject.put("response_type", str43);
        }
        if (num4 != null) {
            jSONObject.put("response_rank", String.valueOf(num4.intValue()));
        }
        if (str44 != null && str44.length() > 0) {
            jSONObject.put("strategy_info", str44);
        }
        if (str31 != null && str31.length() > 0) {
            jSONObject.put("style_name", str31);
        }
        if (str45 != null && str45.length() > 0) {
            jSONObject.put("list_result_type", str45);
        }
        if (C123100dR.LIZ(str25)) {
            jSONObject.put("image_info", str25);
        }
        if (num3 != null) {
            jSONObject.put("pic_cnt", String.valueOf(num3.intValue()));
        }
        C1862330yYx c1862330yYx2 = LIZ;
        c1862330yYx2.getClass();
        LLII(jSONObject, map);
        if (c1862650yZT2 != null) {
            String str48 = c1862650yZT2.LIZLLL;
            if (str48.length() > 0) {
                jSONObject.put("push_id", str48);
            }
            jSONObject.put("push_send_time", String.valueOf(c1862650yZT2.LIZ));
            if (C123100dR.LIZ(c1862650yZT2.LIZIZ)) {
                jSONObject.put("push_source", c1862650yZT2.LIZIZ);
            }
            jSONObject.put("push_receive_time", String.valueOf(c1862650yZT2.LIZJ));
            LLII(jSONObject, c1862650yZT2.LJ);
        }
        C20235214Fq.LIZ.getClass();
        String strLIZJ = C20235214Fq.LIZJ(str3);
        if (strLIZJ != null && (!a0.LJJJIL(strLIZJ))) {
            jSONObject.put("group_id", strLIZJ);
        }
        String strLIZLLL = C20235214Fq.LIZLLL(str3);
        if (strLIZLLL != null && (!a0.LJJJIL(strLIZLLL))) {
            jSONObject.put("last_feed_group_id", strLIZLLL);
        }
        if (C123100dR.LIZ(str35) && str35 != null) {
            jSONObject.put("inline_content", str35);
        }
        if (str36.length() > 0) {
            jSONObject.put("tako_session_id", str36);
        }
        if (str37.length() > 0) {
            jSONObject.put("tako_chat_id", str37);
        }
        if (num5 != null) {
            jSONObject.put("product_card_count", num5.intValue());
        }
        if (num6 != null) {
            jSONObject.put("video_card_count", num6.intValue());
        }
        LJJIII(c1862330yYx2, jSONObject, str40, str28, str32, null);
        c20235014FoLIZ.LIZIZ("tikbot_receive_message", jSONObject);
    }
}
