package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.UserVoteInfo;
import java.util.Map;

/* JADX INFO: renamed from: X.0l0c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1341320l0c {
    public static final void LIZ(C2344009Gk c2344009Gk, String str, String str2) {
        if (C703302op.LIZ(str) && C703302op.LIZ(str2)) {
            c2344009Gk.LJFF(str, str2);
        }
    }

    public static final void LIZIZ(C2344009Gk c2344009Gk, String str, String str2) {
        if (C703302op.LIZ(str) && C703302op.LIZ(str2)) {
            c2344009Gk.LJFF(str, str2);
        }
    }

    public static final void LIZJ(C2344009Gk c2344009Gk, Comment comment, boolean z) {
        UserVoteInfo userVoteInfo;
        int i;
        if (z && comment != null && (userVoteInfo = comment.userVoteInfo) != null) {
            Long l = userVoteInfo.pollId;
            if (l != null) {
                c2344009Gk.LJFF("cmt_poll_id", String.valueOf(l.longValue()));
            }
            if (userVoteInfo.voteOption != null) {
                i = 1;
            } else {
                i = 0;
            }
            c2344009Gk.LIZJ(i, "is_cmt_poll_card_show");
            String str = userVoteInfo.voteText;
            if (str != null) {
                c2344009Gk.LJFF("cmt_poll_card_show_option", str);
            }
        }
    }

    public static final void LIZLLL(C2344009Gk c2344009Gk, String str, Map map) {
        c2344009Gk.LJIIIIZZ("message_type", (String) map.get("message_type"));
        c2344009Gk.LJIIIIZZ("original_message_type", (String) map.get("original_message_type"));
        c2344009Gk.LJIIIIZZ("sticker_type", (String) map.get("sticker_type"));
        c2344009Gk.LJIIIIZZ("sticker_id", (String) map.get("sticker_id"));
        c2344009Gk.LJIIIIZZ("sticker_set_name", (String) map.get("sticker_set_name"));
        c2344009Gk.LJIIIIZZ("photo_type", (String) map.get("photo_type"));
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_method", (String) map.get("enter_method"));
        c2344009Gk.LJIIIIZZ("group_id", (String) map.get("group_id"));
        c2344009Gk.LJIIIIZZ("author_id", (String) map.get("author_id"));
        c2344009Gk.LJIIIIZZ("follow_status", (String) map.get("follow_status"));
        c2344009Gk.LJIIIIZZ("follow_status_to_user", (String) map.get("follow_status_to_user"));
        c2344009Gk.LJIIIIZZ("story_type", (String) map.get("story_type"));
        c2344009Gk.LJFF("comment_category", (String) map.get("comment_category"));
    }
}
