package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.monitorV2.debug.MonitorDebugTool;
import com.bytedance.android.monitorV2.hybridSetting.entity.BidInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import kotlin.text.Regex;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pg0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1520740pg0 {
    public static int LIZIZ(String str) {
        if (MonitorDebugTool.isSampleOff()) {
            return 1;
        }
        C1520380pfQ.LIZ.getClass();
        Map<String, Integer> mapLJII = C1520380pfQ.LIZJ().LJII();
        if (!mapLJII.containsKey(str)) {
            return -1;
        }
        return mapLJII.get(str).intValue();
    }

    public static C1520760pg2 LIZLLL(String str) {
        long jOptLong;
        C1520760pg2 c1520760pg2 = new C1520760pg2();
        try {
            JSONObject jSONObjectOptJSONObject = C1520640pfq.LJIILL(str).optJSONObject("data");
            long jOptLong2 = 0;
            if (jSONObjectOptJSONObject != null) {
                jSONObjectOptJSONObject.optLong("update_time", 0L);
            }
            c1520760pg2.LIZIZ = C1520640pfq.LJFF("duration", jSONObjectOptJSONObject);
            if (jSONObjectOptJSONObject == null) {
                jOptLong = 0;
            } else {
                jOptLong = jSONObjectOptJSONObject.optLong("setting_id", 0L);
            }
            c1520760pg2.LIZJ = jOptLong;
            if (jSONObjectOptJSONObject != null) {
                jOptLong2 = jSONObjectOptJSONObject.optLong("enable_switch", 0L);
            }
            EnumC1521240pgo.resetAll(jOptLong2);
            c1520760pg2.LIZLLL = LJII(C1520640pfq.LJII("all_event_sample", jSONObjectOptJSONObject));
            JSONArray jSONArrayLJI = C1520640pfq.LJI("host_list", jSONObjectOptJSONObject);
            HashSet hashSet = new HashSet();
            if (jSONArrayLJI != null) {
                try {
                    if (jSONArrayLJI.length() > 0) {
                        for (int i = 0; i < jSONArrayLJI.length(); i++) {
                            hashSet.add(jSONArrayLJI.optString(i));
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1520960pgM.LIZIZ(th);
                }
            }
            c1520760pg2.LJ = hashSet;
            LJI(C1520640pfq.LJII("check_filter", jSONObjectOptJSONObject));
            return c1520760pg2;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C1520960pgM.LIZ("startup_handle", th2);
            return c1520760pg2;
        }
    }

    public static C1520760pg2 LJ(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1520760pg2 c1520760pg2 = new C1520760pg2();
        try {
            JSONObject jSONObjectOptJSONObject = C1520640pfq.LJIILL(str).optJSONObject("data");
            JSONObject jSONObjectLJII = C1520640pfq.LJII("bid_info", jSONObjectOptJSONObject);
            long jOptLong = 0;
            if (jSONObjectOptJSONObject != null) {
                jOptLong = jSONObjectOptJSONObject.optLong("setting_id", 0L);
            }
            c1520760pg2.LIZ = LJFF(jSONObjectLJII, jOptLong);
            HashMap map = new HashMap();
            map.put("bid_count", Long.valueOf(((HashMap) c1520760pg2.LIZ.LIZ).size()));
            map.put("regex_count", Long.valueOf(((ArrayList) c1520760pg2.LIZ.LIZIZ).size()));
            map.put("setting_parse_time", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            C2119208Ry.LIZIZ(null, "setting_parse_perf", null, map);
            return c1520760pg2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1520960pgM.LIZ("startup_handle", th);
            return c1520760pg2;
        }
    }

    public static void LJI(JSONObject jSONObject) {
        new C1188604ku();
        try {
            JSONObject jSONObjectLJII = C1520640pfq.LJII("filter", jSONObject);
            HashMap map = new HashMap();
            for (String str : InterfaceC843630X7p.LIZ) {
                map.put(str, C1520640pfq.LIZIZ(C1520640pfq.LJI(str, jSONObjectLJII)));
            }
            C1520640pfq.LIZIZ(C1520640pfq.LJI("category", jSONObject));
            C1520640pfq.LJIIJ(FollowStatusChangeMethod.PARAM_UID, jSONObject);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1520960pgM.LIZIZ(th);
        }
    }

    public static Map<String, Integer> LJII(JSONObject jSONObject) {
        HashMap map = new HashMap();
        if (jSONObject == null) {
            return map;
        }
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, Integer.valueOf(C1520640pfq.LJFF(next, jSONObject)));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1520960pgM.LIZ("startup_handle", th);
        }
        return map;
    }

    public static void LIZ(BidInfo.BidConfig bidConfig, long j) {
        int i = 0;
        do {
            if (i != 0) {
                j >>= 1;
            }
            if (j % 2 == 1) {
                switch (i) {
                    case 0:
                        bidConfig.custom_p0 = true;
                        break;
                    case 1:
                        bidConfig.custom_p1 = true;
                        break;
                    case 2:
                        bidConfig.custom_p2 = true;
                        break;
                    case 3:
                        bidConfig.custom_p3 = true;
                        break;
                    case 4:
                        bidConfig.custom_p4 = true;
                        break;
                    case 5:
                        bidConfig.custom_p5 = true;
                        break;
                    case 6:
                        bidConfig.custom_p6 = true;
                        break;
                    case 7:
                        bidConfig.custom_p7 = true;
                        break;
                    case 8:
                        bidConfig.custom_p8 = true;
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        bidConfig.perf_web = true;
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        bidConfig.ajax_web = true;
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        bidConfig.static_perf_web = true;
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        bidConfig.static_error_web = true;
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        bidConfig.js_exception_web = true;
                        break;
                    case 14:
                        bidConfig.blank_web = true;
                        break;
                    case 15:
                        bidConfig.fetch_error_web = true;
                        break;
                    case 16:
                        bidConfig.jsb_error_web = true;
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        bidConfig.jsb_perf_web = true;
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        bidConfig.falcon_perf_web = true;
                        break;
                    case 19:
                        bidConfig.native_error_web = true;
                        break;
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                        bidConfig.navigation_start_web = true;
                        break;
                    case 21:
                        bidConfig.static_sri_web = true;
                        break;
                    case 22:
                        bidConfig.performance_lynx = true;
                        break;
                    case 23:
                        bidConfig.blank_lynx = true;
                        break;
                    case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                        bidConfig.fetch_error_lynx = true;
                        break;
                    case 25:
                        bidConfig.jsb_error_lynx = true;
                        break;
                    case 26:
                        bidConfig.jsb_perf_lynx = true;
                        break;
                    case 27:
                        bidConfig.native_error_lynx = true;
                        break;
                    case 28:
                        bidConfig.navigation_start_lynx = true;
                        break;
                    case 29:
                        bidConfig.performance_reactnative = true;
                        break;
                    case 30:
                        bidConfig.blank_reactnative = true;
                        break;
                    case 31:
                        bidConfig.fetch_error_reactnative = true;
                        break;
                    case 32:
                        bidConfig.jsb_error_reactnative = true;
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                        bidConfig.native_error_reactnative = true;
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                        bidConfig.container_error = true;
                        break;
                    case 35:
                        bidConfig.js_exception_lynx = true;
                        break;
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                        bidConfig.static_error_lynx = true;
                        break;
                    case 37:
                        bidConfig.tea_switch = true;
                        break;
                    case 38:
                        bidConfig.res_loader_perf_web = true;
                        break;
                    case 39:
                        bidConfig.res_loader_perf_template_web = true;
                        break;
                    case 40:
                        bidConfig.res_loader_error_web = true;
                        break;
                    case 41:
                        bidConfig.res_loader_error_template_web = true;
                        break;
                    case 42:
                        bidConfig.res_loader_perf_lynx = true;
                        break;
                    case 43:
                        bidConfig.res_loader_perf_template_lynx = true;
                        break;
                    case 44:
                        bidConfig.res_loader_error_lynx = true;
                        break;
                    case 45:
                        bidConfig.res_loader_error_template_lynx = true;
                        return;
                }
            }
            i++;
        } while (i < 46);
    }

    public static int LIZJ(String str, String str2) {
        if (MonitorDebugTool.isSampleOff()) {
            return 1;
        }
        C1520380pfQ.LIZ.getClass();
        Map<String, Integer> map = C1520380pfQ.LIZJ().LJIIIIZZ().LIZ(str).eventNameSample;
        if (!map.containsKey(str2)) {
            return -1;
        }
        return map.get(str2).intValue();
    }

    public static BidInfo LJFF(JSONObject jSONObject, long j) {
        BidInfo bidInfo = new BidInfo();
        if (jSONObject == null) {
            return bidInfo;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            try {
                String next = itKeys.next();
                JSONObject jSONObjectLJII = C1520640pfq.LJII(next, jSONObject);
                long jOptLong = 0;
                if (jSONObjectLJII != null) {
                    jOptLong = jSONObjectLJII.optLong("hit_sample", 0L);
                }
                BidInfo.BidConfig bidConfig = new BidInfo.BidConfig(next);
                bidConfig.hitSample = jOptLong;
                bidConfig.settingId = j;
                bidConfig.eventNameSample = LJII(C1520640pfq.LJII("event_name_sample", jSONObjectLJII));
                Map<String, BidInfo.BidConfig> map = bidInfo.LIZ;
                LIZ(bidConfig, jOptLong);
                ((HashMap) map).put(next, bidConfig);
                JSONArray jSONArrayOptJSONArray = jSONObjectLJII.optJSONArray("regex_list");
                if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        try {
                            ((ArrayList) bidInfo.LIZIZ).add(new C1520780pg4(next, new Regex(jSONArrayOptJSONArray.optString(i))));
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C1520960pgM.LIZ("startup_handle", th);
                        }
                    }
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C1520960pgM.LIZ("startup_handle", th2);
            }
        }
        Collections.sort(bidInfo.LIZIZ);
        return bidInfo;
    }
}
