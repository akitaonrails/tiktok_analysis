package X;

import com.bytedance.im.core.proto.ConversationBadgeCountInfo;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.0YUu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C875140YUu extends Message.Builder<ConversationBadgeCountInfo, C875140YUu> {
    public Long LIZLLL;
    public Integer LJ;
    public Long LJFF;
    public String LJI;
    public Integer LJII;
    public Integer LJIIIIZZ;
    public Long LJIIIZ;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ConversationBadgeCountInfo build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null && this.LJFF != null && this.LJI != null) {
            return new ConversationBadgeCountInfo(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "conversation_short_id", this.LJ, "badge_count", this.LJFF, "conversation_index_v2", this.LJI, "conversation_id");
        throw null;
    }
}
