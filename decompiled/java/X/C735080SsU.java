package X;

import android.content.Context;
import android.util.Pair;
import com.ss.android.ugc.aweme.commercialize.engagement.trace.EngagementTraceImpl;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0SsU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C735080SsU {
    public static final C735080SsU LIZ = new C735080SsU();

    public static final void LIZJ(String str, String str2, HashMap map) {
        if (str2 != null) {
            map.put("previous_page", str2);
        }
        if (str != null) {
            map.put("enter_from", str);
        }
    }

    public static final void LIZ(Context context, String str, String str2, String str3, HashMap map) {
        Object obj;
        if (str2 != null) {
            map.put("ad_id", str2);
        }
        if (str3 != null) {
            map.put("creative_id", str3);
        }
        if (str != null) {
            map.put("log_extra", str);
        }
        map.put("user_agent", C1489110oqz.LIZ("other"));
        map.put("access", C786410Ut5.b3(context));
        map.put("package", context.getPackageName());
        Pair<String, Boolean> pairLIZ = C614430O8b.LIZ(context);
        if (pairLIZ != null && (obj = pairLIZ.first) != null) {
            map.put("google_aid", obj);
        }
        for (Map.Entry<String, Object> entry : EngagementTraceImpl.LIZIZ().LIZ().entrySet()) {
            map.put(entry.getKey(), entry.getValue().toString());
        }
    }

    public static final void LIZIZ(Context context, String str, String str2, String str3, C1387280mCk c1387280mCk) {
        String string;
        String string2;
        String str4;
        c1387280mCk.LJJIFFI = str2;
        if (str != null) {
            c1387280mCk.LJJII = str;
        }
        c1387280mCk.LJJI = str3;
        c1387280mCk.LJJIII = C1489110oqz.LIZ("other");
        c1387280mCk.LJJIIZ = C786410Ut5.b3(context);
        c1387280mCk.LJJIIJ = context.getPackageName();
        Pair<String, Boolean> pairLIZ = C614430O8b.LIZ(context);
        if (pairLIZ != null && (str4 = (String) pairLIZ.first) != null) {
            c1387280mCk.LJJIIJZLJL = str4;
        }
        Map<String, Object> mapLIZ = EngagementTraceImpl.LIZIZ().LIZ();
        Object obj = mapLIZ.get("duration");
        String str5 = "";
        if (obj == null || (string = obj.toString()) == null) {
            string = "";
        }
        c1387280mCk.LJJIJIIJI = string;
        Object obj2 = mapLIZ.get("play_order");
        if (obj2 != null && (string2 = obj2.toString()) != null) {
            str5 = string2;
        }
        c1387280mCk.LJJIJIIJIL = str5;
    }
}
