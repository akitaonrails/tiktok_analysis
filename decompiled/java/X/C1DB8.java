package X;

import com.bytedance.im.core.proto.BatchUpdateConversationParticipantResponseBody;
import com.bytedance.im.core.proto.UpdateConversationParticipantResult;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.1DB8, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DB8 extends Message.Builder<BatchUpdateConversationParticipantResponseBody, C1DB8> {
    public List<UpdateConversationParticipantResult> LIZLLL = C1516540pZE.LJIIIIZZ();
    public List<UpdateConversationParticipantResult> LJ = C1516540pZE.LJIIIIZZ();
    public List<Long> LJFF = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final BatchUpdateConversationParticipantResponseBody build() {
        return new BatchUpdateConversationParticipantResponseBody(this.LIZLLL, this.LJ, this.LJFF, buildUnknownFields());
    }
}
