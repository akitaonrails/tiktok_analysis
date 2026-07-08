package X;

import android.os.Build;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0ukA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1715520ukA {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Map map) {
        map.put("priority_region", C1717770unn.LJIIIIZZ().getCurrentRegionCode());
        map.put("build_brand", Build.BRAND);
        map.put("build_model", Build.MODEL);
        map.put("build_sdk_int", String.valueOf(Build.VERSION.SDK_INT));
    }

    public static void LIZIZ(Bundle bundle, String str) {
        Unit unit;
        if (bundle == null) {
            unit = null;
        } else {
            try {
                C1713870uhV.LIZ("rd_pipo_page_recreate", C2097608Jq.LJIIIIZZ(new Pair("page_id", str), new Pair("priority_region", C1717770unn.LJIIIIZZ().getPriorityRegion())));
                unit = Unit.LIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return;
            }
        }
        C189200o6.m2constructorimpl(unit);
    }

    public static void LIZJ(String str, String str2, String str3, int i) throws JSONException {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZ(linkedHashMap);
        linkedHashMap.put("expected_name", str);
        if (str2 != null) {
            linkedHashMap.put("arg1", str2);
        }
        if (str3 != null) {
            linkedHashMap.put("arg2", str3);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), entry.getValue());
        }
        C1713870uhV.LIZ("rd_pipo_unexpected_v1", linkedHashMap2);
    }

    public static void LIZLLL(String str, String str2, String str3, String str4) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZ(linkedHashMap);
        if (str2 != null) {
            linkedHashMap.put("arg1", str2);
        }
        if (str3 != null) {
            linkedHashMap.put("arg2", str3);
        }
        if (str4 != null) {
            linkedHashMap.put("arg3", str4);
        }
        linkedHashMap.put("rd_event_param", str);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), entry.getValue());
        }
        C1713870uhV.LIZ("rd_pipo_user_path", linkedHashMap2);
    }
}
