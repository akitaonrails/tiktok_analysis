package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.inbox.setting.BulletinGuideFrequencyConfiguration;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OP4, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OP4 {
    public static final C0OP4 LIZ = new C0OP4();
    public static String LIZIZ = "";
    public static boolean LIZJ;

    public static Keva LIZ() {
        String uid;
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        if (curUser == null || (uid = curUser.getUid()) == null) {
            uid = "";
        }
        return Keva.getRepo(C786410Ut5.j4("bulletin_board_guide_%s", Arrays.copyOf(new Object[]{uid}, 1)));
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.Pair LIZIZ() {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0OP4.LIZIZ():kotlin.Pair");
    }

    public static void LIZJ(boolean z) {
        String uid;
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        if (curUser != null && (uid = curUser.getUid()) != null) {
            Intrinsics.LJFF(LIZIZ, uid);
            LIZIZ = uid;
            Keva kevaLIZ = LIZ();
            int i = kevaLIZ.getInt("guide_show_times_once", 0) + 1;
            if (i < ((BulletinGuideFrequencyConfiguration) C0OPD.LIZIZ.getValue()).timesOnce && !z) {
                kevaLIZ.storeInt("guide_show_times_once", i);
            } else {
                kevaLIZ.storeInt("guide_show_times_all", kevaLIZ.getInt("guide_show_times_all", 0) + 1);
                kevaLIZ.storeInt("guide_show_times_once", 0);
                kevaLIZ.storeLong("last_show_time", System.currentTimeMillis());
            }
            kevaLIZ.storeLong("last_banner_show_time", System.currentTimeMillis());
        }
    }
}
