package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.01N8, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01N8 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(int i, String str, String str2, long j, String str3, String str4, String str5) {
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("function_name", str);
        map.put("action_detail", str2);
        map.put("to_user_type", str3);
        map.put("drop_reason", str4);
        map.put("error_code", String.valueOf(i));
        map.put("error_msg", str5);
        if (j > 0) {
            map.put("duration", String.valueOf(j));
        }
        C923330a8R c923330a8R = C923330a8R.LIZ;
        map.put("is_moderator", C923330a8R.LIZLLL());
        C0KX4.LIZ("livesdk_multi_function_call_result", map, null, true);
    }
}
