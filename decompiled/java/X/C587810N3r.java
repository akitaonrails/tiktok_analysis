package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0N3r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C587810N3r {
    public static final C587810N3r LIZ = new C587810N3r();
    public static String LIZIZ;
    public static boolean LIZJ;
    public static Long LIZLLL;
    public static Long LJ;
    public static Long LJFF;
    public static Long LJI;

    public static void LIZ() {
        Long l = LIZLLL;
        if (l != null) {
            long jLongValue = l.longValue();
            Long l2 = LJ;
            if (l2 != null) {
                LJ = Long.valueOf(l2.longValue() + (System.currentTimeMillis() - jLongValue));
                LIZLLL = Long.valueOf(System.currentTimeMillis());
            }
        }
    }

    public static String LIZIZ() {
        return C1488520oq2.LIZIZ() ? C20692815yA.LIZ().toMobString() : C20692815yA.LIZ().toMobString();
    }

    public static String LIZJ() {
        if (C1488520oq2.LIZIZ()) {
            boolean zLIZJ = C20692815yA.LIZJ();
            if (zLIZJ) {
                return "on";
            }
            if (zLIZJ) {
                throw new C1954807lC();
            }
            return "off";
        }
        boolean zLIZJ2 = C20692815yA.LIZJ();
        if (zLIZJ2) {
            return "on";
        }
        if (zLIZJ2) {
            throw new C1954807lC();
        }
        return "off";
    }

    public static final void LIZLLL(Aweme aweme, String str) {
        String string;
        Long l = LJFF;
        if (l == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - l.longValue();
        LIZ.getClass();
        LIZ();
        if (aweme != null && str != null) {
            Pair[] pairArr = new Pair[2];
            pairArr[0] = new Pair("duration", String.valueOf(jCurrentTimeMillis));
            Long l2 = LJ;
            if (l2 != null) {
                string = l2.toString();
            } else {
                string = null;
            }
            pairArr[1] = new Pair("mute_duration", string);
            LJ(aweme, str, "audio_play_duration", C2097608Jq.LJIIIIZZ(pairArr));
        }
        LJFF = null;
        LJ = null;
    }

    public static final void LJ(Aweme aweme, String str, String str2, Map<String, String> map) {
        String uid;
        String str3;
        C1370890lmJ c1370890lmJ = C1370890lmJ.LIZ;
        C735840Sti c735840Sti = C735840Sti.LIZ;
        C19651011uW c19651011uW = C19651011uW.LIZIZ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        User author = aweme.getAuthor();
        Long lValueOf = null;
        if (author != null) {
            uid = author.getUid();
        } else {
            uid = null;
        }
        c2344009Gk.LJIIIIZZ("author_id", uid);
        c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
        Music music = aweme.getMusic();
        if (music != null) {
            lValueOf = Long.valueOf(music.getId());
        }
        c2344009Gk.LJIIIIZZ("music_id", String.valueOf(lValueOf));
        c2344009Gk.LJIIIIZZ("log_pb", C584850Mwl.LIZ.LIZIZ(aweme.getRequestId()));
        LIZ.getClass();
        c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, LIZJ());
        c2344009Gk.LJIIIIZZ("play_order", LIZIZ());
        String str4 = "1";
        if (C2214201BlK.LJIIJJI) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("is_background", str3);
        if (!AwemeExtKt.isOnThisDayVideo(aweme)) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("is_on_this_day", str4);
        c2344009Gk.LJII(map);
        Object objLJIIIZ = c19651011uW.LJIIIZ(aweme, c2344009Gk);
        c735840Sti.getClass();
        C735840Sti.LIZIZ(aweme, objLJIIIZ);
        C2344009Gk c2344009Gk2 = (C2344009Gk) c1370890lmJ.appendCreationParams(objLJIIIZ, aweme);
        c2344009Gk2.LJII(C1ER1.LIZIZ.LLZ());
        C20684815ws.LJIILLIIL(str2, c2344009Gk2.LIZ);
    }

    public static void LJFF(Aweme aweme, Aweme aweme2, String str, String str2) {
        String string;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("log_pb", C584850Mwl.LIZ.LIZIZ(aweme.getRequestId()));
        LIZ.getClass();
        c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, LIZJ());
        c2344009Gk.LJIIIIZZ("play_order", LIZIZ());
        c2344009Gk.LJIIIIZZ("from_group_id", AwemeExtKt.getFromGroupId(aweme));
        Music music = aweme.getMusic();
        Object objValueOf = "";
        if (music == null || (string = Long.valueOf(music.getId()).toString()) == null) {
            string = "";
        }
        c2344009Gk.LJIIIIZZ("from_music_id", string);
        c2344009Gk.LJIIIIZZ("to_group_id", AwemeExtKt.getFromGroupId(aweme2));
        Music music2 = aweme2.getMusic();
        if (music2 != null) {
            objValueOf = Long.valueOf(music2.getId());
        }
        c2344009Gk.LJ(objValueOf, "to_music_id");
        C20684815ws.LJIILLIIL(str2, c2344009Gk.LIZ);
    }
}
