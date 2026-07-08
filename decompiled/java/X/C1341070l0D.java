package X;

import android.view.ViewGroup;
import android.widget.TextView;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0l0D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1341070l0D {
    public static void LIZ(TextView textView) {
        ViewGroup.LayoutParams layoutParams;
        if (textView != null && (layoutParams = textView.getLayoutParams()) != null) {
            layoutParams.width = -2;
            C786410Ut5.g6(textView, layoutParams);
        }
    }

    public static boolean LIZIZ(Comment comment) {
        if (!LIZLLL(comment) && comment.getLabelText() != null && comment.getLabelType() == 1) {
            return true;
        }
        return false;
    }

    public static boolean LIZLLL(Comment comment) {
        if (C123100dR.LIZ(comment.getReplyToUserName()) && !Intrinsics.LJFF(comment.getReplyToReplyCommentId(), CardStruct.IStatusCode.DEFAULT)) {
            return true;
        }
        return false;
    }

    public static boolean LJ(Comment comment) {
        if (!LIZLLL(comment) && comment.getLabelText() != null && comment.getLabelType() == 10) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ(Comment comment, Aweme aweme, String str) {
        String str2;
        MatchedFriendStruct matchedFriendStruct;
        if (aweme == null || !C295200Bhe.LIZJ || LIZLLL(comment) || LIZIZ(comment)) {
            return false;
        }
        User user = comment.getUser();
        if (user != null && (matchedFriendStruct = user.getMatchedFriendStruct()) != null) {
            str2 = matchedFriendStruct.recType;
        } else {
            str2 = null;
        }
        if (!C123100dR.LIZ(str2) || !C13LP.LJJJJ(str, C1343870l4j.LJIIL) || !C1343870l4j.LJIIJJI.contains(C1343890l4l.LIZ(aweme.getAuthor(), str))) {
            return false;
        }
        return true;
    }
}
