package X;

import com.bytedance.android.livesdk.chatroom.api.SpaceCommentItem;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;

/* JADX INFO: renamed from: X.0K3J, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K3J extends AbstractC511160K2w {
    public final SpaceCommentItem LIZ;
    public final SpacePost LIZIZ;

    @Override // X.AbstractC511160K2w
    public final long LIZIZ() {
        return this.LIZ.postId;
    }

    @Override // X.AbstractC511160K2w
    public final C0K2L LIZJ() {
        return this.LIZ.commentType == C0K3I.COMMENT.getValue() ? C0K2L.COMMENT : C0K2L.SUB_COMMENT;
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
    public final SpacePost LIZ() {
        return this.LIZIZ;
    }

    public C0K3J(SpaceCommentItem spaceCommentItem, SpacePost spacePost) {
        this.LIZ = spaceCommentItem;
        this.LIZIZ = spacePost;
    }
}
