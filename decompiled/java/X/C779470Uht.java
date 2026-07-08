package X;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0Uht, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C779470Uht {
    public static final void LIZ(int i, int i2, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("fragment_id", str);
        linkedHashMap.put("timestamp", Long.valueOf(System.currentTimeMillis()));
        linkedHashMap.put("error_type", Integer.valueOf(i));
        linkedHashMap.put("error_code", Integer.valueOf(i2));
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("error_msg", str2);
        C1CC2.LJII(1, C0KQH.LIZ("ttlive_highlight_to_draft_monitor"), linkedHashMap);
    }

    public static final void LIZIZ(int i, int i2, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("error_type", Integer.valueOf(i));
        linkedHashMap.put("error_code", Integer.valueOf(i2));
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("error_msg", str);
        linkedHashMap.put("shoot_way", str2);
        C1CC2.LJII(1, C0KQH.LIZ("ttlive_highlight_jump_edit_result"), linkedHashMap);
    }
}
