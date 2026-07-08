package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xFh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1811950xFh {
    public static String LIZ;
    public static String LIZIZ = "";
    public static String LIZJ = "";
    public static String LIZLLL = "";
    public static String LJ = "";
    public static String LJFF = "";
    public static long LJI = -1;
    public static long LJII = -1;

    public static void LIZ(Integer num, String str) {
        if (!Intrinsics.LJFF(LIZIZ, "livesdk_anchor_highlight_post_click")) {
            return;
        }
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() - LJI);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_highlight_post_quality");
        c474500IjALIZ.LJJII(LIZ, "download_url");
        c474500IjALIZ.LJJII(LIZLLL, "room_id");
        c474500IjALIZ.LJJII(LIZJ, "fragment_id");
        c474500IjALIZ.LJJII(LJ, "fragment_type");
        c474500IjALIZ.LJJII(Integer.valueOf(iCurrentTimeMillis / LSPassThroughRecordSizeConfig.DEFAULT), "duration");
        c474500IjALIZ.LJJII(LJFF, "anchor_id");
        c474500IjALIZ.LJJII(str, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        if (num != null) {
            num.intValue();
            c474500IjALIZ.LJJII(num, "error_code");
        }
        c474500IjALIZ.LIZ();
    }
}
