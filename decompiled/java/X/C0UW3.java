package X;

import com.bytedance.android.livesdk.userservice.UserService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0UW3, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UW3 {
    public static boolean LIZ;
    public static C0UWI LIZIZ;
    public static int LIZJ;
    public static boolean LJ;
    public static boolean LJI;
    public static boolean LJII;
    public static boolean LJIIIIZZ;
    public static boolean LJIIIZ;
    public static String LIZLLL = "";
    public static String LJFF = "";

    public static void LIZ(C0UW9 c0uw9) {
        int i;
        long j;
        Object obj;
        String param;
        boolean z = LJIIIIZZ;
        int i2 = -1;
        if (z) {
            if (LJI) {
                i = 1;
            } else {
                i = 0;
            }
        } else if (!z) {
            i = -1;
        } else {
            throw new C1954807lC();
        }
        boolean z2 = LJIIIZ;
        if (z2) {
            if (LJII) {
                i2 = 1;
            } else {
                i2 = 0;
            }
        } else if (z2) {
            throw new C1954807lC();
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_end_manual_speedtest_result");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        if (c0uw9 != null) {
            j = c0uw9.LIZIZ;
        } else {
            j = 0;
        }
        c474500IjALIZ.LJJII(Long.valueOf(j), "room_id");
        String str = "1";
        if (LIZ) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj, "is_manual_speed_test");
        if (!LJ) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str, "is_use_recommend_definition");
        C0UWI c0uwi = LIZIZ;
        if (c0uwi == null || (param = c0uwi.getParam()) == null) {
            param = "";
        }
        c474500IjALIZ.LJJII(param, "test_result");
        c474500IjALIZ.LJJII(Integer.valueOf(LIZJ), "test_duration");
        c474500IjALIZ.LJJII(LJFF, "final_definition");
        c474500IjALIZ.LJJII(LIZLLL, "current_definition");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "last_room_had_issues");
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "this_room_had_issues");
        c474500IjALIZ.LIZ();
        LIZ = false;
        LIZIZ = null;
        LIZJ = 0;
        LIZLLL = "";
        LJ = false;
        LJFF = "";
        LJI = false;
        LJII = false;
    }
}
