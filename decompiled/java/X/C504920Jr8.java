package X;

import com.bytedance.android.livesdk.chatroom.api.SpaceCommentItem;

/* JADX INFO: renamed from: X.0Jr8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C504920Jr8 extends AbstractC503810JpL {
    public final SpaceCommentItem LIZ;
    public long LIZIZ;
    public long LIZJ = 0;
    public long LIZLLL;

    @Override // X.AbstractC503810JpL
    public final long LIZIZ() {
        return this.LIZ.postId;
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
    public final EnumC503250JoR LIZJ() {
        return EnumC503250JoR.REPLY_SEE_MORE;
    }

    public C504920Jr8(SpaceCommentItem spaceCommentItem, long j) {
        this.LIZ = spaceCommentItem;
        this.LIZIZ = j;
    }
}
