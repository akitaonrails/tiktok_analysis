package X;

import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.10eg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19298010eg {
    public static void LIZ(int i) {
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("user_type", "existing", bundle);
        C786410Ut5.LJJJI("result", String.valueOf(i), bundle);
        LIZLLL("age_range_select_response", bundle);
    }

    public static void LIZJ(String str) {
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("user_type", "existing", bundle);
        C786410Ut5.LJJJI("page_name", str, bundle);
        LIZLLL("age_range_select_ymd_show", bundle);
    }

    public static void LJFF(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("user_type", "edit");
        linkedHashMap.put("type", "-1007");
        linkedHashMap.put("result", str);
        LJ("age_gate_popup_response", linkedHashMap, C2097608Jq.LJ());
    }

    public static void LIZIZ(int i, String str) {
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("user_type", "existing", bundle);
        C786410Ut5.LJJJI("is_submit", String.valueOf(i), bundle);
        C786410Ut5.LJJJI("page_name", str, bundle);
        LIZLLL("age_range_select_ymd_response", bundle);
    }

    public static void LIZLLL(String str, Bundle bundle) {
        try {
            AppLogNewUtils.LJ(str, bundle);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LJI(String str, boolean z) {
        String str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("has_birthday", str2);
        linkedHashMap.put("is_success", str);
        LJ("age_edit_interface_click", linkedHashMap, C2097608Jq.LJ());
    }

    public static void LJ(String str, Map map, Map map2) {
        map.putAll(map2);
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        AppLogNewUtils.onEventV3(str, jSONObject);
    }
}
