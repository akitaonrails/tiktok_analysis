package X;

import com.bytedance.android.livesdk.chatroom.api.SpaceCommentItem;

/* JADX INFO: renamed from: X.0K3K, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K3K extends AbstractC511160K2w {
    public final SpaceCommentItem LIZ;
    public long LIZIZ;
    public long LIZJ = 0;
    public long LIZLLL;

    @Override // X.AbstractC511160K2w
    public final long LIZIZ() {
        return this.LIZ.postId;
    }

    public final long LIZLLL() {
        SpaceCommentItem spaceCommentItem;
        int i = this.LIZ.commentType;
        if (i == C0K3I.COMMENT.getValue()) {
            return this.LIZ.commentId;
        }
        if ((i == C0K3I.REPLY.getValue() || i == C0K3I.REPLY_TO_REPLY.getValue()) && (spaceCommentItem = this.LIZ.replyCommentInfo) != null) {
            return spaceCommentItem.commentId;
        }
        return -1L;
    }

    @Override // X.AbstractC511160K2w
    public final C0K2L LIZJ() {
        return C0K2L.REPLY_SEE_MORE;
    }

    public C0K3K(SpaceCommentItem spaceCommentItem, long j) {
        this.LIZ = spaceCommentItem;
        this.LIZIZ = j;
    }
}
