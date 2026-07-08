package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.CmtAudioStruct;
import com.ss.android.ugc.aweme.comment.model.CmtUserBadgeInfoStruct;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentGiftStruct;
import com.ss.android.ugc.aweme.comment.model.CommentImageStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* JADX INFO: renamed from: X.0kya, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1340060kya {
    public static final C1340410kz9 LIZ(int i, Comment comment, boolean z) {
        boolean z2;
        boolean z3;
        long progress;
        UrlModel avatarThumb;
        int commentPostStatus;
        String str;
        String nickname;
        List<CommentImageStruct> imageList;
        CommentImageStruct commentImageStruct;
        String text = comment.getText();
        String str2 = "";
        if (text == null) {
            text = "";
        }
        boolean zIsUserDigged = comment.isUserDigged();
        boolean zIsUserBuried = comment.isUserBuried();
        boolean z4 = comment.isAuthorDigged;
        C1340040kyY c1340040kyY = new C1340040kyY(i);
        boolean zIsNeedHint = comment.isNeedHint();
        boolean zIsAuthorPin = comment.isAuthorPin();
        CommentGiftStruct gift = comment.getGift();
        List<CommentImageStruct> imageList2 = comment.getImageList();
        if (imageList2 != null && !imageList2.isEmpty()) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean z5 = !z2;
        if (comment.getStickerStruct() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z6 = !z3;
        List<CommentImageStruct> imageList3 = comment.getImageList();
        if (imageList3 != null && !imageList3.isEmpty() && (imageList = comment.getImageList()) != null && (commentImageStruct = (CommentImageStruct) ListProtector.get(imageList, 0)) != null) {
            progress = commentImageStruct.getProgress();
        } else {
            progress = 0;
        }
        User user = comment.getUser();
        Integer asrStatus = null;
        if (user != null) {
            avatarThumb = user.getAvatarThumb();
        } else {
            avatarThumb = null;
        }
        User user2 = comment.getUser();
        if (user2 != null && (nickname = user2.getNickname()) != null) {
            str2 = nickname;
        }
        if (i == 1) {
            commentPostStatus = -1;
        } else {
            commentPostStatus = comment.getCommentPostStatus();
        }
        float commentPostProgress = comment.getCommentPostProgress();
        CmtUserBadgeInfoStruct cmtUserBadgeInfoStruct = comment.getCmtUserBadgeInfoStruct();
        if (cmtUserBadgeInfoStruct != null) {
            str = cmtUserBadgeInfoStruct.url;
        } else {
            str = null;
        }
        boolean zBooleanValue = comment.getNeedShowFirstCommentTagAnimation().booleanValue();
        CmtAudioStruct audioStruct = comment.getAudioStruct();
        if (audioStruct != null) {
            asrStatus = audioStruct.getAsrStatus();
        }
        return new C1340410kz9(text, zIsUserDigged, zIsUserBuried, z4, c1340040kyY, z, zIsNeedHint, zIsAuthorPin, gift, z5, z6, progress, avatarThumb, str2, commentPostStatus, commentPostProgress, str, zBooleanValue, asrStatus, comment.isAudioTextIsTranslated(), 5898240);
    }
}
