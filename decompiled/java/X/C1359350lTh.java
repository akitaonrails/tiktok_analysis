package X;

import com.bytedance.scene.Scene;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0lTh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1359350lTh {
    public static final C1359350lTh LIZ = new C1359350lTh();

    /* JADX WARN: Removed duplicated region for block: B:100:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(X.C1359350lTh r17, java.lang.String r18, java.lang.String r19, com.ss.android.ugc.aweme.feed.model.Aweme r20, boolean r21, boolean r22, java.lang.String r23, java.lang.String r24, int r25) {
        /*
            Method dump skipped, instruction units count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1359350lTh.LIZ(X.0lTh, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme, boolean, boolean, java.lang.String, java.lang.String, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    public static void LIZIZ(C1359350lTh c1359350lTh, String str, String str2, Aweme aweme, String str3, String str4, boolean z, double d, String str5, String str6, String str7, String str8, String str9, int i) {
        String aid;
        String str10;
        User author;
        String uid;
        String str11 = str6;
        String str12 = str5;
        String str13 = str9;
        String str14 = str8;
        String str15 = "";
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 8) != 0) {
            str3 = "";
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        ?? r15 = z;
        if ((i & 32) != 0) {
            r15 = 0;
        }
        if ((i & 64) != 0) {
            d = 0.0d;
        }
        if ((i & 128) != 0) {
            str12 = null;
        }
        if ((i & 256) != 0) {
            str11 = null;
        }
        if ((i & 512) != 0) {
            str7 = null;
        }
        if ((i & 1024) != 0) {
            str14 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str13 = null;
        }
        c1359350lTh.getClass();
        Pair[] pairArr = new Pair[14];
        pairArr[0] = new Pair(str, "enter_from");
        pairArr[1] = new Pair(str2, "trigger");
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        pairArr[2] = new Pair(aid, "group_id");
        if (aweme != null && (author = aweme.getAuthor()) != null && (uid = author.getUid()) != null) {
            str15 = uid;
        }
        pairArr[3] = new Pair(str15, "author_id");
        pairArr[4] = new Pair(str3, "position");
        pairArr[5] = new Pair(str4, "trace_id");
        pairArr[6] = new Pair(Integer.valueOf((int) r15), "clientAI");
        pairArr[7] = new Pair(Double.valueOf(d), "video_play_time");
        pairArr[8] = new Pair(str12, "panel_style");
        pairArr[9] = new Pair(str11, "sub_position");
        pairArr[10] = new Pair(C1360320lVG.LIZLLL(Boolean.valueOf(C1360320lVG.LIZJ(str7))), "is_detail_page");
        pairArr[11] = new Pair(str14, "comment_id");
        pairArr[12] = new Pair(str13, "reposted");
        if (C1359720lUI.LJFF(aweme)) {
            str10 = "fifa_world_cup";
        } else {
            str10 = "normal";
        }
        pairArr[13] = new Pair(str10, Scene.SCENE_SERVICE);
        C20684815ws.LJIJI("recommend_entrance_show", pairArr);
    }
}
