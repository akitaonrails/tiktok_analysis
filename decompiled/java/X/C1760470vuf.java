package X;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0vuf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1760470vuf {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, boolean z) {
        int i;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("load_step", "end");
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        linkedHashMap.put("load_status", Integer.valueOf(i));
        if (str != null) {
            linkedHashMap.put("error_msg", str);
        }
        C1018703yb.LJ("rd_tiktokec_sea_review_lynx_load", linkedHashMap);
    }
}
