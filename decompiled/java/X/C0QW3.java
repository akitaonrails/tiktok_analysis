package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0QW3, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QW3 {
    public static final void LIZ(String str) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
            linkedHashMap.put("enter_from", "seven_tenths_search_screen");
            linkedHashMap.put("search_entrance", str);
            linkedHashMap.put("previous_page", str);
            C1018703yb.LIZIZ("tiktokec_search_entrance_click", linkedHashMap);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static final void LIZIZ(String str) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
            linkedHashMap.put("enter_from", "seven_tenths_search_screen");
            linkedHashMap.put("search_entrance", str);
            linkedHashMap.put("previous_page", str);
            C1018703yb.LIZIZ("tiktokec_search_entrance_show", linkedHashMap);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
