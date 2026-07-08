package X;

import com.bytedance.im.core.proto.BatchGetConversationParticipantsReadIndexResponseBody;
import com.bytedance.im.core.proto.ConversationParticipantReadIndex;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.0YRL, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YRL extends Message.Builder<BatchGetConversationParticipantsReadIndexResponseBody, C0YRL> {
    public List<ConversationParticipantReadIndex> LIZLLL = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final BatchGetConversationParticipantsReadIndexResponseBody build() {
        return new BatchGetConversationParticipantsReadIndexResponseBody(this.LIZLLL, buildUnknownFields());
    }
}
