package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0Pwn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C661310Pwn {
    public static final C661300Pwm LIZ(Comment comment) {
        UrlModel avatarThumb;
        String text = comment.getText();
        if (text == null) {
            text = "";
        }
        User user = comment.getUser();
        if (user != null) {
            avatarThumb = user.getAvatarThumb();
        } else {
            avatarThumb = null;
        }
        return new C661300Pwm(comment.getDiggCount(), avatarThumb, text, comment.isUserDigged());
    }
}
