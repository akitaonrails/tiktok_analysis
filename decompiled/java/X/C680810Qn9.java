package X;

import X.C680810Qn9;
import android.text.TextUtils;
import android.util.LruCache;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0Qn9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C680810Qn9<T extends C680810Qn9<T>> extends C650460PfI<T> {
    public C680810Qn9(Comment comment, Aweme aweme, String str) {
        String string;
        String string2;
        String uid;
        super(str);
        LJIL(aweme.getAid());
        LJIIZILJ("comment_id", comment.getCid());
        LJIIZILJ("text", comment.getText());
        String text = comment.getText();
        String str2 = "";
        LJIIZILJ("text_length", String.valueOf((text == null ? "" : text).length()));
        LJIIZILJ("user_id", ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID());
        LJIIZILJ("author_id", AwemeExtKt.getAuthorUid(aweme));
        User user = comment.getUser();
        LJIIZILJ("comment_author_id", (user == null || (uid = user.getUid()) == null) ? "" : uid);
        String cid = comment.getCid();
        cid = cid == null ? "" : cid;
        C01GW c01gw = C680830QnB.LIZ;
        EnumC680820QnA enumC680820QnA = (EnumC680820QnA) ((LruCache) c01gw.getValue()).get(cid);
        if (enumC680820QnA == null) {
            int iLIZIZ = C439870HMr.LIZIZ(comment.getText());
            if (iLIZIZ != 0) {
                if (iLIZIZ != 1) {
                    if (iLIZIZ != 2) {
                        enumC680820QnA = EnumC680820QnA.TEXT;
                    } else {
                        enumC680820QnA = EnumC680820QnA.TEXT_EMOJI;
                    }
                } else {
                    enumC680820QnA = EnumC680820QnA.EMOJI;
                }
            } else {
                enumC680820QnA = EnumC680820QnA.TEXT;
            }
            ((LruCache) c01gw.getValue()).put(cid, enumC680820QnA);
        }
        LJIIZILJ("message_type", enumC680820QnA.getValue());
        User author = aweme.getAuthor();
        LJIIZILJ("follow_status", (author == null || (string2 = Integer.valueOf(author.getFollowStatus()).toString()) == null) ? "" : string2);
        User user2 = comment.getUser();
        LJIIZILJ("follow_status_to_user", (user2 == null || (string = Integer.valueOf(user2.getFollowStatus()).toString()) == null) ? "" : string);
        LJIIZILJ("comment_like_cnt", String.valueOf(comment.getDiggCount()));
        LJIIZILJ("comment_dislike_cnt", String.valueOf(comment.getBuryCount()));
        LJIIZILJ("comment_reply_cnt", String.valueOf(comment.getReplyCount()));
        if (TextUtils.equals(AwemeExtKt.getAuthorUid(aweme), comment.getUser().getUid())) {
            str2 = "creator";
        } else if (comment.getUser().getFollowStatus() == 2) {
            str2 = "friends";
        } else if (comment.getUser().getFollowStatus() == 1) {
            str2 = "following";
        }
        LJIIZILJ("relation", str2);
    }
}
