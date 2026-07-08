package X;

import android.app.Activity;

/* JADX INFO: renamed from: X.06jU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1689406jU {
    public static void LIZIZ(C19EG c19eg, String str) {
        Activity activityLIZIZ;
        Activity activity = c19eg;
        if (c19eg == null) {
            AbstractC1387200mCc abstractC1387200mCcLJFF = C1906580ziK.LJFF();
            if (abstractC1387200mCcLJFF != null && (activityLIZIZ = abstractC1387200mCcLJFF.LIZIZ()) != null) {
                Activity activityLIZ = C1388190mED.LIZ(activityLIZIZ);
                activity = activityLIZ;
                if (activityLIZ == null) {
                    return;
                }
            } else {
                return;
            }
        }
        C1389890mGx c1389890mGx = new C1389890mGx(activity);
        c1389890mGx.LJIIIZ(2131838624);
        c1389890mGx.LJIIJJI();
        C2274381E0m.LIZIZ.LIZ(str, false);
    }
}
