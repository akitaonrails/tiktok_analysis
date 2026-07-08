package X;

import Y.ARunnableS134S0100000_34;
import Y.ARunnableS15S2100000_34;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BJL, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BJL {
    public static final C1BJL LIZ = new C1BJL();
    public static final List<String> LIZIZ = C1697810uHb.LJIIJJI("supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules", "suggested_events_setting", "protected_mode_rules", "auto_log_app_events_default", "auto_log_app_events_enabled");
    public static final Map<String, C1BJK> LIZJ = new ConcurrentHashMap();
    public static final AtomicReference<C1BJQ> LIZLLL = new AtomicReference<>(C1BJQ.NOT_LOADED);
    public static final ConcurrentLinkedQueue<C1BK2> LJ = new ConcurrentLinkedQueue<>();
    public static boolean LJFF;

    public final synchronized void LJFF() {
        C1BJQ c1bjq = LIZLLL.get();
        if (C1BJQ.NOT_LOADED == c1bjq || C1BJQ.LOADING == c1bjq) {
            return;
        }
        C1BJK c1bjk = (C1BJK) ((ConcurrentHashMap) LIZJ).get(FacebookSdk.LIZLLL());
        BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
        if (C1BJQ.ERROR == c1bjq) {
            while (true) {
                ConcurrentLinkedQueue<C1BK2> concurrentLinkedQueue = LJ;
                if (concurrentLinkedQueue.isEmpty()) {
                    return;
                } else {
                    C786410Ut5.LJJZZIII(bPEAHandler, new ARunnableS134S0100000_34(concurrentLinkedQueue.poll(), 72));
                }
            }
        } else {
            while (true) {
                ConcurrentLinkedQueue<C1BK2> concurrentLinkedQueue2 = LJ;
                if (concurrentLinkedQueue2.isEmpty()) {
                    return;
                } else {
                    C786410Ut5.LJJZZIII(bPEAHandler, new ARunnableS134S0100000_34(concurrentLinkedQueue2.poll(), c1bjk, 73));
                }
            }
        }
    }

    public static JSONObject LIZ() {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(LIZIZ);
        C786410Ut5.LJJJI("fields", TextUtils.join(",", arrayList), bundle);
        String str = GraphRequest.LJIIIIZZ;
        GraphRequest graphRequestLJFF = C1BJA.LJFF(null, "app", null);
        graphRequestLJFF.LJII = true;
        graphRequestLJFF.LIZLLL = bundle;
        JSONObject jSONObject = graphRequestLJFF.LIZJ().LIZLLL;
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    public static final Map<String, Boolean> LIZIZ() {
        JSONObject jSONObject;
        String string = C810670Vr7.LIZJ(FacebookSdk.LIZJ(), 0, "com.facebook.internal.preferences.APP_SETTINGS").getString(C786410Ut5.j4("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[]{FacebookSdk.LIZLLL()}, 1)), null);
        if (!C0W7Q.LJIILL(string)) {
            if (string == null) {
                "Required value was null.".toString();
                throw new IllegalStateException("Required value was null.");
            }
            try {
                jSONObject = new JSONObject(string);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                jSONObject = null;
            }
            if (jSONObject != null) {
                LIZ.getClass();
                return LJ(jSONObject);
            }
        }
        return null;
    }

    public static final void LIZJ() {
        Context contextLIZJ = FacebookSdk.LIZJ();
        String strLIZLLL = FacebookSdk.LIZLLL();
        if (C0W7Q.LJIILL(strLIZLLL)) {
            LIZLLL.set(C1BJQ.ERROR);
            LIZ.LJFF();
            return;
        }
        if (((ConcurrentHashMap) LIZJ).containsKey(strLIZLLL)) {
            LIZLLL.set(C1BJQ.SUCCESS);
            LIZ.LJFF();
            return;
        }
        AtomicReference<C1BJQ> atomicReference = LIZLLL;
        C1BJQ c1bjq = C1BJQ.NOT_LOADED;
        C1BJQ c1bjq2 = C1BJQ.LOADING;
        while (true) {
            if (atomicReference.compareAndSet(c1bjq, c1bjq2)) {
                break;
            }
            if (atomicReference.get() != c1bjq) {
                AtomicReference<C1BJQ> atomicReference2 = LIZLLL;
                C1BJQ c1bjq3 = C1BJQ.ERROR;
                C1BJQ c1bjq4 = C1BJQ.LOADING;
                while (!atomicReference2.compareAndSet(c1bjq3, c1bjq4)) {
                    if (atomicReference2.get() != c1bjq3) {
                        LIZ.LJFF();
                        return;
                    }
                }
            }
        }
        FacebookSdk.LJ().execute(new ARunnableS15S2100000_34(contextLIZJ, C786410Ut5.j4("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[]{strLIZLLL}, 1)), strLIZLLL, 2));
    }

    public static Map LJ(JSONObject jSONObject) {
        HashMap map = new HashMap();
        if (!jSONObject.isNull("auto_log_app_events_default")) {
            try {
                map.put("auto_log_app_events_default", Boolean.valueOf(jSONObject.getBoolean("auto_log_app_events_default")));
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (!jSONObject.isNull("auto_log_app_events_enabled")) {
            try {
                map.put("auto_log_app_events_enabled", Boolean.valueOf(jSONObject.getBoolean("auto_log_app_events_enabled")));
            } catch (JSONException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        if (map.isEmpty()) {
            return null;
        }
        return map;
    }

    public static final C1BJK LJI(String str) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZJ;
        if (concurrentHashMap.containsKey(str)) {
            return (C1BJK) concurrentHashMap.get(str);
        }
        C1BJL c1bjl = LIZ;
        c1bjl.getClass();
        C1BJK c1bjkLIZLLL = LIZLLL(str, LIZ());
        if (Intrinsics.LJFF(str, FacebookSdk.LIZLLL())) {
            LIZLLL.set(C1BJQ.SUCCESS);
            c1bjl.LJFF();
        }
        return c1bjkLIZLLL;
    }

    public static C1BJK LIZLLL(String str, JSONObject jSONObject) {
        Map mapLIZJ;
        Map mapLIZJ2;
        Map mapLIZJ3;
        String strOptString;
        String strOptString2;
        String strOptString3;
        C1489030oqr c1489030oqr;
        String strOptString4;
        boolean z;
        JSONArray jSONArrayOptJSONArray;
        int length;
        int length2;
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("android_sdk_error_categories");
        boolean z2 = true;
        String str2 = null;
        if (jSONArrayOptJSONArray2 == null) {
            c1489030oqr = C1489030oqr.LJI.LIZ();
        } else {
            int length3 = jSONArrayOptJSONArray2.length();
            if (length3 > 0) {
                mapLIZJ = null;
                mapLIZJ2 = null;
                mapLIZJ3 = null;
                strOptString2 = null;
                strOptString3 = null;
                strOptString = null;
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray2.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null && (strOptString4 = jSONObjectOptJSONObject.optString("name")) != null) {
                        if (u.LJIJI(strOptString4, "other", z2)) {
                            strOptString = jSONObjectOptJSONObject.optString("recovery_message", str2);
                            mapLIZJ = C1489020oqq.LIZJ(jSONObjectOptJSONObject);
                        } else if (u.LJIJI(strOptString4, "transient", true)) {
                            strOptString2 = jSONObjectOptJSONObject.optString("recovery_message", null);
                            mapLIZJ2 = C1489020oqq.LIZJ(jSONObjectOptJSONObject);
                        } else if (u.LJIJI(strOptString4, "login_recoverable", true)) {
                            strOptString3 = jSONObjectOptJSONObject.optString("recovery_message", null);
                            mapLIZJ3 = C1489020oqq.LIZJ(jSONObjectOptJSONObject);
                        }
                    }
                    if (i2 >= length3) {
                        break;
                    }
                    z2 = true;
                    i = i2;
                    str2 = null;
                }
            } else {
                mapLIZJ = null;
                mapLIZJ2 = null;
                mapLIZJ3 = null;
                strOptString = null;
                strOptString2 = null;
                strOptString3 = null;
            }
            c1489030oqr = new C1489030oqr(mapLIZJ, mapLIZJ2, mapLIZJ3, strOptString, strOptString2, strOptString3);
        }
        if ((jSONObject.optInt("app_events_feature_bitmask", 0) & 32) != 0) {
            z = true;
        } else {
            z = false;
        }
        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("auto_event_mapping_android");
        if (jSONArrayOptJSONArray3 != null && Intrinsics.LJFF(null, Boolean.TRUE)) {
            jSONArrayOptJSONArray3.toString();
        }
        jSONObject.optBoolean("supports_implicit_sdk_logging", false);
        String strOptString5 = jSONObject.optString("gdpv4_nux_content", "");
        boolean zOptBoolean = jSONObject.optBoolean("gdpv4_nux_enabled", false);
        jSONObject.optInt("app_events_session_timeout", 60);
        C1BJW c1bjw = C1BJP.Companion;
        long jOptLong = jSONObject.optLong("seamless_login");
        c1bjw.getClass();
        EnumSet enumSetLIZ = C1BJW.LIZ(jOptLong);
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("android_dialog_configs");
        HashMap map = new HashMap();
        if (jSONObjectOptJSONObject2 != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("data")) != null && (length = jSONArrayOptJSONArray.length()) > 0) {
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray.optJSONObject(i3);
                String strOptString6 = jSONObjectOptJSONObject3.optString("name");
                if (!C0W7Q.LJIILL(strOptString6)) {
                    List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(strOptString6, new String[]{"|"}, 0, 6);
                    if (listLJJLIIIJILLIZJL.size() == 2) {
                        String str3 = (String) C13LP.LJJJJZI(listLJJLIIIJILLIZJL);
                        String str4 = (String) C13LP.LJJLIIIJJI(listLJJLIIIJILLIZJL);
                        if (!C0W7Q.LJIILL(str3) && !C0W7Q.LJIILL(str4)) {
                            String strOptString7 = jSONObjectOptJSONObject3.optString("url");
                            if (!C0W7Q.LJIILL(strOptString7)) {
                                Uri.parse(strOptString7);
                            }
                            JSONArray jSONArrayOptJSONArray4 = jSONObjectOptJSONObject3.optJSONArray("versions");
                            if (jSONArrayOptJSONArray4 != null && (length2 = jSONArrayOptJSONArray4.length()) > 0) {
                                int i5 = 0;
                                while (true) {
                                    int i6 = i5 + 1;
                                    if (jSONArrayOptJSONArray4.optInt(i5, -1) == -1) {
                                        String strOptString8 = jSONArrayOptJSONArray4.optString(i5);
                                        if (!C0W7Q.LJIILL(strOptString8)) {
                                            try {
                                                Integer.parseInt(strOptString8);
                                            } catch (NumberFormatException e) {
                                                TryCatchGuardChecker.doCheck(e);
                                            }
                                        }
                                    }
                                    if (i6 >= length2) {
                                        break;
                                    }
                                    i5 = i6;
                                }
                            }
                            C2202891BJn c2202891BJn = new C2202891BJn(str3, str4);
                            String str5 = c2202891BJn.LIZ;
                            Map map2 = (Map) map.get(str5);
                            if (map2 == null) {
                                map2 = new HashMap();
                                map.put(str5, map2);
                            }
                            map2.put(c2202891BJn.LIZIZ, c2202891BJn);
                        }
                    }
                }
                if (i4 >= length) {
                    break;
                }
                i3 = i4;
            }
        }
        jSONObject.optString("smart_login_bookmark_icon_url");
        jSONObject.optString("smart_login_menu_icon_url");
        String strOptString9 = jSONObject.optString("sdk_update_message");
        jSONObject.optString("aam_rules");
        jSONObject.optString("suggested_events_setting");
        jSONObject.optString("restrictive_data_filter_params");
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("protected_mode_rules");
        if (jSONObjectOptJSONObject4 != null) {
            jSONObjectOptJSONObject4.optJSONArray("standard_params");
        }
        JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("protected_mode_rules");
        if (jSONObjectOptJSONObject5 != null) {
            jSONObjectOptJSONObject5.optJSONArray("maca_rules");
        }
        Map mapLJ = LJ(jSONObject);
        JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("protected_mode_rules");
        if (jSONObjectOptJSONObject6 != null) {
            jSONObjectOptJSONObject6.optJSONArray("blocklist_events");
        }
        JSONObject jSONObjectOptJSONObject7 = jSONObject.optJSONObject("protected_mode_rules");
        if (jSONObjectOptJSONObject7 != null) {
            jSONObjectOptJSONObject7.optJSONArray("redacted_events");
        }
        JSONObject jSONObjectOptJSONObject8 = jSONObject.optJSONObject("protected_mode_rules");
        if (jSONObjectOptJSONObject8 != null) {
            jSONObjectOptJSONObject8.optJSONArray("sensitive_params");
        }
        C1BJK c1bjk = new C1BJK(strOptString5, zOptBoolean, enumSetLIZ, map, c1489030oqr, z, strOptString9, mapLJ);
        ((ConcurrentHashMap) LIZJ).put(str, c1bjk);
        return c1bjk;
    }
}
