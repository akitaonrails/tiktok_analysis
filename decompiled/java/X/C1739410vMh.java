package X;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: X.0vMh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1739410vMh {
    public static final C1739410vMh LIZ = new C1739410vMh();

    public static void LIZ(long j, String str, Map map) {
        HashMap map2 = new HashMap();
        map2.putAll(map);
        long jCurrentTimeMillis = 0;
        if (j > 0) {
            jCurrentTimeMillis = System.currentTimeMillis() - j;
        }
        map2.put("start_click_to_now", Long.valueOf(jCurrentTimeMillis));
        map2.put("subpage_name", String.valueOf(str));
        C1018703yb.LIZIZ("rd_tiktokec_enter_page", map2);
    }

    public static void LIZIZ(EnumC1751120vfa enumC1751120vfa, boolean z, long j, Map map) {
        HashMap map2 = new HashMap();
        map2.put("type", enumC1751120vfa.toString().toLowerCase(Locale.ROOT));
        map2.put("is_success", Boolean.valueOf(z));
        map2.put("duration", Long.valueOf(j));
        map2.putAll(map);
        C1018703yb.LIZIZ("rd_tiktokec_request_duration", map2);
    }
}
