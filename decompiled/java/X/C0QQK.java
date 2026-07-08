package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0QQK, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QQK {
    public static final C0QQK LIZ = new C0QQK();

    public static void LIZIZ(Aweme aweme, String str, String str2, boolean z) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_group_id", aweme.getAid());
        c2344009Gk.LJIIIIZZ("board_type", "android");
        c2344009Gk.LJIIIIZZ("group_id", str2);
        c2344009Gk.LJIIIIZZ("words_content", str);
        if (z) {
            c2344009Gk.LJFF("is_from_photo", "1");
        }
        C20684815ws.LJIILLIIL("comment_related_search_board_show", c2344009Gk.LIZ);
    }

    public static void LIZ(Aweme aweme, String str, String str2, String str3, boolean z) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_group_id", aweme.getAid());
        c2344009Gk.LJIIIIZZ("board_type", "android");
        c2344009Gk.LJIIIIZZ("click_detail", str);
        c2344009Gk.LJIIIIZZ("group_id", str3);
        c2344009Gk.LJIIIIZZ("words_content", str2);
        if (z) {
            c2344009Gk.LJFF("is_from_photo", "1");
        }
        C20684815ws.LJIILLIIL("comment_related_search_board_click", c2344009Gk.LIZ);
    }
}
