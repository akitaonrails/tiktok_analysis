package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.0ZvD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C915130ZvD {
    public static void LIZ(Throwable th) {
        if (th instanceof C501470JlZ) {
            C501520Jle c501520Jle = (C501520Jle) th;
            if (c501520Jle.getErrorCode() == 4004442 || c501520Jle.getErrorCode() == 4004441) {
                HashMap map = new HashMap();
                C01Z4.LIZ(null, map);
                C0KX4.LIZ("livesdk_lineup_multi_click_toast", map, null, true);
            }
        }
    }
}
