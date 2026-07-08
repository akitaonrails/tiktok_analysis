package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.upvote.CommentInfoStruct;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lQJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1357250lQJ implements InterfaceC1891350zJl {
    public final UpvoteStruct LL;
    public final UpvoteStruct LLILLJJLI;
    public final VideoItemParams LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1357250lQJ)) {
            return false;
        }
        C1357250lQJ c1357250lQJ = (C1357250lQJ) obj;
        return Intrinsics.LJFF(this.LL, c1357250lQJ.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1357250lQJ.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1357250lQJ.LLILLL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
        VideoItemParams videoItemParams = this.LLILLL;
        return iHashCode + (videoItemParams == null ? 0 : videoItemParams.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentRepostPanelItem(commentRepost=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", attachedVideoRepost=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", detailMobParam=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        String text;
        Comment comment;
        Comment comment2;
        if (!(interfaceC1891350zJl instanceof C1357250lQJ)) {
            return false;
        }
        C1357250lQJ c1357250lQJ = (C1357250lQJ) interfaceC1891350zJl;
        if (!Intrinsics.LJFF(this.LL.upvoteId, c1357250lQJ.LL.upvoteId) || !Intrinsics.LJFF(this.LL.text, c1357250lQJ.LL.text)) {
            return false;
        }
        UpvoteStruct upvoteStruct = this.LL;
        if (upvoteStruct.cacheState != c1357250lQJ.LL.cacheState) {
            return false;
        }
        CommentInfoStruct commentInfoStruct = upvoteStruct.commentInfo;
        String text2 = null;
        if (commentInfoStruct != null && (comment2 = commentInfoStruct.comment) != null) {
            text = comment2.getText();
        } else {
            text = null;
        }
        CommentInfoStruct commentInfoStruct2 = c1357250lQJ.LL.commentInfo;
        if (commentInfoStruct2 != null && (comment = commentInfoStruct2.comment) != null) {
            text2 = comment.getText();
        }
        if (!Intrinsics.LJFF(text, text2)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        String uid;
        if (!(interfaceC1891350zJl instanceof C1357250lQJ)) {
            return false;
        }
        String str = this.LL.carrierId;
        C1357250lQJ c1357250lQJ = (C1357250lQJ) interfaceC1891350zJl;
        String str2 = c1357250lQJ.LL.carrierId;
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
            if (!Intrinsics.LJFF(str, str2)) {
                return false;
            }
            User user = this.LL.user;
            String uid2 = null;
            if (user != null) {
                uid = user.getUid();
            } else {
                uid = null;
            }
            User user2 = c1357250lQJ.LL.user;
            if (user2 != null) {
                uid2 = user2.getUid();
            }
            if (!Intrinsics.LJFF(uid, uid2)) {
                return false;
            }
            return true;
        }
        return Intrinsics.LJFF(this.LL.upvoteId, c1357250lQJ.LL.upvoteId);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean z;
        String text;
        Comment comment;
        Comment comment2;
        String text2 = null;
        if (!(interfaceC1891350zJl instanceof C1357250lQJ)) {
            return null;
        }
        C1357250lQJ c1357250lQJ = (C1357250lQJ) interfaceC1891350zJl;
        boolean z2 = !Intrinsics.LJFF(this.LL.text, c1357250lQJ.LL.text);
        UpvoteStruct upvoteStruct = this.LL;
        if (upvoteStruct.cacheState != c1357250lQJ.LL.cacheState) {
            z = true;
        } else {
            z = false;
        }
        CommentInfoStruct commentInfoStruct = upvoteStruct.commentInfo;
        if (commentInfoStruct != null && (comment2 = commentInfoStruct.comment) != null) {
            text = comment2.getText();
        } else {
            text = null;
        }
        CommentInfoStruct commentInfoStruct2 = c1357250lQJ.LL.commentInfo;
        if (commentInfoStruct2 != null && (comment = commentInfoStruct2.comment) != null) {
            text2 = comment.getText();
        }
        return new C991390buD(z2, z, !Intrinsics.LJFF(text, text2));
    }

    public C1357250lQJ(UpvoteStruct upvoteStruct, UpvoteStruct upvoteStruct2, VideoItemParams videoItemParams) {
        this.LL = upvoteStruct;
        this.LLILLJJLI = upvoteStruct2;
        this.LLILLL = videoItemParams;
    }
}
