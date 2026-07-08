package X;

import java.util.List;

/* JADX INFO: renamed from: X.0QsW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C684140QsW {
    public static final C684140QsW LIZ = new C684140QsW();
    public static final String LIZIZ = "report_submit";
    public static final List<String> LIZJ = C1697810uHb.LJIIJJI("general_search", "search_result", "general_search_list", "search_result_list");
    public static final List<String> LIZLLL;
    public static final List<String> LJ;
    public static final List<String> LJFF;

    static {
        List<String> listLJIIJJI = C1697810uHb.LJIIJJI("video_play", "play_time", "video_play_finish", "click_comment_button", "like", "share_video", "enter_tag_detail", "enter_music_detail", "follow", "enter_personal_detail");
        LIZLLL = listLJIIJJI;
        LJ = C1697810uHb.LJIIJJI("general_search", "search_result");
        List<String> listLJIILJJIL = C1697810uHb.LJIILJJIL("search", "search_result_click", "feed_enter", "search_play_time", "search_video_play_finish", "search_follow", "report_submit");
        listLJIILJJIL.addAll(listLJIIJJI);
        LJFF = listLJIILJJIL;
    }
}
