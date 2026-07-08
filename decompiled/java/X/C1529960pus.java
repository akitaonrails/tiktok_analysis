package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0pus, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1529960pus {
    public static final C1529960pus LIZ = new C1529960pus();

    public static void LIZ(C1529960pus c1529960pus, String str, String str2, String str3, String str4, String str5, Long l, int i) {
        if ((i & 8) != 0) {
            str4 = null;
        }
        if ((i & 16) != 0) {
            str5 = null;
        }
        if ((i & 32) != 0) {
            l = null;
        }
        c1529960pus.getClass();
        C1768000w6o c1768000w6o = C1768000w6o.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("stage", str);
        linkedHashMap.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str2);
        linkedHashMap.put("channel_name", str3);
        if (str4 != null) {
            linkedHashMap.put("source", str4);
        }
        if (str5 != null) {
            linkedHashMap.put("error_msg", str5);
        }
        if (l != null) {
            linkedHashMap.put("duration", Long.valueOf(l.longValue()));
        }
        c1768000w6o.getClass();
        C1768000w6o.LIZIZ("rd_tiktokec_prefetch_data_merge_process", linkedHashMap);
    }
}
