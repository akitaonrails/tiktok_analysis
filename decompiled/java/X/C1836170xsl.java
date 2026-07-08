package X;

import android.content.Context;
import android.content.DialogInterface;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.AwS77S1000000_27;

/* JADX INFO: renamed from: X.0xsl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1836170xsl {
    public static int LJFF;
    public static String LJI;
    public static C2344009Gk LJIIJ;
    public static final C1836170xsl LIZ = new C1836170xsl();
    public static long LIZIZ = -1;
    public static long LIZJ = -1;
    public static long LIZLLL = -1;
    public static long LJ = -1;
    public static String LJII = "";
    public static String LJIIIIZZ = "";
    public static String LJIIIZ = "";

    public static void LIZ(Float f, DialogC1390150mHN dialogC1390150mHN, DialogInterface.OnCancelListener onCancelListener) {
        if (f != null) {
            dialogC1390150mHN.LJJLL(f.floatValue(), false);
        }
        dialogC1390150mHN.LJJLJLI(C497740JfY.LJIJI(2131843955));
        dialogC1390150mHN.LJJLIIJ(true);
        dialogC1390150mHN.LJJLJ(false);
        dialogC1390150mHN.setOnCancelListener(onCancelListener);
        dialogC1390150mHN.setOnDismissListener(null);
    }

    public static void LIZIZ(int i, String str, String str2, String str3, String str4) {
        int i2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("try report: ");
        sbLIZ.append(LJIIJ);
        C20441214yg.LIZIZ("LiveReplayVideoClip", C2188811AlT.LIZIZ(sbLIZ));
        C2344009Gk c2344009Gk = LJIIJ;
        if (c2344009Gk != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            int i3 = (int) (jCurrentTimeMillis - LIZIZ);
            long j = LIZJ;
            int i4 = 0;
            if (j == -1) {
                i2 = 0;
            } else {
                i2 = (int) (LIZLLL - j);
            }
            long j2 = LJ;
            if (j2 != -1) {
                i4 = (int) (jCurrentTimeMillis - j2);
            }
            c2344009Gk.LIZJ(i3 / LSPassThroughRecordSizeConfig.DEFAULT, "total_processing_duration");
            c2344009Gk.LIZJ(i2 / LSPassThroughRecordSizeConfig.DEFAULT, "video_cloud_duration");
            c2344009Gk.LIZJ(i4 / LSPassThroughRecordSizeConfig.DEFAULT, "mp4_duration");
            c2344009Gk.LJIIIIZZ("clip_id", str3);
            c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
            if (str4 != null) {
                c2344009Gk.LJFF("fragment_id", str4);
            }
            c2344009Gk.LJIIIIZZ("access_identity", C1834240xpe.LIZJ(LJFF));
            if (LJFF != 0) {
                c2344009Gk.LJFF("viewer_user_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
            }
            c2344009Gk.LJIIIIZZ("fail_reason", str2);
            c2344009Gk.LIZJ(i, "error_code");
            c2344009Gk.LJIIIIZZ("anchor_id", LJI);
            c2344009Gk.LJIIIIZZ("enter_from_page", LJII);
            c2344009Gk.LJIIIIZZ("enter_from", LJIIIIZZ);
            c2344009Gk.LJIIIIZZ("last_page", LJIIIZ);
            C20684815ws.LJIILLIIL("livesdk_live_replay_clip_processing_duration", c2344009Gk.LIZ);
        }
    }

    public static void LIZJ(Context context, float f, DialogC1390150mHN dialogC1390150mHN, String str, String str2, final String str3, String str4, String str5, C1836330xt1 c1836330xt1, String str6, String str7, String str8, String str9, String str10, String str11) {
        String strLIZIZ;
        final DialogC1390150mHN dialogC1390150mHN2 = dialogC1390150mHN;
        C1836330xt1 c1836330xt12 = c1836330xt1;
        if (c1836330xt12 == null) {
            c1836330xt12 = new C1836330xt1("", "", "", "");
        }
        if (dialogC1390150mHN2 == null) {
            C20441214yg.LIZIZ("LiveReplayVideoClip", "try download clip from JSB");
            dialogC1390150mHN2 = new DialogC1390150mHN(context);
            final C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("anchor_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
            c2344009Gk.LJIIIIZZ("room_id", str);
            c2344009Gk.LJIIIIZZ("clip_id", str2);
            c2344009Gk.LJIIIIZZ("event_page", "clip_list_page");
            LJIIJ = c2344009Gk;
            LIZIZ = System.currentTimeMillis();
            LIZJ = -1L;
            LIZLLL = -1L;
            LJ = -1L;
            LIZ(null, dialogC1390150mHN2, new DialogInterface.OnCancelListener() { // from class: X.0xss
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    C786410Ut5.LJIIJJI(dialogC1390150mHN2);
                    C207232167i.LIZ(new AwS77S1000000_27(str3, 13));
                    C20684815ws.LJIILLIIL("livesdk_live_replay_clip_post_cancel", c2344009Gk.LIZ);
                }
            });
            C786410Ut5.K4(dialogC1390150mHN2);
        } else {
            C20441214yg.LIZIZ("LiveReplayVideoClip", "try download clip from NATIVE");
        }
        String str12 = c1836330xt12.LIZ;
        C2344009Gk c2344009Gk2 = LJIIJ;
        if (c2344009Gk2 != null) {
            c2344009Gk2.LJIIIIZZ("anchor_id", LJI);
            c2344009Gk2.LJIIIIZZ("enter_from_page", LJII);
            c2344009Gk2.LJIIIIZZ("enter_from", LJIIIIZZ);
            c2344009Gk2.LJIIIIZZ("last_page", LJIIIZ);
            if (str12 != null) {
                c2344009Gk2.LJFF("fragment_id", str12);
            }
            C20684815ws.LJIILLIIL("livesdk_live_replay_clip_start_download", c2344009Gk2.LIZ);
        }
        LJ = System.currentTimeMillis();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(str2);
        String strLIZ = C2084808Es.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (strLIZ == null || strLIZ.length() == 0) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append(str2);
            strLIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        if (str4 == null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(strLIZ);
            sbLIZ3.append(".mp4");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        } else {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(strLIZ);
            sbLIZ4.append(str4);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
        }
        C207209166l c207209166l = new C207209166l(strLIZIZ, EnumC771350UNp.LIVE_REPLAY_CLIP_VIDEO, null, null, str3, null, false, 1, false, 748);
        C207232167i.LIZIZ(c207209166l, new C1836250xst(c207209166l, dialogC1390150mHN2, str2, c1836330xt12, context, str5, str8, str6, str7, str10, str9, str11, f));
    }
}
