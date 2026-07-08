package X;

import com.ss.android.ugc.aweme.story.model.streaks.StoryStreakEnterEditParam;

/* JADX INFO: renamed from: X.126M, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C126M {
    public static long LIZ;
    public static long LIZIZ;
    public static long LIZJ;
    public static long LIZLLL;
    public static long LJ;
    public static long LJFF;
    public static long LJI;
    public static long LJII;
    public static long LJIIIIZZ;
    public static long LJIIIZ;
    public static long LJIIJ;
    public static long LJIIJJI;
    public static int LJIIL;
    public static long LJIILIIL;

    public static void LIZIZ(StoryStreakEnterEditParam storyStreakEnterEditParam, int i) {
        C126I.LIZ.getClass();
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C126N(i, storyStreakEnterEditParam, C126I.LJIILIIL, null), 3);
    }

    public static void LIZ(C2344009Gk c2344009Gk, StoryStreakEnterEditParam storyStreakEnterEditParam, String str) {
        String enterFrom;
        String enterMethod;
        int streakLevel;
        String conversationId;
        String peerUid;
        int messageCount;
        long jCurrentTimeMillis = System.currentTimeMillis() - LJIILIIL;
        if (storyStreakEnterEditParam == null || (enterFrom = storyStreakEnterEditParam.getEnterFrom()) == null) {
            enterFrom = "";
        }
        c2344009Gk.LJFF("enter_from", enterFrom);
        if (storyStreakEnterEditParam == null || (enterMethod = storyStreakEnterEditParam.getEnterMethod()) == null) {
            enterMethod = "";
        }
        c2344009Gk.LJFF("enter_method", enterMethod);
        c2344009Gk.LIZLLL(jCurrentTimeMillis, "duration_wait");
        c2344009Gk.LIZLLL(LJFF, "duration_save_font");
        c2344009Gk.LIZLLL(LIZJ, "duration_fetch_gecko_shadow");
        c2344009Gk.LIZLLL(LIZIZ, "duration_fetch_gecko_fire");
        c2344009Gk.LIZLLL(LIZLLL, "duration_fetch_gecko_poster");
        c2344009Gk.LIZLLL(LJ, "duration_fetch_gecko_fire_lottie");
        c2344009Gk.LIZLLL(LIZ, "duration_gif_encode");
        c2344009Gk.LIZLLL(LJIIJ, "duration_fetch_muf");
        c2344009Gk.LIZLLL(LJIIJJI, "duration_fetch_effects");
        c2344009Gk.LIZLLL(LJIIIZ, "duration_download_fire_info");
        c2344009Gk.LIZLLL(LJIIIIZZ, "duration_download_bottom_info");
        long j = LJII;
        if (j > 0) {
            c2344009Gk.LIZLLL(j, "duration_download_bottom_bubble");
        }
        long j2 = LJI;
        if (j2 > 0) {
            c2344009Gk.LIZLLL(j2, "duration_fetch_info_num_font");
        }
        int mufDaysCount = 0;
        if (storyStreakEnterEditParam != null) {
            streakLevel = storyStreakEnterEditParam.getStreakLevel();
        } else {
            streakLevel = 0;
        }
        c2344009Gk.LIZJ(streakLevel, "streak_level");
        if (storyStreakEnterEditParam == null || (conversationId = storyStreakEnterEditParam.getConversationId()) == null) {
            conversationId = "";
        }
        c2344009Gk.LJFF("conversation_id", conversationId);
        if (storyStreakEnterEditParam == null || (peerUid = storyStreakEnterEditParam.getPeerUid()) == null) {
            peerUid = "";
        }
        c2344009Gk.LJFF("peer_uid", peerUid);
        if (str == null) {
            str = "";
        }
        c2344009Gk.LJFF("creation_id", str);
        if (storyStreakEnterEditParam != null) {
            messageCount = storyStreakEnterEditParam.getMessageCount();
        } else {
            messageCount = 0;
        }
        c2344009Gk.LIZJ(messageCount, "message_count");
        if (storyStreakEnterEditParam != null) {
            mufDaysCount = storyStreakEnterEditParam.getMufDaysCount();
        }
        c2344009Gk.LIZJ(mufDaysCount, "muf_day_count");
        c2344009Gk.LIZJ(C126X.LIZ(), "frame_rate");
    }
}
