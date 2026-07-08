package X;

import com.bytedance.im.core.proto.GetConversationParticipantsReadIndexV3ResponseBody;
import com.bytedance.im.core.proto.ParticipantReadIndex;
import com.squareup.wire.Message;
import java.util.List;

/* JADX INFO: renamed from: X.0YV0, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YV0 extends Message.Builder<GetConversationParticipantsReadIndexV3ResponseBody, C0YV0> {
    public List<ParticipantReadIndex> LIZLLL = C1516540pZE.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final GetConversationParticipantsReadIndexV3ResponseBody build() {
        return new GetConversationParticipantsReadIndexV3ResponseBody(this.LIZLLL, buildUnknownFields());
    }
}
