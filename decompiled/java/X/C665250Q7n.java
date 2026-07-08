package X;

import Y.ARunnableS109S0100000_9;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Q7n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C665250Q7n {
    public static long LIZIZ;
    public static Long LIZLLL;
    public static final C665250Q7n LIZ = new C665250Q7n();
    public static String LIZJ = "";

    public static void LIZJ(String str, int i, int i2, String str2, SearchResultParam searchResultParam, Boolean bool, Boolean bool2) {
        String enterSearchFrom;
        C0QER searchEnterParam;
        if (((Boolean) C286130BJj.LIZIZ.getValue()).booleanValue()) {
            if (Intrinsics.LJFF("start", str) || (i == 1 && Intrinsics.LJFF("create", str) && Intrinsics.LJFF(str2, "root"))) {
                LIZJ = UUID.randomUUID().toString();
                LIZIZ = System.currentTimeMillis();
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - LIZIZ;
            final JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", str);
            if (LIZIZ != 0) {
                jSONObject.put("cost", jCurrentTimeMillis);
            }
            jSONObject.put("session_id", LIZJ);
            Boolean bool3 = Boolean.TRUE;
            jSONObject.put("request_end", Intrinsics.LJFF(bool, bool3) ? 1 : 0);
            jSONObject.put("draw_end", Intrinsics.LJFF(bool2, bool3) ? 1 : 0);
            jSONObject.put("is_recreate", i);
            String enterMethod = null;
            if (searchResultParam != null && (searchEnterParam = searchResultParam.getSearchEnterParam()) != null) {
                enterSearchFrom = searchEnterParam.getEnterSearchFrom();
            } else {
                enterSearchFrom = null;
            }
            jSONObject.put("enter_from", enterSearchFrom);
            if (searchResultParam != null) {
                enterMethod = searchResultParam.getEnterMethod();
            }
            jSONObject.put("enter_method", enterMethod);
            jSONObject.put("fragment", str2);
            jSONObject.put("is_search_activity", i2);
            C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.0N5j
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SearchRootMobUtils@15ba.mobForDebug$1");
                    try {
                        AppLogNewUtils.onEventV3("search_debug_monitor", jSONObject);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SearchRootMobUtils@15ba.mobForDebug$1");
                }
            });
            if (Intrinsics.LJFF("destroy", str) && Intrinsics.LJFF(str2, "root")) {
                LIZJ = "";
                LIZIZ = 0L;
            }
        }
    }

    public static void LIZ(String str, int i, int i2, int i3, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Long l) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", str);
        jSONObject.put("is_recreate", i);
        jSONObject.put("has_create", i2);
        jSONObject.put("is_search_activity", i3);
        if (bool != null) {
            jSONObject.put("is_fragment_finish", bool.booleanValue());
        }
        if (bool2 != null) {
            jSONObject.put("is_activity_finish", bool2.booleanValue());
        }
        if (bool3 != null) {
            jSONObject.put("is_current_top_activity", bool3.booleanValue());
        }
        if (bool4 != null) {
            jSONObject.put("on_back_pressed_destroy", bool4.booleanValue());
        }
        if (bool5 != null) {
            jSONObject.put("is_active_finish", bool5.booleanValue());
        }
        if (((Boolean) C07ES.LIZIZ.getValue()).booleanValue()) {
            Long l2 = LIZLLL;
            if (l2 != null) {
                long jLongValue = l2.longValue();
                if (Intrinsics.LJFF(str, "onResume")) {
                    jSONObject.put("cost_before_onResume", String.valueOf(System.currentTimeMillis() - jLongValue));
                    LIZLLL = null;
                }
            }
            if (l != null) {
                l.longValue();
                jSONObject.put("has_user_change_theme", true);
                jSONObject.put("cost_before_destroy", String.valueOf(System.currentTimeMillis() - l.longValue()));
                LIZLLL = l;
            } else {
                jSONObject.put("has_user_change_theme", false);
            }
        }
        C823050WQl.LIZLLL().execute(new ARunnableS109S0100000_9(jSONObject, 134));
    }
}
