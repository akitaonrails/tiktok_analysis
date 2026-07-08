package X;

import com.ss.android.ugc.aweme.feed.model.upvote.RepostReplyStruct;

/* JADX INFO: renamed from: X.0lRW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1358000lRW {
    public static String LIZ(C1358220lRs c1358220lRs) {
        String str;
        String str2;
        String str3;
        String str4;
        if (c1358220lRs instanceof C1357970lRT) {
            C1358240lRu c1358240lRu = c1358220lRs.LLILLL;
            if (c1358240lRu != null && (str4 = c1358240lRu.LJ) != null && C123100dR.LIZ(str4)) {
                return "repost_with_text";
            }
            C1358240lRu c1358240lRu2 = c1358220lRs.LLILLL;
            if (c1358240lRu2 == null || (str3 = c1358240lRu2.LJ) == null || !C123100dR.LIZ(str3)) {
                return "repost_no_text";
            }
        }
        if (c1358220lRs instanceof C1357950lRR) {
            RepostReplyStruct repostReplyStruct = ((C1357950lRR) c1358220lRs).LLILZLL;
            if (repostReplyStruct != null) {
                str = repostReplyStruct.replyToUserid;
            } else {
                str = null;
            }
            if (C1356790lPZ.LIZJ(str)) {
                return "reply_to_reply";
            }
            RepostReplyStruct repostReplyStruct2 = ((C1357950lRR) c1358220lRs).LLILZLL;
            if (repostReplyStruct2 != null && (str2 = repostReplyStruct2.replyToUserid) != null && C1356790lPZ.LIZJ(str2)) {
                return "";
            }
            return "reply_to_repost";
        }
        return "";
    }
}
