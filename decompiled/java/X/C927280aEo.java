package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.0aEo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C927280aEo {
    public static long LIZ;
    public static final /* synthetic */ int LIZIZ = 0;

    public static void LIZ(String str, String str2, String str3, String str4) {
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("reason", str);
        map.put("costTime", String.valueOf(C963140bAe.LIZIZ() - LIZ));
        map.put("error_msg", str2);
        map.put("error_detail", str3);
        map.put("log_id", str4);
        C0KX4.LIZ("livesdk_audio_chat_init_failed", map, null, true);
    }
}
