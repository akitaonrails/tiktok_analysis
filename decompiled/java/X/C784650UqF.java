package X;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0UqF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C784650UqF {
    public static final void LIZ(int i, String str, int i2, long j, long j2, long j3, long j4, long j5) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("error_code", Integer.valueOf(i));
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("error_msg", str);
        linkedHashMap.put("error_type", Integer.valueOf(i2));
        linkedHashMap.put("current_time", Long.valueOf(j));
        linkedHashMap.put("start_live_time", Long.valueOf(j2));
        linkedHashMap.put("live_duration", Long.valueOf(j3));
        linkedHashMap.put("last_record_time", Long.valueOf(j4));
        linkedHashMap.put("room_id", Long.valueOf(j5));
        C1CC2.LJII(1, C0KQH.LIZ("ttlive_highlight_button_click_result"), linkedHashMap);
    }
}
