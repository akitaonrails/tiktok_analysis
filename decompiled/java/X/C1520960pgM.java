package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.0pgM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1520960pgM {
    public static void LIZIZ(Throwable th) {
        LIZ("default_handle", th);
    }

    public static void LIZ(String str, Throwable th) {
        HashMap map = new HashMap();
        map.put("error_error_msg", th.getMessage());
        map.put("error_desc", str);
        C2119208Ry.LIZIZ(null, "internal_error", map, null);
    }
}
