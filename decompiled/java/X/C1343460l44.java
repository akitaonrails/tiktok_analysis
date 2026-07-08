package X;

import com.ss.android.ugc.aweme.commercialize.model.CommentStruct;
import com.ss.android.ugc.aweme.commercialize.model.LinkData;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0l44, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1343460l44 {
    public static CommentStruct LIZ(Aweme aweme) {
        LinkData linkDataLIZ = C990310bsT.LIZ(aweme);
        if (linkDataLIZ != null && linkDataLIZ.linkType == 0) {
            CommentStruct commentStruct = new CommentStruct();
            commentStruct.setAid(aweme.getAid());
            commentStruct.setAvatarIcon(linkDataLIZ.avatarIcon);
            commentStruct.setButtonText(linkDataLIZ.buttonText);
            commentStruct.setCommentTime(aweme.getCreateTime());
            commentStruct.setCommentInfo(linkDataLIZ.title);
            commentStruct.setTitle(linkDataLIZ.title);
            commentStruct.setCommentNickName(aweme.getAuthor().getNickname());
            commentStruct.setUser(aweme.getAuthor());
            commentStruct.setCommentType(10);
            return commentStruct;
        }
        if (linkDataLIZ == null || linkDataLIZ.linkType != 1 || !C1017070cZd.LJLI(aweme)) {
            return null;
        }
        CommentStruct commentStruct2 = new CommentStruct();
        commentStruct2.setCommentTime(aweme.getCreateTime());
        commentStruct2.setCommentType(12);
        return commentStruct2;
    }
}
