package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.upvote.RepostItemSource;
import com.ss.android.ugc.aweme.feed.model.upvote.RepostReplyStruct;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lPZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1356790lPZ {
    public static final boolean LIZJ(String str) {
        if (C703302op.LIZ(str) && !Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT)) {
            return true;
        }
        return false;
    }

    public static final String LIZ(UpvoteStruct upvoteStruct, boolean z) {
        boolean z2;
        if (z) {
            return "comment";
        }
        if (upvoteStruct != null && upvoteStruct.repostItemSource == RepostItemSource.ITEM.getValue()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 || upvoteStruct == null || upvoteStruct.repostItemSource != RepostItemSource.COMMENT.getValue()) {
            return "video";
        }
        return "video_comment";
    }

    public static final String LIZIZ(RepostReplyStruct repostReplyStruct, UpvoteStruct upvoteStruct) {
        if (repostReplyStruct == null) {
            if (C1359720lUI.LJ(upvoteStruct)) {
                return "repost_with_text";
            }
            if (!C1359720lUI.LJ(upvoteStruct)) {
                return "repost_no_text";
            }
            return "";
        }
        if (!LIZJ(repostReplyStruct.replyToUserid)) {
            return "reply_to_repost";
        }
        if (LIZJ(repostReplyStruct.replyToUserid)) {
            return "reply_to_reply";
        }
        return "";
    }
}
