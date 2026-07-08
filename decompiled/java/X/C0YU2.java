package X;

import com.bytedance.im.core.proto.ConversationRecentMessage;
import com.bytedance.im.core.proto.MessageBody;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.0YU2, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YU2 extends Message.Builder<ConversationRecentMessage, C0YU2> {
    public Long LIZLLL;
    public Long LJFF;
    public Integer LJI;
    public String LJII;
    public List<MessageBody> LJ = C1516540pZE.LJIIIIZZ();
    public List<MessageBody> LJIIIIZZ = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ConversationRecentMessage build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJFF != null && this.LJII != null) {
            return new ConversationRecentMessage(this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "conversation_short_id", this.LJFF, "version", this.LJII, "conversation_id");
        throw null;
    }
}
