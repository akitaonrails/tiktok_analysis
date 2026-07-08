package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.SearchInfo;
import com.ss.android.ugc.aweme.feed.model.SearchOutreachDataStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;

/* JADX INFO: renamed from: X.0Pwp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C661330Pwp {
    public static final void LIZ(C680810Qn9<?> c680810Qn9, Aweme aweme, String str, ISearchContextAbility iSearchContextAbility) {
        String authorUid;
        SearchInfo searchInfo;
        SearchOutreachDataStruct searchOutreachDataStruct;
        Comment comment;
        String str2;
        String str3;
        String string;
        C0PRC c0prc = (C0PRC) iSearchContextAbility.Ph1().LIZJ();
        String strLIZ = C436190H8n.LIZ(aweme);
        String str4 = "";
        if (strLIZ == null) {
            strLIZ = "";
        }
        c680810Qn9.LJIJI("search_result_id", strLIZ);
        c680810Qn9.LJIJI("search_id", c0prc.LLILLL);
        c680810Qn9.LJIJI("end_to_end_search_session_id", String.valueOf(((C0PM7) iSearchContextAbility.ak0().LIZJ()).LLILLJJLI));
        c680810Qn9.LJIJI("enter_from", str);
        String strLIZ2 = C436190H8n.LIZ(aweme);
        if (strLIZ2 == null) {
            strLIZ2 = "";
        }
        c680810Qn9.LJIJI("group_id", strLIZ2);
        if (aweme == null || (authorUid = AwemeExtKt.getAuthorUid(aweme)) == null) {
            authorUid = "";
        }
        c680810Qn9.LJIJI("author_id", authorUid);
        if (aweme != null && (searchInfo = aweme.getSearchInfo()) != null && (searchOutreachDataStruct = searchInfo.searchOutreachDataStruct) != null && (comment = searchOutreachDataStruct.comment) != null) {
            String cid = comment.getCid();
            if (cid == null) {
                cid = "";
            }
            c680810Qn9.LJIJI("comment_id", cid);
            String cid2 = comment.getCid();
            if (cid2 == null) {
                cid2 = "";
            }
            c680810Qn9.LJIJI("search_comment_id", cid2);
            String authorUid2 = AwemeExtKt.getAuthorUid(aweme);
            User user = comment.getUser();
            String uid = null;
            if (user != null) {
                uid = user.getUid();
            }
            if (TextUtils.equals(authorUid2, uid)) {
                str2 = "creator";
            } else if (comment.getUser().getFollowStatus() == 2) {
                str2 = "friends";
            } else if (comment.getUser().getFollowStatus() != 1) {
                str2 = "";
            } else {
                str2 = "following";
            }
            c680810Qn9.LJIJI("relation", str2);
            User author = aweme.getAuthor();
            if (author != null && (string = Integer.valueOf(author.getFollowStatus()).toString()) != null) {
                str4 = string;
            }
            c680810Qn9.LJIJI("follow_status", str4);
            if (comment.getCommentType() == 1) {
                str3 = "1";
            } else {
                str3 = "2";
            }
            c680810Qn9.LJIJI("comment_level", str3);
        }
    }
}
