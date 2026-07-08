package X;

import com.bytedance.android.livesdk.chatroom.api.SpaceCommentItem;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;

/* JADX INFO: renamed from: X.0Jr7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C504910Jr7 extends AbstractC503810JpL {
    public final SpaceCommentItem LIZ;
    public final SpacePost LIZIZ;

    @Override // X.AbstractC503810JpL
    public final long LIZIZ() {
        return this.LIZ.postId;
    }

    @Override // X.AbstractC503810JpL
    public final EnumC503250JoR LIZJ() {
        return this.LIZ.commentType == EnumC504930Jr9.COMMENT.getValue() ? EnumC503250JoR.COMMENT : EnumC503250JoR.SUB_COMMENT;
    }

    public final long LIZLLL() {
        SpaceCommentItem spaceCommentItem;
        int i = this.LIZ.commentType;
        if (i == EnumC504930Jr9.COMMENT.getValue()) {
            return this.LIZ.commentId;
        }
        if ((i == EnumC504930Jr9.REPLY.getValue() || i == EnumC504930Jr9.REPLY_TO_REPLY.getValue()) && (spaceCommentItem = this.LIZ.replyCommentInfo) != null) {
            return spaceCommentItem.commentId;
        }
        return -1L;
    }

    @Override // X.AbstractC503810JpL
    public final SpacePost LIZ() {
        return this.LIZIZ;
    }

    public C504910Jr7(SpaceCommentItem spaceCommentItem, SpacePost spacePost) {
        this.LIZ = spaceCommentItem;
        this.LIZIZ = spacePost;
    }
}
