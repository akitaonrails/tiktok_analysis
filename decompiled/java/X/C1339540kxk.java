package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0kxk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1339540kxk {
    public static boolean LIZ(Comment comment) {
        Aweme aliasAweme;
        String desc;
        if (comment == null || (comment.getCommentType() == 2 && (aliasAweme = comment.getAliasAweme()) != null && (desc = aliasAweme.getDesc()) != null && desc.length() != 0)) {
            return true;
        }
        return false;
    }
}
