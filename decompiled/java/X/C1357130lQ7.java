package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.router.SmartRoute;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS335S0000000_11;
import kotlin.jvm.internal.AFwS337S0000000_14;
import kotlin.jvm.internal.AFwS342S0000000_21;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0lQ7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1357130lQ7 {
    public static final HashMap<String, Set<String>> LIZ;

    static {
        HashMap<String, Set<String>> map = new HashMap<>();
        LIZ = map;
        map.put("all_event", C093Y.LJ("account_type", "inbox_position", "notice_message_type"));
        map.put("follow", C093Y.LJ("position"));
    }

    public static void LIZ(AbstractC1386130mAt abstractC1386130mAt, HashMap map) {
        LIZLLL(abstractC1386130mAt, abstractC1386130mAt.LIZ, map, AFwS335S0000000_11.get$arr$(6));
    }

    public static void LIZJ(JSONObject jSONObject, HashMap map) {
        LIZLLL(jSONObject, "share_video", map, AFwS337S0000000_14.get$arr$(4));
    }

    public static final void LJ(SmartRoute smartRoute, HashMap map) {
        if (map != null) {
            if (!map.isEmpty()) {
                smartRoute.withParam("inbox_log_extra", map);
            }
            if (!map.isEmpty() && C1533950q1J.LJ((String) map.get("is_from_push")) && Intrinsics.LJFF(map.get("is_from_push"), "1")) {
                smartRoute.withParam("is_from_push", 1);
                String str = (String) map.get("push_type");
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                smartRoute.withParam("push_type", str);
                String str3 = (String) map.get("push_id");
                if (str3 != null) {
                    str2 = str3;
                }
                smartRoute.withParam("push_id", str2);
            }
        }
    }

    public static void LJFF(SmartRoute smartRoute, Fragment fragment) {
        Bundle arguments;
        if (fragment != null && (arguments = fragment.getArguments()) != null && arguments.getInt("is_from_push", 0) == 1) {
            smartRoute.withParam("is_from_push", 1);
            String string = arguments.getString("push_type");
            String str = "";
            if (string == null) {
                string = "";
            }
            smartRoute.withParam("push_type", string);
            String string2 = arguments.getString("push_id");
            if (string2 != null) {
                str = string2;
            }
            smartRoute.withParam("push_id", str);
        }
    }

    public static void LIZIZ(C2344009Gk c2344009Gk, String str, HashMap map) {
        LIZLLL(c2344009Gk, str, map, AFwS342S0000000_21.get$arr$(1));
    }

    public static void LIZLLL(Object obj, String str, HashMap map, InterfaceC1631620sYq interfaceC1631620sYq) {
        HashMap<String, Set<String>> map2;
        Set<String> set;
        if (map != null && (!map.isEmpty()) && (set = (map2 = LIZ).get("all_event")) != null) {
            Set setLJIIIIZZ = C15442062u.LJIIIIZZ(map2.get(str), set);
            for (Map.Entry entry : map.entrySet()) {
                if (setLJIIIIZZ.contains(entry.getKey())) {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    if (value == null) {
                        value = "";
                    }
                    interfaceC1631620sYq.invoke(obj, key, value);
                }
            }
        }
    }
}
