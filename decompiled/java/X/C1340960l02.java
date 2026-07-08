package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.Comment;

/* JADX INFO: renamed from: X.0l02, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1340960l02 {
    public static final C1340950l01 LIZ(Comment comment) {
        String text = comment.getText();
        String str = "";
        if (text == null) {
            text = "";
        }
        int diggCount = comment.getDiggCount();
        UrlModel avatarThumb = comment.getUser().getAvatarThumb();
        String nickname = comment.getUser().getNickname();
        if (nickname != null) {
            str = nickname;
        }
        return new C1340950l01(text, str, avatarThumb, diggCount);
    }
}
