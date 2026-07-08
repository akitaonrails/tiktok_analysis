package X;

import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.tiktok.location_api.service.experiment.PoiReviewFrequencyControl;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0h6S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1191180h6S {
    public static final C1191180h6S LIZ = new C1191180h6S();

    public static void LIZ(String str, Map map) {
        Object objOpt;
        if (C123100dR.LIZ(str) && str != null) {
            map.put("collect_info", str);
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (C123100dR.LIZ(next) && (objOpt = jSONObject.opt(next)) != null) {
                        map.put(next, objOpt.toString());
                    }
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public static void LIZIZ(String str, String str2, String str3, String str4, String str5, String str6, int i, Integer num, Integer num2, String str7, PageFinder pageFinder) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            linkedHashMap.put("enter_from", str);
        }
        linkedHashMap.put("enter_method", str2);
        if (str3 != null) {
            linkedHashMap.put("poi_id", str3);
            PoiReviewFrequencyControl.LIZ.getClass();
            long jLJIIIIZZ = PoiReviewFrequencyControl.LJIIIIZZ(str3);
            int iLJIIIZ = PoiReviewFrequencyControl.LJIIIZ(str3);
            linkedHashMap.put("show_index", String.valueOf(jLJIIIIZZ));
            linkedHashMap.put("time_int", String.valueOf(iLJIIIZ));
        }
        if (str4 != null) {
            linkedHashMap.put("group_id", str4);
        }
        if (str5 != null) {
            linkedHashMap.put("author_id", str5);
        }
        if (str6 != null) {
            LIZ.getClass();
            LIZ(str6, linkedHashMap);
        }
        if (num != null) {
            linkedHashMap.put("user_show_cnt_7d", String.valueOf(num.intValue()));
        }
        if (num2 != null) {
            linkedHashMap.put("user_show_cnt_1d", String.valueOf(num2.intValue()));
        }
        linkedHashMap.put("is_enter", String.valueOf(i));
        if (str7 != null) {
            linkedHashMap.put("incentive_type", str7);
        }
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("poi_review_post_entrance_click", linkedHashMap, c1185050gwZ);
    }
}
