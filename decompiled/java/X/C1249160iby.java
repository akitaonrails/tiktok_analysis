package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.0iby, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1249160iby {
    public static String LIZIZ = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
    public static C1249160iby LIZJ;
    public final Keva LIZ;

    public final boolean LIZ() {
        int i = this.LIZ.getInt("unclick_times", 0);
        int i2 = this.LIZ.getInt("unclick_times_threshold", 20);
        if (i == i2 - 1) {
            this.LIZ.storeInt("without_notice_days", (int) (System.currentTimeMillis() / ((long) C538540LAe.LLJJJIL)));
        }
        if (i < i2) {
            return true;
        }
        if (System.currentTimeMillis() / ((long) C538540LAe.LLJJJIL) > this.LIZ.getInt("without_notice_days", (int) System.currentTimeMillis()) + (this.LIZ.getInt("without_notice_days_threshold", 90) * 1440)) {
            this.LIZ.storeInt("unclick_times", 0);
            this.LIZ.storeInt("without_notice_days", 0);
        }
        return false;
    }

    public C1249160iby() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("profile_new_follower_notification");
        sbLIZ.append(LIZIZ);
        this.LIZ = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }
}
