package X;

import com.bytedance.im.core.proto.ConversationMessagePreViewRequestBody;
import com.squareup.wire.Message;

/* JADX INFO: renamed from: X.1DAx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2251611DAx extends Message.Builder<ConversationMessagePreViewRequestBody, C2251611DAx> {
    public Long LIZLLL;
    public Long LJ;
    public Long LJFF;
    public Integer LJI;

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final ConversationMessagePreViewRequestBody build() {
        Long l = this.LIZLLL;
        if (l != null && this.LJ != null && this.LJFF != null && this.LJI != null) {
            return new ConversationMessagePreViewRequestBody(this.LIZLLL, this.LJ, this.LJFF, this.LJI, buildUnknownFields());
        }
        C1516540pZE.LJII(l, "conv_short_id", this.LJ, "message_id", this.LJFF, "conversation_index", this.LJI, "inbox_type");
        throw null;
    }
}
